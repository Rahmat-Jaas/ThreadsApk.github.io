package X;

import com.instagram.api.schemas.StoryPollColorType;

/* renamed from: X.8QC  reason: invalid class name */
public final class AnonymousClass8QC extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8QC A00 = new AnonymousClass8QC();

    public AnonymousClass8QC() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = StoryPollColorType.A01.get(obj);
        if (obj2 == null) {
            return StoryPollColorType.UNRECOGNIZED;
        }
        return obj2;
    }
}
