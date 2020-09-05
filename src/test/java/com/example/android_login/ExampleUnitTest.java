package com.example.android_login;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    public MainActivity mainActivity;
    public HomePage homePage;

    @Before
    public void setup() {
        mainActivity = new MainActivity();
        homePage = new HomePage();
    }

    @Test
    public void usernameVerificationTest() {
        MainActivity.createUsers();
        assertTrue(MainActivity.verifyUsername("Salem"));
    }

    @Test
    public void passwordVerificationTest() {
        MainActivity.createUsers();
        for(Users user : MainActivity.users) {
            System.out.println(user.getUsername());
        }
        assertTrue(MainActivity.verifyPassword("Eevs", "catsRbest"));
    }


}