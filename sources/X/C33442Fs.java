package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.2Fs  reason: invalid class name and case insensitive filesystem */
public final class C33442Fs {
    public static int A00(Integer num) {
        String str;
        int intValue = num.intValue();
        switch (intValue) {
            case 1:
                str = "IN_PROGRESS";
                break;
            case 2:
                str = "FINISHED";
                break;
            case 3:
                str = "ERROR";
                break;
            default:
                str = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                break;
        }
        return str.hashCode() + intValue;
    }
}
