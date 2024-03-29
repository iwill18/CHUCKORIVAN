package com.example.chuckorivan.view

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.chuckorivan.databinding.FragmentEditBinding
import com.example.chuckorivan.viewmodel.MainViewModel

class EditFragment : Fragment() {

    private val binding by lazy { FragmentEditBinding.inflate(layoutInflater) }
    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = binding.root

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.needWipeViewData = true

        viewModel.jokeConfig.first_name?.let {
            binding.editFirstNameInput.setText(it)
        }
        viewModel.jokeConfig.last_name?.let {
            binding.editLastNameInput.setText(it)
        }
        binding.editFilterExplicit.isChecked = viewModel.jokeConfig.no_explicit
    }

    override fun onPause() {

        binding.editFirstNameInput.text.apply {
            viewModel.jokeConfig.first_name =
                if (this.isNotBlank()) this.toString() else null
        }

        binding.editLastNameInput.text.apply {
            viewModel.jokeConfig.last_name =
                if (this.isNotBlank()) this.toString() else null
        }

        viewModel.jokeConfig.no_explicit = binding.editFilterExplicit.isChecked

        super.onPause()
    }
}