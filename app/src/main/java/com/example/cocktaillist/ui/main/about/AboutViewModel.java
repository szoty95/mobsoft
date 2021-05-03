package com.example.cocktaillist.ui.main.about;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AboutViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AboutViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This page is dedicated to the creator of this humble app.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
