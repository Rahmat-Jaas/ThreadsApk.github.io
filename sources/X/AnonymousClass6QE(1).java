package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.6QE  reason: invalid class name */
public final class AnonymousClass6QE {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
            case 1:
                return "FILL_SCREEN";
            default:
                return "SQUARE_CROP";
        }
    }
}
