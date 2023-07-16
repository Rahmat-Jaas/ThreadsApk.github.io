package com.instagram.perf.classpreload;

import com.instagram.barcelona.app.BarcelonaAppShell;

public class ColdStartClassPreloader {
    public static void preloadClasses() {
        Class<BarcelonaAppShell> cls = BarcelonaAppShell.class;
    }
}
