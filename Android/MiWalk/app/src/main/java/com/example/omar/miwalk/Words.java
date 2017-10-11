package com.example.omar.miwalk;

/**
 * Created by omar on 04/10/17.
 */

public class Words {

    private String engword;
    private  String miword;
private int image;
    private int audio;



    Words(String s1,String s2,int audio){

        engword=s1;
        this.audio=audio;
        miword=s2;
    }

    Words(String s1,String s2, int image,int audio){

        engword=s1;
        this.audio=audio;
        miword=s2;
        this.image=image;
    }

    public String getEngword() {
        return engword;
    }

    public String getMiword() {
        return miword;
    }

    public int getImage() {
        return image;
    }

    public int getAudio() {
        return audio;
    }
}
