package com.example.listadoparques

class ParquesProvider {
    companion object{
        val ParquesList = listOf<Parques>(
            Parques(
                imagen = "https://www.turismoenmadrid.com/wp-content/uploads/2020/05/parque-del-retiro-cerrado.jpg",
                descripcion = "Parque historico de Madrid",
                titulo = "Parque del retiro",

            ),
            Parques(
                imagen = "https://imagenes.elpais.com/resizer/ao5K2_mqJvsIf6JK2ySMH9etP3w=/1960x1103/cloudfront-eu-central-1.images.arcpublishing.com/prisa/PB7W4AD675PY3Y77PRXAORQMLQ.jpg",
                descripcion = "Central Park es un parque urbano público situado en el distrito metropolitano de Manhattan, en la ciudad de Nueva York",
                titulo = "Central Park",

                ),
            Parques(
                imagen = "https://cdn2.civitatis.com/reino-unido/londres/guia/hyde-park.jpg",
                descripcion = "Hyde Park es un parque situado en Londres, Reino Unido. Es el mayor de los cuatro parques reales",
                titulo = "Hyde Park",

                ),
            Parques(
                imagen = "https://berlinando.net/wp-content/uploads/2016/12/Tiergarten-berlin-1024x589.jpeg",
                descripcion = "El Tiergarten es el principal parque de Berlín,capital de Alemania. Ubicado en el centro de la ciudad",
                titulo = "Tiegarten",

                ),
            Parques(
                imagen = "https://images.squarespace-cdn.com/content/v1/5ceac7567e6b0a0001be06df/1570384330617-LSQ4UHOQ1C59R0TRRQI9/MU-061020190001-englischer-garten-munich.jpeg?format=1000w",
                descripcion = "El Englischer Garten (jardín inglés en alemán) es un parque ubicado en la ciudad de Múnich, Alemania.",
                titulo = "Englischer Garten",

                ),

        )


        }
    }
