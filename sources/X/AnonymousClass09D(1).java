package X;

/* renamed from: X.09D  reason: invalid class name */
public final class AnonymousClass09D extends AnonymousClass0DW {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public boolean A04;
    public final C002000x A05;

    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                AnonymousClass09D r10 = (AnonymousClass09D) obj;
                if (this.A04 == r10.A04 && this.A01 == r10.A01 && this.A02 == r10.A02 && this.A00 == r10.A00 && this.A03 == r10.A03) {
                    C002000x r6 = this.A05;
                    int size = r6.size();
                    C002000x r4 = r10.A05;
                    if (size == r4.size()) {
                        int i = 0;
                        while (i < size) {
                            Object[] objArr = r6.A02;
                            int i2 = i << 1;
                            Object obj2 = objArr[i2];
                            Object obj3 = objArr[i2 + 1];
                            Object obj4 = r4.get(obj2);
                            if (obj3 != null) {
                                equals = obj3.equals(obj4);
                            } else if (obj4 == null) {
                                equals = r4.containsKey(obj2);
                            }
                            if (equals) {
                                i++;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A01(AnonymousClass0DW r1) {
        A04((AnonymousClass09D) r1);
        return this;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A02(AnonymousClass0DW r12, AnonymousClass0DW r13) {
        long j;
        AnonymousClass09D r122 = (AnonymousClass09D) r12;
        AnonymousClass09D r132 = (AnonymousClass09D) r13;
        if (r132 == null) {
            r132 = new AnonymousClass09D(this.A04);
        }
        if (r122 == null) {
            r132.A04(this);
        } else {
            r132.A03 = this.A03 - r122.A03;
            r132.A01 = this.A01 - r122.A01;
            r132.A00 = this.A00 - r122.A00;
            r132.A02 = this.A02 - r122.A02;
            if (r132.A04) {
                C002000x r9 = this.A05;
                int size = r9.size();
                for (int i = 0; i < size; i++) {
                    int i2 = i << 1;
                    Object obj = r9.A02[i2];
                    C02850Dd r6 = (C02850Dd) r122.A05.get(obj);
                    C02850Dd r5 = (C02850Dd) r9.A02[i2 + 1];
                    C02850Dd r4 = new C02850Dd();
                    if (r6 == null) {
                        r4.A00 = r5.A00;
                        r4.A02 = r5.A02;
                        j = r5.A01;
                    } else {
                        r4.A00 = r5.A00 - r6.A00;
                        r4.A02 = r5.A02 - r6.A02;
                        j = r5.A01 - r6.A01;
                    }
                    r4.A01 = j;
                    r132.A05.put(obj, r4);
                }
            }
        }
        return r132;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A03(AnonymousClass0DW r14, AnonymousClass0DW r15) {
        long j;
        AnonymousClass09D r142 = (AnonymousClass09D) r14;
        AnonymousClass09D r152 = (AnonymousClass09D) r15;
        if (r152 == null) {
            r152 = new AnonymousClass09D(this.A04);
        }
        if (r142 == null) {
            r152.A04(this);
        } else {
            r152.A03 = this.A03 + r142.A03;
            r152.A01 = this.A01 + r142.A01;
            r152.A00 = this.A00 + r142.A00;
            r152.A02 = this.A02 + r142.A02;
            if (r152.A04) {
                C002000x r9 = this.A05;
                int size = r9.size();
                for (int i = 0; i < size; i++) {
                    int i2 = i << 1;
                    Object obj = r9.A02[i2];
                    C02850Dd r7 = (C02850Dd) r142.A05.get(obj);
                    C002000x r11 = r152.A05;
                    C02850Dd r6 = (C02850Dd) r9.A02[i2 + 1];
                    C02850Dd r4 = new C02850Dd();
                    long j2 = r6.A00;
                    if (r7 == null) {
                        r4.A00 = j2;
                        r4.A02 = r6.A02;
                        j = r6.A01;
                    } else {
                        r4.A00 = j2 + r7.A00;
                        r4.A02 = r6.A02 + r7.A02;
                        j = r6.A01 + r7.A01;
                    }
                    r4.A01 = j;
                    r11.put(obj, r4);
                }
                C002000x r62 = r142.A05;
                int size2 = r62.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Object obj2 = r62.A02[i3 << 1];
                    if (r9.get(obj2) == null) {
                        r152.A05.put(obj2, r62.A02[(i3 << 1) + 1]);
                    }
                }
            }
        }
        return r152;
    }

    public final void A04(AnonymousClass09D r10) {
        this.A03 = r10.A03;
        this.A01 = r10.A01;
        this.A02 = r10.A02;
        this.A00 = r10.A00;
        if (r10.A04 && this.A04) {
            C002000x r6 = this.A05;
            int size = r6.size();
            for (int i = 0; i < size; i++) {
                Object obj = r6.A02[i << 1];
                C002000x r8 = r10.A05;
                if (!r8.containsKey(obj)) {
                    r6.A06(i);
                } else {
                    int i2 = (i << 1) + 1;
                    C02850Dd r3 = (C02850Dd) r6.A02[i2];
                    C02850Dd r2 = (C02850Dd) r8.A02[i2];
                    r3.A00 = r2.A00;
                    r3.A02 = r2.A02;
                    r3.A01 = r2.A01;
                }
            }
            C002000x r4 = r10.A05;
            int size2 = r4.size();
            for (int i3 = 0; i3 < size2; i3++) {
                Object[] objArr = r4.A02;
                int i4 = i3 << 1;
                Object obj2 = objArr[i4];
                C02850Dd r1 = (C02850Dd) objArr[i4 + 1];
                if (!r6.containsKey(obj2)) {
                    r6.put(obj2, new C02850Dd(r1));
                }
            }
        }
    }

    public final int hashCode() {
        long j = this.A03;
        long j2 = this.A00;
        long j3 = this.A02;
        long j4 = this.A01;
        return (((((((((this.A05.hashCode() * 31) + (this.A04 ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocationMetrics{wifiScanCount=");
        sb.append(this.A03);
        sb.append(", isAttributionEnabled=");
        sb.append(this.A04);
        sb.append(", tagLocationDetails=");
        sb.append(this.A05);
        sb.append(", fineTimeMs=");
        sb.append(this.A01);
        sb.append(", mediumTimeMs=");
        sb.append(this.A02);
        sb.append(", coarseTimeMs=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }

    public AnonymousClass09D(boolean z) {
        this.A05 = new C002000x();
        this.A04 = z;
    }

    public AnonymousClass09D() {
        this(true);
    }
}
