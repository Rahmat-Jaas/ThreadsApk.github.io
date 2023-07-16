package X;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.dextricks.Constants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.3Qi  reason: invalid class name and case insensitive filesystem */
public final class C60743Qi {
    public static final HashSet A00 = AnonymousClass4WM.A04("com.facebook.wakizashi", "com.facebook.katana", "com.facebook.lite", "com.facebook.orca", "com.oculus.twilight", "com.instagram.android", "com.instagram.barcelona");

    public static final Object A00(AnonymousClass601 r10, C63893iY r11) {
        String str;
        ApplicationInfo applicationInfo;
        boolean A1Z = AnonymousClass0wJ.A1Z(r11, r10);
        List list = r11.A00;
        String A0q = C18190wL.A0q(list, 0);
        String A0q2 = C18190wL.A0q(list, A1Z ? 1 : 0);
        AnonymousClass3HX r4 = r10.A00;
        if (r4 == null) {
            return null;
        }
        FragmentActivity A05 = C63913ic.A05(r10);
        Intent intent = new Intent("android.intent.action.VIEW", C15430rJ.A01(A0q));
        List<ResolveInfo> queryIntentActivities = A05.getPackageManager().queryIntentActivities(intent, Constants.LOAD_RESULT_PGO_ATTEMPTED);
        C04220Ms.A06(queryIntentActivities);
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (ResolveInfo next : queryIntentActivities) {
            ActivityInfo activityInfo = next.activityInfo;
            HashSet hashSet = A00;
            if (activityInfo == null || (applicationInfo = activityInfo.applicationInfo) == null) {
                str = null;
            } else {
                str = applicationInfo.packageName;
            }
            if (hashSet.contains(str)) {
                A0v.add(next);
            }
        }
        if (C18250wR.A1K(A0v)) {
            C16420t2.A00().A06().A09(r4.A00, intent);
        } else if (!(A0q2 == null || A0q2.length() == 0)) {
            C10650ih.A01(r4.A00, new Intent("android.intent.action.VIEW", C15430rJ.A01(A0q2)));
            return null;
        }
        return null;
    }
}
