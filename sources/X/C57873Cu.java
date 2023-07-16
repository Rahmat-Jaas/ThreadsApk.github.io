package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import com.facebook.redex.IDxRHelperShape755S0100000_1_I2;

/* renamed from: X.3Cu  reason: invalid class name and case insensitive filesystem */
public final class C57873Cu {
    public AnonymousClass3HT A00;
    public Lzj A01 = Lzj.A00.A00();
    public ContentResolver A02;
    public PackageManager A03;
    public AnonymousClass3E8 A04;
    public C81964on A05;

    public C57873Cu(Context context) {
        ContentResolver contentResolver = context.getApplicationContext().getContentResolver();
        C04220Ms.A06(contentResolver);
        this.A02 = contentResolver;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            this.A03 = packageManager;
            IDxRHelperShape755S0100000_1_I2 iDxRHelperShape755S0100000_1_I2 = new IDxRHelperShape755S0100000_1_I2(this, 3);
            this.A05 = iDxRHelperShape755S0100000_1_I2;
            this.A04 = new AnonymousClass3E8(iDxRHelperShape755S0100000_1_I2);
            this.A00 = new AnonymousClass3HT(this.A02, AnonymousClass2CQ.A00(packageManager), this.A04, this.A05);
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }
}
