package com.example.myapplicationnya

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    //Inicialização atrasada
    private lateinit var liveAdapter: LiveAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Função que inicia o RecyclerView
        initRecyclerView()

        //Função que adicionará dados no Recycler
        addDataSource()
    }

    //Criada ao pressionar ALT+ENTER em addDataSource()
    private fun addDataSource() {

        val dataSource = DataSource.createDataSet()
        this.liveAdapter.setDataSet(dataSource)
    }

    //Criada ao pressionar ALT+ENTER em initRecyclerView()
    private fun initRecyclerView() {

        this.liveAdapter = LiveAdapter()

        findViewById<RecyclerView>(R.id.recyclerView).layoutManager = LinearLayoutManager(this@MainActivity)
        findViewById<RecyclerView>(R.id.recyclerView).adapter = this.liveAdapter
    }

}