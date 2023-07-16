package com.facebook.globaldeletesettings.mca;

import X.C15020qa;
import java.util.List;

public class MailboxGlobalDeleteSettingsJNI {
    public static final native Object dispatchCqlOO(int i, Object obj);

    public static final native Object dispatchDasmOOO(int i, Object obj, Object obj2);

    public static final native List getHeaderFields(int i);

    static {
        C15020qa.A0A("mailboxglobaldeletesettingsjni");
    }
}
