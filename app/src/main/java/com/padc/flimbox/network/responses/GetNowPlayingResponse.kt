package com.padc.flimbox.network.responses

import com.google.gson.annotations.SerializedName
import com.padc.flimbox.data.vos.DatesVO
import com.padc.flimbox.data.vos.NowShowingVO

class GetNowPlayingResponse(

    @SerializedName("results")
    val results: MutableList<NowShowingVO>,

    @SerializedName("page")
    val page : Int,

    @SerializedName("total_results")
    val totalResult : Int,

    @SerializedName("dates")
    val dates : DatesVO,

    @SerializedName("total_pages")
    val totalPages : Int


) : BaseResponse() {




}