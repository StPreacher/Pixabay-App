package com.mdgn.pixabay.repo

import com.mdgn.pixabay.BaseRepository
import com.mdgn.pixabay.model.PictureResponse
import com.mdgn.pixabay.network.Api
import com.mdgn.pixabay.util.Resource
import javax.inject.Inject

class PictureRepository @Inject constructor(private val api : Api) : BaseRepository(){

    suspend fun getPicture(key : String, query : String) : Resource<PictureResponse>{
        return getResult {
            api.getPicture(key,query)
        }
    }
}

//TODO Model - Api - Status - Resources - BaseRepository - Repository -> ViewModel