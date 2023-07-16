package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.7YB  reason: invalid class name */
public final class AnonymousClass7YB implements C147488pQ, C147438pL {
    public C146508mM A00;
    public AnonymousClass0YY A01;

    public final /* synthetic */ boolean A8A(AnonymousClass0YY r2) {
        return AnonymousClass6ES.A00(this, r2);
    }

    public final void C7Y(C142998fw r4) {
        AnonymousClass0YY r1;
        C04220Ms.A0B(r4, 0);
        AnonymousClass0YY r2 = (AnonymousClass0YY) r4.AbB(AnonymousClass6WM.A00);
        if (r2 == null && (r1 = this.A01) != null) {
            r1.invoke((Object) null);
        }
        this.A01 = r2;
    }

    public final /* synthetic */ Modifier Cx6(Modifier modifier) {
        return AnonymousClass6ER.A00(this, modifier);
    }

    public final void C0k(C146508mM r3) {
        this.A00 = r3;
        boolean BRS = r3.BRS();
        AnonymousClass0YY r0 = this.A01;
        if (BRS) {
            if (r0 == null) {
                return;
            }
        } else if (r0 != null) {
            r3 = null;
        } else {
            return;
        }
        r0.invoke(r3);
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }
}
