package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.C04220Ms;
import com.instagram.model.shopping.Product;
import com.instagram.model.upcomingevents.UpcomingEvent;

public class KtCSuperShape10S0100000_I2 extends AnonymousClass0Sf {
    public Object A00;
    public final int A01 = 1;

    public KtCSuperShape10S0100000_I2(Product product) {
        C04220Ms.A0B(product, 1);
        this.A00 = product;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A01 != 0) {
            i = 1;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof KtCSuperShape10S0100000_I2)) {
            return false;
        }
        KtCSuperShape10S0100000_I2 ktCSuperShape10S0100000_I2 = (KtCSuperShape10S0100000_I2) obj;
        if (ktCSuperShape10S0100000_I2.A01 != i || !C04220Ms.A0I(this.A00, ktCSuperShape10S0100000_I2.A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public KtCSuperShape10S0100000_I2(UpcomingEvent upcomingEvent) {
        this.A00 = upcomingEvent;
    }
}
