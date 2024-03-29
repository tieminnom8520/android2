package com.example.movieapp.utils;

public class Credentials {

    public static final String BASE_URL = "https://api.themoviedb.org";
    public static final String API_KEY = "cf32372af846ed46863011b283bdcba1";

    //TODO : movies list
    public static final String NOW_PLAYING = "/3/movie/now_playing";
    public static final String POPULAR = "/3/movie/popular";
    public static final String TOP_RATED = "/3/movie/top_rated";
    public static final String UPCOMING = "/3/movie/upcoming";

    //TODO :  search movie
    public static final String SEARCH_MOVIE_URL = "https://api.themoviedb.org/3/search/movie";
    public static final String BASE_IMAGE_URL = "https://image.tmdb.org/t/p/w500";


    public static final String BASE_MOVIE_URL = "https://api.themoviedb.org/3/movie/";
    // youtube link for embeded youtube trailer (if exist)
    public static final String embed_pattern = "<iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/%s\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";

    public  static final String us_language = "en-US";
    public static final String vn_language = "vi";
    public static final String es_language = "es";
}
