package X;

import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;
import java.util.Date;

/* renamed from: X.0sw  reason: invalid class name and case insensitive filesystem */
public final class C16370sw {
    public static Spanned A00(Resources resources, Object[] objArr, int i) {
        int length = objArr.length;
        Object[] objArr2 = new Object[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = objArr[i2];
            if (!(str instanceof Number) && !(str instanceof Boolean) && !(str instanceof Date) && !(str instanceof Character)) {
                String obj = str.toString();
                str = obj == null ? null : Html.escapeHtml(obj);
            }
            objArr2[i2] = str;
        }
        return Html.fromHtml(resources.getString(i, objArr2));
    }

    public static Spanned A02(C16380sx r4, String... strArr) {
        String escapeHtml;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (str == null) {
                escapeHtml = null;
            } else {
                escapeHtml = Html.escapeHtml(str);
            }
            strArr2[i] = escapeHtml;
        }
        return Html.fromHtml(r4.buildString(strArr2));
    }

    public static Spanned A01(Resources resources, String[] strArr, int i) {
        return A02(new C16940u1(resources, i), strArr);
    }

    public static Spanned A03(String str) {
        return A02(new C16870tt(str), new String[0]);
    }
}
