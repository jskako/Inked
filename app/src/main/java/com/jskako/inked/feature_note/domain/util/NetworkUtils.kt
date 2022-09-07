package com.jskako.inked.feature_note.domain.util

import android.content.Context
import android.net.ConnectivityManager
import android.net.LinkProperties

fun Context.getConnectivityManager() =
    getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

fun isNetworkAvailable(context: Context): Boolean = with(context.getConnectivityManager()) {
    val link = this.getLinkProperties(this.activeNetwork)
    return link is LinkProperties
}