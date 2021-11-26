package com.example.magiacafetera.ui.configuracion

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.example.magiacafetera.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}