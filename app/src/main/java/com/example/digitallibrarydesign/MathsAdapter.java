package com.example.digitallibrarydesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MathsAdapter extends RecyclerView.Adapter<MathsAdapter.NotesViewHolder>{

    ArrayList<MathsCard> notesInfo;
    Context context;


    public MathsAdapter(ArrayList<MathsCard> mathsCards,Context context) {
        this.notesInfo=mathsCards;
        this.context=context;
    }

    @NonNull
    @Override
    public NotesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.carddesign,parent,false);
        NotesViewHolder nvh = new NotesViewHolder(view);

        return nvh;
    }

    @Override
    public void onBindViewHolder(@NonNull NotesViewHolder holder, int position) {

        MathsCard currentNote = notesInfo.get(position);
        holder.chapterText.setText(currentNote.getChapterText());
        holder.topicText.setText(currentNote.getTopicText());
        holder.infoText.setText(currentNote.getInfoText());
        holder.lecImg.setImageResource(currentNote.getLecImg());
        holder.zeroText1.setText(currentNote.getLecText());
        holder.vidImg.setImageResource(currentNote.getVidImg());
        holder.zeroText2.setText(currentNote.getVidText());
        holder.queImg.setImageResource(currentNote.getQueImg());
        holder.zeroText3.setText(currentNote.getQueText());
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                AlertDialog.Builder alertDialogBuilder;
//                AlertDialog alertDialog;
//                alertDialogBuilder = new AlertDialog.Builder(context);
//                View view1=View.inflate(context,R.layout.cardpage5,null);
//                view1.setClipToOutline(true);
//                alertDialogBuilder.setView(view1);
//                alertDialog = alertDialogBuilder.create();
//                alertDialog.show();
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return notesInfo.size();
    }



    public class NotesViewHolder extends RecyclerView.ViewHolder{
        ImageView lecImg,vidImg,queImg;
        TextView chapterText,topicText,infoText,zeroText1,zeroText2,zeroText3;
        CardView cardView;
        public NotesViewHolder(@NonNull View itemView) {
            super(itemView);
            chapterText=itemView.findViewById(R.id.chapterText);
            topicText=itemView.findViewById(R.id.topicText);
            infoText=itemView.findViewById(R.id.infoText);
            lecImg=itemView.findViewById(R.id.lectureImage);
            zeroText1=itemView.findViewById(R.id.zeroText1);
            vidImg=itemView.findViewById(R.id.videoImage);
            zeroText2=itemView.findViewById(R.id.zeroText2);
            queImg=itemView.findViewById(R.id.queImage);
            zeroText3=itemView.findViewById(R.id.zeroText3);

        }
    }

}
