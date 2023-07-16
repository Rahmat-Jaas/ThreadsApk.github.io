package com.facebook.cutoverinternal.mca;

import X.C15020qa;
import java.util.List;

public class MailboxCutoverInternalJNI {
    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native List getHeaderFields(int i);

    static {
        C15020qa.A0A("mailboxcutoverinternaljni");
    }
}
