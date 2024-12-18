package com.example.myproject1234.recycler;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myproject1234.databinding.ItemNewBinding;
import com.example.myproject1234.domain.New;

public class NewViewHolder extends RecyclerView.ViewHolder {

    private ItemNewBinding binding;
    private NewClickListener clickListener;

    public NewViewHolder(ItemNewBinding binding, NewClickListener clickListener) {
        super(binding.getRoot());
        this.binding = binding;
        this.clickListener = clickListener;
    }

    public void bind(New item) {
        binding.tvId.setText(item.getId());
        binding.tvTitle.setText(item.getTitle());
        binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickListener.onClick(item);
            }
        });

    }
}
