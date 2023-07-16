package com.instagram.notifications.actions;

import X.AnonymousClass0wJ;
import X.C10650ih;
import X.C14030oh;
import X.C16100sU;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

public final class NotificationActionReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A01 = C14030oh.A01(1216520724);
        AnonymousClass0wJ.A1N(context, intent);
        if (!C16100sU.A00().A01(context, intent, this)) {
            i = -700991975;
        } else {
            intent.setComponent(new ComponentName(context, ActionHandlerIntentService.class));
            C10650ih.A03(context, intent);
            i = -1972662098;
        }
        C14030oh.A0E(i, A01, intent);
    }
}
