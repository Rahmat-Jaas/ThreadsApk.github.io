package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import com.facebook.redex.IDxRHelperShape755S0100000_1_I2;

/* renamed from: X.3Xi  reason: invalid class name */
public final class AnonymousClass3Xi {
    public static final Lzj A07 = Lzj.A00.A00();
    public Context A00;
    public AnonymousClass3UX A01 = new AnonymousClass3UX(this.A00, this.A04);
    public AnonymousClass3HT A02;
    public ContentResolver A03;
    public PackageManager A04;
    public AnonymousClass3E8 A05;
    public C81964on A06;

    public static void A00(C34640IcN icN, C63873iU r20, AnonymousClass3Xi r21, C07530bf r22, AnonymousClass265 r23, String str, String str2, boolean z) {
        AnonymousClass265 r7 = r23;
        C07530bf r6 = r22;
        C62323Yh.A00.A02(r6, r7.A01, "client_start_request_query_verifier", "client sends start message to server to query verifier after auth failed");
        AnonymousClass3Xi r5 = r21;
        boolean z2 = z;
        String str3 = str;
        String str4 = str2;
        C32165H8c A012 = C63883iV.A01(r5.A00, r6, true, Boolean.valueOf(z2), str4, str3, true, false);
        A012.A00 = new AnonymousClass1iS((View) null, icN, r20, r5, r6, r7, str3, str4, z2);
        C31155GhB.A03(A012);
    }

    public AnonymousClass3Xi(Context context) {
        this.A00 = context;
        this.A03 = context.getApplicationContext().getContentResolver();
        IDxRHelperShape755S0100000_1_I2 iDxRHelperShape755S0100000_1_I2 = new IDxRHelperShape755S0100000_1_I2(this, 2);
        this.A06 = iDxRHelperShape755S0100000_1_I2;
        this.A05 = new AnonymousClass3E8(iDxRHelperShape755S0100000_1_I2);
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        this.A04 = packageManager;
        this.A02 = new AnonymousClass3HT(this.A03, AnonymousClass2CQ.A00(packageManager), this.A05, this.A06);
    }
}
