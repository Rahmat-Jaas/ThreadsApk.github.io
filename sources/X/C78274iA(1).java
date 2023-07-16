package X;

import com.instagram.api.schemas.ProfileThemeType;

/* renamed from: X.4iA  reason: invalid class name and case insensitive filesystem */
public final class C78274iA extends C02220Ah implements AnonymousClass0YY {
    public static final C78274iA A00 = new C78274iA();

    public C78274iA() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ProfileThemeType.A01.get(obj);
        if (obj2 == null) {
            return ProfileThemeType.UNRECOGNIZED;
        }
        return obj2;
    }
}
