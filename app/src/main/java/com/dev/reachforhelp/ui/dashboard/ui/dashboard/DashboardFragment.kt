package com.dev.reachforhelp.ui.dashboard.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dev.reachforhelp.R
import com.dev.reachforhelp.databinding.FragmentDashboardBinding
import com.dev.reachforhelp.model.CaseData
import com.dev.reachforhelp.ui.adapter.CaseAdapter

class DashboardFragment : Fragment() {

    private lateinit var dashboardViewModel: DashboardViewModel
    private var _binding: FragmentDashboardBinding? = null
    private lateinit var caseRecyclerView: RecyclerView
    private lateinit var caseAdapter: CaseAdapter

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val case = mutableListOf<CaseData>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root

        var caseList = listOf(
            CaseData(R.drawable.voice_note,"27-02-22", "New Record 1",
        "New Records", "10: 14pm", "Tap to play", "In progress"),
            CaseData(R.drawable.video,"01-03-22", "New Record 2",
                "New Records", "9: 14pm", "Tap to play", "Pending"),
            CaseData(R.drawable.voicenote,"04-03-22", "New Record 2",
                "New Records", "3: 20am", "Tap to play", "Done"),
            CaseData(R.drawable.voice_note,"27-02-22", "New Record 1",
                "New Records", "10: 14pm", "Tap to play", "In progress"),
            CaseData(R.drawable.video,"01-03-22", "New Record 2",
                "New Records", "9: 14pm", "Tap to play", "Pending"),
            CaseData(R.drawable.voicenote,"04-03-22", "New Record 2",
                "New Records", "3: 20am", "Tap to play", "Done"),
            CaseData(R.drawable.voice_note,"27-02-22", "New Record 1",
                "New Records", "10: 14pm", "Tap to play", "In progress"),
            CaseData(R.drawable.video,"01-03-22", "New Record 2",
                "New Records", "9: 14pm", "Tap to play", "Pending"),
            CaseData(R.drawable.voicenote,"04-03-22", "New Record 2",
                "New Records", "3: 20am", "Tap to play", "Done"),
            CaseData(R.drawable.voice_note,"27-02-22", "New Record 1",
            "New Records", "10: 14pm", "Tap to play", "In progress"),
            CaseData(R.drawable.video,"01-03-22", "New Record 2",
            "New Records", "9: 14pm", "Tap to play", "Pending"),
            CaseData(R.drawable.voicenote,"04-03-22", "New Record 2",
            "New Records", "3: 20am", "Tap to play", "Done")

        )
        binding.caseRecyclerView.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.caseRecyclerView.adapter =
            CaseAdapter(caseList, requireContext())

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentDashboardBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}