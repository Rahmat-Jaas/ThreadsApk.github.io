package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;

public class KtLambdaShape8S1000000_I2 extends C02220Ah implements AnonymousClass0ZU {
    public String A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape8S1000000_I2(String str, int i) {
        super(0);
        this.A01 = i;
        this.A00 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0053, code lost:
        return kotlin.Unit.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r3.A00 == null) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r3.A00 != null) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r3.A00.length() > 0) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r3 = this;
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x002a;
                case 1: goto L_0x0022;
                case 2: goto L_0x0012;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0048;
                case 6: goto L_0x0048;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x0012;
                case 11: goto L_0x0012;
                case 12: goto L_0x0005;
                case 13: goto L_0x000d;
                case 14: goto L_0x000d;
                case 15: goto L_0x0008;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r1 = r3.A00
            return r1
        L_0x0008:
            java.lang.String r0 = r3.A00
            if (r0 != 0) goto L_0x0020
            goto L_0x001a
        L_0x000d:
            java.lang.String r0 = r3.A00
            if (r0 == 0) goto L_0x0020
            goto L_0x001a
        L_0x0012:
            java.lang.String r0 = r3.A00
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0020
        L_0x001a:
            r0 = 1
        L_0x001b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            return r1
        L_0x0020:
            r0 = 0
            goto L_0x001b
        L_0x0022:
            java.lang.String r0 = r3.A00
            X.7tY r1 = new X.7tY
            r1.<init>(r0)
            return r1
        L_0x002a:
            java.lang.String r2 = r3.A00
            int r1 = r2.length()
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 <= r0) goto L_0x0041
            r1 = 0
            r0 = 126(0x7e, float:1.77E-43)
            java.lang.String r1 = X.C18230wP.A0s(r2, r1, r0)
            r0 = 8230(0x2026, float:1.1533E-41)
            java.lang.String r2 = X.AnonymousClass00U.A0A(r1, r0)
        L_0x0041:
            r0 = 1002497425(0x3bc0e591, float:0.0058867414)
            X.C13790oJ.A01(r2, r0)
            goto L_0x0051
        L_0x0048:
            X.7xj r1 = X.C134457xj.A04
            if (r1 == 0) goto L_0x0054
            java.lang.String r0 = r3.A00
            r1.A01(r0)
        L_0x0051:
            kotlin.Unit r1 = kotlin.Unit.A00
            return r1
        L_0x0054:
            java.lang.String r0 = "instance"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.KtLambdaShape8S1000000_I2.invoke():java.lang.Object");
    }
}
