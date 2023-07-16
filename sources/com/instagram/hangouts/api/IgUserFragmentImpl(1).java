package com.instagram.hangouts.api;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18230wP;
import X.C61943Wl;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

public final class IgUserFragmentImpl extends TreeJNI implements C81204nM {

    public final class ProfilePicture extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return C18230wP.A1Z();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(ProfilePicture.class, "profile_picture");
    }

    public final String[] getScalarFields() {
        return new String[]{"id", "instagram_user_id", FXPFAccessLibraryDebugFragment.NAME, C61943Wl.A00()};
    }
}
