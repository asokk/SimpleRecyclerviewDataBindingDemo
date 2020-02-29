package com.example.simplerecyclermoviedatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.simplerecyclermoviedatabinding.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

         binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        setupRecyclerView();
    }

    private void setupRecyclerView() {
        RecyclerView recyclerView = binding.rvMovieList; // In xml we have given id rv_movie_list to RecyclerView
        LinearLayoutManager layoutManager = new LinearLayoutManager(this); // you can use getContext() instead of "this"
        recyclerView.setLayoutManager(layoutManager);

        List<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("CHENNAI EXPRESS", "LOVE STORY"));
        movieList.add(new Movie("BORDER", "PATRIOTRIC"));
        movieList.add(new Movie("SINGHAM", "ACTION"));
        movieList.add(new Movie("GARAM MASALA", "COMEDY"));
        // ...
        MovieAdapter adapter = new MovieAdapter(movieList);
        recyclerView.setAdapter(adapter);
    }
}
