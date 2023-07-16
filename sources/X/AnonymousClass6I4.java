package X;

import android.util.SparseArray;

/* renamed from: X.6I4  reason: invalid class name */
public final class AnonymousClass6I4 {
    public static final String A00(SparseArray sparseArray, int i) {
        String str;
        Object obj = sparseArray.get(i);
        if (!(obj instanceof String) || (str = (String) obj) == null) {
            return "";
        }
        return str;
    }
}
