package br.com.teles.arquitetura.mvp.content;

/**
 * Created by enzo.teles on 25/07/2017.
 */

public interface OnContentMVP {

    //view
    interface OnContentView{
        void callFragment(String callback);
    }

    //presenter
    interface OnContentPresenter{

        void callPresenter(OnContentComponent component);
    }

    //interactor
    interface OnContentInteractor{

        void callInteractor(OnContentCallback callback);
    }
    //callback
    interface OnContentCallback{

        void msgCallback(String callback);
    }
}
