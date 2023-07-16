package com.facebook.redex;

import X.AnonymousClass3XQ;
import X.AnonymousClass4F6;
import X.C04220Ms;
import X.C18200wM;
import X.C313625r;
import X.C63463hW;
import X.C67323zM;
import X.C682543b;
import X.C82764qE;
import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.instagram.service.session.UserSession;

public class IDxDestinationShape20S0110000_1_I2 implements C82764qE {
    public Object A00;
    public boolean A01;
    public final int A02;

    public IDxDestinationShape20S0110000_1_I2(UserSession userSession, int i, boolean z) {
        this.A02 = i;
        if (i != 0) {
            this.A00 = userSession;
            this.A01 = z;
        } else {
            this.A01 = z;
            this.A00 = userSession;
        }
    }

    public final void BMv(FragmentActivity fragmentActivity) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        if (this.A02 != 0) {
            C04220Ms.A0B(fragmentActivity, 0);
            C63463hW A022 = C63463hW.A02();
            UserSession userSession = (UserSession) this.A00;
            A022.A09(fragmentActivity2, new AnonymousClass4F6(fragmentActivity, userSession, this.A01), userSession, C313625r.A03, false);
            return;
        }
        C04220Ms.A0B(fragmentActivity, 0);
        boolean z = this.A01;
        UserSession userSession2 = (UserSession) this.A00;
        C682543b r4 = new C682543b(AnonymousClass3XQ.A0A);
        if (z) {
            C67323zM.A07(fragmentActivity2, (Uri) null, r4, userSession2, C18200wM.A00(), true, false, false, true);
        } else {
            C67323zM.A04(fragmentActivity, (Uri) null, r4, userSession2);
        }
    }
}
