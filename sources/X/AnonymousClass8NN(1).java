package X;

import com.instagram.api.schemas.ActionButtonPartnerType;

/* renamed from: X.8NN  reason: invalid class name */
public final class AnonymousClass8NN extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8NN A00 = new AnonymousClass8NN();

    public AnonymousClass8NN() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ActionButtonPartnerType.A01.get(obj);
        if (obj2 == null) {
            return ActionButtonPartnerType.UNRECOGNIZED;
        }
        return obj2;
    }
}
