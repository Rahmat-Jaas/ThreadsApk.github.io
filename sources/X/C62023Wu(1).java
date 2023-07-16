package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.HashSet;

/* renamed from: X.3Wu  reason: invalid class name and case insensitive filesystem */
public abstract class C62023Wu {
    public static final HashSet A00;

    public static final boolean A00(Context context, String str) {
        String str2 = Build.BRAND;
        int i = context.getApplicationInfo().flags;
        if (!str2.startsWith("generic") || (i & 2) == 0) {
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(str, 64).signatures;
                int length = signatureArr.length;
                int i2 = 0;
                while (i2 < length) {
                    if (!A00.contains(C62843aw.A02(signatureArr[i2].toByteArray()))) {
                        i2++;
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        }
        return true;
    }

    static {
        HashSet A0u = C18200wM.A0u();
        A0u.add("8a3c4b262d721acd49a4bf97d5213199c86fa2b9");
        A0u.add("a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc");
        A0u.add("5e8f16062ea3cd2c4a0d547876baa6f38cabf625");
        A00 = A0u;
    }
}
