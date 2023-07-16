package X;

import android.content.SharedPreferences;
import com.facebook.proxygen.TraceFieldType;
import java.util.Map;

/* renamed from: X.1o2  reason: invalid class name */
public final class AnonymousClass1o2 extends AnonymousClass3IM {
    public static final Map A05 = AnonymousClass0wJ.A0y();
    public long A00;
    public String A01;
    public final C58233Ep A02;
    public final C58243Eq A03;
    public final String A04;

    public final synchronized void A06() {
        C18180wK.A0u(this.A03.A00.edit(), "id");
        C18180wK.A0u(this.A02.A00.edit(), TraceFieldType.StartTime);
        this.A01 = null;
    }

    public static synchronized AnonymousClass1o2 A00(C11630kW r4, String str) {
        AnonymousClass1o2 r1;
        String str2;
        synchronized (AnonymousClass1o2.class) {
            Map map = A05;
            r1 = (AnonymousClass1o2) map.get(str);
            if (r1 == null) {
                if (r4 == null) {
                    str2 = AnonymousClass00U.A0L("waterfall_", str);
                } else {
                    str2 = r4.getModuleName();
                }
                r1 = new AnonymousClass1o2(str, str2);
                map.put(str, r1);
            }
        }
        return r1;
    }

    public static synchronized AnonymousClass1o2 A01(String str) {
        AnonymousClass1o2 A002;
        synchronized (AnonymousClass1o2.class) {
            A002 = A00((C11630kW) null, str);
        }
        return A002;
    }

    public AnonymousClass1o2(String str, String str2) {
        String A0L = AnonymousClass00U.A0L("waterfall_", str);
        this.A04 = str2;
        SharedPreferences sharedPreferences = C10600ic.A00.getSharedPreferences(A0L, 0);
        this.A03 = new C58243Eq(sharedPreferences, "id");
        this.A02 = new C58233Ep(sharedPreferences, TraceFieldType.StartTime);
    }
}
