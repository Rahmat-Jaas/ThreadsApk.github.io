package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0W3  reason: invalid class name */
public final class AnonymousClass0W3 {
    public int A00 = 0;
    public int A01 = -1;
    public int A02 = 0;
    public int A03 = 0;
    public String A04 = null;
    public ArrayList A05 = new ArrayList();
    public ArrayList A06 = new ArrayList();
    public List A07;
    public List A08;
    public byte[] A09 = new byte[20];
    public double[] A0A = new double[15];
    public long[] A0B = new long[15];

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c8, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00d7, code lost:
        r7 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d9, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00dc, code lost:
        r3 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00dd, code lost:
        if (r9 == false) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e0, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e1, code lost:
        r6 = r6 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String A02(java.lang.String r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            int r0 = r12.A03     // Catch:{ all -> 0x00e7 }
            r11 = 0
            if (r0 != 0) goto L_0x0008
            monitor-exit(r12)
            return r11
        L_0x0008:
            r0 = r11
            r6 = 0
            r7 = 0
            r3 = 0
            r10 = 0
        L_0x000d:
            int r1 = r12.A03     // Catch:{ all -> 0x00e7 }
            if (r6 >= r1) goto L_0x00e5
            java.util.ArrayList r1 = r12.A05     // Catch:{ all -> 0x00e7 }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x00e7 }
            boolean r9 = r13.equals(r1)     // Catch:{ all -> 0x00e7 }
            byte[] r2 = r12.A09     // Catch:{ all -> 0x00e7 }
            byte r1 = r2[r6]     // Catch:{ all -> 0x00e7 }
            switch(r1) {
                case 1: goto L_0x00cb;
                case 2: goto L_0x00ba;
                case 3: goto L_0x00ad;
                case 4: goto L_0x009c;
                case 5: goto L_0x008b;
                case 6: goto L_0x007a;
                case 7: goto L_0x0069;
                case 8: goto L_0x0054;
                case 9: goto L_0x0042;
                case 10: goto L_0x0030;
                default: goto L_0x0022;
            }     // Catch:{ all -> 0x00e7 }
        L_0x0022:
            java.lang.String r1 = "Unsupported type "
            byte r0 = r2[r6]     // Catch:{ all -> 0x00e7 }
            java.lang.String r1 = X.AnonymousClass00U.A0J(r1, r0)     // Catch:{ all -> 0x00e7 }
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x00e7 }
            r0.<init>(r1)     // Catch:{ all -> 0x00e7 }
            throw r0     // Catch:{ all -> 0x00e7 }
        L_0x0030:
            if (r9 == 0) goto L_0x00d9
            java.util.ArrayList r0 = r12.A06     // Catch:{ all -> 0x00e7 }
            int r1 = r7 + 1
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x00e7 }
            long[] r0 = (long[]) r0     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = X.AnonymousClass0W2.A02(r0)     // Catch:{ all -> 0x00e7 }
            goto L_0x00d7
        L_0x0042:
            if (r9 == 0) goto L_0x00d9
            java.util.ArrayList r0 = r12.A06     // Catch:{ all -> 0x00e7 }
            int r1 = r7 + 1
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x00e7 }
            boolean[] r0 = (boolean[]) r0     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = X.AnonymousClass0W2.A04(r0)     // Catch:{ all -> 0x00e7 }
            goto L_0x00d7
        L_0x0054:
            if (r9 == 0) goto L_0x00c8
            long[] r0 = r12.A0B     // Catch:{ all -> 0x00e7 }
            int r8 = r3 + 1
            r4 = r0[r3]     // Catch:{ all -> 0x00e7 }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 == 0) goto L_0x0064
            r0 = 1
        L_0x0064:
            java.lang.String r0 = java.lang.Boolean.toString(r0)     // Catch:{ all -> 0x00e7 }
            goto L_0x00dc
        L_0x0069:
            if (r9 == 0) goto L_0x00d9
            java.util.ArrayList r0 = r12.A06     // Catch:{ all -> 0x00e7 }
            int r1 = r7 + 1
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x00e7 }
            double[] r0 = (double[]) r0     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = X.AnonymousClass0W2.A00(r0)     // Catch:{ all -> 0x00e7 }
            goto L_0x00d7
        L_0x007a:
            if (r9 == 0) goto L_0x0088
            double[] r0 = r12.A0A     // Catch:{ all -> 0x00e7 }
            int r2 = r10 + 1
            r0 = r0[r10]     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = java.lang.Double.toString(r0)     // Catch:{ all -> 0x00e7 }
            r10 = r2
            goto L_0x00dd
        L_0x0088:
            int r10 = r10 + 1
            goto L_0x00dd
        L_0x008b:
            if (r9 == 0) goto L_0x00d9
            java.util.ArrayList r0 = r12.A06     // Catch:{ all -> 0x00e7 }
            int r1 = r7 + 1
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x00e7 }
            int[] r0 = (int[]) r0     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = X.AnonymousClass0W2.A01(r0)     // Catch:{ all -> 0x00e7 }
            goto L_0x00d7
        L_0x009c:
            if (r9 == 0) goto L_0x00d9
            java.util.ArrayList r0 = r12.A06     // Catch:{ all -> 0x00e7 }
            int r1 = r7 + 1
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x00e7 }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = X.AnonymousClass0W2.A03(r0)     // Catch:{ all -> 0x00e7 }
            goto L_0x00d7
        L_0x00ad:
            if (r9 == 0) goto L_0x00c8
            long[] r0 = r12.A0B     // Catch:{ all -> 0x00e7 }
            int r8 = r3 + 1
            r0 = r0[r3]     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x00e7 }
            goto L_0x00dc
        L_0x00ba:
            if (r9 == 0) goto L_0x00c8
            long[] r0 = r12.A0B     // Catch:{ all -> 0x00e7 }
            int r8 = r3 + 1
            r1 = r0[r3]     // Catch:{ all -> 0x00e7 }
            int r0 = (int) r1     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x00e7 }
            goto L_0x00dc
        L_0x00c8:
            int r3 = r3 + 1
            goto L_0x00dd
        L_0x00cb:
            if (r9 == 0) goto L_0x00d9
            java.util.ArrayList r0 = r12.A06     // Catch:{ all -> 0x00e7 }
            int r1 = r7 + 1
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00e7 }
        L_0x00d7:
            r7 = r1
            goto L_0x00dd
        L_0x00d9:
            int r7 = r7 + 1
            goto L_0x00dd
        L_0x00dc:
            r3 = r8
        L_0x00dd:
            if (r9 == 0) goto L_0x00e1
            monitor-exit(r12)
            return r0
        L_0x00e1:
            int r6 = r6 + 1
            goto L_0x000d
        L_0x00e5:
            monitor-exit(r12)
            return r11
        L_0x00e7:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0W3.A02(java.lang.String):java.lang.String");
    }

    public final synchronized List A03() {
        ArrayList arrayList;
        int i;
        String str;
        int i2;
        List list = this.A08;
        arrayList = list;
        if (list == null) {
            int i3 = this.A03;
            if (i3 == 0) {
                arrayList = Collections.emptyList();
            } else {
                ArrayList arrayList2 = new ArrayList(i3 << 1);
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (i4 < this.A03) {
                    byte[] bArr = this.A09;
                    switch (bArr[i4]) {
                        case 1:
                            i = i5 + 1;
                            str = (String) this.A06.get(i5);
                            continue;
                        case 2:
                            i2 = i6 + 1;
                            str = Integer.toString((int) this.A0B[i6]);
                            break;
                        case 3:
                            i2 = i6 + 1;
                            str = Long.toString(this.A0B[i6]);
                            break;
                        case 4:
                            i = i5 + 1;
                            str = AnonymousClass0W2.A03((String[]) this.A06.get(i5));
                            continue;
                        case 5:
                            i = i5 + 1;
                            str = AnonymousClass0W2.A01((int[]) this.A06.get(i5));
                            continue;
                        case 6:
                            str = Double.toString(this.A0A[i7]);
                            i = i5;
                            i7++;
                            continue;
                        case 7:
                            i = i5 + 1;
                            str = AnonymousClass0W2.A00((double[]) this.A06.get(i5));
                            continue;
                        case 8:
                            i2 = i6 + 1;
                            boolean z = false;
                            if (this.A0B[i6] != 0) {
                                z = true;
                            }
                            str = Boolean.toString(z);
                            break;
                        case 9:
                            i = i5 + 1;
                            str = AnonymousClass0W2.A04((boolean[]) this.A06.get(i5));
                            continue;
                        case 10:
                            i = i5 + 1;
                            str = AnonymousClass0W2.A02((long[]) this.A06.get(i5));
                            continue;
                        default:
                            throw new UnsupportedOperationException(AnonymousClass00U.A0J("Unsupported type ", bArr[i4]));
                    }
                    i = i5;
                    i6 = i2;
                    arrayList2.add((String) this.A05.get(i4));
                    arrayList2.add(str);
                    i4++;
                    i5 = i;
                }
                this.A08 = arrayList2;
                arrayList = arrayList2;
            }
        }
        return arrayList;
    }

    public static void A00(AnonymousClass0W3 r5, byte b) {
        int i = r5.A03;
        byte[] bArr = r5.A09;
        int length = bArr.length;
        if (i == length) {
            bArr = Arrays.copyOf(bArr, (int) (((double) length) * 1.4d));
            r5.A09 = bArr;
        }
        int i2 = r5.A03;
        r5.A03 = i2 + 1;
        bArr[i2] = b;
    }

    public static void A01(AnonymousClass0W3 r5, long j) {
        int i = r5.A02;
        long[] jArr = r5.A0B;
        int length = jArr.length;
        if (i == length) {
            jArr = Arrays.copyOf(jArr, (int) (((double) length) * 1.4d));
            r5.A0B = jArr;
        }
        int i2 = r5.A02;
        r5.A02 = i2 + 1;
        jArr[i2] = j;
    }
}
