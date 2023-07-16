package X;

import java.io.Serializable;

/* renamed from: X.4UQ  reason: invalid class name */
public final class AnonymousClass4UQ implements C04530Oa, Serializable {
    public Object A00 = AnonymousClass0OT.A00;
    public AnonymousClass0ZU A01;

    public final boolean BV5() {
        return C18240wQ.A1Y(this.A00, AnonymousClass0OT.A00);
    }

    public final Object getValue() {
        Object obj = this.A00;
        if (obj != AnonymousClass0OT.A00) {
            return obj;
        }
        AnonymousClass0ZU r0 = this.A01;
        C04220Ms.A0A(r0);
        Object invoke = r0.invoke();
        this.A00 = invoke;
        this.A01 = null;
        return invoke;
    }

    public AnonymousClass4UQ(AnonymousClass0ZU r2) {
        this.A01 = r2;
    }

    public final String toString() {
        if (BV5()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
