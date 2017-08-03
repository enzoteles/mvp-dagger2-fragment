package br.com.arquitetura.mvp.main;

import javax.inject.Singleton;

import br.com.arquitetura.utilities.manager.ManagerFragment;
import br.com.arquitetura.mvp.splash.OnSplashMVP;
import dagger.Component;

/**
 * Created by enzo.teles on 26/07/2017.
 */


@Singleton
@Component(modules = {MainModule.class})
public interface OnMainComponent {

    OnSplashMVP.OnSplashView provideSplashView();
    ManagerFragment provideManagerFragment();

}
