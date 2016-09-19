package com.example.android.miwok;

import android.content.Context;

/**
 * Created by dguti on 9/18/2016.
 */
public class Word {

    private String mMiwokTranslation;

    private String mDefaultTranslation;

    public  Word (String defaultTranslation, String miwokTranslation){
        mMiwokTranslation = defaultTranslation;
        mDefaultTranslation = miwokTranslation;
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
}
