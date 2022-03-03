package com.dev.reachforhelp.ui.dashboard.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dev.reachforhelp.R
import com.dev.reachforhelp.databinding.FragmentNotificationsBinding
import com.dev.reachforhelp.model.NotificationData
import com.dev.reachforhelp.ui.adapter.NotificationAdapter

class NotificationsFragment : Fragment() {

    private lateinit var notificationsViewModel: NotificationsViewModel
    private  var _binding: FragmentNotificationsBinding? = null
    private lateinit var recyclerviewNotify: RecyclerView
    private lateinit var notificationAdapter: NotificationAdapter

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val notification = mutableListOf<NotificationData>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root


        notificationsViewModel.notificationList.observe(viewLifecycleOwner, Observer {
           notification.addAll(notification)
        })

        var notificationList = listOf(
            NotificationData(R.drawable.girl,
                "Your report has been submitted successfully", "20hrs ago"),
            NotificationData(R.drawable.girl,
            "Your report has been submitted successfully", "18hrs ago"),
            NotificationData(R.drawable.notity_img,
                "Your report has been treated", "18hrs ago"),
            NotificationData(R.drawable.girl,
                "Your report has been submitted successfully", "16hrs ago"),
            NotificationData(R.drawable.re,
                "Your report has been submitted successfully", "13hrs ago"),
            NotificationData(R.drawable.notity_img,
                "Your report has been treated", "11hrs ago"),
            NotificationData(R.drawable.girl,
                "Your report is been looked into", "10hrs ago"),
            NotificationData(R.drawable.notity_img,
                "Your report has been submitted successfully", "10hrs ago"),
            NotificationData(R.drawable.girl,
                "Your report is been looked into", "9hrs ago"),
            NotificationData(R.drawable.re,
                "Your report has been treated", "8hrs ago"),
            NotificationData(R.drawable.notity_img,
                "Your report has been treated", "6hrs ago"),
            NotificationData(R.drawable.re,
                "Your report has been submitted successfully", "4hrs ago"),
            NotificationData(R.drawable.girl,
                "Your report has been treated", "9hrs ago"),
        )

        binding.recyclerViewNotification.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.recyclerViewNotification.adapter =
            NotificationAdapter(notificationList, requireContext())

        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentNotificationsBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}