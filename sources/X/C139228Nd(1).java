package X;

import com.instagram.model.fundraiser.FundraiserCampaignTypeEnum;

/* renamed from: X.8Nd  reason: invalid class name and case insensitive filesystem */
public final class C139228Nd extends C02220Ah implements AnonymousClass0YY {
    public static final C139228Nd A00 = new C139228Nd();

    public C139228Nd() {
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
