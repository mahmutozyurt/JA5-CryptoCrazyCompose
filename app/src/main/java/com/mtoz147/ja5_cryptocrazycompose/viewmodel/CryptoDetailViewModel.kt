package com.mtoz147.ja5_cryptocrazycompose.viewmodel

import androidx.lifecycle.ViewModel
import com.mtoz147.ja5_cryptocrazycompose.model.Crypto
import com.mtoz147.ja5_cryptocrazycompose.repository.CryptoRepository
import com.mtoz147.ja5_cryptocrazycompose.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class CryptoDetailViewModel @Inject constructor(
    private val repository: CryptoRepository
):ViewModel(){

    suspend fun getCrypto(id : String): Resource<Crypto>{
        return repository.getCrypto(id)
    }
}