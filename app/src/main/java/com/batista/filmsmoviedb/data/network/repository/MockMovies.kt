package com.batista.filmsmoviedb.data.network.repository

import com.batista.filmsmoviedb.domain.model.ResultMovie

object MockMovies {

    fun fetchMovies(): List<ResultMovie> {
        return listOf(
            ResultMovie(
                poster_path = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/rvX8f3QuUkYtirO0hL9CoeXMzkv.jpg"
            ),
            ResultMovie(
                poster_path = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/l1FfRmKRNXRSqXT5GlMo16MX2LX.jpg"
            ),
            ResultMovie(
                poster_path = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/oB367uFcyU2uhGkFqo5RB4Evdji.jpg"
            ),
            ResultMovie(
                poster_path = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/wd7b4Nv9QBHDTIjc2m7sr0IUMoh.jpg"
            ),
            ResultMovie(
                poster_path = "https://image.tmdb.org/t/p/original/q6725aR8Zs4IwGMXzZT8aC8lh41.jpg"
            ),
            ResultMovie(
                poster_path = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/oB367uFcyU2uhGkFqo5RB4Evdji.jpg"
            ),
            ResultMovie(
                poster_path = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/rvX8f3QuUkYtirO0hL9CoeXMzkv.jpg"
            ),
            ResultMovie(
                poster_path = "https://www.themoviedb.org/t/p/w600_and_h900_bestv2/oB367uFcyU2uhGkFqo5RB4Evdji.jpg"
            ),
        )
    }
}