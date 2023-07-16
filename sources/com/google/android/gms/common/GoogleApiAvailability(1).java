package com.google.android.gms.common;

import X.AnonymousClass5pu;
import X.AnonymousClass7D4;
import X.AnonymousClass7ID;
import X.AnonymousClass7LS;
import X.C103716ab;
import X.C121217Ev;
import X.C12560m7;
import X.C13320nQ;
import X.C18210wN;
import X.C19170zP;
import X.C30949Gbq;
import X.C86144wL;
import X.C86214wg;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.app.NotificationCompat$BigTextStyle;
import androidx.fragment.app.FragmentActivity;

public final class GoogleApiAvailability extends C121217Ev {
    public static final GoogleApiAvailability A00 = new GoogleApiAvailability();
    public static final Object A01 = C86144wL.A0d();
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    public static final Dialog A00(Context context, DialogInterface.OnCancelListener onCancelListener, AnonymousClass7LS r7, int i) {
        AlertDialog.Builder builder;
        int i2;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        } else {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(AnonymousClass7ID.A01(context, i));
        builder.setOnCancelListener(onCancelListener);
        Resources resources = context.getResources();
        if (i == 1) {
            i2 = 2131824212;
        } else if (i != 2) {
            i2 = 2131824209;
            if (i != 3) {
                i2 = 17039370;
            }
        } else {
            i2 = 2131824219;
        }
        String string = resources.getString(i2);
        if (string != null) {
            builder.setPositiveButton(string, r7);
        }
        String A02 = AnonymousClass7ID.A02(context, i);
        if (A02 != null) {
            builder.setTitle(A02);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", C18210wN.A1X(i)), new IllegalArgumentException());
        return builder.create();
    }

    public static GoogleApiAvailability getInstance() {
        return A00;
    }

    public final void A06(PendingIntent pendingIntent, Context context, int i) {
        String A02;
        String format;
        int i2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", new Object[]{Integer.valueOf(i), null}), new IllegalArgumentException());
        if (i == 18) {
            new AnonymousClass5pu(context, this).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            if (i == 6) {
                A02 = AnonymousClass7ID.A03(context, "common_google_play_services_resolution_required_title");
            } else {
                A02 = AnonymousClass7ID.A02(context, i);
            }
            if (A02 == null) {
                A02 = context.getResources().getString(2131824216);
            }
            if (i == 6 || i == 19) {
                String A002 = AnonymousClass7ID.A00(context);
                Resources resources = context.getResources();
                String A03 = AnonymousClass7ID.A03(context, "common_google_play_services_resolution_required_text");
                if (A03 == null) {
                    A03 = resources.getString(2131824217);
                }
                format = String.format(resources.getConfiguration().locale, A03, new Object[]{A002});
            } else {
                format = AnonymousClass7ID.A01(context, i);
            }
            Resources resources2 = context.getResources();
            Object systemService = context.getSystemService("notification");
            C13320nQ.A01(systemService);
            NotificationManager notificationManager = (NotificationManager) systemService;
            C30949Gbq gbq = new C30949Gbq(context, (String) null);
            gbq.A0O = true;
            gbq.A0A(true);
            gbq.A08(A02);
            NotificationCompat$BigTextStyle notificationCompat$BigTextStyle = new NotificationCompat$BigTextStyle();
            notificationCompat$BigTextStyle.A00 = C30949Gbq.A00(format);
            gbq.A06(notificationCompat$BigTextStyle);
            PackageManager packageManager = context.getPackageManager();
            Boolean bool = C103716ab.A00;
            if (bool == null) {
                boolean z = false;
                if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
                C103716ab.A00 = bool;
            }
            if (bool.booleanValue()) {
                gbq.A05(context.getApplicationInfo().icon);
                gbq.A05 = 2;
                C103716ab.A00(context);
                gbq.A0A = pendingIntent;
            } else {
                gbq.A05(17301642);
                gbq.A09(resources2.getString(2131824216));
                gbq.A09.when = System.currentTimeMillis();
                gbq.A0A = pendingIntent;
                gbq.A07(format);
            }
            synchronized (A01) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(2131824215);
            if (notificationChannel == null) {
                notificationChannel = new NotificationChannel("com.google.android.gms.availability", string, 4);
            } else {
                if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                }
                gbq.A0G = "com.google.android.gms.availability";
                Notification A012 = gbq.A01();
                if (i != 1 || i == 2 || i == 3) {
                    AnonymousClass7D4.A02.set(false);
                    i2 = 10436;
                } else {
                    i2 = 39789;
                }
                notificationManager.notify(i2, A012);
            }
            notificationManager.createNotificationChannel(notificationChannel);
            gbq.A0G = "com.google.android.gms.availability";
            Notification A0122 = gbq.A01();
            if (i != 1) {
            }
            AnonymousClass7D4.A02.set(false);
            i2 = 10436;
            notificationManager.notify(i2, A0122);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    public static final void A01(Activity activity, Dialog dialog, DialogInterface.OnCancelListener onCancelListener, String str) {
        try {
            if (activity instanceof FragmentActivity) {
                C12560m7 supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
                C19170zP r1 = new C19170zP();
                C13320nQ.A02(dialog, "Cannot display null dialog");
                dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                r1.A00 = dialog;
                r1.A01 = onCancelListener;
                r1.A0A(supportFragmentManager, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        C86214wg r12 = new C86214wg();
        C13320nQ.A02(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
        r12.A00 = dialog;
        r12.A01 = onCancelListener;
        r12.show(fragmentManager, str);
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4x2 A05(android.content.Context r5, X.C111506nn r6) {
        /*
            r4 = this;
            r0 = 194(0xc2, float:2.72E-43)
            java.lang.String r0 = X.I17.A00(r0)
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r1.<init>(r0)
            java.lang.String r0 = "package"
            r1.addDataScheme(r0)
            X.4x2 r3 = new X.4x2
            r3.<init>(r6)
            r5.registerReceiver(r3, r1)
            r3.A00 = r5
            java.lang.String r2 = "com.google.android.gms"
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch:{ Exception -> 0x0051 }
            android.content.pm.PackageInstaller r0 = r0.getPackageInstaller()     // Catch:{ Exception -> 0x0051 }
            java.util.List r0 = r0.getAllSessions()     // Catch:{ Exception -> 0x0051 }
            java.util.Iterator r1 = r0.iterator()
        L_0x002c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0043
            java.lang.Object r0 = r1.next()
            android.content.pm.PackageInstaller$SessionInfo r0 = (android.content.pm.PackageInstaller.SessionInfo) r0
            java.lang.String r0 = r0.getAppPackageName()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x002c
        L_0x0042:
            return r3
        L_0x0043:
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            r0 = 8192(0x2000, float:1.14794E-41)
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo(r2, r0)     // Catch:{  }
            boolean r0 = r0.enabled     // Catch:{  }
            if (r0 != 0) goto L_0x0042
        L_0x0051:
            r6.A00()
            r3.A00()
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleApiAvailability.A05(android.content.Context, X.6nn):X.4x2");
    }

    public int isGooglePlayServicesAvailable(Context context) {
        return A02(context, 12451000);
    }
}
