package X;

import com.instagram.api.schemas.RepostRestrictedReason;

/* renamed from: X.8Pt  reason: invalid class name and case insensitive filesystem */
public final class C139908Pt extends C02220Ah implements AnonymousClass0YY {
    public static final C139908Pt A00 = new C139908Pt();

    public C139908Pt() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = RepostRestrictedReason.A01.get(obj);
        if (obj2 == null) {
            return RepostRestrictedReason.UNRECOGNIZED;
        }
        return obj2;
    }
}
