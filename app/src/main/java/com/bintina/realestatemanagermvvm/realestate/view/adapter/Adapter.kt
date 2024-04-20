package com.bintina.realestatemanagermvvm.realestate.view.adapter

import android.content.ClipData.Item
import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bintina.realestatemanagermvvm.R
import com.bintina.realestatemanagermvvm.databinding.ItemViewBinding
import com.bintina.realestatemanagermvvm.realestate.model.ListingItem
import com.bumptech.glide.Glide

class Adapter() : RecyclerView.Adapter<Adapter.ItemViewHolder>() {

    val realEstateList = mutableListOf<ListingItem>()

    class ItemViewHolder(private val view: ItemViewBinding, private val context: Context) :
        RecyclerView.ViewHolder(view.root) {

            fun bind(listingItem: ListingItem){

        //Load RealEstate Photos
                val listingImage = listingItem.media.first()?.imageUrl
            Glide.with(view.propertyImage)
                .load(listingImage)
                .placeholder(R.drawable.ic_launcher_foreground)
                .centerCrop()
                .into(view.propertyImage)

                //Type text
                val propertyType = listingItem.type.toString()
                view.type.text = propertyType

                //Locationtext
                val propertyLocation = listingItem.address.locationName
                view.location.text = propertyLocation

                //PriceText
                val propertyPrice = listingItem.usdPrice.toString()
                view.price.text = propertyPrice
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}