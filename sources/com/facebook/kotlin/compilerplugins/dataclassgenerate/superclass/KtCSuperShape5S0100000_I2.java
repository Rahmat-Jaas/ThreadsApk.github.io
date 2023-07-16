package com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.BKU;
import X.C04220Ms;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

public class KtCSuperShape5S0100000_I2 extends AnonymousClass0Sf {
    public Object A00;
    public final int A01 = 0;

    public KtCSuperShape5S0100000_I2(BKU bku) {
        this.A00 = bku;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof KtCSuperShape5S0100000_I2) || ((KtCSuperShape5S0100000_I2) obj).A01 != i) {
            return false;
        }
        return true;
    }

    public final User A01(UserSession userSession) {
        if (this.A01 != 0) {
            return AnonymousClass0wJ.A0Y(userSession);
        }
        return ((BKU) this.A00).A2Z(userSession);
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
        if (!A00(i, obj) || !C04220Ms.A0I(this.A00, ((KtCSuperShape5S0100000_I2) obj).A00)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public KtCSuperShape5S0100000_I2(PendingMedia pendingMedia) {
        this.A00 = pendingMedia;
    }
}
