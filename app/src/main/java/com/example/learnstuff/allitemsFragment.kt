package com.example.learnstuff

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.learnstuff.databinding.AllItemsLayoutBinding
import kotlinx.coroutines.flow.combine


class allitemsFragment : Fragment() {

    private var _binding : AllItemsLayoutBinding?=null
    private  val binding get()=_binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding=AllItemsLayoutBinding.inflate(inflater,container,false)
         binding.fab.setOnClickListener{
             findNavController().navigate(R.id.action_allitemsFragment_to_additemsFragment)
         }
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }
}