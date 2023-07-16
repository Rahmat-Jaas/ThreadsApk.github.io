package com.instagram.notifications.push;

import X.C16420t2;
import X.C18230wP;
import android.app.IntentService;
import android.content.ComponentName;
import android.content.Intent;

public class BloksNotificationService extends IntentService {
    public BloksNotificationService() {
        super("BloksNotificationService");
    }

    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            intent = C18230wP.A0B();
        }
        intent.setComponent(new ComponentName(getPackageName(), "com.instagram.mainactivity.MainActivity"));
        intent.setFlags(268435456);
        C16420t2.A00().A08("bloks_deeplink").A09(this, intent);
    }
}
