package com.example.compass_aac.view.favorite

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.compass_aac.R
import com.example.compass_aac.databinding.ActivityFavoriteMainBinding
import com.example.compass_aac.view.MainActivity
import com.example.compass_aac.view.adapters.NodeAdapter
import com.example.compass_aac.view.voiceaac.HearVoice
import com.example.compass_aac.viewmodel.favorite.FavoriteMainViewModel
import com.example.data.source.remote.Tree_Node
import com.example.domain.model.favorite
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@AndroidEntryPoint
class FavoriteMain : AppCompatActivity() {

    private lateinit var lists : List<favorite>
    private lateinit var adapter: FavoriteAdapter

    //뒤로가기
    private val onBackPressedCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            finish()
            Log.e(ContentValues.TAG, "뒤로가기 클릭")
            // 뒤로가기 시 실행할 코드
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityFavoriteMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //뒤로가기
        this.onBackPressedDispatcher.addCallback(this, onBackPressedCallback)

        val viewModel : FavoriteMainViewModel by viewModels()

        // RecyclerView 설정
        val layoutManager = LinearLayoutManager(this)
        binding.favoriteRecycler.layoutManager = layoutManager
        // 어댑터 생성 및 설정
        adapter = FavoriteAdapter()
        binding.favoriteRecycler.adapter = adapter
        val itemTouchHelper = ItemTouchHelper(SwipeController(adapter))
        // itemTouchHelper에 RecyclerView 부착
        itemTouchHelper.attachToRecyclerView(binding.favoriteRecycler)

        //lists 초기화
        lists = listOf()

        //디비에 저장되어있는 즐겨찾기 목록 가져오기
        lifecycleScope.launch(Dispatchers.IO) {
            lists = viewModel.getLists()
            withContext(Dispatchers.Main) {
                if (lists.isEmpty()) {
                    Toast.makeText(applicationContext, "즐겨찾기 목록이 없습니다. 추가해주세요", Toast.LENGTH_SHORT).show()
                } else {
                    // 어댑터 생성 및 설정
                    adapter.submitList(lists)
                }
            }
        }

        //다이얼로그 설정
        val inflater = LayoutInflater.from(this)
        val dialogView = inflater.inflate(R.layout.activity_add_sentence, null)

        val builder = AlertDialog.Builder(this)
        builder.setView(dialogView)
        val alertDialog = builder.create()

        //즐겨찾기 문장 추가
        binding.plusSentence.setOnClickListener {
            alertDialog.show()
            val textInputEditText = dialogView.findViewById<TextInputEditText>(R.id.textInputEditText)
            val finishBtn = dialogView.findViewById<MaterialButton>(R.id.addSentenceBtn)
            val closeBtn = dialogView.findViewById<ImageButton>(R.id.imageButton4)

            var text = ""

            textInputEditText.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                    // 텍스트 변경 전에 수행할 작업
                }

                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    // 텍스트가 변경될 때 수행할 작업
                }

                override fun afterTextChanged(s: Editable?) {
                    // 텍스트 변경 후에 수행할 작업
                    text = s.toString()
                }
            })

            finishBtn.setOnClickListener {
                if(text.isEmpty()){
                    Toast.makeText(applicationContext, "문장을 입력해주세요.", Toast.LENGTH_SHORT).show()

                }
                else if(text.length >15){
                    Toast.makeText(applicationContext, "최대 15글자 이하로 작성해주세요.", Toast.LENGTH_SHORT).show()
                }
                else{
                    //값 저장
                    viewModel.editText(text)
                    lifecycleScope.launch(Dispatchers.IO){
                        viewModel.addList(text)
                        withContext(Dispatchers.Main){
                            alertDialog.dismiss()
                        }
                    }
                }

                textInputEditText.text?.clear()
            }

            closeBtn.setOnClickListener {
                alertDialog.dismiss()
            }
        }

        //데이터베이스 데이터 관찰
        viewModel.lists.observe(this){updatedLists->
            Log.d("데이터 관찰", updatedLists.toString())
            // 지연 없이 데이터를 갱신
            binding.favoriteRecycler.post {
                adapter.submitList(updatedLists)
            }

        }
        //override
        adapter.itemClick = object : FavoriteAdapter.ItemClick {
            override fun onDelete(view: View, id: Int, position: Int) {
                Log.d("데이터 삭제 id", id.toString())
                lifecycleScope.launch(Dispatchers.IO) {
                    viewModel.delList(id)
                    // 데이터베이스에서 데이터 삭제 후 LiveData를 업데이트
                    viewModel.getLists()
                }
                Toast.makeText(applicationContext, "삭제되었습니다." , Toast.LENGTH_SHORT).show()
            }
        }

        binding.backButton.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()

        }
    }
}