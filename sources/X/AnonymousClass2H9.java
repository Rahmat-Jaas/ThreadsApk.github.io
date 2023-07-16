package X;

import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.2H9  reason: invalid class name */
public final class AnonymousClass2H9 {
    public static void A00(AnonymousClass601 r4, C63893iY r5) {
        List list = r5.A00;
        Object obj = list.get(0);
        String A0q = C18190wL.A0q(list, 1);
        AnonymousClass7Ko.A07(A0q, "Merchant ID should not be null");
        AnonymousClass7Ko.A07(obj, "Entrypoint must be provided");
        C04220Ms.A0B(r4, 0);
        C63913ic.A05(r4).finish();
        User A0P = C18210wN.A0P(C63913ic.A0J(r4), A0q);
        if (A0P != null) {
            new PendingRecipient(A0P);
        }
        AnonymousClass7Ko.A0E(false, "Must call setInstanceSupplier first");
        throw null;
    }
}
