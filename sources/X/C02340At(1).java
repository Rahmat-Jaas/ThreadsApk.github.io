package X;

/* renamed from: X.0At  reason: invalid class name and case insensitive filesystem */
public class C02340At {
    public long A00;
    public long A01 = -1;
    public long A02;
    public long A03 = 0;
    public AnonymousClass0AB A04;
    public AnonymousClass0KD A05;
    public AnonymousClass0KD A06;
    public Boolean A07;
    public Integer A08;
    public Integer A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;
    public volatile boolean A0F;

    public boolean A05() {
        this.A0D = true;
        return true;
    }

    public final void A04() {
        if (!this.A0D) {
            String str = this.A0A;
            if (str == null) {
                str = "unknown";
            }
            throw new IllegalStateException(AnonymousClass00U.A0V("isSampled was not invoked for ", str, "."));
        } else if (!this.A0F) {
            throw new IllegalStateException("Expected mutability");
        }
    }

    public C02340At A00(long j) {
        A04();
        this.A01 = j;
        return this;
    }

    public C02340At A01(String str, String str2) {
        A04();
        AnonymousClass0KD.A00(A02(), str2, str);
        synchronized (this) {
            if (str2 != null) {
                this.A00 += (long) str2.length();
            }
        }
        return this;
    }

    public AnonymousClass0KD A02() {
        Integer num;
        String str;
        A04();
        if (this.A06 == null) {
            AnonymousClass0KD A022 = this.A04.A0E.A02();
            this.A06 = A022;
            AnonymousClass0KD r1 = this.A05;
            if (!(r1 == null || (num = this.A08) == null)) {
                if (1 - num.intValue() != 0) {
                    str = "extra";
                } else {
                    str = "result";
                }
                r1.A0D(A022, str);
            }
        }
        return this.A06;
    }

    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [X.0AB, java.lang.Boolean, java.lang.String, java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r8 = this;
            r8.A04()
            java.lang.Boolean r0 = r8.A07
            if (r0 != 0) goto L_0x0019
            X.0AB r0 = r8.A04
            if (r0 == 0) goto L_0x0019
            X.0AH r0 = r0.A0B
            if (r0 == 0) goto L_0x0019
            boolean r0 = r0.AOB()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A07 = r0
        L_0x0019:
            long r3 = r8.A01
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0027
            long r0 = java.lang.System.currentTimeMillis()
            r8.A01 = r0
        L_0x0027:
            X.0AB r0 = r8.A04
            if (r0 == 0) goto L_0x004b
            X.0Bf r0 = r0.A0C
            if (r0 == 0) goto L_0x004b
            android.net.NetworkInfo r0 = X.AnonymousClass0fS.A00()
            X.0fT r3 = X.AnonymousClass0fS.A03(r0)
            java.lang.Integer r0 = r3.A01
            java.lang.String r2 = X.AnonymousClass0fV.A00(r0)
            r1 = 45
            java.lang.Integer r0 = r3.A00
            java.lang.String r0 = X.C09450fW.A00(r0)
            java.lang.String r0 = X.AnonymousClass00U.A0N(r2, r0, r1)
            r8.A0C = r0
        L_0x004b:
            java.lang.String r0 = r8.A0C
            if (r0 == 0) goto L_0x005a
            X.0KD r2 = r8.A02()
            java.lang.String r1 = r8.A0C
            java.lang.String r0 = "radio_type"
            X.AnonymousClass0KD.A00(r2, r1, r0)
        L_0x005a:
            X.0KD r6 = r8.A02()
            long r4 = r8.A02
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            double r2 = (double) r4
            if (r0 < 0) goto L_0x006d
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r0
        L_0x006d:
            java.lang.Double r1 = java.lang.Double.valueOf(r2)
            java.lang.String r0 = "pigeon_reserved_keyword_requested_latency"
            X.AnonymousClass0KD.A00(r6, r1, r0)
            java.lang.Integer r0 = r8.A08
            if (r0 == 0) goto L_0x008b
            X.0KD r2 = r8.A05
            int r0 = r0.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x01e6
            java.lang.String r1 = "client_event"
        L_0x0086:
            java.lang.String r0 = "log_type"
            X.AnonymousClass0KD.A00(r2, r1, r0)
        L_0x008b:
            java.lang.Boolean r0 = r8.A07
            if (r0 == 0) goto L_0x009e
            X.0KD r2 = r8.A05
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01e2
            java.lang.String r1 = "true"
        L_0x0099:
            java.lang.String r0 = "bg"
            X.AnonymousClass0KD.A00(r2, r1, r0)
        L_0x009e:
            X.0KD r4 = r8.A05
            long r0 = r8.A01
            double r2 = (double) r0
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r0
            java.lang.Double r1 = java.lang.Double.valueOf(r2)
            java.lang.String r0 = "time"
            X.AnonymousClass0KD.A00(r4, r1, r0)
            java.lang.String r2 = r8.A0B
            if (r2 == 0) goto L_0x00bd
            X.0KD r1 = r8.A05
            java.lang.String r0 = "module"
            X.AnonymousClass0KD.A00(r1, r2, r0)
        L_0x00bd:
            X.0KD r2 = r8.A05
            java.lang.String r1 = r8.A0A
            java.lang.String r0 = "name"
            X.AnonymousClass0KD.A00(r2, r1, r0)
            java.lang.Integer r2 = r8.A09
            if (r2 == 0) goto L_0x00d1
            X.0KD r1 = r8.A05
            java.lang.String r0 = "sampling_rate"
            X.AnonymousClass0KD.A00(r1, r2, r0)
        L_0x00d1:
            X.0KD r2 = r8.A05
            long r0 = r8.A03
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "tags"
            X.AnonymousClass0KD.A00(r2, r1, r0)
            X.0AB r0 = r8.A04
            java.lang.String r3 = "builder was not acquired or was acquired without config"
            X.AnonymousClass0KW.A00(r0, r3)
            X.0B2 r0 = r0.A00
            if (r0 == 0) goto L_0x014f
            java.lang.String r2 = r8.A0A
            X.0KD r1 = r8.A05
            X.AnonymousClass0KW.A00(r1, r3)
            X.0B1 r0 = r0.B8f()
            X.0B0 r0 = r0.Cfk(r1, r2)
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x014f
            X.0KD r0 = r8.A05
            r1 = 0
            r0.A03 = r1
            X.0KD r0 = r8.A06
            if (r0 == 0) goto L_0x0107
            r0.A03 = r1
        L_0x0107:
            r8.A0F = r1
            X.0KD r0 = r8.A05
            r7 = 0
            if (r0 == 0) goto L_0x011a
            r0.A03 = r1
            X.0KD r0 = r8.A06
            if (r0 == 0) goto L_0x0116
            r0.A03 = r1
        L_0x0116:
            r8.A06 = r7
            r8.A05 = r7
        L_0x011a:
            boolean r0 = r8.A0F
            if (r0 != 0) goto L_0x01f2
            X.0KD r0 = r8.A05
            if (r0 != 0) goto L_0x01ea
            X.0KD r0 = r8.A06
            if (r0 != 0) goto L_0x01ea
            X.0AB r0 = r8.A04
            if (r0 != 0) goto L_0x014c
            r3 = r7
        L_0x012b:
            r8.A0B = r7
            r8.A0A = r7
            r8.A08 = r7
            r2 = 0
            r8.A0E = r2
            r8.A07 = r7
            r0 = -1
            r8.A01 = r0
            r8.A04 = r7
            r8.A0C = r7
            r8.A0D = r2
            r0 = 0
            r8.A00 = r0
            r8.A03 = r0
            if (r3 == 0) goto L_0x014b
            r3.Can(r8)
        L_0x014b:
            return
        L_0x014c:
            X.01f r3 = r0.A09
            goto L_0x012b
        L_0x014f:
            X.0AB r0 = r8.A04
            X.0BQ r2 = r0.A01
            java.lang.String r1 = r8.A0A
            long r5 = r2.AgD(r1)
            boolean r0 = r8.A0E
            if (r0 == 0) goto L_0x018a
            long r1 = r2.Amz(r1)
        L_0x0161:
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0168
            r5 = r1
        L_0x0168:
            r1 = -1
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0175
            boolean r0 = r8.A0E
            if (r0 == 0) goto L_0x0174
            r1 = -2
        L_0x0174:
            r5 = r1
        L_0x0175:
            r8.A02 = r5
            X.0KD r0 = r8.A05
            r3 = 0
            r0.A03 = r3
            X.0KD r0 = r8.A06
            if (r0 == 0) goto L_0x0182
            r0.A03 = r3
        L_0x0182:
            r8.A0F = r3
            X.0AB r0 = r8.A04
            X.0Hu r2 = r0.A0D
            monitor-enter(r2)
            goto L_0x018f
        L_0x018a:
            long r1 = r2.Axk(r1)
            goto L_0x0161
        L_0x018f:
            boolean r0 = r2.A02     // Catch:{ all -> 0x01fd }
            if (r0 != 0) goto L_0x01b3
            X.0Bq r1 = r2.A05     // Catch:{ all -> 0x01fd }
            monitor-enter(r1)     // Catch:{ all -> 0x01fd }
            boolean r0 = r1.A01     // Catch:{ all -> 0x01fa }
            if (r0 != 0) goto L_0x01a3
            X.0IU r0 = r1.A00()     // Catch:{ all -> 0x01fa }
            r1.A00 = r0     // Catch:{ all -> 0x01fa }
            r0 = 1
            r1.A01 = r0     // Catch:{ all -> 0x01fa }
        L_0x01a3:
            X.0IU r0 = r1.A00     // Catch:{ all -> 0x01fa }
            monitor-exit(r1)     // Catch:{ all -> 0x01fd }
            r2.A01 = r0     // Catch:{ all -> 0x01fd }
            X.0Bp r0 = r1.A02     // Catch:{ all -> 0x01fd }
            r0.registerObserver(r2)     // Catch:{ all -> 0x01fd }
            X.AnonymousClass0Hu.A01(r2)     // Catch:{ all -> 0x01fd }
            r0 = 1
            r2.A02 = r0     // Catch:{ all -> 0x01fd }
        L_0x01b3:
            monitor-exit(r2)
            X.0KD r6 = r8.A05
            r7 = 0
            if (r6 == 0) goto L_0x011a
            r6.A03 = r3
            X.0KD r0 = r8.A06
            if (r0 == 0) goto L_0x01c1
            r0.A03 = r3
        L_0x01c1:
            r8.A06 = r7
            r8.A05 = r7
            X.0AB r5 = r8.A04
            if (r5 == 0) goto L_0x01df
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x01ce:
            long r1 = r8.A00
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x011a
            X.0A9 r3 = r5.A0A
            java.lang.String r2 = r8.A0A
            long r0 = r8.A02
            r3.CXo(r6, r2, r0)
            goto L_0x011a
        L_0x01df:
            r3 = 0
            goto L_0x01ce
        L_0x01e2:
            java.lang.String r1 = "false"
            goto L_0x0099
        L_0x01e6:
            java.lang.String r1 = "experiment"
            goto L_0x0086
        L_0x01ea:
            java.lang.String r1 = "Must call ejectBaseParameters before release"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01f2:
            java.lang.String r1 = "Expected immutability"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x01fa:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01fd }
            throw r0     // Catch:{ all -> 0x01fd }
        L_0x01fd:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02340At.A03():void");
    }
}
