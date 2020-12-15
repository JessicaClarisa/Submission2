package com.ata.appbundle.core.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016J\u0016\u0010\u0017\u001a\u00020\t2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lcom/ata/appbundle/core/ui/FavouriteAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/ata/appbundle/core/ui/FavouriteAdapter$ListViewHolder;", "()V", "listFilm", "Ljava/util/ArrayList;", "Lcom/ata/appbundle/core/domain/model/Film;", "onItemClick", "Lkotlin/Function1;", "", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnItemClick", "(Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "i", "setFilms", "films", "", "ListViewHolder", "core_release"})
public final class FavouriteAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.ata.appbundle.core.ui.FavouriteAdapter.ListViewHolder> {
    private java.util.ArrayList<com.ata.appbundle.core.domain.model.Film> listFilm;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.ata.appbundle.core.domain.model.Film, kotlin.Unit> onItemClick;
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.ata.appbundle.core.domain.model.Film, kotlin.Unit> getOnItemClick() {
        return null;
    }
    
    public final void setOnItemClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.ata.appbundle.core.domain.model.Film, kotlin.Unit> p0) {
    }
    
    public final void setFilms(@org.jetbrains.annotations.Nullable()
    java.util.List<com.ata.appbundle.core.domain.model.Film> films) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ata.appbundle.core.ui.FavouriteAdapter.ListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, int i) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.ata.appbundle.core.ui.FavouriteAdapter.ListViewHolder holder, int position) {
    }
    
    public FavouriteAdapter() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010\u00a8\u0006\u0014"}, d2 = {"Lcom/ata/appbundle/core/ui/FavouriteAdapter$ListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "imgPhoto", "Landroid/widget/ImageView;", "getImgPhoto", "()Landroid/widget/ImageView;", "setImgPhoto", "(Landroid/widget/ImageView;)V", "tvDetail", "Landroid/widget/TextView;", "getTvDetail", "()Landroid/widget/TextView;", "setTvDetail", "(Landroid/widget/TextView;)V", "tvName", "getTvName", "setTvName", "core_release"})
    public static final class ListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvName;
        @org.jetbrains.annotations.NotNull()
        private android.widget.TextView tvDetail;
        @org.jetbrains.annotations.NotNull()
        private android.widget.ImageView imgPhoto;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvName() {
            return null;
        }
        
        public final void setTvName(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTvDetail() {
            return null;
        }
        
        public final void setTvDetail(@org.jetbrains.annotations.NotNull()
        android.widget.TextView p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImgPhoto() {
            return null;
        }
        
        public final void setImgPhoto(@org.jetbrains.annotations.NotNull()
        android.widget.ImageView p0) {
        }
        
        public ListViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}