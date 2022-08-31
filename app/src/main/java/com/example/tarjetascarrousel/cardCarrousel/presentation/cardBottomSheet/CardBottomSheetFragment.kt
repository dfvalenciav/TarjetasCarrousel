package com.example.tarjetascarrousel.cardCarrousel.presentation.cardBottomSheet


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.tarjetascarrousel.cardCarrousel.base.BaseFragment
import com.example.tarjetascarrousel.cardCarrousel.presentation.cardBottomSheet.models.TransactionPresentation
import com.example.tarjetascarrousel.databinding.FragmentCardBottomSheetBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class CardBottomSheetFragment :
    BaseFragment<FragmentCardBottomSheetBinding, CardBottomSheetViewModel>() {

    override val viewModel by viewModels<CardBottomSheetViewModel>()

    private lateinit var transactionItems: List<TransactionPresentation>


    override fun inflateView(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentCardBottomSheetBinding.inflate(inflater, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getTransactionList()
    }

    override fun setUI() {
        super.setUI()
    }

    override fun observe() {
        viewModel.event.observe(viewLifecycleOwner) { event ->
            when (event) {
                is TransactionEvent.ListTransaction -> {
                    transactionItems = event.ls
                }
                else -> {}
            }
        }
    }

}