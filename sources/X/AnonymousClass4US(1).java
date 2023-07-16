package X;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.4US  reason: invalid class name */
public final class AnonymousClass4US implements C04530Oa, Serializable {
    public static final AtomicReferenceFieldUpdater A02 = AtomicReferenceFieldUpdater.newUpdater(AnonymousClass4US.class, Object.class, "_value");
    public final Object A00;
    public volatile AnonymousClass0ZU A01;
    public volatile Object _value;

    public final boolean BV5() {
        return C18240wQ.A1Y(this._value, AnonymousClass0OT.A00);
    }

    public final Object getValue() {
        Object obj = this._value;
        AnonymousClass0OT r1 = AnonymousClass0OT.A00;
        if (obj == r1) {
            AnonymousClass0ZU r0 = this.A01;
            if (r0 != null) {
                obj = r0.invoke();
                if (A02.compareAndSet(this, r1, obj)) {
                    this.A01 = null;
                }
            }
            return this._value;
        }
        return obj;
    }

    public AnonymousClass4US(AnonymousClass0ZU r2) {
        this.A01 = r2;
        AnonymousClass0OT r0 = AnonymousClass0OT.A00;
        this._value = r0;
        this.A00 = r0;
    }

    public final String toString() {
        if (BV5()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
