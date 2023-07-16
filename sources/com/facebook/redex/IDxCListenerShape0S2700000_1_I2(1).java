package com.facebook.redex;

import X.AnonymousClass265;
import X.C07530bf;
import X.C24721jv;
import X.C34640IcN;
import X.C61763Vg;
import X.C63313hF;
import X.C67283zI;
import X.C82804qI;
import X.C82824qK;
import android.content.DialogInterface;
import android.os.Handler;
import com.instagram.registration.model.RegFlowExtras;

public class IDxCListenerShape0S2700000_1_I2 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public String A07;
    public String A08;
    public final int A09;

    public IDxCListenerShape0S2700000_1_I2(Handler handler, C34640IcN icN, C82824qK r3, RegFlowExtras regFlowExtras, C24721jv r5, C07530bf r6, AnonymousClass265 r7, String str, String str2, int i) {
        this.A09 = i;
        if (i != 0) {
            this.A03 = r6;
            this.A01 = icN;
            this.A00 = r3;
            this.A02 = handler;
            this.A05 = regFlowExtras;
        } else {
            this.A05 = regFlowExtras;
            this.A03 = r6;
            this.A01 = icN;
            this.A00 = r3;
            this.A02 = handler;
        }
        this.A04 = r5;
        this.A07 = str;
        this.A06 = r7;
        this.A08 = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        RegFlowExtras regFlowExtras;
        C07530bf r7;
        AnonymousClass265 r8;
        String str;
        if (this.A09 != 0) {
            r7 = (C07530bf) this.A03;
            C34640IcN icN = (C34640IcN) this.A01;
            Handler handler = (Handler) this.A02;
            regFlowExtras = (RegFlowExtras) this.A05;
            String str2 = this.A07;
            r8 = (AnonymousClass265) this.A06;
            C67283zI.A02(handler, icN, icN, (C82804qI) null, (C82824qK) this.A00, regFlowExtras, (C24721jv) this.A04, r7, r8, regFlowExtras.A0Z, str2, false);
            str = "phone_autologin_dialog_log_in_tapped";
        } else {
            regFlowExtras = (RegFlowExtras) this.A05;
            regFlowExtras.A0k = true;
            r7 = (C07530bf) this.A03;
            C34640IcN icN2 = (C34640IcN) this.A01;
            Handler handler2 = (Handler) this.A02;
            String str3 = this.A07;
            r8 = (AnonymousClass265) this.A06;
            C67283zI.A02(handler2, icN2, icN2, (C82804qI) null, (C82824qK) this.A00, regFlowExtras, (C24721jv) this.A04, r7, r8, regFlowExtras.A0Z, str3, false);
            str = "phone_autologin_dialog_create_account_tapped";
        }
        C61763Vg A032 = C63313hF.A03(r7, regFlowExtras.A01(), r8, str);
        A032.A03("existing_user_username", this.A08);
        A032.A01();
    }
}
