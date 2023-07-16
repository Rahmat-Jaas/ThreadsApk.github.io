package X;

import android.view.ContentInfo;
import android.view.View;

/* renamed from: X.02w  reason: invalid class name and case insensitive filesystem */
public final class C006502w {
    public static C004101w A00(View view, C004101w r3) {
        ContentInfo A01 = r3.A01();
        ContentInfo performReceiveContent = view.performReceiveContent(A01);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent != A01) {
            return C004101w.A00(performReceiveContent);
        }
        return r3;
    }

    public static String[] A01(View view) {
        return view.getReceiveContentMimeTypes();
    }
}
