package X;

import org.json.JSONObject;

/* renamed from: X.076  reason: invalid class name */
public final class AnonymousClass076 extends AnonymousClass0DW {
    public long A00;
    public long A01;
    public boolean A02;
    public final C002000x A03;

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A01(AnonymousClass0DW r1) {
        A05((AnonymousClass076) r1);
        return this;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A02(AnonymousClass0DW r13, AnonymousClass0DW r14) {
        long longValue;
        AnonymousClass076 r132 = (AnonymousClass076) r13;
        AnonymousClass076 r142 = (AnonymousClass076) r14;
        if (r142 == null) {
            r142 = new AnonymousClass076(this.A02);
        }
        if (r132 == null) {
            r142.A05(this);
        } else {
            r142.A01 = this.A01 - r132.A01;
            r142.A00 = this.A00 - r132.A00;
            if (r142.A02) {
                C002000x r10 = r142.A03;
                r10.clear();
                C002000x r8 = this.A03;
                int size = r8.size();
                for (int i = 0; i < size; i++) {
                    int i2 = i << 1;
                    Object obj = r8.A02[i2];
                    Number number = (Number) r132.A03.get(obj);
                    long longValue2 = ((Number) r8.A02[i2 + 1]).longValue();
                    if (number == null) {
                        longValue = 0;
                    } else {
                        longValue = number.longValue();
                    }
                    long j = longValue2 - longValue;
                    if (j != 0) {
                        r10.put(obj, Long.valueOf(j));
                    }
                }
            }
        }
        return r142;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0DW A03(AnonymousClass0DW r12, AnonymousClass0DW r13) {
        long longValue;
        AnonymousClass076 r122 = (AnonymousClass076) r12;
        AnonymousClass076 r132 = (AnonymousClass076) r13;
        if (r132 == null) {
            r132 = new AnonymousClass076(this.A02);
        }
        if (r122 == null) {
            r132.A05(this);
        } else {
            r132.A01 = this.A01 + r122.A01;
            r132.A00 = this.A00 + r122.A00;
            if (r132.A02) {
                C002000x r7 = r132.A03;
                r7.clear();
                C002000x r6 = this.A03;
                int size = r6.size();
                for (int i = 0; i < size; i++) {
                    int i2 = i << 1;
                    Object obj = r6.A02[i2];
                    Number number = (Number) r122.A03.get(obj);
                    long longValue2 = ((Number) r6.A02[i2 + 1]).longValue();
                    if (number == null) {
                        longValue = 0;
                    } else {
                        longValue = number.longValue();
                    }
                    r7.put(obj, Long.valueOf(longValue2 + longValue));
                }
                C002000x r4 = r122.A03;
                int size2 = r4.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    Object obj2 = r4.A02[i3 << 1];
                    if (r6.get(obj2) == null) {
                        r7.put(obj2, r4.A02[(i3 << 1) + 1]);
                    }
                }
            }
        }
        return r132;
    }

    public final JSONObject A04() {
        if (!this.A02) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        C002000x r7 = this.A03;
        int size = r7.size();
        for (int i = 0; i < size; i++) {
            Object[] objArr = r7.A02;
            long longValue = ((Number) objArr[(i << 1) + 1]).longValue();
            if (longValue > 0) {
                jSONObject.put((String) objArr[i << 1], longValue);
            }
        }
        return jSONObject;
    }

    public final void A05(AnonymousClass076 r3) {
        this.A01 = r3.A01;
        this.A00 = r3.A00;
        if (r3.A02 && this.A02) {
            C002000x r1 = this.A03;
            r1.clear();
            r1.A08(r3.A03);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AnonymousClass076 r7 = (AnonymousClass076) obj;
            if (this.A02 == r7.A02 && this.A01 == r7.A01 && this.A00 == r7.A00) {
                return AnonymousClass0DZ.A01(this.A03, r7.A03);
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.A01;
        long j2 = this.A00;
        return ((((((this.A02 ? 1 : 0) * true) + this.A03.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WakeLockMetrics{isAttributionEnabled=");
        sb.append(this.A02);
        sb.append(", tagTimeMs=");
        sb.append(this.A03);
        sb.append(", heldTimeMs=");
        sb.append(this.A01);
        sb.append(", acquiredCount=");
        sb.append(this.A00);
        sb.append('}');
        return sb.toString();
    }

    public AnonymousClass076(boolean z) {
        this.A03 = new C002000x();
        this.A02 = z;
    }

    public AnonymousClass076() {
        this(false);
    }
}
