package com.example.digitallibrarydesign;

public class SubjectsCard {
    int imageSub,imgLec,imgVid,imgQue;
    String textLec,textVid,textQue;
    String subject,chapters;

    public SubjectsCard(int imageSub, int imgLec, int imgVid, int imgQue, String textLec, String textVid, String textQue, String subject, String chapters) {
        this.imageSub = imageSub;
        this.imgLec = imgLec;
        this.imgVid = imgVid;
        this.imgQue = imgQue;
        this.textLec = textLec;
        this.textVid = textVid;
        this.textQue = textQue;
        this.subject = subject;
        this.chapters = chapters;
    }

    public int getImageSub() {
        return imageSub;
    }

    public int getImgLec() {
        return imgLec;
    }

    public int getImgVid() {
        return imgVid;
    }

    public int getImgQue() {
        return imgQue;
    }

    public String getTextLec() {
        return textLec;
    }

    public String getTextVid() {
        return textVid;
    }

    public String getTextQue() {
        return textQue;
    }

    public String getSubject() {
        return subject;
    }

    public String getChapters() {
        return chapters;
    }
}
