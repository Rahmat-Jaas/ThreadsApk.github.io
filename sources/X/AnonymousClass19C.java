package X;

/* renamed from: X.19C  reason: invalid class name */
public final class AnonymousClass19C extends AnonymousClass0Sf implements C41882MfV {
    public final C04530Oa A00;
    public final boolean A01;

    public AnonymousClass19C() {
        this(31, false);
    }

    public /* synthetic */ AnonymousClass19C(int i, boolean z) {
        this.A01 = (i & 2) == 0 ? z : false;
        this.A00 = AnonymousClass0OY.A02(C77204fP.A00);
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass19C) && this.A01 == ((AnonymousClass19C) obj).A01);
    }

    public final int hashCode() {
        int i = 1;
        if (!this.A01) {
            i = 0;
        }
        return i * 31 * 31 * 31;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return C18190wL.A0f(this.A00);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
