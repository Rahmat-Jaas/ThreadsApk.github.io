package X;

import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.86S  reason: invalid class name */
public final class AnonymousClass86S implements AnonymousClass0YY, C147498pR, C147488pQ {
    public C146508mM A00;
    public AnonymousClass0YY A01;
    public final AnonymousClass0YY A02;

    public AnonymousClass86S(AnonymousClass0YY r2) {
        C04220Ms.A0B(r2, 1);
        this.A02 = r2;
    }

    public final /* synthetic */ boolean A8A(AnonymousClass0YY r2) {
        return AnonymousClass6ES.A00(this, r2);
    }

    public final void C7Y(C142998fw r3) {
        C04220Ms.A0B(r3, 0);
        AnonymousClass0YY r1 = (AnonymousClass0YY) r3.AbB(AnonymousClass6WM.A00);
        if (!C04220Ms.A0I(r1, this.A01)) {
            this.A01 = r1;
        }
    }

    public final /* synthetic */ Modifier Cx6(Modifier modifier) {
        return AnonymousClass6ER.A00(this, modifier);
    }

    public final C104176bM Aqd() {
        return AnonymousClass6WM.A00;
    }

    public final /* bridge */ /* synthetic */ Object getValue() {
        return this;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C146508mM r2 = (C146508mM) obj;
        this.A00 = r2;
        this.A02.invoke(r2);
        AnonymousClass0YY r0 = this.A01;
        if (r0 != null) {
            r0.invoke(r2);
        }
        return Unit.A00;
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }
}
