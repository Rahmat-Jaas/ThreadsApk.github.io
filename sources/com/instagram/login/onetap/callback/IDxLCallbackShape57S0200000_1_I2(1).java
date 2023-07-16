package com.instagram.login.onetap.callback;

import X.AnonymousClass1j3;
import X.AnonymousClass265;
import X.AnonymousClass3H7;
import X.AnonymousClass3JN;
import X.AnonymousClass3XX;
import X.C07530bf;
import X.C11630kW;
import X.C14030oh;
import X.C18180wK;
import X.C18220wO;
import X.C18250wR;
import X.C23361de;
import X.C26641qy;
import X.C26951rX;
import X.C62733ac;
import X.C63463hW;
import X.C63533hk;
import X.C63873iU;
import X.C84634tZ;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.nux.fragment.OneTapLoginLandingFragment;

public class IDxLCallbackShape57S0200000_1_I2 extends C26951rX {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxLCallbackShape57S0200000_1_I2(Fragment fragment, C11630kW r11, C84634tZ r12, C07530bf r13, AnonymousClass265 r14, Object obj, Object obj2, String str, String str2, int i) {
        super(fragment, r11, r12, r13, r14, str, str2);
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void A02(C26641qy r6) {
        if (1 - this.A02 != 0) {
            super.A02(r6);
            return;
        }
        int A03 = C14030oh.A03(784151945);
        super.A02(r6);
        AnonymousClass3JN.A01(((C23361de) this.A00).A03, ((AnonymousClass3H7) this.A01).A00(), "okay", true);
        C14030oh.A0A(1663394280, A03);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        r0.A0B(r1, r2, X.AnonymousClass006.A05, r4, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(com.instagram.service.session.UserSession r7, com.instagram.user.model.User r8) {
        /*
            r6 = this;
            int r0 = r6.A02
            r2 = r7
            switch(r0) {
                case 0: goto L_0x000a;
                case 1: goto L_0x0006;
                case 2: goto L_0x0020;
                default: goto L_0x0006;
            }
        L_0x0006:
            super.A03(r7, r8)
            return
        L_0x000a:
            java.lang.Object r0 = r6.A00
            X.3FU r0 = (X.AnonymousClass3FU) r0
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0006
            X.3hk r0 = X.C63533hk.A02(r7)
            java.lang.String r4 = r8.getId()
            r5 = 1
            java.lang.Object r1 = r6.A01
            X.0kW r1 = (X.C11630kW) r1
            goto L_0x0035
        L_0x0020:
            java.lang.Object r0 = r6.A01
            X.3FU r0 = (X.AnonymousClass3FU) r0
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0006
            X.3hk r0 = X.C63533hk.A02(r7)
            java.lang.String r4 = r8.getId()
            r5 = 1
            java.lang.Object r1 = r6.A00
            X.I5x r1 = (X.I5x) r1
        L_0x0035:
            java.lang.Integer r3 = X.AnonymousClass006.A05
            r0.A0B(r1, r2, r3, r4, r5)
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.login.onetap.callback.IDxLCallbackShape57S0200000_1_I2.A03(com.instagram.service.session.UserSession, com.instagram.user.model.User):void");
    }

    public final void onFail(AnonymousClass3XX r7) {
        int i;
        int i2;
        switch (this.A02) {
            case 1:
                i = C14030oh.A03(-1526631939);
                super.onFail(r7);
                AnonymousClass3JN.A01(((C23361de) this.A00).A03, ((AnonymousClass3H7) this.A01).A00(), "in progress", false);
                i2 = 521422137;
                break;
            case 4:
                i = C14030oh.A03(-132737643);
                super.onFail(r7);
                Object obj = r7.A00;
                AnonymousClass1j3 r1 = (AnonymousClass1j3) obj;
                if (!(obj == null || r1 == null || !r1.hasErrorType("invalid_one_tap_nonce"))) {
                    OneTapLoginLandingFragment oneTapLoginLandingFragment = (OneTapLoginLandingFragment) this.A00;
                    C63533hk A022 = C63533hk.A02(oneTapLoginLandingFragment.A03);
                    C07530bf r2 = oneTapLoginLandingFragment.A03;
                    C62733ac r12 = (C62733ac) this.A01;
                    A022.A0E(r2, r12.A05);
                    if (!oneTapLoginLandingFragment.A04 && !oneTapLoginLandingFragment.getActivity().isFinishing() && !oneTapLoginLandingFragment.getActivity().isDestroyed()) {
                        C63463hW.A03();
                        String str = r12.A06;
                        Bundle A06 = C18180wK.A06();
                        A06.putString("com.instagram.android.login.fragment.ARGUMENT_OMNISTRING", str);
                        C18220wO.A1A(C18250wR.A0O(A06), C18180wK.A0Q(oneTapLoginLandingFragment.getActivity(), oneTapLoginLandingFragment.A03));
                    }
                }
                i2 = -795940643;
                break;
            default:
                super.onFail(r7);
                return;
        }
        C14030oh.A0A(i2, i);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (1 - this.A02 != 0) {
            super.onSuccess(obj);
        } else {
            C14030oh.A0A(365987156, C63873iU.A04(this, obj, 1320851356));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxLCallbackShape57S0200000_1_I2(Fragment fragment, C11630kW r11, C84634tZ r12, OneTapLoginLandingFragment oneTapLoginLandingFragment, C07530bf r14, C62733ac r15, AnonymousClass265 r16, String str, String str2) {
        super(fragment, r11, r12, r14, r16, str, str2);
        this.A02 = 4;
        this.A00 = oneTapLoginLandingFragment;
        this.A01 = r15;
    }
}
