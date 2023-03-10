package co.gabriel.rickyandmorty.presentation

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import co.gabriel.rickyandmorty.R
import co.gabriel.rickyandmorty.databinding.ActivityMainBinding
import co.gabriel.rickyandmorty.presentation.character_list.CharacterListFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}