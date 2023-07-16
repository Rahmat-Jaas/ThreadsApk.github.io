package com.facebook.redex;

import X.AnonymousClass6CR;
import X.AnonymousClass6D5;
import X.AnonymousClass7Kx;
import X.AnonymousClass88W;
import X.C111816oT;
import X.C120967Dk;
import X.C143158gC;
import X.C145358kN;

public class IDxObserverShape40S1100000_2_I2 implements C143158gC {
    public Object A00;
    public String A01;
    public final int A02;

    public IDxObserverShape40S1100000_2_I2(IDxAObserverShape4S2200000_2_I2 iDxAObserverShape4S2200000_2_I2, String str, int i) {
        this.A02 = i;
        this.A00 = iDxAObserverShape4S2200000_2_I2;
        this.A01 = str;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        Throwable th;
        if (this.A02 != 0) {
            AnonymousClass7Kx r5 = (AnonymousClass7Kx) obj;
            if (AnonymousClass7Kx.A0R(r5)) {
                C111816oT r3 = AnonymousClass6D5.A00;
                if (r3 == null) {
                    r3 = new C111816oT();
                    AnonymousClass6D5.A00 = r3;
                }
                IDxAObserverShape4S2200000_2_I2 iDxAObserverShape4S2200000_2_I2 = (IDxAObserverShape4S2200000_2_I2) this.A00;
                r3.A00((C120967Dk) AnonymousClass7Kx.A0D(r5), iDxAObserverShape4S2200000_2_I2.A03);
                ((C145358kN) iDxAObserverShape4S2200000_2_I2.A00).CDo(this.A01);
                return;
            }
            if (AnonymousClass7Kx.A0O(r5) && (th = r5.A02) != null) {
                if (th instanceof AnonymousClass88W) {
                    AnonymousClass88W r32 = (AnonymousClass88W) th;
                    ((C145358kN) ((IDxAObserverShape4S2200000_2_I2) this.A00).A00).CDn(Boolean.valueOf(r32.A01), Integer.valueOf(r32.A00), r32);
                    return;
                }
                ((C145358kN) ((IDxAObserverShape4S2200000_2_I2) this.A00).A00).CDn((Boolean) null, (Integer) null, th);
            }
            ((C145358kN) ((IDxAObserverShape4S2200000_2_I2) this.A00).A00).CDn((Boolean) null, (Integer) null, new AnonymousClass6CR());
            return;
        }
        AnonymousClass7Kx r52 = (AnonymousClass7Kx) obj;
        boolean A0R = AnonymousClass7Kx.A0R(r52);
        IDxAObserverShape4S2200000_2_I2 iDxAObserverShape4S2200000_2_I22 = (IDxAObserverShape4S2200000_2_I2) this.A00;
        if (A0R) {
            ((C145358kN) iDxAObserverShape4S2200000_2_I22.A00).CDo(this.A01);
            C111816oT r2 = AnonymousClass6D5.A00;
            if (r2 == null) {
                r2 = new C111816oT();
                AnonymousClass6D5.A00 = r2;
            }
            r2.A00((C120967Dk) AnonymousClass7Kx.A0D(r52), iDxAObserverShape4S2200000_2_I22.A03);
            return;
        }
        ((C145358kN) iDxAObserverShape4S2200000_2_I22.A00).CDn((Boolean) null, (Integer) null, new AnonymousClass6CR());
    }
}
