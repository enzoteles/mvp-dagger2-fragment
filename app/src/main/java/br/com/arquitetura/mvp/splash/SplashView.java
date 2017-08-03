package br.com.arquitetura.mvp.splash;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import br.com.arquitetura.R;
import br.com.arquitetura.mvp.main.OnMainActivity;
import butterknife.BindView;
import butterknife.ButterKnife;


/**
 *
 * Created by enzo.teles on 25/07/2017.
 */

public class SplashView extends Fragment implements OnSplashMVP.OnSplashView{

    OnSplashMVP.OnSplashPresenter presenter;
    OnSplashComponent component;

    @BindView(R.id.txtSplash) public TextView splash;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.splash, container, false);
        ButterKnife.bind(this, view);
        //init module dagger
        component = DaggerOnSplashComponent.builder().splashModule(new SplashModule()).build();
        presenter = component.provideSplashPresenter();
        presenter.callPresenter(component);
        String s = getResources().getString(R.string.txt_splash);
        splash.setText(s);

        return view;
    }
}
