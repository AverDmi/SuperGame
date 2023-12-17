package com.dimthomas.supergame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.dimthomas.supergame.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val controller = findNavController()

        binding.mainTtpContainer.setOnClickListener {
            controller.navigate(R.id.gameFragment)
        }
        binding.mainSettingsBtn.setOnClickListener {
            Toast.makeText(activity,"Settings",Toast.LENGTH_SHORT).show();
        }
        binding.mainAdContainer.setOnClickListener {
            Toast.makeText(activity,"AD",Toast.LENGTH_SHORT).show();
        }
        binding.mainCartContainer.setOnClickListener {
            Toast.makeText(activity,"Cart",Toast.LENGTH_SHORT).show();
        }
        binding.mainCupContainer.setOnClickListener {
            Toast.makeText(activity,"Cup",Toast.LENGTH_SHORT).show();
        }
        binding.mainPvpContainer.setOnClickListener {
            Toast.makeText(activity,"PVP",Toast.LENGTH_SHORT).show();
        }
        binding.mainUpgradeCostContainer.setOnClickListener {
            Toast.makeText(activity,"Upgrade",Toast.LENGTH_SHORT).show();
        }
        binding.mainCoinUpgrade.setOnClickListener {
            Toast.makeText(activity,"Upgrade",Toast.LENGTH_SHORT).show();
        }
        binding.mainFreeContainer.setOnClickListener {
            Toast.makeText(activity,"Play video",Toast.LENGTH_SHORT).show();
        }
        binding.mainFreeUpgrade.setOnClickListener {
            Toast.makeText(activity,"Play video",Toast.LENGTH_SHORT).show();
        }
    }
}