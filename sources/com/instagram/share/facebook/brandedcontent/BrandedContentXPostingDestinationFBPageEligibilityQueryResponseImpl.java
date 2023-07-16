package com.instagram.share.facebook.brandedcontent;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class BrandedContentXPostingDestinationFBPageEligibilityQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class FetchIGUser extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"is_xposting_destination_fb_page_eligible_for_branded_content"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FetchIGUser.class, "fetch__IGUser(igid:$igid)");
    }
}
