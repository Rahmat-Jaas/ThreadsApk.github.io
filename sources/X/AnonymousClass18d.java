package X;

import java.util.List;

/* renamed from: X.18d  reason: invalid class name */
public final class AnonymousClass18d extends AnonymousClass0Sf implements AnonymousClass4nX {
    public final Boolean A00;
    public final String A01;
    public final List A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass18d) {
                AnonymousClass18d r5 = (AnonymousClass18d) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A02, r5.A02) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((AnonymousClass0wJ.A03(this.A00) * 31) + AnonymousClass0wJ.A03(this.A02)) * 31) + C18200wM.A09(this.A01);
    }

    public AnonymousClass18d(Boolean bool, String str, List list) {
        this.A00 = bool;
        this.A02 = list;
        this.A01 = str;
    }
}
