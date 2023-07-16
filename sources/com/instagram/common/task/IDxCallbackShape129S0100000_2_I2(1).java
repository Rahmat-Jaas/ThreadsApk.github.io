package com.instagram.common.task;

import X.AnonymousClass1jA;
import X.C04220Ms;
import X.C109126jV;
import X.C109556kC;
import X.C112536pl;
import X.C146198lo;
import X.C146958n9;
import X.C18210wN;
import X.C30809GWj;
import X.C86124wJ;

public class IDxCallbackShape129S0100000_2_I2 extends C30809GWj {
    public Object A00;
    public final int A01;

    public IDxCallbackShape129S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0056, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006d, code lost:
        r0.Bxv(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0070, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0053, code lost:
        r1.resumeWith(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.Exception r4) {
        /*
            r3 = this;
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x0022;
                case 1: goto L_0x0029;
                case 2: goto L_0x0040;
                case 3: goto L_0x0017;
                case 4: goto L_0x0065;
                case 5: goto L_0x0057;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r3.A00
            X.6kC r0 = (X.C109556kC) r0
            X.6jV r0 = r0.A01
            X.601 r2 = r0.A00
            X.6jp r1 = r0.A01
            java.lang.String r0 = r4.getMessage()
            X.C86124wJ.A1Q(r2, r1, r0)
        L_0x0016:
            return
        L_0x0017:
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.lang.Object r0 = r3.A00
            X.8lo r0 = (X.C146198lo) r0
            if (r0 == 0) goto L_0x0016
            goto L_0x006d
        L_0x0022:
            java.lang.Object r1 = r3.A00
            X.8n9 r1 = (X.C146958n9) r1
            X.0ZV r0 = X.AnonymousClass0ZV.A00
            goto L_0x0053
        L_0x0029:
            java.lang.Object r1 = r3.A00
            X.8n9 r1 = (X.C146958n9) r1
            X.1jB r0 = X.C86164wN.A0R(r4)
            r1.resumeWith(r0)
            r0 = 97
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "Failed converting Media to Medium"
            X.C10450iM.A03(r1, r0)
            return
        L_0x0040:
            java.lang.String r1 = "InspirationHubRepository"
            r0 = 157(0x9d, float:2.2E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.C10450iM.A06(r1, r0, r4)
            java.lang.Object r1 = r3.A00
            X.8n9 r1 = (X.C146958n9) r1
            X.1jB r0 = X.C86164wN.A0R(r4)
        L_0x0053:
            r1.resumeWith(r0)
            return
        L_0x0057:
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.lang.Object r0 = r3.A00
            X.6pl r0 = (X.C112536pl) r0
            X.8kl r0 = r0.A01
            r0.CRt(r4)
            return
        L_0x0065:
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            java.lang.Object r0 = r3.A00
            X.8lo r0 = (X.C146198lo) r0
        L_0x006d:
            r0.Bxv(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.task.IDxCallbackShape129S0100000_2_I2.A02(java.lang.Exception):void");
    }

    public final void A03(Object obj) {
        String str;
        C146198lo r0;
        switch (this.A01) {
            case 0:
                C04220Ms.A0C(obj, "null cannot be cast to non-null type kotlin.collections.List<com.facebook.fblibraries.fblogin.InstagramSSOSessionInfo>");
                ((C146958n9) this.A00).resumeWith(obj);
                return;
            case 3:
                str = C18210wN.A0f(obj);
                r0 = (C146198lo) this.A00;
                if (r0 == null) {
                    return;
                }
                break;
            case 4:
                str = C18210wN.A0f(obj);
                r0 = (C146198lo) this.A00;
                break;
            case 5:
                ((C112536pl) this.A00).A01.CRv(C18210wN.A0f(obj));
                return;
            case 6:
                C109126jV r02 = ((C109556kC) this.A00).A01;
                C86124wJ.A1Q(r02.A00, r02.A02, obj);
                return;
            default:
                C04220Ms.A0B(obj, 0);
                ((C146958n9) this.A00).resumeWith(AnonymousClass1jA.A00(obj));
                return;
        }
        r0.CNL(str);
    }

    public final void onFinish() {
        C146198lo r0;
        switch (this.A01) {
            case 3:
                r0 = (C146198lo) this.A00;
                if (r0 == null) {
                    return;
                }
                break;
            case 4:
                r0 = (C146198lo) this.A00;
                break;
            default:
                super.onFinish();
                return;
        }
        r0.onFinish();
    }

    public final void onStart() {
        C146198lo r0;
        switch (this.A01) {
            case 3:
                r0 = (C146198lo) this.A00;
                if (r0 == null) {
                    return;
                }
                break;
            case 4:
                r0 = (C146198lo) this.A00;
                break;
            default:
                super.onStart();
                return;
        }
        r0.onStart();
    }
}
