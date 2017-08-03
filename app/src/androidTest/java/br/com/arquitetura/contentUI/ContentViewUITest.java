package br.com.arquitetura.contentUI;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.arquitetura.R;
import br.com.arquitetura.mvp.main.MainActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by enzo.teles on 03/08/2017.
 */

@RunWith(AndroidJUnit4.class)
public class ContentViewUITest {
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

        onView(ViewMatchers.withId(R.id.edt_nome)).perform(typeText("Enzo"), closeSoftKeyboard());
        onView(withId(R.id.edt_senha)).perform(typeText("Enzo"), closeSoftKeyboard());
        onView(ViewMatchers.withId(R.id.btn_send))
                .check(ViewAssertions.matches(ViewMatchers.withText(R.string.btn_enviar)))
                .perform(ViewActions.click());
    }
}
