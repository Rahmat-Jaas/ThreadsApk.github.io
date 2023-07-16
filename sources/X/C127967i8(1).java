package X;

import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.util.HashMap;

/* renamed from: X.7i8  reason: invalid class name and case insensitive filesystem */
public abstract class C127967i8 implements C39748KzG {
    public C1201278t A03() {
        return ((C91285fx) this).A00;
    }

    public final File A01() {
        return AOC((C109746kY) null, 1764852134);
    }

    public final File A02() {
        return BMF((C109746kY) null, 761593505);
    }

    public File AOC(C109746kY r7, int i) {
        File file;
        File BMF = BMF(r7, i);
        if (!(r7 == null || (file = r7.A01) == null)) {
            C98986Hr.A00(file, BMF, false);
        }
        BMF.mkdirs();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis > 0) {
            BMF.setLastModified(currentTimeMillis);
        }
        return BMF;
    }

    public File BMF(C109746kY r11, int i) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        if (r11 != null) {
            A0y.putAll(r11.A02);
        }
        ITS A00 = C37242Jn9.A00(i);
        if (A00 != null && A00.A00 && !A0y.containsKey("__scope__")) {
            String B8y = B8y();
            if (TextUtils.isEmpty(B8y)) {
                B8y = I17.A00(476);
            }
            A0y.put("__scope__", B8y);
        }
        C1201278t A03 = A03();
        Pair A002 = C36607JbX.A00(i);
        String A01 = C37242Jn9.A01(i);
        if (TextUtils.isEmpty(A01)) {
            A01 = null;
        } else {
            for (String str : C36607JbX.A00) {
                if (A01.contains(str)) {
                    String A0r = C18220wO.A0r(str, A0y);
                    if (!TextUtils.isEmpty(A0r)) {
                        A01 = A01.replace(str, A0r);
                    }
                }
            }
        }
        Object obj = A002.first;
        Object obj2 = A002.second;
        if (A01 != null) {
            obj2 = AnonymousClass00U.A0V((String) obj2, "/", A01);
        }
        return A03.A01(new Pair(obj, obj2));
    }
}
