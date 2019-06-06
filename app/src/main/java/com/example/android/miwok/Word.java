package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mResourceId;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;


    }

    public Word(String defaultTranslation, String miwokTranslation, int resourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mResourceId = resourceId;

    }

    //returns default translation

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //returns miwok Translation
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getResourceId(){ return  mResourceId; }
}
