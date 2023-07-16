package X;

import java.io.Serializable;

/* renamed from: X.0aL  reason: invalid class name and case insensitive filesystem */
public final class C06780aL implements C04530Oa, Serializable {
    public AnonymousClass0ZU A00;
    public final Object A01 = this;
    public volatile Object A02 = AnonymousClass0OT.A00;

    public final boolean BV5() {
        if (this.A02 != AnonymousClass0OT.A00) {
            return true;
        }
        return false;
    }

    public final Object getValue() {
        Object obj;
        Object obj2 = this.A02;
        AnonymousClass0OT r0 = AnonymousClass0OT.A00;
        if (obj2 != r0) {
            return obj2;
        }
        synchronized (this.A01) {
            obj = this.A02;
            if (obj == r0) {
                AnonymousClass0ZU r02 = this.A00;
                C04220Ms.A0A(r02);
                obj = r02.invoke();
                this.A02 = obj;
                this.A00 = null;
            }
        }
        return obj;
    }

    public /* synthetic */ C06780aL(AnonymousClass0ZU r2) {
        this.A00 = r2;
    }

    public final String toString() {
        if (BV5()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
