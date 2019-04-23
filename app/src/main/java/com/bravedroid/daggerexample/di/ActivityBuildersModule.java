package com.bravedroid.daggerexample.di;

import com.bravedroid.daggerexample.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module(includes = {StringModule.class})
public abstract class ActivityBuildersModule {
    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();
}
