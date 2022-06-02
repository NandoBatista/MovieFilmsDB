package com.batista.filmsmoviedb.presentation.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.batista.filmsmoviedb.data.network.repository.MockMovies
import com.batista.filmsmoviedb.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding get() = _binding!!
    lateinit var homeAdapter: HomeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentHomeBinding.inflate(
    inflater,
    container,
    false
    ).apply {
        _binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
    }

    private fun initRecycler() {
        val mockMovieList = MockMovies.fetchMovies()
        homeAdapter = HomeAdapter(mockMovieList)

        binding.rcNowPlaying.apply {
            adapter = homeAdapter
        }
        binding.rcPopular.apply {
            adapter = homeAdapter
        }
        binding.rcTopRated.apply {
            adapter = homeAdapter
        }
        binding.rcUpComing.apply {
            adapter = homeAdapter
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}