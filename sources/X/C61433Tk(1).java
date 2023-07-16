package X;

import android.content.Context;
import com.facebook.common.dextricks.DexStore;

/* renamed from: X.3Tk  reason: invalid class name and case insensitive filesystem */
public final class C61433Tk {
    public final String A01(Context context, long j, long j2) {
        int i;
        C04220Ms.A0B(context, 0);
        int intValue = A00(j, j2).intValue();
        if (intValue != 0) {
            i = 2131824997;
            if (intValue != 1) {
                i = 2131824996;
            }
        } else {
            i = 2131824995;
        }
        String A0l = AnonymousClass0wJ.A0l(context, Integer.valueOf((int) ((j2 - j) / ((long) DexStore.DAYS_TO_MS_FACTOR))), i);
        C04220Ms.A06(A0l);
        return A0l;
    }

    public static final Integer A00(long j, long j2) {
        long j3 = j2 - 86400000;
        long j4 = j2 - 259200000;
        if (j >= j3) {
            return AnonymousClass006.A00;
        }
        if (j >= j4) {
            return AnonymousClass006.A01;
        }
        return AnonymousClass006.A0C;
    }
}
