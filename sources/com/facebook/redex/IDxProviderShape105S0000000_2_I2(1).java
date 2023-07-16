package com.facebook.redex;

import X.AnonymousClass0wJ;
import X.AnonymousClass5jF;
import X.AnonymousClass5jG;
import X.AnonymousClass5jH;
import X.AnonymousClass5jI;
import X.AnonymousClass5jL;
import X.AnonymousClass6I6;
import X.AnonymousClass79P;
import X.AnonymousClass7D8;
import X.C04560Oe;
import X.C111086ml;
import X.C115266um;
import X.C121787Id;
import X.C18220wO;
import X.C86014w8;
import X.C956561q;
import X.C956661r;
import com.fbpay.ptt.impl.ServerCertsVerifier;
import com.google.firebase.iid.FirebaseInstanceId;
import com.instagram.barcelona.R;
import java.util.Collections;
import java.util.HashMap;

public class IDxProviderShape105S0000000_2_I2 implements C04560Oe {
    public final int A00;

    public IDxProviderShape105S0000000_2_I2(int i) {
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object get() {
        C86014w8 r0;
        C86014w8 r02;
        switch (this.A00) {
            case 0:
                return new AnonymousClass5jL();
            case 1:
                return new AnonymousClass6I6();
            case 2:
                return new C111086ml();
            case 3:
                return new ServerCertsVerifier();
            case 4:
                synchronized (AnonymousClass7D8.class) {
                    AnonymousClass7D8.A00();
                    r0 = AnonymousClass7D8.A00;
                }
                return FirebaseInstanceId.getInstance((C121787Id) r0.get());
            case 5:
                synchronized (AnonymousClass7D8.class) {
                    AnonymousClass7D8.A00();
                    r02 = AnonymousClass7D8.A01;
                }
                return ((C115266um) r02.get()).A03;
            case 6:
                HashMap A0y = AnonymousClass0wJ.A0y();
                Integer valueOf = Integer.valueOf(R.style.FbPayAuthSettingsIg4a);
                Integer A0d = C18220wO.A0d();
                A0y.put(AnonymousClass5jH.class, new AnonymousClass79P(valueOf, A0d));
                A0y.put(AnonymousClass5jG.class, new AnonymousClass79P(Integer.valueOf(R.style.AuthEditTextFieldTheme), A0d));
                A0y.put(AnonymousClass5jF.class, new AnonymousClass79P(Integer.valueOf(R.style.AuthCredentialTheme), A0d));
                A0y.put(AnonymousClass5jI.class, new AnonymousClass79P(A0d, Integer.valueOf(R.layout.fbpay_auth_ig_web_view)));
                return Collections.unmodifiableMap(A0y);
            case 7:
                return new C956561q();
            default:
                return new C956661r();
        }
    }
}
