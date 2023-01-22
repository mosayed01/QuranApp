package com.mosayed.quranapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.mosayed.quranapp.R
import com.mosayed.quranapp.databinding.FragmentAyaBinding
import com.mosayed.quranapp.databinding.FragmentSuraBinding

class AyaFragment : Fragment() {
    private lateinit var binding: FragmentAyaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_aya, container, false)

        return binding.root
    }

}