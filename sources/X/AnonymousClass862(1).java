package X;

/* renamed from: X.862  reason: invalid class name */
public final class AnonymousClass862 implements C142578fF {
    public final ThreadLocal A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass862) && C04220Ms.A0I(this.A00, ((AnonymousClass862) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return C86104wH.A0y(this.A00, C18190wL.A0s("ThreadLocalKey(threadLocal="));
    }

    public AnonymousClass862(ThreadLocal threadLocal) {
        this.A00 = threadLocal;
    }
}
