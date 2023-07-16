package X;

import com.instagram.api.schemas.IGCreatorIncentiveProgramFetchEntryPoint;

/* renamed from: X.2Cz  reason: invalid class name and case insensitive filesystem */
public final class C32732Cz {
    public static final C32165H8c A00(H1T h1t, IGCreatorIncentiveProgramFetchEntryPoint iGCreatorIncentiveProgramFetchEntryPoint, Integer num, String str) {
        C18240wQ.A19(h1t);
        h1t.A0J(C18240wQ.A0h("creators/", "incentive_platform/", "get_bonuses_deal_metadata_lists/"));
        h1t.A0B(C21521Rd.class, AnonymousClass3Jb.class);
        if (str != null) {
            h1t.A0O("m_pk", str);
        }
        if (iGCreatorIncentiveProgramFetchEntryPoint != null) {
            h1t.A0O("entry_point", iGCreatorIncentiveProgramFetchEntryPoint.A00);
        }
        if (num != null) {
            h1t.A0K("scheduled_time", num.intValue());
        }
        C32165H8c A02 = h1t.A02();
        C04220Ms.A0C(A02, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.BonusesDealsMetadataResponse>>");
        return A02;
    }
}
