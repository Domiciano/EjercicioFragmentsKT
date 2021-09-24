package edu.co.icesi.ejerciciofragmentskt.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import edu.co.icesi.ejerciciofragmentskt.databinding.FragmentContentBinding


class ContentFragment : Fragment() {


    private lateinit var binding: FragmentContentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentContentBinding.inflate(layoutInflater, container, false)
        val root = binding.root
        return root
    }



    companion object {
        fun newInstance() =  ContentFragment()
    }
}