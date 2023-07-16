package X;

/* renamed from: X.5ML  reason: invalid class name */
public final class AnonymousClass5ML extends AnonymousClass0Sf implements C41882MfV {
    public final C121997Jj A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5ML) && C04220Ms.A0I(this.A00, ((AnonymousClass5ML) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C127397h3 r0;
        AnonymousClass5ML r3 = (AnonymousClass5ML) obj;
        C127397h3 r1 = this.A00.A02;
        C04220Ms.A0C(r1, C18170wI.A00(20));
        String A0M = r1.A0M();
        if (r3 == null || (r0 = r3.A00.A02) == null) {
            str = null;
        } else {
            str = r0.A0M();
        }
        return C04220Ms.A0I(A0M, str);
    }

    public final String toString() {
        return C86104wH.A0y(this.A00, C18190wL.A0s("ShoppingDataSignifierBannerViewModel(key="));
    }

    public AnonymousClass5ML(C121997Jj r1) {
        this.A00 = r1;
    }
}
