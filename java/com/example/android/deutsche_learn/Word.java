package com.example.android.deutsche_learn;

// Contains default translation and German word translation for the word

public class Word {

    private String mDefaultTranslation;

    private String mGermanTranslation;

    // Constructor for words
    public Word(String defaultTranslation, String germanTranslation) {
        mDefaultTranslation = defaultTranslation;
        mGermanTranslation = germanTranslation;
    }

    // Return English/Default translation
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    // Return German translation
    public String getGermanTranslation() {
        return mGermanTranslation;
    }
}
