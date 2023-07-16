package X;

import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;

/* renamed from: X.8NS  reason: invalid class name */
public final class AnonymousClass8NS extends C02220Ah implements AnonymousClass0YY {
    public static final AnonymousClass8NS A00 = new AnonymousClass8NS();

    public AnonymousClass8NS() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = FundraiserCampaignTypeEnum.A01.get(obj);
        if (obj2 == null) {
            return FundraiserCampaignTypeEnum.UNRECOGNIZED;
        }
        return obj2;
    }
}
