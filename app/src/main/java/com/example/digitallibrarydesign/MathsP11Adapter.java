package com.example.digitallibrarydesign;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MathsP11Adapter extends RecyclerView.Adapter<MathsP11Adapter.NotesViewHolder>{

        ArrayList<com.example.digitallibrarydesign.MathsP11> notesInfo;

public MathsP11Adapter(ArrayList<com.example.digitallibrarydesign.MathsP11> notesInfo) {
        this.notesInfo = notesInfo;
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

        com.example.digitallibrarydesign.MathsP11 currentNote = notesInfo.get(position);
        holder.infoText.setText(currentNote.getInfoText());
        holder.lecImg.setImageResource(currentNote.getLecImg());
        holder.zeroText1.setText(currentNote.getLecText());
        holder.vidImg.setImageResource(currentNote.getVidImg());
        holder.zeroText2.setText(currentNote.getVidText());
        holder.queImg.setImageResource(currentNote.getQueImg());
        holder.zeroText3.setText(currentNote.getQueText());
        }

@Override
public int getItemCount() {
        return notesInfo.size();
        }



public class NotesViewHolder extends RecyclerView.ViewHolder{
    ImageView lecImg,vidImg,queImg;
    TextView infoText,zeroText1,zeroText2,zeroText3;
    public NotesViewHolder(@NonNull View itemView) {
        super(itemView);
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
