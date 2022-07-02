package com.reactnativewireguard;

import android.util.Log;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class WireguardNativeModule extends ReactContextBaseJavaModule {
    private final WireguardWrapper wireguard;

    @NonNull
    @Override
    public String getName() {
        return "WireguardNativeModule";
    }

    public WireguardNativeModule(final ReactApplicationContext reactContext){
        wireguard=new WireguardWrapper(reactContext);
    }

    @ReactMethod
    public void version(Promise promise) {
        Log.d("function", "wireguard-go version");
//        promise.resolve(wireguard.wgVersion());
    }
}
