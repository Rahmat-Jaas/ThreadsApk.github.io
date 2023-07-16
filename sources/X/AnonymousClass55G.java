package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.55G  reason: invalid class name */
public final class AnonymousClass55G extends AnonymousClass7YV implements C147468pO {
    public final C142878fk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass55G(C142878fk r2, AnonymousClass0YY r3) {
        super(r3);
        C04220Ms.A0B(r3, 2);
        this.A00 = r2;
    }

    public final /* synthetic */ boolean A8A(AnonymousClass0YY r2) {
        return AnonymousClass6ES.A00(this, r2);
    }

    public final /* synthetic */ Modifier Cx6(Modifier modifier) {
        return AnonymousClass6ER.A00(this, modifier);
    }

    public final /* bridge */ /* synthetic */ Object BgW(C147168nV r3, Object obj) {
        AnonymousClass79Y r4;
        if (!(obj instanceof AnonymousClass79Y) || (r4 = (AnonymousClass79Y) obj) == null) {
            r4 = AnonymousClass7YV.A02();
        }
        C142878fk r1 = this.A00;
        C04220Ms.A0B(r1, 0);
        r4.A01 = new C873852k(r1);
        return r4;
    }

    public final boolean equals(Object obj) {
        AnonymousClass55G r3;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass55G) || (r3 = (AnonymousClass55G) obj) == null) {
            return false;
        }
        return C04220Ms.A0I(this.A00, r3.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C86104wH.A0y(this.A00, C18190wL.A0s("HorizontalAlignModifier(horizontal="));
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }
}
