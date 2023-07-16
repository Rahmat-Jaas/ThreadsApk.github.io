package com.facebook.redex;

import X.AnonymousClass1jY;
import X.AnonymousClass4RP;
import X.C04220Ms;
import X.C10300i6;
import X.C10450iM;
import X.C11630kW;
import X.C130667qT;
import X.C24551ja;
import X.C30938GbW;
import X.C555933v;
import X.C61323St;
import X.C63643hy;
import X.C63813iO;
import X.C73334Rz;
import X.C82364pV;
import android.content.Context;
import androidx.fragment.app.Fragment;

public class IDxObserverShape151S0300000_1_I2 implements C82364pV {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxObserverShape151S0300000_1_I2(int i, Object obj, Object obj2, Object obj3) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void CGv(C555933v r6) {
        switch (this.A03) {
            case 0:
                C04220Ms.A0B(r6, 0);
                Fragment fragment = (Fragment) this.A00;
                if (fragment.mDetached) {
                    return;
                }
                if (r6 instanceof AnonymousClass1jY) {
                    Context context = fragment.getContext();
                    if (context != null) {
                        C63813iO.A02(context, context.getString(2131831662), "network_error", 0);
                    }
                    Throwable cause = ((AnonymousClass1jY) r6).A00.getCause();
                    if (cause != null) {
                        C10450iM.A07(((C11630kW) this.A01).getModuleName(), cause);
                        return;
                    }
                    return;
                } else if (r6 instanceof C24551ja) {
                    C63643hy.A05(new AnonymousClass4RP(C130667qT.A01(fragment, (C11630kW) this.A01, (C10300i6) this.A02, (C30938GbW) null), C61323St.A00(((C24551ja) r6).A00)));
                    return;
                } else {
                    return;
                }
            case 1:
                Context context2 = (Context) this.A01;
                C130667qT r2 = (C130667qT) this.A02;
                C63643hy.A04((Runnable) this.A00);
                if (r6 instanceof AnonymousClass1jY) {
                    C63813iO.A09(context2);
                    C10450iM.A07(r2.A05.getModuleName(), ((AnonymousClass1jY) r6).A00.getCause());
                    return;
                } else if (r6 instanceof C24551ja) {
                    C63643hy.A04(new C73334Rz(r2, C61323St.A00(((C24551ja) r6).A00)));
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }
}
