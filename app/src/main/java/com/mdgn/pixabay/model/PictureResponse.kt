package com.mdgn.pixabay.model

data class PictureResponse (
    var total : Int? = null,
    var hits : List<Picture>? = null
        )