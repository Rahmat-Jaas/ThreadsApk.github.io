package X;

import com.instagram.api.schemas.ClipsAudioMuteReasonType;

/* renamed from: X.8Q4  reason: invalid class name */
public final class AnonymousClass8Q4 extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8Q4 A00 = new AnonymousClass8Q4();

    public AnonymousClass8Q4() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ClipsAudioMuteReasonType.A01.get(obj);
        if (obj2 == null) {
            return ClipsAudioMuteReasonType.UNRECOGNIZED;
        }
        return obj2;
    }
}
