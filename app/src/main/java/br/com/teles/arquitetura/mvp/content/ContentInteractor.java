package br.com.teles.arquitetura.mvp.content;

import android.os.Handler;

/**
 * Created by enzo.teles on 25/07/2017.
 */

class ContentInteractor implements OnContentMVP.OnContentInteractor {
    @Override
    public void callInteractor(final OnContentMVP.OnContentCallback callback) {

        new Handler().postDelayed(new Runnable() {
            @Override public void run() {
                callback.msgCallback("callback");
            }
        }, 3000);
    }
}
