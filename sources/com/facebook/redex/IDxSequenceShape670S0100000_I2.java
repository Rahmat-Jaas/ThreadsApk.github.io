package com.facebook.redex;

import X.C05200Rv;
import X.C146838mw;
import android.view.ViewGroup;
import java.util.Iterator;

public class IDxSequenceShape670S0100000_I2 implements C146838mw {
    public Object A00;
    public final int A01;

    public IDxSequenceShape670S0100000_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Iterator iterator() {
        switch (this.A01) {
            case 0:
                return new C05200Rv((ViewGroup) this.A00);
            case 1:
                return ((Iterable) this.A00).iterator();
            default:
                return null;
        }
    }
}
