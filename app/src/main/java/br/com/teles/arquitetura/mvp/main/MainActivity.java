package br.com.teles.arquitetura.mvp.main;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import br.com.teles.arquitetura.R;
import br.com.teles.arquitetura.mvp.bo.ManagerFragment;
import br.com.teles.arquitetura.mvp.content.OnContentMVP;

public class MainActivity extends AppCompatActivity implements OnMainActivity{


    //atributes
    OnContentMVP.OnContentView contentFragment;
    ManagerFragment managerFragment;
    public static MainActivity mainActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            mainActivity.setMainActivity(this);
            //init dagger component
            OnMainComponent mainComponent = DaggerOnMainComponent.builder().mainModule(new MainModule()).build();
            contentFragment = mainComponent.provideComponentView();
            managerFragment = mainComponent.provideManagerFragment();
            addFragment((Fragment)contentFragment, "content", R.id.content);
    }

    /**
     * method for add fragment in the backstack
     * */
    @Override
    public void addFragment(Fragment fragment, String tag, int layout) {
        managerFragment
                .setFragment(fragment)
                .setTag(tag)
                .setLayout(layout)
                .addFragment();
    }

    /**
     * method for replace fragment in the backstack
     * */
    @Override
    public void replaceFragment(Fragment fragment, String tag, int layout, boolean backstack) {
        if(!isFinishing()){
            managerFragment
                    .setFragment(fragment)
                    .setTag(tag)
                    .setLayout(layout)
                    .setBackstack(true)
                    .replaceFragment();
        }
    }

    public static MainActivity getMainActivity() {
        return mainActivity;
    }

    public static void setMainActivity(MainActivity mainActivity) {
        MainActivity.mainActivity = mainActivity;
    }

    @Override
    public void onBackPressed() {
        if (getFragmentManager().getBackStackEntryCount() > 0 ){
            getFragmentManager().popBackStack();
        } else {
            super.onBackPressed();

        }
    }


}
