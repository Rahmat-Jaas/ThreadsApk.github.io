package X;

import android.util.Log;

/* renamed from: X.0CY  reason: invalid class name */
public final class AnonymousClass0CY implements AnonymousClass0JW {
    public static final AnonymousClass0CY A01 = new AnonymousClass0CY();
    public int A00 = 5;

    public final void e(String str, String str2, Throwable th) {
        A00(str, str2, 6, th);
    }

    public final void w(String str, String str2, Throwable th) {
        A00(str, str2, 5, th);
    }

    public final void wtf(String str, String str2, Throwable th) {
        A00(str, str2, 6, th);
    }

    private void A00(String str, String str2, int i, Throwable th) {
        String stackTraceString;
        String A0V = AnonymousClass00U.A0V("unknown", ":", str);
        if (th == null) {
            stackTraceString = "";
        } else {
            stackTraceString = Log.getStackTraceString(th);
        }
        Log.println(i, A0V, AnonymousClass00U.A0N(str2, stackTraceString, 10));
    }

    public final boolean isLoggable(int i) {
        if (this.A00 <= i) {
            return true;
        }
        return false;
    }

    public final void log(int i, String str, String str2) {
        Log.println(i, AnonymousClass00U.A0V("unknown", ":", str), str2);
    }

    public final int getMinimumLoggingLevel() {
        return this.A00;
    }

    public final void setMinimumLoggingLevel(int i) {
        this.A00 = i;
    }

    public final void e(String str, String str2) {
        Log.println(6, AnonymousClass00U.A0V("unknown", ":", str), str2);
    }

    public final void w(String str, String str2) {
        Log.println(5, AnonymousClass00U.A0V("unknown", ":", str), str2);
    }

    public final void wtf(String str, String str2) {
        Log.println(6, AnonymousClass00U.A0V("unknown", ":", str), str2);
    }
}
