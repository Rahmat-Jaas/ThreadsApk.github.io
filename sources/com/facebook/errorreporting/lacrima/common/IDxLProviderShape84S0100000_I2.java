package com.facebook.errorreporting.lacrima.common;

import X.AnonymousClass09B;
import X.AnonymousClass0MG;
import X.AnonymousClass0NB;
import X.AnonymousClass0OK;
import X.AnonymousClass0Q1;
import X.AnonymousClass0Q4;
import X.AnonymousClass0QI;
import X.AnonymousClass0Y5;
import X.AnonymousClass0Y6;
import X.C002801h;
import X.C019809f;
import X.C04350Ng;
import X.C04560Oe;
import X.C04570Of;
import X.C04840Pi;
import X.C05780Wa;
import X.C06010Xh;
import X.C06040Xk;
import X.C07430bV;
import X.C07450bX;
import X.C13810oL;
import X.C15430rJ;
import android.app.Application;
import android.net.Uri;
import java.io.File;

public class IDxLProviderShape84S0100000_I2 extends C06010Xh {
    public Object A00;
    public final int A01;

    public IDxLProviderShape84S0100000_I2(AnonymousClass0OK r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object A00() {
        AnonymousClass09B r0;
        switch (this.A01) {
            case 0:
                return new AnonymousClass0NB(this);
            case 1:
                C06040Xk r1 = ((AnonymousClass0OK) this.A00).A03().A03;
                C002801h.A02(r1, "Did you call SessionManager.init()?");
                return new C019809f(r1.A00.A02);
            case 2:
                AnonymousClass0OK r2 = (AnonymousClass0OK) this.A00;
                return new AnonymousClass0Y6(new File(r2.A03().A05, "reports"), r2.A0I, r2.A0K, r2.A0Y);
            case 3:
                AnonymousClass0OK r02 = (AnonymousClass0OK) this.A00;
                Application application = r02.A0L;
                r02.A0T.get();
                return new AnonymousClass0QI(application);
            case 4:
                C13810oL.A01("ReportAssembler", 1663784168);
                try {
                    AnonymousClass0OK r22 = (AnonymousClass0OK) this.A00;
                    AnonymousClass0Q4 A03 = r22.A03();
                    C04560Oe r03 = r22.A09;
                    if (r03 == null) {
                        r03 = new AnonymousClass0MG(r22);
                        r22.A09 = r03;
                    }
                    return new C04840Pi((AnonymousClass0Y5) r03.get(), A03);
                } finally {
                    C13810oL.A00(1250945190);
                }
            case 5:
                return C04350Ng.A03;
            case 6:
                return new AnonymousClass0Q1("", "", false);
            default:
                AnonymousClass0OK r23 = (AnonymousClass0OK) this.A00;
                C04560Oe r12 = r23.A0C;
                if (r12 == null) {
                    r12 = new IDxLProviderShape84S0100000_I2(r23, 6);
                    r23.A0C = r12;
                }
                AnonymousClass0Q1 r4 = (AnonymousClass0Q1) r12.get();
                String str = C04570Of.A00;
                Uri A012 = C15430rJ.A01(AnonymousClass0OK.A0d);
                if (str != null) {
                    A012 = A012.buildUpon().authority(C04570Of.A00).build();
                    r0 = new C05780Wa();
                } else {
                    r0 = new C07450bX(r23.A0J);
                }
                return new C07430bV(A012, r0, r4);
        }
    }
}
