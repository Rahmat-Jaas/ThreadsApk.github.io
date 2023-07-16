package X;

import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2HB  reason: invalid class name */
public final class AnonymousClass2HB {
    public static final void A00(AnonymousClass601 r5, C63893iY r6) {
        boolean A1Z = AnonymousClass0wJ.A1Z(r6, r5);
        Object A0B = C63893iY.A0B(r6, 0);
        A0B.getClass();
        C04220Ms.A0C(A0B, "null cannot be cast to non-null type kotlin.String");
        r6.A00.get(A1Z ? 1 : 0);
        C04220Ms.A0C(C63893iY.A09(r6), "null cannot be cast to non-null type kotlin.String");
        C10300i6 A0F = C63913ic.A0F(r5);
        C18200wM.A1R(A0F);
        C63913ic.A0B(r5);
        User A0P = C18210wN.A0P((UserSession) A0F, (String) A0B);
        if (A0P != null) {
            new PendingRecipient(A0P);
        }
        C63913ic.A06(r5);
        AnonymousClass7Ko.A0E(false, "Must call setInstanceSupplier first");
        throw null;
    }
}
