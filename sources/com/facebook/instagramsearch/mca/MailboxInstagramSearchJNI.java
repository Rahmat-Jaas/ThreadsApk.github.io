package com.facebook.instagramsearch.mca;

import X.C15020qa;
import java.util.List;

public class MailboxInstagramSearchJNI {
    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchCqlOOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native List getHeaderFields(int i);

    static {
        C15020qa.A0A("mailboxinstagramsearchjni");
    }
}
