package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.facebook.common.gcmcompat.Task;
import java.util.List;

/* renamed from: X.7IO  reason: invalid class name */
public final class AnonymousClass7IO {
    public static AnonymousClass7IO A01;
    public static final Integer A02 = 4;
    public final Context A00;

    public static Intent A00(ComponentName componentName, AnonymousClass7IO r4, String str) {
        C16230sh r2 = new C16230sh();
        r2.A03 = componentName;
        return C18250wR.A05("com.google.android.gms.gcm.ACTION_SCHEDULE").setPackage("com.google.android.gms").putExtra("scheduler_action", str).putExtra("app", r2.A02(r4.A00, 0, 0)).putExtra("source", A02).putExtra("source_version", 12451000);
    }

    public static synchronized AnonymousClass7IO A01(Context context) {
        AnonymousClass7IO r1;
        synchronized (AnonymousClass7IO.class) {
            r1 = A01;
            if (r1 == null) {
                r1 = new AnonymousClass7IO(context.getApplicationContext());
                A01 = r1;
            }
        }
        return r1;
    }

    public static void A02(AnonymousClass7IO r3, String str) {
        if (str != null) {
            Intent A05 = C18250wR.A05("com.google.android.gms.gcm.ACTION_TASK_READY");
            Context context = r3.A00;
            A05.setPackage(context.getPackageName());
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(A05, 512);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                throw C18190wL.A0a("There is no GcmTaskService component registered within this package. Have you extended GcmTaskService correctly?");
            }
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (resolveInfo.serviceInfo.name.equals(str)) {
                    return;
                }
            }
            throw C18190wL.A0a("The GcmTaskService class you provided  does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY.");
        }
        throw C18210wN.A0W("GcmTaskService must not be null.");
    }

    public final void A03(Task task) {
        String str = task.A00;
        A02(this, str);
        Context context = this.A00;
        Intent A002 = A00(new ComponentName(context, str), this, "SCHEDULE_TASK");
        if (A002 != null) {
            Bundle A06 = C18180wK.A06();
            task.A03(A06);
            A002.putExtras(A06);
            context.sendBroadcast(A002);
        }
    }

    public AnonymousClass7IO(Context context) {
        this.A00 = context;
    }
}
