package com.example.tokomu.data

import androidx.core.util.rangeTo
import com.example.tokomu.model.Product
import com.example.tokomu.model.Shop
import org.json.JSONArray

object Products {
    private val jsonProducts: String = """
       [
  {
    "name": "Helm Bogo Retro Klasik nv Dewasa Kulit Visor Bobo Flat Datar Coklat Hitam",
    "price": 55999,
    "stock": 100,
    "image": "https://cf.shopee.co.id/file/dc891e53ad2dcf8e448ca3487ca1ae74",
    "description": "Helm Retro Dewasa dengan Kaca BoBo Original dengan ukuran helm all size (setara M), \nDibuat dari lapisan bahan kulit di luar dan bahan fiber serta spons dibagian dalam dilengkapi sabuk pengaman kepala, bahan ringan namun tetap kuat sesuai Standar SNI membuat helm ini nyaman dan aman dipakai, dilengkapi dengan warna-warna garang yg membuat Helm ini stylis dipakai ketika mengendarai motor skuter maupun helm motor retro lainnya. \n -Kreasi Lokal-High Quality Products Handmade \n-Desain Unik dan Menarik\n-Modis dan elegan sangat cocok untuk penggemar retro style\n-Nyaman Dipakai-Ukuran Allsize (fit to M)\n",
    "shop": {
      "name": "nvgalleryku",
      "city": "SURABAYA",
      "image": "https://cf.shopee.co.id/file/1b4127c5cf599f670ebe6296c6f165ba_tn"
    }
  },
  {
    "name": "Bonkyo Paket Gaming Keyboard dan Mouse RGB / Set Gaming Mouse dan Keyboard USB Cable RGB",
    "price": 89900,
    "stock": 100,
    "image": "https://cf.shopee.co.id/file/d429b43ed4146e98c2bcb0efc21c5490",
    "description": "Bonkyo Paket Gaming Keyboard dan Mouse RGB adalah Setup Gaming terbaru yang bonkyo keluarkan untuk para penikmat game / gamer dimana saat kalian bermain game akan merasakan sensasi yang lebih nyaman dan ahli dalam menggunakan peralatan gaming ini.\n Produk tidak bisa digunakan untuk HP!\nUNTUK MACBOOK dan OS linux TIDAK SUPPORT RGB / LAMPU WARNA WARNI NYA\n # UNTUK NYALAKAN LAMPUNNYA PENCET SCROLL LOCK #\nHanya mendapatkan mouse dan keyboard\nFitur-Fitur:\nModel: Keyboard and Mouse RGB\nKeyboard layout - US/UK\nMouse resolution - 1000 DPI\nCable length - 1.50M\nInterface- USB\nCompaTible - WIN XP / VISTA / 7/8\n Keyboard di mensions-425*120*28MM\nMouse dimensions - 110*70*38 MM\n",
    "shop": {
      "name": "bonkyofficial",
      "city": "JAKARTA BARAT",
      "image": "https://cf.shopee.co.id/file/e8170e8b92a71c7929dc19d71485f6fa_tn"
    }
  },
  {
    "name": "Samsung Galaxy A12 6/128 GB - Black",
    "price": 2798999,
    "stock": 100,
    "image": "https://cf.shopee.co.id/file/dfe0f934a9719d2a86cd6e0961b92a0a",
    "description": "Samsung Galaxy A12 6/128 GB\nOS ver: Android 10\nSIM: Nano SIM , Single SIM , Dual SIM , Dual Standby\nCPU: Mediatek MT6765 Helio P35 (12nm)\nOcta-core Cortex-A53\nKecepatan CPU: 4x2.35 GHz Cortex-A53 & 4x1.8 GHz Cortex-A53\nMemori Internal: 128GB\nRAM: 6GB\nMemori Eksternal: microSD, up to 1TB\nBaterai: Li-Po 5.000 mAh, non-removable\nFast charging: 15W\nLayar\nUkuran Layar: 6.5 inches\nResolusi Layar: HD+ 720 x 1560 pixels\n",
    "shop": {
      "name": "samsung.official",
      "city": "JAKARTA UTARA",
      "image": "https://shopee.co.id/samsung.official?categoryId=40&itemId=8008903996"
    }
  },
  {
    "name": "Senter 5000 Lumens",
    "price": 145000,
    "stock": 100,
    "image": "https://cf.shopee.co.id/file/03a064b96ea14f599fadedf76d565c5d",
    "description": "Informasi Produk Senter LED Cree XM-L T6 26650 5000 Lumens\nSenter ini menggunakan baterai 26650 yang sangat powerful dan memiliki body yang sangat solid. Dapat menghasilkan cahaya hingga 5000Lm dengan jarak throw 500 meter. Memiliki tactical tail switch untuk On/Off Senter.\nNote: Terdapat Logo Taffware pada fisik produk.\nFeatures\nCree XM-L T6\nSenter LED ini dilengkapi dengan 1 buah Cree XM-L T6 LED yang dapat menghasilkan cahaya maksimal 5000 Lumens dengan jarak throw 500 meter.\nTactical Tail Switch\nTactical tail switch berfungsi untuk On/Off senter.\n26650 Battery\nSenter LED ini menggunakan 1 buah baterai 26650 atau 1 buah 18650 dan juga terdapat adapter untuk menggunakan baterai AAA.\nPackage Contents\nBarang-barang yang anda dapat dalam kotak produk:\n1 x Senter\n1 x Adapter Baterai AAA\n1 x Adapter Baterai 18650\n1 x Lanyard\n",
    "shop": {
      "name": "cupliss_casing",
      "city": "JAKARTA TIMUR",
      "image": "https://cf.shopee.co.id/file/20039f9f90b9492e8e069197a27738f1_tn"
    }
  },
  {
    "name": "Rompi Parasut Hoodie Vest Pria Windbreaker Water Ressistant Sporty",
    "price": 84300,
    "stock": 100,
    "image": "https://cf.shopee.co.id/file/5a2aa7403870fd2d2589317a03f6adcf",
    "description": "Detail barang\nResleting depan\nKantong samping resleting\nHoddie bahan fleece ( Tidak Bisa Dilepas)\nSaku dalam besar\n\nDetail Ukuran\nL : lingkar dada104cm x panjang 68 cm\nXL: lingkar dada106cm x panjang 70 cm\n",
    "shop": {
      "name": "ip.store",
      "city": "CIMAHI",
      "image": "https://cf.shopee.co.id/file/1e69426607e375c6b62ddc886867bb19_tn"
    }
  },
  {
    "name": "SEPATU PARRAMONDD",
    "price": 80000,
    "stock": 100,
    "image": "https://cf.shopee.co.id/file/2b8e5211a9c5ceb1e78d0f660debbe2c",
    "description": "KUALITAS di jamin OK????.!!\nLem + jahitan kuat & rapih dijamin bagus, awet dan nyaman di pakai.\nWarna/Model 100% REAL PICTURE Hasil FOTO SAYA Sendiri..\n\nUkuran sepatu pria :\n39 = 24.5 cm\n40 = 25 cm\n41 = 26 cm\n42 = 26.5 cm\n43 = 27.5 cm\n",
    "shop": {
      "name": "banda.aceh80",
      "city": "MOJOKERTO",
      "image": "https://cf.shopee.co.id/file/1e1ad5d7a788a2d5e177ed369689573a_tn"
    }
  },
  {
    "name": "TAS SELEMPANG HAOUSAI ( PROMO!!! BELI 1 TAS GRATIS 1 TAS )",
    "price": 99000,
    "stock": 100,
    "image": "https://cf.shopee.co.id/file/e8ec323d86a982f8bff7b4319b2a6a30",
    "description": "Warna / Hitam / Navy / Misty / Khaki\nBisa COD / Bayar Ditempat\nDesain Premium & Producst 100% ORIGINAL\nAnti Air / Waterproof\n3 Seleting + 1 Seleting Di Dalam\nJenis Bahan Pearl Film Composite\nDimensi Ukuran : 28 x 10 x 15 cm\nTas Multifungsi, Bisa DIpakai Dengan Tampilan Berbeda",
    "shop": {
      "name": "ngordershop",
      "city": "SLEMAN",
      "image": "https://cf.shopee.co.id/file/e4f45c9cadd6426e8de7fe44b7e67e0d_tn"
    }
  },
  {
    "name": "Jam Tangan Anti Air",
    "price": 185000,
    "stock": 100,
    "image": "https://cf.shopee.co.id/file/2a20b6da0bdb65bb60b391e42bd84ac9",
    "description": "Tali/Strap: Rubber/Karet\nDial Diameter: 4.9 cm\nFITUR:\n- DOUBLE TIME (dua waktu yang bisa di setting berbeda)\n- DATE\n- CHRONO / STOPWATCH\n- COUNTDOWN\n- ALARM\n- 12/24 HOUR CLOCK\n- EL BACKLIGHT (lampu)\n- 50M WATERPROOF\n",
    "shop": {
      "name": "defianstore",
      "city": "JAKARTA TIMUR",
      "image": "https://cf.shopee.co.id/file/af7ecbdef566aee465a5aa0376557c40_tnbagus sekali"
    }
  },
  {
    "name": "MASKER KAIN HIJAB ( HEADLOOP ) 3 PLY",
    "price": 11000,
    "stock": 100,
    "image": "https://cf.shopee.co.id/file/f3d8d1999f57d9938953d81703532d05",
    "description": "Ready...\nMasker Kain ( AWET bisa dicuci )\nBahan Katun halus (tidak berbulu )\n3 layer (Dijamin Nyaman)\nHEADLOOP / HIJAB ( dewasa )\n",
    "shop": {
      "name": "cenelea",
      "city": "JAKARTA BARAT",
      "image": "https://cf.shopee.co.id/file/8fe1ea1024e4bd6849b22e7af3eff221_tn"
    }
  },
  {
    "name": "Obeng Bolak Balik 6mm American Chome Plus Minus 21cm",
    "price": 6900,
    "stock": 100,
    "image": "https://cf.shopee.co.id/file/7b49a447ae7618012c1d7f181ca3e3ce",
    "description": "Obeng Bolak Balik American Chome\nSize 6mm Panjang 21cm\nKualitas bagus dan awet\nBarang baru sesuai gambar foto asli\n",
    "shop": {
      "name": "ledengmotor",
      "city": "BANDUNG",
      "image": "https://cf.shopee.co.id/file/609bf3c6cd2b92146f7c4e0f6426bb23_tn"
    }
  }
]
    """.trimIndent()

    val productData: ArrayList<Product>
        get() {
            val jsonData = JSONArray(jsonProducts)
            val products: ArrayList<Product> = arrayListOf()

            for (i in 0 until jsonData.length()) {
                val dataProduct = jsonData.getJSONObject(i)
                val dataShop = dataProduct.getJSONObject("shop")

                val shop: Shop = Shop(
                    name = dataShop.getString("name"),
                    city = dataShop.getString("city"),
                    image = dataShop.getString("image")
                )
                val product: Product = Product(
                    name = dataProduct.getString("name"),
                    price = dataProduct.getInt("price"),
                    image = dataProduct.getString("image"),
                    stock = dataProduct.getInt("stock"),
                    description = dataProduct.getString("description"),
                    shop = shop
                )
                products.add(product)
            }
            return products
        }
}