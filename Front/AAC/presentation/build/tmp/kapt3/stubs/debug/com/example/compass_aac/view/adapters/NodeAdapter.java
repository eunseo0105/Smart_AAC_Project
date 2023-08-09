package com.example.compass_aac.view.adapters;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.compass_aac.R;
import com.example.compass_aac.view.voiceaac.ShowSelectedWord;
import com.example.data.source.remote.Tree_Node;
import com.example.json.Node;
import dagger.hilt.android.qualifiers.ApplicationContext;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001f B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ6\u0010\u0010\u001a\u00020\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00062\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0004j\b\u0012\u0004\u0012\u00020\u0014`\u0006J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0017H\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006!"}, d2 = {"Lcom/example/compass_aac/view/adapters/NodeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/compass_aac/view/adapters/NodeAdapter$ViewHolder;", "childTree", "Ljava/util/ArrayList;", "Lcom/example/data/source/remote/Tree_Node;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "(Ljava/util/ArrayList;Landroid/content/Context;)V", "itemClick", "Lcom/example/compass_aac/view/adapters/NodeAdapter$ItemClick;", "getItemClick", "()Lcom/example/compass_aac/view/adapters/NodeAdapter$ItemClick;", "setItemClick", "(Lcom/example/compass_aac/view/adapters/NodeAdapter$ItemClick;)V", "UpdateChild", "", "childNode", "selectedword", "", "fillEmptyNodes", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ItemClick", "ViewHolder", "presentation_debug"})
public final class NodeAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.compass_aac.view.adapters.NodeAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull
    private java.util.ArrayList<com.example.data.source.remote.Tree_Node> childTree;
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable
    private com.example.compass_aac.view.adapters.NodeAdapter.ItemClick itemClick;
    
    public NodeAdapter(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.example.data.source.remote.Tree_Node> childTree, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.compass_aac.view.adapters.NodeAdapter.ItemClick getItemClick() {
        return null;
    }
    
    public final void setItemClick(@org.jetbrains.annotations.Nullable
    com.example.compass_aac.view.adapters.NodeAdapter.ItemClick p0) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.compass_aac.view.adapters.NodeAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.compass_aac.view.adapters.NodeAdapter.ViewHolder holder, int position) {
    }
    
    public final void UpdateChild(@org.jetbrains.annotations.NotNull
    java.util.ArrayList<com.example.data.source.remote.Tree_Node> childNode, @org.jetbrains.annotations.NotNull
    java.util.ArrayList<java.lang.String> selectedword) {
    }
    
    private final void fillEmptyNodes() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/example/compass_aac/view/adapters/NodeAdapter$ItemClick;", "", "onClick", "", "view", "Landroid/view/View;", "treeNode", "Lcom/example/data/source/remote/Tree_Node;", "presentation_debug"})
    public static abstract interface ItemClick {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull
        android.view.View view, @org.jetbrains.annotations.NotNull
        com.example.data.source.remote.Tree_Node treeNode);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/example/compass_aac/view/adapters/NodeAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "chooseWord", "Landroid/widget/Button;", "getChooseWord", "()Landroid/widget/Button;", "downarrow", "Landroid/widget/ImageView;", "getDownarrow", "()Landroid/widget/ImageView;", "presentation_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.Button chooseWord = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.ImageView downarrow = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.Button getChooseWord() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getDownarrow() {
            return null;
        }
    }
}