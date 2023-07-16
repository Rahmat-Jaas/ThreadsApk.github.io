package X;

import com.instagram.realtimeclient.GraphQLSubscriptionID;

/* renamed from: X.76B  reason: invalid class name */
public final class AnonymousClass76B {
    public final Integer A00;
    public final String A01;
    public final boolean A02;

    public AnonymousClass76B(Integer num) {
        Integer num2;
        if (AnonymousClass006.A01 == num) {
            this.A01 = "hide_hero";
            this.A02 = true;
            num2 = AnonymousClass006.A0C;
        } else {
            this.A01 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
            this.A02 = false;
            num2 = AnonymousClass006.A00;
        }
        this.A00 = num2;
    }

    public AnonymousClass76B() {
        this.A01 = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
        this.A02 = false;
        this.A00 = AnonymousClass006.A00;
    }
}
