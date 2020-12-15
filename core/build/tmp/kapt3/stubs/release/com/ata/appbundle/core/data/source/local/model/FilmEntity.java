package com.ata.appbundle.core.data.source.local.model;

import java.lang.System;

@androidx.room.Entity(tableName = "film_entities")
@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0003H\u00c6\u0003J\t\u0010#\u001a\u00020\nH\u00c6\u0003J\t\u0010$\u001a\u00020\fH\u00c6\u0003JY\u0010%\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\u0013\u0010&\u001a\u00020\f2\b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020\nH\u00d6\u0001J\t\u0010)\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006*"}, d2 = {"Lcom/ata/appbundle/core/data/source/local/model/FilmEntity;", "", "title", "", "poster", "genre", "running_time", "original_language", "overview", "type", "", "status", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "getGenre", "()Ljava/lang/String;", "getOriginal_language", "getOverview", "getPoster", "getRunning_time", "getStatus", "()Z", "setStatus", "(Z)V", "getTitle", "getType", "()I", "setType", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "core_release"})
public final class FilmEntity {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "title")
    @androidx.room.PrimaryKey()
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "poster")
    private final java.lang.String poster = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "genre")
    private final java.lang.String genre = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "running_time")
    private final java.lang.String running_time = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "original_language")
    private final java.lang.String original_language = null;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "overview")
    private final java.lang.String overview = null;
    private int type;
    private boolean status;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPoster() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGenre() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRunning_time() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOriginal_language() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOverview() {
        return null;
    }
    
    public final int getType() {
        return 0;
    }
    
    public final void setType(int p0) {
    }
    
    public final boolean getStatus() {
        return false;
    }
    
    public final void setStatus(boolean p0) {
    }
    
    public FilmEntity(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String poster, @org.jetbrains.annotations.NotNull()
    java.lang.String genre, @org.jetbrains.annotations.NotNull()
    java.lang.String running_time, @org.jetbrains.annotations.NotNull()
    java.lang.String original_language, @org.jetbrains.annotations.NotNull()
    java.lang.String overview, int type, boolean status) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    public final int component7() {
        return 0;
    }
    
    public final boolean component8() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ata.appbundle.core.data.source.local.model.FilmEntity copy(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String poster, @org.jetbrains.annotations.NotNull()
    java.lang.String genre, @org.jetbrains.annotations.NotNull()
    java.lang.String running_time, @org.jetbrains.annotations.NotNull()
    java.lang.String original_language, @org.jetbrains.annotations.NotNull()
    java.lang.String overview, int type, boolean status) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}