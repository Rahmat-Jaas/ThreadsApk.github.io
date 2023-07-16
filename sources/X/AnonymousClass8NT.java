package X;

import com.instagram.api.schemas.IGPostClickEligibleExperienceTypes;

/* renamed from: X.8NT  reason: invalid class name */
public final class AnonymousClass8NT extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8NT A00 = new AnonymousClass8NT();

    public AnonymousClass8NT() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C04220Ms.A0B(obj, 0);
        Object obj2 = IGPostClickEligibleExperienceTypes.A01.get(obj);
        if (obj2 == null) {
            return IGPostClickEligibleExperienceTypes.UNRECOGNIZED;
        }
        return obj2;
    }
}
