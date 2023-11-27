package gimble.project2.kot6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import gimble.project2.kot6.databinding.FragmentStatsBinding

class StatsFrag : Fragment() {

    private lateinit var binding :FragmentStatsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentStatsBinding.inflate(inflater, container, false)
        return binding.root


    }

}