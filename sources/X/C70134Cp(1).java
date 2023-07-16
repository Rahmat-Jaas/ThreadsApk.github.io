package X;

import android.os.Bundle;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.instagram.modal.ModalActivity;

/* renamed from: X.4Cp  reason: invalid class name and case insensitive filesystem */
public final class C70134Cp implements C39574Kw1 {
    public final /* synthetic */ AnonymousClass1dM A00;

    public C70134Cp(AnonymousClass1dM r1) {
        this.A00 = r1;
    }

    public final void onClick() {
        long j;
        String A33;
        Long A02;
        AnonymousClass1dM r5 = this.A00;
        C13330nS r1 = r5.A02;
        if (r1 == null) {
            C18240wQ.A0p();
            throw null;
        }
        USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(r1, "comments_from_facebook_sharing_settings"), 430);
        BKU bku = r5.A05;
        if (bku == null || (A33 = bku.A33()) == null || (A02 = AnonymousClass4n2.A02(A33)) == null) {
            j = -1;
        } else {
            j = A02.longValue();
        }
        C18210wN.A18(A0I, j);
        A0I.Bb4();
        Bundle A06 = C18180wK.A06();
        C63863iT.A02(r5.getActivity(), A06, AnonymousClass0wJ.A0U(r5.A0I), ModalActivity.class, "linked_accounts").A0I(r5.getActivity());
    }
}
