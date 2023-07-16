package X;

import java.util.Map;

/* renamed from: X.7nb  reason: invalid class name and case insensitive filesystem */
public final class C129907nb implements C41836MeS {
    public final long A00;
    public final Map A01;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        if (r3 != 0) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean apply(java.lang.Object r12) {
        /*
            r11 = this;
            X.JrZ r12 = (X.C37415JrZ) r12
            r10 = 0
            if (r12 == 0) goto L_0x003f
            X.BKU r9 = X.C86144wL.A0W(r12)
            if (r9 == 0) goto L_0x003f
            java.util.Map r1 = r11.A01
            X.Iu1 r0 = r12.A0P
            java.lang.Number r0 = X.C86124wJ.A0j(r0, r1)
            if (r0 == 0) goto L_0x0045
            long r5 = r0.longValue()
        L_0x0019:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = java.lang.System.currentTimeMillis()
            long r7 = r2.toSeconds(r0)
            boolean r0 = X.C19540Ay1.A04(r9)
            if (r0 == 0) goto L_0x0040
            X.BKN r0 = r9.A0f
            java.lang.Long r0 = r0.A40
            if (r0 == 0) goto L_0x0040
            long r3 = r0.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0040
        L_0x0039:
            long r3 = r3 + r5
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x003f
            r10 = 1
        L_0x003f:
            return r10
        L_0x0040:
            long r3 = r9.A1t()
            goto L_0x0039
        L_0x0045:
            long r5 = r11.A00
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C129907nb.apply(java.lang.Object):boolean");
    }

    public C129907nb(long j, Map map) {
        this.A01 = map;
        this.A00 = j;
    }
}
