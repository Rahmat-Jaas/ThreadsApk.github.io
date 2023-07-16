package com.facebook.startup.services;

import X.C18040w1;
import X.C18080w5;
import X.C18210wN;
import android.content.Intent;

public abstract class CompatibleAsyncServiceDelegate extends C18040w1 {
    public final int A07(Intent intent, int i, int i2) {
        throw C18210wN.A0W("onStartCommandNullable");
    }

    public CompatibleAsyncServiceDelegate(C18080w5 r1) {
        super(r1);
    }
}
