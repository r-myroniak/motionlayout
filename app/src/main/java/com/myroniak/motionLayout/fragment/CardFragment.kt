package com.myroniak.motionLayout.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.myroniak.motionLayout.databinding.CardFragmentBinding
import com.myroniak.motionLayout.model.Item

class CardFragment(private val item: Item) : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = CardFragmentBinding.inflate(inflater, container, false)

        binding.title.text = item.title
        binding.description.text = item.description

        return binding.root
    }
}