package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.5Ku  reason: invalid class name and case insensitive filesystem */
public final class C90175Ku extends AnonymousClass0Sf implements C144268i6 {
    public final User A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Float A03;
    public final String A04;
    public final List A05;

    public final C90175Ku Czs(C112176p7 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90175Ku) {
                C90175Ku r5 = (C90175Ku) obj;
                if (!C04220Ms.A0I(this.A05, r5.A05) || !C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A03, r5.A03) || !C04220Ms.A0I(this.A04, r5.A04) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((((((AnonymousClass0wJ.A03(this.A05) * 31) + AnonymousClass0wJ.A03(this.A01)) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + AnonymousClass0wJ.A03(this.A03)) * 31) + AnonymousClass0wJ.A06(this.A04)) * 31) + C18200wM.A07(this.A00);
    }

    public C90175Ku(User user, Boolean bool, Boolean bool2, Float f, String str, List list) {
        this.A05 = list;
        this.A01 = bool;
        this.A02 = bool2;
        this.A03 = f;
        this.A04 = str;
        this.A00 = user;
    }
}
