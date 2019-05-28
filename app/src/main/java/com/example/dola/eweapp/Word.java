package com.example.dola.eweapp;

public class Word {

    private int mImageResourceId;

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Ewe translation for the word*/
    private String mEweTranslation;

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

}
