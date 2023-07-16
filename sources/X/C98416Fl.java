package X;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: X.6Fl  reason: invalid class name and case insensitive filesystem */
public final class C98416Fl {
    public static final String A00(Context context, int i) {
        String str;
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            str = context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            str = String.valueOf(i);
        }
        C04220Ms.A09(str);
        return str;
    }
}
