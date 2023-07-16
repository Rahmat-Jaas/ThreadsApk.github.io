package X;

import android.content.Context;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;

/* renamed from: X.6QJ  reason: invalid class name */
public final class AnonymousClass6QJ {
    public static String A00(Context context, List list, Locale locale) {
        int size = list.size();
        if (size == 0) {
            throw new IllegalArgumentException();
        } else if (size == 1) {
            return C18190wL.A0p(list, 0);
        } else {
            if (size == 2) {
                return C18220wO.A0h(context, list.get(0), list.get(1), 2131828400);
            }
            Object obj = list.get(0);
            String string = context.getString(2131828400);
            C134717yE r7 = new C134717yE(list.size() * 5);
            Formatter formatter = new Formatter(r7, locale);
            for (int i = 1; i < size; i++) {
                formatter.format(string, new Object[]{obj, list.get(i)});
                List list2 = r7.A02;
                obj = new C134757yI(list2, r7.A01, list2.size(), r7.A00);
                r7.A01 = list2.size();
                r7.A00 = 0;
            }
            return obj.toString();
        }
    }
}
