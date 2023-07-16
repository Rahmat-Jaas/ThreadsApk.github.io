package com.facebook.redex;

import X.AnonymousClass03G;
import X.AnonymousClass10F;
import X.AnonymousClass1YD;
import X.AnonymousClass1dP;
import X.AnonymousClass1x0;
import X.C169839tz;
import X.C21660By6;
import X.C23081bt;
import X.C29371xr;
import X.C49042qk;
import X.C64633rJ;
import X.C82554pt;
import X.C83054qi;
import android.app.Activity;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;

public class IDxListenerShape412S0100000_1_I2 implements C21660By6 {
    public Object A00;
    public final int A01;

    public IDxListenerShape412S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BuH() {
        switch (this.A01) {
            case 1:
                ((AnonymousClass10F) ((C23081bt) this.A00).A05.getValue()).A00();
                return;
            case 3:
                AnonymousClass1YD r0 = (AnonymousClass1YD) this.A00;
                C82554pt r2 = r0.A00;
                if (r2 != null) {
                    r2.Bmr(r0.A03, r0.A01);
                    return;
                }
                return;
            case 4:
                ((Activity) this.A00).finish();
                return;
            case 5:
                IDxCListenerShape70S0200000_1_I2 iDxCListenerShape70S0200000_1_I2 = (IDxCListenerShape70S0200000_1_I2) this.A00;
                AnonymousClass1x0 r3 = (AnonymousClass1x0) iDxCListenerShape70S0200000_1_I2.A00;
                AnonymousClass1x0.A0D(r3, false);
                AnonymousClass1x0.A0B(r3, C169839tz.PrivacyStatusPublic, (User) iDxCListenerShape70S0200000_1_I2.A01, false);
                return;
            case 6:
                IDxCListenerShape70S0200000_1_I2 iDxCListenerShape70S0200000_1_I22 = (IDxCListenerShape70S0200000_1_I2) this.A00;
                AnonymousClass1x0 r32 = (AnonymousClass1x0) iDxCListenerShape70S0200000_1_I22.A00;
                AnonymousClass1x0.A0D(r32, true);
                AnonymousClass1x0.A0B(r32, C169839tz.PrivacyStatusPrivate, (User) iDxCListenerShape70S0200000_1_I22.A01, false);
                return;
            case 7:
                C64633rJ r4 = (C64633rJ) this.A00;
                C29371xr r33 = r4.A00;
                r33.A0C = true;
                User user = r4.A01;
                user.A20(C169839tz.PrivacyStatusPrivate);
                if (!C49042qk.A00(r33.A04, user) || r4.A02) {
                    C29371xr.A01(r33, user, false, r4.A03);
                    return;
                } else {
                    C29371xr.A01(r33, user, true, r4.A03);
                    return;
                }
            case 8:
                IDxCListenerShape70S0200000_1_I2 iDxCListenerShape70S0200000_1_I23 = (IDxCListenerShape70S0200000_1_I2) this.A00;
                C29371xr r34 = (C29371xr) iDxCListenerShape70S0200000_1_I23.A00;
                r34.A0C = false;
                User user2 = (User) iDxCListenerShape70S0200000_1_I23.A01;
                user2.A20(C169839tz.PrivacyStatusPublic);
                C29371xr.A01(r34, user2, false, false);
                return;
            case 9:
                C83054qi r02 = ((AnonymousClass1dP) this.A00).A00;
                if (r02 != null) {
                    r02.C3F();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void BuI() {
        FragmentActivity activity;
        Window window;
        if (this.A01 == 0 && (activity = ((Fragment) this.A00).getActivity()) != null && (window = activity.getWindow()) != null) {
            AnonymousClass03G.A00(window, false);
        }
    }
}
