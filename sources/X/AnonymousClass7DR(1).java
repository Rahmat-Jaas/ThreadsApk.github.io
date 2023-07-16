package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.zzi;
import com.google.android.gms.common.zzj;

/* renamed from: X.7DR  reason: invalid class name */
public final class AnonymousClass7DR {
    public static AnonymousClass7DR A02;
    public final Context A00;
    public volatile String A01;

    public static final boolean A01(PackageInfo packageInfo, boolean z) {
        Signature[] signatureArr;
        zzi[] zziArr;
        if (packageInfo != null && (signatureArr = packageInfo.signatures) != null) {
            if (z) {
                zziArr = C102936Xc.A00;
            } else {
                zziArr = new zzi[]{C102936Xc.A00[0]};
            }
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            } else {
                int i = 0;
                zzj zzj = new zzj(signatureArr[0].toByteArray());
                while (true) {
                    if (i >= zziArr.length) {
                        break;
                    } else if (!zziArr[i].equals(zzj)) {
                        i++;
                    } else if (zziArr[i] != null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public AnonymousClass7DR(Context context) {
        this.A00 = context.getApplicationContext();
    }

    public static AnonymousClass7DR A00(Context context) {
        C13320nQ.A01(context);
        synchronized (AnonymousClass7DR.class) {
            if (A02 == null) {
                synchronized (C103786aj.class) {
                    if (C103786aj.A00 != null) {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    } else if (context != null) {
                        C103786aj.A00 = context.getApplicationContext();
                    }
                }
                A02 = new AnonymousClass7DR(context);
            }
        }
        return A02;
    }
}
