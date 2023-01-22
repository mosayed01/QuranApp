package com.mosayed.quranapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.mosayed.quranapp.R
import com.mosayed.quranapp.databinding.FragmentSuraBinding
import com.mosayed.quranapp.ui.fragments.vm.MainViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SuraFragment @Inject constructor(
    val viewModel: MainViewModel
) : Fragment() {
    private lateinit var binding: FragmentSuraBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_sura, container, false)


        return binding.root
    }

}