package br.com.arquitetura.main;

import android.app.Fragment;
import android.support.v7.widget.Toolbar;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import br.com.arquitetura.BuildConfig;
import br.com.arquitetura.R;
import br.com.arquitetura.mvp.main.DaggerOnMainComponent;
import br.com.arquitetura.mvp.main.MainActivity;
import br.com.arquitetura.mvp.main.MainModule;
import br.com.arquitetura.mvp.main.OnMainComponent;
import br.com.arquitetura.mvp.splash.OnSplashMVP;
import br.com.arquitetura.utilities.manager.ManagerFragment;

import static junit.framework.Assert.assertNotNull;

/**
 * Created by enzo.teles on 03/08/2017.
 */

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class MainActivityTest {

    //variable
    MainActivity activity;
    OnSplashMVP.OnSplashView splashView;
    ManagerFragment managerFragment;

    @Before
    public void setUp() throws Exception{

        activity = Robolectric.setupActivity(MainActivity.class);
        OnMainComponent mainComponent = DaggerOnMainComponent.builder().mainModule(new MainModule()).build();
        splashView = mainComponent.provideSplashView();
        managerFragment = mainComponent.provideManagerFragment();
    }

    @Test
    public void shouldNotBeNullComponent() throws Exception{
        assertNotNull(managerFragment);
        assertNotNull(activity);
        assertNotNull(splashView);
    }

    @Test
    public void shouldAddFragment(){
        activity.addFragment((Fragment) splashView, "splash", R.id.content);
    }

    @Test
    public void shouldReplaceFragment(){
        activity.replaceFragment((Fragment) splashView, "splash", R.id.content, false);
    }

}
