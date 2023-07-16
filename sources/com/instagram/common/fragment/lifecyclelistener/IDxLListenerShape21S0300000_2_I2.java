package com.instagram.common.fragment.lifecyclelistener;

import X.AnonymousClass0YY;
import X.AnonymousClass5HM;
import X.AnonymousClass601;
import X.C103326Yt;
import X.C108446iN;
import X.C121247Ez;
import X.C130667qT;
import X.C19819BBt;
import X.C63913ic;

public class IDxLListenerShape21S0300000_2_I2 extends C19819BBt {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxLListenerShape21S0300000_2_I2(C130667qT r1, C121247Ez r2, AnonymousClass5HM r3, int i) {
        this.A03 = i;
        this.A00 = r2;
        if (2 - i != 0) {
            this.A02 = r3;
            this.A01 = r1;
        } else {
            this.A01 = r3;
            this.A02 = r1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0093, code lost:
        if (r6 == 2) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            int r0 = r5.A03
            switch(r0) {
                case 0: goto L_0x005d;
                case 1: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onActivityResult(r6, r7, r8)
        L_0x0008:
            return
        L_0x0009:
            java.lang.Object r0 = r5.A00
            X.601 r0 = (X.AnonymousClass601) r0
            X.C63913ic.A0R(r0, r5)
            r0 = 1
            if (r6 != r0) goto L_0x0029
            r0 = -1
            if (r7 == r0) goto L_0x0034
            if (r7 != 0) goto L_0x0029
            java.lang.Object r2 = r5.A01
            X.6q6 r2 = (X.C112736q6) r2
            java.lang.Object r1 = r5.A02
            java.io.File r1 = (java.io.File) r1
            java.lang.Integer r0 = X.AnonymousClass006.A0C
        L_0x0022:
            r2.A00(r0)
            r1.delete()
            return
        L_0x0029:
            java.lang.Object r2 = r5.A01
            X.6q6 r2 = (X.C112736q6) r2
            java.lang.Object r1 = r5.A02
            java.io.File r1 = (java.io.File) r1
            java.lang.Integer r0 = X.AnonymousClass006.A0N
            goto L_0x0022
        L_0x0034:
            java.lang.Object r3 = r5.A01
            X.6q6 r3 = (X.C112736q6) r3
            java.lang.Object r0 = r5.A02
            java.io.File r0 = (java.io.File) r0
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            java.lang.String r1 = r0.toString()
            X.6jp r2 = r3.A03
            if (r2 == 0) goto L_0x0008
            X.3HX r0 = r3.A01
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.util.List r0 = java.util.Arrays.asList(r0)
            X.3iY r1 = new X.3iY
            r1.<init>(r0)
            X.601 r0 = r3.A02
            X.C61043Rr.A00(r0, r1, r2)
            return
        L_0x005d:
            r0 = 2
            if (r6 != r0) goto L_0x0093
            r0 = -1
            if (r7 != r0) goto L_0x0095
            boolean r0 = X.AnonymousClass7CJ.A00
            if (r0 != 0) goto L_0x00a6
            r0 = 1
            X.AnonymousClass7CJ.A00 = r0
            java.lang.Object r4 = r5.A01
            android.content.Context r4 = (android.content.Context) r4
            java.lang.Object r3 = r5.A02
            X.601 r3 = (X.AnonymousClass601) r3
            java.lang.Object r2 = r5.A00
            X.3iY r2 = (X.C63893iY) r2
            if (r8 == 0) goto L_0x00a6
            android.net.Uri r0 = r8.getData()
            if (r0 == 0) goto L_0x00a6
            android.net.Uri r1 = r8.getData()     // Catch:{ IOException | RuntimeException -> 0x008e }
            r0 = 0
            java.io.File r0 = X.C29252Fkw.A00(r4, r1, r0, r0)     // Catch:{ IOException | RuntimeException -> 0x008e }
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ IOException | RuntimeException -> 0x008e }
            if (r0 == 0) goto L_0x00a6
            goto L_0x00a3
        L_0x008e:
            r0 = move-exception
            r0.printStackTrace()
            goto L_0x00a6
        L_0x0093:
            if (r6 != r0) goto L_0x00a6
        L_0x0095:
            if (r7 != 0) goto L_0x00a6
            java.lang.Object r1 = r5.A02
            X.601 r1 = (X.AnonymousClass601) r1
            java.lang.Object r0 = r5.A00
            X.3iY r0 = (X.C63893iY) r0
            X.AnonymousClass7GY.A02(r1, r0)
            goto L_0x00a6
        L_0x00a3:
            X.AnonymousClass7GY.A01(r0, r3, r2)
        L_0x00a6:
            java.lang.Object r0 = r5.A02
            X.601 r0 = (X.AnonymousClass601) r0
            X.C63913ic.A0R(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.fragment.lifecyclelistener.IDxLListenerShape21S0300000_2_I2.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onDestroy() {
        switch (this.A03) {
            case 2:
                ((AnonymousClass5HM) this.A01).A00 = null;
                ((C130667qT) this.A02).A05(this);
                return;
            case 4:
                C103326Yt.A00.remove(this.A01);
                return;
            default:
                super.onDestroy();
                return;
        }
    }

    public final void onDestroyView() {
        Object obj;
        switch (this.A03) {
            case 0:
                obj = this.A02;
                break;
            case 1:
                obj = this.A00;
                break;
            case 2:
                ((C121247Ez) this.A00).A04();
                return;
            case 3:
                ((C121247Ez) this.A00).A03();
                ((AnonymousClass5HM) this.A02).A00 = null;
                ((C130667qT) this.A01).A05(this);
                return;
            default:
                C108446iN r0 = (C108446iN) this.A00;
                ((AnonymousClass0YY) this.A02).invoke(r0);
                r0.A01.clear();
                return;
        }
        C63913ic.A0R((AnonymousClass601) obj, this);
    }

    public IDxLListenerShape21S0300000_2_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = obj3;
    }
}
