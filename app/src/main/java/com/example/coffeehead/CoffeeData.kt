package com.example.coffeehead

object CoffeeData {
    private val coffeeName = arrayOf("Espresso","Ristretto", "Americano","Cappuccino","Macchiato", "Cortado")

    private val coffeeDetail = arrayOf("Minuman kopi paling dasar ini biasanya disajikan dalam demitasse alias cangkir khusus espresso berukuran 30 mililiter (satu shot) sampai 118 mililiter. Espresso bertekstur pekat dan pahit, dengan buih putih alias crema di atasnya yang terbentuk dari tekanan minyak dalam bijih kopi.",
    "Dalam bahasa Italia, ristretto berarti terbatas atau terlarang. Serupa dengan espresso, hanya saja takaran air dalam minuman ini lebih sedikit. Namun, waktu press dalam pembuatan ristretto sama dengan espresso.",
    "Americano terdiri dari satu shot espresso yang dituangkan dalam cangkir berukuran 178 mililiter yang dicampur dengan air panas hingga memenuhi gelas. Jenis lainnya adalah doppio, yakni segelas Americano dengan dua shot espresso",
    "Minuman ini terdiri dari espresso dan steamed milk dengan rasio 1:1. Namun, ada juga yang memakai perbandingan 1/3 espresso, 1/3 steamed milk, dan 1/3 susu foam. Biasanya disajikan dalam cangkir berkapasitas 88 mililiter hingga 177 mililiter.",
    "Kalau kamu gak terlalu menikmati kopi yang cenderung pahit, kamu bisa pesan macchiato sebagai alternatif. Rasio steamed milk dalam minuman ini lebih besar dari espresso, sehingga ada sentuhan milky dan gurih.",
    "Dalam bahasa Spanyol, cotardo artinya memotong. Banyak orang yang menyamakan cortado dengan macchiato karena komposisinya mirip. Namun perbandingan espresso dan steamed milk cortado biasanya 1:1, meski di sejumlah tempat ada yang memakai rasio 1:2.")

    private val coffeeImages = intArrayOf(R.drawable.espresso, R.drawable.ristretto, R.drawable.americano, R.drawable.cappuccino, R.drawable.macchiato, R.drawable.cortado)

    val listData: ArrayList<Coffee>
    get() {
        val list = arrayListOf<Coffee>()
        for(possition in coffeeName.indices){
            val coffee = Coffee()
            coffee.name = coffeeName[possition]
            coffee.detail = coffeeDetail[possition]
            coffee.photo = coffeeImages[possition]
            list.add(coffee)
        }
        return list
    }
}
