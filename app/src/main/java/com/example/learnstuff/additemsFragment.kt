package com.example.learnstuff

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.learnstuff.databinding.AddItemLayoutBinding
import com.example.learnstuff.databinding.AllItemsLayoutBinding

class additemsFragment : Fragment() {

    private var _binding : AddItemLayoutBinding?=null
    private val binding get()=_binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding=AddItemLayoutBinding.inflate(inflater,container,false)
        binding.finishBtn.setOnClickListener{
            findNavController().navigate(R.id.action_additemsFragment_to_allitemsFragment)
        }
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}