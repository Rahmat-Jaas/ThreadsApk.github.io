package X;

import kotlin.Function;

/* renamed from: X.87T  reason: invalid class name */
public final /* synthetic */ class AnonymousClass87T implements C83234r0, C04270Mx {
    public final /* synthetic */ C148908sN A00;

    public AnonymousClass87T(C148908sN r1) {
        this.A00 = r1;
    }

    public final Function Ak7() {
        return new AnonymousClass019(2, this.A00, C148908sN.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C83234r0) || !(obj instanceof C04270Mx)) {
            return false;
        }
        return C04220Ms.A0I(Ak7(), ((C04270Mx) obj).Ak7());
    }

    public final int hashCode() {
        return Ak7().hashCode();
    }

    public final /* bridge */ /* synthetic */ Object emit(Object obj, C146958n9 r3) {
        return C86164wN.A0U(this.A00.Cgt(obj, r3));
    }
}
