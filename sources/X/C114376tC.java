package X;

import com.facebook.graphql.impls.EmailResponseImpl;

/* renamed from: X.6tC  reason: invalid class name and case insensitive filesystem */
public final class C114376tC {
    public final EmailResponseImpl A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C114376tC) && C04220Ms.A0I(this.A00, ((C114376tC) obj).A00));
    }

    public final int hashCode() {
        return AnonymousClass0wJ.A03(this.A00) * 31;
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("FBPayEmailResponse(emailResponse=");
        A0s.append(this.A00);
        A0s.append(", deletedEmail=");
        A0s.append((String) null);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public /* synthetic */ C114376tC(EmailResponseImpl emailResponseImpl) {
        this.A00 = emailResponseImpl;
    }
}
