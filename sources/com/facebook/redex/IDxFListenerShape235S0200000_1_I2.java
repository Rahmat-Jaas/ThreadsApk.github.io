package com.facebook.redex;

import X.AnonymousClass1YO;
import X.AnonymousClass3QH;
import X.AnonymousClass3XX;
import X.AnonymousClass7Ko;
import X.C04220Ms;
import X.C18180wK;
import X.C18200wM;
import X.C18210wN;
import X.C25337Djx;
import X.C57173Aa;
import X.C83884s9;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;

public class IDxFListenerShape235S0200000_1_I2 implements C83884s9 {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxFListenerShape235S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public final void CNG(User user) {
        switch (this.A02) {
            case 0:
                C04220Ms.A0B(user, 0);
                C25337Djx djx = (C25337Djx) this.A01;
                FragmentActivity fragmentActivity = (FragmentActivity) this.A00;
                AnonymousClass1YO r5 = new AnonymousClass1YO();
                Bundle A06 = C18180wK.A06();
                A06.putString(AnonymousClass3QH.A00(84, 8, 5), user.BK7());
                r5.setArguments(A06);
                r5.A00 = new C57173Aa(fragmentActivity, djx, user);
                C18200wM.A16(fragmentActivity, r5, C18210wN.A0L(djx.A01));
                return;
            case 1:
            case 2:
                C04220Ms.A0B(user, 0);
                AnonymousClass7Ko.A0E(false, "Must call setInstanceSupplier first");
                throw null;
            default:
                return;
        }
    }

    public final void Bxr(AnonymousClass3XX r1) {
    }
}
