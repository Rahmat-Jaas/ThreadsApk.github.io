package com.instagram.login.callback;

import X.AnonymousClass0wJ;
import X.AnonymousClass1ci;
import X.AnonymousClass1d9;
import X.AnonymousClass1iT;
import X.AnonymousClass1j3;
import X.AnonymousClass265;
import X.AnonymousClass3GT;
import X.AnonymousClass3XX;
import X.C07530bf;
import X.C11630kW;
import X.C14030oh;
import X.C18210wN;
import X.C18240wQ;
import X.C24431ij;
import X.C24721jv;
import X.C25091lm;
import X.C26861rM;
import X.C62323Yh;
import X.C84634tZ;
import android.app.Activity;
import android.net.Uri;

public class IDxLCallbacksShape165S0100000_1_I2 extends C24431ij {
    public Object A00;
    public final int A01 = 2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxLCallbacksShape165S0100000_1_I2(Activity activity, C11630kW r15, C84634tZ r16, AnonymousClass3GT r17, AnonymousClass1ci r18, C07530bf r19, AnonymousClass265 r20, Integer num, String str, String str2, String str3) {
        super(activity, (Uri) null, r15, r16, r17, r19, r20, num, str, str2, str3);
        this.A00 = r18;
    }

    public final void onFail(AnonymousClass3XX r19) {
        String str;
        AnonymousClass3XX r3 = r19;
        if (2 - this.A01 != 0) {
            super.onFail(r3);
            return;
        }
        int A03 = C14030oh.A03(-1459209477);
        C25091lm r2 = (C25091lm) this.A00;
        Object obj = r3.A00;
        AnonymousClass1j3 r5 = (AnonymousClass1j3) obj;
        if (r5 == null || r5.getErrorMessage() == null || !r5.getErrorMessage().equals("Invalid nonce from autoconf authentication")) {
            C07530bf r7 = r2.A05;
            String str2 = r2.A06.A01;
            String str3 = r2.A08;
            if (obj != null) {
                str = r5.getErrorMessage();
            } else {
                str = null;
            }
            C62323Yh.A00(r7, Boolean.valueOf(AnonymousClass0wJ.A1Y(r7, str2)), str2, "client_auth_failed_other_error", "authentication error message received from server", str3, "ar_code_sms", str, (String) null, (String) null, (String) null);
            super.onFail(r3);
        } else {
            C07530bf r32 = r2.A05;
            String str4 = r2.A06.A01;
            C62323Yh.A00(r32, Boolean.valueOf(AnonymousClass0wJ.A1Y(r32, str4)), str4, "client_auth_failed_error_message_from_server", "authentication error message received from server", r2.A08, "ar_code_sms", (String) null, (String) null, "Invalid nonce from autoconf authentication", (String) null);
            r2.A03.A00();
        }
        C14030oh.A0A(1816102676, A03);
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A01) {
            case 1:
                i = C14030oh.A03(-868126771);
                super.onFinish();
                ((AnonymousClass1d9) this.A00).A03.A00();
                i2 = -1911339712;
                break;
            case 2:
                i = C14030oh.A03(-728523258);
                C18210wN.A0z(((C25091lm) this.A00).A00);
                super.onFinish();
                i2 = -1006149861;
                break;
            case 3:
                i = C14030oh.A03(1060694625);
                super.onFinish();
                C24721jv r0 = ((AnonymousClass1ci) this.A00).A06;
                if (r0 != null) {
                    r0.A00();
                }
                i2 = -680682036;
                break;
            default:
                super.onFinish();
                return;
        }
        C14030oh.A0A(i2, i);
    }

    public final void onStart() {
        int i;
        int i2;
        switch (this.A01) {
            case 1:
                i = C14030oh.A03(346016846);
                super.onStart();
                ((AnonymousClass1d9) this.A00).A03.A01();
                i2 = 5395291;
                break;
            case 2:
                i = C14030oh.A03(1765715444);
                C18240wQ.A0w(((C25091lm) this.A00).A00);
                super.onStart();
                i2 = -790984164;
                break;
            case 3:
                i = C14030oh.A03(-1857643806);
                super.onStart();
                C24721jv r0 = ((AnonymousClass1ci) this.A00).A06;
                if (r0 != null) {
                    r0.A01();
                }
                i2 = 1761765487;
                break;
            default:
                super.onStart();
                return;
        }
        C14030oh.A0A(i2, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxLCallbacksShape165S0100000_1_I2(Activity activity, C11630kW r15, C84634tZ r16, C25091lm r17, C07530bf r18, AnonymousClass265 r19, Integer num, String str) {
        super(activity, (Uri) null, r15, r16, (AnonymousClass3GT) null, r18, r19, num, str, "111111", (String) null);
        this.A00 = r17;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxLCallbacksShape165S0100000_1_I2(Activity activity, C11630kW r12, C84634tZ r13, C26861rM r14, C07530bf r15, AnonymousClass265 r16, Integer num, String str) {
        super(activity, (Uri) null, r12, r13, r15, r16, num, str);
        this.A00 = r14;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IDxLCallbacksShape165S0100000_1_I2(Activity activity, Uri uri, C11630kW r13, AnonymousClass1iT r14, C07530bf r15, AnonymousClass265 r16, Integer num) {
        super(activity, uri, r13, (C84634tZ) null, r15, r16, num, (String) null);
        this.A00 = r14;
    }
}
