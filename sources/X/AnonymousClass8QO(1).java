package X;

import com.instagram.api.schemas.CommentAudienceControlType;

/* renamed from: X.8QO  reason: invalid class name */
public final class AnonymousClass8QO extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8QO A00 = new AnonymousClass8QO();

    public AnonymousClass8QO() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = CommentAudienceControlType.A01.get(obj);
        if (obj2 == null) {
            return CommentAudienceControlType.UNRECOGNIZED;
        }
        return obj2;
    }
}
