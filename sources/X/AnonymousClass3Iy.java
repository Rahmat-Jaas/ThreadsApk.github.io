package X;

/* renamed from: X.3Iy  reason: invalid class name */
public final class AnonymousClass3Iy {
    public AnonymousClass0TK A00;
    public final AnonymousClass3Iv A01;
    public final C07810cE A02;
    public final C07810cE A03;

    public final boolean A09(long j) {
        AnonymousClass0TK r0 = this.A00;
        if (r0 != null) {
            return r0.boolOverrideForParam(j, false);
        }
        return false;
    }

    public final double A00(long j) {
        AnonymousClass0TK r0 = this.A00;
        if (r0 != null) {
            return r0.doubleOverrideForParam(j, 0.0d);
        }
        return 0.0d;
    }

    public final long A01(long j) {
        AnonymousClass0TK r0 = this.A00;
        if (r0 != null) {
            return r0.intOverrideForParam(j, 0);
        }
        return 0;
    }

    public final String A02(long j) {
        AnonymousClass0TK r0 = this.A00;
        return r0 != null ? r0.stringOverrideForParam(j, "") : "";
    }

    public final void A03() {
        AnonymousClass0TK r0 = this.A00;
        if (r0 != null) {
            r0.removeAllOverrides();
        }
    }

    public final void A04(long j) {
        AnonymousClass0TK r0 = this.A00;
        if (r0 != null) {
            r0.removeOverrideForParam(j);
        }
    }

    public final void A05(long j, double d) {
        AnonymousClass0TK r0 = this.A00;
        if (r0 != null) {
            r0.updateOverrideForParam(j, d);
        }
    }

    public final void A06(long j, long j2) {
        AnonymousClass0TK r0 = this.A00;
        if (r0 != null) {
            r0.updateOverrideForParam(j, j2);
        }
    }

    public final void A07(long j, String str) {
        AnonymousClass0TK r0 = this.A00;
        if (r0 != null) {
            r0.updateOverrideForParam(j, str);
        }
    }

    public final void A08(long j, boolean z) {
        AnonymousClass0TK r0 = this.A00;
        if (r0 != null) {
            r0.updateOverrideForParam(j, z);
        }
    }

    public final boolean A0A(long j) {
        AnonymousClass0TK r0 = this.A00;
        if (r0 != null) {
            return r0.hasBoolOverrideForParam(j);
        }
        return false;
    }

    public final boolean A0B(long j) {
        AnonymousClass0TK r0 = this.A00;
        if (r0 != null) {
            return r0.hasDoubleOverrideForParam(j);
        }
        return false;
    }

    public final boolean A0C(long j) {
        AnonymousClass0TK r0 = this.A00;
        if (r0 != null) {
            return r0.hasIntOverrideForParam(j);
        }
        return false;
    }

    public final boolean A0D(long j) {
        AnonymousClass0TK r0 = this.A00;
        if (r0 != null) {
            return r0.hasStringOverrideForParam(j);
        }
        return false;
    }

    public AnonymousClass3Iy(AnonymousClass3Iv r2, C07810cE r3, C07810cE r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r2.getOrCreateOverridesTable();
    }
}
