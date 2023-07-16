package com.instagram.common.fragment.lifecyclelistener;

import X.AnonymousClass601;
import X.C109326jp;
import X.C130667qT;
import X.C19819BBt;
import X.C202813y;
import X.C63913ic;

public class IDxLListenerShape45S0200000_1_I2 extends C19819BBt {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxLListenerShape45S0200000_1_I2(AnonymousClass601 r1, C109326jp r2, int i) {
        this.A02 = i;
        switch (i) {
            case 0:
                this.A01 = r2;
                this.A00 = r1;
                break;
            case 1:
                this.A00 = r2;
                this.A01 = r1;
                break;
            case 3:
                this.A01 = r1;
                this.A00 = r2;
                break;
            default:
                this.A00 = r1;
                this.A01 = r2;
                break;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d0, code lost:
        r4 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e8, code lost:
        r4 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ea, code lost:
        r4 = (X.AnonymousClass601) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ec, code lost:
        X.C63913ic.A0R(r4, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ef, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            int r0 = r6.A02
            switch(r0) {
                case 0: goto L_0x00d3;
                case 1: goto L_0x0081;
                case 2: goto L_0x0078;
                case 3: goto L_0x004a;
                case 4: goto L_0x005b;
                case 5: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.onActivityResult(r7, r8, r9)
        L_0x0008:
            return
        L_0x0009:
            r0 = 64206(0xface, float:8.9972E-41)
            if (r7 != r0) goto L_0x0008
            java.lang.Object r4 = r6.A00
            X.601 r4 = (X.AnonymousClass601) r4
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            X.0i6 r3 = X.C63913ic.A0F(r4)
            X.0Ok r1 = X.C06810aP.A01
            X.0i6 r0 = X.C63913ic.A0F(r4)
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            com.instagram.user.model.User r0 = r1.A01(r0)
            boolean r0 = r0.A3D()
            java.lang.Object r2 = r6.A01
            com.facebook.redex.IDxDListenerShape47S0400000_1_I2 r2 = (com.facebook.redex.IDxDListenerShape47S0400000_1_I2) r2
            if (r0 == 0) goto L_0x003e
            androidx.fragment.app.FragmentActivity r1 = X.C63913ic.A05(r4)
            X.0i6 r0 = X.C63913ic.A0F(r4)
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.4sk r2 = X.AnonymousClass3WZ.A00(r1, r0, r2)
        L_0x003e:
            X.0kW r0 = X.C63913ic.A0A(r4)
            r0.getModuleName()
            X.C67363zQ.A06(r9, r3, r2, r8)
            goto L_0x00ec
        L_0x004a:
            r0 = 2884(0xb44, float:4.041E-42)
            if (r7 != r0) goto L_0x0008
            java.lang.Object r4 = r6.A01
            X.601 r4 = (X.AnonymousClass601) r4
            java.lang.Object r0 = r6.A00
            X.6jp r0 = (X.C109326jp) r0
            X.C59423Kt.A01(r9, r4, r0, r8)
            goto L_0x00ec
        L_0x005b:
            r0 = -1
            if (r8 != r0) goto L_0x00e8
            r0 = 32779(0x800b, float:4.5933E-41)
            if (r7 != r0) goto L_0x00e8
            java.lang.Object r3 = r6.A00
            X.601 r3 = (X.AnonymousClass601) r3
            java.lang.Object r2 = r6.A01
            X.6jp r2 = (X.C109326jp) r2
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            X.3iY r0 = new X.3iY
            r0.<init>(r1)
            X.C61043Rr.A00(r3, r0, r2)
            goto L_0x00e8
        L_0x0078:
            java.lang.Object r1 = r6.A00
            X.4Aj r1 = (X.AnonymousClass4Aj) r1
            r0 = 0
            r1.A09(r9, r7, r8, r0)
            goto L_0x00d0
        L_0x0081:
            r0 = -1
            if (r8 != r0) goto L_0x00d0
            r0 = 32779(0x800b, float:4.5933E-41)
            if (r7 != r0) goto L_0x00d0
            if (r9 == 0) goto L_0x00d0
            java.lang.String r0 = "bloks_on_activity_result"
            java.io.Serializable r0 = r9.getSerializableExtra(r0)
            java.util.HashMap r0 = (java.util.HashMap) r0
            X.3VO r5 = X.AnonymousClass3VO.A00()
            if (r0 == 0) goto L_0x00be
            r4 = 0
            java.util.HashMap r3 = X.AnonymousClass0wJ.A0y()
            java.util.Iterator r2 = X.AnonymousClass0wJ.A0z(r0)
        L_0x00a2:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00bb
            java.util.Map$Entry r0 = X.C18180wK.A0o(r2)
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L_0x00b7
            r0 = 0
        L_0x00b7:
            r3.put(r1, r0)
            goto L_0x00a2
        L_0x00bb:
            r5.A03(r3, r4)
        L_0x00be:
            java.lang.Object r2 = r6.A00
            X.6jp r2 = (X.C109326jp) r2
            java.util.List r0 = r5.A00
            X.3iY r1 = new X.3iY
            r1.<init>(r0)
            java.lang.Object r0 = r6.A01
            X.601 r0 = (X.AnonymousClass601) r0
            X.C61043Rr.A00(r0, r1, r2)
        L_0x00d0:
            java.lang.Object r4 = r6.A01
            goto L_0x00ea
        L_0x00d3:
            r0 = 10
            if (r7 == r0) goto L_0x00db
            r0 = 9
            if (r7 != r0) goto L_0x00e8
        L_0x00db:
            java.lang.Object r1 = r6.A01
            X.6jp r1 = (X.C109326jp) r1
            if (r1 == 0) goto L_0x00e8
            java.lang.Object r0 = r6.A00
            X.601 r0 = (X.AnonymousClass601) r0
            X.C63893iY.A0G(r0, r1)
        L_0x00e8:
            java.lang.Object r4 = r6.A00
        L_0x00ea:
            X.601 r4 = (X.AnonymousClass601) r4
        L_0x00ec:
            X.C63913ic.A0R(r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.fragment.lifecyclelistener.IDxLListenerShape45S0200000_1_I2.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void onDestroy() {
        if (6 - this.A02 != 0) {
            super.onDestroy();
            return;
        }
        ((C202813y) this.A00).A00 = null;
        ((C130667qT) this.A01).A05(this);
    }

    public final void onDestroyView() {
        Object obj;
        switch (this.A02) {
            case 1:
            case 2:
            case 3:
                obj = this.A01;
                break;
            case 4:
            case 5:
                obj = this.A00;
                break;
            case 6:
                ((C202813y) this.A00).A00.A04();
                return;
            default:
                super.onDestroyView();
                return;
        }
        C63913ic.A0R((AnonymousClass601) obj, this);
    }

    public IDxLListenerShape45S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }
}
