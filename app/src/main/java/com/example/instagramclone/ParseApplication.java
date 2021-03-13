package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("isRB4lobIxE5NOIQ4v10afDuwGco5VYHkaqxxgfm")
                .clientKey("5HWYEfnZwbzsTQWJ8b5JY1MSB4H4LYyGB0TJtO0j")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
