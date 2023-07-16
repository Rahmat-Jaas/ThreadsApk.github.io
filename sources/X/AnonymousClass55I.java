package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* renamed from: X.55I  reason: invalid class name */
public final class AnonymousClass55I extends AnonymousClass7YV implements C147468pO {
    public Alignment A00;
    public boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass55I(Alignment alignment, AnonymousClass0YY r3, boolean z) {
        super(r3);
        C18180wK.A1P(alignment, 1, r3);
        this.A00 = alignment;
        this.A01 = z;
    }

    public final /* synthetic */ boolean A8A(AnonymousClass0YY r2) {
        return AnonymousClass6ES.A00(this, r2);
    }

    public final /* synthetic */ Modifier Cx6(Modifier modifier) {
        return AnonymousClass6ER.A00(this, modifier);
    }

    public final boolean equals(Object obj) {
        AnonymousClass55I r4;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnonymousClass55I) {
            r4 = (AnonymousClass55I) obj;
        } else {
            r4 = null;
        }
        return r4 != null && C04220Ms.A0I(this.A00, r4.A00) && this.A01 == r4.A01;
    }

    public final int hashCode() {
        return C18210wN.A04(this.A00) + C86124wJ.A04(this.A01 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("BoxChildData(alignment=");
        A0s.append(this.A00);
        A0s.append(", matchParentSize=");
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }

    public final /* bridge */ /* synthetic */ Object BgW(C147168nV r1, Object obj) {
        return this;
    }
}
