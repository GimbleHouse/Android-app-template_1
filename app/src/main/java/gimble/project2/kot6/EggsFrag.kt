package gimble.project2.kot6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import gimble.project2.kot6.databinding.FragmentHomeBinding

//
class EggsFrag : Fragment() {

    private var _binding : FragmentHomeBinding?=null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater,container,false)
        initialSetup()
        return binding.root
    }


    //initial setup
    private fun initialSetup(){}

}