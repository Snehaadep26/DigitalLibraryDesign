package com.example.digitallibrarydesign;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    androidx.appcompat.widget.Toolbar customToolbar;
    com.example.digitallibrarydesign.MathsP11Adapter mathsAdapter1;
    com.example.digitallibrarydesign.MathsP11Adapter mathsAdapter2;
    com.example.digitallibrarydesign.MathsP11Adapter mathsAdapter3;
    com.example.digitallibrarydesign.MathsP11Adapter mathsAdapter4;
    com.example.digitallibrarydesign.MathsP11Adapter mathsAdapter5;
    ArrayList<MathsP11> mathsCards;
    RecyclerView recyclerView1,recyclerView2,recyclerView3,recyclerView4,recyclerView5;
    RecyclerView.LayoutManager layoutManager1,layoutManager2,layoutManager3,layoutManager4,layoutManager5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        customToolbar = findViewById(R.id.customToolbar);
        setSupportActionBar(customToolbar);
        createCard();
        buildRecyclerView1();

        createCard1();
        buildRecyclerView2();

        createCard2();
        buildRecyclerView3();






    }
    public void createCard(){

        mathsCards = new ArrayList<>();

        mathsCards.add(new com.example.digitallibrarydesign.MathsP11("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed d…","0","0","0",R.drawable.notes,R.drawable.video,R.drawable.quebank));
        mathsCards.add(new com.example.digitallibrarydesign.MathsP11("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed d…","0","0","0",R.drawable.notes,R.drawable.video,R.drawable.quebank));
    }

    public void buildRecyclerView1(){

        recyclerView1 = findViewById(R.id.recy1);
        recyclerView1.setHasFixedSize(true);
        layoutManager1 = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView1.setLayoutManager(layoutManager1);
        mathsAdapter1 = new com.example.digitallibrarydesign.MathsP11Adapter(mathsCards);
        recyclerView1.setAdapter(mathsAdapter1);

    }

    public void createCard1(){

        mathsCards = new ArrayList<>();

        mathsCards.add(new com.example.digitallibrarydesign.MathsP11("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed d…","0","0","0",R.drawable.notes,R.drawable.video,R.drawable.quebank));
        mathsCards.add(new com.example.digitallibrarydesign.MathsP11("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed d…","0","0","0",R.drawable.notes,R.drawable.video,R.drawable.quebank));
    }

    public void buildRecyclerView2(){
        recyclerView2 = findViewById(R.id.recy2);
        recyclerView2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView2.setLayoutManager(layoutManager2);
        mathsAdapter2 = new com.example.digitallibrarydesign.MathsP11Adapter(mathsCards);
        recyclerView2.setAdapter(mathsAdapter2);

    }

    public void createCard2(){

        mathsCards = new ArrayList<>();

        mathsCards.add(new com.example.digitallibrarydesign.MathsP11("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed d…","0","0","0",R.drawable.notes,R.drawable.video,R.drawable.quebank));
        mathsCards.add(new com.example.digitallibrarydesign.MathsP11("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed d…","0","0","0",R.drawable.notes,R.drawable.video,R.drawable.quebank));
    }
    public void buildRecyclerView3(){

        recyclerView3 = findViewById(R.id.recy3);
        recyclerView3.setHasFixedSize(true);
        layoutManager3 = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView3.setLayoutManager(layoutManager3);
        mathsAdapter3 = new com.example.digitallibrarydesign.MathsP11Adapter(mathsCards);
        recyclerView3.setAdapter(mathsAdapter3);

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


}