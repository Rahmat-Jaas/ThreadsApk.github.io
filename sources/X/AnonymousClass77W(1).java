package X;

import android.util.LruCache;

/* renamed from: X.77W  reason: invalid class name */
public final class AnonymousClass77W {
    public static final long A01 = AnonymousClass728.A00(C972768s.HOURS, 2);
    public final LruCache A00 = new LruCache(20);

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        if (r13.length() == 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C110606ly A00(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            if (r13 == 0) goto L_0x0009
            int r0 = r13.length()
            r1 = 0
            if (r0 != 0) goto L_0x000a
        L_0x0009:
            r1 = 1
        L_0x000a:
            r0 = 0
            if (r1 != 0) goto L_0x003a
            if (r14 == 0) goto L_0x003a
            int r1 = r14.length()
            if (r1 == 0) goto L_0x003a
            X.6tl r10 = new X.6tl
            r10.<init>(r13, r14)
            android.util.LruCache r11 = r12.A00
            java.lang.Object r9 = r11.get(r10)
            X.6tm r9 = (X.C114716tm) r9
            if (r9 == 0) goto L_0x003a
            long r3 = r9.A00
            long r7 = java.lang.System.currentTimeMillis()
            long r5 = A01
            X.68s r1 = X.C972768s.MILLISECONDS
            long r1 = X.C134797yO.A00(r1, r5)
            long r7 = r7 - r1
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x003b
            r11.remove(r10)
        L_0x003a:
            return r0
        L_0x003b:
            X.6ly r0 = r9.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass77W.A00(java.lang.String, java.lang.String):X.6ly");
    }
}
