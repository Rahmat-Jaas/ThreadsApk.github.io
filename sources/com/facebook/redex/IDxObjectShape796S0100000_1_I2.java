package com.facebook.redex;

import X.AnonymousClass1c9;
import X.AnonymousClass265;
import X.AnonymousClass4PF;
import X.C54192z3;
import X.C83914sC;
import X.C85964w3;
import android.accounts.Account;
import android.text.TextUtils;
import java.util.List;

public class IDxObjectShape796S0100000_1_I2 implements C85964w3, C83914sC {
    public Object A00;
    public final int A01;

    public IDxObjectShape796S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void C0m(List list) {
        if (this.A01 == 0) {
            ((AnonymousClass1c9) this.A00).A00 = list.size();
        }
    }

    public final void C0n(Account account, String str) {
        if (this.A01 == 0) {
            AnonymousClass1c9 r3 = (AnonymousClass1c9) this.A00;
            synchronized (r3) {
                if (!TextUtils.isEmpty(str)) {
                    r3.A0O.add(str);
                }
                int i = r3.A01 + 1;
                r3.A01 = i;
                if (r3.A0L && i == r3.A00) {
                    C54192z3.A00(r3.A0C, AnonymousClass265.A1c, "token_ready_later");
                    r3.A0M.removeCallbacksAndMessages((Object) null);
                    if (r3.A08()) {
                        r3.requireActivity().runOnUiThread(new AnonymousClass4PF(this));
                    }
                }
            }
        }
    }
}
