package X;

import java.util.Arrays;

/* renamed from: X.48U  reason: invalid class name */
public abstract class AnonymousClass48U implements C41882MfV {
    public final AnonymousClass19C A00;
    public final C04530Oa A01 = AnonymousClass0OY.A02(C77214fQ.A00);

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass48U) || !C04220Ms.A0I(this.A00, ((AnonymousClass48U) obj).A00)) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.getValue();
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    public AnonymousClass48U(AnonymousClass19C r2) {
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
