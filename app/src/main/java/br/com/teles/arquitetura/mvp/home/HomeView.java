package br.com.teles.arquitetura.mvp.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.teles.arquitetura.R;
import br.com.teles.arquitetura.mvp.content.ContentModule;
import br.com.teles.arquitetura.mvp.content.DaggerOnContentComponent;
import br.com.teles.arquitetura.mvp.content.OnContentComponent;
import br.com.teles.arquitetura.mvp.content.OnContentMVP;
import br.com.teles.arquitetura.mvp.main.OnMainActivity;

/**
 *
 * Created by enzo.teles on 25/07/2017.
 */

public class HomeView extends Fragment implements OnHomeMVP.OnHomeView{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.home, container, false);
        return view;
    }
}
