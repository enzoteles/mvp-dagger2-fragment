package br.com.arquitetura.mvp.main;


import android.app.Fragment;
import android.support.v7.widget.Toolbar;

/**
 * Created by enzo.teles on 26/07/2017.
 */

public interface OnMainActivity {

    void addFragment(Fragment fragment, String tag, int layout);
    void replaceFragment(Fragment fragment, String tag, int layout, boolean backstack);
}
