package com.myroniak.motionLayout

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.myroniak.motionLayout.adapter.CardsAdapter
import com.myroniak.motionLayout.databinding.ActivityMainBinding
import com.myroniak.motionLayout.fragment.CardFragment
import com.myroniak.motionLayout.model.Item

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = listOf(
            Item("Title 0", "Description 0"),
            Item("Title 1", "Description 1"),
            Item("Title 2", "Description 2"),
            Item("Title 3", "Description 3"),
            Item("Title 4", "Description 4"),
            Item("Title 5", "Description 5"),
            Item("Title 6", "Description 6"),
            Item("Title 7", "Description 7"),
            Item("Title 8", "Description 8"),
            Item("Title 9", "Description 9"),
        )

        //Test version v1.1

        val adapter = CardsAdapter(list) {
            supportFragmentManager.beginTransaction().add(R.id.container, CardFragment(it))
                .commit()
        }

        binding.recyclerView.adapter = adapter
    }
}