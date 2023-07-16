package X;

import org.pytorch.IValue;
import org.pytorch.Tensor;

/* renamed from: X.79Q  reason: invalid class name */
public final class AnonymousClass79Q {
    public final Object A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        AnonymousClass79Q r4;
        Object obj2;
        Object obj3;
        if (obj == null || !(obj instanceof AnonymousClass79Q) || ((obj2 = this.A00) != (obj3 = r4.A00) && !obj2.equals(obj3))) {
            return false;
        }
        Object obj4 = this.A01;
        Object obj5 = (r4 = (AnonymousClass79Q) obj).A01;
        return obj4 == obj5 || obj4.equals(obj5);
    }

    public static IValue[] A00(AnonymousClass79Q r2) {
        return new IValue[]{IValue.tupleFrom(IValue.from((Tensor) r2.A00), IValue.from((Tensor) r2.A01))};
    }

    public final int hashCode() {
        return (0 ^ this.A00.hashCode()) ^ this.A01.hashCode();
    }

    public final String toString() {
        return AnonymousClass00U.A0L(C86104wH.A0x(this.A01, AnonymousClass00U.A0L(C86104wH.A0x(this.A00, "<", C18200wM.A0r()), ":"), C18200wM.A0r()), ">");
    }

    public AnonymousClass79Q(Object obj, Object obj2) {
        this.A00 = obj;
        this.A01 = obj2;
    }
}
