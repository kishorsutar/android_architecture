package com.kishor.kotlin.mvvm.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.kishor.kotlin.mvvm.R
import com.kishor.kotlin.mvvm.databinding.FragmentNewsListBinding
import com.kishor.kotlin.mvvm.viewmodel.MusicListViewModel

class NewsListFragment : Fragment(R.layout.fragment_news_list) {

    private var _binding: FragmentNewsListBinding? = null
    private val binding get() = _binding

    private val viewModel: MusicListViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("MusicListFragment", "ViewModel created")
        Log.d("View mode", viewModel.displayString)
        _binding = FragmentNewsListBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onStart() {
        super.onStart()
        binding?.buttonPanel?.text = "jerkweuahkueh"
    }
}
