package X;

import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* renamed from: X.7Ja  reason: invalid class name */
public final class AnonymousClass7Ja {
    public static final C83224qz A02() {
        return new C73864Up(C25235DiG.A01(new AnonymousClass8bb((C148838sG) null), AnonymousClass6ZB.A00));
    }

    public static final C83224qz A03(C27952Ew2 ew2) {
        if (ew2.AOA(C148838sG.A00) == null) {
            ew2 = ew2.CWl(new C27437EnT((C148838sG) null));
        }
        return new C73864Up(ew2);
    }

    public static Object A00(Object obj, C146958n9 r2, AnonymousClass0YP r3) {
        Object A01 = A01(r2, r3);
        if (A01 != obj) {
            return Unit.A00;
        }
        return A01;
    }

    public static final Object A01(C146958n9 r2, AnonymousClass0YP r3) {
        C27399Emr emr = new C27399Emr(r2, r2.getContext());
        return AnonymousClass72B.A00(emr, r3, emr);
    }

    public static final C83224qz A04(C27952Ew2 ew2, C83224qz r2) {
        return new C73864Up(r2.Aa1().CWl(ew2));
    }

    public static final void A05(CancellationException cancellationException, C83224qz r2) {
        C148838sG A00 = C148838sG.A00(r2.Aa1());
        if (A00 != null) {
            A00.AC7(cancellationException);
            return;
        }
        throw C18180wK.A0a(AnonymousClass0wJ.A0t("Scope cannot be cancelled because it does not have a job: ", r2));
    }

    public static final boolean A06(C83224qz r0) {
        C148838sG A00 = C148838sG.A00(r0.Aa1());
        if (A00 != null) {
            return A00.isActive();
        }
        return true;
    }
}
