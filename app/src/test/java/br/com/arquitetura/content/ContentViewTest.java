package br.com.arquitetura.content;


import android.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import br.com.arquitetura.BuildConfig;
import br.com.arquitetura.R;
import br.com.arquitetura.mvp.content.ContentView;
import br.com.arquitetura.mvp.content.OnContentMVP;
import br.com.arquitetura.mvp.main.MainActivity;
import br.com.arquitetura.mvp.main.OnMainActivity;
import br.com.arquitetura.mvp.splash.DaggerOnSplashComponent;
import br.com.arquitetura.mvp.splash.OnSplashComponent;
import br.com.arquitetura.mvp.splash.OnSplashMVP;
import br.com.arquitetura.mvp.splash.SplashModule;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static org.robolectric.util.FragmentTestUtil.startFragment;

/**
 * Created by enzo.teles on 03/08/2017.
 */

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class ContentViewTest {

    OnSplashMVP.OnSplashPresenter presenter;
    OnSplashComponent componentModule;
    MainActivity activity;
    OnMainActivity onMainActivity;
    ContentView contentView;


    //variable ui
    EditText nome;
    EditText senha;
    Button btnSend;

    @Before
    public void setUp() throws Exception{

        activity = Robolectric.setupActivity(MainActivity.class);
        componentModule = DaggerOnSplashComponent.builder().splashModule(new SplashModule()).build();
        presenter = componentModule.provideSplashPresenter();
        contentView = new ContentView();
        startFragment((Fragment) contentView);

    }

    @Test
    public void shouldBeEmpty() throws Exception{

        assertNotNull(activity);
        assertNotNull(presenter);
        assertNotNull(contentView);

    }

    @Test
    public void shouldViewVerification() throws Exception{

        nome = contentView.nome.findViewById(R.id.edt_nome);
        assertNotNull(nome);
        assertEquals(View.VISIBLE, nome.getVisibility());
        assertEquals(activity.getString(R.string.edt_hint_name), nome.getHint());

        senha = contentView.senha.findViewById(R.id.edt_senha);
        assertNotNull(senha);
        assertEquals(View.VISIBLE, senha.getVisibility());
        assertEquals(activity.getString(R.string.edt_hint_senha), senha.getHint());

    }

    @Test
    public void shouldButtonTest() throws Exception{

        btnSend = contentView.btnSend.findViewById(R.id.btn_send);
        assertNotNull(btnSend);
        assertEquals(View.VISIBLE, btnSend.getVisibility());
        assertEquals(activity.getString(R.string.btn_enviar), btnSend.getText());
        btnSend.performClick();
    }
}
