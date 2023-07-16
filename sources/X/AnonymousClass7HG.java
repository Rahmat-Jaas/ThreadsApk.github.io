package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* renamed from: X.7HG  reason: invalid class name */
public final class AnonymousClass7HG {
    public String A00;
    public int A01;
    public int A02 = 0;
    public String A03;
    public final Context A04;

    public static final synchronized void A02(AnonymousClass7HG r2) {
        synchronized (r2) {
            PackageInfo A002 = r2.A00(r2.A04.getPackageName());
            if (A002 != null) {
                r2.A03 = Integer.toString(A002.versionCode);
                r2.A00 = A002.versionName;
            }
        }
    }

    public final synchronized int A03() {
        int i;
        i = this.A02;
        if (i == 0) {
            PackageManager packageManager = this.A04.getPackageManager();
            i = 0;
            if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            } else {
                Intent A05 = C18250wR.A05("com.google.iid.TOKEN_REQUEST");
                A05.setPackage("com.google.android.gms");
                List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(A05, 0);
                i = 2;
                if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                    Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
                }
                this.A02 = 2;
            }
        }
        return i;
    }

    public final synchronized int A04() {
        PackageInfo A002;
        if (this.A01 == 0 && (A002 = A00("com.google.android.gms")) != null) {
            this.A01 = A002.versionCode;
        }
        return this.A01;
    }

    public final synchronized String A05() {
        if (this.A03 == null) {
            A02(this);
        }
        return this.A03;
    }

    private final PackageInfo A00(String str) {
        try {
            return this.A04.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String valueOf = String.valueOf(e);
            StringBuilder A0s = C86114wI.A0s(C86104wH.A0A(valueOf) + 23);
            A0s.append("Failed to find package ");
            Log.w("FirebaseInstanceId", C18180wK.A0i(valueOf, A0s));
            return null;
        }
    }

    public AnonymousClass7HG(Context context) {
        this.A04 = context;
    }

    public static String A01(C121787Id r3) {
        C121787Id.A01(r3);
        C115266um r0 = r3.A01;
        String str = r0.A03;
        if (str == null) {
            C121787Id.A01(r3);
            str = r0.A01;
            if (str.startsWith("1:")) {
                String[] split = str.split(":");
                if (split.length >= 2) {
                    str = split[1];
                    if (str.isEmpty()) {
                        return null;
                    }
                }
                return null;
            }
        }
        return str;
    }
}
