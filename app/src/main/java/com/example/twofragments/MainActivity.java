package com.example.twofragments;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonScrollView;
    private Button buttonRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonScrollView = findViewById(R.id.button_scroll_view);
        buttonRecyclerView = findViewById(R.id.button_recycler_view);

        // Первоначально загружаем ScrollViewFragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new ScrollViewFragment())
                .commit();

        // Обработчик для ScrollViewFragment
        buttonScrollView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, new ScrollViewFragment())
                        .commit();
            }
        });

        // Обработчик для RecyclerViewFragment
        buttonRecyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, new RecyclerViewFragment())
                        .commit();
            }
        });
    }
}