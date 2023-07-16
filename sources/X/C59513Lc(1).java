package X;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import java.util.Arrays;

/* renamed from: X.3Lc  reason: invalid class name and case insensitive filesystem */
public final class C59513Lc {
    public static final String A00(Resources resources, AnonymousClass3I0 r4) {
        String string;
        AnonymousClass0wJ.A1N(resources, r4);
        Object[] objArr = r4.A01;
        int length = objArr.length;
        if (length == 0) {
            string = resources.getString(r4.A00);
        } else {
            string = resources.getString(r4.A00, Arrays.copyOf(objArr, length));
        }
        C04220Ms.A06(string);
        return string;
    }

    public static final String A01(Fragment fragment, AnonymousClass3I0 r1) {
        AnonymousClass0wJ.A1N(fragment, r1);
        Resources A0B = AnonymousClass0wJ.A0B(fragment);
        C04220Ms.A06(A0B);
        return A00(A0B, r1);
    }
}
