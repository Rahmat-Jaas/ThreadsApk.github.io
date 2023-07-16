package X;

import com.instagram.api.schemas.SocialContextType;

/* renamed from: X.8Nb  reason: invalid class name and case insensitive filesystem */
public final class C139208Nb extends C02220Ah implements AnonymousClass0YY {
    public static final C139208Nb A00 = new C139208Nb();

    public C139208Nb() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = SocialContextType.A01.get(obj);
        if (obj2 == null) {
            return SocialContextType.UNRECOGNIZED;
        }
        return obj2;
    }
}
