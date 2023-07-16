package com.facebook.react.bridge;

import X.AnonymousClass00U;
import X.AnonymousClass0JV;
import X.C142158dy;
import X.C18210wN;
import X.C33107Hgp;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ReactSoftExceptionLogger {
    public static final List sListeners = new CopyOnWriteArrayList();

    public static void addListener(C142158dy r2) {
        List list = sListeners;
        if (!list.contains(r2)) {
            list.add(r2);
        }
    }

    public static void clearListeners() {
        sListeners.clear();
    }

    public static void logNoThrowSoftExceptionWithMessage(String str, String str2) {
        logSoftException(str, new C33107Hgp(str2));
    }

    public static void logSoftException(String str, Throwable th) {
        List list = sListeners;
        if (list.size() > 0) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw C18210wN.A0W("logSoftException");
            }
            return;
        }
        AnonymousClass0JV.A03(str, "Unhandled SoftException", th);
    }

    public static void logSoftExceptionVerbose(String str, Throwable th) {
        logSoftException(AnonymousClass00U.A0h(str, "|", C18210wN.A0e(th), ":", th.getMessage()), th);
    }

    public static void removeListener(C142158dy r1) {
        sListeners.remove(r1);
    }
}
