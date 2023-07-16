package X;

import android.os.Build;
import java.util.HashMap;

/* renamed from: X.3Qq  reason: invalid class name and case insensitive filesystem */
public final class C60823Qq {
    public static final HashMap A00 = AnonymousClass4WJ.A09(C18180wK.A0p("OPPO/CPH2025EEA/OP4BA2L1:12", 30), C18180wK.A0p("OPPO/CPH2207EEA/OP4F0BL1:12", 30), C18180wK.A0p("OPPO/PENM00/OP4EC1:11", 30), C18180wK.A0p("OnePlus/OnePlus7TTMO/OnePlus7TTMO:11", 30), C18180wK.A0p("OnePlus/OnePlus8_BETA/OnePlus8:11", 30), C18180wK.A0p("Xiaomi/umi_global/umi:11", 30), C18180wK.A0p("realme/RMX2085/RMX2085L1:11", 30), C18180wK.A0p("samsung/c1qsqw/c1q:12", 30), C18180wK.A0p("samsung/o1quew/o1q:12", 30), C18180wK.A0p("samsung/r0quew/r0q:12", 30), C18180wK.A0p("samsung/r0sxxx/r0s:12", 30));

    public static final int A00() {
        int i;
        if (Build.VERSION.SDK_INT >= 31 && (i = Build.VERSION.MEDIA_PERFORMANCE_CLASS) >= 30) {
            return i;
        }
        String str = Build.BRAND;
        String str2 = Build.PRODUCT;
        String str3 = Build.DEVICE;
        String str4 = Build.VERSION.RELEASE;
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(str);
        A0r.append('/');
        A0r.append(str2);
        A0r.append('/');
        A0r.append(str3);
        A0r.append(':');
        Number number = (Number) A00.get(C18180wK.A0i(str4, A0r));
        if (number == null) {
            number = C18220wO.A0d();
        }
        int intValue = number.intValue();
        if (intValue < 30) {
            return 0;
        }
        return intValue;
    }
}
