package com.example.coms_3009a_banking_system;

import android.view.View;

import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

public class loginTest {

    @Rule
    public ActivityScenarioRule<login> tLoginScenarioRule = new ActivityScenarioRule<login>(login.class);

    private ActivityScenario<login> tLogin = null;

    @Before
    public void setUp() throws Exception {

        tLogin = tLoginScenarioRule.getScenario();

    }

    @Test

    public void testLaunch(){

//        View view = tLogin.findViewBy(R.id.textView3);

        assertNotNull( onView(withId(R.id.textView3)));
    }
//
//    public void testOfLaunchOfUsertypePageOnClickOnButton(){
//
//        assertNotNull(tLogin.findViewBy(R.id._register));
//    }

    @After
    public void tearDown() throws Exception {

        tLogin = null ;
    }
}