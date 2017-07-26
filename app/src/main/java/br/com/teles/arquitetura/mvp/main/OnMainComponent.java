package br.com.teles.arquitetura.mvp.main;

import javax.inject.Singleton;

import br.com.teles.arquitetura.mvp.bo.ManagerFragment;
import br.com.teles.arquitetura.mvp.content.OnContentMVP;
import dagger.Component;

/**
 * Created by enzo.teles on 26/07/2017.
 */


@Singleton
@Component(modules = {MainModule.class})
public interface OnMainComponent {

    OnContentMVP.OnContentView provideComponentView();
    ManagerFragment provideManagerFragment();

}
