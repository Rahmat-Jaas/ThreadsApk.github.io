package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.6QC  reason: invalid class name */
public final class AnonymousClass6QC {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "CENTER";
            case 2:
                return "END";
            case 3:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
            default:
                return "START";
        }
    }
}
