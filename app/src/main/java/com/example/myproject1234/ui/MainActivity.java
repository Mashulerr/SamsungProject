package com.example.myproject1234.ui;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myproject1234.databinding.ActivityMainBinding;
import com.example.myproject1234.domain.News;
import com.example.myproject1234.recycler.NewsAdapter;
import com.example.myproject1234.recycler.NewsClickListener;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    private List<News> news;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        NewsAdapter newsAdapter = new NewsAdapter(news, new NewsClickListener() {
            @Override
            public void onClick(News news_item) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("item_id", news_item.getId());
                startActivity(intent);
            }
        });
        binding.rvNews.setAdapter(newsAdapter);

    }

    private void initNews() {
        // TO DO: init news
    }
}