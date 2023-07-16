package com.instagram.user.userlist.fragment;

import X.AnonymousClass000;
import X.AnonymousClass0wJ;
import X.AnonymousClass72G;
import X.C108776iv;
import X.C18170wI;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class FollowGroupImpl extends TreeJNI implements C81204nM {

    public final class Facepile extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{AnonymousClass000.A00(1201), "full_name", C18170wI.A00(174), "is_private", "is_verified", "pk", "pk_id", "profile_pic_id", "profile_pic_url", AnonymousClass72G.A00(19, 8, 31)};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"actions", "category", "context", "group", "show_hashtag_icon", "subtitle", DialogModule.KEY_TITLE};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(Facepile.class, "facepile");
    }
}
