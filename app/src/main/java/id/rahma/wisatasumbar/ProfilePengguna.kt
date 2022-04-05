package id.rahma.wisatasumbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.rahma.wisatasumbar.databinding.ActivityProfileBinding

class ProfilePengguna : AppCompatActivity() {

    var namaPengguna = ""

    companion object {
        const val PENGGUNA = "nama"
    }

    lateinit var binding : ActivityProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //mengambil data dari intens sebelumnya
        namaPengguna = intent?.extras?.getString(PENGGUNA).toString()
        //tampilkan pada nama nama pengguna
        binding.nama.text = namaPengguna
        }
    }