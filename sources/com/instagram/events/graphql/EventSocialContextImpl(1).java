package com.instagram.events.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class EventSocialContextImpl extends TreeJNI implements C81204nM {

    public final class SocialContextUsers extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{EventUserInfoImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{DialogModule.KEY_TITLE};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(SocialContextUsers.class, "social_context_users");
    }
}
