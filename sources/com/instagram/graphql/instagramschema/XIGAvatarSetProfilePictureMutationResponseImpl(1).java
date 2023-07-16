package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class XIGAvatarSetProfilePictureMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class XigSetAvatarAsProfilePicture extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"success", "uri"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XigSetAvatarAsProfilePicture.class, "xig_set_avatar_as_profile_picture(data:$data)");
    }
}
