package br.com.arquitetura.mvp.splash;

/**
 * Created by enzo.teles on 25/07/2017.
 */

public interface OnSplashMVP {

    //view
    interface OnSplashView{
    }

    //presenter
    interface OnSplashPresenter{

        void callPresenter(OnSplashComponent component);
    }

    //interactor
    interface OnSplashInteractor{

        void callInteractor(OnSplashCallback callback);
    }
    //callback
    interface OnSplashCallback{

        void callFragment();
    }
}
