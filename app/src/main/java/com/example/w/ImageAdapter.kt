package com.example.w

import android.media.Image
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.w.databinding.ItemBinding
import com.example.w.network.ImageModel

class ImageAdapter :  RecyclerView.Adapter<ImageAdapter.ImageViewHolder>() {
    var array = arrayListOf<ImageModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImageViewHolder {
        return ImageViewHolder(
            ItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ImageViewHolder, position: Int) {
        holder.bind(array[position])
    }

    override fun getItemCount(): Int = array.size

    fun array(arrayList: ArrayList<ImageModel>) {
        array = arrayList
    }


    inner class ImageViewHolder(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(model: ImageModel) {
            binding.image.load(model.largeImageURL)
        }
    }
}




