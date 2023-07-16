package X;

import android.content.Context;
import com.facebook.redex.IDxCFactoryShape111S0000000_I2;

/* renamed from: X.0Lo  reason: invalid class name */
public final class AnonymousClass0Lo implements C04050Mb {
    public final Context A00;
    public final /* synthetic */ IDxCFactoryShape111S0000000_I2 A01;
    public final /* synthetic */ AnonymousClass0OK A02;

    public AnonymousClass0Lo(Context context, AnonymousClass0OK r2, IDxCFactoryShape111S0000000_I2 iDxCFactoryShape111S0000000_I2) {
        this.A01 = iDxCFactoryShape111S0000000_I2;
        this.A02 = r2;
        this.A00 = context;
    }

    public static String A00() {
        C41194Lyn lyn = new C41194Lyn();
        return AnonymousClass00U.A0V(lyn.A00(), ":", lyn.A01());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0095, code lost:
        if (r1.contains("/system/framework/core.jar") != false) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CWp(X.C04170Mn r5, X.AnonymousClass0ND r6) {
        /*
            r4 = this;
            X.0ON r1 = X.AnonymousClass0MU.A4v
            X.0OK r0 = r4.A02
            X.0Oe r0 = r0.A0S
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r5.A03(r1, r0)
            X.0ON r1 = X.AnonymousClass0MU.A4x
            java.lang.String r0 = android.os.Build.MODEL
            r5.A03(r1, r0)
            X.0ON r1 = X.AnonymousClass0MU.A4y
            java.lang.String r0 = android.os.Build.DEVICE
            r5.A03(r1, r0)
            X.0ON r1 = X.AnonymousClass0MU.A4t
            java.lang.String r0 = android.os.Build.BRAND
            r5.A03(r1, r0)
            X.0ON r1 = X.AnonymousClass0MU.A50
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            r5.A03(r1, r0)
            X.0ON r1 = X.AnonymousClass0MU.A4z
            java.lang.String r0 = "Android"
            r5.A03(r1, r0)
            X.0ON r3 = X.AnonymousClass0MU.A3N
            java.lang.String r2 = "DALVIK"
            java.lang.String r0 = "java.boot.class.path"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            if (r1 == 0) goto L_0x0098
            java.lang.String r0 = "/system/framework/core-libart.jar"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x008f
            java.lang.String r2 = "ART"
        L_0x0048:
            r5.A03(r3, r2)
            X.0ON r1 = X.AnonymousClass0MU.A3O
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            r5.A03(r1, r0)
            X.0ON r1 = X.AnonymousClass0MU.A8U
            java.lang.String r0 = A00()
            r5.A03(r1, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r1 < r0) goto L_0x0074
            org.json.JSONObject r2 = X.AnonymousClass0NF.A00()
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0074
            X.0ON r1 = X.AnonymousClass0MU.A8P
            java.lang.String r0 = r2.toString()
            r5.A03(r1, r0)
        L_0x0074:
            X.0ON r1 = X.AnonymousClass0MU.A8Q
            java.lang.String r0 = android.os.Build.VERSION.SECURITY_PATCH
            r5.A03(r1, r0)
            android.content.Context r0 = r4.A00
            android.content.pm.PackageManager r2 = r0.getPackageManager()
            if (r2 == 0) goto L_0x008e
            X.0OZ r1 = X.AnonymousClass0MU.A06
            java.lang.String r0 = "android.hardware.ram.low"
            boolean r0 = r2.hasSystemFeature(r0)
            r5.A00(r1, r0)
        L_0x008e:
            return
        L_0x008f:
            java.lang.String r0 = "/system/framework/core.jar"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0098
            goto L_0x0048
        L_0x0098:
            java.lang.String r2 = "UNKNOWN"
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0Lo.CWp(X.0Mn, X.0ND):void");
    }

    public final Integer Awy() {
        return AnonymousClass006.A07;
    }

    public final /* synthetic */ boolean BNv(Integer num) {
        return false;
    }
}
