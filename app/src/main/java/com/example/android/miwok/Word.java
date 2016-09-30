package com.example.android.miwok;

import android.content.Context;

/**
 * Created by dguti on 9/18/2016.
 */
public class Word {

    private String mMiwokTranslation;

    private String mDefaultTranslation;

    private int mResourceID = NO_IMAGE;

    private static final int  NO_IMAGE = -1;

    private int mAudioSourceID;

    public  Word (String defaultTranslation, String miwokTranslation){
        mMiwokTranslation = defaultTranslation;
        mDefaultTranslation = miwokTranslation;
    }

    public Word (String mMiwokTranslation, String mDefaultTranslation, int resourceID, int audioSourceID) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mResourceID = resourceID;
        this.mAudioSourceID = audioSourceID;
    }

    //    public void setmMiwokTranslation(String miwok){
//        mMiwokTranslation =miwok;
//    }
//
//    public void setmDefaultTranslation(String translation){
//        mDefaultTranslation = translation;
//    }

    public String getmMiwokTranslation (){
        return mMiwokTranslation;
    }

    public  String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public int getResourceID() { return mResourceID;}

    public boolean hasAnImage(){return mResourceID != NO_IMAGE; }

    public int getAudioSourceID() {return mAudioSourceID; }
}
