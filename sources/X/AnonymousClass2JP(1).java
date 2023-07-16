package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.2JP  reason: invalid class name */
public final class AnonymousClass2JP {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : C18240wQ.A1a()) {
            if (C04220Ms.A0I(AnonymousClass2JQ.A00(num), str)) {
                return num;
            }
            switch (num.intValue()) {
                case 1:
                    str2 = "right_in";
                    break;
                case 2:
                    str2 = "right_out";
                    break;
                case 3:
                    str2 = "bottom_in";
                    break;
                default:
                    str2 = NetInfoModule.CONNECTION_TYPE_NONE;
                    break;
            }
            if (C04220Ms.A0I(str2, str)) {
                return num;
            }
        }
        return AnonymousClass006.A00;
    }
}
