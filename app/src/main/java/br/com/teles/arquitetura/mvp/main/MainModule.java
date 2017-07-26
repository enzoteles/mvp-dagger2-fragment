package br.com.teles.arquitetura.mvp.main;

import javax.inject.Singleton;

import br.com.teles.arquitetura.mvp.bo.ManagerFragment;
import br.com.teles.arquitetura.mvp.content.ContentPresenter;
import br.com.teles.arquitetura.mvp.content.ContentView;
import br.com.teles.arquitetura.mvp.content.OnContentMVP;
import dagger.Module;
import dagger.Provides;

/**
 * Created by enzo.teles on 26/07/2017.
 */
@Module
public class MainModule {

    @Provides
    OnContentMVP.OnContentView provideComponentView(){
        return new ContentView();
    }

    @Provides
    ManagerFragment provideManagerFragment(){
        return new ManagerFragment(MainActivity.getMainActivity());
    }


}
