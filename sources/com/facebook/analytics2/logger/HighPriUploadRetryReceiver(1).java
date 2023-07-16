package com.facebook.analytics2.logger;

import X.AnonymousClass0BG;
import X.C14030oh;
import X.C16100sU;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class HighPriUploadRetryReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = C14030oh.A01(-2076586290);
        if (!C16100sU.A00().A01(context, intent, this)) {
            i = -229168020;
        } else if (!"com.facebook.analytics2.logger.UPLOAD_NOW".equals(intent.getAction())) {
            i = -924418485;
        } else {
            new AnonymousClass0BG(goAsync(), context, intent, this).start();
            i = 1350813536;
        }
        C14030oh.A0E(i, A01, intent);
    }
}
