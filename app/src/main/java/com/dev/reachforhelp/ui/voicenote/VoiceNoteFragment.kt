package com.dev.reachforhelp.ui.voicenote

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dev.reachforhelp.R

class VoiceNoteFragment : Fragment() {

    companion object {
        fun newInstance() = VoiceNoteFragment()
    }

    private lateinit var viewModel: VoiceNoteViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.voice_note_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(VoiceNoteViewModel::class.java)
        // TODO: Use the ViewModel
    }

}