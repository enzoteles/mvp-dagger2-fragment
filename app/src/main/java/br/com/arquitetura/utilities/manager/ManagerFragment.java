package br.com.arquitetura.utilities.manager;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.util.Log;

import javax.inject.Inject;

import br.com.arquitetura.mvp.main.MainActivity;


/**
 * Created by Enzo Teles on 26/07/2017.
 */
public class ManagerFragment {

    MainActivity activity;
    Fragment fragment;
    FragmentTransaction transaction;
    String tag;
    boolean backstack;
    int layout;

    @Inject
    public ManagerFragment(MainActivity activity) {
        this.activity = activity;
    }

    public ManagerFragment setFragment(Fragment fragment) {
        this.fragment = fragment;
        return this;
    }

    public ManagerFragment setTag(String tag) {
        this.tag = tag;
        return this;
    }

    public ManagerFragment setBackstack(boolean backstack) {
        this.backstack = backstack;
        return this;
    }

    public ManagerFragment setLayout(int layout) {
        this.layout = layout;
        return this;
    }

    public void addFragment() {
        transaction = activity.getFragmentManager().beginTransaction();
        transaction.add(layout, fragment, tag);
        transaction.commitAllowingStateLoss();
    }

    public void replaceFragment() {
        Log.i("backstack " , "backstack"+ backstack);
        transaction = activity.getFragmentManager().beginTransaction();
        transaction.replace(layout, fragment);
        if (backstack == true) {
            transaction.addToBackStack(null);
        }
        transaction.commitAllowingStateLoss();
    }

}
