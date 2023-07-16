package X;

import com.instagram.api.schemas.FundraiserVisibilityOnProfileStatus;

/* renamed from: X.8Ne  reason: invalid class name and case insensitive filesystem */
public final class C139238Ne extends C02220Ah implements AnonymousClass0YY {
    public static final C139238Ne A00 = new C139238Ne();

    public C139238Ne() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = FundraiserVisibilityOnProfileStatus.A01.get(obj);
        if (obj2 == null) {
            return FundraiserVisibilityOnProfileStatus.UNRECOGNIZED;
        }
        return obj2;
    }
}
