package X;

import android.content.Context;
import com.instagram.barcelona.R;

/* renamed from: X.2so  reason: invalid class name and case insensitive filesystem */
public final class C50322so {
    public static int A00(Context context, C57583Bq r4) {
        int i;
        boolean z = r4.A01;
        boolean z2 = r4.A02;
        boolean z3 = r4.A00;
        if (z2) {
            if (z3) {
                i = R.attr.backgroundDrawableSingle;
                if (z) {
                    i = R.attr.backgroundElevatedDrawableSingle;
                }
            } else {
                i = R.attr.backgroundDrawableTop;
                if (z) {
                    i = R.attr.backgroundElevatedDrawableTop;
                }
            }
        } else if (z3) {
            i = R.attr.backgroundDrawableBottom;
            if (z) {
                i = R.attr.backgroundElevatedDrawableBottom;
            }
        } else {
            i = R.attr.backgroundDrawable;
            if (z) {
                i = R.attr.elevatedBackgroundDrawable;
            }
        }
        return C121907Is.A02(context, i);
    }
}
