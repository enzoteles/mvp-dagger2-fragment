package br.com.arquitetura.mvp.main;

import br.com.arquitetura.utilities.manager.ManagerFragment;
import br.com.arquitetura.mvp.splash.OnSplashMVP;
import br.com.arquitetura.mvp.splash.SplashView;
import dagger.Module;
import dagger.Provides;

/**
 * Created by enzo.teles on 26/07/2017.
 */
@Module
public class MainModule {

    @Provides
    OnSplashMVP.OnSplashView provideSplashView(){
        return new SplashView();
    }

    @Provides
    ManagerFragment provideManagerFragment(){
        return new ManagerFragment(MainActivity.getMainActivity());
    }


}
