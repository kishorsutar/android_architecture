package com.kishor.kotlin.mvvm.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.kishor.kotlin.mvvm.R
import com.kishor.kotlin.mvvm.databinding.FragmentMusicListBinding
import com.kishor.kotlin.mvvm.viewmodel.MusicListViewModel
import kotlinx.android.synthetic.main.fragment_music_list.view.*

class MusicListFragment : Fragment(R.layout.fragment_music_list) {

    private lateinit var _binding: FragmentMusicListBinding

    private val viewModel: MusicListViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.i("MusicListFragment", "ViewModel created")
        Log.d("View mode", viewModel.displayString)
        _binding = FragmentMusicListBinding.inflate(inflater, container, false)
        return _binding.root
    }

    override fun onStart() {
        super.onStart()
        _binding.root.buttonPanel.text = "jerkweuahkueh"
    }
}
