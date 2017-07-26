package br.com.teles.arquitetura.mvp.main;

import android.support.v4.app.Fragment;

/**
 * Created by enzo.teles on 26/07/2017.
 */

public interface OnMainActivity {

    void addFragment(Fragment fragment, String tag, int layout);
    void replaceFragment(Fragment fragment, String tag, int layout, boolean backstack);
}
