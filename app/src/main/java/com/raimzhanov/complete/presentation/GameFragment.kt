package com.raimzhanov.complete.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.raimzhanov.complete.R
import com.raimzhanov.complete.databinding.FragmentGameBinding
import java.lang.RuntimeException


class GameFragment : Fragment() {

private var _binding:FragmentGameBinding? = null
    private val binding:FragmentGameBinding
    get() = _binding ?: throw RuntimeException("binding game fragment null")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
         _binding = FragmentGameBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}