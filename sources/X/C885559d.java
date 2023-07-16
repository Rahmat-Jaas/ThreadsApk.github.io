package X;

/* renamed from: X.59d  reason: invalid class name and case insensitive filesystem */
public final class C885559d extends C98486Fs {
    public final Throwable A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C885559d) && C04220Ms.A0I(this.A00, ((C885559d) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A0s = C18190wL.A0s("LoadResult.Error(\n                    |   throwable: ");
        A0s.append(this.A00);
        return AnonymousClass4n8.A09(C18180wK.A0i("\n                    |) ", A0s), "|");
    }

    public C885559d(Throwable th) {
        this.A00 = th;
    }
}
