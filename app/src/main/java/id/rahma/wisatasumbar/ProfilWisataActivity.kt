package id.rahma.wisatasumbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.rahma.wisatasumbar.databinding.ActivityProfilWisataBinding

class ProfilWisataActivity : AppCompatActivity() {
    lateinit var binding: ActivityProfilWisataBinding
    var namaPengguna = ""

    companion object {
        const val PENGGUNA = "txtNama"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityProfilWisataBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //mengambil data dari intens sebelumnya
        namaPengguna = intent?.extras?.getString(PENGGUNA).toString()
        //set title app
        title = "Daftar Wisata"

        // ketika btnBack di klik , panggil fungsi backHome()
        binding.btnBack.setOnClickListener {
            backHome()
        }

        // ketika btnBack di klik , panggil fungsi  goProfile(namaPengguna)
        binding.btnProfil.setOnClickListener {
            goProfile(namaPengguna)
        }


    }

    private fun backHome(){
        //membuat intent ke MainActivity
        val intentHome = Intent(this,MainActivity::class.java)
        //mulai aktivi intentHome
        startActivity(intentHome)
    }
    private fun goProfile(nama : String){
        //membuat intent ke ProfilePengguna
        val intent = Intent(this,ProfilePengguna::class.java)
        //mengirimkan data nama ke intent
        intent.putExtra( "nama",nama)
        //mulai aktivi intent
        startActivity(intent)
    }
}