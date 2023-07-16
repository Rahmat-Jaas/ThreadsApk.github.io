package com.facebook.redex;

import X.C146958n9;
import X.C83234r0;
import X.C84714tk;
import android.content.Context;

public class IDxFlowShape28S1200000_1_I2 implements C84714tk {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public IDxFlowShape28S1200000_1_I2(Context context, String str, C84714tk r3, int i) {
        this.A03 = i;
        this.A01 = r3;
        this.A00 = context;
        this.A02 = str;
    }

    public final Object collect(C83234r0 r6, C146958n9 r7) {
        int i;
        int i2 = this.A03;
        C84714tk r4 = (C84714tk) this.A01;
        Object obj = this.A00;
        String str = this.A02;
        if (i2 != 0) {
            i = 3;
        } else {
            i = 2;
        }
        return C84714tk.A00(r7, r4, new IDxFCollectorShape20S1200000_1_I2(obj, r6, str, i));
    }
}
