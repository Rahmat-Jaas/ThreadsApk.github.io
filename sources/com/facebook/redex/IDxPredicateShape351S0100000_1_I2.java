package com.facebook.redex;

import X.AnonymousClass3IX;
import X.C04220Ms;
import X.C06810aP;
import X.C18180wK;
import X.C41836MeS;
import X.C71734Jz;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

public class IDxPredicateShape351S0100000_1_I2 implements C41836MeS {
    public Object A00;
    public final int A01;

    public IDxPredicateShape351S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean apply(Object obj) {
        switch (this.A01) {
            case 0:
                if (((AnonymousClass3IX) obj).A00 == this.A00) {
                    return true;
                }
                return false;
            case 1:
                String path = ((File) obj).getPath();
                Iterator it = ((Set) this.A00).iterator();
                while (it.hasNext()) {
                    if (C18180wK.A0k(it).startsWith(path)) {
                        return false;
                    }
                }
                return true;
            default:
                return !C04220Ms.A0I(C06810aP.A01.A01(((C71734Jz) this.A00).A04), obj);
        }
    }
}
