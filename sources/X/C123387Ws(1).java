package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.7Ws  reason: invalid class name and case insensitive filesystem */
public final class C123387Ws implements C147508pS {
    public final AnonymousClass7ZH A00;
    public final AnonymousClass0YY A01;

    public final /* synthetic */ boolean A8A(AnonymousClass0YY r2) {
        return AnonymousClass6ES.A00(this, r2);
    }

    public final /* synthetic */ Modifier Cx6(Modifier modifier) {
        return AnonymousClass6ER.A00(this, modifier);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C123387Ws) {
                C123387Ws r5 = (C123387Ws) obj;
                if (!C04220Ms.A0I(this.A00, r5.A00) || !C04220Ms.A0I(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void AIj(C147558pX r2) {
        C104116bG r0 = this.A00.A01;
        C04220Ms.A0A(r0);
        r0.A00.invoke(r2);
    }

    public final int hashCode() {
        return C18220wO.A06(this.A01, C18210wN.A04(this.A00));
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("DrawContentCacheModifier(cacheDrawScope=");
        A0s.append(this.A00);
        A0s.append(", onBuildDrawCache=");
        return C86104wH.A0y(this.A01, A0s);
    }

    public C123387Ws(AnonymousClass7ZH r1, AnonymousClass0YY r2) {
        AnonymousClass0wJ.A1O(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }
}
