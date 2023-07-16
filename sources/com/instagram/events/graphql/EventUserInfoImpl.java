package com.instagram.events.graphql;

import X.C61943Wl;
import X.C85424vA;
import com.facebook.pando.TreeJNI;

public final class EventUserInfoImpl extends TreeJNI implements C85424vA {
    public final String B4N() {
        return getStringValue("profile_pic_url");
    }

    public final String[] getScalarFields() {
        return new String[]{"id", "profile_pic_url", C61943Wl.A00()};
    }

    public final String BK7() {
        return getStringValue(C61943Wl.A00());
    }
}
