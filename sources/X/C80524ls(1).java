package X;

import com.instagram.api.schemas.PrimaryProfileLinkType;

/* renamed from: X.4ls  reason: invalid class name and case insensitive filesystem */
public final class C80524ls extends C02220Ah implements AnonymousClass0YY {
    public static final C80524ls A00 = new C80524ls();

    public C80524ls() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = PrimaryProfileLinkType.A01.get(obj);
        if (obj2 == null) {
            return PrimaryProfileLinkType.UNRECOGNIZED;
        }
        return obj2;
    }
}
