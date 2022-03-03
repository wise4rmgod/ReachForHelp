package com.dev.reachforhelp.ui.dashboard.ui.dashboard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DashboardViewModel : ViewModel() {

    private val _case = MutableLiveData<String>().apply {
        value = "This is dashboard Fragment"
    }
    val caseList: LiveData<String> = _case
}