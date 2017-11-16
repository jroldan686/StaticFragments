package com.mycompany.staticfragments;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StaticFragmentsActivity extends AppCompatActivity implements FragmentA.FragmentAListener {

    private Fragment frmB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_fragments);
        frmB = getSupportFragmentManager().findFragmentById(R.id.frmB);
    }

    @Override
    public void onFragmentAEvent(String message, int size) {
        ((FragmentB)frmB).changeTextAndSize(message, size);
    }
}
