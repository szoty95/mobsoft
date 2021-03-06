package com.example.cocktaillist.ui.main;

import com.example.cocktaillist.ui.Presenter;

public class MainPresenter extends Presenter<MainScreen> {

    private static MainPresenter instance = null;

    private MainPresenter(){
    }

    public static MainPresenter getInstance(){
        if(instance == null){
            instance = new MainPresenter();
        }
        return instance;
    }

    @Override
    public void attachScreen(MainScreen screen) {
        super.attachScreen(screen);
    }

    @Override
    public void detachScreen() {
        super.detachScreen();
    }

    public void showCocktails(){
        screen.showCocktails();
    }
}
