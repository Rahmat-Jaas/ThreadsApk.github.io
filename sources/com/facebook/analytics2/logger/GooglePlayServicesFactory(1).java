package com.facebook.analytics2.logger;

import X.AnonymousClass0CD;
import X.C04310Nc;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.common.GoogleApiAvailability;

public class GooglePlayServicesFactory {
    public static final String TAG = "GooglePlayServicesFactory";

    public static boolean canLoadUploaderService() {
        try {
            Class.forName("com.facebook.analytics2.logger.GooglePlayUploadService");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static boolean canUseGooglePlayServices(Context context) {
        Bundle bundle;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                return false;
            }
            return bundle.containsKey("com.google.android.gms.version");
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static AnonymousClass0CD createUploadSchedulerImpl(Context context) {
        if (canLoadUploaderService() && canUseGooglePlayServices(context)) {
            GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
            int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(context);
            if (isGooglePlayServicesAvailable != 0) {
                instance.A04(isGooglePlayServicesAvailable);
            } else {
                GooglePlayUploadService.A01(context);
                return new C04310Nc(context);
            }
        }
        return null;
    }
}
