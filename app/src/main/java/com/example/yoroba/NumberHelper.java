package com.example.yoroba;

public class NumberHelper {

    private String languageYoroba;

    private String languageEnglish;

    private int lImageid;

    public NumberHelper(String ly, String le, int li){
        languageYoroba=ly;
        languageEnglish=le;
        lImageid=li;

    }
    public int getImageid(){
        return lImageid;
    }
    public String getLanguageEnglish(){
        return languageEnglish;
    }
    public String getLanguageYoroba(){
        return languageYoroba;
    }

}
