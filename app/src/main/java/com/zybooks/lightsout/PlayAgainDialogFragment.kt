package com.zybooks.lightsout

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class PlayAgainDialogFragment(val negativeButtonFunc: () -> Unit) : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(this.requireContext())
        builder.setTitle("Cheat")
        builder.setMessage("Did you cheat?")
        builder.setPositiveButton("Yes", null)
        builder.setNegativeButton("No") { _, _ ->
            negativeButtonFunc()
        }
        return builder.create()
    }
}