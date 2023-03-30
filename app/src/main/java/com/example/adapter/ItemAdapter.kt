
package com.example.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.letras.R
import com.example.model.Letras


class ItemAdapter (private val context: Context, private val dataset: List<Letras>) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
        val textView: TextView = view.findViewById(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
       /*  crear nueva vista */
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent,false)

        return ItemViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
       /* tamaño del conjunto de datos*/
       return dataset.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        /*remplaza los elementos de vista de la lista */
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        /*aqui puede haber un error por stringResourceId*/
    }


}