package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3V8  reason: invalid class name */
public final class AnonymousClass3V8 {
    public String A00;
    public List A01;

    public AnonymousClass3V8(String str, String str2) {
        C04220Ms.A0B(str2, 2);
        this.A00 = str;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        this.A01 = A0v;
        A0v.add(str2);
    }

    public final boolean equals(Object obj) {
        C04220Ms.A0C(obj, "null cannot be cast to non-null type com.instagram.phonenumber.model.CountryCodeGuess");
        AnonymousClass3V8 r2 = (AnonymousClass3V8) obj;
        if (this == obj) {
            return true;
        }
        if (!C18190wL.A1Y(this, obj)) {
            return false;
        }
        return C04220Ms.A0I(this.A00, r2.A00);
    }

    public final int hashCode() {
        return C18220wO.A07(this.A00);
    }

    public AnonymousClass3V8() {
    }
}
