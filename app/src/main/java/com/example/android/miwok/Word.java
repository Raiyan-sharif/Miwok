package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mAudioResourceId;

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;


    }

    public Word(String defaultTranslation, String miwokTranslation,int resourceId,int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mResourceId = resourceId;
        mAudioResourceId = audioResourceId;

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

    public int getAudioResourceId(){
        return mAudioResourceId;
    }
}
