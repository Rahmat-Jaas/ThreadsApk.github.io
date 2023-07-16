package X;

/* renamed from: X.0A6  reason: invalid class name */
public final class AnonymousClass0A6 extends AnonymousClass0DW {
    public final C002000x A00 = new C002000x();
    public final C002000x A01 = new C002000x();

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass0A6 r5 = (AnonymousClass0A6) obj;
            if (!AnonymousClass0DZ.A01(this.A01, r5.A01) || !AnonymousClass0DZ.A01(this.A00, r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A01(AnonymousClass0DW r1) {
        A05((AnonymousClass0A6) r1);
        return this;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A02(AnonymousClass0DW r1, AnonymousClass0DW r2) {
        AnonymousClass0A6 r22 = (AnonymousClass0A6) r2;
        A06((AnonymousClass0A6) r1, r22);
        return r22;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A03(AnonymousClass0DW r8, AnonymousClass0DW r9) {
        boolean z;
        AnonymousClass0DW A04;
        AnonymousClass0DW A042;
        AnonymousClass0A6 r82 = (AnonymousClass0A6) r8;
        AnonymousClass0A6 r92 = (AnonymousClass0A6) r9;
        if (r92 != null) {
            if (r82 == null) {
                r92.A05(this);
            } else {
                C002000x r6 = this.A00;
                int size = r6.size();
                for (int i = 0; i < size; i++) {
                    Class cls = (Class) r6.A02[i << 1];
                    if (!A08(cls) || !r82.A08(cls)) {
                        if (A08(cls)) {
                            A04 = r92.A04(cls);
                            A042 = A04(cls);
                        } else if (r82.A08(cls)) {
                            A04 = r92.A04(cls);
                            A042 = r82.A04(cls);
                        } else {
                            z = false;
                            r92.A07(cls, z);
                        }
                        A04.A01(A042);
                    } else {
                        AnonymousClass0DW A043 = r92.A04(cls);
                        if (A043 != null) {
                            A04(cls).A03(r82.A04(cls), A043);
                        }
                    }
                    z = true;
                    r92.A07(cls, z);
                }
            }
            return r92;
        }
        throw new IllegalArgumentException("CompositeMetrics doesn't support nullable results");
    }

    public final AnonymousClass0DW A04(Class cls) {
        return (AnonymousClass0DW) cls.cast(this.A00.get(cls));
    }

    public final void A05(AnonymousClass0A6 r8) {
        C002000x r6 = this.A00;
        int size = r6.size();
        for (int i = 0; i < size; i++) {
            Class cls = (Class) r6.A02[i << 1];
            AnonymousClass0DW A04 = r8.A04(cls);
            if (A04 != null) {
                A04(cls).A01(A04);
                A07(cls, r8.A08(cls));
            } else {
                A07(cls, false);
            }
        }
    }

    public final void A06(AnonymousClass0A6 r9, AnonymousClass0A6 r10) {
        boolean z;
        if (r10 == null) {
            throw new IllegalArgumentException("CompositeMetrics doesn't support nullable results");
        } else if (r9 == null) {
            r10.A05(this);
        } else {
            C002000x r7 = this.A00;
            int size = r7.size();
            for (int i = 0; i < size; i++) {
                Class cls = (Class) r7.A02[i << 1];
                if (!A08(cls) || !r9.A08(cls)) {
                    z = false;
                } else {
                    z = true;
                    AnonymousClass0DW A04 = r10.A04(cls);
                    if (A04 != null) {
                        A04(cls).A02(r9.A04(cls), A04);
                    }
                }
                r10.A07(cls, z);
            }
        }
    }

    public final void A07(Class cls, boolean z) {
        Boolean bool;
        C002000x r1 = this.A01;
        if (z) {
            bool = Boolean.TRUE;
        } else {
            bool = Boolean.FALSE;
        }
        r1.put(cls, bool);
    }

    public final boolean A08(Class cls) {
        Boolean bool = (Boolean) this.A01.get(cls);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Composite Metrics{\n");
        C002000x r5 = this.A00;
        int size = r5.size();
        for (int i = 0; i < size; i++) {
            int i2 = i << 1;
            sb.append(r5.A02[i2 + 1]);
            if (A08((Class) r5.A02[i2])) {
                str = " [valid]";
            } else {
                str = " [invalid]";
            }
            sb.append(str);
            sb.append(10);
        }
        sb.append("}");
        return sb.toString();
    }
}
