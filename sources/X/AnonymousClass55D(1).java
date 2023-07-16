package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.55D  reason: invalid class name */
public final class AnonymousClass55D extends AnonymousClass7YV implements C147438pL {
    public final AnonymousClass0YY A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass55D(AnonymousClass0YY r2, AnonymousClass0YY r3) {
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

    public final void C0k(C146508mM r2) {
        this.A00.invoke(r2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass55D)) {
            return false;
        }
        return C04220Ms.A0I(this.A00, ((AnonymousClass55D) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }
}
