package X;

import android.text.TextUtils;
import android.util.Pair;

/* renamed from: X.0lk  reason: invalid class name and case insensitive filesystem */
public final class C12350lk extends Pair {
    public static final C12350lk A00 = new C12350lk("", "");

    public static C12350lk A00(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return A00;
        }
        return new C12350lk(str, str2);
    }

    public C12350lk(String str, String str2) {
        super(str, str2);
    }
}
