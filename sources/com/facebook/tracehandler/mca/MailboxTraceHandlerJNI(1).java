package com.facebook.tracehandler.mca;

import X.C15020qa;
import java.util.List;

public class MailboxTraceHandlerJNI {
    public static final native void dispatchVIIOOOOOOOO(int i, int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8);

    public static final native List getHeaderFields(int i);

    static {
        C15020qa.A0A("mailboxtracehandlerjni");
    }
}
