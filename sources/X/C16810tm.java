package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.0tm  reason: invalid class name and case insensitive filesystem */
public final class C16810tm {
    public final long A00 = SystemClock.elapsedRealtime();
    public final SharedPreferences A01;
    public final C14930qQ A02;
    public final AnonymousClass0NR A03;
    public final AnonymousClass068 A04;
    public final String A05;
    public final RealtimeSinceBootClock A06;
    public final C16410t1 A07;

    public final void A00(Integer num, String str) {
        String str2;
        if (num.intValue() != 0) {
            str2 = "UNEXPECTED_TOPIC";
        } else {
            str2 = "JSON_PARSE_ERROR";
        }
        Map A012 = C14740q4.A01("event_type", str2);
        if (!TextUtils.isEmpty(str)) {
            A012.put("event_extra_info", str);
        }
        C15170qr r2 = new C15170qr("fbns_service_event", this.A05, Locale.getDefault().toString(), Build.MODEL, Build.MANUFACTURER);
        r2.A02(A012);
        this.A02.reportEvent(r2);
    }

    public final void A01(String str, String str2, String str3, Map map, long j, long j2, boolean z, boolean z2) {
        Map map2 = map;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.A00;
        long j4 = elapsedRealtime - j;
        AtomicLong atomicLong = this.A04.A06;
        long j5 = elapsedRealtime - atomicLong.get();
        long j6 = elapsedRealtime - j2;
        if (j2 < 0) {
            j6 = 0;
        }
        if (map == null) {
            map2 = new HashMap();
        }
        map2.put("prev_running", String.valueOf(z));
        map2.put("nsid", Long.toString(atomicLong.get()));
        C16610tO r13 = new C16610tO(str, this.A05, Locale.getDefault().toString(), Build.MODEL, Build.MANUFACTURER);
        r13.A06 = str2;
        r13.A05 = str3;
        r13.A00 = elapsedRealtime;
        r13.A04 = j3;
        r13.A01 = j4;
        r13.A02 = j5;
        r13.A03 = j6;
        r13.A09 = z2;
        r13.A08 = this.A01.getBoolean("is_employee", false);
        r13.A02(map2);
        r13.toString();
        this.A02.reportEvent(r13);
    }

    public C16810tm(Context context, SharedPreferences sharedPreferences, C14930qQ r5, RealtimeSinceBootClock realtimeSinceBootClock, AnonymousClass0NR r7, AnonymousClass068 r8, C16410t1 r9) {
        this.A05 = context.getPackageName();
        this.A04 = r8;
        this.A06 = realtimeSinceBootClock;
        this.A02 = r5;
        this.A01 = sharedPreferences;
        this.A03 = r7;
        this.A07 = r9;
    }
}
