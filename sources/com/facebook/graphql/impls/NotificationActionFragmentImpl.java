package com.facebook.graphql.impls;

import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class NotificationActionFragmentImpl extends TreeJNI implements C81204nM {

    public final class InlinePAYObjectNotificationActionURL extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"redirect_url"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"type"};
    }

    public final Class[] getInlineClasses() {
        return new Class[]{InlinePAYObjectNotificationActionURL.class};
    }
}
