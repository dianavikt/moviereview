package ru.tinkoff.moviereview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null)
            showMovieListFragment() // отображение списка фильмов
    }

    // отображение списка фильмов
    private fun showMovieListFragment() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container, MovieListFragment())
            .commit()
    }
}