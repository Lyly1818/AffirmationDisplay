package net.trancool.affirmationdisplay.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import net.trancool.affirmationdisplay.R
import net.trancool.affirmationdisplay.model.Affirmation
//pass the context here to allow ItemAdapter to have access to string resources
class ItemAdapter(

   private val context: Context,//because the class will need to access string
   // in resources to use Affirmation
   private val dataset: List<Affirmation>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

//   this class is to interact directly with the view. It's an inner class
   class  ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
      val textView : TextView = view.findViewById(R.id.item_title)
      val imageView : ImageView = view.findViewById(R.id.item_image)

   }
   

   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
     val adapterLayout = LayoutInflater.from(parent.context)
        .inflate(R.layout.list_item, parent, false)
      return ItemViewHolder(adapterLayout)
   }

   override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
//      TODO("Not yet implemented")
      val item = dataset[position]
      holder.textView.text = context.resources.getString(item.stringResourceID)
      holder.imageView.setImageResource(item.imageResourceId)
   }

   override fun getItemCount() = dataset.size


}