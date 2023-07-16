package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.2Bb  reason: invalid class name and case insensitive filesystem */
public final class C32272Bb {
    public static Integer A00(String str) {
        String str2;
        for (Integer num : C18240wQ.A1Z()) {
            switch (num.intValue()) {
                case 1:
                    str2 = "fade";
                    break;
                case 2:
                    str2 = NetInfoModule.CONNECTION_TYPE_NONE;
                    break;
                default:
                    str2 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
                    break;
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        return AnonymousClass006.A00;
    }
}
