package com.bravedroid.daggerexample.di;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class StringModule {
    @Named("test string")
    @Provides
    static String someString() {
        return "this is a test sppppptring";
    }


    @Named("super string")
    @Provides
    static String superString() {
        return "this is a ***super*** string !!!!!!";
    }
}
