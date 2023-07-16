package X;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;

/* renamed from: X.3Zr  reason: invalid class name and case insensitive filesystem */
public final class C62413Zr {
    public static void A01(Activity activity, int i) {
        A02(activity, (C83694rp) null, i, false);
    }

    public static void A00(Activity activity) {
        A03(activity, "android.settings.APPLICATION_DETAILS_SETTINGS");
    }

    public static void A02(Activity activity, C83694rp r4, int i, boolean z) {
        Resources resources = activity.getResources();
        String A0h = C18190wL.A0h(resources, resources.getString(i), 2131836532);
        C25828Dsm A0W = C18190wL.A0W(activity);
        A0W.A0p(A0h);
        C18190wL.A1R(A0W, activity, r4, 45, 2131836531);
        C18240wQ.A1C(A0W, r4, 5);
        if (z) {
            C18180wK.A1N(A0W, r4, 133, 2131823054);
        }
        AnonymousClass0wJ.A1K(A0W);
    }

    public static void A03(Activity activity, String str) {
        Uri A01 = C15430rJ.A01(AnonymousClass00U.A0L("package:", activity.getPackageName()));
        Intent A05 = C18250wR.A05(str);
        A05.setData(A01);
        C10650ih.A0B(activity, A05);
    }
}
