package gimble.project2.kot6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import gimble.project2.kot6.databinding.FragmentHomeBinding

class HomeFrag : Fragment() {
    private var _binding: FragmentHomeBinding?=null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater,container,false)
        binding.button.setOnClickListener{
            Toast.makeText(requireActivity(),"fuck u",Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }


}