package com.romash.jobportal.Activity;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import com.theakatsuki.hiredevelopers.Activity.LoginActivity;
import com.theakatsuki.hiredevelopers.R;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class Addjobeventtest {

    @Rule
    public ActivityTestRule<jobeventActivity> mActivityTestRule = new ActivityTestRule<>(jobeventActivity.class);

    @Test
    @Test
    public void addjobTesting(){
        fragmentManager.popBackStack(addjobTesting();Fragment.STACK_NAME, 0);
        AppjobFragment appjobFragment = (AppjobFragment) fragmentsAttachedToMainActivity.get(fragmentsAttachedToMainActivity.size() - 1);
        assert appjobFragment.getView() != null;
        RecyclerView appjobRecyclerView = appjobFragment.getView().findViewById(R.id.jobRecyclerView);
        assert appjobFragment RecyclerView.getAdapter() != null;
        int noOfjobssBeforeAddingNewDiscussion = appjobsRecyclerView.getAdapter().getItemCount();


        AddjobFragment addDiscussionFragment = new AddjobFragment();
        fragmentManager.beginTransaction().addToBackStack(AddjobFragment.STACK_NAME).replace(R.id.fragment_holder_two, addjobFragment).commit();
        getInstrumentation().waitForIdleSync();

        onView(withId(R.id.jobtitle)).perform(ViewActions.scrollTo());
        onView(withId(R.id.jobtitle)).perform(typeText("Title on job"));

        onView(withId(R.id.description)).perform(ViewActions.scrollTo());
        onView(withId(R.id.description)).perform(typeText("description on job"));

        closeSoftKeyboard();

        onView(withId(R.id.intrestedfieldListSpn)).perform(ViewActions.scrollTo());
        onView(withId(R.id.intrestedListSpn)).perform(click());
        onData(anything()).atPosition(App.getCategories().size()).perform(click());

        onView(withId(R.id.postBtn)).perform(ViewActions.scrollTo());
        onView(withId(R.id.postBtn)).perform(click());
        getInstrumentation().waitForIdleSync();

        int noOfjobAfterAddingNewjob = appjobsRecyclerView.getAdapter().getItemCount();
        assertEquals(noOfjobsAfterAddingNewjobs, noOfjobsBeforeAddingNewjobs + 1);
    }};

@Test
public void addeventTesting(){
        fragmentManager.popBackStack(addeventTesting();Fragment.STACK_NAME, 0);
        AppeventFragment appeventFragment = (AppeventFragment) fragmentsAttachedToMainActivity.get(fragmentsAttachedToMainActivity.size() - 1);
        assert appeventFragment.getView() != null;
        RecyclerView appeventRecyclerView = appeventFragment.getView().findViewById(R.id.jobRecyclerView);
        assert appeventFragment RecyclerView.getAdapter() != null;
        int noOfeventBeforeAddingNewevent = appeventRecyclerView.getAdapter().getItemCount();


        AddeventFragment addeventFragment = new AddjobFragment();
        fragmentManager.beginTransaction().addToBackStack(AddeventFragment.STACK_NAME).replace(R.id.fragment_holder_two, addjobFragment).commit();
        getInstrumentation().waitForIdleSync();

        onView(withId(R.id.jobtitle)).perform(ViewActions.scrollTo());
        onView(withId(R.id.jobtitle)).perform(typeText("Title on event"));

        onView(withId(R.id.description)).perform(ViewActions.scrollTo());
        onView(withId(R.id.description)).perform(typeText("description on event"));

        closeSoftKeyboard();

        onView(withId(R.id.intrestedfieldListSpn)).perform(ViewActions.scrollTo());
        onView(withId(R.id.intrestedListSpn)).perform(click());
        onData(anything()).atPosition(App.getCategories().size()).perform(click());

        onView(withId(R.id.postBtn)).perform(ViewActions.scrollTo());
        onView(withId(R.id.postBtn)).perform(click());
        getInstrumentation().waitForIdleSync();

        int noOfjobAfterAddingNewevent = appeventsRecyclerView.getAdapter().getItemCount();
        assertEquals(noOfeventsAfterAddingNewjobs, noOfeventsBeforeAddingeventsjobs + 1);
        };