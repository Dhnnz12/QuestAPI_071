package com.example.questapi_071.viewmodel.provider

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.questapi_071.repositori.AplikasiDataSiswa

fun CreationExtras.aplikasiDataSiswa(): AplikasiDataSiswa = (
        this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as AplikasiDataSiswa
        )
object PenyediaViewModel {
    val Factory = viewModelFactory {
        initializer {
            _root_ide_package_.com.example.questapi_071.viewmodel.HomeViewModel(aplikasiDataSiswa().containerApp.repositoryDataSiswa)
        }
        initializer {
            _root_ide_package_.com.example.questapi_071.viewmodel.EntryViewModel(aplikasiDataSiswa().containerApp.repositoryDataSiswa)
        }
    }
}