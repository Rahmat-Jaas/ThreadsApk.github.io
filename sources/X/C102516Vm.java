package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.6Vm  reason: invalid class name and case insensitive filesystem */
public final class C102516Vm {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : AnonymousClass006.A00(2)) {
            if (1 - num.intValue() != 0) {
                str2 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
            } else {
                str2 = "vaccine_misinformation";
            }
            if (C04220Ms.A0I(str2, str)) {
                return num;
            }
        }
        return null;
    }
}
