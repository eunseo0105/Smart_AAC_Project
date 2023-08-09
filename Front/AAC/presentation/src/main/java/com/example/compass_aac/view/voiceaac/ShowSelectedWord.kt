/** Project : 2023 AAC Compass
 * Program Purpose and Features :
 * - aac 단어들 선택 후 문장으로 보여지는 화면
 * Author : ES.KEE
 * First Write Date : 2023.07.14
 * ==========================================================================
 * Program history
 * ==========================================================================
 * Author            Date            Version        History        code to fix
 **/

package com.example.compass_aac.view.voiceaac

import android.content.ContentValues
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.OnBackPressedCallback
import androidx.activity.viewModels
import com.example.compass_aac.databinding.ActivityShowSelectedWordBinding
import com.example.compass_aac.view.MainActivity
import com.example.compass_aac.viewmodel.user.UserPageViewModel
import com.example.compass_aac.viewmodel.voiceaac.ShowSelectedWordVIewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ShowSelectedWord @Inject constructor(): AppCompatActivity() {
    //근데 선택된 단어들이 없는 경우 stt 가져오는거 에러날거임 (아무 버튼도 선택안했을 시의 오류처리도 해야함, 못넘어가게 한다던가...)
    private lateinit var selectedCategory: String

    private val onBackPressedCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            val intent = Intent(this@ShowSelectedWord, ChooseWordPass::class.java)
//            intent.putExtra("selectedCategory", selectedCategory)
            startActivity(intent)
            Log.e(ContentValues.TAG, "뒤로가기 클릭")
            // 뒤로가기 시 실행할 코드
        }
    }


    // ViewBinding 객체 선언
    private lateinit var binding: ActivityShowSelectedWordBinding
    // ViewModel 인스턴스 주입
    private val viewModel: ShowSelectedWordVIewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowSelectedWordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        this.onBackPressedDispatcher.addCallback(this, onBackPressedCallback) //위에서 생성한 콜백 인스턴스 붙여주기
//
//        val category = intent.getStringExtra("selectedCategory")
//        Log.d("category", category!!)
//        selectedCategory = category
//        Log.d("selectedCategory", selectedCategory)

        var selectedWord = intent.getStringArrayListExtra("selectedword") ?: arrayListOf("default")
        Log.d("넘겨온 문장", selectedWord.toString())

        viewModel.getText(selectedWord)


        // 버튼 클릭 시 TTS 실행
        binding.ttsBtn.setOnClickListener {
            viewModel.speakText()
        }

        binding.ttsBtn1.setOnClickListener {
            viewModel.speakInf()

        }

        viewModel.textToRead.observe(this){text ->
            selectedWord = text
            val sentence = text.toList().joinToString("\n")
            Log.d("sentence", sentence)
            val formattedText = formatText(sentence, 4)
            binding.selectedWordShowTv.text= sentence
        }

//        customizeViewModel.fixedText.observe(this){
//            binding.customizeText.text = it
//            viewModel.getTextInf(it)
//        }


        binding.selectedWordAnswerBtn.setOnClickListener {
            val intent = Intent(this, HearVoice::class.java)
            startActivity(intent)
            viewModel.onCleared()
        }

        binding.selectedWordOkBtn.setOnClickListener {
            viewModel.resetData()
            viewModel.onCleared()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.selectWordBackBtn.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
            Log.e("뒤로가기", "뒤로가기 클릭")

        }

        binding.rechooseBtn.setOnClickListener {
            viewModel.resetData()
            viewModel.onCleared()
            val intent = Intent(this, ChooseWordPass::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        viewModel.onCleared()

    }

    private fun formatText(input: String, wordsPerLine: Int): String {
        val words = input.split(" ")
        val stringBuilder = StringBuilder()

        words.forEachIndexed { index, word ->
            stringBuilder.append(word)
            if ((index + 1) % wordsPerLine == 0) {
                stringBuilder.append("\n")
            } else {
                stringBuilder.append(" ")
            }
        }

        return stringBuilder.toString()
    }
}