package com.example.simplerecyclermoviedatabinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.simplerecyclermoviedatabinding.databinding.ItemMovieBinding;

import java.util.List;

class MovieAdapter  extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder>{

    private List<Movie> mMovieList;

    public MovieAdapter(List<Movie> movieList) {
        this.mMovieList = movieList;
    }

    @NonNull
    @Override
    public MovieAdapter.MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ItemMovieBinding itemBinding = ItemMovieBinding.inflate(layoutInflater, parent, false);
        return new MovieViewHolder(itemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.MovieViewHolder holder, int position) {
        Movie movie = mMovieList.get(position);
        holder.bind(movie);
    }

    @Override
    public int getItemCount() {
        return mMovieList.size();
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder {
        // If your layout file is something_awesome.xml then your binding class will be SomethingAwesomeBinding
        // Since our layout file is item_movie.xml, our auto generated binding class is ItemMovieBinding
        private ItemMovieBinding binding;

        //Define a constructor taking a ItemMovieBinding as its parameter


        public MovieViewHolder(ItemMovieBinding itemBinding) {
            super(itemBinding.getRoot());
            this.binding = itemBinding;
        }

        /**
         * We will use this function to bind instance of Movie to the row
         */
        public void bind(Movie movie) {
            binding.setMovie(movie);
            binding.executePendingBindings();
        }
    }
}
