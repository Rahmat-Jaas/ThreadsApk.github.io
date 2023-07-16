package com.facebook.video.heroplayer.service;

import X.AnonymousClass4yV;
import X.C14030oh;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class HeroKeepAliveService extends Service {
    public final Binder A00 = new AnonymousClass4yV();

    public final int onStartCommand(Intent intent, int i, int i2) {
        int A04 = C14030oh.A04(87171365);
        int onStartCommand = super.onStartCommand(intent, i, i2);
        C14030oh.A0B(-552491219, A04);
        return onStartCommand;
    }

    public final IBinder onBind(Intent intent) {
        return this.A00;
    }
}
