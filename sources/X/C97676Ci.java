package X;

import java.math.BigDecimal;

/* renamed from: X.6Ci  reason: invalid class name and case insensitive filesystem */
public final class C97676Ci extends Number {
    public final String A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C97676Ci)) {
            return false;
        }
        String str = this.A00;
        String str2 = ((C97676Ci) obj).A00;
        return str == str2 || str.equals(str2);
    }

    public final double doubleValue() {
        return Double.parseDouble(this.A00);
    }

    public final float floatValue() {
        return Float.parseFloat(this.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r3.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        return new java.math.BigDecimal(r3.A00).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int intValue() {
        /*
            r3 = this;
            java.lang.String r0 = r3.A00     // Catch:{ NumberFormatException -> 0x0007 }
            int r2 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r2
        L_0x0007:
            java.lang.String r0 = r3.A00     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r2 = (int) r0     // Catch:{ NumberFormatException -> 0x000f }
            return r2
        L_0x000f:
            java.lang.String r1 = r3.A00
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97676Ci.intValue():int");
    }

    public final long longValue() {
        try {
            return Long.parseLong(this.A00);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.A00).longValue();
        }
    }

    public final String toString() {
        return this.A00;
    }

    public C97676Ci(String str) {
        this.A00 = str;
    }
}
