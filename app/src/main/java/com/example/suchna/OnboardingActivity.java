package com.example.suchna;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;

import com.ramotion.paperonboarding.PaperOnboardingFragment;
import com.ramotion.paperonboarding.PaperOnboardingPage;

import java.util.ArrayList;

public class OnboardingActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        fragmentManager = getSupportFragmentManager();

        final PaperOnboardingFragment paperOnboardingFragment = PaperOnboardingFragment.newInstance(getDataForOnBoarding());

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container,paperOnboardingFragment);
        fragmentTransaction.commit();

    }

    private ArrayList<PaperOnboardingPage> getDataForOnBoarding() {
        PaperOnboardingPage src1 = new PaperOnboardingPage("Suchna","Jan-Jan ki Suchna",
                Color.parseColor("ffb174"),R.drawable.main_background, R.drawable.header_onb);
        PaperOnboardingPage src2 = new PaperOnboardingPage("Suchna","Jan-Jan ki Suchna",
                Color.parseColor("ffb174"),R.drawable.main_background, R.drawable.header_onb);
        PaperOnboardingPage src3 = new PaperOnboardingPage("Suchna","Jan-Jan ki Suchna",
                Color.parseColor("ffb174"),R.drawable.main_background, R.drawable.header_onb);

        ArrayList<PaperOnboardingPage> elements = new ArrayList<>();
        elements.add(src1);
        elements.add(src2);
        elements.add(src3);
        return elements;
    }
}