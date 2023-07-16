package X;

import java.util.Map;

/* renamed from: X.3YK  reason: invalid class name */
public final class AnonymousClass3YK {
    public static final long A0B = C18230wP.A07();
    public int A00;
    public int A01;
    public long A02;
    public AnonymousClass34U A03;
    public C61163Sd A04;
    public C61163Sd A05;
    public final double A06;
    public final AnonymousClass34V A07;
    public final C08960ea A08;
    public final String A09;
    public final Map A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r1 == null) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C61163Sd A00(X.AnonymousClass3YK r4) {
        /*
            X.34U r0 = r4.A03
            r2 = 0
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "groupOverrideProvider"
            X.C04220Ms.A0E(r0)
            throw r2
        L_0x000b:
            java.lang.String r1 = r4.A09
            X.0et r0 = r0.A00
            android.content.SharedPreferences r0 = r0.A00
            java.lang.String r2 = r0.getString(r1, r2)
            if (r2 == 0) goto L_0x003e
            X.34V r1 = r4.A07
            r0 = 25
            kotlin.jvm.internal.KtLambdaShape6S1000000_I2 r3 = new kotlin.jvm.internal.KtLambdaShape6S1000000_I2
            r3.<init>(r2, r0)
            java.util.List r0 = r1.A00
            java.util.Iterator r2 = r0.iterator()
        L_0x0026:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004a
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r3.invoke(r1)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == 0) goto L_0x0026
            X.3Sd r1 = (X.C61163Sd) r1
            if (r1 != 0) goto L_0x0049
        L_0x003e:
            X.3Sd r1 = r4.A04
            if (r1 != 0) goto L_0x0049
            java.lang.String r0 = "allocatedGroup"
            X.C04220Ms.A0E(r0)
            r1 = 0
            throw r1
        L_0x0049:
            return r1
        L_0x004a:
            java.lang.String r0 = "Collection contains no element matching the predicate."
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3YK.A00(X.3YK):X.3Sd");
    }

    public final void A01(String str) {
        AnonymousClass34U r0 = this.A03;
        if (r0 == null) {
            C04220Ms.A0E("groupOverrideProvider");
            throw null;
        }
        C18180wK.A0v(r0.A00.A00.edit(), this.A09, str);
    }

    public AnonymousClass3YK(AnonymousClass34V r2, C08960ea r3, String str, Map map, double d) {
        AnonymousClass0wJ.A1O(str, r2);
        C04220Ms.A0B(map, 4);
        this.A09 = str;
        this.A07 = r2;
        this.A06 = d;
        this.A0A = map;
        this.A08 = r3;
    }
}
