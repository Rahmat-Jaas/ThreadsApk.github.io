package X;

/* renamed from: X.0IO  reason: invalid class name */
public final class AnonymousClass0IO extends C02340At {
    public static AnonymousClass0AB A01;
    public static AnonymousClass0IO A02;
    public AnonymousClass0KD A00;

    public final boolean A05() {
        return false;
    }

    public final AnonymousClass0KD A02() {
        AnonymousClass0KD r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0KD A022 = A01.A0E.A02();
        this.A00 = A022;
        return A022;
    }

    public final void A03() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement obj : stackTrace) {
            sb.append("SampledOutEvent is logged: ");
            sb.append(obj.toString());
            sb.append("\n");
        }
        AnonymousClass0LU.A0D("SampledOutEventBuilder", sb.toString());
        this.A00 = null;
    }

    public final C02340At A00(long j) {
        return this;
    }

    public final C02340At A01(String str, String str2) {
        return this;
    }
}
