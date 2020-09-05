package com.example.android_login;

import android.content.Context;
import android.content.Intent;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.android_login_and_landing_page", appContext.getPackageName());
    }

    @Test
    public void intentTest() {
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();

        Intent i = HomePage.getIntent(appContext, "Salem");

        assertEquals("com.example.android_login_and_landing_page.HomePage", i.resolveActivity(appContext.getPackageManager()).getClassName());

//        assertEquals("Salem", i.getStringExtra("username"));
    }
}