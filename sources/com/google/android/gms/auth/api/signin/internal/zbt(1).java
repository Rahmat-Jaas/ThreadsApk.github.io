package com.google.android.gms.auth.api.signin.internal;

import X.AnonymousClass00U;
import X.AnonymousClass7D4;
import X.AnonymousClass7DJ;
import X.AnonymousClass7DR;
import X.C14030oh;
import X.C18210wN;
import X.C18240wQ;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.util.Log;

public final class zbt extends zbo {
    public final Context A00;

    public zbt(Context context) {
        int A03 = C14030oh.A03(-1740762173);
        this.A00 = context;
        C14030oh.A0A(1516754252, A03);
    }

    public static final void A00(zbt zbt) {
        int A03 = C14030oh.A03(-618800924);
        Context context = zbt.A00;
        int callingUid = Binder.getCallingUid();
        try {
            AppOpsManager appOpsManager = (AppOpsManager) AnonymousClass7DJ.A00(context).A00.getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(callingUid, "com.google.android.gms");
                try {
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                    AnonymousClass7DR A002 = AnonymousClass7DR.A00(context);
                    if (packageInfo != null) {
                        if (!AnonymousClass7DR.A01(packageInfo, false)) {
                            if (AnonymousClass7DR.A01(packageInfo, true)) {
                                Context context2 = A002.A00;
                                if (!AnonymousClass7D4.A00) {
                                    try {
                                        PackageInfo packageInfo2 = AnonymousClass7DJ.A00(context2).A00.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                                        AnonymousClass7DR.A00(context2);
                                        if (packageInfo2 == null || AnonymousClass7DR.A01(packageInfo2, false) || !AnonymousClass7DR.A01(packageInfo2, true)) {
                                            AnonymousClass7D4.A01 = false;
                                        } else {
                                            AnonymousClass7D4.A01 = true;
                                        }
                                    } catch (PackageManager.NameNotFoundException e) {
                                        Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e);
                                    } catch (Throwable th) {
                                        AnonymousClass7D4.A00 = true;
                                        throw th;
                                    }
                                    AnonymousClass7D4.A00 = true;
                                }
                                if (!AnonymousClass7D4.A01 && C18240wQ.A1W(Build.TYPE)) {
                                    Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                                }
                            }
                        }
                        C14030oh.A0A(1404781098, A03);
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.isLoggable("UidVerifier", 3);
                }
                SecurityException securityException = new SecurityException(AnonymousClass00U.A0S("Calling UID ", " is not Google Play services.", Binder.getCallingUid()));
                C14030oh.A0A(-1834771666, A03);
                throw securityException;
            }
            throw C18210wN.A0W("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException unused2) {
        }
    }
}
