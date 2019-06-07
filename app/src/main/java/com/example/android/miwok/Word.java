package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

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

    public boolean hasImage(){

        return mResourceId != NO_IMAGE_PROVIDED;
    }
}
