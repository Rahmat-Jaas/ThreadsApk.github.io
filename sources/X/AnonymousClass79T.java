package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.79T  reason: invalid class name */
public final class AnonymousClass79T {
    public final int A00;
    public final Class A01;

    public static void A00(C113906sM r1, Class cls, int i) {
        r1.A01(new AnonymousClass79T(cls, i));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass79T)) {
            return false;
        }
        AnonymousClass79T r4 = (AnonymousClass79T) obj;
        if (this.A01 == r4.A01 && this.A00 == r4.A00) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.A01.hashCode() ^ 1000003) * 1000003) ^ this.A00) * 1000003) ^ 0;
    }

    public final String toString() {
        String str;
        StringBuilder A0s = C18190wL.A0s("Dependency{anInterface=");
        A0s.append(this.A01);
        A0s.append(", type=");
        if (this.A00 == 1) {
            str = "required";
        } else {
            str = "set";
        }
        A0s.append(str);
        A0s.append(", injection=");
        A0s.append(RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING);
        return C18180wK.A0i("}", A0s);
    }

    public AnonymousClass79T(Class cls, int i) {
        this.A01 = cls;
        this.A00 = i;
    }
}
