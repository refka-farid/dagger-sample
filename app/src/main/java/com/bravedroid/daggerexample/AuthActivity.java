package com.bravedroid.daggerexample;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.support.DaggerAppCompatActivity;

public class AuthActivity extends DaggerAppCompatActivity {
    private static final String TAG = AuthActivity.class.getSimpleName();

    @Named("super string")
    @Inject
    String injectedString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        TextView textView = findViewById(R.id.tv_activity_auth);
        textView.setText(injectedString);

        Log.d(TAG, "onCreate " + injectedString);
    }
}
