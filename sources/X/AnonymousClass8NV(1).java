package X;

import com.instagram.api.schemas.ClipsAudioMuteReasonType;

/* renamed from: X.8NV  reason: invalid class name */
public final class AnonymousClass8NV extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8NV A00 = new AnonymousClass8NV();

    public AnonymousClass8NV() {
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
