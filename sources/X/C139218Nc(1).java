package X;

import com.instagram.api.schemas.BeneficiaryType;

/* renamed from: X.8Nc  reason: invalid class name and case insensitive filesystem */
public final class C139218Nc extends C02220Ah implements AnonymousClass0YY {
    public static final C139218Nc A00 = new C139218Nc();

    public C139218Nc() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = BeneficiaryType.A01.get(obj);
        if (obj2 == null) {
            return BeneficiaryType.UNRECOGNIZED;
        }
        return obj2;
    }
}
