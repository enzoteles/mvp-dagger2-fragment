package br.com.arquitetura.splash;

import android.app.Fragment;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import br.com.arquitetura.BuildConfig;
import br.com.arquitetura.R;
import br.com.arquitetura.mvp.content.OnContentMVP;
import br.com.arquitetura.mvp.main.MainActivity;
import br.com.arquitetura.mvp.main.OnMainActivity;
import br.com.arquitetura.mvp.splash.DaggerOnSplashComponent;
import br.com.arquitetura.mvp.splash.OnSplashComponent;
import br.com.arquitetura.mvp.splash.OnSplashMVP;
import br.com.arquitetura.mvp.splash.SplashModule;
import br.com.arquitetura.mvp.splash.SplashView;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static org.robolectric.util.FragmentTestUtil.startFragment;

/**
 * Created by enzo.teles on 03/08/2017.
 */

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class SplashViewTest {

    OnSplashMVP.OnSplashPresenter presenter;
    OnSplashComponent componentModule;
    MainActivity activity;
    OnMainActivity onMainActivity;
    SplashView splashView;

    //variable ui
    TextView txtSplash;

    @Before
    public void setUp() throws Exception{

        activity = Robolectric.setupActivity(MainActivity.class);
        splashView = new SplashView();
        componentModule = DaggerOnSplashComponent.builder().splashModule(new SplashModule()).build();
        presenter = componentModule.provideSplashPresenter();
        startFragment((Fragment) splashView);
    }

    @Test
    public void shouldNotBeNullComponent() throws Exception{
        assertNotNull(componentModule);
        assertNotNull(presenter);
        assertNotNull(splashView);
    }

    @Test
    public void shouldTextViewLabel(){
        txtSplash = splashView.splash.findViewById(R.id.txtSplash);
        assertNotNull(txtSplash);
        assertEquals(View.VISIBLE, txtSplash.getVisibility());
        assertEquals(activity.getString(R.string.txt_splash), txtSplash.getText());
    }

    @Test
    public void shouldCallPresenter() throws Exception{
        presenter.callPresenter(componentModule);
    }


}
