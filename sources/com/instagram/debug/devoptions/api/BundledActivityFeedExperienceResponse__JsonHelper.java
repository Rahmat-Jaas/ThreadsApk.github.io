package com.instagram.debug.devoptions.api;

import X.AnonymousClass0wJ;
import X.AnonymousClass3Za;
import X.C18180wK;
import X.C25563Dnz;
import X.C27627Eqe;
import X.C40318LcR;
import X.MMo;

public final class BundledActivityFeedExperienceResponse__JsonHelper {
    public static BundledActivityFeedExperienceResponse parseFromJson(MMo mMo) {
        return (BundledActivityFeedExperienceResponse) C25563Dnz.A02(mMo, new C27627Eqe() {
            public BundledActivityFeedExperienceResponse invoke(MMo mMo) {
                return BundledActivityFeedExperienceResponse__JsonHelper.unsafeParseFromJson(mMo);
            }
        });
    }

    public static boolean processSingleField(BundledActivityFeedExperienceResponse bundledActivityFeedExperienceResponse, String str, MMo mMo) {
        if (!"setting".equals(str)) {
            return AnonymousClass3Za.A01(mMo, bundledActivityFeedExperienceResponse, str);
        }
        bundledActivityFeedExperienceResponse.mExperience = AnonymousClass0wJ.A0p(mMo);
        return true;
    }

    public static BundledActivityFeedExperienceResponse unsafeParseFromJson(MMo mMo) {
        BundledActivityFeedExperienceResponse bundledActivityFeedExperienceResponse = new BundledActivityFeedExperienceResponse();
        if (mMo.A0f() != C40318LcR.START_OBJECT) {
            mMo.A0x();
            return null;
        }
        while (mMo.A0g() != C40318LcR.END_OBJECT) {
            processSingleField(bundledActivityFeedExperienceResponse, AnonymousClass0wJ.A0q(mMo), mMo);
            mMo.A0x();
        }
        return bundledActivityFeedExperienceResponse;
    }

    public static BundledActivityFeedExperienceResponse parseFromJson(String str) {
        return parseFromJson(C18180wK.A0L(str));
    }
}
