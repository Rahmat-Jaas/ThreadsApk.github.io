package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.2Jf  reason: invalid class name and case insensitive filesystem */
public final class C34352Jf {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "FOLLOW";
                break;
            case 2:
                str = "THREE_DOT";
                break;
            case 3:
                str = "DEFAULT";
                break;
            case 4:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
            default:
                str = "DISMISS";
                break;
        }
        return str.hashCode() + intValue;
    }
}
