package com.facebook.common.jobscheduler.compat;

import X.AnonymousClass00U;
import X.AnonymousClass0LU;
import X.AnonymousClass6GX;
import X.AnonymousClass7IO;
import X.C113256r0;
import X.C14030oh;
import X.C16230sh;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C86114wI;
import X.C86264wq;
import X.C89415Eu;
import X.C97406Bf;
import android.app.AlarmManager;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import com.facebook.common.gcmcompat.Task;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.concurrent.TimeUnit;

public abstract class GcmTaskServiceCompat extends C86264wq {
    public static GoogleApiAvailability A00 = GoogleApiAvailability.A00;
    public static final long A01;
    public static final long A02;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        A02 = timeUnit.toMillis(5);
        A01 = timeUnit.toMillis(2);
    }

    public C113256r0 A09() {
        return new C89415Eu();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        Throwable th;
        int i3;
        int i4;
        int i5;
        int A04 = C14030oh.A04(2000333845);
        if (intent != null) {
            try {
                String action = intent.getAction();
                if (action == null) {
                    i3 = 852979966;
                } else if (action.startsWith("com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat.gms.TRY_SCHEDULE-")) {
                    Bundle extras = intent.getExtras();
                    if (extras.getString("job_tag", (String) null) != null) {
                        Task task = (Task) extras.getParcelable("task");
                        if (task != null) {
                            int i6 = extras.getInt("num_failures", -1);
                            if (i6 > 0) {
                                int A022 = A00.A02(this, 12451000);
                                if (A022 == 0) {
                                    try {
                                        AnonymousClass7IO.A01(this).A03(task);
                                    } catch (IllegalArgumentException e) {
                                        AnonymousClass6GX.A00(new ComponentName(this, task.A00), this, e);
                                    }
                                } else if (i6 >= 3) {
                                    AnonymousClass0LU.A0P("GcmTaskServiceCompat", "Job %s was not scheduled because Google Play Services became consistentlyunavailable after initial check: %s", task.A01, ConnectionResult.A00(A022));
                                } else {
                                    ConnectionResult.A00(A022);
                                    int i7 = i6 + 1;
                                    try {
                                        String str = task.A01;
                                        Intent intent2 = new Intent(this, Class.forName(task.A00)).setAction(AnonymousClass00U.A0L("com.facebook.common.jobscheduler.compat.GcmTaskServiceCompat.gms.TRY_SCHEDULE-", str)).setPackage(getPackageName());
                                        Bundle A06 = C18180wK.A06();
                                        A06.putString("job_tag", str);
                                        A06.putParcelable("task", task);
                                        A06.putInt("num_failures", i7);
                                        intent2.putExtras(A06);
                                        AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
                                        C16230sh r9 = new C16230sh();
                                        r9.A06(intent2, (ClassLoader) null);
                                        r9.A01 |= 8;
                                        alarmManager.set(2, SystemClock.elapsedRealtime() + A02, r9.A03(this, 0, 134217728));
                                    } catch (ClassNotFoundException e2) {
                                        th = C86114wI.A0k(e2);
                                    }
                                }
                                i3 = 1283764449;
                            } else {
                                th = new C97406Bf(AnonymousClass00U.A0J("invalid num_failures: ", i6));
                            }
                        } else {
                            th = new C97406Bf("Missing task");
                        }
                    } else {
                        th = new C97406Bf(C18200wM.A0m(extras.get("job_tag"), C18190wL.A0s("Invalid job_tag: ")));
                    }
                } else {
                    if (action.startsWith("com.google")) {
                        i4 = super.onStartCommand(intent, i, i2);
                        i5 = 609333806;
                    } else {
                        A09();
                        i4 = 2;
                        i5 = -1133190647;
                    }
                    C14030oh.A0B(i5, A04);
                    return i4;
                }
                C14030oh.A0B(i3, A04);
                return 2;
            } catch (C97406Bf e3) {
                AnonymousClass0LU.A0E("GcmTaskServiceCompat", "Unexpected service start parameters", e3);
                C14030oh.A0B(-647072025, A04);
                return 2;
            }
        } else {
            th = new C97406Bf("Received a null intent, did you ever return START_STICKY?");
            C14030oh.A0B(-1344329694, A04);
        }
        throw th;
    }
}
