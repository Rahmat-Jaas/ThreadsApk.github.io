package X;

import java.util.Map;

/* renamed from: X.7Xv  reason: invalid class name and case insensitive filesystem */
public final class C123627Xv implements C146098ld {
    public final int A00;
    public final int A01;
    public final Map A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C147618pd A04;
    public final /* synthetic */ AnonymousClass0YY A05;

    public C123627Xv(C147618pd r1, Map map, AnonymousClass0YY r3, int i, int i2) {
        this.A03 = i;
        this.A04 = r1;
        this.A05 = r3;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = map;
    }

    public final Map AQ9() {
        return this.A02;
    }

    public final void CWh() {
        AnonymousClass54K r7;
        C122067Jz r9 = C122067Jz.A04;
        int i = this.A03;
        C147618pd r72 = this.A04;
        AnonymousClass69J layoutDirection = r72.getLayoutDirection();
        if (r72 instanceof AnonymousClass54K) {
            r7 = (AnonymousClass54K) r72;
        } else {
            r7 = null;
        }
        AnonymousClass0YY r5 = this.A05;
        C146508mM r4 = C122067Jz.A01;
        int i2 = C122067Jz.A00;
        AnonymousClass69J r2 = C122067Jz.A03;
        C113976sU r1 = C122067Jz.A02;
        C122067Jz.A00 = i;
        C122067Jz.A03 = layoutDirection;
        boolean A052 = C122067Jz.A05(r7);
        r5.invoke(r9);
        if (r7 != null) {
            r7.A00 = A052;
        }
        C122067Jz.A00 = i2;
        C122067Jz.A03 = r2;
        C122067Jz.A01 = r4;
        C122067Jz.A02 = r1;
    }

    public final int getHeight() {
        return this.A00;
    }

    public final int getWidth() {
        return this.A01;
    }
}
