package br.com.teles.arquitetura.mvp.content;

import android.widget.Toast;

import javax.inject.Inject;

import br.com.teles.arquitetura.mvp.main.MainActivity;

/**
 * Created by enzo.teles on 25/07/2017.
 */

public class ContentPresenter implements OnContentMVP.OnContentPresenter, OnContentMVP.OnContentCallback{

    //atributes
    OnContentMVP.OnContentView view;
    OnContentMVP.OnContentInteractor interactor;

    @Inject
    public ContentPresenter(OnContentMVP.OnContentView view) {
        this.view = view;
    }

    /**
     * method for inject the interactor and call the method callInteractor of itself
     * */
    @Override
    public void callPresenter(OnContentComponent component) {
        interactor = component.provideContentInteractor();
        interactor.callInteractor(this);
    }

    @Override
    public void msgCallback(String callback) {
        view.callFragment(callback);
    }
}
