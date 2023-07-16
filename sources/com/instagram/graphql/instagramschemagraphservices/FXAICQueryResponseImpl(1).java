package com.instagram.graphql.instagramschemagraphservices;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C61963Wn;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

public final class FXAICQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class FxAic extends TreeJNI implements C81204nM {

        public final class Accounts extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"account_type", "badge_count", "id", "identity_type", FXPFAccessLibraryDebugFragment.NAME, "obfuscated_id", "profile_picture_url", C61963Wn.A01(22, 8, 61)};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(Accounts.class, "accounts");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FxAic.class, "fx_aic(account_types:[\"FACEBOOK\",\"INSTAGRAM\"],family_device_id:$family_device_id)");
    }
}
