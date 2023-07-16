package com.facebook.redex;

import X.C27686Erc;

public class IDxRCheckerShape619S0100000_1_I2 implements C27686Erc {
    public Object A00;
    public final int A01;

    public IDxRCheckerShape619S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0103, code lost:
        r0 = r1.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        return r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass38C getState(X.AnonymousClass38C r10, java.lang.CharSequence r11, boolean r12) {
        /*
            r9 = this;
            int r0 = r9.A01
            switch(r0) {
                case 0: goto L_0x00bb;
                case 1: goto L_0x00d8;
                default: goto L_0x0005;
            }
        L_0x0005:
            r5 = 0
            boolean r3 = X.AnonymousClass0wJ.A1Z(r10, r11)
            java.lang.String r6 = r11.toString()
            int r0 = r6.length()
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "error"
            r10.A01 = r0
            java.lang.Object r0 = r9.A00
            com.instagram.profile.edit.controller.EditProfileFieldsController r0 = (com.instagram.profile.edit.controller.EditProfileFieldsController) r0
            androidx.fragment.app.FragmentActivity r0 = r0.A03()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131837697(0x7f114301, float:1.9308596E38)
        L_0x0027:
            java.lang.String r0 = r1.getString(r0)
        L_0x002b:
            r10.A00 = r0
        L_0x002d:
            return r10
        L_0x002e:
            java.lang.Object r4 = r9.A00
            com.instagram.profile.edit.controller.EditProfileFieldsController r4 = (com.instagram.profile.edit.controller.EditProfileFieldsController) r4
            X.3DU r0 = r4.A00
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = r0.A0F
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x003f
            return r10
        L_0x003f:
            X.3DU r0 = r4.A00
            if (r0 == 0) goto L_0x0090
            java.util.Locale r0 = java.util.Locale.US
            X.C04220Ms.A08(r0)
            java.lang.String r8 = X.C18190wL.A0r(r0, r6)
            int r7 = X.AnonymousClass0hA.A01(r8)
            r2 = 0
        L_0x0051:
            if (r2 >= r7) goto L_0x0090
            char r1 = r8.charAt(r2)
            r0 = 48
            if (r0 > r1) goto L_0x006a
            r0 = 58
            if (r1 < r0) goto L_0x0067
            r0 = 97
            if (r0 > r1) goto L_0x006f
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 >= r0) goto L_0x0073
        L_0x0067:
            int r2 = r2 + 1
            goto L_0x0051
        L_0x006a:
            r0 = 46
            if (r1 != r0) goto L_0x0073
            goto L_0x0067
        L_0x006f:
            r0 = 95
            if (r1 == r0) goto L_0x0067
        L_0x0073:
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 18296951522984486(0x4100fb00000226, double:1.8917388764861644E-307)
            boolean r0 = X.C63173fJ.A05(r2, r0)
            if (r0 == 0) goto L_0x0090
            java.lang.String r0 = "error"
            r10.A01 = r0
            androidx.fragment.app.FragmentActivity r0 = r4.A03()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131829207(0x7f1121d7, float:1.9291377E38)
            goto L_0x0027
        L_0x0090:
            java.util.HashMap r0 = r4.A07
            java.lang.Object r0 = r0.get(r6)
            X.227 r0 = (X.AnonymousClass227) r0
            if (r0 == 0) goto L_0x0109
            int r1 = r0.ordinal()
            if (r1 == r3) goto L_0x0118
            r0 = 2
            if (r1 == r0) goto L_0x00aa
            if (r1 == r5) goto L_0x002d
            X.4VZ r0 = X.AnonymousClass4VZ.A00()
            throw r0
        L_0x00aa:
            java.lang.String r0 = "error"
            r10.A01 = r0
            androidx.fragment.app.FragmentActivity r0 = r4.A03()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131837701(0x7f114305, float:1.9308604E38)
            goto L_0x0027
        L_0x00bb:
            int r2 = r11.length()
            r0 = 6
            java.lang.Object r1 = r9.A00
            X.3Fs r1 = (X.C58463Fs) r1
            if (r2 >= r0) goto L_0x011d
            r0 = 1
            r1.A02 = r0
            com.instagram.igds.components.form.IgFormField r0 = r1.A03
            r0.A04()
            java.lang.String r0 = "error"
            r10.A01 = r0
            android.content.Context r1 = r1.A00
            r0 = 2131832179(0x7f112d73, float:1.9297405E38)
            goto L_0x0103
        L_0x00d8:
            java.lang.Object r2 = r9.A00
            X.3Fs r2 = (X.C58463Fs) r2
            com.instagram.igds.components.form.IgFormField r0 = r2.A04
            java.lang.String r1 = X.C18200wM.A0i(r0)
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = r11.toString()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = r11.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = "error"
            r10.A01 = r0
            android.content.Context r1 = r2.A00
            r0 = 2131832184(0x7f112d78, float:1.9297415E38)
        L_0x0103:
            java.lang.String r0 = r1.getString(r0)
            goto L_0x002b
        L_0x0109:
            X.0xR r2 = r4.A01
            if (r2 == 0) goto L_0x0115
            r2.removeMessages(r3)
            r0 = 1000(0x3e8, double:4.94E-321)
            r2.sendEmptyMessageDelayed(r3, r0)
        L_0x0115:
            java.lang.String r0 = "loading"
            goto L_0x011a
        L_0x0118:
            java.lang.String r0 = "confirmed"
        L_0x011a:
            r10.A01 = r0
            return r10
        L_0x011d:
            r0 = 0
            r1.A02 = r0
            com.instagram.igds.components.form.IgFormField r0 = r1.A03
            r0.A04()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxRCheckerShape619S0100000_1_I2.getState(X.38C, java.lang.CharSequence, boolean):X.38C");
    }
}
