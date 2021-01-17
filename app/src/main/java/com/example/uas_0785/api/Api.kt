package com.example.uas_0785.api


import com.example.uas_0785.data.model.DetailUserResponse
import com.example.uas_0785.data.model.User
import com.example.uas_0785.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 916f76ba4c0fed8660bb400db7ef7955dbef17f6")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 916f76ba4c0fed8660bb400db7ef7955dbef17f6")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 916f76ba4c0fed8660bb400db7ef7955dbef17f6")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 916f76ba4c0fed8660bb400db7ef7955dbef17f6")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}