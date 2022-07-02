package com.reactnativewireguard;
import androidx.annotation.NonNull;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import android.util.Log;

public class TestNativeModule extends ReactContextBaseJavaModule {
    TestNativeModule(ReactApplicationContext context) {
        super(context);
    }
    @NonNull
    @Override
    public String getName() {
        return "TestNativeModule";
    }
    @ReactMethod
    public void testFunctionality(String var1, String var2) {
        Log.d("TestNativeModule", "var1: " + var1
                + " and var2: " + var2);
    }
}
