package X;

import android.os.Build;
import android.widget.TextView;

/* renamed from: X.6Fb  reason: invalid class name and case insensitive filesystem */
public final class C98326Fb {
    public static void A00(TextView textView) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw C18210wN.A0W("getPrecomputedText");
        }
        new C115216uh(textView.getTextMetricsParams());
        throw C18210wN.A0W("getParams");
    }
}
