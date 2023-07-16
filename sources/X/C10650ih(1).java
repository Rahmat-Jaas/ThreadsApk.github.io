package X;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.0ih  reason: invalid class name and case insensitive filesystem */
public final class C10650ih {
    public static final C16420t2 A00 = C16420t2.A01(new C36890Jge("IgSecureContext").A01(), AnonymousClass006.A0C);

    public static void A02(Context context, Intent intent) {
        A00.A07().A09(context, intent);
    }

    public static void A03(Context context, Intent intent) {
        AnonymousClass05L A07 = A00.A07();
        C16300so A02 = A07.A02(context, intent);
        Intent A0A = A07.A00.A0A(context, intent, A07.A01);
        if (A0A != null) {
            A07.A06(context, intent, A0A, A02);
            context.startService(A0A);
        }
    }

    public static void A05(Context context, Intent intent) {
        AnonymousClass05L A07 = A00.A07();
        C16300so A02 = A07.A02(context, intent);
        Intent A0A = A07.A00.A0A(context, intent, A07.A01);
        if (A0A != null) {
            A07.A06(context, intent, A0A, A02);
            context.stopService(A0A);
        }
    }

    public static void A06(Context context, Uri uri) {
        A0B(context, new Intent("android.intent.action.VIEW", uri));
    }

    public static boolean A08(Activity activity, Intent intent, int i) {
        return A00.A07().A08(activity, intent, i);
    }

    public static boolean A0E(Intent intent, Fragment fragment, int i) {
        return A00.A07().A0B(intent, fragment, i);
    }

    public static void A00(Activity activity, Intent intent, int i) {
        C38040KHr.A00().CWx(new AnonymousClass45M(intent));
        A00.A09().A08(activity, intent, i);
    }

    public static void A01(Context context, Intent intent) {
        C38040KHr.A00().CWx(new AnonymousClass45M(intent));
        A00.A05().A09(context, intent);
    }

    public static void A04(Context context, Intent intent) {
        AnonymousClass05J r2;
        C38040KHr.A00().CWx(new AnonymousClass45M(intent));
        C16420t2 r4 = A00;
        synchronized (r4) {
            r2 = r4.A01;
            if (r2 == null) {
                AnonymousClass0EJ r3 = r4.A04;
                if (r3 == null) {
                    r3 = new AnonymousClass0EJ(C16420t2.A0K, C16420t2.A0L, C16420t2.A0J);
                    r4.A04 = r3;
                }
                r2 = new AnonymousClass05J(r3, r4.A0F, r4.A0E);
                r4.A01 = r2;
            }
        }
        r2.A09(context, intent);
    }

    public static void A07(Fragment fragment, Intent intent, int i) {
        C38040KHr.A00().CWx(new AnonymousClass45M(intent));
        A00.A09().A0B(intent, fragment, i);
    }

    public static boolean A09(Context context, Intent intent) {
        C38040KHr.A00().CWx(new AnonymousClass45M(intent));
        return A00.A04().A09(context, intent);
    }

    public static boolean A0A(Context context, Intent intent) {
        C38040KHr.A00().CWx(new AnonymousClass45M(intent));
        return A00.A06().A09(context, intent);
    }

    public static boolean A0B(Context context, Intent intent) {
        C38040KHr.A00().CWx(new AnonymousClass45M(intent));
        try {
            return A00.A09().A09(context, intent);
        } catch (ActivityNotFoundException e) {
            AnonymousClass0LU.A05(C10650ih.class, "Caught ActivityNotFoundException", e, new Object[0]);
            return false;
        }
    }

    public static boolean A0C(Intent intent, Fragment fragment) {
        FragmentActivity activity;
        if (!fragment.isAdded() || (activity = fragment.getActivity()) == null) {
            return false;
        }
        return A0B(activity, intent);
    }

    public static boolean A0D(Intent intent, Fragment fragment, int i) {
        C38040KHr.A00().CWx(new AnonymousClass45M(intent));
        return A00.A06().A0B(intent, fragment, i);
    }
}
