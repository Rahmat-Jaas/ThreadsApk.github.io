package X;

import com.instagram.api.schemas.BCPDealOutputTypeEnum;

/* renamed from: X.8PO  reason: invalid class name */
public final class AnonymousClass8PO extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8PO A00 = new AnonymousClass8PO();

    public AnonymousClass8PO() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = BCPDealOutputTypeEnum.A01.get(obj);
        if (obj2 == null) {
            return BCPDealOutputTypeEnum.UNRECOGNIZED;
        }
        return obj2;
    }
}
