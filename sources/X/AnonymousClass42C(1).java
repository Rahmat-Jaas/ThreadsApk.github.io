package X;

import android.os.Bundle;
import com.instagram.service.session.UserSession;

/* renamed from: X.42C  reason: invalid class name */
public final class AnonymousClass42C implements C85984w5 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean BWf() {
        return true;
    }

    public AnonymousClass42C(String str, String str2, String str3, String str4) {
        AnonymousClass0wJ.A1O(str, str2);
        C04220Ms.A0B(str3, 3);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = str4;
    }

    public final C83374rH AF4(C11630kW r8) {
        C83374rH r1;
        Bundle A06 = C18180wK.A06();
        C18190wL.A13(A06, this.A03);
        UserSession A0V = C18180wK.A0V(A06);
        if (C63803iN.A0E(AnonymousClass0TJ.A05, A0V, 36315159668459944L)) {
            r1 = new AnonymousClass42A();
        } else {
            r1 = new AnonymousClass42B(r8, A0V, this.A01, this.A02, this.A00);
        }
        return r1;
    }
}
