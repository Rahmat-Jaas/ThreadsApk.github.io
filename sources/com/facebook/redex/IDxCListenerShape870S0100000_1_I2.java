package com.facebook.redex;

import X.C22801Zx;
import X.C27541sg;
import android.widget.DatePicker;

public class IDxCListenerShape870S0100000_1_I2 implements DatePicker.OnDateChangedListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape870S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onDateChanged(DatePicker datePicker, int i, int i2, int i3) {
        int i4 = this.A01;
        Object obj = this.A00;
        if (i4 != 0) {
            C22801Zx r1 = (C22801Zx) obj;
            r1.A00.set(i, i2, i3);
            C22801Zx.A00(r1);
            return;
        }
        C27541sg r12 = (C27541sg) obj;
        r12.A00 = i3;
        r12.A01 = i2;
        r12.A02 = i;
        if (r12.A03 != null) {
            C27541sg.A01(r12);
        }
    }
}
