package X;

import com.instagram.debug.devoptions.FXPFLinkageCacheDebugFragment;

/* renamed from: X.6JL  reason: invalid class name */
public final class AnonymousClass6JL {
    public static String A00(Integer num) {
        if (num == null) {
            return "null";
        }
        switch (num.intValue()) {
            case 1:
                return "END_ARRAY";
            case 2:
                return "BEGIN_OBJECT";
            case 3:
                return "END_OBJECT";
            case 4:
                return "NAME";
            case 5:
                return "STRING";
            case 6:
                return "NUMBER";
            case 7:
                return "BOOLEAN";
            case 8:
                return FXPFLinkageCacheDebugFragment.nullString;
            case 9:
                return "END_DOCUMENT";
            default:
                return "BEGIN_ARRAY";
        }
    }
}
