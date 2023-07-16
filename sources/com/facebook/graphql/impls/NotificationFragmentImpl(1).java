package com.facebook.graphql.impls;

import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class NotificationFragmentImpl extends TreeJNI implements C81204nM {

    public final class Action extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{NotificationActionFragmentImpl.class};
        }
    }

    public final class Icon extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{NotificationIconFragmentImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"body_content", "button_content", "header_content", "notification_identifier", "notification_source", "priority"};
    }

    public final C108776iv[] getEdgeFields() {
        return C18180wK.A1a(C18190wL.A0G(Action.class, "action", false), Icon.class, "icon", false);
    }
}
