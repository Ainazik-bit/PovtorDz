package com.example.povtordz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MainAdapter mainAdapter;
    private ArrayList<String> list;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createList();
        initRecycler();
        imageView = findViewById(R.id.image_view);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), SettingActivity2.class));
            }
        });

    }

    private void initRecycler() {
        recyclerView = findViewById(R.id.recycler_view);
        mainAdapter = new MainAdapter();
        mainAdapter.addList(list);
        recyclerView.setAdapter(mainAdapter);
    }

    private void createList() {
        list = new ArrayList<>();
        list.add("Айназик");
        list.add("Орозбек");
        list.add("Нурсултан");
        list.add("Бакай");
        list.add("Мээрим");
        list.add("Айпери");
        list.add("Махабат");
        list.add("Назар");
        list.add("Айдана");
        list.add("Атай");
        list.add("Асель");
        list.add("Чынгыз");
        list.add("Нургазы");
        list.add("Айдар");
        list.add("Адель");
        list.add("Салтанат");
        list.add("Айтпай");
        list.add("Кенеш");
        list.add("Миргуля");
    }
}