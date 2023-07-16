package com.instagram.util.share;

import X.C14030oh;
import X.C15730rn;
import X.C18180wK;
import X.C684343t;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.HashMap;

public class ShareUtil$ChosenComponentReceiver extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        int A01 = C14030oh.A01(1572473312);
        String stringExtra = intent.getStringExtra("log_event_name");
        if (stringExtra != null) {
            C15730rn A012 = C15730rn.A01(stringExtra, new C684343t(this, intent.getStringExtra("log_event_module_name")).getModuleName());
            Serializable serializableExtra = intent.getSerializableExtra("log_event_extras");
            if (serializableExtra instanceof HashMap) {
                A012.A0F((HashMap) serializableExtra);
            }
            Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
            if (parcelableExtra instanceof ComponentName) {
                ComponentName componentName = (ComponentName) parcelableExtra;
                A012.A0D("selection_package", componentName.getPackageName());
                A012.A0D("selection_class", componentName.getClassName());
                A012.A0D("selection_short_class", componentName.getShortClassName());
            }
            C18180wK.A1K(A012, C18180wK.A0V(intent.getExtras()));
        }
        C14030oh.A0E(2061294867, A01, intent);
    }
}
