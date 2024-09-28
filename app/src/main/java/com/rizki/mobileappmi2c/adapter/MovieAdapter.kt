package com.rizki.mobileappmi2c.adapter

import android.graphics.Movie
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.rizki.mobileappmi2c.MovieActivity
import com.rizki.mobileappmi2c.R
import com.rizki.mobileappmi2c.model.ModelMovie

class MovieAdapter constructor(
    private val getActivity: MovieActivity, //ini agar item recycle bisa d klik
    private val movieList: List<ModelMovie>
) : RecyclerView.Adapter<MovieAdapter.MyViewHolder>() {
    class MyViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        val txtMovie: TextView = itemView.findViewById(R.id.txtMovie)
        val imgMovie: ImageView = itemView.findViewById(R.id.imgMovie)
        val cardMovie : CardView = itemView.findViewById(R.id.cardMovie)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_movie_card, parent, false)
        return MyViewHolder(nView)
    }
    override fun getItemCount(): Int {
      return movieList.size
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtMovie.text = movieList[position].title
        holder.imgMovie.setImageResource(movieList[position].image)
        //agar bisa klik
        holder.cardMovie.setOnClickListener(){
            Toast.makeText(getActivity, movieList[position].title,
                Toast.LENGTH_SHORT).show()
        }
    }

}