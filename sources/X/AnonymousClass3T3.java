package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.fragment.app.Fragment;
import com.facebook.redex.IDxRHelperShape755S0100000_1_I2;

/* renamed from: X.3T3  reason: invalid class name */
public final class AnonymousClass3T3 {
    public AnonymousClass3UX A00;
    public AnonymousClass3HT A01;
    public AnonymousClass3YA A02;
    public C81964on A03;
    public final Lzj A04 = Lzj.A00.A00();

    public AnonymousClass3T3(Context context, C10300i6 r8, String str, String str2) {
        AnonymousClass0wJ.A1Q(r8, str);
        C04220Ms.A0B(str2, 4);
        ContentResolver contentResolver = context.getApplicationContext().getContentResolver();
        C04220Ms.A06(contentResolver);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            IDxRHelperShape755S0100000_1_I2 iDxRHelperShape755S0100000_1_I2 = new IDxRHelperShape755S0100000_1_I2(this, 0);
            this.A03 = iDxRHelperShape755S0100000_1_I2;
            this.A01 = new AnonymousClass3HT(contentResolver, AnonymousClass2CQ.A00(packageManager), new AnonymousClass3E8(iDxRHelperShape755S0100000_1_I2), this.A03);
            this.A00 = new AnonymousClass3UX(context, packageManager);
            this.A02 = new AnonymousClass3YA(r8, str, str2);
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static final C83224qz A00(AnonymousClass601 r1) {
        Fragment A032 = C63913ic.A03(r1);
        if (A032 == null) {
            return null;
        }
        if (A032 instanceof AnonymousClass066) {
            return C18200wM.A0M(A032);
        }
        return AnonymousClass7Ja.A04(C550531n.A00.A03, C550531n.A01);
    }
}
