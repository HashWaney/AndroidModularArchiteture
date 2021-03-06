package com.effective.android.webview.bean

import com.google.gson.annotations.SerializedName

/**
 * 无论是 js调native 还是native 调js，都统一 Result格式返回
 * Created by yummylau on 2018/5/7.
 */
data class Result<T>(
        @SerializedName("code") val code: Int,
        @SerializedName("message") val message: String,
        @SerializedName("data") val data: T)
