package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.2sX  reason: invalid class name and case insensitive filesystem */
public final class C50152sX {
    public static final String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "one_line";
            case 2:
                return "two_line";
            case 3:
                return "three_line";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE;
        }
    }
}
