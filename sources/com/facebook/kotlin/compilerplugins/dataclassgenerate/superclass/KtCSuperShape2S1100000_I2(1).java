package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass3I0;
import X.C04220Ms;
import X.C142278eb;
import X.C18180wK;
import X.C18210wN;
import com.instagram.user.model.User;

public class KtCSuperShape2S1100000_I2 extends AnonymousClass0Sf implements C142278eb {
    public Object A00;
    public String A01;
    public final int A02;

    public KtCSuperShape2S1100000_I2(User user, String str) {
        this.A02 = 1;
        this.A00 = user;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        Object obj2;
        Object obj3;
        if (this.A02 != 0) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof KtCSuperShape2S1100000_I2)) {
                return false;
            }
            KtCSuperShape2S1100000_I2 ktCSuperShape2S1100000_I2 = (KtCSuperShape2S1100000_I2) obj;
            if (ktCSuperShape2S1100000_I2.A02 != 1 || !C04220Ms.A0I(this.A00, ktCSuperShape2S1100000_I2.A00)) {
                return false;
            }
            obj2 = this.A01;
            obj3 = ktCSuperShape2S1100000_I2.A01;
        } else if (this == obj) {
            return true;
        } else {
            if (!(obj instanceof KtCSuperShape2S1100000_I2)) {
                return false;
            }
            KtCSuperShape2S1100000_I2 ktCSuperShape2S1100000_I22 = (KtCSuperShape2S1100000_I2) obj;
            if (ktCSuperShape2S1100000_I22.A02 != 0 || !C04220Ms.A0I(this.A01, ktCSuperShape2S1100000_I22.A01)) {
                return false;
            }
            obj2 = this.A00;
            obj3 = ktCSuperShape2S1100000_I22.A00;
        }
        if (!C04220Ms.A0I(obj2, obj3)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A03;
        int hashCode;
        if (this.A02 != 0) {
            A03 = C18210wN.A04(this.A00);
            hashCode = this.A01.hashCode();
        } else {
            A03 = C18180wK.A03(this.A01);
            hashCode = this.A00.hashCode();
        }
        return A03 + hashCode;
    }

    public KtCSuperShape2S1100000_I2(AnonymousClass3I0 r3) {
        this.A02 = 0;
        this.A01 = "appreciation_gift_feed_query_gifters_failure";
        this.A00 = r3;
    }
}
