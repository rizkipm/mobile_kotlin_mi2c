package com.rizki.mobileappmi2c.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.rizki.mobileappmi2c.DetailBuah
import com.rizki.mobileappmi2c.R
import com.rizki.mobileappmi2c.RecycleBuahImageActivity
import com.rizki.mobileappmi2c.model.ModelBuah

class BuahAdapter(
    val itemList: ArrayList<ModelBuah>,
    val getActivity: RecycleBuahImageActivity // untuk pake intent replace context, this
) :
    RecyclerView.Adapter<BuahAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //deklarasi widget dari item layout
        var itemImage: ImageView
        var itemText: TextView
        init {
            itemImage = itemView.findViewById(R.id.gambar)
            itemText = itemView.findViewById(R.id.nama)
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       //kita deklare layout
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_costum_buah, parent, false)
        return MyViewHolder(nView)
    }
    override fun getItemCount(): Int {
        return itemList.size
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //set data ke widget
        holder.itemImage.setImageResource(itemList[position].image)
        holder.itemText.setText(itemList[position].judul)

        //kita tambahkan intent ke detai;
        holder.itemView.setOnClickListener(){
            //intent
            //context atau this --> getActivity
            val intent = Intent(getActivity, DetailBuah::class.java)
            //kita put data untuk kita passed ke detail
            intent.putExtra("image", itemList[position].image)
            intent.putExtra("judul", itemList[position].judul)
            //tambahkan put extra untuk lokasi dan deksripsi
            intent.putExtra("lokasi", itemList[position].lokasi)
            intent.putExtra("deksripsi", itemList[position].deksripsi.toString())
            //passed ke detail
            getActivity.startActivity(intent)
        }
    }
}