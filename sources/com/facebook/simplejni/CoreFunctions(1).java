package com.facebook.simplejni;

import X.C15020qa;
import X.C18230wP;
import java.io.PrintWriter;
import java.io.StringWriter;

public class CoreFunctions {
    public static native void runWithClassLoader(long j, long j2);

    static {
        C15020qa.A0A("simplejni");
    }

    public static String getErrorDescription(Throwable th) {
        StringWriter A0d = C18230wP.A0d();
        th.printStackTrace(new PrintWriter(A0d));
        return A0d.toString();
    }
}
