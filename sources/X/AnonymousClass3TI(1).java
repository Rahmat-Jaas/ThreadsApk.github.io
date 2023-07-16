package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.redex.IDxRHelperShape755S0100000_1_I2;

/* renamed from: X.3TI  reason: invalid class name */
public final class AnonymousClass3TI {
    public static final Lzj A07 = Lzj.A00.A00();
    public Context A00;
    public AnonymousClass3UX A01 = new AnonymousClass3UX(this.A00, this.A04);
    public AnonymousClass3HT A02;
    public ContentResolver A03;
    public PackageManager A04;
    public AnonymousClass3E8 A05;
    public C81964on A06;

    public AnonymousClass3TI(Context context) {
        this.A00 = context;
        this.A03 = context.getApplicationContext().getContentResolver();
        IDxRHelperShape755S0100000_1_I2 iDxRHelperShape755S0100000_1_I2 = new IDxRHelperShape755S0100000_1_I2(this, 1);
        this.A06 = iDxRHelperShape755S0100000_1_I2;
        this.A05 = new AnonymousClass3E8(iDxRHelperShape755S0100000_1_I2);
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        this.A04 = packageManager;
        this.A02 = new AnonymousClass3HT(this.A03, AnonymousClass2CQ.A00(packageManager), this.A05, this.A06);
    }
}
