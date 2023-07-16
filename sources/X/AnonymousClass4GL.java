package X;

/* renamed from: X.4GL  reason: invalid class name */
public final class AnonymousClass4GL implements C82884qQ {
    public final Long A00;
    public final Long A01;

    public final boolean CW4(C58743Gz r9) {
        Long l;
        int i;
        Long l2 = this.A00;
        if (l2 == null || (l = this.A01) == null) {
            return false;
        }
        long currentTimeMillis = (System.currentTimeMillis() - AnonymousClass0wJ.A0A()) / 1000;
        long longValue = l2.longValue();
        long longValue2 = l.longValue();
        if (longValue > longValue2) {
            if (currentTimeMillis < longValue) {
                i = (currentTimeMillis > longValue2 ? 1 : (currentTimeMillis == longValue2 ? 0 : -1));
            }
            return true;
        } else if (currentTimeMillis > longValue2) {
            return false;
        } else {
            i = (longValue > currentTimeMillis ? 1 : (longValue == currentTimeMillis ? 0 : -1));
        }
        if (i <= 0) {
            return true;
        }
        return false;
    }

    public AnonymousClass4GL(Long l, Long l2) {
        this.A00 = l;
        this.A01 = l2;
    }
}
