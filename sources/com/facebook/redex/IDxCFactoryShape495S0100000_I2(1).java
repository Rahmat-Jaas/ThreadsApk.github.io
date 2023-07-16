package com.facebook.redex;

import X.AnonymousClass0LK;
import X.AnonymousClass0NI;
import X.AnonymousClass0NP;
import X.AnonymousClass0OB;
import X.AnonymousClass0OK;
import X.AnonymousClass0Q4;
import X.AnonymousClass0R9;
import X.AnonymousClass0RR;
import X.AnonymousClass0Uq;
import X.AnonymousClass0Y1;
import X.AnonymousClass0e5;
import X.C03980Lt;
import X.C04100Mg;
import X.C04220Ms;
import X.C04390Nk;
import X.C04560Oe;
import X.C05970Xd;
import X.C06740aH;
import X.C07220b8;
import X.C07250bD;
import X.C07330bL;
import X.C07390bR;
import X.C07960cV;
import android.app.Application;
import com.instagram.react.modules.base.IgReactQEModule;

public class IDxCFactoryShape495S0100000_I2 implements AnonymousClass0OB {
    public Object A00;
    public final int A01;

    public IDxCFactoryShape495S0100000_I2(Application application, int i) {
        this.A01 = i;
        this.A00 = application;
    }

    public final /* bridge */ /* synthetic */ Object AFC(AnonymousClass0OK r10) {
        AnonymousClass0OK r7 = r10;
        switch (this.A01) {
            case 0:
                throw new IllegalStateException("Missing ConfigFactory<Detector> implementation");
            case 1:
                return new AnonymousClass0LK(r10.A0L, (C07390bR) this.A00, C04560Oe.A00(r10));
            case 2:
                return new C07250bD((Application) this.A00, r10.A02(), r10.A03());
            case 3:
                C04100Mg A02 = r10.A02();
                return new C07330bL(A02, (C07220b8) A02.A03(C07220b8.class));
            case 4:
                Application application = (Application) this.A00;
                AnonymousClass0Q4 A03 = r10.A03();
                C04560Oe r0 = r10.A0F;
                if (r0 == null) {
                    r0 = new AnonymousClass0NI(r10);
                    r10.A0F = r0;
                }
                return new C03980Lt(application, (AnonymousClass0Y1) r0.get(), r7, A03, this);
            case 7:
                return null;
            case 8:
                return new C04390Nk(r10.A03().A02(r10.A03().A06), (int) C07960cV.A00(AnonymousClass0e5.A00(36597394854382174L)));
            case 9:
                return new IDxListenerShape299S0200000_I2(1, this.A00, r10);
            case 10:
                return new AnonymousClass0RR(r10.A0L);
            case 11:
                return new AnonymousClass0R9(r10.A0L);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                AnonymousClass0Q4 A032 = r10.A03();
                C04220Ms.A06(A032);
                return new AnonymousClass0Uq(r10.A0L, A032, ((C06740aH) this.A00).A00);
            case 13:
                return new C05970Xd(r10.A03().A02(r10.A03().A06));
            default:
                return new AnonymousClass0NP(r10.A0L);
        }
    }

    public IDxCFactoryShape495S0100000_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
