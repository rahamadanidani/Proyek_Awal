package id.rahma.wisatasumbar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import id.rahma.wisatasumbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // menampilkan layout activity_main
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // ketika tombolLogin di klik , panggil fungsi login
        binding.tombolLogin.setOnClickListener { login() }
    }

    private fun login() {
        // mengambil data dari inputan menjadi string
        val txtNama = binding.teksPengguna.text.toString()
        val txtPassword = binding.teksPassword.text.toString()


        // cek data inputan apakah kosong
        if (txtNama.isEmpty() || txtPassword.isEmpty()) {
            Toast.makeText(this, "Mohon masukkan nama dan password", Toast.LENGTH_SHORT).show()
            return
        }

        // cek apakah isian sesuai
        if (txtPassword == "123456" && txtNama == "Rahmadani") {
           //membuat intent ke ProfilWisataActivity
            val intent = Intent(this, ProfilWisataActivity::class.java)

            //mengirimkan data txtNama ke itent
            intent.putExtra("txtNama", binding.teksPengguna.text.toString())

            //mulai aktivi intent
            startActivity(intent)
            //akiri aktivity ini
            finish()


        } else {
            Toast.makeText(this, "Nama atau password salah.", Toast.LENGTH_SHORT).show()
            return
        }
    }
}