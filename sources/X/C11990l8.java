package X;

import android.content.Context;
import android.util.Pair;
import com.facebook.proxygen.TraceFieldType;

/* renamed from: X.0l8  reason: invalid class name and case insensitive filesystem */
public final class C11990l8 implements AnonymousClass0W9 {
    public final Context A00;

    public final String AHL() {
        return "network_stats";
    }

    public final long BgD() {
        return 1;
    }

    public final void CCC(C05800Wc r5) {
        String str;
        if (r5.BWB(1)) {
            Pair A02 = AnonymousClass0fS.A02(AnonymousClass0fS.A00());
            r5.AvU().A03(TraceFieldType.NetworkType, A02.first);
            r5.AvU().A03("network_subtype", A02.second);
            switch (A00().intValue()) {
                case 1:
                    str = "POOR";
                    break;
                case 2:
                    str = "MODERATE";
                    break;
                case 3:
                    str = "GOOD";
                    break;
                case 4:
                    str = "EXCELLENT";
                    break;
                default:
                    str = "UNKNOWN";
                    break;
            }
            r5.AvU().A03("connqual", str);
        }
    }

    public C11990l8(Context context) {
        this.A00 = context;
    }

    public static Integer A00() {
        C38014KGk A01 = C38014KGk.A01();
        if (A01 == null) {
            return AnonymousClass006.A00;
        }
        return A01.A05();
    }

    public final boolean BTR(C08640dy r2) {
        return true;
    }
}
