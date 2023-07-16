package com.facebook.redex;

import X.AnonymousClass5k0;
import X.C122037Js;
import X.C14030oh;
import X.C99216Io;
import X.C99226Ip;
import android.view.View;
import com.fbpay.hub.form.params.FormLogEvents;
import java.util.Map;

public class IDxCListenerShape3S0110000_2_I2 implements View.OnClickListener {
    public Object A00;
    public boolean A01;
    public final int A02;

    public IDxCListenerShape3S0110000_2_I2(AnonymousClass5k0 r1, int i, boolean z) {
        this.A02 = i;
        this.A00 = r1;
        this.A01 = z;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        if (this.A02 != 0) {
            A05 = C14030oh.A05(-464675253);
            AnonymousClass5k0 r2 = (AnonymousClass5k0) this.A00;
            boolean z = this.A01;
            Map A06 = C122037Js.A06(r2.A01);
            A06.put("target_name", "add_phone");
            r2.A03.Bb8("user_add_contact_enter", A06);
            AnonymousClass5k0.A00(r2, C99226Ip.A00(new FormLogEvents("fbpay_add_phone_cancel", "fbpay_delete_phone_cancel", "fbpay_delete_phone_click", "fbpay_add_phone_display", "fbpay_delete_phone_api_init", "fbpay_delete_phone_display", "fbpay_delete_phone_failure", "fbpay_delete_phone_success", "fbpay_add_phone_api_init", "fbpay_add_phone_click", "fbpay_add_phone_failure", "fbpay_add_phone_success"), r2.A01, (String) null, (String) null, z));
            i = -1343180615;
        } else {
            A05 = C14030oh.A05(258322339);
            AnonymousClass5k0 r22 = (AnonymousClass5k0) this.A00;
            boolean z2 = this.A01;
            Map A062 = C122037Js.A06(r22.A01);
            A062.put("target_name", "add_email");
            r22.A03.Bb8("user_add_contact_enter", A062);
            AnonymousClass5k0.A00(r22, C99216Io.A00(new FormLogEvents("fbpay_add_email_cancel", "fbpay_delete_email_cancel", "fbpay_delete_email_click", "fbpay_add_email_display", "fbpay_delete_email_api_init", "fbpay_delete_email_display", "fbpay_delete_email_failure", "fbpay_delete_email_success", "fbpay_add_email_api_init", "fbpay_add_email_click", "fbpay_add_email_failure", "fbpay_add_email_success"), r22.A01, (String) null, (String) null, z2));
            i = -1158973624;
        }
        C14030oh.A0C(i, A05);
    }
}
