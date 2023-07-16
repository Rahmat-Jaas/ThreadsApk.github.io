package X;

/* renamed from: X.3aq  reason: invalid class name and case insensitive filesystem */
public final class C62833aq {
    public static final int A00(Integer num, Integer num2) {
        switch (C18240wQ.A06(num, 0)) {
            case 3:
            case 4:
            case 5:
                int intValue = num2.intValue();
                if (intValue == 0 || intValue == 1) {
                    return 22;
                }
                return 16;
            default:
                return 4;
        }
    }

    public static final int A01(Integer num, Integer num2) {
        int i;
        int i2;
        int A06 = C18240wQ.A06(num, 0);
        int intValue = num2.intValue();
        switch (A06) {
            case 0:
            case 1:
                i2 = 52;
                break;
            case 3:
                if (intValue != 0) {
                    i = 1;
                    i2 = 36;
                    break;
                } else {
                    return 44;
                }
            default:
                i2 = 44;
                break;
        }
        if (intValue == 0) {
            return i2;
        }
        i = 1;
        if (intValue != i) {
            return 32;
        }
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001f, code lost:
        return new X.C58893Hx(new X.C58903Hy(r2, r1), 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        return new X.C58893Hx(new X.C58903Hy(-14931149, -14931149), 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C58893Hx A03(java.lang.Integer r3, java.lang.Integer r4) {
        /*
            r2 = 0
            int r1 = X.C18240wQ.A06(r3, r2)
            int r0 = r4.intValue()
            r3 = 1
            switch(r1) {
                case 0: goto L_0x0020;
                case 1: goto L_0x0020;
                case 2: goto L_0x0020;
                case 3: goto L_0x0020;
                default: goto L_0x000d;
            }
        L_0x000d:
            if (r0 == r2) goto L_0x0029
            r2 = -3419431(0xffffffffffcbd2d9, float:NaN)
            r1 = -12166551(0xffffffffff465a69, float:-2.6365658E38)
        L_0x0015:
            X.3Hy r0 = new X.3Hy
            r0.<init>(r2, r1)
            X.3Hx r1 = new X.3Hx
            r1.<init>(r0, r3)
            return r1
        L_0x0020:
            if (r0 == r2) goto L_0x0029
            r2 = -3419431(0xffffffffffcbd2d9, float:NaN)
            r1 = -5786689(0xffffffffffa7b3bf, float:NaN)
            goto L_0x0015
        L_0x0029:
            r1 = -14931149(0xffffffffff1c2b33, float:-2.0758387E38)
            X.3Hy r0 = new X.3Hy
            r0.<init>(r1, r1)
            X.3Hx r1 = new X.3Hx
            r1.<init>(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62833aq.A03(java.lang.Integer, java.lang.Integer):X.3Hx");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        r2 = 16777215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0060, code lost:
        r2 = -920329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
        r0 = -12215809;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        r2 = -12166551;
        r0 = -2169879;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0073, code lost:
        return new X.C58903Hy(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007c, code lost:
        return new X.C58903Hy(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0082, code lost:
        return new X.C58903Hy(r4, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0083, code lost:
        r2 = -1728053248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008a, code lost:
        return new X.C58903Hy(r2, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a8, code lost:
        return new X.C58903Hy(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b0, code lost:
        return new X.C58903Hy(r0, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        return new X.C58903Hy(r3, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C58903Hy A04(java.lang.Integer r3, java.lang.Integer r4) {
        /*
            r0 = 0
            int r0 = X.C18240wQ.A06(r3, r0)
            int r1 = r4.intValue()
            switch(r0) {
                case 0: goto L_0x0026;
                case 1: goto L_0x0035;
                case 2: goto L_0x004c;
                case 3: goto L_0x0035;
                default: goto L_0x000c;
            }
        L_0x000c:
            r0 = -15787746(0xffffffffff0f191e, float:-1.9021002E38)
            r4 = -16751392(0xffffffffff0064e0, float:-1.7066496E38)
            r3 = -14931149(0xffffffffff1c2b33, float:-2.0758387E38)
            r2 = -1
            switch(r1) {
                case 0: goto L_0x0083;
                case 1: goto L_0x0019;
                case 2: goto L_0x0019;
                case 3: goto L_0x0019;
                case 4: goto L_0x001f;
                case 5: goto L_0x007d;
                case 6: goto L_0x0085;
                case 7: goto L_0x005c;
                case 8: goto L_0x0019;
                case 9: goto L_0x0074;
                case 10: goto L_0x0031;
                case 11: goto L_0x006e;
                default: goto L_0x0019;
            }
        L_0x0019:
            X.3Hy r1 = new X.3Hy
            r1.<init>(r3, r2)
            return r1
        L_0x001f:
            r3 = -12166551(0xffffffffff465a69, float:-2.6365658E38)
            r2 = -3419431(0xffffffffffcbd2d9, float:NaN)
            goto L_0x0019
        L_0x0026:
            r0 = -16751392(0xffffffffff0064e0, float:-1.7066496E38)
            r3 = -14931149(0xffffffffff1c2b33, float:-2.0758387E38)
            r2 = -1
            switch(r1) {
                case 0: goto L_0x00a9;
                case 1: goto L_0x0030;
                case 2: goto L_0x0030;
                case 3: goto L_0x0030;
                case 4: goto L_0x009d;
                case 5: goto L_0x00ab;
                case 6: goto L_0x0085;
                case 7: goto L_0x0099;
                case 8: goto L_0x0030;
                case 9: goto L_0x0095;
                case 10: goto L_0x0091;
                case 11: goto L_0x008b;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0019
        L_0x0031:
            r4 = -920329(0xfffffffffff1f4f7, float:NaN)
            goto L_0x0077
        L_0x0035:
            r2 = -16751392(0xffffffffff0064e0, float:-1.7066496E38)
            r0 = -14931149(0xffffffffff1c2b33, float:-2.0758387E38)
            r3 = -1
            switch(r1) {
                case 0: goto L_0x0083;
                case 1: goto L_0x003f;
                case 2: goto L_0x003f;
                case 3: goto L_0x003f;
                case 4: goto L_0x0068;
                case 5: goto L_0x0085;
                case 6: goto L_0x0046;
                case 7: goto L_0x005c;
                case 8: goto L_0x003f;
                case 9: goto L_0x0064;
                case 10: goto L_0x0060;
                case 11: goto L_0x0040;
                default: goto L_0x003f;
            }
        L_0x003f:
            goto L_0x00a3
        L_0x0040:
            X.3Hy r1 = new X.3Hy
            r1.<init>(r3, r0)
            return r1
        L_0x0046:
            X.3Hy r1 = new X.3Hy
            r1.<init>(r3, r3)
            return r1
        L_0x004c:
            r2 = -16751392(0xffffffffff0064e0, float:-1.7066496E38)
            r0 = -14931149(0xffffffffff1c2b33, float:-2.0758387E38)
            r4 = -1
            switch(r1) {
                case 0: goto L_0x0083;
                case 1: goto L_0x0056;
                case 2: goto L_0x0056;
                case 3: goto L_0x0056;
                case 4: goto L_0x0068;
                case 5: goto L_0x0085;
                case 6: goto L_0x007d;
                case 7: goto L_0x005c;
                case 8: goto L_0x0056;
                case 9: goto L_0x0064;
                case 10: goto L_0x0060;
                case 11: goto L_0x0077;
                default: goto L_0x0056;
            }
        L_0x0056:
            X.3Hy r1 = new X.3Hy
            r1.<init>(r0, r4)
            return r1
        L_0x005c:
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            goto L_0x0085
        L_0x0060:
            r2 = -920329(0xfffffffffff1f4f7, float:NaN)
            goto L_0x006e
        L_0x0064:
            r0 = -12215809(0xffffffffff4599ff, float:-2.626575E38)
            goto L_0x006e
        L_0x0068:
            r2 = -12166551(0xffffffffff465a69, float:-2.6365658E38)
            r0 = -2169879(0xffffffffffdee3e9, float:NaN)
        L_0x006e:
            X.3Hy r1 = new X.3Hy
            r1.<init>(r2, r0)
            return r1
        L_0x0074:
            r0 = -12081670(0xffffffffff47a5fa, float:-2.6537817E38)
        L_0x0077:
            X.3Hy r1 = new X.3Hy
            r1.<init>(r4, r0)
            return r1
        L_0x007d:
            X.3Hy r1 = new X.3Hy
            r1.<init>(r4, r4)
            return r1
        L_0x0083:
            r2 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
        L_0x0085:
            X.3Hy r1 = new X.3Hy
            r1.<init>(r2, r2)
            return r1
        L_0x008b:
            X.3Hy r1 = new X.3Hy
            r1.<init>(r2, r3)
            return r1
        L_0x0091:
            r0 = -920329(0xfffffffffff1f4f7, float:NaN)
            goto L_0x00a3
        L_0x0095:
            r3 = -12215809(0xffffffffff4599ff, float:-2.626575E38)
            goto L_0x00a3
        L_0x0099:
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            goto L_0x00ab
        L_0x009d:
            r0 = -12166551(0xffffffffff465a69, float:-2.6365658E38)
            r3 = -2169879(0xffffffffffdee3e9, float:NaN)
        L_0x00a3:
            X.3Hy r1 = new X.3Hy
            r1.<init>(r0, r3)
            return r1
        L_0x00a9:
            r0 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
        L_0x00ab:
            X.3Hy r1 = new X.3Hy
            r1.<init>(r0, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62833aq.A04(java.lang.Integer, java.lang.Integer):X.3Hy");
    }

    public static int A02(Integer num, Integer num2, int i) {
        C58903Hy A04 = A04(num, num2);
        if (i != 0) {
            return A04.A00;
        }
        return A04.A01;
    }
}
