package com.batista.filmsmoviedb.presentation.details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.batista.filmsmoviedb.R
import com.batista.filmsmoviedb.data.network.repository.MockMovies
import com.batista.filmsmoviedb.databinding.FragmentDetailsBinding
import com.batista.filmsmoviedb.presentation.home.HomeAdapter

class DetailsFragment : Fragment() {

    private var _binding: FragmentDetailsBinding? = null
    private val binding: FragmentDetailsBinding get() = _binding!!

    private lateinit var homeAdapter: HomeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = FragmentDetailsBinding.inflate(
        inflater,
        container,
        false
    ).apply {
        _binding = this
    }.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecycler()
        returnToBackHome()

    }

    private fun initRecycler() {
        val mockMovieList = MockMovies.fetchMovies()
        homeAdapter = HomeAdapter(mockMovieList)

        binding.rcSimilarMovies.apply {
            adapter = homeAdapter
        }
    }

    private fun returnToBackHome() {
        binding.btnArrowLeft.setOnClickListener {
            findNavController().navigate(R.id.action_detailsFragment_to_homeFragment)
        }
    }


    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}