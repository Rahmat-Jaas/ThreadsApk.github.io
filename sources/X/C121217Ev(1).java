package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: X.7Ev  reason: invalid class name and case insensitive filesystem */
public class C121217Ev {
    public static final C121217Ev A00 = new C121217Ev();
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    public static C121217Ev getInstance() {
        return A00;
    }

    public final Intent A03(Context context, String str, int i) {
        if (i == 1 || i == 2) {
            if (context != null) {
                C103716ab.A00(context);
            }
            StringBuilder A0s = C18190wL.A0s("gcore_");
            A0s.append(12451000);
            A0s.append("-");
            if (!TextUtils.isEmpty(str)) {
                A0s.append(str);
            }
            A0s.append("-");
            if (context != null) {
                A0s.append(context.getPackageName());
            }
            A0s.append("-");
            if (context != null) {
                try {
                    C105086cr A002 = AnonymousClass7DJ.A00(context);
                    A0s.append(A002.A00.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            String obj = A0s.toString();
            Intent A05 = C18250wR.A05("android.intent.action.VIEW");
            Uri.Builder appendQueryParameter = Uri.parse(C18170wI.A00(1220)).buildUpon().appendQueryParameter("id", "com.google.android.gms");
            if (!TextUtils.isEmpty(obj)) {
                appendQueryParameter.appendQueryParameter("pcampaignid", obj);
            }
            A05.setData(appendQueryParameter.build());
            A05.setPackage("com.android.vending");
            A05.addFlags(524288);
            return A05;
        } else if (i != 3) {
            return null;
        } else {
            Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String) null);
            Intent A052 = C18250wR.A05(C18170wI.A00(76));
            A052.setData(fromParts);
            return A052;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:91:0x017a A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02(android.content.Context r11, int r12) {
        /*
            r10 = this;
            java.lang.String r3 = "GooglePlayServicesUtil"
            android.content.res.Resources r1 = r11.getResources()     // Catch:{ all -> 0x000d }
            r0 = 2131824217(0x7f110e59, float:1.9281256E38)
            r1.getString(r0)     // Catch:{ all -> 0x000d }
            goto L_0x0012
        L_0x000d:
            java.lang.String r0 = "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included."
            android.util.Log.e(r3, r0)
        L_0x0012:
            java.lang.String r0 = r11.getPackageName()
            java.lang.String r8 = "com.google.android.gms"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0077
            java.util.concurrent.atomic.AtomicBoolean r0 = X.AnonymousClass7D4.A03
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0077
            java.lang.Object r4 = X.AnonymousClass6aL.A02
            monitor-enter(r4)
            boolean r0 = X.AnonymousClass6aL.A01     // Catch:{ all -> 0x0074 }
            if (r0 != 0) goto L_0x005e
            r0 = 1
            X.AnonymousClass6aL.A01 = r0     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = r11.getPackageName()     // Catch:{ all -> 0x0074 }
            X.6cr r0 = X.AnonymousClass7DJ.A00(r11)     // Catch:{ all -> 0x0074 }
            r1 = 128(0x80, float:1.794E-43)
            android.content.Context r0 = r0.A00     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r2, r1)     // Catch:{ NameNotFoundException -> 0x0056 }
            android.os.Bundle r1 = r0.metaData     // Catch:{ NameNotFoundException -> 0x0056 }
            if (r1 == 0) goto L_0x005e
            java.lang.String r0 = "com.google.app.id"
            r1.getString(r0)     // Catch:{ NameNotFoundException -> 0x0056 }
            java.lang.String r0 = "com.google.android.gms.version"
            int r0 = r1.getInt(r0)     // Catch:{ NameNotFoundException -> 0x0056 }
            X.AnonymousClass6aL.A00 = r0     // Catch:{ NameNotFoundException -> 0x0056 }
            goto L_0x005e
        L_0x0056:
            r2 = move-exception
            java.lang.String r1 = "MetadataValueReader"
            java.lang.String r0 = "This should never happen."
            android.util.Log.wtf(r1, r0, r2)     // Catch:{ all -> 0x0074 }
        L_0x005e:
            monitor-exit(r4)     // Catch:{ all -> 0x0074 }
            int r1 = X.AnonymousClass6aL.A00
            if (r1 == 0) goto L_0x006e
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            if (r1 == r0) goto L_0x0077
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r0 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r0.<init>(r1)
            throw r0
        L_0x006e:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r0 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r0.<init>()
            throw r0
        L_0x0074:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0074 }
            throw r0
        L_0x0077:
            X.C103716ab.A00(r11)
            r4 = 1
            r7 = 0
            java.lang.Boolean r0 = X.C103716ab.A02
            if (r0 != 0) goto L_0x00a0
            android.content.pm.PackageManager r1 = r11.getPackageManager()
            java.lang.String r0 = "android.hardware.type.iot"
            boolean r0 = r1.hasSystemFeature(r0)
            r2 = 1
            if (r0 != 0) goto L_0x009a
            android.content.pm.PackageManager r1 = r11.getPackageManager()
            java.lang.String r0 = "android.hardware.type.embedded"
            boolean r0 = r1.hasSystemFeature(r0)
            if (r0 != 0) goto L_0x009a
            r2 = 0
        L_0x009a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            X.C103716ab.A02 = r0
        L_0x00a0:
            boolean r0 = r0.booleanValue()
            boolean r2 = X.C18180wK.A1W(r0)
            if (r12 < 0) goto L_0x017d
            java.lang.String r5 = r11.getPackageName()
            android.content.pm.PackageManager r6 = r11.getPackageManager()
            if (r2 == 0) goto L_0x00cc
            java.lang.String r1 = "com.android.vending"
            r0 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r1 = r6.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x00bd }
            goto L_0x00cd
        L_0x00bd:
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = " requires the Google Play Store, but it is missing."
            java.lang.String r0 = r1.concat(r0)
            android.util.Log.w(r3, r0)
            goto L_0x0172
        L_0x00cc:
            r1 = 0
        L_0x00cd:
            r0 = 64
            android.content.pm.PackageInfo r9 = r6.getPackageInfo(r8, r0)     // Catch:{ NameNotFoundException -> 0x0157 }
            X.AnonymousClass7DR.A00(r11)
            boolean r0 = X.AnonymousClass7DR.A01(r9, r4)
            if (r0 != 0) goto L_0x00de
            goto L_0x0165
        L_0x00de:
            if (r2 == 0) goto L_0x0107
            X.C13320nQ.A01(r1)
            boolean r0 = X.AnonymousClass7DR.A01(r1, r4)
            if (r0 != 0) goto L_0x00f0
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = " requires Google Play Store, but its signature is invalid."
            goto L_0x016b
        L_0x00f0:
            if (r1 == 0) goto L_0x0107
            android.content.pm.Signature[] r0 = r1.signatures
            r1 = r0[r7]
            android.content.pm.Signature[] r0 = r9.signatures
            r0 = r0[r7]
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0107
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = " requires Google Play Store, but its signature doesn't match that of Google Play services."
            goto L_0x016b
        L_0x0107:
            int r2 = r9.versionCode
            r1 = -1
            if (r2 == r1) goto L_0x010e
            int r1 = r2 / 1000
        L_0x010e:
            int r0 = r12 / 1000
            if (r1 >= r0) goto L_0x0137
            int r0 = X.C86104wH.A0A(r5)
            int r0 = r0 + 82
            java.lang.StringBuilder r1 = X.C86114wI.A0s(r0)
            java.lang.String r0 = "Google Play services out of date for "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ".  Requires "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " but found "
            java.lang.String r0 = X.C86104wH.A10(r0, r1, r2)
            android.util.Log.w(r3, r0)
            r4 = 2
            goto L_0x0174
        L_0x0137:
            android.content.pm.ApplicationInfo r0 = r9.applicationInfo
            if (r0 != 0) goto L_0x014f
            android.content.pm.ApplicationInfo r0 = r6.getApplicationInfo(r8, r7)     // Catch:{ NameNotFoundException -> 0x0140 }
            goto L_0x014f
        L_0x0140:
            r2 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r0 = r1.concat(r0)
            android.util.Log.wtf(r3, r0, r2)
            goto L_0x0174
        L_0x014f:
            boolean r0 = r0.enabled
            if (r0 != 0) goto L_0x0155
            r4 = 3
            goto L_0x0174
        L_0x0155:
            r4 = 0
            goto L_0x0174
        L_0x0157:
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = " requires Google Play services, but they are missing."
            java.lang.String r0 = r1.concat(r0)
            android.util.Log.w(r3, r0)
            goto L_0x0174
        L_0x0165:
            java.lang.String r1 = java.lang.String.valueOf(r5)
            java.lang.String r0 = " requires Google Play services, but their signature is invalid."
        L_0x016b:
            java.lang.String r0 = r1.concat(r0)
            android.util.Log.w(r3, r0)
        L_0x0172:
            r4 = 9
        L_0x0174:
            boolean r0 = X.AnonymousClass7D4.A00(r11, r4)
            if (r0 == 0) goto L_0x017c
            r4 = 18
        L_0x017c:
            return r4
        L_0x017d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121217Ev.A02(android.content.Context, int):int");
    }

    public final String A04(int i) {
        return ConnectionResult.A00(i);
    }

    public int isGooglePlayServicesAvailable(Context context) {
        return A02(context, 12451000);
    }
}
