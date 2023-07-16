package com.facebook.memory.ion;

import X.C15020qa;

public class IonMemory {
    public static native synchronized boolean allocate(int i);

    public static native synchronized boolean freeAllPreviousAllocations();

    public static native synchronized void listIonHeaps();

    static {
        C15020qa.A0A("ionmemory");
    }
}
