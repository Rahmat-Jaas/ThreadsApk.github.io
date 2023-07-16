package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.Map;

/* renamed from: X.691  reason: invalid class name */
public enum AnonymousClass691 {
    A04("DEFAULT", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT),
    A05("GET_QUOTE", "get_quote");
    
    public static final Map A02 = null;
    public int A00;
    public String A01;

    /* access modifiers changed from: public */
    static {
        int i;
        A02 = AnonymousClass0wJ.A0y();
        for (AnonymousClass691 r2 : values()) {
            A02.put(r2.A01, r2);
        }
    }

    /* access modifiers changed from: public */
    AnonymousClass691(String str, String str2) {
        this.A01 = str2;
        this.A00 = r2;
    }
}
