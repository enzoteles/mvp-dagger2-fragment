package br.com.arquitetura.splash;

import android.support.v4.BuildConfig;
import android.support.v4.app.Fragment;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import br.com.arquitetura.R;
import br.com.arquitetura.mvp.content.OnContentMVP;
import br.com.arquitetura.mvp.main.MainActivity;
import br.com.arquitetura.mvp.splash.DaggerOnSplashComponent;
import br.com.arquitetura.mvp.splash.OnSplashComponent;
import br.com.arquitetura.mvp.splash.OnSplashMVP;
import br.com.arquitetura.mvp.splash.SplashInteractor;
import br.com.arquitetura.mvp.splash.SplashModule;
import br.com.arquitetura.mvp.splash.SplashPresenter;
import br.com.arquitetura.mvp.splash.SplashView;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by enzo.teles on 03/08/2017.
 */

public class SplashPresenterTest{

    //atributes
    OnSplashMVP.OnSplashView view;
    OnSplashMVP.OnSplashInteractor interactor;
    OnSplashComponent component;

    @Before
    public void setUp() throws Exception{
        view = new SplashView();
        component = DaggerOnSplashComponent.builder().splashModule(new SplashModule()).build();
        interactor = component.provideSplashInteractor();
    }

    @Test
    public void shouldCallInteractor()throws Exception{
        assertNotNull(view);
        assertNotNull(interactor);

    }
}



































