package X;

import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.1u3  reason: invalid class name and case insensitive filesystem */
public class C28311u3 extends C28321u4 {
    public IgTextView A00;

    public final void CEB(C81644o8 r1) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        if (r0 != null) goto L_0x001e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CE9(X.C81644o8 r6, java.lang.Integer r7, java.util.Map r8) {
        /*
            r5 = this;
            X.1u0 r6 = (X.C28291u0) r6
            int r4 = r7.intValue()
            r3 = 1
            if (r4 == r3) goto L_0x0042
            r0 = 2
            if (r4 == r0) goto L_0x003d
            java.lang.String r2 = "QuickPromotionDebugHelper"
            switch(r4) {
                case 1: goto L_0x003a;
                case 2: goto L_0x003a;
                case 3: goto L_0x003a;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.String r0 = "view"
        L_0x0013:
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "%s ActionType should not be handled in onQuickPromotionClick"
            X.AnonymousClass0LU.A0N(r2, r0, r1)
        L_0x001c:
            java.lang.String r0 = "action not set"
        L_0x001e:
            switch(r4) {
                case 1: goto L_0x0031;
                case 2: goto L_0x0034;
                case 3: goto L_0x0037;
                default: goto L_0x0021;
            }
        L_0x0021:
            java.lang.String r2 = "VIEW"
        L_0x0023:
            java.lang.String r1 = " action url: "
            java.lang.String r1 = X.AnonymousClass00U.A0V(r2, r1, r0)
            com.instagram.common.ui.base.IgTextView r0 = r5.A00
            if (r0 == 0) goto L_0x004d
            r0.setText(r1)
            return
        L_0x0031:
            java.lang.String r2 = "PRIMARY"
            goto L_0x0023
        L_0x0034:
            java.lang.String r2 = "SECONDARY"
            goto L_0x0023
        L_0x0037:
            java.lang.String r2 = "DISMISS"
            goto L_0x0023
        L_0x003a:
            java.lang.String r0 = "click"
            goto L_0x0013
        L_0x003d:
            X.1tt r0 = r6.A08
            X.3CQ r0 = r0.A02
            goto L_0x0046
        L_0x0042:
            X.1tt r0 = r6.A08
            X.3CQ r0 = r0.A01
        L_0x0046:
            if (r0 == 0) goto L_0x001c
            java.lang.String r0 = r0.A03
            if (r0 == 0) goto L_0x001c
            goto L_0x001e
        L_0x004d:
            android.content.Context r0 = r5.A04
            X.C63813iO.A0D(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28311u3.CE9(X.4o8, java.lang.Integer, java.util.Map):void");
    }

    public void CEA(C81644o8 r4) {
        IgTextView igTextView = this.A00;
        if (igTextView != null) {
            igTextView.setText("DISMISS action");
        } else {
            C63813iO.A0D(this.A04, "DISMISS action", 1);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C28311u3(android.view.ViewGroup r13, X.C34640IcN r14, X.C11630kW r15, com.instagram.quickpromotion.intf.QuickPromotionSlot r16, com.instagram.service.session.UserSession r17) {
        /*
            r12 = this;
            X.C36622Sa.A00()
            r2 = r14
            android.app.Activity r0 = r14.getRootActivity()
            android.content.Context r0 = r0.getApplicationContext()
            r11 = r17
            X.AnonymousClass0wJ.A1N(r0, r11)
            X.4Gd r7 = new X.4Gd
            r7.<init>(r0, r11)
            X.C36622Sa.A00()
            X.4JV r10 = new X.4JV
            r10.<init>(r14, r15, r11)
            X.4Ga r5 = X.AnonymousClass2SX.A00(r11)
            X.4Gr r8 = new X.4Gr
            r8.<init>()
            r3 = 0
            r1 = r12
            r9 = r16
            r4 = r14
            r6 = r3
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r13 == 0) goto L_0x003d
            r0 = 2131305077(0x7f092275, float:1.8228315E38)
            android.view.View r0 = r13.findViewById(r0)
            com.instagram.common.ui.base.IgTextView r0 = (com.instagram.common.ui.base.IgTextView) r0
            r12.A00 = r0
        L_0x003d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28311u3.<init>(android.view.ViewGroup, X.IcN, X.0kW, com.instagram.quickpromotion.intf.QuickPromotionSlot, com.instagram.service.session.UserSession):void");
    }
}
