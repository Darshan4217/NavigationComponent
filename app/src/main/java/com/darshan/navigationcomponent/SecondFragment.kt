package com.darshan.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args: SecondFragmentArgs? = arguments?.let {
            SecondFragmentArgs.fromBundle(it)
        }

        textView_name.text = args?.message
        textView_title.text = args?.title
        button_second.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_secondFragment_to_thirdFragment)
        }
    }

}
