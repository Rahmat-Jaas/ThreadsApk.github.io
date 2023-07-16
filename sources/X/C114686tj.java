package X;

import com.facebook.graphql.impls.FBPayFormFieldImpl;

/* renamed from: X.6tj  reason: invalid class name and case insensitive filesystem */
public final class C114686tj {
    public final FBPayFormFieldImpl A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C114686tj) {
                C114686tj r5 = (C114686tj) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C18220wO.A06(this.A00, AnonymousClass0wJ.A06(this.A01) * 31);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("FBPayFullNameComponent(payerName=");
        A0s.append(this.A01);
        A0s.append(", fullNameFieldConfig=");
        return C86104wH.A0y(this.A00, A0s);
    }

    public C114686tj(FBPayFormFieldImpl fBPayFormFieldImpl, String str) {
        this.A01 = str;
        this.A00 = fBPayFormFieldImpl;
    }
}
