package br.com.teles.arquitetura.mvp.content;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.teles.arquitetura.R;
import br.com.teles.arquitetura.mvp.home.OnHomeMVP;
import br.com.teles.arquitetura.mvp.main.MainActivity;
import br.com.teles.arquitetura.mvp.main.OnMainActivity;

/**
 *
 * Created by enzo.teles on 25/07/2017.
 */

public class ContentView extends Fragment implements OnContentMVP.OnContentView{

    OnContentMVP.OnContentPresenter presenter;
    OnMainActivity onMainActivity;
    OnHomeMVP.OnHomeView home;
    OnContentComponent component;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.content, container, false);
        //init module dagger
        component = DaggerOnContentComponent.builder().contentModule(new ContentModule()).build();
        presenter = component.provideContentPresenter();
        presenter.callPresenter(component);

        return view;
    }

    @Override
    public void callFragment(String callback) {
        onMainActivity = MainActivity.getMainActivity();
        component = DaggerOnContentComponent.builder().contentModule(new ContentModule()).build();
        home = component.provideHomeView();
        onMainActivity.replaceFragment((Fragment)home, "home", R.id.content, true);
    }
}
