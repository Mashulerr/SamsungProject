package com.example.myproject1234.recycler;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myproject1234.databinding.ItemNewBinding;
import com.example.myproject1234.domain.New;

import java.util.List;

public class NewAdapter extends RecyclerView.Adapter<NewViewHolder>{

    private List<New> newList;

    private NewClickListener clickListener;

    public NewAdapter(List<New> newList, NewClickListener clickListener) {
        this.newList = newList;
        this.clickListener = clickListener;
    }

    @NonNull
    @Override
    public NewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemNewBinding binding = ItemNewBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new NewViewHolder(binding, clickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull NewViewHolder holder, int position) {
        holder.bind(newList.get(position));
    }

    @Override
    public int getItemCount() {
        return newList.size();
    }
}
