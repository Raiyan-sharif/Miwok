package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;

    }

    //returns default translation

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //returns miwok Translation
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
