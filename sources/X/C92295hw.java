package X;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5hw  reason: invalid class name and case insensitive filesystem */
public final class C92295hw extends C104886cX {
    public final Integer A00 = AnonymousClass006.A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;

    public static final SpannableString A00(String str, List list) {
        SpannableString spannableString = new SpannableString(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C134937yc r1 = (C134937yc) it.next();
            spannableString.setSpan(new StyleSpan(1), r1.A00, r1.A01 + 1, 33);
        }
        return spannableString;
    }

    public C92295hw(String str, String str2, List list, List list2) {
        this.A02 = str;
        this.A01 = str2;
        this.A04 = list;
        this.A03 = list2;
    }
}
