package X;

/* renamed from: X.0Hu  reason: invalid class name */
public final class AnonymousClass0Hu implements C02500Br {
    public AnonymousClass0AY A00;
    public AnonymousClass0IU A01;
    public boolean A02;
    public final AnonymousClass0A9 A03;
    public final AnonymousClass0AG A04;
    public final C02490Bq A05;
    public final boolean A06;

    private synchronized void A00() {
        if (!this.A02) {
            throw new IllegalStateException("SessionDelegate should have called bootstrapIfNeeded");
        }
    }

    public static void A01(AnonymousClass0Hu r3) {
        r3.A00 = new AnonymousClass0AY(r3.A01, r3.A04.CYD());
        synchronized (r3) {
            r3.A03.CvS(r3.A00);
        }
    }

    public AnonymousClass0Hu(AnonymousClass0A9 r1, AnonymousClass0AG r2, C02490Bq r3, boolean z) {
        this.A05 = r3;
        this.A03 = r1;
        this.A04 = r2;
        this.A06 = z;
    }

    public final void Bm8() {
        A00();
        A01(this);
        if (this.A06) {
            this.A03.D7i();
        }
    }

    public final void Bzt() {
        A00();
        A01(this);
    }
}
