package com.instagram.share.facebook.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

public final class CXPFbReelsCurrentPrivacyQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XcxpFbReelsCurrentPrivacy extends TreeJNI implements C81204nM {

        public final class Destination extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"id", FXPFAccessLibraryDebugFragment.NAME, "profile_pic_url"};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"audience", "is_audience_same_as_feed", FXPFAccessLibraryDebugFragment.NAME};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(Destination.class, "destination");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XcxpFbReelsCurrentPrivacy.class, "xcxp_fb_reels_current_privacy");
    }
}
