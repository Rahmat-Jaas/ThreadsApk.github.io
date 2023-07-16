package X;

/* renamed from: X.5Lr  reason: invalid class name and case insensitive filesystem */
public final class C90355Lr extends AnonymousClass0Sf implements C81304nZ {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C90355Lr) {
                C90355Lr r5 = (C90355Lr) obj;
                if (!C04220Ms.A0I(this.A01, r5.A01) || !C04220Ms.A0I(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass0wJ.A06(this.A01) * 31) + C18200wM.A09(this.A00);
    }

    public C90355Lr(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public C90355Lr() {
        this((String) null, (String) null);
    }
}
