package com.example.myapplicationnya

import com.example.myapplicationnya.models.Live

class DataSource {
    //Criação de dados "mockados" - fixos no código
    companion object {

        fun createDataSet() : ArrayList<Live>{

            val list = ArrayList<Live>()

            //Criando objetos fixos passando parâmetros esperados na classe Live
            list.add(
                Live(
                    " Live #001",
                    "Deborah Heinig",
                    "https://www.kindpng.com/imgv/TwhobTx_kitty-kitten-cat-white-kawaii-soft-mochi-chibi/",
                    "https://www.youtube.com/watch?v=EB32R-u_tac&t=239s",
                )
            )

            list.add(
                Live(
                    " Live #002",
                    "Deborah Heinig",
                    "https://www.kindpng.com/imgv/TwhobTx_kitty-kitten-cat-white-kawaii-soft-mochi-chibi/",
                    "https://www.youtube.com/watch?v=EB32R-u_tac&t=239s",
                )
            )

            list.add(
                Live(
                    " Live #003 ",
                    "Deborah Heinig",
                    "https://www.kindpng.com/imgv/TwhobTx_kitty-kitten-cat-white-kawaii-soft-mochi-chibi/",
                    "https://www.youtube.com/watch?v=EB32R-u_tac&t=239s",
                )
            )

            list.add(
                Live(
                    " Live #004",
                    "Deborah Heinig",
                    "https://www.kindpng.com/imgv/TwhobTx_kitty-kitten-cat-white-kawaii-soft-mochi-chibi/",
                    "https://www.youtube.com/watch?v=EB32R-u_tac&t=239s",
                )
            )

            list.add(
                Live(
                    " Live #005",
                    "Deborah Heinig",
                    "https://www.kindpng.com/imgv/TwhobTx_kitty-kitten-cat-white-kawaii-soft-mochi-chibi/",
                    "https://www.youtube.com/watch?v=EB32R-u_tac&t=239s",
                )
            )

            return list

        }

    }

}