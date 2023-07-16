package X;

import java.util.Locale;

/* renamed from: X.0I0  reason: invalid class name */
public final class AnonymousClass0I0 implements C11690kc {
    public final C11690kc A00;

    public final double BKG(C05800Wc r5) {
        return Math.min(this.A00.BKG(r5), 1000.0d);
    }

    public final String getName() {
        return String.format(Locale.US, "%s.capped_%.1f", new Object[]{this.A00.getName(), Double.valueOf(1000.0d)});
    }

    public AnonymousClass0I0(C11690kc r1) {
        this.A00 = r1;
    }
}
