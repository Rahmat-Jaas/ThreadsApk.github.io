package X;

/* renamed from: X.48L  reason: invalid class name */
public final class AnonymousClass48L implements C41882MfV {
    public final Integer A00;
    public final boolean A01;

    public final /* bridge */ /* synthetic */ Object getKey() {
        switch (this.A00.intValue()) {
            case 0:
                return "MOST_RECENT";
            case 1:
                return "MOST_INTERACTED_WITH";
            default:
                return "LEAST_INTERACTED_WITH";
        }
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        Integer num;
        AnonymousClass48L r4 = (AnonymousClass48L) obj;
        Integer num2 = this.A00;
        if (r4 != null) {
            num = r4.A00;
        } else {
            num = null;
        }
        if (num2 == num && r4 != null && this.A01 == r4.A01) {
            return true;
        }
        return false;
    }

    public AnonymousClass48L(Integer num, boolean z) {
        this.A00 = num;
        this.A01 = z;
    }
}
