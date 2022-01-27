package com.example.digitallibrarydesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;

import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;

public class Activity2 extends AppCompatActivity implements View.OnClickListener {


    androidx.appcompat.widget.Toolbar customToolbar;
    MathsAdapter mathsAdapter1;
    MathsAdapter mathsAdapter2;
    MathsAdapter mathsAdapter3;
    MathsAdapter mathsAdapter4;
    MathsAdapter mathsAdapter5;
    ArrayList<MathsCard> mathsCards;
    CardView recyclerView;
    RecyclerView recyclerView1,recyclerView2,recyclerView3,recyclerView4,recyclerView5;
    RecyclerView.LayoutManager layoutManager1,layoutManager2,layoutManager3,layoutManager4,layoutManager5;
    Context context;
    BottomSheetDialog bottomSheetDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card2);
        customToolbar = findViewById(R.id.customToolbar);
        setSupportActionBar(customToolbar);
        createCard();
        buildRecyclerView1();

        createCard1();
        buildRecyclerView2();

        createCard2();
        buildRecyclerView3();

        // createCard3();
        buildRecyclerView4();
        //createCard4();
        buildRecyclerView5();

        customToolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetDialog = new BottomSheetDialog(Activity2.this, R.style.BottomSheetTheme);
                View sheetView = LayoutInflater.from(getApplicationContext()).inflate(R.layout.cardpage5, null);

                sheetView.findViewById(R.id.share).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                    }
                });
                bottomSheetDialog.setContentView(sheetView);
                bottomSheetDialog.show();
            }

        });


    }
//        @Override
//        public void onClick(View view) {
//        AlertDialog.Builder alertDialogBuilder;
//        AlertDialog alertDialog;
//        alertDialogBuilder = new AlertDialog.Builder(context);
//        View view1=View.inflate(context,R.layout.cardpage5,null);
//        view1.setClipToOutline(true);
//        alertDialogBuilder.setView(view1);
//        alertDialog = alertDialogBuilder.create();
//        alertDialog.show();
//    }

//            recyclerView=findViewById(R.id.cardDesign);
//            recyclerView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    Intent intent=new Intent(getApplicationContext(),MainActivity2.class);
//                    startActivity(intent);
//                }
//            });
//            recyclerView=findViewById(R.id.cardDesign);
//            recyclerView.setOnClickListener((View.OnClickListener) this);






    public void createCard(){

        mathsCards = new ArrayList<>();

        mathsCards.add(new MathsCard("Chapter 1","0 Topic","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed d…","0","0","0",R.drawable.notes,R.drawable.video,R.drawable.quebank));
        mathsCards.add(new MathsCard("Chapter 2","6 Topic","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed d…","4","1","1",R.drawable.notes,R.drawable.video,R.drawable.quebank));
    }

    public void buildRecyclerView1(){

        recyclerView1 = findViewById(R.id.recy1);
        recyclerView1.setHasFixedSize(true);
        layoutManager1 = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView1.setLayoutManager(layoutManager1);
        mathsAdapter1 = new MathsAdapter(mathsCards,context);
        recyclerView1.setAdapter(mathsAdapter1);

    }

    public void createCard1(){

        mathsCards = new ArrayList<>();

        mathsCards.add(new MathsCard("Chapter 1","0 Topic","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed d…","0","0","0",R.drawable.notes,R.drawable.video,R.drawable.quebank));
        mathsCards.add(new MathsCard("Chapter 2","6 Topic","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed d…","0","0","0",R.drawable.notes,R.drawable.video,R.drawable.quebank));
    }

    public void buildRecyclerView2(){
        recyclerView2 = findViewById(R.id.recy2);
        recyclerView2.setHasFixedSize(true);
        layoutManager2 = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView2.setLayoutManager(layoutManager2);
        mathsAdapter2 = new MathsAdapter(mathsCards,context);
        recyclerView2.setAdapter(mathsAdapter2);

    }

    public void createCard2(){

        mathsCards = new ArrayList<>();

        mathsCards.add(new MathsCard("Chapter 1","0 Topic","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed d…","24","67","431",R.drawable.notes,R.drawable.video,R.drawable.quebank));
        mathsCards.add(new MathsCard("Chapter 2","6 Topic","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed d…","0","0","0",R.drawable.notes,R.drawable.video,R.drawable.quebank));
    }
    public void buildRecyclerView3(){

        recyclerView3 = findViewById(R.id.recy3);
        recyclerView3.setHasFixedSize(true);
        layoutManager3 = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView3.setLayoutManager(layoutManager3);
        mathsAdapter3 = new MathsAdapter(mathsCards,context);
        recyclerView3.setAdapter(mathsAdapter3);

    }

//        public void createCard3(){
//
//        mathsCards = new ArrayList<>();
//
//            mathsCards.add(new MathsCard("Chapter 1","0 Topic","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed d…","0","0","0",R.drawable.notes,R.drawable.video,R.drawable.quebank));
//            mathsCards.add(new MathsCard("Chapter 2","6 Topic","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed d…","0","0","0",R.drawable.notes,R.drawable.video,R.drawable.quebank));
//    }

    public void buildRecyclerView4(){

        recyclerView4 = findViewById(R.id.recy4);
        recyclerView4.setHasFixedSize(true);
        layoutManager4 = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView4.setLayoutManager(layoutManager4);
        mathsAdapter4 = new MathsAdapter(mathsCards,context);
        recyclerView4.setAdapter(mathsAdapter4);

    }
//    public void createCard4(){
//
//        mathsCards = new ArrayList<>();
//
//        mathsCards.add(new MathsCard("Chapter 1","6 Topic","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed d…","0","0","0",R.drawable.notes,R.drawable.video,R.drawable.quebank));
//        mathsCards.add(new MathsCard("Chapter 1","6 Topic","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed d…","0","0","0",R.drawable.notes,R.drawable.video,R.drawable.quebank));
//    }

    public void buildRecyclerView5(){

        recyclerView5 = findViewById(R.id.recy5);
        recyclerView5.setHasFixedSize(true);
        layoutManager5 = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView5.setLayoutManager(layoutManager5);
        mathsAdapter5 = new MathsAdapter(mathsCards,context);
        recyclerView5.setAdapter(mathsAdapter5);

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    public void onClick(View view) {
        Intent intent=new Intent(context, MainActivity2.class);
        context.startActivity(intent);

    }
}