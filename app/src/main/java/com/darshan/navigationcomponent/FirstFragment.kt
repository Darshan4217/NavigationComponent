package com.darshan.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.navOptions
import kotlinx.android.synthetic.main.fragment_first_fragment.*

class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_fragment, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val action: FirstFragmentDirections.ActionFirstFragmentToSecondFragment =
            FirstFragmentDirections.actionFirstFragmentToSecondFragment()
        action.message = "Hello fragment"
        action.title = "Country Fragment"
        button_first.setOnClickListener {
            //   Navigation.findNavController(it).navigate(R.id.action_firstFragment_to_secondFragment,null, options)
            Navigation.findNavController(it).navigate(action, options)
        }
    }


    private val options = navOptions {
        anim {
            enter = R.anim.slide_in_right
            exit = R.anim.slide_out_left
            popEnter = R.anim.slide_in_left
            popExit = R.anim.slide_out_right
        }
    }


}
