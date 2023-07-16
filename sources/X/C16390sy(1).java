package X;

import android.util.Log;

/* renamed from: X.0sy  reason: invalid class name and case insensitive filesystem */
public final class C16390sy implements C16240si {
    public final void Ccv(String str) {
        Log.e("Security-LocalReporter", str);
    }

    public final void Ccw(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder("category=");
        sb.append(str);
        sb.append(", message=");
        sb.append(str2);
        if (th != null) {
            sb.append(", cause=");
            sb.append(th.toString());
        }
        Log.e("Security-LocalReporter", sb.toString());
    }
}
