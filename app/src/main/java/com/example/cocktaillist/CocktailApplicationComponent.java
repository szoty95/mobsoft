package com.example.cocktaillist;

import com.example.cocktaillist.interactor.cocktails.CocktailInteractor;
import com.example.cocktaillist.ui.UIModule;
import com.example.cocktaillist.ui.cocktail.CocktailFragment;
import com.example.cocktaillist.ui.cocktail.CocktailPresenter;
import com.example.cocktaillist.ui.main.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = UIModule.class)
public interface CocktailApplicationComponent {
    void inject(MainActivity mainActivity);

    void inject(CocktailFragment cocktailFragment);

    void inject(CocktailInteractor cocktailInteractor);

    void inject(CocktailPresenter cocktailPresenter);
}
