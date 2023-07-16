package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.service.session.UserSession;

/* renamed from: X.2GR  reason: invalid class name */
public final class AnonymousClass2GR {
    public static final Object A00(AnonymousClass601 r13, C63893iY r14) {
        String str;
        C313625r A00;
        C63893iY r0 = r14;
        boolean A1Z = AnonymousClass0wJ.A1Z(r14, r13);
        C127397h3 A02 = C63893iY.A02(r0, A1Z ? 1 : 0);
        C10300i6 A0F = C63913ic.A0F(r13);
        C18200wM.A1R(A0F);
        UserSession userSession = (UserSession) A0F;
        FragmentActivity A05 = C63913ic.A05(r13);
        if (A02 != null) {
            str = C18230wP.A0o(A02);
        } else {
            str = null;
        }
        AnonymousClass0MJ r6 = new AnonymousClass0MJ();
        if (str == null) {
            A00 = C313625r.NONE;
        } else {
            A00 = C54052yp.A00(str);
        }
        r6.A00 = A00;
        if (A00 == null) {
            A00 = C313625r.NONE;
            r6.A00 = A00;
        }
        double A002 = C18200wM.A00();
        double A003 = AnonymousClass269.A00();
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A02(userSession), "ig_nux_started"), 1389);
        C18180wK.A19(A0I);
        AnonymousClass0wJ.A1B(A0I, A002, A003);
        A0I.A0Q("from_server", C18190wL.A0Z(A0I, "flow", A00.A00, A1Z));
        C63683i7.A05(A0I);
        AnonymousClass269.A06(A0I, A003);
        C63683i7.A09(A0I, userSession);
        A0I.Bb4();
        C63463hW.A02().A09(A05, new AnonymousClass4F5(A05, userSession, r6), userSession, (C313625r) r6.A00, A1Z);
        return null;
    }
}
