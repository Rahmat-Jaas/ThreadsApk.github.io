package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.instagram.realtimeclient.RealtimeSubscription;

/* renamed from: X.6y6  reason: invalid class name and case insensitive filesystem */
public final class C117086y6 {
    public static boolean A01(Intent intent) {
        if (!"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            return RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(intent.getStringExtra("google.c.a.e"));
        }
        return false;
    }

    public static void A00(Intent intent, String str) {
        String str2;
        Bundle A06 = C18180wK.A06();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            A06.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            A06.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra3)) {
            A06.putString("label", stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("google.c.a.m_c");
        if (!TextUtils.isEmpty(stringExtra4)) {
            A06.putString("message_channel", stringExtra4);
        }
        String stringExtra5 = intent.getStringExtra("from");
        if (stringExtra5 != null && stringExtra5.startsWith("/topics/")) {
            A06.putString("_nt", stringExtra5);
        }
        if (intent.hasExtra("google.c.a.ts")) {
            try {
                A06.putInt("_nmt", Integer.parseInt(intent.getStringExtra("google.c.a.ts")));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
            }
        }
        if (intent.hasExtra("google.c.a.udt")) {
            try {
                A06.putInt("_ndt", Integer.parseInt(intent.getStringExtra("google.c.a.udt")));
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
            }
        }
        if ("_nr".equals(str) || "_nf".equals(str)) {
            if (intent.getExtras() != null) {
                Bundle extras = intent.getExtras();
                if (RealtimeSubscription.GRAPHQL_MQTT_VERSION.equals(AnonymousClass7J6.A02(extras, "gcm.n.e")) || AnonymousClass7J6.A02(extras, "gcm.n.icon") != null) {
                    str2 = "display";
                    A06.putString("_nmc", str2);
                }
            }
            str2 = "data";
            A06.putString("_nmc", str2);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(A06);
            String.valueOf(str);
            String.valueOf(valueOf);
        }
        C121787Id A00 = C121787Id.A00();
        C121787Id.A01(A00);
        A00.A02.A03(AnonymousClass8eV.class);
        Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
    }
}
