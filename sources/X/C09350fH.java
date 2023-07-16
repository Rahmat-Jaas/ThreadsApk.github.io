package X;

import com.facebook.common.util.TriState;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.0fH  reason: invalid class name and case insensitive filesystem */
public final class C09350fH implements Runnable, C05800Wc {
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E = -1;
    public TriState A0F;
    public AnonymousClass0WF A0G;
    public AnonymousClass0WO A0H;
    public AnonymousClass0Jz A0I;
    public AnonymousClass0Jz A0J;
    public C14900qN A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public short A0O;
    public short A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public int A0X;
    public AnonymousClass0WN A0Y;
    public final AnonymousClass0W3 A0Z = new AnonymousClass0W3();
    public final ArrayList A0a = new ArrayList();

    public static C09350fH A00(TimeUnit timeUnit, int i, int i2, int i3, int i4, int i5, long j, boolean z, boolean z2) {
        C09350fH r2 = new C09350fH();
        r2.A03 = i;
        r2.A02 = i2;
        r2.A0B = timeUnit.toNanos(j);
        r2.A0W = z;
        r2.A07 = i3;
        r2.A01 = i4;
        r2.A0T = z2;
        r2.A08 = 0;
        r2.A0A = timeUnit.toNanos(j);
        r2.A06 = i5;
        return r2;
    }

    public final void A01(AnonymousClass0WQ r6, AnonymousClass0Jz r7, String str, TimeUnit timeUnit, int i, long j) {
        AnonymousClass0WF r4 = this.A0G;
        if (r4 == null) {
            r4 = new AnonymousClass0WF();
            this.A0G = r4;
        }
        int i2 = r4.A00;
        r4.A00 = i2 + 1;
        long[] jArr = r4.A02;
        if (i2 == jArr.length) {
            int i3 = (i2 >> 1) + i2;
            r4.A02 = Arrays.copyOf(jArr, i3);
            r4.A05 = (String[]) Arrays.copyOf(r4.A05, i3);
            r4.A03 = (AnonymousClass0WQ[]) Arrays.copyOf(r4.A03, i3);
            r4.A01 = Arrays.copyOf(r4.A01, i3);
            r4.A04 = (AnonymousClass0Jz[]) Arrays.copyOf(r4.A04, i3);
        }
        if (r6 == null || r6.A03) {
            r4.A02[i2] = timeUnit.toNanos(j);
            r4.A05[i2] = str;
            r4.A03[i2] = r6;
            r4.A01[i2] = i;
            r4.A04[i2] = r7;
            this.A0A = this.A0B + j;
            return;
        }
        throw new IllegalStateException("PointData should be locked before passing to the storage");
    }

    public final void A02(String str, double d) {
        AnonymousClass0W3 r5 = this.A0Z;
        synchronized (r5) {
            r5.A08 = null;
            r5.A07 = null;
            r5.A05.add(str);
            int i = r5.A00;
            double[] dArr = r5.A0A;
            int length = dArr.length;
            if (i == length) {
                dArr = Arrays.copyOf(dArr, (int) (((double) length) * 1.4d));
                r5.A0A = dArr;
            }
            int i2 = r5.A00;
            r5.A00 = i2 + 1;
            dArr[i2] = d;
            AnonymousClass0W3.A00(r5, (byte) 6);
        }
    }

    public final void A03(String str, int i) {
        AnonymousClass0W3 r2 = this.A0Z;
        synchronized (r2) {
            r2.A08 = null;
            r2.A07 = null;
            r2.A05.add(str);
            AnonymousClass0W3.A01(r2, (long) i);
            AnonymousClass0W3.A00(r2, (byte) 2);
        }
    }

    public final void A04(String str, long j) {
        AnonymousClass0W3 r1 = this.A0Z;
        synchronized (r1) {
            r1.A08 = null;
            r1.A07 = null;
            r1.A05.add(str);
            AnonymousClass0W3.A01(r1, j);
            AnonymousClass0W3.A00(r1, (byte) 3);
        }
    }

    public final void A05(String str, boolean z) {
        long j;
        AnonymousClass0W3 r2 = this.A0Z;
        synchronized (r2) {
            r2.A08 = null;
            r2.A07 = null;
            r2.A05.add(str);
            if (z) {
                j = 1;
            } else {
                j = 0;
            }
            AnonymousClass0W3.A01(r2, j);
            AnonymousClass0W3.A00(r2, (byte) 8);
        }
    }

    public final void A06(String str, double[] dArr) {
        AnonymousClass0W3 r2 = this.A0Z;
        synchronized (r2) {
            r2.A08 = null;
            r2.A07 = null;
            r2.A05.add(str);
            r2.A06.add(Arrays.copyOf(dArr, dArr.length));
            AnonymousClass0W3.A00(r2, (byte) 7);
        }
    }

    public final void A07(String str, int[] iArr) {
        AnonymousClass0W3 r2 = this.A0Z;
        synchronized (r2) {
            r2.A08 = null;
            r2.A07 = null;
            r2.A05.add(str);
            r2.A06.add(Arrays.copyOf(iArr, iArr.length));
            AnonymousClass0W3.A00(r2, (byte) 5);
        }
    }

    public final void A08(String str, long[] jArr) {
        AnonymousClass0W3 r2 = this.A0Z;
        synchronized (r2) {
            r2.A08 = null;
            r2.A07 = null;
            r2.A05.add(str);
            r2.A06.add(Arrays.copyOf(jArr, jArr.length));
            AnonymousClass0W3.A00(r2, (byte) 10);
        }
    }

    public final void A09(String str, String[] strArr) {
        AnonymousClass0W3 r2 = this.A0Z;
        synchronized (r2) {
            r2.A08 = null;
            r2.A07 = null;
            r2.A05.add(str);
            r2.A06.add(Arrays.copyOf(strArr, strArr.length));
            AnonymousClass0W3.A00(r2, (byte) 4);
        }
    }

    public final void A0A(String str, boolean[] zArr) {
        AnonymousClass0W3 r2 = this.A0Z;
        synchronized (r2) {
            r2.A08 = null;
            r2.A07 = null;
            r2.A05.add(str);
            r2.A06.add(Arrays.copyOf(zArr, zArr.length));
            AnonymousClass0W3.A00(r2, (byte) 9);
        }
    }

    public final void A8X(String str, String str2) {
        AnonymousClass0W3 r1 = this.A0Z;
        synchronized (r1) {
            r1.A08 = null;
            r1.A07 = null;
            r1.A05.add(str);
            r1.A06.add(str2);
            AnonymousClass0W3.A00(r1, (byte) 1);
        }
    }

    public final String AQn(String str) {
        return this.A0Z.A02(str);
    }

    public final int AeK() {
        return (int) TimeUnit.NANOSECONDS.toMillis(this.A08);
    }

    public final List Ago() {
        return this.A0Z.A03();
    }

    public final List Agw() {
        ArrayList arrayList;
        AnonymousClass0W3 r4 = this.A0Z;
        synchronized (r4) {
            List list = r4.A07;
            arrayList = list;
            if (list == null) {
                int i = r4.A03;
                if (i == 0) {
                    arrayList = Collections.emptyList();
                } else {
                    ArrayList arrayList2 = new ArrayList(i);
                    for (int i2 = 0; i2 < i; i2++) {
                        arrayList2.add(Integer.valueOf(r4.A09[i2]));
                    }
                    r4.A07 = arrayList2;
                    arrayList = arrayList2;
                }
            }
        }
        return arrayList;
    }

    public final boolean AlE() {
        return this.A0F.asBoolean(false);
    }

    public final String Ar4() {
        String str;
        AnonymousClass0W3 r2 = this.A0Z;
        synchronized (r2) {
            ArrayList arrayList = r2.A05;
            str = (String) arrayList.get(arrayList.size() - 1);
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cf, code lost:
        r3.A04 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String Ar5() {
        /*
            r7 = this;
            X.0W3 r3 = r7.A0Z
            monitor-enter(r3)
            int r2 = r3.A03     // Catch:{ all -> 0x00dd }
            r6 = 1
            int r1 = r2 - r6
            if (r1 < 0) goto L_0x00d5
            int r0 = r3.A01     // Catch:{ all -> 0x00dd }
            if (r1 != r0) goto L_0x0014
            java.lang.String r0 = r3.A04     // Catch:{ all -> 0x00dd }
            if (r0 == 0) goto L_0x0014
            goto L_0x00d1
        L_0x0014:
            r3.A01 = r1     // Catch:{ all -> 0x00dd }
            byte[] r1 = r3.A09     // Catch:{ all -> 0x00d3 }
            int r0 = r2 + -1
            byte r2 = r1[r0]     // Catch:{ all -> 0x00d3 }
            switch(r2) {
                case 1: goto L_0x002e;
                case 2: goto L_0x003d;
                case 3: goto L_0x004b;
                case 4: goto L_0x0057;
                case 5: goto L_0x0069;
                case 6: goto L_0x007b;
                case 7: goto L_0x0087;
                case 8: goto L_0x0099;
                case 9: goto L_0x00ac;
                case 10: goto L_0x00be;
                default: goto L_0x001f;
            }     // Catch:{ all -> 0x00d3 }
        L_0x001f:
            java.lang.String r1 = "Type "
            java.lang.String r0 = " is not supported yet"
            java.lang.String r0 = X.AnonymousClass00U.A0S(r1, r0, r2)     // Catch:{ all -> 0x00dd }
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x00dd }
            r1.<init>(r0)     // Catch:{ all -> 0x00dd }
            goto L_0x00dc
        L_0x002e:
            java.util.ArrayList r1 = r3.A06     // Catch:{ all -> 0x00dd }
            int r0 = r1.size()     // Catch:{ all -> 0x00dd }
            int r0 = r0 - r6
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00dd }
            goto L_0x00cf
        L_0x003d:
            long[] r1 = r3.A0B     // Catch:{ all -> 0x00dd }
            int r0 = r3.A02     // Catch:{ all -> 0x00dd }
            int r0 = r0 - r6
            r1 = r1[r0]     // Catch:{ all -> 0x00dd }
            int r0 = (int) r1     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x00dd }
            goto L_0x00cf
        L_0x004b:
            long[] r1 = r3.A0B     // Catch:{ all -> 0x00dd }
            int r0 = r3.A02     // Catch:{ all -> 0x00dd }
            int r0 = r0 - r6
            r0 = r1[r0]     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x00dd }
            goto L_0x00cf
        L_0x0057:
            java.util.ArrayList r1 = r3.A06     // Catch:{ all -> 0x00dd }
            int r0 = r1.size()     // Catch:{ all -> 0x00dd }
            int r0 = r0 - r6
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00dd }
            java.lang.String[] r0 = (java.lang.String[]) r0     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = X.AnonymousClass0W2.A03(r0)     // Catch:{ all -> 0x00dd }
            goto L_0x00cf
        L_0x0069:
            java.util.ArrayList r1 = r3.A06     // Catch:{ all -> 0x00dd }
            int r0 = r1.size()     // Catch:{ all -> 0x00dd }
            int r0 = r0 - r6
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00dd }
            int[] r0 = (int[]) r0     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = X.AnonymousClass0W2.A01(r0)     // Catch:{ all -> 0x00dd }
            goto L_0x00cf
        L_0x007b:
            double[] r1 = r3.A0A     // Catch:{ all -> 0x00dd }
            int r0 = r3.A00     // Catch:{ all -> 0x00dd }
            int r0 = r0 - r6
            r0 = r1[r0]     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = java.lang.Double.toString(r0)     // Catch:{ all -> 0x00dd }
            goto L_0x00cf
        L_0x0087:
            java.util.ArrayList r1 = r3.A06     // Catch:{ all -> 0x00dd }
            int r0 = r1.size()     // Catch:{ all -> 0x00dd }
            int r0 = r0 - r6
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00dd }
            double[] r0 = (double[]) r0     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = X.AnonymousClass0W2.A00(r0)     // Catch:{ all -> 0x00dd }
            goto L_0x00cf
        L_0x0099:
            long[] r1 = r3.A0B     // Catch:{ all -> 0x00dd }
            int r0 = r3.A02     // Catch:{ all -> 0x00dd }
            int r0 = r0 - r6
            r4 = r1[r0]     // Catch:{ all -> 0x00dd }
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00a7
            r6 = 0
        L_0x00a7:
            java.lang.String r0 = java.lang.Boolean.toString(r6)     // Catch:{ all -> 0x00dd }
            goto L_0x00cf
        L_0x00ac:
            java.util.ArrayList r1 = r3.A06     // Catch:{ all -> 0x00dd }
            int r0 = r1.size()     // Catch:{ all -> 0x00dd }
            int r0 = r0 - r6
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00dd }
            boolean[] r0 = (boolean[]) r0     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = X.AnonymousClass0W2.A04(r0)     // Catch:{ all -> 0x00dd }
            goto L_0x00cf
        L_0x00be:
            java.util.ArrayList r1 = r3.A06     // Catch:{ all -> 0x00dd }
            int r0 = r1.size()     // Catch:{ all -> 0x00dd }
            int r0 = r0 - r6
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00dd }
            long[] r0 = (long[]) r0     // Catch:{ all -> 0x00dd }
            java.lang.String r0 = X.AnonymousClass0W2.A02(r0)     // Catch:{ all -> 0x00dd }
        L_0x00cf:
            r3.A04 = r0     // Catch:{ all -> 0x00dd }
        L_0x00d1:
            monitor-exit(r3)
            return r0
        L_0x00d3:
            r1 = move-exception
            goto L_0x00dc
        L_0x00d5:
            java.lang.String r0 = "Attempting to get last annotation value from empty list"
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException     // Catch:{ all -> 0x00dd }
            r1.<init>(r0)     // Catch:{ all -> 0x00dd }
        L_0x00dc:
            throw r1     // Catch:{ all -> 0x00dd }
        L_0x00dd:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09350fH.Ar5():java.lang.String");
    }

    public final long ArC() {
        return TimeUnit.NANOSECONDS.toMillis(this.A0A);
    }

    public final int AtU() {
        if ((this.A01 & 2) > 0) {
            return 2;
        }
        return 1;
    }

    public final AnonymousClass0WN AvU() {
        AnonymousClass0WN r0 = this.A0Y;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass0WN r02 = new AnonymousClass0WN();
        this.A0Y = r02;
        return r02;
    }

    public final long AwQ() {
        return TimeUnit.NANOSECONDS.toMillis(this.A0B);
    }

    public final boolean B5X() {
        if (((1 << this.A0X) & this.A04) <= 0) {
            return false;
        }
        return true;
    }

    public final String BFV() {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayList = this.A0a;
        int size = arrayList.size();
        for (String append : arrayList) {
            sb.append(append);
            if (size > 1) {
                sb.append(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1);
            }
            size--;
        }
        return sb.toString();
    }

    public final boolean BNh() {
        if (this.A09 != 0) {
            return true;
        }
        return false;
    }

    public final boolean BSF() {
        if ((this.A01 & 1) <= 0) {
            return false;
        }
        return true;
    }

    public final boolean BUd() {
        TriState triState = this.A0F;
        if (triState == null || !triState.isSet()) {
            return false;
        }
        return true;
    }

    public final boolean BWA(long j) {
        if ((j & this.A09) != 0) {
            return true;
        }
        return false;
    }

    public final boolean BWB(int i) {
        if ((this.A09 & (1 << (i - 1))) == 0) {
            return false;
        }
        return true;
    }

    public final void run() {
        String str;
        StringBuilder sb;
        C14900qN r20 = this.A0K;
        C15030qb r3 = C14900qN.A01;
        try {
            C15730rn A012 = C15730rn.A01("perf", (String) null);
            C15730rn r0 = A012;
            r0.A00 = BGw();
            C15680ri r4 = r0.A05;
            r4.A09(Integer.valueOf(getMarkerId()), "marker_id");
            r4.A09(Integer.valueOf(BJK()), "instance_id");
            r4.A09(Integer.valueOf((int) B8c()), "sample_rate");
            r4.A09(Integer.valueOf((int) ((B8c() >> 48) & 255)), "sample_source");
            r4.A0C("time_since_boot_ms", Long.valueOf(AwQ()));
            r4.A0C("duration_ns", Long.valueOf(AeL()));
            r4.A09(Integer.valueOf(AOk()), "action_id");
            r4.A09(Integer.valueOf(AtU()), "marker_type");
            String BJM = BJM();
            if (BJM != null) {
                r4.A0D("unique_marker_id_debug_only", BJM);
            }
            if (BSF() && BUd()) {
                r4.A0A("app_started_in_bg", Boolean.valueOf(AlE()));
            }
            r4.A0D("method", C13300nO.A00((int) ((B8c() >> 32) & 255), BWD(), BRI()));
            int Ars = Ars();
            if (Ars != 0) {
                r4.A09(Integer.valueOf(Ars), "da_level");
            }
            String BEr = BEr();
            if (BEr != null) {
                r4.A0D("da_type", BEr);
            }
            List Ago = Ago();
            List Agw = Agw();
            int size = Ago.size() - 1;
            C15680ri r11 = null;
            C15680ri r10 = null;
            C15680ri r9 = null;
            C15680ri r8 = null;
            C15680ri r7 = null;
            C15680ri r6 = null;
            C15680ri r5 = null;
            C15680ri r2 = null;
            for (int i = 0; i < size; i += 2) {
                List list = Ago;
                String str2 = (String) list.get(i);
                String str3 = (String) list.get(i + 1);
                switch (((Integer) Agw.get(i >> 1)).intValue()) {
                    case 1:
                        if (r11 == null) {
                            r11 = new C15680ri();
                            r4.A07(r11, "annotations");
                        }
                        r11.A0D(str2, str3);
                        break;
                    case 2:
                    case 3:
                        if (r10 == null) {
                            r10 = new C15680ri();
                            r4.A07(r10, "annotations_int");
                        }
                        r10.A0C(str2, Long.valueOf(Long.parseLong(str3)));
                        break;
                    case 4:
                        if (r9 == null) {
                            r9 = new C15680ri();
                            r4.A07(r9, "annotations_string_array");
                        }
                        r3.A03(r9, str2, AnonymousClass0WZ.A00(str3));
                        break;
                    case 5:
                    case 10:
                        if (r8 == null) {
                            r8 = new C15680ri();
                            r4.A07(r8, "annotations_int_array");
                        }
                        r3.A02(r8, str2, AnonymousClass0WZ.A00(str3));
                        break;
                    case 6:
                        if (r7 == null) {
                            r7 = new C15680ri();
                            r4.A07(r7, "annotations_double");
                        }
                        r7.A0B(str2, Double.valueOf(Double.parseDouble(str3)));
                        break;
                    case 7:
                        if (r6 == null) {
                            r6 = new C15680ri();
                            r4.A07(r6, "annotations_double_array");
                        }
                        r3.A01(r6, str2, AnonymousClass0WZ.A00(str3));
                        break;
                    case 8:
                        if (r5 == null) {
                            r5 = new C15680ri();
                            r4.A07(r5, "annotations_bool");
                        }
                        r5.A0A(str2, Boolean.valueOf(Boolean.parseBoolean(str3)));
                        break;
                    case 9:
                        if (r2 == null) {
                            r2 = new C15680ri();
                            r4.A07(r2, "annotations_bool_array");
                        }
                        r3.A00(r2, str2, AnonymousClass0WZ.A00(str3));
                        break;
                }
            }
            String BFV = BFV();
            if (!BFV.isEmpty()) {
                r4.A0D("trace_tags", BFV);
            }
            short AOk = AOk();
            if (AOk == 3) {
                str = "client_fail";
            } else if (AOk == 4) {
                str = "client_cancel";
            } else {
                str = "client_tti";
            }
            r4.A0D("marker", str);
            long BIV = BIV();
            if (BIV != -1) {
                r4.A0C("ttl_ms", Long.valueOf(BIV));
            }
            String str4 = AnonymousClass0WZ.A00;
            if (str4 != null) {
                r4.A0D("scenario", str4);
            }
            if (BZB()) {
                r4.A0A("tracked_for_loss", true);
            }
            if (B7s() != 0) {
                sb = new StringBuilder("markerStart called multiple times without end or cancel");
            } else {
                sb = null;
            }
            AnonymousClass0WF B22 = B22();
            if (B22 != null) {
                C15560rW r1 = new C15560rW();
                B22.A00(new C09110es(r3, r1));
                r4.A08(r1, "points");
            }
            if (sb != null) {
                r4.A0D("error", sb.toString());
            }
            if (BNh()) {
                AnonymousClass0WN AvU = AvU();
                if (!AvU.A00.isEmpty()) {
                    C15680ri r12 = new C15680ri();
                    r4.A07(r12, "metadata");
                    AvU.A00(new C09150ew(r3, r12));
                }
            }
            if (getMarkerId() != 196678) {
                r20.A00.Cd7(A012);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public final short AOk() {
        return this.A0O;
    }

    public final AnonymousClass0W3 AQo() {
        return this.A0Z;
    }

    public final long AeL() {
        return this.A08;
    }

    public final long Aff() {
        return this.A09;
    }

    public final int AgE() {
        return this.A00;
    }

    public final int Ait() {
        return this.A01;
    }

    public final int ApM() {
        return this.A02;
    }

    public final short Ar1() {
        return this.A0P;
    }

    public final long ArD() {
        return this.A0A;
    }

    public final int Ars() {
        return this.A00;
    }

    public final long AwR() {
        return this.A0B;
    }

    public final AnonymousClass0QX B18() {
        return null;
    }

    public final AnonymousClass0WO B1h() {
        return this.A0H;
    }

    public final AnonymousClass0WF B22() {
        return this.A0G;
    }

    public final int B7s() {
        return this.A05;
    }

    public final long B8c() {
        return this.A0C;
    }

    public final String BEr() {
        return this.A0N;
    }

    public final List BFU() {
        return this.A0a;
    }

    public final int BGK() {
        return this.A06;
    }

    public final long BGw() {
        return this.A0D;
    }

    public final long BIV() {
        return this.A0E;
    }

    public final int BJK() {
        return this.A07;
    }

    public final String BJM() {
        return null;
    }

    public final boolean BRI() {
        return this.A0R;
    }

    public final boolean BWD() {
        return this.A0S;
    }

    public final boolean BZB() {
        return this.A0V;
    }

    public final boolean BZa() {
        return this.A0W;
    }

    public final int getMarkerId() {
        return this.A03;
    }

    public final void Cok(int i) {
        this.A0X = i;
    }
}
