package com.example.digitallibrarydesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivityP3 extends AppCompatActivity {
    ArrayList<SubjectsCard> subjectCard;
    SubjectsAdapter subjectsAdapter;

    Toolbar customToolbar;
    CardView cardView;
    RecyclerView recyclerView1,recyclerView2;
    RecyclerView.LayoutManager layoutManager1,layoutManager2;
    SubjectsAdapter adapter1,adapter2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        customToolbar = findViewById(R.id.customToolbar);
        setSupportActionBar(customToolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        createCard();
        buildRecyclerView();

        createCard1();
        buildRecyclerView1();
//        cardView=(CardView) findViewById(R.id.cardForPage);
//
//
//        cardView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent=new Intent(MainActivity.this,Activity2.class);
//                startActivity(intent);
//            }
//        });


    }

    public void createCard1() {
        subjectCard=new ArrayList<>();
        subjectCard.add(new SubjectsCard(R.drawable.compscic2,R.drawable.notes,R.drawable.video,R.drawable.quebank,"0","0","0","Computer Science","12 Chapters"));
        subjectCard.add(new SubjectsCard(R.drawable.botanyc4,R.drawable.notes,R.drawable.video,R.drawable.quebank,"0","0","0","Botany","12 Chapters"));
        subjectCard.add(new SubjectsCard(R.drawable.accountancyc6,R.drawable.notes,R.drawable.video,R.drawable.quebank,"0","0","0","Accountancy","12 Chapters"));


}
    public void createCard() {
        subjectCard=new ArrayList<>();
        subjectCard.add(new SubjectsCard(R.drawable.mathsc1,R.drawable.notes,R.drawable.video,R.drawable.quebank,"0","0","0","Mathematics ","12 Chapters"));
        subjectCard.add(new SubjectsCard(R.drawable.geographyc3,R.drawable.notes,R.drawable.video,R.drawable.quebank,"0","0","0","Geography","12 Chapters"));
        subjectCard.add(new SubjectsCard(R.drawable.businessstudc5,R.drawable.notes,R.drawable.video,R.drawable.quebank,"0","0","0","Business Studies","12 Chapters"));


    }


    public void buildRecyclerView() {

        recyclerView1 = findViewById(R.id.recyler1);
        recyclerView1.setHasFixedSize(true);
        layoutManager1 = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView1.setLayoutManager(layoutManager1);
        subjectsAdapter = new SubjectsAdapter(subjectCard, MainActivityP3.this);
        recyclerView1.setAdapter(subjectsAdapter);
    }
    public void buildRecyclerView1() {

        recyclerView2 = findViewById(R.id.recyler3);
        recyclerView2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView2.setLayoutManager(layoutManager2);
        subjectsAdapter = new SubjectsAdapter(subjectCard, MainActivityP3.this);
        recyclerView2.setAdapter(subjectsAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }


}