package com.sudeep.jobportal;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class TDDRegistrationTesting {
    @Test
    public void RegistrationUserTesting(){
        FirebaseAuth auth = Mockito.mock(FirebaseAuth.class);
        final Task mockedAuth = Mockito.mock(Task.class);
        onView(withId(R.id.name))
                    .perform(typeText("TDDtest"),closeSoftKeyboard());

            onView(withId(.id.country))
                    .perform(typeText("Nepal"),closeSoftKeyboard());

            onView(withId(R.id.phonenumber))
                    .perform(typeText("9851125847"),closeSoftKeyboard());

            onView(withId(R.id.workPlace))
                    .perform(typeText("Home"),closeSoftKeyboard());

            onView(withId(R.id.email))
                    .perform(typeText("sudeep@gmail.com"),closeSoftKeyboard());

            onView(withId(R.id.password))
                    .perform(typeText("password1234"),closeSoftKeyboard());

            ViewInteraction appCompatButton = onView(
                    allOf(withId(R.id.register), withText("Register user"),
                            childAtPosition(
                                    childAtPosition(
                                            withId(android.R.id.content),
                                            0),
                                    7),
                            isDisplayed()));
            appCompatButton.perform(click());
        }

