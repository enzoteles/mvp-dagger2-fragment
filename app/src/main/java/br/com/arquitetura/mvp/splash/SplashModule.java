package br.com.arquitetura.mvp.splash;
import br.com.arquitetura.mvp.content.ContentView;
import br.com.arquitetura.mvp.content.OnContentMVP;
import dagger.Module;
import dagger.Provides;

/**
 * Created by enzo.teles on 26/07/2017.
 */

@Module
public class SplashModule {


    @Provides
    OnSplashMVP.OnSplashView provideSplashView(){
        return  new SplashView();
    }

    @Provides
    OnSplashMVP.OnSplashPresenter provideSplashPresenter(){
        return  new SplashPresenter(new SplashView());
    }

    @Provides
    OnSplashMVP.OnSplashInteractor provideSplashInteractor(){
        return new SplashInteractor();
    }
    @Provides
    OnContentMVP.OnContentView provideContentView(){
        return new ContentView();
    }

}
