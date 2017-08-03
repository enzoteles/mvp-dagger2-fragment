package br.com.arquitetura.splash;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import br.com.arquitetura.BuildConfig;
import br.com.arquitetura.mvp.splash.OnSplashMVP;
import br.com.arquitetura.mvp.splash.SplashPresenter;
import br.com.arquitetura.mvp.splash.SplashView;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by enzo.teles on 03/08/2017.
 */
public class SplashInteractorTest {


    OnSplashMVP.OnSplashCallback callback;
    OnSplashMVP.OnSplashView view;

    @Before
    public void setUp() throws Exception{
        view = new SplashView();
        callback = new SplashPresenter(view);
    }

    @Test
    public void shouldNotBeNullComponent()throws Exception{
        assertNotNull(view);
        assertNotNull(callback);
    }
}