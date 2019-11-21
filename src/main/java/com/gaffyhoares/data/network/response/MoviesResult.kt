package com.gaffyhoares.data.network.response

data class MoviesResult(
    val id: Int,
    val video: Boolean,
    val vote_count: Int,
    val vote_average: Double,
    val title: String,
    val release_date: String,
    val original_language:String,
    val original_title:String,
    val genre_ids:List<Int>,
    val backdrop_path:String,
    val adult:Boolean,
    val overview:String,
    val poster_path:String,
    val popularity:String,
    val media_type:String
)