package com.example.digitallibrarydesign;

public class MathsCard {

    String chapterText,topicText,infoText,lecText,vidText,queText;
    int lecImg,vidImg,queImg;

    public MathsCard(String chapterText, String topicText, String infoText, String lecText, String vidText, String queText, int lecImg, int vidImg, int queImg) {
        this.chapterText = chapterText;
        this.topicText = topicText;
        this.infoText = infoText;
        this.lecText = lecText;
        this.vidText = vidText;
        this.queText = queText;
        this.lecImg = lecImg;
        this.vidImg = vidImg;
        this.queImg = queImg;
    }

    public String getChapterText() {
        return chapterText;
    }

    public String getTopicText() {
        return topicText;
    }

    public String getInfoText() {
        return infoText;
    }

    public String getLecText() {
        return lecText;
    }

    public String getVidText() {
        return vidText;
    }

    public String getQueText() {
        return queText;
    }

    public int getLecImg() {
        return lecImg;
    }

    public int getVidImg() {
        return vidImg;
    }

    public int getQueImg() {
        return queImg;
    }
}
