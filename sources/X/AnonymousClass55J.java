package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.55J  reason: invalid class name */
public final class AnonymousClass55J extends AnonymousClass7YV implements C147468pO {
    public final float A00;
    public final boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass55J(AnonymousClass0YY r2, float f, boolean z) {
        super(r2);
        C04220Ms.A0B(r2, 3);
        this.A00 = f;
        this.A01 = z;
    }

    public final /* synthetic */ boolean A8A(AnonymousClass0YY r2) {
        return AnonymousClass6ES.A00(this, r2);
    }

    public final /* synthetic */ Modifier Cx6(Modifier modifier) {
        return AnonymousClass6ER.A00(this, modifier);
    }

    public final boolean equals(Object obj) {
        AnonymousClass55J r4;
        if (this == obj) {
            return true;
        }
        if (obj instanceof AnonymousClass55J) {
            r4 = (AnonymousClass55J) obj;
        } else {
            r4 = null;
        }
        return r4 != null && this.A00 == r4.A00 && this.A01 == r4.A01;
    }

    public final /* bridge */ /* synthetic */ Object BgW(C147168nV r2, Object obj) {
        AnonymousClass79Y r3;
        if (!(obj instanceof AnonymousClass79Y) || (r3 = (AnonymousClass79Y) obj) == null) {
            r3 = AnonymousClass7YV.A02();
        }
        r3.A00 = this.A00;
        r3.A02 = this.A01;
        return r3;
    }

    public final int hashCode() {
        return C86134wK.A03(this.A00) + C86124wJ.A04(this.A01 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("LayoutWeightImpl(weight=");
        A0s.append(this.A00);
        A0s.append(", fill=");
        A0s.append(this.A01);
        return AnonymousClass0wJ.A0u(A0s);
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }
}
