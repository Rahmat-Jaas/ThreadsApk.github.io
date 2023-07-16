package com.mapbox.mapboxsdk.maps.renderer;

public class MapRendererRunnable implements Runnable {
    private native void nativeInitialize();

    public native void finalize();

    public native void run();
}
