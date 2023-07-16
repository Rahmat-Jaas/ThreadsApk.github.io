package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.2Tb  reason: invalid class name and case insensitive filesystem */
public final class C36892Tb {
    public static final String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "user_sms";
            case 2:
                return "user_system_sheet";
            case 3:
                return GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
            case 4:
                return "whatsapp";
            case 5:
                return "messenger";
            default:
                return "user_email";
        }
    }
}
