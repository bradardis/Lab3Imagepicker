package edu.temple.imagepicker
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>(){

    private var desc = arrayOf("This photo was taken of a Buddhist temple in the residential area of Bangkok. In Thailand there was a temple every 5 blocks but this temple had very inteicate designes" +
            " and was larger than the others we saw ", "Here is another shot of the same temple, this highlights the gold designs covering the underside of the roof. I did not capture any pictures of the inside" +
            " because I didnt want to be inconsiderate of the monks but the inside was adorned with golden statues", "This is also in Thailand but out in the middle of nowhere, we drove for a few hours to see these two twin temples on the mountaintop",
    "This was taken in Belize, these are ancient Mayan temples that they used to perform human sacrifices in. Its amazing that the stone sculptures have survived to this day despite being so old"
    , "This was taken in Seoul South Korea, this was just a random temple in the middle of a roundabout in the busy city center. It was interesting because of the blend of city and tradition"
    , "This was taken atop a small mountain overlooking Railay Beach in Krabi Thailand. After climbing almost entirely vertical up the rocky cliffs atop the tiny mountain there is a basin that the monekys usually hang out in to avoid tourists.  "
    , "This is another shot of the basic atop the mountain, it was really cool because of how little people were up here, there were also little caverns around the lake in the basin which were a little scary"
    , "This is my grandfather at Pont Du Hoc, located in Normandy france. The Nazi's held this point overlooking the english channel stacking all of their artillery and mortars in preperation for D-day. The weapons of war are still there to this day."
    , "This is Thingvaller national park in Iceland, pictured are the north american and european tectonic plates. This is one of the only points in the world where you can see two tectonic plates touching each other."
    , "This was also taken in Iceland, honestly they need to rename to waterfall land because there was a waterfall every two feet!")
    private var images = intArrayOf(R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4,  R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8, R.drawable.img9, R.drawable.img10,)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.card_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {
        holder.itemDesc.text = desc[position]
        holder.itemImage.setImageResource((images[position]))
    }

    override fun getItemCount(): Int {
        return desc.size
    }
    inner class ViewHolder(itemView:View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemDesc: TextView
        init {
           itemImage = itemView.findViewById(R.id.image)
            itemDesc = itemView.findViewById(R.id.imageText)
        }
    }
}