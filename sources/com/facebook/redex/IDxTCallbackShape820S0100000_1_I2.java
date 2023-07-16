package com.facebook.redex;

import X.AnonymousClass1ai;
import X.AnonymousClass1cC;
import X.AnonymousClass4u1;
import X.C04220Ms;
import X.C04530Oa;
import X.C18180wK;
import X.C18240wQ;
import X.C19320zg;
import X.C35394Iu2;
import X.C39528KvC;
import X.C67093yr;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

public class IDxTCallbackShape820S0100000_1_I2 implements C39528KvC {
    public Object A00;
    public final int A01;

    public IDxTCallbackShape820S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onComplete() {
        String str;
        if (this.A01 != 0) {
            AnonymousClass1ai r0 = (AnonymousClass1ai) this.A00;
            FragmentActivity requireActivity = r0.requireActivity();
            UserSession A012 = AnonymousClass1ai.A01(r0);
            String str2 = r0.A06;
            if (str2 != null) {
                String str3 = r0.A08;
                if (str3 != null) {
                    C04220Ms.A0B(A012, 1);
                    Bundle A06 = C18180wK.A06();
                    A06.putString("paymentAccountID", str2);
                    A06.putString("wizardName", "RESOLVE_DYNAMIC_DESCSRIPTOR_FRICTION");
                    AnonymousClass4u1.A01(A06, requireActivity, A012, "paymentMethodID", str3);
                    return;
                }
                throw C18180wK.A0a("payment method ID is non-null for DD flow");
            }
            throw C18180wK.A0a("ad account ID is non-null for DD flow");
        }
        AnonymousClass1cC r6 = (AnonymousClass1cC) this.A00;
        String str4 = r6.A02;
        if (str4 == null) {
            str = "previousStep";
        } else {
            str = "userSession";
            if (str4.equals(C35394Iu2.A11.toString())) {
                FragmentActivity requireActivity2 = r6.requireActivity();
                UserSession userSession = r6.A01;
                if (userSession != null) {
                    String A04 = ((C19320zg) r6.A03.getValue()).A00.A04(C35394Iu2.A1B.toString(), "update_account_spend_limit_before_prevalidation");
                    C04220Ms.A06(A04);
                    C67093yr.A00(requireActivity2, userSession, A04);
                    return;
                }
            } else if (str4.equals(C35394Iu2.A19.toString())) {
                FragmentActivity requireActivity3 = r6.requireActivity();
                UserSession userSession2 = r6.A01;
                if (userSession2 != null) {
                    C04530Oa r3 = r6.A03;
                    String A042 = ((C19320zg) r3.getValue()).A00.A04(C35394Iu2.A1B.toString(), "update_account_spend_limit_before_boost");
                    C04220Ms.A06(A042);
                    C18240wQ.A1B(AnonymousClass4u1.A00(C18180wK.A06(), requireActivity3, userSession2, A042));
                    ((C19320zg) r3.getValue()).A01.A1m = true;
                    return;
                }
            } else {
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }
}
