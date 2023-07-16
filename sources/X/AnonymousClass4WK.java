package X;

import java.util.Collections;
import java.util.Map;
import kotlin.Pair;

/* renamed from: X.4WK  reason: invalid class name */
public class AnonymousClass4WK extends C63203gz {
    public static final int A0N(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final Map A0O(Pair pair) {
        C04220Ms.A0B(pair, 0);
        Map singletonMap = Collections.singletonMap(pair.A00, pair.A01);
        C04220Ms.A06(singletonMap);
        return singletonMap;
    }

    public static final void A0P(Map map) {
        C04220Ms.A0B(map, 0);
        MSK msk = (MSK) map;
        msk.A05();
        msk.A07 = true;
    }

    public static int A0M(int i) {
        int A0N = A0N(i);
        if (A0N < 16) {
            return 16;
        }
        return A0N;
    }

    public static int A0L(int i) {
        int A0N = A0N(i);
        if (A0N < 16) {
            return 16;
        }
        return A0N;
    }
}
