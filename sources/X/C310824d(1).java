package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.24d  reason: invalid class name and case insensitive filesystem */
public enum C310824d {
    THREE_THUMBNAILS(1),
    FOUR_THUMBNAILS(2),
    HIDE_THUMBNAILS(3),
    TWO_THUMBNAILS(5),
    TOP_MAIN_BOTTOM_TWO_TAPPABLE_THUMBNAILS(6),
    TOP_MAIN_BOTTOM_THREE_TAPPABLE_THUMBNAILS(7);
    
    public static final Map A01 = null;
    public final int A00;

    /* access modifiers changed from: public */
    static {
        int i;
        C310824d[] values = values();
        int length = values.length;
        LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(length));
        while (i < length) {
            C310824d r1 = values[i];
            i = C18200wM.A08(r1, A0v, r1.A00, i);
        }
        A01 = A0v;
    }

    /* access modifiers changed from: public */
    C310824d(int i) {
        this.A00 = i;
    }
}
