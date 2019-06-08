package com.example.dola.eweapp;

public class Word {

    private int mImageResourceId = -1;

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Ewe translation for the word*/
    private String mEweTranslation;

    private int mAudioResource;

    /**
     * Create a new Word object
     * @param defaultTranslation is the word in a language that the user is already familiar with
     * @param eweTranslation is the word in the Ewe language
     */
    public  Word(String defaultTranslation, String eweTranslation){
        this.mDefaultTranslation = defaultTranslation;
        this.mEweTranslation = eweTranslation;
    }


    public  Word(String defaultTranslation, String eweTranslation, int imageResourceId){
        this.mDefaultTranslation = defaultTranslation;
        this.mEweTranslation = eweTranslation;
        this.mImageResourceId = imageResourceId;
    }


    /**
     * Get the default translation of the word
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }


    /**
     *  Get the Ewe translation of the Word
     */
    public String getmEweTranslation() {
        return mEweTranslation;
    }


    public int getmAudioResource() {
        return mAudioResource;
    }

    public void setmAudioResource(int mAudioResource) {
        this.mAudioResource = mAudioResource;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }
}
