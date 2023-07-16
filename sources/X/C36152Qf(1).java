package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.2Qf  reason: invalid class name and case insensitive filesystem */
public final class C36152Qf {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "inauthentic";
            case 2:
                return "two_fac_trusted_notification";
            case 3:
                return "activity_center";
            case 4:
                return NetInfoModule.CONNECTION_TYPE_NONE;
            default:
                return "suspicious";
        }
    }
}
