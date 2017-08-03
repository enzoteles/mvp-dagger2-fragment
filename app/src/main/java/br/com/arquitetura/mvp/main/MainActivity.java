package br.com.arquitetura.mvp.main;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import br.com.arquitetura.R;
import br.com.arquitetura.utilities.manager.ManagerFragment;
import br.com.arquitetura.mvp.splash.OnSplashMVP;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements OnMainActivity {


    //atributes
    OnSplashMVP.OnSplashView splashFragment;
    ManagerFragment managerFragment;
    public static MainActivity mainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            ButterKnife.bind(this);

            //context global
            mainActivity.setMainActivity(this);
            //init dagger component
            OnMainComponent mainComponent = DaggerOnMainComponent.builder().mainModule(new MainModule()).build();
            splashFragment = mainComponent.provideSplashView();
            managerFragment = mainComponent.provideManagerFragment();
            //add fragment
            addFragment((Fragment)splashFragment, "splash", R.id.content);
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
                    .setBackstack(backstack)
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
