package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass1ai;
import X.C18210wN;
import X.C34583IbB;
import X.C34620Ibt;
import X.C39528KvC;
import X.C67093yr;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

public class IDxTCallbackShape37S1100000_1_I2 implements C39528KvC {
    public Object A00;
    public String A01;
    public final int A02;

    public IDxTCallbackShape37S1100000_1_I2(String str, Object obj, int i) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = str;
    }

    public final void onComplete() {
        FragmentActivity fragmentActivity;
        UserSession userSession;
        switch (this.A02) {
            case 0:
                C34583IbB ibB = (C34583IbB) this.A00;
                fragmentActivity = ibB.requireActivity();
                userSession = AnonymousClass0wJ.A0X(ibB.A0A);
                break;
            case 1:
                C34620Ibt ibt = (C34620Ibt) this.A00;
                fragmentActivity = ibt.requireActivity();
                userSession = ibt.A0J;
                if (userSession == null) {
                    C18210wN.A0m();
                    throw null;
                }
                break;
            default:
                AnonymousClass1ai r0 = (AnonymousClass1ai) this.A00;
                C67093yr.A01(r0.requireActivity(), AnonymousClass1ai.A01(r0), this.A01);
                return;
        }
        C67093yr.A00(fragmentActivity, userSession, this.A01);
    }
}
