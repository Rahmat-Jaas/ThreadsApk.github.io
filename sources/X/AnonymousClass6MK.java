package X;

import com.instagram.api.schemas.LineType;

/* renamed from: X.6MK  reason: invalid class name */
public final class AnonymousClass6MK {
    public static final AnonymousClass687 A00(LineType lineType, AnonymousClass687 r7) {
        C04220Ms.A0B(r7, 0);
        C04220Ms.A0B(lineType, 1);
        int ordinal = r7.ordinal();
        if (ordinal != 1 && ordinal != 2 && ordinal != 4) {
            int ordinal2 = lineType.ordinal();
            if (ordinal2 == 3) {
                return AnonymousClass687.Loop;
            }
            if (ordinal2 == 2) {
                return AnonymousClass687.Middle;
            }
            if (!(ordinal2 == 1 || ordinal2 == 0)) {
                throw AnonymousClass4VZ.A00();
            }
        } else if (lineType != LineType.NONE) {
            return r7;
        }
        return AnonymousClass687.None;
    }
}
