package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import ch.boye.httpclientandroidlib.util.LangUtils;
import java.util.Locale;

/* renamed from: X.7ID  reason: invalid class name */
public final class AnonymousClass7ID {
    public static Locale A00;
    public static final C002000x A01 = new C002000x();

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A03(android.content.Context r5, java.lang.String r6) {
        /*
            X.00x r4 = A01
            monitor-enter(r4)
            android.content.res.Configuration r0 = X.C86114wI.A0B(r5)     // Catch:{ all -> 0x0064 }
            android.os.LocaleList r1 = r0.getLocales()     // Catch:{ all -> 0x0064 }
            r0 = 0
            java.util.Locale r1 = r1.get(r0)     // Catch:{ all -> 0x0064 }
            java.util.Locale r0 = A00     // Catch:{ all -> 0x0064 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0064 }
            if (r0 != 0) goto L_0x001d
            r4.clear()     // Catch:{ all -> 0x0064 }
            A00 = r1     // Catch:{ all -> 0x0064 }
        L_0x001d:
            java.lang.Object r3 = r4.get(r6)     // Catch:{ all -> 0x0064 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0064 }
            if (r3 != 0) goto L_0x0049
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0030 }
            java.lang.String r0 = "com.google.android.gms"
            android.content.res.Resources r2 = r1.getResourcesForApplication(r0)     // Catch:{ NameNotFoundException -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r2 = 0
        L_0x0031:
            r3 = 0
            if (r2 == 0) goto L_0x0049
            java.lang.String r1 = "string"
            java.lang.String r0 = "com.google.android.gms"
            int r0 = r2.getIdentifier(r6, r1, r0)     // Catch:{ all -> 0x0064 }
            if (r0 != 0) goto L_0x004b
            java.lang.String r1 = "GoogleApiAvailability"
            java.lang.String r0 = "Missing resource: "
            java.lang.String r0 = X.C86114wI.A0p(r6, r0)     // Catch:{ all -> 0x0064 }
        L_0x0046:
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0064 }
        L_0x0049:
            monitor-exit(r4)     // Catch:{ all -> 0x0064 }
            goto L_0x005e
        L_0x004b:
            java.lang.String r1 = r2.getString(r0)     // Catch:{ all -> 0x0064 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x005f
            java.lang.String r1 = "GoogleApiAvailability"
            java.lang.String r0 = "Got empty resource: "
            java.lang.String r0 = X.C86114wI.A0p(r6, r0)     // Catch:{ all -> 0x0064 }
            goto L_0x0046
        L_0x005e:
            return r3
        L_0x005f:
            r4.put(r6, r1)     // Catch:{ all -> 0x0064 }
            monitor-exit(r4)     // Catch:{ all -> 0x0064 }
            return r1
        L_0x0064:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0064 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7ID.A03(android.content.Context, java.lang.String):java.lang.String");
    }

    public static String A00(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = AnonymousClass7DJ.A00(context).A00;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String A01(Context context, int i) {
        int i2;
        String str;
        Resources resources = context.getResources();
        String A002 = A00(context);
        if (i == 1) {
            i2 = 2131824213;
        } else if (i == 2) {
            C103716ab.A00(context);
            i2 = 2131824220;
        } else if (i != 3) {
            if (i == 5) {
                str = "common_google_play_services_invalid_account_text";
            } else if (i == 7) {
                str = "common_google_play_services_network_error_text";
            } else if (i == 9) {
                i2 = 2131824218;
            } else if (i != 20) {
                switch (i) {
                    case 16:
                        str = "common_google_play_services_api_unavailable_text";
                        break;
                    case LangUtils.HASH_SEED /*17*/:
                        str = "common_google_play_services_sign_in_failed_text";
                        break;
                    case 18:
                        i2 = 2131824222;
                        break;
                    default:
                        i2 = 2131824217;
                        break;
                }
            } else {
                str = "common_google_play_services_restricted_profile_text";
            }
            Resources resources2 = context.getResources();
            String A03 = A03(context, str);
            if (A03 == null) {
                A03 = resources2.getString(2131824217);
            }
            return String.format(resources2.getConfiguration().locale, A03, new Object[]{A002});
        } else {
            i2 = 2131824210;
        }
        return C18190wL.A0h(resources, A002, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        return r1.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        return A03(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        android.util.Log.e("GoogleApiAvailability", r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(android.content.Context r4, int r5) {
        /*
            android.content.res.Resources r1 = r4.getResources()
            r3 = 0
            java.lang.String r2 = "GoogleApiAvailability"
            switch(r5) {
                case 1: goto L_0x002d;
                case 2: goto L_0x0031;
                case 3: goto L_0x0029;
                case 4: goto L_0x0019;
                case 5: goto L_0x0041;
                case 6: goto L_0x0019;
                case 7: goto L_0x0049;
                case 8: goto L_0x001a;
                case 9: goto L_0x001d;
                case 10: goto L_0x0020;
                case 11: goto L_0x0023;
                case 12: goto L_0x000a;
                case 13: goto L_0x000a;
                case 14: goto L_0x000a;
                case 15: goto L_0x000a;
                case 16: goto L_0x0026;
                case 17: goto L_0x0051;
                case 18: goto L_0x0019;
                case 19: goto L_0x000a;
                case 20: goto L_0x0039;
                default: goto L_0x000a;
            }
        L_0x000a:
            r0 = 33
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r0)
            java.lang.String r0 = "Unexpected error code "
            java.lang.String r0 = X.C86104wH.A10(r0, r1, r5)
        L_0x0016:
            android.util.Log.e(r2, r0)
        L_0x0019:
            return r3
        L_0x001a:
            java.lang.String r0 = "Internal error occurred. Please see logs for detailed information"
            goto L_0x0016
        L_0x001d:
            java.lang.String r0 = "Google Play services is invalid. Cannot recover."
            goto L_0x0016
        L_0x0020:
            java.lang.String r0 = "Developer error occurred. Please see logs for detailed information"
            goto L_0x0016
        L_0x0023:
            java.lang.String r0 = "The application is not licensed to the user."
            goto L_0x0016
        L_0x0026:
            java.lang.String r0 = "One of the API components you attempted to connect to is not available."
            goto L_0x0016
        L_0x0029:
            r0 = 2131824211(0x7f110e53, float:1.9281243E38)
            goto L_0x0034
        L_0x002d:
            r0 = 2131824214(0x7f110e56, float:1.928125E38)
            goto L_0x0034
        L_0x0031:
            r0 = 2131824221(0x7f110e5d, float:1.9281264E38)
        L_0x0034:
            java.lang.String r3 = r1.getString(r0)
            return r3
        L_0x0039:
            java.lang.String r0 = "The current user profile is restricted and could not use authenticated features."
            android.util.Log.e(r2, r0)
            java.lang.String r0 = "common_google_play_services_restricted_profile_title"
            goto L_0x0058
        L_0x0041:
            java.lang.String r0 = "An invalid account was specified when connecting. Please provide a valid account."
            android.util.Log.e(r2, r0)
            java.lang.String r0 = "common_google_play_services_invalid_account_title"
            goto L_0x0058
        L_0x0049:
            java.lang.String r0 = "Network error occurred. Please retry request later."
            android.util.Log.e(r2, r0)
            java.lang.String r0 = "common_google_play_services_network_error_title"
            goto L_0x0058
        L_0x0051:
            java.lang.String r0 = "The specified account could not be signed in."
            android.util.Log.e(r2, r0)
            java.lang.String r0 = "common_google_play_services_sign_in_failed_title"
        L_0x0058:
            java.lang.String r3 = A03(r4, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7ID.A02(android.content.Context, int):java.lang.String");
    }
}
