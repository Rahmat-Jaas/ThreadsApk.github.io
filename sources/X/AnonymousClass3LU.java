package X;

import android.content.Context;

/* renamed from: X.3LU  reason: invalid class name */
public final class AnonymousClass3LU {
    public static final void A00(Context context, AnonymousClass3XX r4, String str) {
        String str2;
        AnonymousClass1S4 r1;
        String str3 = null;
        if (r4 == null || (r1 = (AnonymousClass1S4) r4.A00) == null) {
            str2 = null;
        } else {
            str2 = r1.A00;
            str3 = r1.getErrorMessage();
        }
        A01(context, str, str2, str3);
    }

    public static final void A01(Context context, String str, String str2, String str3) {
        if (str3 != null && !AnonymousClass8bQ.A0n(str3)) {
            C63733iD A02 = C63733iD.A02();
            A02.A0E = str;
            A02.A0A = str2;
            A02.A0F = str3;
            C63733iD.A0A(A02);
        } else if (context != null) {
            C63813iO.A03(context, (String) null, 2131826851, 0);
        }
    }
}
