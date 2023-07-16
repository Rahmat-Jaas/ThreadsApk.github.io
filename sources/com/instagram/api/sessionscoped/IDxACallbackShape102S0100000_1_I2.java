package com.instagram.api.sessionscoped;

import X.AnonymousClass000;
import X.AnonymousClass0wJ;
import X.AnonymousClass1T9;
import X.AnonymousClass1iZ;
import X.AnonymousClass34L;
import X.AnonymousClass362;
import X.AnonymousClass3WS;
import X.C14030oh;
import X.C18180wK;
import X.C18250wR;
import X.C28161tl;
import X.C28464FNa;
import X.C28465FNb;
import X.C32145H7b;
import X.C40983LtS;
import X.C60883Qx;
import X.C83514rX;
import X.FWy;
import com.instagram.service.session.UserSession;

public class IDxACallbackShape102S0100000_1_I2 extends AnonymousClass1iZ {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxACallbackShape102S0100000_1_I2(UserSession userSession, Object obj, int i) {
        super(userSession);
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0085, code lost:
        if (r3 == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        if (r3 != null) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass3XX r12, com.instagram.service.session.UserSession r13) {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x001c;
                case 1: goto L_0x0030;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = -550473878(0xffffffffdf306f6a, float:-1.2713497E19)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r0 = r11.A00
            X.362 r0 = (X.AnonymousClass362) r0
            X.4rw r0 = r0.A00
            r0.Bxq()
            r0 = 1170776424(0x45c8a168, float:6420.176)
        L_0x0018:
            X.C14030oh.A0A(r0, r2)
            return
        L_0x001c:
            r0 = -1132253759(0xffffffffbc832dc1, float:-0.016013028)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r11.A00
            X.4rX r1 = (X.C83514rX) r1
            java.lang.Throwable r0 = r12.A01
            r1.Bsa(r0)
            r0 = 2105516214(0x7d7fa0b6, float:2.1236725E37)
            goto L_0x0018
        L_0x0030:
            r0 = -265113821(0xfffffffff032af23, float:-2.2120024E29)
            int r2 = X.C14030oh.A03(r0)
            java.lang.Object r1 = r11.A00
            X.34L r1 = (X.AnonymousClass34L) r1
            r0 = 0
            X.C04220Ms.A0B(r12, r0)
            java.lang.Object r4 = r12.A00
            r3 = r4
            X.FNa r3 = (X.C28464FNa) r3
            X.LtS r1 = r1.A00
            r9 = 0
            if (r3 == 0) goto L_0x008c
            int r0 = r3.mStatusCode
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x004f:
            java.lang.String r5 = java.lang.String.valueOf(r0)
            if (r3 == 0) goto L_0x0083
            java.lang.String r6 = r3.getErrorMessage()
            com.instagram.realtimeclient.DirectApiError r0 = r3.A03
            if (r0 == 0) goto L_0x0084
            java.lang.String r7 = r0.errorType
        L_0x005f:
            com.instagram.realtimeclient.DirectApiError r0 = r3.A03
            if (r0 == 0) goto L_0x0088
            java.lang.String r8 = r0.errorTitle
        L_0x0065:
            com.instagram.realtimeclient.DirectApiError r0 = r3.A03
            if (r0 == 0) goto L_0x006b
            java.lang.String r9 = r0.errorDescription
        L_0x006b:
            boolean r10 = X.AnonymousClass0wJ.A1W(r4)
            com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5010000_I2 r4 = new com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5010000_I2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.H7a r0 = new X.H7a
            r0.<init>(r4)
            r1.A02(r0)
            r1.A00()
            r0 = -580941982(0xffffffffdd5f8762, float:-1.0066844E18)
            goto L_0x0018
        L_0x0083:
            r6 = r9
        L_0x0084:
            r7 = r9
            if (r3 == 0) goto L_0x0088
            goto L_0x005f
        L_0x0088:
            r8 = r9
            if (r3 == 0) goto L_0x006b
            goto L_0x0065
        L_0x008c:
            r0 = r9
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.api.sessionscoped.IDxACallbackShape102S0100000_1_I2.A00(X.3XX, com.instagram.service.session.UserSession):void");
    }

    public final /* bridge */ /* synthetic */ void A02(UserSession userSession, Object obj) {
        int A03;
        int i;
        switch (this.A01) {
            case 0:
                A03 = C14030oh.A03(1186620908);
                int A032 = C14030oh.A03(-1331011169);
                ((C83514rX) this.A00).Bsb(((C28465FNb) obj).A0t);
                C14030oh.A0A(-2031933879, A032);
                i = 613841;
                break;
            case 1:
                A03 = C14030oh.A03(923817817);
                int A033 = C14030oh.A03(153864124);
                super.A02(userSession, obj);
                C40983LtS ltS = ((AnonymousClass34L) this.A00).A00;
                ltS.A02(new C32145H7b(C18180wK.A0Y()));
                ltS.A00();
                C14030oh.A0A(-881626905, A033);
                i = -190375074;
                break;
            default:
                A03 = C14030oh.A03(-1788294817);
                AnonymousClass1T9 r8 = (AnonymousClass1T9) obj;
                int A034 = C14030oh.A03(-911957854);
                boolean z = !r8.A01;
                boolean z2 = !r8.A00;
                AnonymousClass3WS.A01(userSession).A0O(z);
                AnonymousClass0wJ.A13(C28161tl.A03(userSession), "is_copresence_enabled", z2);
                ((AnonymousClass362) this.A00).A00.CNS(z, z2);
                C14030oh.A0A(-1186215076, A034);
                i = 522671727;
                break;
        }
        C14030oh.A0A(i, A03);
    }

    public final /* bridge */ /* synthetic */ void A03(UserSession userSession, Object obj) {
        if (1 - this.A01 != 0) {
            super.A03(userSession, obj);
            return;
        }
        int A03 = C14030oh.A03(-883657363);
        int A032 = C14030oh.A03(170880643);
        FWy fWy = ((C28464FNa) obj).A02;
        if (fWy != null) {
            C60883Qx.A00(userSession).A0E(fWy);
            throw C18250wR.A0V(AnonymousClass000.A00(0));
        }
        C14030oh.A0A(-1558303207, A032);
        C14030oh.A0A(-1573494701, A03);
    }
}
