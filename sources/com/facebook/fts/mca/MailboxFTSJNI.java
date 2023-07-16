package com.facebook.fts.mca;

import X.C15020qa;
import java.util.List;

public class MailboxFTSJNI {
    public static final native Object dispatchCqlOIJO(int i, int i2, long j, Object obj);

    public static final native Object dispatchCqlOIJOOO(int i, int i2, long j, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchCqlOIJOOOO(int i, int i2, long j, Object obj, Object obj2, Object obj3, Object obj4);

    public static final native Object dispatchCqlOIO(int i, int i2, Object obj);

    public static final native Object dispatchCqlOIOO(int i, int i2, Object obj, Object obj2);

    public static final native Object dispatchCqlOIOOO(int i, int i2, Object obj, Object obj2, Object obj3);

    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchCqlOOO(int i, Object obj, Object obj2);

    public static final native Object dispatchCqlOOOO(int i, Object obj, Object obj2, Object obj3);

    public static final native List getHeaderFields(int i);

    static {
        C15020qa.A0A("mailboxftsjni");
    }
}
