package com.facebook.redex;

import X.AnonymousClass3D9;
import X.C10300i6;
import X.C29571yr;
import X.C84794ts;
import androidx.fragment.app.FragmentActivity;

public class IDxNActionShape212S0200000_1_I2 implements C84794ts {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxNActionShape212S0200000_1_I2(FragmentActivity fragmentActivity, C10300i6 r2, int i) {
        this.A02 = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                this.A01 = r2;
                this.A00 = fragmentActivity;
                break;
            default:
                this.A00 = fragmentActivity;
                this.A01 = r2;
                break;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00f9, code lost:
        r0 = X.C18180wK.A0Q((androidx.fragment.app.FragmentActivity) r4.A00, r3);
        r0.A03 = r1;
        r0.A07();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0106, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0152, code lost:
        r0.setArguments(r1);
        r2.A03 = r0;
        r2.A07();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x015a, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object C8i(X.AnonymousClass3DI r20, java.lang.Object r21, int r22) {
        /*
            r19 = this;
            r4 = r19
            r11 = r21
            int r0 = r4.A02
            r5 = r20
            r1 = r22
            switch(r0) {
                case 0: goto L_0x0022;
                case 1: goto L_0x017a;
                case 2: goto L_0x0090;
                case 3: goto L_0x00b4;
                case 4: goto L_0x00d6;
                case 5: goto L_0x0107;
                case 6: goto L_0x012d;
                case 7: goto L_0x015b;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.Object r0 = r4.A01
            X.3D9 r0 = (X.AnonymousClass3D9) r0
            X.1bv r1 = r0.A03
            android.view.View r0 = r1.mView
            if (r0 == 0) goto L_0x0020
            X.0m7 r1 = r1.getChildFragmentManager()
            java.lang.String r0 = "ProfileWizardPlugin_LoaderDialogFragmentName"
            X.C18240wQ.A11(r1, r0)
        L_0x0020:
            r11 = 0
        L_0x0021:
            return r11
        L_0x0022:
            com.instagram.registration.model.RegFlowExtras r11 = (com.instagram.registration.model.RegFlowExtras) r11
            r9 = 1
            if (r1 != r9) goto L_0x0021
            X.3DI r1 = r5.A04
            r11.getClass()
            java.lang.String r0 = r11.A0Z
            r0.getClass()
            X.25r r0 = r11.A01()
            r0.getClass()
            r1.getClass()
            X.GU8 r0 = X.GU8.A01
            r0.A00()
            java.lang.Object r7 = r4.A01
            X.0i6 r7 = (X.C10300i6) r7
            java.lang.Integer r8 = X.AnonymousClass006.A00
            r10 = 0
            X.C04220Ms.A0B(r7, r10)
            java.lang.String r6 = "unknown"
            java.lang.String r5 = r11.A0Z
            java.lang.String r3 = r11.A0W
            X.25r r2 = r11.A01()
            X.4oJ r0 = r1.A07
            X.2AT r0 = (X.AnonymousClass2AT) r0
            X.265 r1 = r0.A00
            X.C04220Ms.A0B(r5, r10)
            X.AnonymousClass0wJ.A1Q(r2, r1)
            X.3VH r0 = X.AnonymousClass3VH.A00()
            r0.A02(r1, r5, r3)
            X.GU8 r0 = X.GU8.A01
            r0.A00()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r1.putParcelable(r0, r11)
            X.1qE r2 = X.C23161cb.A00(r1, r7, r8, r6, r9)
            java.lang.Object r0 = r4.A00
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            X.Drz r1 = X.C18180wK.A0Q(r0, r7)
            r1.A03 = r2
            java.lang.String r0 = "GDPR.Fragment.Entrance"
            r1.A07 = r0
            r1.A07()
            return r11
        L_0x0090:
            com.instagram.registration.model.RegFlowExtras r11 = (com.instagram.registration.model.RegFlowExtras) r11
            r0 = 1
            if (r1 != r0) goto L_0x0021
            r11.getClass()
            X.C63463hW.A03()
            java.lang.Object r3 = r4.A01
            X.0i6 r3 = (X.C10300i6) r3
            java.lang.String r16 = r3.getToken()
            android.os.Bundle r10 = X.C18180wK.A06()
            r12 = 0
            r17 = 0
            r13 = r12
            r14 = r12
            r15 = r12
            r18 = r17
            androidx.fragment.app.Fragment r1 = X.C61753Vf.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x00f9
        L_0x00b4:
            com.instagram.registration.model.RegFlowExtras r11 = (com.instagram.registration.model.RegFlowExtras) r11
            r0 = 1
            if (r1 != r0) goto L_0x0021
            r11.getClass()
            X.3Vf r2 = X.C63463hW.A01()
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r1.putParcelable(r0, r11)
            java.lang.Object r3 = r4.A01
            X.0i6 r3 = (X.C10300i6) r3
            java.lang.String r0 = r3.getToken()
            androidx.fragment.app.Fragment r1 = r2.A01(r1, r0)
            goto L_0x00f9
        L_0x00d6:
            com.instagram.registration.model.RegFlowExtras r11 = (com.instagram.registration.model.RegFlowExtras) r11
            r0 = 1
            if (r1 != r0) goto L_0x0021
            r11.getClass()
            X.C63463hW.A03()
            android.os.Bundle r2 = X.C18180wK.A06()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r2.putParcelable(r0, r11)
            java.lang.Object r3 = r4.A01
            X.0i6 r3 = (X.C10300i6) r3
            X.C18180wK.A0w(r2, r3)
            X.1cl r1 = new X.1cl
            r1.<init>()
            r1.setArguments(r2)
        L_0x00f9:
            java.lang.Object r0 = r4.A00
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            X.Drz r0 = X.C18180wK.A0Q(r0, r3)
            r0.A03 = r1
            r0.A07()
            return r11
        L_0x0107:
            com.instagram.registration.model.RegFlowExtras r11 = (com.instagram.registration.model.RegFlowExtras) r11
            r0 = 1
            if (r1 != r0) goto L_0x0021
            r11.getClass()
            java.lang.Object r0 = r4.A00
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            java.lang.Object r3 = r4.A01
            X.0i6 r3 = (X.C10300i6) r3
            X.Drz r2 = X.C63463hW.A00(r0, r3)
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r1.putParcelable(r0, r11)
            X.C18180wK.A0w(r1, r3)
            X.1ch r0 = new X.1ch
            r0.<init>()
            goto L_0x0152
        L_0x012d:
            com.instagram.registration.model.RegFlowExtras r11 = (com.instagram.registration.model.RegFlowExtras) r11
            r0 = 1
            if (r1 != r0) goto L_0x0021
            r11.getClass()
            java.lang.Object r0 = r4.A00
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            java.lang.Object r3 = r4.A01
            X.0i6 r3 = (X.C10300i6) r3
            X.Drz r2 = X.C63463hW.A00(r0, r3)
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r1.putParcelable(r0, r11)
            X.C18180wK.A0w(r1, r3)
            X.1ck r0 = new X.1ck
            r0.<init>()
        L_0x0152:
            r0.setArguments(r1)
            r2.A03 = r0
            r2.A07()
            return r11
        L_0x015b:
            java.lang.Object r3 = r4.A01
            X.3D9 r3 = (X.AnonymousClass3D9) r3
            X.1XX r2 = new X.1XX
            r2.<init>()
            X.1bv r0 = r3.A03
            X.0m7 r1 = r0.getChildFragmentManager()
            java.lang.String r0 = "ProfileWizardPlugin_LoaderDialogFragmentName"
            r2.A0A(r1, r0)
            java.lang.Object r1 = r4.A00
            X.3ZJ r1 = (X.AnonymousClass3ZJ) r1
            java.lang.String r0 = "ProfileWizardPlugin_30107e9e-185e-11e9-ab14-d663bd873d93"
            r1.A08(r0, r3)
            goto L_0x0020
        L_0x017a:
            com.instagram.registration.model.RegFlowExtras r11 = (com.instagram.registration.model.RegFlowExtras) r11
            r0 = 1
            if (r1 != r0) goto L_0x01b1
            r11.getClass()
            X.C63463hW.A01()
            android.os.Bundle r1 = X.C18180wK.A06()
            java.lang.String r0 = "RegFlowExtras.EXTRA_KEY"
            r1.putParcelable(r0, r11)
            java.lang.Object r0 = r4.A01
            X.0i6 r0 = (X.C10300i6) r0
            java.lang.String r0 = r0.getToken()
            X.C18190wL.A13(r1, r0)
            X.1cj r3 = new X.1cj
            r3.<init>()
            r3.setArguments(r1)
            java.lang.Object r0 = r4.A00
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            X.0m7 r2 = r0.getSupportFragmentManager()
            java.lang.String r1 = r5.A08
            java.lang.String r0 = "reg_gdpr_entrance"
            X.C63553hn.A07(r3, r2, r0, r1)
            return r11
        L_0x01b1:
            r11.getClass()
            r0 = 0
            r11.A05 = r0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.IDxNActionShape212S0200000_1_I2.C8i(X.3DI, java.lang.Object, int):java.lang.Object");
    }

    public IDxNActionShape212S0200000_1_I2(AnonymousClass3D9 r1, C29571yr r2, int i) {
        this.A02 = i;
        this.A00 = r2;
        this.A01 = r1;
    }
}
