package X;

import com.instagram.barcelona.R;
import java.util.Map;

/* renamed from: X.74t  reason: invalid class name and case insensitive filesystem */
public final class C1193474t {
    public final Map A00;

    public static int A00(C1193474t r0, Class cls) {
        Number number;
        int intValue;
        AnonymousClass79P r02 = (AnonymousClass79P) r0.A00.get(cls);
        if (r02 == null || (number = (Number) r02.A00) == null || (intValue = number.intValue()) == 0) {
            return R.style.FbPayAuthIG4A;
        }
        return intValue;
    }

    public C1193474t(Map map) {
        this.A00 = map;
    }
}
