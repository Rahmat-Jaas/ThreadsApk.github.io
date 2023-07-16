package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.3aI  reason: invalid class name and case insensitive filesystem */
public final class C62563aI {
    public final SpannableStringBuilder A00;
    public final String A01;
    public final String A02;

    public C62563aI(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder;
        if (!TextUtils.isEmpty("")) {
            spannableStringBuilder = C18200wM.A0E("");
        } else {
            spannableStringBuilder = null;
        }
        this.A01 = str;
        this.A02 = str2;
        this.A00 = spannableStringBuilder;
    }

    public static void A01(String str, String str2, AbstractCollection abstractCollection) {
        abstractCollection.add(new C62563aI(str, str2));
    }

    public static String A00(List list, int i) {
        return ((C62563aI) list.get(i)).A01;
    }

    public C62563aI(String str, String str2, String str3) {
        SpannableStringBuilder spannableStringBuilder;
        if (!TextUtils.isEmpty(str3)) {
            spannableStringBuilder = C18200wM.A0E(str3);
        } else {
            spannableStringBuilder = null;
        }
        this.A01 = str;
        this.A02 = str2;
        this.A00 = spannableStringBuilder;
    }
}
