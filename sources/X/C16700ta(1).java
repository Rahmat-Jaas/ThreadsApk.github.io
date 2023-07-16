package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.redex.IDxReporterShape810S0100000_I2;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0ta  reason: invalid class name and case insensitive filesystem */
public final class C16700ta {
    public AlarmManager A00;
    public Context A01;
    public C12710mM A02;
    public C12790mU A03;
    public AnonymousClass0P7 A04;
    public Map A05;
    public RealtimeSinceBootClock A06;
    public final C16240si A07 = new IDxReporterShape810S0100000_I2(this, 1);

    public final void A00(String str) {
        PendingIntent pendingIntent = (PendingIntent) this.A05.remove(str);
        if (pendingIntent != null) {
            this.A04.A00(this.A00, pendingIntent);
        }
        SharedPreferences.Editor edit = this.A03.A00.edit();
        edit.putLong(str, 120000);
        edit.apply();
    }

    public C16700ta(Context context, C12710mM r4, C12800mV r5, RealtimeSinceBootClock realtimeSinceBootClock, AnonymousClass0P7 r7, AnonymousClass0OX r8) {
        this.A01 = context;
        C09740gb A002 = r8.A00(AlarmManager.class, "alarm");
        if (A002.A01()) {
            this.A00 = (AlarmManager) A002.A00();
            this.A03 = r5.A00(AnonymousClass006.A1L);
            this.A06 = realtimeSinceBootClock;
            this.A02 = r4;
            this.A04 = r7;
            this.A05 = new HashMap();
            return;
        }
        throw new IllegalArgumentException("Cannot acquire Alarm service");
    }
}
