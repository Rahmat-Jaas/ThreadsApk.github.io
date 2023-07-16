package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

public final class AccountAdminsFragmentImpl extends TreeJNI implements C81204nM {

    public final class PayAdminDoNotUse extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"admin_id", "id", "image_uri", FXPFAccessLibraryDebugFragment.NAME};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(PayAdminDoNotUse.class, "pay_admin_do_not_use");
    }
}
