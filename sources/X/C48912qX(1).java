package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.2qX  reason: invalid class name and case insensitive filesystem */
public final class C48912qX {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "OWNER";
            case 1:
                return "VIEWER";
            case 2:
                return "COLLABORATOR";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
        }
    }
}
