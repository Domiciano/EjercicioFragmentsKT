package edu.co.icesi.ejerciciofragmentskt.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import edu.co.icesi.ejerciciofragmentskt.databinding.FragmentConfigBinding


class ConfigFragment : Fragment(){

    private lateinit var binding : FragmentConfigBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentConfigBinding.inflate(layoutInflater, container, false)
        val root = binding.root
        return root
    }



    companion object {
        @JvmStatic
        fun newInstance() = ConfigFragment()
    }
}