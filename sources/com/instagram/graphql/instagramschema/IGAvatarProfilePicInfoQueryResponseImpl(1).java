package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGAvatarProfilePicInfoQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XigAvatarProfilePictureInfo extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"has_avatar_as_profile_pic"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"user_has_3d_avatar"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XigAvatarProfilePictureInfo.class, "xig_avatar_profile_picture_info");
    }
}
