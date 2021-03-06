package com.mdgn.pixabay.ui.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mdgn.pixabay.model.Picture
import com.mdgn.pixabay.repo.PictureRepository
import com.mdgn.pixabay.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PictureViewModel @Inject constructor(val repository: PictureRepository) : ViewModel() {

    //Guvenlik acisindan asagidaki gibi yapilir
    val pictureData = MutableLiveData<Resource<List<Picture>>>()
    val totalCount = MutableLiveData<Resource<Int?>>()

    fun getPictureData(key : String, query: String){
        viewModelScope.launch {
            pictureData.postValue(Resource.loading())

            repository.getPicture(key,query).let {
                pictureData.postValue(Resource.succes(it.data?.hits.orEmpty()))
                totalCount.value = Resource.succes(it.data?.total)
            }
        }
    }

}