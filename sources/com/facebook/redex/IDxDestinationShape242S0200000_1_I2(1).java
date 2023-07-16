package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass01J;
import X.AnonymousClass0wJ;
import X.AnonymousClass1b5;
import X.AnonymousClass1bG;
import X.AnonymousClass1bJ;
import X.AnonymousClass2S3;
import X.AnonymousClass3DH;
import X.AnonymousClass3VH;
import X.AnonymousClass3WW;
import X.AnonymousClass3YV;
import X.C04220Ms;
import X.C10300i6;
import X.C121907Is;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18220wO;
import X.C18250wR;
import X.C23211cm;
import X.C25786Drz;
import X.C25828Dsm;
import X.C63463hW;
import X.C63593hs;
import X.C82764qE;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.barcelona.R;

public class IDxDestinationShape242S0200000_1_I2 implements C82764qE {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxDestinationShape242S0200000_1_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public final void BMv(FragmentActivity fragmentActivity) {
        Fragment A0O;
        int i;
        String str;
        C25786Drz A002;
        Fragment r0;
        switch (this.A02) {
            case 0:
                C04220Ms.A0B(fragmentActivity, 0);
                C25828Dsm A0W = C18190wL.A0W(fragmentActivity);
                A0W.A0K(2131834858);
                A0W.A0P(C18250wR.A0E(fragmentActivity, this.A00, this.A01, 34), 2131834856);
                AnonymousClass0wJ.A1K(A0W);
                return;
            case 1:
                C04220Ms.A0B(fragmentActivity, 0);
                C25786Drz A0Q = C18180wK.A0Q(fragmentActivity, ((AnonymousClass3DH) this.A01).A04);
                A0Q.A03 = (Fragment) this.A00;
                A0Q.A05();
                return;
            case 2:
                C04220Ms.A0B(fragmentActivity, 0);
                AnonymousClass01J A0L = C18220wO.A0L(fragmentActivity);
                if (C63593hs.A05() || !C121907Is.A05(fragmentActivity, R.attr.nuxAllowSignUpFlow, true)) {
                    C63463hW.A03();
                    A0O = C18250wR.A0O((Bundle) this.A00);
                    C04220Ms.A0C(A0O, "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment");
                    i = R.id.layout_container_main;
                    str = "android.nux.LoginLandingFragment";
                } else {
                    C63463hW.A03();
                    A0O = new AnonymousClass1bJ();
                    A0O.setArguments((Bundle) this.A00);
                    C04220Ms.A0C(A0O, "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment");
                    i = R.id.layout_container_main;
                    str = "android.nux.FacebookLandingFragment";
                }
                A0L.A0G(A0O, str, i);
                A0L.A00();
                return;
            case 3:
                C04220Ms.A0B(fragmentActivity, 0);
                C63463hW.A03();
                AnonymousClass0wJ.A19(C18250wR.A0O((Bundle) this.A00), fragmentActivity, (C10300i6) this.A01);
                return;
            default:
                C04220Ms.A0B(fragmentActivity, 0);
                Bundle bundle = (Bundle) this.A00;
                String A003 = AnonymousClass2S3.A00(bundle);
                C10300i6 r2 = (C10300i6) this.A01;
                if (A003 != null) {
                    A002 = C63463hW.A00(fragmentActivity, r2);
                    C18190wL.A13(bundle, "IgSessionManager.LOGGED_OUT_TOKEN");
                    r0 = new AnonymousClass1b5();
                } else if (AnonymousClass3WW.A02(r2)) {
                    Integer num = AnonymousClass3VH.A00().A05;
                    Integer num2 = AnonymousClass006.A0C;
                    if (num == num2 || AnonymousClass3YV.A00().A01() == num2) {
                        C63463hW.A03();
                        C18190wL.A13(bundle, "IgSessionManager.LOGGED_OUT_TOKEN");
                        AnonymousClass1bG r1 = new AnonymousClass1bG();
                        r1.setArguments(bundle);
                        C18200wM.A1G(r1, fragmentActivity.getSupportFragmentManager());
                        return;
                    }
                    A002 = C18180wK.A0Q(fragmentActivity, r2);
                    r0 = new C23211cm();
                } else {
                    A002 = C63463hW.A00(fragmentActivity, r2);
                    r0 = new AnonymousClass1bJ();
                }
                C18180wK.A0x(bundle, r0, A002);
                return;
        }
    }
}
