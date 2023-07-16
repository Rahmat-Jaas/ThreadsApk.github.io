package X;

import android.content.Context;

/* renamed from: X.4GS  reason: invalid class name */
public final class AnonymousClass4GS implements C82884qQ {
    public final Context A00;
    public final boolean A01;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001c, code lost:
        if (1 != r0) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CW4(X.C58743Gz r4) {
        /*
            r3 = this;
            android.content.Context r1 = r3.A00
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r1 = r0.getActiveNetworkInfo()
            r2 = 1
            if (r1 == 0) goto L_0x001e
            boolean r0 = r1.isConnected()
            if (r0 == 0) goto L_0x001e
            int r0 = r1.getType()
            r1 = 1
            if (r2 == r0) goto L_0x001f
        L_0x001e:
            r1 = 0
        L_0x001f:
            boolean r0 = r3.A01
            if (r0 == r1) goto L_0x0024
            r2 = 0
        L_0x0024:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4GS.CW4(X.3Gz):boolean");
    }

    public AnonymousClass4GS(Context context, boolean z) {
        this.A00 = context;
        this.A01 = z;
    }
}
