package com.instagram.profile.api;

import X.AnonymousClass000;
import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C61943Wl;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class UserInfoResponseImpl extends TreeJNI implements C81204nM {

    public final class User extends TreeJNI implements C81204nM {

        public final class BioLinks extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"click_id", "group_id", "link_id", "link_type", "lynx_url", AnonymousClass000.A00(16), DialogModule.KEY_TITLE, "url"};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(BioLinks.class, "bio_links");
        }

        public final Class[] getInlineClasses() {
            return new Class[]{DeferredUserInfoFieldsImpl.class};
        }

        public final String[] getScalarFields() {
            return new String[]{"account_type", "biography", "follower_count", "following_count", "full_name", "is_business", "is_call_to_action_enabled", "is_defer_fulfilled(fragment_name:\"DeferredUserInfoFields\")", "is_private", "is_verified", "media_count", "pk", "profile_pic_url", C61943Wl.A00()};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(User.class, "user");
    }
}
