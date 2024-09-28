package com.rizki.mobileappmi2c.model

import android.content.Context
import android.content.res.Resources
import com.rizki.mobileappmi2c.R

data class ModelBuah(
    val image: Int,
    val judul : String,
    val lokasi : String,
    val deksripsi: String
)

//kita bikin array
object MockList{

    fun getModel(context: Context ): List<ModelBuah>{


        val item1 = ModelBuah(
            R.drawable.apple,
            "Apel",
            "Indonesia",
            context.getString(R.string.st_apel)
        )
        val item2 = ModelBuah(
            R.drawable.grapes,
            "Anggur",
            "Malaysia",
            context.getString(R.string.st_anggur)
        )
        val item3 = ModelBuah(
            R.drawable.orange,
            "Jeruk",
            "Australia",
            context.getString(R.string.st_jeruk)
        )
        val item4 = ModelBuah(
            R.drawable.pear,
            "Per",
            "Bali",
            context.getString(R.string.st_pear)
        )
        val item5 = ModelBuah(
            R.drawable.strawberry,
            "Strowberry",
            "Medan",
            context.getString(R.string.st_anggur)
        )
        val item6 = ModelBuah(
            R.drawable.apple,
            "Apel",
            "Padang",
            context.getString(R.string.st_jeruk)
        )

        val itemList: ArrayList<ModelBuah> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        itemList.add(item5)
        itemList.add(item6)
        return  itemList

    }
}
