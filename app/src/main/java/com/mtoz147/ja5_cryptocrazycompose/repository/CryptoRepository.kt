package com.mtoz147.ja5_cryptocrazycompose.repository

import com.mtoz147.ja5_cryptocrazycompose.model.Crypto
import com.mtoz147.ja5_cryptocrazycompose.model.CryptoList
import com.mtoz147.ja5_cryptocrazycompose.service.CryptoAPI
import com.mtoz147.ja5_cryptocrazycompose.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject


@ActivityScoped
class CryptoRepository @Inject constructor(
    private val api: CryptoAPI
){
    suspend fun getCryptoList(): Resource<CryptoList> {
        val response = try {
            api.getCryptoList()
        } catch(e: Exception) {
            return Resource.Error("Error.")
        }
        return Resource.Success(response)
    }

    suspend fun getCrypto(id: String): Resource<Crypto> {
        val response = try {
            api.getCrypto()
        } catch(e: Exception) {
            return Resource.Error("Error")
        }
        return Resource.Success(response)
    }




   /* suspend fun getCryptoList():Resource<CryptoList>{
        val response=try {
        api.getCryptoList(API_KEY)
        }catch (e:Exception){
            return Resource.Error("Error.")
        }
        return Resource.Success(response)
    }

    suspend fun getCrypto(id:String):Resource<Crypto>{
        val response=try {
            api.getCryptoList(API_KEY,id,CALL_ATTRIBUTES)
        }catch (e:Exception){
            return Resource.Error("Error.")
        }
        return Resource.Success(response)
    }*/
}