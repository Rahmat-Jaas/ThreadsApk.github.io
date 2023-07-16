package com.facebook.redex;

import X.C21659By5;

public class IDxDListenerShape185S0200000_1_I2 implements C21659By5 {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxDListenerShape185S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: com.instagram.creation.fragment.ShareLaterFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.Ck6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: com.instagram.creation.fragment.ShareLaterFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: com.instagram.creation.fragment.ShareLaterFragment} */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x010b, code lost:
        X.C63073bQ.A00(r0).A08(r2.requireActivity(), r2.requireContext(), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x011a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r2 = r0.A01;
        X.C61043Rr.A00(r0.A00, X.C63893iY.A01, r2);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bmo() {
        /*
            r13 = this;
            int r0 = r13.A02
            switch(r0) {
                case 0: goto L_0x0075;
                case 1: goto L_0x00c2;
                case 2: goto L_0x0085;
                case 3: goto L_0x0020;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r13.A01
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.49j r0 = X.C696349j.A03(r0)
            r0.A0L()
            java.lang.Object r0 = r13.A00
            X.37X r0 = (X.AnonymousClass37X) r0
            if (r0 == 0) goto L_0x001f
        L_0x0016:
            X.6jp r2 = r0.A01
            X.3iY r1 = X.C63893iY.A01
            X.601 r0 = r0.A00
            X.C61043Rr.A00(r0, r1, r2)
        L_0x001f:
            return
        L_0x0020:
            X.29v r4 = X.C320129v.DEFAULT_PRIVACY_CONSENT_BOTTOMSHEET_DISMISS_CLICK
            java.lang.Object r2 = r13.A01
            X.Ck6 r2 = (X.C23006Ck6) r2
            com.instagram.service.session.UserSession r5 = X.C23006Ck6.A04(r2)
            java.lang.Object r3 = r13.A00
            X.16t r3 = (X.C209416t) r3
            boolean r10 = r3.A00
            X.20N r0 = r3.A02
            java.lang.String r6 = java.lang.String.valueOf(r0)
            android.content.Context r1 = r2.requireContext()
            com.instagram.service.session.UserSession r0 = X.C23006Ck6.A04(r2)
            X.49i r0 = X.C63073bQ.A00(r0)
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r7 = X.C63143c0.A05(r1, r0)
            com.instagram.service.session.UserSession r0 = X.C23006Ck6.A04(r2)
            boolean r11 = X.C62183Xq.A00(r0)
            boolean r12 = r3.A05
            X.21z r0 = r3.A01
            java.lang.String r9 = java.lang.String.valueOf(r0)
            java.lang.String r8 = "video_feed"
            X.C59693Lv.A01(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = X.C63073bQ.A02(r3)
            if (r0 == 0) goto L_0x001f
            r1 = 1
            boolean r0 = r3.A00
            if (r0 == r1) goto L_0x001f
            X.C23006Ck6.A06(r3, r2)
            com.instagram.service.session.UserSession r0 = X.C23006Ck6.A04(r2)
            goto L_0x010b
        L_0x0075:
            java.lang.Object r0 = r13.A01
            com.instagram.service.session.UserSession r0 = (com.instagram.service.session.UserSession) r0
            X.49j r0 = X.C696349j.A03(r0)
            r0.A0L()
            java.lang.Object r0 = r13.A00
            X.37X r0 = (X.AnonymousClass37X) r0
            goto L_0x0016
        L_0x0085:
            java.lang.Object r4 = r13.A00
            X.3ag r4 = (X.C62763ag) r4
            int r2 = r4.A00
            r3 = -2
            if (r2 < 0) goto L_0x00b6
            android.view.View r1 = r4.A01
            if (r1 == 0) goto L_0x00b6
            X.1cu r0 = r4.A04
            X.11A r0 = r0.A02
            java.util.List r0 = r0.A01
            java.lang.Object r0 = r0.get(r2)
            X.3bP r0 = (X.C63063bP) r0
            android.view.View$OnClickListener r0 = r0.A06
            r0.onClick(r1)
            X.3Iu r0 = r4.A03
            X.4vy r2 = r0.A02
            if (r2 == 0) goto L_0x00b0
            int r1 = r4.A00
            android.view.View r0 = r4.A01
            r2.CJi(r0, r1)
        L_0x00b0:
            r0 = 0
            r4.A01 = r0
            r4.A00 = r3
            return
        L_0x00b6:
            X.3Iu r0 = r4.A03
            X.4vy r0 = r0.A02
            if (r0 == 0) goto L_0x00b0
            if (r2 != r3) goto L_0x00b0
            r0.BuM()
            goto L_0x00b0
        L_0x00c2:
            X.29v r4 = X.C320129v.DEFAULT_PRIVACY_CONSENT_BOTTOMSHEET_DISMISS_CLICK
            java.lang.Object r0 = r13.A00
            com.facebook.redex.IDxCListenerShape201S0100000_1_I2 r0 = (com.facebook.redex.IDxCListenerShape201S0100000_1_I2) r0
            java.lang.Object r2 = r0.A00
            com.instagram.creation.fragment.ShareLaterFragment r2 = (com.instagram.creation.fragment.ShareLaterFragment) r2
            com.instagram.service.session.UserSession r5 = r2.A04
            java.lang.Object r3 = r13.A01
            X.16t r3 = (X.C209416t) r3
            X.20N r0 = r3.A02
            java.lang.String r6 = r0.toString()
            java.lang.String r7 = r3.A04
            boolean r11 = X.C62183Xq.A00(r5)
            boolean r12 = r3.A05
            X.21z r0 = r3.A01
            java.lang.String r9 = r0.toString()
            r10 = 0
            java.lang.String r8 = "share_later_share_button"
            X.C59693Lv.A01(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = X.C63073bQ.A02(r3)
            if (r0 == 0) goto L_0x011b
            boolean r0 = r3.A00
            if (r0 != 0) goto L_0x011b
            com.instagram.model.sharelater.ShareLaterMedia r1 = r2.A03
            r0 = 1
            r1.A0A = r0
            com.instagram.creation.fragment.ShareLaterFragment.A01(r2)
            r3.A00 = r0
            com.instagram.service.session.UserSession r0 = r2.A04
            X.49i r0 = X.C63073bQ.A00(r0)
            r0.A0B(r3)
            com.instagram.service.session.UserSession r0 = r2.A04
        L_0x010b:
            X.49i r3 = X.C63073bQ.A00(r0)
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            android.content.Context r0 = r2.requireContext()
            r3.A08(r1, r0, r8)
            return
        L_0x011b:
            com.instagram.creation.fragment.ShareLaterFragment.A01(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxDListenerShape185S0200000_1_I2.Bmo():void");
    }

    public final void Bmq() {
    }
}
