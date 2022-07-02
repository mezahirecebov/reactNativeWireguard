package com.reactnativewireguard;
import android.content.Context;
import com.reactnativewireguard.SOLoader;
public final class WireguardWrapper {

    public WireguardWrapper(Context context) {
//        SOLoader.loadSharedLibrary(context, "wg-go");
    }

    // Turn WireGuard on for given tun and config
    // Implementation at src/tools/libwg-go
    public static native int wgTurnOn(String ifName, int tunFd, String settings);

    // Turn WireGuard off
    // Implementation at src/tools/libwg-go
    public static native void wgTurnOff(int handle);

    // Get IPv4 socket
    // Implementation at src/tools/libwg-go
    public static native int wgGetSocketV4(int handle);

    // Get IPv6 socket
    // Implementation at src/tools/libwg-go
    public static native int wgGetSocketV6(int handle);

    // Get wireguard-go version
    // Implementation at src/tools/libwg-go
    public static native String wgVersion();
}
