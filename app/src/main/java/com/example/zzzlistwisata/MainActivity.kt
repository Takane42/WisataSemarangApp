package com.example.zzzlistwisata

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val wisataList = listOf(
            wisataData(
                "Lawang Sewu",
                "Lawang Sewu adalah gedung bersejarah di Semarang yang dikenal dengan arsitektur kolonial Belanda dan julukan 'seribu pintu'. Dibangun pada tahun 1904 sebagai kantor Perusahaan Kereta Api Hindia Belanda, tempat ini menyimpan sejarah panjang, termasuk penggunaannya selama masa pendudukan Jepang pada Perang Dunia II. Selain keindahan arsitekturnya, Lawang Sewu terkenal dengan cerita-cerita mistis yang membuatnya semakin menarik bagi wisatawan. Gedung ini memiliki lorong-lorong panjang, menara tinggi, dan ruang bawah tanah yang kini menjadi bagian dari tur edukasi dan wisata budaya.",
                R.drawable.lawang_sewu
            ),
            wisataData(
                "Sam Poo Kong",
                "Sam Poo Kong adalah klenteng tertua di Semarang yang dibangun untuk menghormati Laksamana Cheng Ho, seorang pelaut Tiongkok dari abad ke-15. Tempat ini memiliki kompleks bangunan dengan arsitektur khas Tionghoa yang didominasi warna merah dan dihiasi ornamen unik. Selain menjadi tempat ibadah, Sam Poo Kong juga merupakan pusat budaya yang sering menjadi lokasi festival tradisional. Pengunjung dapat menikmati suasana damai sambil belajar sejarah tentang Cheng Ho dan perannya dalam hubungan budaya Indonesia-Tiongkok.",
                R.drawable.sam_poo_kong
            ),
            wisataData(
                "Kota Lama",
                "Kota Lama Semarang, dijuluki 'Little Netherlands', adalah kawasan bersejarah dengan bangunan kolonial Belanda yang masih terjaga. Tempat ini memiliki ikon seperti Gereja Blenduk, gudang-gudang tua, dan jalanan berbatu yang menciptakan suasana nostalgik. Saat ini, banyak bangunan di kawasan ini difungsikan sebagai kafe, galeri seni, dan pusat budaya. Berbagai festival dan acara seni sering diadakan di sini, menjadikannya lokasi favorit wisatawan untuk berjalan-jalan sekaligus menikmati warisan sejarah dan budaya.",
                R.drawable.kota_lama
            ),
            wisataData(
                "Pagoda Avalokitesvara",
                "Pagoda Avalokitesvara adalah tempat ibadah umat Buddha di Semarang yang terkenal dengan arsitektur megahnya. Pagoda setinggi tujuh tingkat ini dihiasi patung Avalokitesvara dan ornamen cantik yang menggambarkan ajaran welas asih Buddha. Dikelilingi taman hijau yang rimbun, tempat ini memberikan suasana damai bagi pengunjung. Pagoda ini juga menjadi simbol kerukunan antarumat beragama dan menarik wisatawan yang ingin mengeksplorasi keindahan budaya serta spiritualitas.",
                R.drawable.pagoda
            ),
            wisataData(
                "Masjid Agung Jawa Tengah",
                "Masjid Agung Jawa Tengah adalah salah satu ikon religi di Semarang dengan arsitektur yang memadukan gaya Islam, Jawa, dan kolonial. Diresmikan pada tahun 2006, masjid ini memiliki kubah besar yang megah, menara setinggi 99 meter, serta area pelataran yang luas untuk berbagai kegiatan. Masjid ini dilengkapi museum Islam dan taman yang indah, menjadikannya pusat aktivitas sosial, budaya, dan wisata religi. Pemandangan kota dari menara masjid adalah salah satu daya tarik utamanya.",
                R.drawable.majt
            ),
            wisataData(
                "Museum Ranggawarsita",
                "Museum Ranggawarsita adalah museum budaya yang menampilkan koleksi artefak sejarah, arkeologi, dan etnografi dari Jawa Tengah. Didirikan pada tahun 1975, museum ini menyimpan benda-benda bersejarah seperti perhiasan, senjata tradisional, serta alat musik yang mencerminkan kekayaan budaya Jawa. Museum ini juga menyediakan ruang edukasi bagi pengunjung yang ingin memahami perjalanan sejarah dan warisan budaya lokal.",
                R.drawable.museum
            ),
            wisataData(
                "Kampung Pelangi Semarang",
                "Kampung Pelangi adalah desa wisata di Semarang yang dikenal dengan dinding rumah-rumahnya yang dicat penuh warna dan dihiasi mural menarik. Dikembangkan pada tahun 2017, tempat ini menjadi destinasi favorit wisatawan yang mencari suasana ceria untuk berfoto. Selain keindahan visualnya, Kampung Pelangi juga menawarkan pengalaman budaya, seperti berinteraksi dengan warga lokal yang kreatif dan menikmati suasana kampung yang hangat.",
                R.drawable.kampung
            ),
            wisataData(
                "Pantai Marina",
                "Pantai Marina adalah destinasi wisata pantai di Semarang yang menawarkan pemandangan alam indah dan suasana yang menenangkan. Dengan pasir putih yang lembut dan ombak yang tenang, pantai ini cocok untuk berenang, bermain air, atau sekadar bersantai menikmati angin laut. Pantai ini dilengkapi fasilitas seperti area bermain, gazebo, dan restoran yang menyajikan makanan laut segar. Matahari terbenam di Pantai Marina adalah momen yang tak boleh dilewatkan.",
                R.drawable.marina
            ),
            wisataData(
                "Brown Canyon Semarang",
                "Brown Canyon adalah lokasi wisata alam yang menawarkan pemandangan tebing-tebing tinggi berwarna cokelat yang terbentuk dari aktivitas pertambangan. Tempat ini memiliki panorama unik dan menjadi favorit bagi para pecinta fotografi serta wisatawan yang mencari suasana alam yang eksotis. Latar belakang langit biru dan formasi batuan yang dramatis menciptakan pengalaman yang memukau bagi pengunjung.",
                R.drawable.brown_canyon
            ),
            wisataData(
                "Candi Gedong Songo",
                "Candi Gedong Songo adalah kompleks candi Hindu yang terletak di lereng Gunung Ungaran. Dibangun pada abad ke-9, candi ini menawarkan pemandangan alam yang memukau dan suasana spiritual yang damai. Setiap candi memiliki keunikan tersendiri, dikelilingi oleh hutan pinus dan kebun teh. Pengunjung dapat menikmati trekking yang menyenangkan sambil mengeksplorasi sejarah dan keindahan budaya Hindu kuno.",
                R.drawable.gedong_songo
            ),
        ).shuffled()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerViewWisata)
        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = wisataAdapter(wisataList) { selectedWisata ->
            val intent = Intent(this, DetailActivity::class.java).apply {
                putExtra("title", selectedWisata.title)
                putExtra("description", selectedWisata.description)
                putExtra("imageResId", selectedWisata.imageResId)
            }
            startActivity(intent)
        }

    }
}