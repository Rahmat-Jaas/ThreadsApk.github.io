package X;

import androidx.fragment.app.Fragment;
import com.instagram.service.session.UserSession;

/* renamed from: X.7vF  reason: invalid class name and case insensitive filesystem */
public final class C133177vF implements C21307BsE {
    public final Fragment A00;
    public final C21839C2o A01;
    public final UserSession A02;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0070, code lost:
        if (r0 != null) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00cd, code lost:
        if (r0 != null) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BpF(X.C20066BMj r14, java.lang.String r15) {
        /*
            r13 = this;
            r8 = 0
            androidx.fragment.app.Fragment r0 = r13.A00
            android.content.Context r9 = r0.getContext()
            if (r9 == 0) goto L_0x00b0
            com.instagram.service.session.UserSession r12 = r13.A02
            X.C2o r11 = r13.A01
            r6 = 1
            r1 = 3
            java.lang.String r0 = "CollaborativeMediaHelper"
            X.BKU r10 = X.C19462Awj.A00(r12, r0, r15)
            if (r10 == 0) goto L_0x00b0
            X.Dsm r2 = new X.Dsm
            r2.<init>(r9)
            r0 = 2131820811(0x7f11010b, float:1.9274347E38)
            java.lang.String r0 = r9.getString(r0)
            r2.A02 = r0
            com.instagram.user.model.User r0 = X.AnonymousClass0wJ.A0Y(r12)
            X.9tz r3 = r0.A0e()
            X.9tz r0 = X.C169839tz.PrivacyStatusPrivate
            boolean r7 = X.C18180wK.A1Z(r3, r0)
            com.instagram.model.mediatype.ProductType r3 = com.instagram.model.mediatype.ProductType.CLIPS
            com.instagram.model.mediatype.ProductType r0 = r10.A2M()
            boolean r5 = X.C18180wK.A1Z(r3, r0)
            r4 = 0
            if (r7 == 0) goto L_0x00e1
            r0 = 2131829574(0x7f112346, float:1.929212E38)
            java.lang.String r3 = X.AnonymousClass0wJ.A0k(r9, r0)
            java.util.List r0 = r10.A3O()
            int r0 = r0.size()
            boolean r0 = X.C86134wK.A1X(r0, r6)
            r7 = 2
            if (r5 == 0) goto L_0x00b3
            r5 = 2131820814(0x7f11010e, float:1.9274354E38)
            if (r0 != 0) goto L_0x00d2
            r5 = 2131820818(0x7f110112, float:1.9274362E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.instagram.user.model.User r0 = r10.A2Z(r12)
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = r0.BK7()
        L_0x006a:
            r1[r8] = r0
            com.instagram.user.model.User r0 = r10.A2Z(r12)
            if (r0 == 0) goto L_0x0076
        L_0x0072:
            java.lang.String r4 = r0.BK7()
        L_0x0076:
            r1[r6] = r4
            r1[r7] = r3
        L_0x007a:
            java.lang.String r0 = r9.getString(r5, r1)
            X.C04220Ms.A09(r0)
            android.text.SpannableStringBuilder r1 = X.C18200wM.A0E(r0)
            com.facebook.redex.IDxCSpanShape1S0300000_1_I2 r0 = new com.facebook.redex.IDxCSpanShape1S0300000_1_I2
            r0.<init>(r8, r9, r11, r12)
            X.AnonymousClass3Zw.A01(r1, r0, r3)
        L_0x008d:
            r2.A0p(r1)
            r0 = 2131820808(0x7f110108, float:1.9274341E38)
            com.facebook.redex.IDxCListenerShape21S0400000_2_I2 r7 = new com.facebook.redex.IDxCListenerShape21S0400000_2_I2
            r7.<init>(r8, r9, r10, r11, r12)
            r2.A0P(r7, r0)
            r1 = 2131824816(0x7f1110b0, float:1.928247E38)
            com.facebook.redex.IDxCListenerShape49S0300000_2_I2 r0 = new com.facebook.redex.IDxCListenerShape49S0300000_2_I2
            r0.<init>(r8, r9, r10, r12)
            r2.A0N(r0, r1)
            r1 = 2131831869(0x7f112c3d, float:1.9296776E38)
            r0 = 0
            r2.A0O(r0, r1)
            X.AnonymousClass0wJ.A1K(r2)
        L_0x00b0:
            return
        L_0x00b1:
            r0 = r4
            goto L_0x006a
        L_0x00b3:
            r5 = 2131820813(0x7f11010d, float:1.9274352E38)
            if (r0 != 0) goto L_0x00d2
            r5 = 2131820817(0x7f110111, float:1.927436E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.instagram.user.model.User r0 = r10.A2Z(r12)
            if (r0 == 0) goto L_0x00d0
            java.lang.String r0 = r0.BK7()
        L_0x00c7:
            r1[r8] = r0
            com.instagram.user.model.User r0 = r10.A2Z(r12)
            if (r0 == 0) goto L_0x0076
            goto L_0x0072
        L_0x00d0:
            r0 = r4
            goto L_0x00c7
        L_0x00d2:
            com.instagram.user.model.User r0 = r10.A2Z(r12)
            if (r0 == 0) goto L_0x00dc
            java.lang.String r4 = r0.BK7()
        L_0x00dc:
            java.lang.Object[] r1 = new java.lang.Object[]{r4, r3}
            goto L_0x007a
        L_0x00e1:
            r1 = 2131820812(0x7f11010c, float:1.927435E38)
            if (r5 == 0) goto L_0x00e9
            r1 = 2131820815(0x7f11010f, float:1.9274356E38)
        L_0x00e9:
            com.instagram.user.model.User r0 = r10.A2Z(r12)
            if (r0 == 0) goto L_0x00f3
            java.lang.String r4 = r0.BK7()
        L_0x00f3:
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r9, r4, r1)
            android.text.SpannableStringBuilder r1 = X.C18200wM.A0E(r0)
            goto L_0x008d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133177vF.BpF(X.BMj, java.lang.String):void");
    }

    public C133177vF(Fragment fragment, C21839C2o c2o, UserSession userSession) {
        this.A02 = userSession;
        this.A00 = fragment;
        this.A01 = c2o;
    }
}
