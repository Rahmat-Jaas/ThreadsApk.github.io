package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

/* renamed from: X.0pQ  reason: invalid class name and case insensitive filesystem */
public final class C14440pQ implements C16210sf {
    public final /* synthetic */ C14460pS A00;

    public C14440pQ(C14460pS r1) {
        this.A00 = r1;
    }

    public final void CEI(Context context, Intent intent, C16200se r10) {
        String A01;
        Object[] objArr;
        String str;
        String stringExtra = intent.getStringExtra("extra_mqtt_endpoint");
        String stringExtra2 = intent.getStringExtra("extra_analytics_endpoint");
        String stringExtra3 = intent.getStringExtra("extra_fbns_endpoint");
        String stringExtra4 = intent.getStringExtra("extra_fbns_analytics_endpoint");
        C14460pS r2 = this.A00;
        C15740ro r1 = new C15740ro();
        r1.A01();
        r1.A04("MQTT_CONFIG_CHANGE_DOMAIN");
        if (!r1.A00().A01(context, intent, (C16240si) null)) {
            A01 = r2.A01();
            objArr = new Object[]{stringExtra, stringExtra2, stringExtra3, stringExtra4};
            str = "ignore unauthorized sender %s, %s, %s, %s";
        } else if (!r2.A06(stringExtra) || !r2.A06(stringExtra3)) {
            A01 = r2.A01();
            objArr = new Object[]{stringExtra, stringExtra2, stringExtra3, stringExtra4};
            str = "ignore illegal target endpoint switch %s, %s, %s, %s";
        } else {
            Integer num = r2.A02;
            if (num == AnonymousClass006.A01 || num == AnonymousClass006.A0C) {
                if (!TextUtils.isEmpty(stringExtra3)) {
                    stringExtra = stringExtra3;
                }
                if (!TextUtils.isEmpty(stringExtra4)) {
                    stringExtra2 = stringExtra4;
                }
            }
            String str2 = r2.A06;
            if (str2 != null ? str2.equals(stringExtra) : stringExtra == null) {
                String str3 = r2.A05;
                if (str3 == null) {
                    if (stringExtra2 == null) {
                        return;
                    }
                } else if (str3.equals(stringExtra2)) {
                    return;
                }
            }
            r2.A05(stringExtra, stringExtra2);
            r2.A06 = stringExtra;
            r2.A05 = stringExtra2;
            r2.A01.A02();
            return;
        }
        AnonymousClass0LU.A0O(A01, str, objArr);
    }
}
