package X;

import java.util.List;

/* renamed from: X.011  reason: invalid class name */
public final class AnonymousClass011 implements Comparable {
    public List A00;
    public List A01;
    public List A02;
    public List A03;
    public final int A04;
    public final int A05;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r0 != null) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x005e
            r2 = 0
            if (r5 == 0) goto L_0x0026
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x0026
            X.011 r5 = (X.AnonymousClass011) r5
            int r1 = r4.A05
            int r0 = r5.A05
            if (r1 != r0) goto L_0x0026
            int r1 = r4.A04
            int r0 = r5.A04
            if (r1 != r0) goto L_0x0026
            java.util.List r1 = r4.A02
            java.util.List r0 = r5.A02
            if (r1 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002e
        L_0x0026:
            return r2
        L_0x0027:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x002e
            return r2
        L_0x002e:
            java.util.List r1 = r4.A03
            java.util.List r0 = r5.A03
            if (r1 != 0) goto L_0x0037
            if (r0 == 0) goto L_0x003e
            return r2
        L_0x0037:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x003e
            return r2
        L_0x003e:
            java.util.List r1 = r4.A00
            java.util.List r0 = r5.A00
            if (r1 != 0) goto L_0x0047
            if (r0 == 0) goto L_0x004e
            return r2
        L_0x0047:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x004e
            return r2
        L_0x004e:
            java.util.List r1 = r4.A01
            java.util.List r0 = r5.A01
            if (r1 != 0) goto L_0x0057
            if (r0 == 0) goto L_0x005e
            return r2
        L_0x0057:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x005e
            return r2
        L_0x005e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass011.equals(java.lang.Object):boolean");
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        AnonymousClass011 r3 = (AnonymousClass011) obj;
        int i = this.A05;
        int i2 = r3.A05;
        if (i == i2 && (i = this.A04) == (i2 = r3.A04)) {
            return 0;
        }
        if (i < i2) {
            return -1;
        }
        return 1;
    }

    public final int hashCode() {
        int i = ((217 + this.A05) * 31) + this.A04;
        List list = this.A02;
        if (list != null) {
            i = (i * 31) + list.hashCode();
        }
        List list2 = this.A03;
        if (list2 != null) {
            i = (i * 31) + list2.hashCode();
        }
        List list3 = this.A00;
        if (list3 != null) {
            i = (i * 31) + list3.hashCode();
        }
        List list4 = this.A01;
        if (list4 != null) {
            return (i * 31) + list4.hashCode();
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarkerRecord{markerId=");
        sb.append(this.A05);
        sb.append(", instanceKey=");
        sb.append(this.A04);
        sb.append(", strAnnotationKeys=");
        sb.append(this.A02);
        sb.append(", strAnnotationValues=");
        sb.append(this.A03);
        sb.append(", intAnnotationKeys=");
        sb.append(this.A00);
        sb.append(", intAnnotationValues=");
        sb.append(this.A01);
        sb.append('}');
        return sb.toString();
    }

    public AnonymousClass011(int i, int i2) {
        this.A05 = i;
        this.A04 = i2;
    }
}
