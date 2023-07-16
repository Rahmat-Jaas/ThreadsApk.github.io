package X;

import java.lang.reflect.Method;

/* renamed from: X.6rZ  reason: invalid class name and case insensitive filesystem */
public final class C113526rZ {
    public final int A00;
    public final Method A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C113526rZ)) {
            return false;
        }
        C113526rZ r4 = (C113526rZ) obj;
        return this.A00 == r4.A00 && this.A01.getName().equals(r4.A01.getName());
    }

    public final int hashCode() {
        return C18210wN.A05(this.A01.getName(), this.A00 * 31);
    }

    public C113526rZ(Method method, int i) {
        this.A00 = i;
        this.A01 = method;
        method.setAccessible(true);
    }
}
