package X;

import android.util.Log;
import java.util.Locale;

/* renamed from: X.6sD  reason: invalid class name and case insensitive filesystem */
public final class C113826sD {
    public final int A00;
    public final String A01;
    public final String A02;
    public final C99326Iz A03;

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0014 A[LOOP:0: B:4:0x0014->B:7:0x001f, LOOP_START, PHI: r1 
      PHI: (r1v2 int) = (r1v1 int), (r1v4 int) binds: [B:3:0x0005, B:7:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C113826sD(java.lang.String r7, java.lang.String... r8) {
        /*
            r6 = this;
            int r5 = r8.length
            if (r5 != 0) goto L_0x0022
            java.lang.String r0 = ""
        L_0x0005:
            r6.<init>()
            r6.A02 = r0
            r6.A01 = r7
            X.6Iz r0 = new X.6Iz
            r0.<init>(r7)
            r6.A03 = r0
            r1 = 2
        L_0x0014:
            java.lang.String r0 = r6.A01
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 != 0) goto L_0x0045
            int r1 = r1 + 1
            r0 = 7
            if (r1 > r0) goto L_0x0045
            goto L_0x0014
        L_0x0022:
            java.lang.String r0 = "["
            java.lang.StringBuilder r4 = X.C18190wL.A0s(r0)
            r3 = 0
        L_0x0029:
            r2 = r8[r3]
            int r1 = r4.length()
            r0 = 1
            if (r1 <= r0) goto L_0x0037
            java.lang.String r0 = ","
            r4.append(r0)
        L_0x0037:
            r4.append(r2)
            int r3 = r3 + 1
            if (r3 < r5) goto L_0x0029
            java.lang.String r0 = "] "
            java.lang.String r0 = X.C18180wK.A0i(r0, r4)
            goto L_0x0005
        L_0x0045:
            r6.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C113826sD.<init>(java.lang.String, java.lang.String[]):void");
    }

    public final void A00(String str, Object... objArr) {
        if (this.A00 <= 3 && objArr.length > 0) {
            String.format(Locale.US, str, objArr);
        }
    }

    public final void A01(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        Log.w("Auth", this.A02.concat(str));
    }
}
