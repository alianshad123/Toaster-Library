package com.anshad.toasterlib

import android.content.Context
import android.widget.Toast




object Toaster {

    fun toast(context: Context?, message: String?) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}