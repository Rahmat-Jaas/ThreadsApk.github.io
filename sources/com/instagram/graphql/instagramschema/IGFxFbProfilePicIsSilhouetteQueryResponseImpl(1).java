package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGFxFbProfilePicIsSilhouetteQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class FxAccounts extends TreeJNI implements C81204nM {

        public final class InlineXFBFXFBAccountInfo extends TreeJNI implements C81204nM {

            public final class ProfilePictureInfo extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"is_silhouette"};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(ProfilePictureInfo.class, "profile_picture_info");
            }
        }

        public final InlineXFBFXFBAccountInfo A00() {
            if (!isFulfilled("XFBFXFBAccountInfo")) {
                return null;
            }
            return (InlineXFBFXFBAccountInfo) reinterpret(InlineXFBFXFBAccountInfo.class);
        }

        public final Class[] getInlineClasses() {
            return new Class[]{InlineXFBFXFBAccountInfo.class};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(FxAccounts.class, "fx_accounts");
    }
}
