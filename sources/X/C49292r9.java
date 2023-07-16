package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import com.instagram.service.session.UserSession;

/* renamed from: X.2r9  reason: invalid class name and case insensitive filesystem */
public final class C49292r9 {
    public static final void A00(C34640IcN icN, UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        C22901ba r3 = new C22901ba();
        Bundle A06 = C18180wK.A06();
        C18180wK.A0w(A06, userSession);
        r3.setArguments(A06);
        GVD gvd = C25745DrH.A00;
        C25745DrH A01 = gvd.A01(icN.getActivity());
        if (A01 == null || !((C35189Ipf) A01).A0M) {
            AnonymousClass01J r2 = new AnonymousClass01J(icN.getParentFragmentManager());
            ViewParent parent = icN.requireView().getParent();
            C04220Ms.A0C(parent, C28174Ezk.A00(3));
            r2.A0D(r3, ((View) parent).getId());
            r2.A0K(AnonymousClass0N8.A00(C22901ba.class));
            r2.A00();
            return;
        }
        C37383Jqm A02 = C37383Jqm.A02(gvd.A01(icN.getActivity()));
        if (A02 != null) {
            C37032Jj9 A0Y = C18200wM.A0Y(userSession, true);
            A0Y.A00 = 0.7f;
            A02.A09(r3, A0Y);
        }
    }
}
