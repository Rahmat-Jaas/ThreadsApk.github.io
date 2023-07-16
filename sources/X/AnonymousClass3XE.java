package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.3XE  reason: invalid class name */
public final class AnonymousClass3XE {
    public static final C15780rs A00;
    public static final C15780rs A01;

    public static boolean A00(Context context, String str) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 0);
            return A01.A06(C15780rs.A00(context, applicationInfo.uid), C15980sH.A04(context)) || A00.A06(C15780rs.A00(context, applicationInfo.uid), C15980sH.A04(context));
        } catch (Exception unused) {
            return false;
        }
    }

    static {
        new C15460rM("Xo8WBi6jzSxKDVR4drqm84yr9iU", "-sYXRdwJA3hvue3mKpYrOZ9zSPC7b4mbgzJmdZEDO5w");
        HashSet A0u = C18200wM.A0u();
        A0u.add(C15470rN.A0c);
        A0u.add(C15470rN.A0f);
        A0u.add(C15470rN.A0t);
        A0u.add(C15470rN.A1F);
        A01 = C15760rq.A01(Collections.unmodifiableSet(A0u));
        HashSet A0u2 = C18200wM.A0u();
        A0u2.add(C15470rN.A1D);
        A0u2.add(C15470rN.A1E);
        HashSet A0u3 = C18200wM.A0u();
        A0u3.add("com.facebook.study");
        A0u3.add("com.facebook.viewpoints");
        A00 = C15760rq.A02(Collections.unmodifiableSet(A0u2), Collections.unmodifiableSet(A0u3));
    }
}
