package X;

/* renamed from: X.7Vs  reason: invalid class name and case insensitive filesystem */
public final class C123177Vs implements C146388mA {
    public long A00;
    public long A01;
    public final /* synthetic */ AnonymousClass7WM A02;
    public final /* synthetic */ C146858my A03;

    public final void Buh(long j) {
    }

    public final void CRQ() {
    }

    public C123177Vs(AnonymousClass7WM r3, C146858my r4) {
        this.A02 = r3;
        this.A03 = r4;
        long j = AnonymousClass7KC.A03;
        this.A01 = j;
        this.A00 = j;
    }

    public final void Buw(long j) {
        AnonymousClass7WM r4 = this.A02;
        C111156ms r1 = r4.A04;
        C146508mM r6 = r1.A04;
        if (r6 != null) {
            C146858my r5 = this.A03;
            if (r6.BRS() && AnonymousClass72S.A00(r5, r1.A07)) {
                long A05 = AnonymousClass7KC.A05(this.A00, j);
                this.A00 = A05;
                long j2 = this.A01;
                long A052 = AnonymousClass7KC.A05(j2, A05);
                if (!AnonymousClass7WM.A00(r4, j2, A052)) {
                    long j3 = this.A01;
                    C146848mx r10 = AnonymousClass74R.A01;
                    AnonymousClass0Y0 r52 = ((C123207Vw) r5).A07;
                    if (r52 == null || AnonymousClass0wJ.A1X(r52.invoke(r6, C86124wJ.A0O(A052), C86124wJ.A0O(j3), false, r10))) {
                        this.A01 = A052;
                        this.A00 = AnonymousClass7KC.A03;
                    }
                }
            }
        }
    }

    public final void CLu(long j) {
        AnonymousClass7WM r2 = this.A02;
        C111156ms r4 = r2.A04;
        C146508mM r3 = r4.A04;
        if (r3 != null) {
            C146858my r1 = this.A03;
            if (r3.BRS()) {
                if (AnonymousClass7WM.A00(r2, j, j)) {
                    long j2 = r4.A07;
                    AnonymousClass0YY r12 = ((C123207Vw) r1).A05;
                    if (r12 != null) {
                        r12.invoke(Long.valueOf(j2));
                    }
                } else {
                    C146848mx r22 = AnonymousClass74R.A04;
                    AnonymousClass0YM r13 = ((C123207Vw) r1).A06;
                    if (r13 != null) {
                        r13.invoke(r3, C86124wJ.A0O(j), r22);
                    }
                }
                this.A01 = j;
            } else {
                return;
            }
        }
        if (AnonymousClass72S.A00(this.A03, r4.A07)) {
            this.A00 = AnonymousClass7KC.A03;
        }
    }

    public final void onCancel() {
        AnonymousClass0ZU r0;
        C146858my r2 = this.A03;
        if (AnonymousClass72S.A00(r2, this.A02.A04.A07) && (r0 = ((C123207Vw) r2).A01) != null) {
            r0.invoke();
        }
    }

    public final void onStop() {
        AnonymousClass0ZU r0;
        C146858my r2 = this.A03;
        if (AnonymousClass72S.A00(r2, this.A02.A04.A07) && (r0 = ((C123207Vw) r2).A01) != null) {
            r0.invoke();
        }
    }
}
