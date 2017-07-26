package br.com.teles.arquitetura.mvp.content;

import javax.inject.Singleton;

import br.com.teles.arquitetura.mvp.home.OnHomeMVP;
import br.com.teles.arquitetura.mvp.main.MainModule;
import dagger.Component;

/**
 * Created by enzo.teles on 26/07/2017.
 */

@Singleton
@Component(modules = {ContentModule.class})
public interface OnContentComponent {

    OnContentMVP.OnContentPresenter provideContentPresenter();

    OnContentMVP.OnContentInteractor provideContentInteractor();

    OnHomeMVP.OnHomeView provideHomeView();

}
