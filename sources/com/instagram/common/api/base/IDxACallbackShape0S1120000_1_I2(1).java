package com.instagram.common.api.base;

import X.AnonymousClass006;
import X.AnonymousClass0wJ;
import X.AnonymousClass3HQ;
import X.AnonymousClass3XX;
import X.C04220Ms;
import X.C14030oh;
import X.C22161Tp;
import X.C63873iU;
import X.C67233zC;
import X.C67263zF;

public class IDxACallbackShape0S1120000_1_I2 extends C63873iU {
    public Object A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final int A04;

    public IDxACallbackShape0S1120000_1_I2(Object obj, String str, int i, boolean z, boolean z2) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = str;
        this.A03 = z;
        this.A02 = z2;
    }

    public final void onFail(AnonymousClass3XX r12) {
        int A032;
        int i;
        if (this.A04 != 0) {
            A032 = C14030oh.A03(1314355595);
            C04220Ms.A0B(r12, 0);
            super.onFail(r12);
            C67233zC.A01((C67233zC) this.A00, AnonymousClass006.A00, this.A01, (String) null, false, this.A03);
            i = 408731925;
        } else {
            A032 = C14030oh.A03(1997112271);
            C67263zF r3 = (C67263zF) this.A00;
            C67263zF.A02(r3, this.A01, this.A03, this.A02);
            AnonymousClass3HQ r0 = r3.A00;
            if (r0 != null) {
                r0.A00();
            }
            i = 748850525;
        }
        C14030oh.A0A(i, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032;
        Integer num;
        String str;
        int i;
        String str2;
        Object obj2 = obj;
        if (this.A04 != 0) {
            A032 = C14030oh.A03(1203323462);
            C22161Tp r7 = (C22161Tp) obj2;
            int A002 = AnonymousClass0wJ.A00(361476478, r7);
            C67233zC r6 = (C67233zC) this.A00;
            String str3 = this.A01;
            boolean z = this.A03;
            if (r7.A06) {
                str2 = "ON";
            } else {
                str2 = "OFF";
            }
            Integer num2 = AnonymousClass006.A00;
            C67233zC.A01(r6, num2, str3, str2, true, z);
            C67233zC.A08.A01(r6.A06, num2, str3, this.A02, z);
            C67233zC.A00(r6);
            C14030oh.A0A(-1811794683, A002);
            i = -898842871;
        } else {
            A032 = C14030oh.A03(1101227677);
            C22161Tp r72 = (C22161Tp) obj2;
            int A003 = AnonymousClass0wJ.A00(-1438352421, r72);
            C67263zF r8 = (C67263zF) this.A00;
            String str4 = this.A01;
            boolean z2 = this.A03;
            if (r72.A06) {
                num = AnonymousClass006.A01;
            } else {
                num = AnonymousClass006.A0C;
            }
            if (1 - num.intValue() != 0) {
                str = "OFF";
            } else {
                str = "ON";
            }
            C67263zF.A01(r8, str4, str, z2, this.A02);
            if (z2) {
                C67263zF.A03.A02(r8.A01, str4, r72.A06, true);
            }
            AnonymousClass3HQ r0 = r8.A00;
            if (r0 != null) {
                r0.A01();
            }
            C14030oh.A0A(2029358954, A003);
            i = 836739418;
        }
        C14030oh.A0A(i, A032);
    }
}
