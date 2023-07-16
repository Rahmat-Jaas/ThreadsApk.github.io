package X;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Process;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0CI  reason: invalid class name */
public final class AnonymousClass0CI {
    public static boolean A00;

    public static void A01(Context context, C002000x r15, String str, int i, boolean z) {
        PendingIntent pendingIntent;
        String str2;
        String str3;
        int i2 = i;
        if (i2 != -1) {
            Intent intent = new Intent("com.facebook.analytics2.action.UPLOAD_JOB_RAN").setPackage(context.getPackageName());
            Bundle bundle = new Bundle();
            bundle.putInt("job_id", i2);
            bundle.putString("hack_action", str);
            bundle.putBoolean("will_retry", z);
            int size = r15.size();
            ArrayList arrayList = new ArrayList(size);
            ArrayList arrayList2 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                Object[] objArr = r15.A02;
                int i4 = i3 << 1;
                File file = (File) objArr[i4 + 1];
                arrayList.add(objArr[i4]);
                if (file != null) {
                    str3 = file.getAbsolutePath();
                } else {
                    str3 = null;
                }
                arrayList2.add(str3);
            }
            bundle.putStringArrayList("successful_processes", arrayList);
            bundle.putStringArrayList("newest_files_uploaded", arrayList2);
            Intent putExtras = intent.putExtras(bundle);
            Intent intent2 = new Intent("com.facebook.analytics2.action.UPLOAD_JOB_RAN.token");
            intent2.setPackage(context.getPackageName());
            int i5 = 1073741824;
            try {
                if (Build.VERSION.SDK_INT >= 30) {
                    i5 = 1140850688;
                }
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, i5);
            } catch (SecurityException e) {
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                int myUid = Process.myUid();
                String nameForUid = packageManager.getNameForUid(myUid);
                int callingUid = Binder.getCallingUid();
                String nameForUid2 = packageManager.getNameForUid(callingUid);
                Iterator<PackageInfo> it = packageManager.getInstalledPackages(0).iterator();
                while (true) {
                    pendingIntent = null;
                    if (!it.hasNext()) {
                        str2 = null;
                        break;
                    }
                    PackageInfo next = it.next();
                    if (next.applicationInfo.uid == myUid) {
                        str2 = next.packageName;
                        break;
                    }
                }
                AnonymousClass0LU.A0O("UploadServiceBus", "%s, ctx_pm=%s, uid=%d, uid_pn=%s, calling_uid=%d, calling_uid_pn=%s, pi_pn=%s", e.getMessage(), packageName, Integer.valueOf(myUid), nameForUid, Integer.valueOf(callingUid), nameForUid2, str2);
            }
            Intent putExtra = putExtras.putExtra("uploader_service_broadcast_auth_token", pendingIntent);
            try {
                if (A00) {
                    AnonymousClass06O.A00(context).A02(putExtra);
                } else {
                    context.sendBroadcast(putExtra);
                }
            } catch (RuntimeException e2) {
                if (e2 instanceof SecurityException) {
                    AnonymousClass0LU.A0I("UploadServiceBus", "Analytics2 not allowed in this application.", e2);
                    return;
                }
                Throwable cause = e2.getCause();
                if (cause != null) {
                    while (cause.getCause() != null) {
                        cause = cause.getCause();
                    }
                    if (cause instanceof DeadObjectException) {
                        AnonymousClass0LU.A0E("UploadServiceBus", "Failed to send broadcast. Handler may have died", e2);
                        return;
                    }
                }
                throw e2;
            }
        } else {
            throw new IllegalArgumentException("jobId = -1");
        }
    }

    public static void A00(BroadcastReceiver broadcastReceiver, Context context, Handler handler) {
        try {
            context.registerReceiver(broadcastReceiver, new IntentFilter("com.facebook.analytics2.action.UPLOAD_JOB_RAN"), (String) null, handler);
        } catch (RuntimeException e) {
            AnonymousClass0LU.A0J("UploadServiceBus", "Registering receiver caused exception.", e);
        }
    }
}
