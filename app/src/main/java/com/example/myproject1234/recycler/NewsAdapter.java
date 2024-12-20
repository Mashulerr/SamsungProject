package com.example.myproject1234.recycler;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myproject1234.databinding.ItemNewsBinding;
import com.example.myproject1234.domain.News;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsViewHolder>{

    private List<News> newsList;

    private NewsClickListener clickListener;

    public NewsAdapter(List<News> newsList, NewsClickListener clickListener) {
        this.newsList = newsList;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemNewsBinding binding = ItemNewsBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new NewsViewHolder(binding, clickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        holder.bind(newsList.get(position));
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }
}
