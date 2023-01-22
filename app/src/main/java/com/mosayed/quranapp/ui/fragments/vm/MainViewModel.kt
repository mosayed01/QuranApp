package com.mosayed.quranapp.ui.fragments.vm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mosayed.quranapp.data.remote.QuranService
import com.mosayed.quranapp.domain.model.Ayah
import com.mosayed.quranapp.domain.model.Sura
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val service: QuranService
) : ViewModel() {

    private val _suraList = MutableLiveData<List<Sura>>(emptyList())
    val suraList: LiveData<List<Sura>> get() = _suraList

    private val _ayaList = MutableLiveData<List<Ayah>>(emptyList())
    val ayaList: LiveData<List<Ayah>> get() = _ayaList

    val clickedSura = MutableLiveData("")

    fun fitchSuraList() = viewModelScope.launch {
        val list = service.getSura()
        _suraList.postValue(list)
    }

    fun fitchAyaList(number: Int) = viewModelScope.launch {
        val list = service.getAyat(number)
        _ayaList.postValue(list)
        clickedSura.postValue(list.first().sura)
    }


}