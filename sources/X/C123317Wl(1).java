package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.7Wl  reason: invalid class name and case insensitive filesystem */
public final class C123317Wl implements Modifier {
    public final Modifier A00;
    public final Modifier A01;

    public final boolean A8A(AnonymousClass0YY r3) {
        C04220Ms.A0B(r3, 0);
        if (!this.A01.A8A(r3) || !this.A00.A8A(r3)) {
            return false;
        }
        return true;
    }

    public final Object ANM(Object obj, AnonymousClass0YP r4) {
        C04220Ms.A0B(r4, 1);
        return this.A00.ANM(this.A01.ANM(obj, r4), r4);
    }

    public final /* synthetic */ Modifier Cx6(Modifier modifier) {
        return AnonymousClass6ER.A00(this, modifier);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C123317Wl) {
            C123317Wl r3 = (C123317Wl) obj;
            if (!C04220Ms.A0I(this.A01, r3.A01) || !C04220Ms.A0I(this.A00, r3.A00)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.A01.hashCode() + C18210wN.A04(this.A00);
    }

    public final String toString() {
        return AnonymousClass00U.A0M("[", (String) ANM("", AnonymousClass4mH.A00), ']');
    }

    public C123317Wl(Modifier modifier, Modifier modifier2) {
        this.A01 = modifier;
        this.A00 = modifier2;
    }
}
