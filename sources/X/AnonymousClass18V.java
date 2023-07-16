package X;

import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.18V  reason: invalid class name */
public final class AnonymousClass18V extends AnonymousClass0Sf implements C82084p3 {
    public final User A00;
    public final List A01;

    public final AnonymousClass18V Cze(C112176p7 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass18V) {
                AnonymousClass18V r5 = (AnonymousClass18V) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass0wJ.A03(this.A01) * 31) + C18200wM.A07(this.A00);
    }

    public AnonymousClass18V(User user, List list) {
        this.A01 = list;
        this.A00 = user;
    }
}
