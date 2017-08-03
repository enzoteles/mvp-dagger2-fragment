package br.com.arquitetura.mvp.splash;

import javax.inject.Singleton;

import br.com.arquitetura.mvp.content.OnContentMVP;
import dagger.Component;

/**
 * Created by enzo.teles on 26/07/2017.
 */

@Singleton
@Component(modules = {SplashModule.class})
public interface OnSplashComponent {

    OnSplashMVP.OnSplashView provideSplashView();

    OnSplashMVP.OnSplashPresenter provideSplashPresenter();

    OnSplashMVP.OnSplashInteractor provideSplashInteractor();

    OnContentMVP.OnContentView provideContentView();
}
