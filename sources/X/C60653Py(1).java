package X;

import android.content.res.Resources;
import com.instagram.barcelona.R;

/* renamed from: X.3Py  reason: invalid class name and case insensitive filesystem */
public final class C60653Py {
    public static final String A00(Resources resources, int i, boolean z, boolean z2) {
        int i2;
        C04220Ms.A0B(resources, 0);
        if (z) {
            i2 = R.plurals.rolodex_minute;
            if (i < 60) {
                i2 = R.plurals.rolodex_second;
            }
            i /= 60;
        } else {
            i2 = R.plurals.rolodex_hour;
            if (i < 60) {
                i2 = R.plurals.rolodex_minute;
            }
            i /= 60;
        }
        String A0m = AnonymousClass0wJ.A0m(resources, i, i2);
        C04220Ms.A09(A0m);
        if (!z2) {
            return A0m;
        }
        String A0h = C18190wL.A0h(resources, A0m, 2131836595);
        C04220Ms.A06(A0h);
        return A0h;
    }

    public static final String A01(Resources resources, long j) {
        C04220Ms.A0B(resources, 0);
        long j2 = j / 60;
        if (j2 == 0 && j > 0) {
            j2++;
        }
        int i = (int) (j2 / 60);
        int i2 = (int) (j2 % 60);
        String A0m = AnonymousClass0wJ.A0m(resources, i, R.plurals.average_time_spent_hours);
        C04220Ms.A06(A0m);
        String A0m2 = AnonymousClass0wJ.A0m(resources, i2, R.plurals.average_time_spent_minutes);
        C04220Ms.A06(A0m2);
        if (i <= 0) {
            return A0m2;
        }
        if (i2 <= 0) {
            return A0m;
        }
        String string = resources.getString(2131821800, new Object[]{A0m, A0m2});
        C04220Ms.A06(string);
        return string;
    }
}
