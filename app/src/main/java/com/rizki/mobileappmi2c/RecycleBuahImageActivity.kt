package com.rizki.mobileappmi2c

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.rizki.mobileappmi2c.adapter.BuahAdapter
import com.rizki.mobileappmi2c.adapter.MovieAdapter
import com.rizki.mobileappmi2c.model.MockList
import com.rizki.mobileappmi2c.model.ModelBuah
import com.rizki.mobileappmi2c.model.ModelMovie

class RecycleBuahImageActivity : AppCompatActivity() {

    private lateinit var rv_buah: RecyclerView
    private lateinit var rv_buah2: RecyclerView

//    private var recycleView: RecyclerView? = null
//    private var buahAdapter: BuahAdapter? = null
//    private var buahList = mutableListOf<ModelBuah>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycle_buah_image)
        rv_buah = findViewById(R.id.rv_buah)
        rv_buah2 = findViewById(R.id.rv_buah2)

        rv_buah2.layoutManager = GridLayoutManager(
            this, 1,
            GridLayoutManager.VERTICAL, false
        )
        rv_buah.layoutManager = LinearLayoutManager(
            this, LinearLayoutManager.HORIZONTAL,
            true
        )

        val adapter = BuahAdapter(MockList.getModel(this) as ArrayList<ModelBuah>, this)
        rv_buah.adapter = adapter
        rv_buah2.adapter = adapter

//        prepareDataBuah()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

//    private fun prepareDataBuah() {
//        var itemBuah = ModelBuah(
//            R.drawable.apple,
//            "Apel",
//            "Indonesia",
//            R.string.st_jeruk.toString()
//        )
//        buahList.add(itemBuah)
//
//        itemBuah = ModelBuah(
//            R.drawable.grapes,
//            "Anggur",
//            "Malaysia",
//            R.string.st_pear.toString()
//        )
//        buahList.add(itemBuah)
//        itemBuah = ModelBuah(
//            R.drawable.orange,
//            "Jeruk",
//            "Australia",
//            R.string.st_jeruk.toString()
//        )
//        buahList.add(itemBuah)
//        itemBuah = ModelBuah(
//            R.drawable.pear,
//            "Per",
//            "Bali",
//            R.string.st_apel.toString()
//        )
//        buahList.add(itemBuah)
//
//        itemBuah = ModelBuah(
//            R.drawable.strawberry,
//            "Strowberry",
//            "Medan",
//            R.string.st_apel.toString()
//        )
//        buahList.add(itemBuah)
//        itemBuah = ModelBuah(
//            R.drawable.apple,
//            "Apel",
//            "Padang",
//            R.string.st_pear.toString()
//        )
//        buahList.add(itemBuah)
//        buahAdapter!!.notifyDataSetChanged()
//
//    }
}