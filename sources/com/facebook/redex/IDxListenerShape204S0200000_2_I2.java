package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass2FT;
import X.AnonymousClass5xd;
import X.C04530Oa;
import X.C18180wK;
import X.C21660By6;
import X.C25786Drz;
import X.C58963Iu;
import X.C62763ag;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;

public class IDxListenerShape204S0200000_2_I2 implements C21660By6 {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxListenerShape204S0200000_2_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final void BuH() {
        if (this.A02 != 0) {
            new C62763ag((C58963Iu) this.A00).A02((Activity) this.A01);
            return;
        }
        AnonymousClass5xd r3 = (AnonymousClass5xd) this.A01;
        C04530Oa r2 = r3.A07;
        C25786Drz A0Q = C18180wK.A0Q((FragmentActivity) this.A00, AnonymousClass0wJ.A0U(r2));
        A0Q.A03 = AnonymousClass2FT.A00().A01().A00(AnonymousClass0wJ.A0X(r2), "REEL", (String) null, r3.A00, false);
        A0Q.A05();
    }

    public final void BuI() {
    }
}
