package com.facebook.featurelimits.mca;

import X.C15020qa;
import java.util.List;

public class MailboxFeatureLimitsJNI {
    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchOOO(int i, Object obj, Object obj2);

    public static final native void dispatchVOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields(int i);

    static {
        C15020qa.A0A("mailboxfeaturelimitsjni");
    }
}
