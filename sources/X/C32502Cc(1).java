package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.2Cc  reason: invalid class name and case insensitive filesystem */
public final class C32502Cc {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "RESTRICTED";
            case 3:
                return "LOCAL";
            case 4:
                return "REMOTE";
            case 5:
                return "MISSED";
            case 6:
                return "REJECTED";
            case 7:
                return "BUSY";
            case 8:
                return "NO_ANSWER";
            case 9:
                return "TRANSFERRED";
            case 10:
                return "MITIGATED";
            case 11:
                return "ERROR";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
    }
}
