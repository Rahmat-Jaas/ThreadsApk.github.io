package X;

import android.content.res.Resources;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4000000_I2;

/* renamed from: X.2NG  reason: invalid class name */
public final class AnonymousClass2NG {
    public static final String A00(FEU feu) {
        KtCSuperShape0S4000000_I2 ktCSuperShape0S4000000_I2;
        String str;
        KtCSuperShape0S4000000_I2 ktCSuperShape0S4000000_I22;
        KtCSuperShape0S4000000_I2 ktCSuperShape0S4000000_I23;
        KtCSuperShape0S4000000_I2 ktCSuperShape0S4000000_I24;
        int i = Resources.getSystem().getDisplayMetrics().densityDpi;
        if (i > 320) {
            if (!(feu == null || (ktCSuperShape0S4000000_I24 = feu.A02) == null)) {
                str = ktCSuperShape0S4000000_I24.A03;
            }
            return null;
        } else if (i > 240) {
            if (!(feu == null || (ktCSuperShape0S4000000_I23 = feu.A02) == null)) {
                str = ktCSuperShape0S4000000_I23.A01;
            }
            return null;
        } else if (i > 160) {
            if (!(feu == null || (ktCSuperShape0S4000000_I22 = feu.A02) == null)) {
                str = ktCSuperShape0S4000000_I22.A02;
            }
            return null;
        } else {
            if (!(feu == null || (ktCSuperShape0S4000000_I2 = feu.A02) == null)) {
                str = ktCSuperShape0S4000000_I2.A00;
            }
            return null;
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        return str;
    }
}
