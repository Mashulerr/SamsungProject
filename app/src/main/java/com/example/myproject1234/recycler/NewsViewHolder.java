package com.example.myproject1234.recycler;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;


import com.example.myproject1234.databinding.ItemNewsBinding;
import com.example.myproject1234.domain.News;

public class NewsViewHolder extends RecyclerView.ViewHolder {

    private ItemNewsBinding binding;
    private NewsClickListener clickListener;

    public NewsViewHolder(ItemNewsBinding binding, NewsClickListener clickListener) {
        super(binding.getRoot());
        this.binding = binding;
        this.clickListener = clickListener;
    }

    public void bind(News item) {
        binding.tvId.setText(String.valueOf(item.getId()));
        binding.tvTitle.setText(item.getTitle());
        binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickListener.onClick(item);
            }
        });

    }
}
