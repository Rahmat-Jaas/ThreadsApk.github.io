package com.facebook.voltron.download.scheduledinstaller;

import X.AnonymousClass006;
import X.AnonymousClass00J;
import X.AnonymousClass0UD;
import X.AnonymousClass0wJ;
import X.AnonymousClass3E8;
import X.AnonymousClass40A;
import X.C04220Ms;
import X.C13440nh;
import X.C13820oM;
import X.C18180wK;
import X.C18200wM;
import X.C18240wQ;
import X.C18400x8;
import X.C36278JNv;
import X.C36477JWz;
import X.C550031h;
import X.C551331w;
import X.C61953Wm;
import X.GGF;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public final class OxygenScheduledInstallerJobService extends JobService {
    /* JADX INFO: finally extract failed */
    public final boolean onStartJob(JobParameters jobParameters) {
        int length;
        Signature[] signatureArr;
        Signature signature;
        String str;
        C04220Ms.A0B(jobParameters, 0);
        if (jobParameters.isOverrideDeadlineExpired()) {
            return true;
        }
        Set keySet = new GGF(this).A00().A00("AppModules::ScheduledInstallRequestTimestamp").A0B().keySet();
        ArrayList A0v = AnonymousClass0wJ.A0v();
        for (Object next : keySet) {
            C18240wQ.A1N(next, A0v, C13440nh.A00((String) next, this) ? 1 : 0);
        }
        List A0N = AnonymousClass00J.A0N(A0v);
        if (!A0N.isEmpty()) {
            PackageManager packageManager = getPackageManager();
            C04220Ms.A06(packageManager);
            C36278JNv A01 = new C36477JWz(this, packageManager).A01();
            if (AnonymousClass006.A01.equals(A01.A02) && A01.A06 && A01.A05) {
                try {
                    ProviderInfo[] providerInfoArr = packageManager.getPackageInfo("com.facebook.appmanager", 8).providers;
                    if (providerInfoArr != null && (length = providerInfoArr.length) != 0) {
                        int i = 0;
                        while (true) {
                            ProviderInfo providerInfo = providerInfoArr[i];
                            String str2 = C550031h.A01;
                            if (!str2.equals(providerInfo.authority)) {
                                i++;
                                if (i >= length) {
                                    break;
                                }
                            } else if (providerInfo.exported) {
                                HandlerThread handlerThread = new HandlerThread("OxygenSessionStateThread");
                                C13820oM.A00(handlerThread);
                                handlerThread.start();
                                Looper looper = handlerThread.getLooper();
                                C04220Ms.A06(looper);
                                AnonymousClass3E8 r5 = new AnonymousClass3E8(new AnonymousClass40A());
                                ContentResolver contentResolver = getContentResolver();
                                new C18400x8(contentResolver, this, new Handler(looper));
                                HashSet hashSet = new HashSet(A0N);
                                Bundle A06 = C18180wK.A06();
                                A06.putStringArrayList("module_names", C18200wM.A0s(hashSet));
                                A06.putBoolean("deferred", true);
                                PackageManager packageManager2 = getPackageManager();
                                if (packageManager2 != null) {
                                    ProviderInfo resolveContentProvider = packageManager2.resolveContentProvider(str2, 0);
                                    if (resolveContentProvider != null) {
                                        String str3 = resolveContentProvider.packageName;
                                        if ("com.facebook.appmanager".equals(str3)) {
                                            try {
                                                PackageInfo packageInfo = packageManager2.getPackageInfo(str3, 64);
                                                if (!(packageInfo == null || (signatureArr = packageInfo.signatures) == null || signatureArr.length != 1 || (signature = signatureArr[0]) == null)) {
                                                    if (signature.equals(C551331w.A01) || signature.equals(C551331w.A00) || signature.equals(C551331w.A02)) {
                                                        Uri uri = C550031h.A00;
                                                        Integer num = AnonymousClass006.A00;
                                                        if (uri != null) {
                                                            str = uri.getAuthority();
                                                        } else {
                                                            str = null;
                                                        }
                                                        AnonymousClass0UD.A00(str, 1135733613, num);
                                                        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
                                                        if (acquireUnstableContentProviderClient != null) {
                                                            try {
                                                                Bundle call = acquireUnstableContentProviderClient.call("install", (String) null, A06);
                                                                acquireUnstableContentProviderClient.release();
                                                                call.getClass();
                                                                Bundle bundle = call.getBundle("exception");
                                                                if (bundle == null) {
                                                                    call.getLong(C61953Wm.A00(), -1);
                                                                    return false;
                                                                }
                                                                throw r5.A00(bundle).A01();
                                                            } catch (Throwable th) {
                                                                acquireUnstableContentProviderClient.release();
                                                                throw th;
                                                            }
                                                        } else {
                                                            throw C18180wK.A0a("Failed to acquire modules provider.");
                                                        }
                                                    } else {
                                                        throw new SecurityException("Provider package signature does not match");
                                                    }
                                                }
                                            } catch (PackageManager.NameNotFoundException unused) {
                                            }
                                            throw new SecurityException("Missing provider package signature");
                                        }
                                        throw new SecurityException(String.format((Locale) null, "Invalid provider package name %s", new Object[]{str3}));
                                    }
                                    throw new SecurityException(String.format((Locale) null, "Failed resolving provider info (%s)", new Object[]{str2}));
                                }
                                throw new SecurityException("PackageManager not available for client verification");
                            }
                        }
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
            }
        }
        return false;
    }

    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
