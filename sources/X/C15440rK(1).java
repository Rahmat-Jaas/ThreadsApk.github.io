package X;

import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import go.Seq;
import java.text.BreakIterator;

/* renamed from: X.0rK  reason: invalid class name and case insensitive filesystem */
public final class C15440rK {
    public static boolean A01(int i) {
        if (i < 48) {
            return false;
        }
        if (i <= 57) {
            return true;
        }
        if (i < 65) {
            return false;
        }
        if (i > 70) {
            return i >= 97 && i <= 102;
        }
        return true;
    }

    public static boolean A02(int i) {
        if (i == 33 || i == 36 || i == 59 || i == 61) {
            return true;
        }
        switch (i) {
            case Rfc3492Idn.skew /*38*/:
            case 39:
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
            case Seq.NULL_REFNUM /*41*/:
            case Seq.RefTracker.REF_OFFSET /*42*/:
            case 43:
            case 44:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r2 <= r0) goto L_0x0010;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0024 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(int r2) {
        /*
            r0 = 65
            if (r2 < r0) goto L_0x0026
            r0 = 90
            if (r2 <= r0) goto L_0x0010
            r0 = 97
            if (r2 < r0) goto L_0x002d
            r0 = 122(0x7a, float:1.71E-43)
        L_0x000e:
            if (r2 > r0) goto L_0x002d
        L_0x0010:
            r0 = 1
        L_0x0011:
            r1 = 1
            if (r0 != 0) goto L_0x0025
            r0 = 45
            if (r2 == r0) goto L_0x0025
            r0 = 46
            if (r2 == r0) goto L_0x0025
            r0 = 95
            if (r2 == r0) goto L_0x0025
            r0 = 126(0x7e, float:1.77E-43)
            if (r2 == r0) goto L_0x0025
            r1 = 0
        L_0x0025:
            return r1
        L_0x0026:
            r0 = 48
            if (r2 < r0) goto L_0x002d
            r0 = 57
            goto L_0x000e
        L_0x002d:
            r0 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15440rK.A03(int):boolean");
    }

    public static void A00(String str, BreakIterator breakIterator) {
        int length = str.length();
        int current = breakIterator.current();
        if (current >= length || current == -1) {
            throw new IllegalArgumentException("Hex string must have 2 characters, found 0");
        }
        int codePointAt = str.codePointAt(current);
        if (A01(codePointAt)) {
            int next = breakIterator.next();
            if (next >= length || next == -1) {
                throw new IllegalArgumentException("Hex string must have 2 characters, found 1");
            }
            int codePointAt2 = str.codePointAt(next);
            if (!A01(codePointAt2)) {
                throw new IllegalArgumentException(AnonymousClass00U.A0V("Second hex string character ", new String(new int[]{codePointAt2}, 0, 1), " is not a valid hex digit"));
            }
            return;
        }
        throw new IllegalArgumentException(AnonymousClass00U.A0V("First hex string character ", new String(new int[]{codePointAt}, 0, 1), " is not a valid hex digit"));
    }
}
