package br.com.arquitetura.mvp.splash;


import android.app.Fragment;
import android.os.Handler;

import javax.inject.Inject;

import br.com.arquitetura.R;
import br.com.arquitetura.mvp.content.OnContentMVP;
import br.com.arquitetura.mvp.main.MainActivity;
import br.com.arquitetura.mvp.main.OnMainActivity;
import br.com.arquitetura.utilities.log.WrapperLog;

/**
 * Created by enzo.teles on 25/07/2017.
 */

public class SplashPresenter implements OnSplashMVP.OnSplashPresenter, OnSplashMVP.OnSplashCallback {

    //atributes
    OnSplashMVP.OnSplashView view;
    OnSplashMVP.OnSplashInteractor interactor;
    OnSplashComponent component;
    OnContentMVP.OnContentView content;

    @Inject
    public SplashPresenter(OnSplashMVP.OnSplashView view) {
        this.view = view;
    }

    /**
     * method for inject the interactor and call the method callInteractor of itself
     */
    @Override
    public void callPresenter(OnSplashComponent component) {
        interactor = component.provideSplashInteractor();
        interactor.callInteractor(this);
    }

    /**
     * method for call other fragment
     */
    @Override
    public void callFragment() {

        final OnMainActivity onMainActivity = MainActivity.getMainActivity();
        component = DaggerOnSplashComponent.builder().splashModule(new SplashModule()).build();
        content = component.provideContentView();
        onMainActivity.replaceFragment((Fragment) content, "content", R.id.content, false);


    }
}
