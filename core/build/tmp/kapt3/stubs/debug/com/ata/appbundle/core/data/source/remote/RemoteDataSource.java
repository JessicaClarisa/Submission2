package com.ata.appbundle.core.data.source.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006J\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/ata/appbundle/core/data/source/remote/RemoteDataSource;", "", "apiService", "Lcom/ata/appbundle/core/data/source/remote/network/ApiService;", "(Lcom/ata/appbundle/core/data/source/remote/network/ApiService;)V", "getAllMovies", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ata/appbundle/core/data/source/remote/network/ApiResponse;", "", "Lcom/ata/appbundle/core/data/source/remote/response/FilmResponse;", "getAllTvShows", "core_debug"})
public final class RemoteDataSource {
    private final com.ata.appbundle.core.data.source.remote.network.ApiService apiService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.ata.appbundle.core.data.source.remote.network.ApiResponse<java.util.List<com.ata.appbundle.core.data.source.remote.response.FilmResponse>>> getAllMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.ata.appbundle.core.data.source.remote.network.ApiResponse<java.util.List<com.ata.appbundle.core.data.source.remote.response.FilmResponse>>> getAllTvShows() {
        return null;
    }
    
    public RemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.ata.appbundle.core.data.source.remote.network.ApiService apiService) {
        super();
    }
}