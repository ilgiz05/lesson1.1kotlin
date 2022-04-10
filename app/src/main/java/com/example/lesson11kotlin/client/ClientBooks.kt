package com.example.lesson11kotlin.client

import com.example.lesson11kotlin.R
import com.example.lesson11kotlin.model.NameModel
import java.lang.reflect.Array.get

object

ClientBooks {
    fun getBooks(): ArrayList<NameModel> {
        val getlist = ArrayList<NameModel>()
        getlist.add(
            NameModel(
                "kotlin",
                "Many apps are built with Kotlin, from the hottest startups to Fortune 500 companies. Learn how Kotlin helped their teams become more productive and write higher quality apps. Code safely. Big community. Write less code. Online courses. Multiplatform. Mature language.",
                R.drawable.img
            )
        )
        getlist.add(
            NameModel(
                "Anime",
                "[anʲime], от англ. animation — «анимация») — японская мультипликация. В отличие от мультфильмов других стран, предназначенных в основном для просмотра детьми, бо́льшая часть выпускаемого аниме рассчитана на подростковую и взрослую аудитории, и во многом за счёт этого имеет высокую популярность в мире./",
                R.drawable.img_1

            )
        )
        getlist.add(
            NameModel(
                "незуко тян",
                "Незуко Камадо (竈門かまど禰ね豆ず子こ Kamado Nezuko?) — младшая сестра Танджиро. Она была превращена в демона Музаном Кибуцуджи.",
                R.drawable.nezuko1
            )
        )
        return getlist

    }
}