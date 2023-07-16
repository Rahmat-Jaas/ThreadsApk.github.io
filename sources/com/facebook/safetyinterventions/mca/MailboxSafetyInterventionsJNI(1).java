package com.facebook.safetyinterventions.mca;

import X.C15020qa;
import java.util.List;

public class MailboxSafetyInterventionsJNI {
    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native List getHeaderFields(int i);

    static {
        C15020qa.A0A("mailboxsafetyinterventionsjni");
    }
}
