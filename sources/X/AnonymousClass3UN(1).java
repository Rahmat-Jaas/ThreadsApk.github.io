package X;

import android.content.Context;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.3UN  reason: invalid class name */
public final class AnonymousClass3UN {
    public static volatile AnonymousClass3UN A01;
    public Map A00 = AnonymousClass0wJ.A0y();

    public static AnonymousClass3UN A00() {
        if (A01 == null) {
            synchronized (AnonymousClass3UN.class) {
                if (A01 == null) {
                    A01 = new AnonymousClass3UN();
                }
            }
        }
        return A01;
    }

    public final int A01(Context context, String str) {
        int identifier;
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String replace = str.toLowerCase(Locale.ROOT).replace("-", "_");
        try {
            return Integer.parseInt(replace);
        } catch (NumberFormatException unused) {
            synchronized (this) {
                Map map = this.A00;
                if (map.containsKey(replace)) {
                    identifier = ((Integer) map.get(replace)).intValue();
                } else {
                    identifier = context.getResources().getIdentifier(replace, "drawable", context.getPackageName());
                    map.put(replace, Integer.valueOf(identifier));
                }
                return identifier;
            }
        }
    }
}
