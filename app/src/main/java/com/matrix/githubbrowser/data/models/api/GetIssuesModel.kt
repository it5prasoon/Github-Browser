package com.matrix.githubbrowser.data.models.api

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class GetIssuesModel(

    @SerializedName("title")
    @Expose
    val title: String,

    @SerializedName("user")
    @Expose
    val setGetIssueSubModel: GetIssueSubModel

)