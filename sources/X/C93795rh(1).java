package X;

/* renamed from: X.5rh  reason: invalid class name and case insensitive filesystem */
public abstract class C93795rh extends C1366783w {
    public Integer A00 = AnonymousClass006.A01;
    public Object A01;

    public abstract Object A00();

    public final boolean hasNext() {
        Integer num = this.A00;
        Integer num2 = AnonymousClass006.A0N;
        AnonymousClass7Ko.A0C(C18240wQ.A1Y(num, num2));
        int intValue = num.intValue();
        if (intValue == 2) {
            return false;
        }
        if (intValue == 0) {
            return true;
        }
        this.A00 = num2;
        this.A01 = A00();
        if (this.A00 == AnonymousClass006.A0C) {
            return false;
        }
        this.A00 = AnonymousClass006.A00;
        return true;
    }

    public final Object next() {
        if (hasNext()) {
            this.A00 = AnonymousClass006.A01;
            Object obj = this.A01;
            this.A01 = null;
            return obj;
        }
        throw C86154wM.A0u();
    }
}
