package com.example.myproject1234;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myproject1234.databinding.ActivityMainBinding;
import com.example.myproject1234.domain.New;
import com.example.myproject1234.recycler.NewAdapter;
import com.example.myproject1234.recycler.NewClickListener;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private List<New> news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        NewAdapter newAdapter = new NewAdapter(news, new NewClickListener() {
            @Override
            public void onClick(New new_item) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("item_title", new_item.getTitle());
                startActivity(intent);
            }
        });
        binding.rvNews.setAdapter(newAdapter);

    }

    private void initNews() {
        // TO DO: init news
    }
}