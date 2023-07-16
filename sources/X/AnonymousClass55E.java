package X;

import androidx.compose.ui.Modifier;
import com.facebook.forker.Process;

/* renamed from: X.55E  reason: invalid class name */
public final class AnonymousClass55E extends AnonymousClass7YV implements C147458pN {
    public long A00 = AnonymousClass7FV.A00(Process.WAIT_RESULT_TIMEOUT, Process.WAIT_RESULT_TIMEOUT);
    public final AnonymousClass0YY A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass55E(AnonymousClass0YY r3, AnonymousClass0YY r4) {
        super(r4);
        C04220Ms.A0B(r4, 2);
        this.A01 = r3;
    }

    public final /* synthetic */ boolean A8A(AnonymousClass0YY r2) {
        return AnonymousClass6ES.A00(this, r2);
    }

    public final /* synthetic */ Modifier Cx6(Modifier modifier) {
        return AnonymousClass6ER.A00(this, modifier);
    }

    public final void CFP(long j) {
        if (this.A00 != j) {
            this.A01.invoke(new C114336t4(j));
            this.A00 = j;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass55E)) {
            return false;
        }
        return C04220Ms.A0I(this.A01, ((AnonymousClass55E) obj).A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final /* synthetic */ Object ANM(Object obj, AnonymousClass0YP r3) {
        return C86104wH.A0g(obj, this, r3);
    }
}
