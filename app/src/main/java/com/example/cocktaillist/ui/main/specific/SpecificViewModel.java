package com.example.cocktaillist.ui.main.specific;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SpecificViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SpecificViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is specific fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
