package com.example.digitallibrarydesign;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SubjectsAdapter extends RecyclerView.Adapter<SubjectsAdapter.CardViewHolder> {

        ArrayList<SubjectsCard> returned;
        Context context;

        public SubjectsAdapter(ArrayList<SubjectsCard> returned,Context context) {
            this.returned = returned;
            this.context = context;
        }


    @NonNull
        @Override
        public SubjectsAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card1,parent,false);
            CardViewHolder cvh = new CardViewHolder(view);
            return cvh;
        }

        @Override
        public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
            SubjectsCard currentCards = this.returned.get(position);
            holder.imageSub.setImageResource(currentCards.getImageSub());
            holder.imgLec.setImageResource(currentCards.getImgLec());
            holder.imgVid.setImageResource(currentCards.getImgVid());
            holder.imgQue.setImageResource(currentCards.getImgQue());
            holder.textLec.setText(currentCards.getTextLec());
            holder.textVid.setText(currentCards.getTextVid());
            holder.textQue.setText(currentCards.getTextQue());
            holder.subject.setText(currentCards.getSubject());
            holder.chapters.setText(currentCards.getChapters());
            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(context, Activity2.class);
                    context.startActivity(intent);


                    Toast.makeText(context, "Dues", Toast.LENGTH_SHORT).show();

//
                }
            });
        }

        @Override
        public int getItemCount() {
            return returned.size();
        }

        public class CardViewHolder extends RecyclerView.ViewHolder {

           ImageView imageSub,imgLec,imgVid,imgQue;
           TextView textLec,textVid,textQue;
           TextView  subject,chapters;




            public CardViewHolder(@NonNull View itemView) {
                super(itemView);
                imageSub=itemView.findViewById(R.id.imageViewIn);
                imgLec=itemView.findViewById(R.id.lectureImage);
                imgVid=itemView.findViewById(R.id.videoImage);
                imgQue=itemView.findViewById(R.id.queImage);
                textLec=itemView.findViewById(R.id.zeroText1);
                textVid=itemView.findViewById(R.id.zeroText2);
                textQue=itemView.findViewById(R.id.zeroText3);
                subject=itemView.findViewById(R.id.subjectInText);
                chapters=itemView.findViewById(R.id.chapterText);
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(context,Activity2.class);
                        context.startActivity(intent);
                    }
                });

            }
        }
    }





