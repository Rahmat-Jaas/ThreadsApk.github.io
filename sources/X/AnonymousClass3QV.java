package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;

/* renamed from: X.3QV  reason: invalid class name */
public final class AnonymousClass3QV {
    public static final HashSet A00;

    public static boolean A00(Context context, String str) {
        int length;
        String str2 = Build.BRAND;
        int i = context.getApplicationInfo().flags;
        if (str2.startsWith("generic") && (i & 2) != 0) {
            return true;
        }
        try {
            Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr != null && (length = signatureArr.length) > 0) {
                int i2 = 0;
                do {
                    if (!A00.contains(C62843aw.A02(signatureArr[i2].toByteArray()))) {
                        return false;
                    }
                    i2++;
                } while (i2 < length);
                return true;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    static {
        HashSet A0u = C18200wM.A0u();
        A0u.add("8a3c4b262d721acd49a4bf97d5213199c86fa2b9");
        A0u.add("cc2751449a350f668590264ed76692694a80308a");
        A0u.add("a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc");
        A0u.add("df6b721c8b4d3b6eb44c861d4415007e5a35fc95");
        A0u.add("9b8f518b086098de3d77736f9458a3d2f6f95a37");
        A0u.add("2438bce1ddb7bd026d5ff89f598b3b5e5bb824b3");
        A00 = A0u;
    }
}
