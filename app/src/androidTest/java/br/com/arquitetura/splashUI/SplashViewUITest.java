package br.com.arquitetura.splashUI;

import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.arquitetura.R;
import br.com.arquitetura.mvp.main.MainActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by enzo.teles on 03/08/2017.
 */
@RunWith(AndroidJUnit4.class)
public class SplashViewUITest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    private MainActivity mainActivity;

    @Before
    public void setUp() throws Exception {
        mainActivity = mActivityRule.getActivity();

    }

    @Test
    public void shouldDisplay() throws Exception {
        onView(ViewMatchers.withId(R.id.txtSplash)).check(matches(withText(mainActivity.getResources().getString(R.string.txt_splash))));
    }
}
