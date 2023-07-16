package com.facebook.redex;

import X.AnonymousClass101;
import X.AnonymousClass3XX;
import X.C04220Ms;
import X.C146958n9;
import X.C28171tm;
import X.C567338i;
import X.C83884s9;
import com.instagram.user.model.User;

public class IDxFListenerShape748S0100000_1_I2 implements C83884s9 {
    public Object A00;
    public final int A01;

    public IDxFListenerShape748S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void Bxr(AnonymousClass3XX r3) {
        if (this.A01 != 0) {
            ((AnonymousClass101) this.A00).A04.CrC(C28171tm.A00);
        } else {
            ((C146958n9) this.A00).resumeWith((Object) null);
        }
    }

    public final void CNG(User user) {
        if (this.A01 != 0) {
            C04220Ms.A0B(user, 0);
            ((AnonymousClass101) this.A00).A03.CrC(new C567338i(user, false));
            return;
        }
        C04220Ms.A0B(user, 0);
        ((C146958n9) this.A00).resumeWith(user);
    }
}
