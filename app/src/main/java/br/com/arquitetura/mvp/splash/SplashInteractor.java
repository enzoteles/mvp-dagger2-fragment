package br.com.arquitetura.mvp.splash;

import android.app.Fragment;
import android.os.Handler;

import br.com.arquitetura.R;

/**
 * Created by enzo.teles on 25/07/2017.
 */

public class SplashInteractor implements OnSplashMVP.OnSplashInteractor {
    @Override
    public void callInteractor(final OnSplashMVP.OnSplashCallback callback) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                callback.callFragment();
            }
        }, 3000);

    }
}
