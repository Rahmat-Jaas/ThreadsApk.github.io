package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.0ET  reason: invalid class name */
public final class AnonymousClass0ET extends C14460pS {
    public final String A00() {
        return "com.facebook.rti.mqtt.ACTION_WORK_SWITCH";
    }

    public final String A01() {
        return "WorkConnectionConfigOverrides";
    }

    public final Set A02() {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"facebook.com", "workplace.com"})));
    }

    public final void A05(String str, String str2) {
        SharedPreferences.Editor edit = this.A04.A00(AnonymousClass006.A08).A00.edit();
        edit.putString("work_last_host", str);
        edit.putString("work_last_analytics_endpoint", str2);
        edit.apply();
    }

    public AnonymousClass0ET(Context context, C12800mV r5, AnonymousClass0L5 r6, Integer num) {
        super(context, r5, r6, num);
        SharedPreferences sharedPreferences = this.A04.A00(AnonymousClass006.A08).A00;
        this.A06 = sharedPreferences.getString("work_last_host", (String) null);
        this.A05 = sharedPreferences.getString("work_last_analytics_endpoint", (String) null);
    }

    public final void A03() {
    }
}
