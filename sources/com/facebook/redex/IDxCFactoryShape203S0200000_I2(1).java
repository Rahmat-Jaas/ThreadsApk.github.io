package com.facebook.redex;

import X.AnonymousClass0L9;
import X.AnonymousClass0LB;
import X.AnonymousClass0LC;
import X.AnonymousClass0LX;
import X.AnonymousClass0LY;
import X.AnonymousClass0LZ;
import X.AnonymousClass0OB;
import X.AnonymousClass0OK;
import X.AnonymousClass0Q4;
import X.AnonymousClass0WY;
import X.AnonymousClass0Y9;
import X.C002801h;
import X.C04100Mg;
import X.C04560Oe;
import X.C06110Xs;
import X.C06440Zj;
import X.C07150ay;
import X.C07390bR;
import android.app.Application;
import com.facebook.endtoend.EndToEnd;
import java.io.File;

public class IDxCFactoryShape203S0200000_I2 implements AnonymousClass0OB {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCFactoryShape203S0200000_I2(int i, Object obj, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object AFC(AnonymousClass0OK r17) {
        long j;
        long j2;
        int i;
        int i2;
        switch (this.A02) {
            case 0:
                return new AnonymousClass0LZ((Application) this.A00, (C07390bR) this.A01, C04560Oe.A00(r17));
            case 1:
                return new AnonymousClass0LY((Application) this.A00, (C07390bR) this.A01, C04560Oe.A00(r17));
            case 2:
                return new AnonymousClass0LX((Application) this.A00, (C07390bR) this.A01, C04560Oe.A00(r17));
            case 3:
                AnonymousClass0Q4 A03 = r17.A03();
                C04100Mg A022 = r17.A02();
                if (EndToEnd.A04()) {
                    j = 12000;
                    j2 = 1;
                    i = 1;
                    i2 = Integer.MAX_VALUE;
                } else {
                    j = 120000;
                    j2 = 1000;
                    i = 50;
                    i2 = 10;
                }
                return new C07150ay(A022, (C06110Xs) this.A00, new AnonymousClass0Y9(i, i2, j, j2), (C06440Zj) this.A01, A03);
            case 4:
                return new AnonymousClass0LC((Application) this.A00, (C07390bR) this.A01, C04560Oe.A00(r17));
            case 5:
                return new AnonymousClass0LB((Application) this.A00, (C07390bR) this.A01, C04560Oe.A00(r17));
            case 6:
                return new AnonymousClass0L9((Application) this.A00, (C07390bR) this.A01, C04560Oe.A00(r17));
            default:
                File file = r17.A03().A04;
                C002801h.A02(file, "Did you call SessionManager.init()?");
                return new AnonymousClass0WY(file, (Integer) this.A00);
        }
    }
}
