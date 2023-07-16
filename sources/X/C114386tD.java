package X;

import com.facebook.graphql.impls.PhoneResponseImpl;

/* renamed from: X.6tD  reason: invalid class name and case insensitive filesystem */
public final class C114386tD {
    public final PhoneResponseImpl A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C114386tD) && C04220Ms.A0I(this.A00, ((C114386tD) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A03(this.A00) * 31;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("FBPayPhoneNumberResponse(phoneNumberResponse=");
        A0s.append(this.A00);
        A0s.append(", deletedPhoneNumber=");
        A0s.append((String) null);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public /* synthetic */ C114386tD(PhoneResponseImpl phoneResponseImpl) {
        this.A00 = phoneResponseImpl;
    }
}
