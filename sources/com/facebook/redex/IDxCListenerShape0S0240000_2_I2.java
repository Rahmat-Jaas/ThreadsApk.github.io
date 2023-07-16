package com.facebook.redex;

import X.AnonymousClass006;
import X.AnonymousClass58H;
import X.AnonymousClass62L;
import X.C122027Jo;
import android.content.DialogInterface;
import java.util.Map;

public class IDxCListenerShape0S0240000_2_I2 implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final int A06;

    public IDxCListenerShape0S0240000_2_I2(AnonymousClass62L r1, Map map, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A06 = i;
        this.A01 = r1;
        this.A05 = z;
        this.A02 = z2;
        this.A00 = map;
        this.A03 = z3;
        this.A04 = z4;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.A06;
        AnonymousClass62L r0 = (AnonymousClass62L) this.A01;
        if (i2 != 0) {
            Integer num = AnonymousClass006.A1L;
            boolean z = this.A05;
            boolean z2 = this.A02;
            boolean z3 = this.A03;
            boolean z4 = this.A04;
            C122027Jo r5 = (C122027Jo) r0.A01.getValue();
            Integer num2 = AnonymousClass006.A15;
            C122027Jo.A02(r5, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), Boolean.valueOf(z4), num2, num, (Map) this.A00, (Map) null, (Map) null, 288);
            return;
        }
        Integer num3 = AnonymousClass006.A1C;
        boolean z5 = this.A05;
        boolean z6 = this.A02;
        Map map = (Map) this.A00;
        boolean z7 = this.A03;
        boolean z8 = this.A04;
        C122027Jo.A02((C122027Jo) r0.A01.getValue(), Boolean.valueOf(z5), Boolean.valueOf(z6), Boolean.valueOf(z7), Boolean.valueOf(z8), AnonymousClass006.A15, num3, map, (Map) null, (Map) null, 288);
        ((AnonymousClass58H) r0.A02.getValue()).A06(map, false, z5, z6, z7, z8);
    }
}
