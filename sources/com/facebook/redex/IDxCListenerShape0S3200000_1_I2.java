package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass3BX;
import X.AnonymousClass5rZ;
import X.C10300i6;
import X.C18220wO;
import X.C18240wQ;
import X.C24751jz;
import X.C31155GhB;
import X.C36941JhV;
import X.C63813iO;
import X.H1T;
import android.content.Context;
import android.content.DialogInterface;
import com.instagram.simplewebview.SimpleWebViewActivity;

public class IDxCListenerShape0S3200000_1_I2 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public String A04;
    public final int A05;

    public IDxCListenerShape0S3200000_1_I2(Object obj, Object obj2, String str, String str2, String str3, int i) {
        this.A05 = i;
        this.A00 = obj2;
        this.A02 = str;
        this.A01 = obj;
        this.A04 = str2;
        this.A03 = str3;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C36941JhV jhV;
        if (this.A05 != 0) {
            dialogInterface.dismiss();
            C24751jz r1 = (C24751jz) this.A00;
            r1.A0A(AnonymousClass5rZ.A00, C18220wO.A0R("login_continue_button"), r1.A08, this.A03, this.A02, this.A04, ((AnonymousClass3BX) this.A01).A01);
            return;
        }
        String str = this.A02;
        boolean equalsIgnoreCase = "report_problem".equalsIgnoreCase(str);
        if ("open_challenge".equalsIgnoreCase(str) || equalsIgnoreCase) {
            String str2 = this.A04;
            H1T A0N = AnonymousClass0wJ.A0N((C10300i6) this.A01);
            A0N.A0J(str2);
            C31155GhB.A03(AnonymousClass0wJ.A0S(A0N));
            if (equalsIgnoreCase) {
                C63813iO.A00(C18240wQ.A0C(this.A00), 2131827455);
                return;
            }
            return;
        }
        boolean equalsIgnoreCase2 = "open_request_form".equalsIgnoreCase(str);
        Context A0C = C18240wQ.A0C(this.A00);
        C10300i6 r2 = (C10300i6) this.A01;
        String str3 = this.A04;
        if (!equalsIgnoreCase2) {
            jhV = new C36941JhV(str3);
            jhV.A02 = this.A03;
        }
        SimpleWebViewActivity.A00(A0C, r2, jhV.A00());
    }
}
