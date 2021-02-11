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

public class TDDJobeventtesting {
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
