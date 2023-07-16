package X;

import android.content.Context;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.42B  reason: invalid class name */
public final class AnonymousClass42B implements C83374rH {
    public C61683Uw A00;
    public String A01;
    public final C11630kW A02;
    public final UserSession A03;
    public final String A04;
    public final String A05;

    public final void AE0(Context context, AnonymousClass4u2 r16) {
        AnonymousClass4u2 r1 = r16;
        C04220Ms.A0B(r1, 0);
        r1.CtT(true);
        String str = this.A04;
        String str2 = this.A05;
        C11630kW r5 = this.A02;
        C04220Ms.A06(r5.getModuleName());
        C61683Uw r2 = new C61683Uw(context, (C34640IcN) null, r5, this.A03, new AnonymousClass4LZ(), (C19818BBs) null, str, str2, (String) null, this.A01, true);
        this.A00 = r2;
        r2.A00 = r1;
        r1.CtT(true);
        r2.A01 = AnonymousClass6VR.A00(r2.A04).A03(r2.A06);
        C61683Uw.A00(r2);
        C19818BBs bBs = r2.A05;
        if (bBs != null) {
            bBs.A02((String) null, (String) null);
        }
    }

    public final void onDestroy() {
        C61683Uw r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
    }

    public AnonymousClass42B(C11630kW r2, UserSession userSession, String str, String str2, String str3) {
        String str4;
        this.A03 = userSession;
        this.A02 = r2;
        this.A04 = str;
        this.A05 = str2;
        if (str3 == null) {
            User A0P = C18210wN.A0P(userSession, str);
            if (A0P != null) {
                str4 = A0P.A1K();
            } else {
                str4 = null;
            }
            this.A01 = str4;
            return;
        }
        this.A01 = str3;
    }
}
