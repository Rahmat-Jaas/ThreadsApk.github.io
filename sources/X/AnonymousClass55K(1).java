package X;

import androidx.compose.ui.Modifier;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.55K  reason: invalid class name */
public final class AnonymousClass55K extends AnonymousClass7YV implements C147408pI {
    public static AtomicInteger A01 = C86144wL.A11();
    public final C134887yX A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass55K(AnonymousClass0YY r3, AnonymousClass0YY r4, boolean z) {
        super(r4);
        C04220Ms.A0B(r4, 4);
        C134887yX r0 = new C134887yX();
        r0.A01 = z;
        r0.A00 = false;
        r3.invoke(r0);
        this.A00 = r0;
    }

    public final /* synthetic */ boolean A8A(AnonymousClass0YY r2) {
        return AnonymousClass6ES.A00(this, r2);
    }

    public final /* synthetic */ Modifier Cx6(Modifier modifier) {
        return AnonymousClass6ER.A00(this, modifier);
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass55K) && C04220Ms.A0I(this.A00, ((AnonymousClass55K) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }
}
