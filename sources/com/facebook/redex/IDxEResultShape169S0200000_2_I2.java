package com.facebook.redex;

import X.C142818fe;
import X.C147258p3;
import X.C147368pE;

public class IDxEResultShape169S0200000_2_I2 implements C142818fe {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxEResultShape169S0200000_2_I2(C147258p3 r1, C147368pE r2, int i) {
        this.A02 = i;
        switch (i) {
            case 4:
            case 5:
            case 6:
                this.A00 = r2;
                this.A01 = r1;
                break;
            default:
                this.A01 = r2;
                this.A00 = r1;
                break;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0081, code lost:
        r2.D7s(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0098, code lost:
        r0 = (X.C147258p3) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009a, code lost:
        if (r0 == null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009c, code lost:
        r0.D7s(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009f, code lost:
        r3.CrC((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bc, code lost:
        r0 = r2.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00be, code lost:
        r0.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d9, code lost:
        r1.A08(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00dc, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispose() {
        /*
            r4 = this;
            int r0 = r4.A02
            switch(r0) {
                case 0: goto L_0x011b;
                case 1: goto L_0x0019;
                case 2: goto L_0x00a4;
                case 3: goto L_0x0011;
                case 4: goto L_0x0085;
                case 5: goto L_0x006c;
                case 6: goto L_0x0054;
                case 7: goto L_0x0037;
                case 8: goto L_0x010f;
                case 9: goto L_0x0101;
                case 10: goto L_0x0023;
                case 11: goto L_0x00f1;
                case 12: goto L_0x00dd;
                case 13: goto L_0x00cf;
                case 14: goto L_0x00c2;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r4.A01
            X.7KG r0 = (X.AnonymousClass7KG) r0
            java.lang.Object r1 = r4.A00
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A0L
            r0.remove(r1)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r2 = r4.A00
            X.6vT r2 = (X.C115556vT) r2
            java.lang.Object r1 = r4.A01
            goto L_0x00bc
        L_0x0019:
            java.lang.Object r0 = r4.A00
            X.6vT r0 = (X.C115556vT) r0
            java.lang.Object r1 = r4.A01
            X.84D r0 = r0.A0A
            goto L_0x00be
        L_0x0023:
            java.lang.Object r3 = r4.A01
            X.8pE r3 = (X.C147368pE) r3
            java.lang.Object r0 = r3.getValue()
            X.7Uv r0 = (X.C122987Uv) r0
            if (r0 == 0) goto L_0x0010
            X.7Uu r1 = new X.7Uu
            r1.<init>(r0)
            java.lang.Object r0 = r4.A00
            goto L_0x0098
        L_0x0037:
            java.lang.Object r2 = r4.A00
            X.7IK r2 = (X.AnonymousClass7IK) r2
            java.lang.Object r1 = r4.A01
            android.view.View r1 = (android.view.View) r1
            int r0 = r2.A00
            int r0 = r0 + -1
            r2.A00 = r0
            if (r0 != 0) goto L_0x0010
            r0 = 0
            X.C006002r.A00(r1, r0)
            X.AnonymousClass03O.A01(r1, r0)
            X.55n r0 = r2.A0A
            r1.removeOnAttachStateChangeListener(r0)
            return
        L_0x0054:
            java.lang.Object r3 = r4.A00
            X.8pE r3 = (X.C147368pE) r3
            java.lang.Object r0 = r3.getValue()
            X.7Ul r0 = (X.C122907Ul) r0
            if (r0 == 0) goto L_0x0010
            java.lang.Object r2 = r4.A01
            X.8p3 r2 = (X.C147258p3) r2
            if (r2 == 0) goto L_0x009f
            X.7Uo r1 = new X.7Uo
            r1.<init>(r0)
            goto L_0x0081
        L_0x006c:
            java.lang.Object r3 = r4.A00
            X.8pE r3 = (X.C147368pE) r3
            java.lang.Object r2 = r4.A01
            X.8p3 r2 = (X.C147258p3) r2
            java.lang.Object r0 = r3.getValue()
            X.7Un r0 = (X.C122927Un) r0
            if (r0 == 0) goto L_0x0010
            X.7Ur r1 = new X.7Ur
            r1.<init>(r0)
        L_0x0081:
            r2.D7s(r1)
            goto L_0x009f
        L_0x0085:
            java.lang.Object r3 = r4.A00
            X.8pE r3 = (X.C147368pE) r3
            java.lang.Object r0 = r3.getValue()
            X.7Um r0 = (X.C122917Um) r0
            if (r0 == 0) goto L_0x0010
            X.7Uq r1 = new X.7Uq
            r1.<init>(r0)
            java.lang.Object r0 = r4.A01
        L_0x0098:
            X.8p3 r0 = (X.C147258p3) r0
            if (r0 == 0) goto L_0x009f
            r0.D7s(r1)
        L_0x009f:
            r0 = 0
            r3.CrC(r0)
            return
        L_0x00a4:
            java.lang.Object r2 = r4.A01
            X.6vT r2 = (X.C115556vT) r2
            java.lang.Object r1 = r4.A00
            X.6pr r1 = (X.C112586pr) r1
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.8pE r0 = r1.A00
            java.lang.Object r0 = r0.getValue()
            X.7WU r0 = (X.AnonymousClass7WU) r0
            if (r0 == 0) goto L_0x0010
            X.7WX r1 = r0.A02
        L_0x00bc:
            X.84D r0 = r2.A09
        L_0x00be:
            r0.remove((java.lang.Object) r1)
            return
        L_0x00c2:
            java.lang.Object r0 = r4.A00
            X.066 r0 = (X.AnonymousClass066) r0
            X.062 r1 = r0.getLifecycle()
            java.lang.Object r0 = r4.A01
            com.instagram.quickpromotion.presenter.QPLifecyclePresenterImpl r0 = (com.instagram.quickpromotion.presenter.QPLifecyclePresenterImpl) r0
            goto L_0x00d9
        L_0x00cf:
            java.lang.Object r0 = r4.A00
            X.7Zx r0 = (X.C123917Zx) r0
            X.0pE r1 = r0.A02
            java.lang.Object r0 = r4.A01
            X.065 r0 = (X.AnonymousClass065) r0
        L_0x00d9:
            r1.A08(r0)
            return
        L_0x00dd:
            java.lang.Object r2 = r4.A01
            X.6tX r2 = (X.C114586tX) r2
            java.lang.Object r1 = r4.A00
            X.7Zx r1 = (X.C123917Zx) r1
            r0 = 0
            X.C04220Ms.A0B(r1, r0)
            X.7F7 r0 = r2.A00()
            r0.A04(r1)
            return
        L_0x00f1:
            java.lang.Object r0 = r4.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.Context r1 = r0.getApplicationContext()
            java.lang.Object r0 = r4.A00
            X.7LP r0 = (X.AnonymousClass7LP) r0
            r1.unregisterComponentCallbacks(r0)
            return
        L_0x0101:
            java.lang.Object r0 = r4.A00
            androidx.compose.foundation.relocation.BringIntoViewRequester r0 = (androidx.compose.foundation.relocation.BringIntoViewRequester) r0
            androidx.compose.foundation.relocation.BringIntoViewRequesterImpl r0 = (androidx.compose.foundation.relocation.BringIntoViewRequesterImpl) r0
            X.84X r1 = r0.A00
            java.lang.Object r0 = r4.A01
            r1.A0E(r0)
            return
        L_0x010f:
            java.lang.Object r0 = r4.A01
            X.7Wb r0 = (X.AnonymousClass7Wb) r0
            java.util.Set r1 = r0.A02
            java.lang.Object r0 = r4.A00
            r1.add(r0)
            return
        L_0x011b:
            java.lang.Object r0 = r4.A00
            X.6pq r0 = (X.C112576pq) r0
            java.lang.Object r1 = r4.A01
            X.84X r0 = r0.A03
            r0.A0E(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxEResultShape169S0200000_2_I2.dispose():void");
    }

    public IDxEResultShape169S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }
}
