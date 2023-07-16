package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.2TS  reason: invalid class name */
public final class AnonymousClass2TS {
    public static final String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "login";
            case 2:
                return "create";
            default:
                return NetInfoModule.CONNECTION_TYPE_NONE;
        }
    }
}
