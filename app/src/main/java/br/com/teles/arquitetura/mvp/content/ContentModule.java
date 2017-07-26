package br.com.teles.arquitetura.mvp.content;

import br.com.teles.arquitetura.mvp.home.HomeView;
import br.com.teles.arquitetura.mvp.home.OnHomeMVP;
import dagger.Module;
import dagger.Provides;

/**
 * Created by enzo.teles on 26/07/2017.
 */

@Module
public class ContentModule {

    @Provides
    OnContentMVP.OnContentPresenter provideContentPresenter(){
        return  new ContentPresenter(new ContentView());
    }

    @Provides
    OnContentMVP.OnContentInteractor provideContentInteractor(){
        return new ContentInteractor();
    }
    @Provides
    OnHomeMVP.OnHomeView provideHomeView(){
        return new HomeView();
    }

}
