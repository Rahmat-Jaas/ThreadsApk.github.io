package com.facebook.redex;

import android.view.View;

public class IDxCListenerShape7S0101000_2_I2 implements View.OnClickListener {
    public int A00;
    public Object A01;
    public final int A02;

    public IDxCListenerShape7S0101000_2_I2(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00e7, code lost:
        X.C14030oh.A0C(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ea, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        X.C04220Ms.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r8) {
        /*
            r7 = this;
            int r0 = r7.A02
            switch(r0) {
                case 0: goto L_0x002d;
                case 1: goto L_0x001b;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 28008855(0x1ab6197, float:6.2955514E-38)
            int r6 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r7.A01
            X.5x9 r0 = (X.AnonymousClass5x9) r0
            X.I6I r0 = r0.A04
            if (r0 != 0) goto L_0x00c4
            java.lang.String r0 = "viewModel"
        L_0x0016:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x001b:
            r0 = -35264247(0xfffffffffde5e909, float:-3.82004E37)
            int r6 = X.C14030oh.A05(r0)
            java.lang.Object r0 = r7.A01
            X.1aR r0 = (X.AnonymousClass1aR) r0
            X.6jy r5 = r0.A01
            if (r5 != 0) goto L_0x0081
            java.lang.String r0 = "delegate"
            goto L_0x0016
        L_0x002d:
            r0 = 952680077(0x38c8be8d, float:9.572236E-5)
            int r6 = X.C14030oh.A05(r0)
            java.lang.Object r5 = r7.A01
            X.5x5 r5 = (X.AnonymousClass5x5) r5
            int r4 = r7.A00
            int r0 = r5.A00
            if (r0 == r4) goto L_0x007d
            java.util.List r3 = r5.A04
            java.lang.Object r1 = r3.get(r0)
            android.view.View r1 = (android.view.View) r1
            r0 = 2131306846(0x7f09295e, float:1.8231903E38)
            r2 = 2131306846(0x7f09295e, float:1.8231903E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 8
            r1.setVisibility(r0)
            java.lang.Object r0 = r3.get(r4)
            android.view.View r0 = (android.view.View) r0
            android.view.View r3 = r0.findViewById(r2)
            com.instagram.common.ui.widget.imageview.CircularImageView r3 = (com.instagram.common.ui.widget.imageview.CircularImageView) r3
            android.content.Context r2 = r5.requireContext()
            X.0Oa r0 = r5.A07
            com.instagram.service.session.UserSession r1 = X.AnonymousClass0wJ.A0X(r0)
            X.C04220Ms.A04(r3)
            java.util.List r0 = r5.A05
            java.lang.Object r0 = r0.get(r4)
            int r0 = X.AnonymousClass0wJ.A04(r0)
            X.AnonymousClass7IM.A01(r2, r3, r1, r0)
            r5.A00 = r4
        L_0x007d:
            r0 = -1259664655(0xffffffffb4eb0af1, float:-4.3780122E-7)
            goto L_0x00e7
        L_0x0081:
            int r4 = r7.A00
            android.os.Bundle r3 = X.C18180wK.A06()
            android.content.Context r0 = r5.A00
            com.instagram.service.session.UserSession r2 = r5.A02
            X.79a r0 = X.C1201579a.A00(r0, r2)
            java.util.ArrayList r0 = r0.A02()
            java.util.ArrayList r1 = X.C18200wM.A0s(r0)
            java.lang.String r0 = "BrowserLiteIntent.EXTRA_AUTOFILL_ENTRY_JSON_STRINGS"
            r3.putStringArrayList(r0, r1)
            java.lang.String r1 = "BrowserLiteIntent.EXTRA_AUTOFILL_EDIT_AUTOFILL_ENTRY_REQUEST_SOURCE"
            java.lang.String r0 = "multiple_contact_info_fragment"
            r3.putString(r1, r0)
            r0 = 71
            java.lang.String r0 = X.I17.A00(r0)
            r3.putInt(r0, r4)
            X.D5U.A00()
            X.5xQ r1 = new X.5xQ
            r1.<init>()
            androidx.fragment.app.FragmentActivity r0 = r5.A01
            X.Drz r0 = X.AnonymousClass0wJ.A0Q(r0, r2)
            r0.A0A(r3, r1)
            r0.A05()
            r0 = 2119084608(0x7e4eaa40, float:6.867624E37)
            goto L_0x00e7
        L_0x00c4:
            int r4 = r7.A00
            X.56r r3 = r0.A0D
            java.lang.Object r2 = r3.A08()
            if (r2 == 0) goto L_0x00eb
            X.IM8 r2 = (X.IM8) r2
            java.util.List r1 = r2.A0c
            java.lang.Object r0 = r1.get(r4)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            java.lang.Boolean r0 = X.C18240wQ.A0X(r0)
            r1.set(r4, r0)
            r3.A0G(r2)
            r0 = -411654249(0xffffffffe776a797, float:-1.16479364E24)
        L_0x00e7:
            X.C14030oh.A0C(r0, r6)
            return
        L_0x00eb:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxCListenerShape7S0101000_2_I2.onClick(android.view.View):void");
    }
}
