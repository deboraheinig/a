package com.example.myapplicationnya

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.myapplicationnya.models.Live

//Padrão para iniciar o Adapter do RecyclerView
//Ao dar ALT+ENTER, os métodos para o Adapter funcionar serão implementados.
class LiveAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

                     // Tipo<Objeto>
    private var items : List<Live> = ArrayList()
    // Os dados/itens ficarão armazenados aqui.

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        return LiveViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.res_item_live, parent, false)
        )
    }

    // Irá representar o layout
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when(holder){
            is LiveViewHolder ->{
                holder.bind(items[position])
            }
        }
    }

    // Irá dizer para o RecyclerView quantos itens serão mostrados.
    override fun getItemCount(): Int {
    return items.size
        //var que foi criada ali emcima
    }

    //Método que irá popular o Adapter com itens
    fun setDataSet(lives : List<Live>){
        this.items = lives
    }

    // Implementação do ViewHolder
    class LiveViewHolder constructor(
        itemView : View
    ): RecyclerView.ViewHolder(itemView){

        // Representação dos 3 itens no layout
        private val liveTitle = itemView.findViewById<TextView>(R.id.title)
        private val liveAuthor = itemView.findViewById<TextView>(R.id.author)
        private val liveThumbnail = itemView.findViewById<ImageView>(R.id.imageView)

        // Pega as informações da model e coloca no layout do recycler
        fun bind(live: Live){

            liveTitle.text = live.title
            liveAuthor.text = live.autor

             val requestOptions = RequestOptions()
                 .placeholder(R.drawable.ic_launcher_background)
                     //caso a internet nao carregue a img
                 .error(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOptions)
                .load(live.thumbnailUrl)
                .into(liveThumbnail)
        }
    }

}