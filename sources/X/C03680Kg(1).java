package X;

import android.util.Log;

/* renamed from: X.0Kg  reason: invalid class name and case insensitive filesystem */
public abstract class C03680Kg implements AnonymousClass0JW {
    public int mMinimumLoggingLevel;

    public abstract void wtf(String str, String str2);

    public abstract void wtf(String str, String str2, Throwable th);

    public boolean isLoggable(int i) {
        if (this.mMinimumLoggingLevel <= i) {
            return true;
        }
        return false;
    }

    public void d(String str, String str2, Throwable th) {
    }

    public void e(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    public int getMinimumLoggingLevel() {
        return this.mMinimumLoggingLevel;
    }

    public void i(String str, String str2, Throwable th) {
    }

    public void log(int i, String str, String str2) {
        Log.println(i, str, str2);
    }

    public void v(String str, String str2, Throwable th) {
    }

    public void w(String str, String str2, Throwable th) {
        Log.w(str, str2, th);
    }

    public void setMinimumLoggingLevel(int i) {
        this.mMinimumLoggingLevel = i;
    }

    public void e(String str, String str2) {
        Log.e(str, str2);
    }

    public void w(String str, String str2) {
        Log.w(str, str2);
    }

    public void d(String str, String str2) {
    }

    public void i(String str, String str2) {
    }

    public void v(String str, String str2) {
    }
}
