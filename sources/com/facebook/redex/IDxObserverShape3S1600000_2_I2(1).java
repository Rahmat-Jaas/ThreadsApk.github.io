package com.facebook.redex;

import X.AnonymousClass7Ic;
import X.AnonymousClass7Kx;
import X.AnonymousClass835;
import X.C105016ck;
import X.C107266gT;
import X.C1197276p;
import X.C1359980y;
import X.C1373588g;
import X.C142618fJ;
import X.C143158gC;
import X.C880756q;
import X.M5J;
import java.util.concurrent.Executor;

public class IDxObserverShape3S1600000_2_I2 implements C143158gC {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public final int A07;

    public IDxObserverShape3S1600000_2_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i) {
        this.A07 = i;
        this.A00 = obj5;
        this.A02 = obj2;
        this.A06 = str;
        this.A03 = obj4;
        this.A01 = obj;
        this.A04 = obj6;
        this.A05 = obj3;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        Executor executor;
        Runnable r1;
        AnonymousClass7Kx r8 = (AnonymousClass7Kx) obj;
        if (this.A07 != 0) {
            if (AnonymousClass7Kx.A0R(r8)) {
                ((M5J) this.A03).A0F(this);
                executor = ((C1197276p) this.A00).A02;
                r1 = new C1359980y(this, r8);
            } else if (AnonymousClass7Kx.A0O(r8)) {
                ((M5J) this.A03).A0F(this);
                Throwable th = r8.A02;
                executor = (Executor) this.A02;
                r1 = new AnonymousClass835((C1197276p) this.A00, (C105016ck) this.A04, (Object) null, (String) null, th);
            } else {
                return;
            }
            executor.execute(r1);
            return;
        }
        Throwable th2 = r8.A02;
        boolean z = th2 instanceof C1373588g;
        if (z) {
            int i = ((C1373588g) th2).A00;
            if (i == 7 || i == 9 || i == 13) {
                ((M5J) this.A02).A0F(this);
                AnonymousClass7Ic r3 = (AnonymousClass7Ic) this.A00;
                r3.A03.A01();
                String str = this.A06;
                C142618fJ r0 = (C142618fJ) this.A01;
                Object obj2 = this.A04;
                AnonymousClass7Ic.A01(r0, (C880756q) this.A05, (C107266gT) this.A03, r3, obj2, str);
                return;
            } else if (z && i == 104) {
                return;
            }
        }
        ((M5J) this.A05).A0G(r8);
    }
}
