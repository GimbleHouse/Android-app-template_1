package gimble.project2.kot6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import gimble.project2.kot6.databinding.FragmentEggsBinding

class EggsFrag : Fragment() {

    private lateinit var binding: FragmentEggsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding=FragmentEggsBinding.inflate(inflater,container,false)
        return binding.root
    }


}