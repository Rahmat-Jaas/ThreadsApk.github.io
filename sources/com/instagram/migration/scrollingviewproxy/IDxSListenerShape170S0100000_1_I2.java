package com.instagram.migration.scrollingviewproxy;

import X.AnonymousClass0wJ;
import X.AnonymousClass1x2;
import X.C04220Ms;
import X.C09860go;
import X.C14030oh;
import X.C161629e7;
import X.C18200wM;
import X.C22302CTd;
import X.C24;
import X.C27021rj;
import X.C29131wm;

public class IDxSListenerShape170S0100000_1_I2 extends C27021rj {
    public Object A00;
    public final int A01;

    public IDxSListenerShape170S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onScroll(C24 c24, int i, int i2, int i3, int i4, int i5) {
        int A002;
        int i6;
        if (2 - this.A01 != 0) {
            A002 = C14030oh.A03(-643933566);
            i6 = -1689880693;
        } else {
            C24 c242 = c24;
            A002 = AnonymousClass0wJ.A00(-1767746350, c24);
            C161629e7 r2 = ((AnonymousClass1x2) this.A00).A02;
            if (r2 == null) {
                C04220Ms.A0E("actionBarOnScrollListener");
                throw null;
            } else {
                r2.onScroll(c242, i, i2, i3, i4, i5);
                i6 = -1996339639;
            }
        }
        C14030oh.A0A(i6, A002);
    }

    public final void onScrollStateChanged(C24 c24, int i) {
        int i2;
        int i3;
        switch (this.A01) {
            case 0:
                i2 = C14030oh.A03(-41569303);
                if (i == 1) {
                    C09860go.A0I(C18200wM.A0H((C22302CTd) this.A00));
                }
                i3 = 1507457716;
                break;
            case 1:
                i2 = C14030oh.A03(-1709307377);
                if (i == 0) {
                    C29131wm.A0B(c24, (C29131wm) this.A00);
                }
                i3 = -1581023839;
                break;
            default:
                i2 = AnonymousClass0wJ.A00(-279251962, c24);
                if (i == 0) {
                    AnonymousClass1x2.A0B(c24, (AnonymousClass1x2) this.A00);
                }
                C161629e7 r0 = ((AnonymousClass1x2) this.A00).A02;
                if (r0 != null) {
                    r0.onScrollStateChanged(c24, i);
                    i3 = -1669133114;
                    break;
                } else {
                    C04220Ms.A0E("actionBarOnScrollListener");
                    throw null;
                }
        }
        C14030oh.A0A(i3, i2);
    }
}
