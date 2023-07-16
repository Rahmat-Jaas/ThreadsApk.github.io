package X;

import com.facebookpay.offsite.models.message.PaymentContainerType;
import java.util.AbstractCollection;
import java.util.Iterator;

/* renamed from: X.6xg  reason: invalid class name and case insensitive filesystem */
public final class C116866xg {
    public static final AnonymousClass692 A00(String str) {
        C04220Ms.A0B(str, 0);
        AnonymousClass692 r0 = (AnonymousClass692) AnonymousClass692.A02.get(str);
        if (r0 != null) {
            return r0;
        }
        throw C18190wL.A0a(AnonymousClass00U.A0L("ContainerType Type is not found for identifier => ", str));
    }

    public static void A01(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(A00(((PaymentContainerType) it.next()).getType()));
    }
}
