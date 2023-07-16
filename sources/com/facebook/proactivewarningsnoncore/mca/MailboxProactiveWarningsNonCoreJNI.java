package com.facebook.proactivewarningsnoncore.mca;

import X.C15020qa;
import java.util.List;

public class MailboxProactiveWarningsNonCoreJNI {
    public static final native Object dispatchCqlOJO(int i, long j, Object obj);

    public static final native Object dispatchDasmOJOO(int i, long j, Object obj, Object obj2);

    public static final native List getHeaderFields(int i);

    static {
        C15020qa.A0A("mailboxproactivewarningsnoncorejni");
    }
}
