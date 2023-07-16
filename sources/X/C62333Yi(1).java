package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.instagram.barcelona.mainactivity.BarcelonaActivity;

/* renamed from: X.3Yi  reason: invalid class name and case insensitive filesystem */
public final class C62333Yi {
    public static C62333Yi A00;
    public static C86014w8 A01;
    public static boolean A02;

    public final Intent A03(Context context, int i) {
        Intent A04;
        C04220Ms.A0B(context, 0);
        String packageName = context.getPackageName();
        if (packageName != null) {
            A04 = C18230wP.A0B();
            A04.setComponent(new ComponentName(packageName, "com.instagram.barcelona.mainactivity.BarcelonaActivity"));
        } else {
            A04 = C18250wR.A04(context, BarcelonaActivity.class);
        }
        A04.setFlags(i);
        return A04;
    }

    public static C62333Yi A01() {
        C62333Yi r0;
        if (!A02) {
            return A00;
        }
        synchronized (C62333Yi.class) {
            r0 = A00;
            if (r0 == null) {
                r0 = (C62333Yi) A01.get();
                A00 = r0;
            }
        }
        return r0;
    }

    public final Intent A02(Context context) {
        C04220Ms.A0B(context, 0);
        return A03(context, 335544320);
    }

    public static Intent A00(Context context) {
        return A01().A03(context, 335544320);
    }

    public final Intent A04(Context context, Uri uri) {
        AnonymousClass0wJ.A1N(context, uri);
        Intent A0B = C18230wP.A0B();
        A0B.setComponent(new ComponentName(context.getPackageName(), "com.instagram.barcelona.mainactivity.BarcelonaActivity"));
        A0B.setData(uri);
        return A0B;
    }
}
