package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0uc  reason: invalid class name and case insensitive filesystem */
public final class C17270uc {
    public final Integer A00;
    public final Map A01 = new HashMap();

    public static void A00(AnonymousClass0SE r4, AnonymousClass0RP r5) {
        int i;
        byte b = r5.A00;
        short s = r5.A01;
        if (b == 2) {
            r4.A00 = Short.valueOf(s);
            return;
        }
        byte b2 = AnonymousClass0SE.A05[b];
        short s2 = r4.A02;
        if (s <= s2 || (i = s - s2) > 15) {
            r4.A03.write(b2);
            AnonymousClass0SE.A00(r4, (s >> 31) ^ (s << 1));
        } else {
            r4.A03.write((byte) ((i << 4) | b2));
        }
        r4.A02 = s;
    }

    public C17270uc(Integer num) {
        this.A00 = num;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0750, code lost:
        r3 = (byte[]) r3;
        r2 = r3.length;
        X.AnonymousClass0SE.A00(r8, r2);
        r8.A03.write(r3, 0, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass0SE r8) {
        /*
            r7 = this;
            java.lang.Integer r0 = r7.A00
            int r0 = r0.intValue()
            r8.A01()
            switch(r0) {
                case 0: goto L_0x0092;
                case 1: goto L_0x0399;
                case 2: goto L_0x04fc;
                case 3: goto L_0x0536;
                case 4: goto L_0x058c;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.util.Map r2 = r7.A01
            X.0RP r1 = X.C17280ud.A0s
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0028
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
        L_0x0028:
            X.0RP r1 = X.C17280ud.A0t
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x004b
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x004b
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            X.AnonymousClass0SE.A00(r8, r0)
        L_0x004b:
            X.0RP r1 = X.C17280ud.A0r
        L_0x004d:
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0065
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0065
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
        L_0x0065:
            r1 = 0
            java.io.OutputStream r0 = r8.A03
            r0.write(r1)
            java.util.List r1 = r8.A01
            int r0 = r1.size()
            int r0 = r0 + -1
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            short r0 = r0.shortValue()
            r8.A02 = r0
            int r0 = r1.size()
            int r0 = r0 + -1
            java.lang.Object r0 = r1.remove(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            short r0 = r0.shortValue()
            r8.A02 = r0
            return
        L_0x0092:
            java.util.Map r2 = r7.A01
            X.0RP r1 = X.C17280ud.A0P
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x00b2
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r8.A03(r0)
        L_0x00b2:
            X.0RP r1 = X.C17280ud.A0O
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x00cc
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
        L_0x00cc:
            X.0RP r1 = X.C17280ud.A01
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x00ea
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r8.A03(r0)
        L_0x00ea:
            X.0RP r1 = X.C17280ud.A09
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0108
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0108
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r8.A03(r0)
        L_0x0108:
            X.0RP r1 = X.C17280ud.A0L
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x012b
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x012b
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            X.AnonymousClass0SE.A00(r8, r0)
        L_0x012b:
            X.0RP r1 = X.C17280ud.A0J
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0149
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0149
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r8.A05(r0)
        L_0x0149:
            X.0RP r1 = X.C17280ud.A0G
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0167
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0167
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r8.A05(r0)
        L_0x0167:
            X.0RP r1 = X.C17280ud.A07
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0181
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0181
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
        L_0x0181:
            X.0RP r1 = X.C17280ud.A0E
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x019f
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x019f
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r8.A05(r0)
        L_0x019f:
            X.0RP r1 = X.C17280ud.A0I
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x01c2
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x01c2
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            X.AnonymousClass0SE.A00(r8, r0)
        L_0x01c2:
            X.0RP r1 = X.C17280ud.A0H
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x01e5
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x01e5
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            X.AnonymousClass0SE.A00(r8, r0)
        L_0x01e5:
            X.0RP r1 = X.C17280ud.A03
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0203
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0203
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r8.A03(r0)
        L_0x0203:
            X.0RP r1 = X.C17280ud.A02
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x021d
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x021d
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
        L_0x021d:
            X.0RP r1 = X.C17280ud.A0N
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x025a
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x025a
            A00(r8, r1)
            java.lang.Object r3 = r2.get(r1)
            java.util.List r3 = (java.util.List) r3
            r1 = 8
            int r0 = r3.size()
            r8.A02(r1, r0)
            java.util.Iterator r3 = r3.iterator()
        L_0x0241:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x025a
            java.lang.Object r0 = r3.next()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            X.AnonymousClass0SE.A00(r8, r0)
            goto L_0x0241
        L_0x025a:
            X.0RP r1 = X.C17280ud.A05
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0274
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0274
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
        L_0x0274:
            X.0RP r1 = X.C17280ud.A00
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0292
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0292
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r8.A03(r0)
        L_0x0292:
            X.0RP r1 = X.C17280ud.A0K
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x02b0
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x02b0
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r8.A05(r0)
        L_0x02b0:
            X.0RP r1 = X.C17280ud.A06
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x02d1
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x02d1
            A00(r8, r1)
            java.lang.Object r4 = r2.get(r1)
            byte[] r4 = (byte[]) r4
            int r3 = r4.length
            r1 = 0
            X.AnonymousClass0SE.A00(r8, r3)
            java.io.OutputStream r0 = r8.A03
            r0.write(r4, r1, r3)
        L_0x02d1:
            X.0RP r1 = X.C17280ud.A0M
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x02eb
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x02eb
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
        L_0x02eb:
            X.0RP r1 = X.C17280ud.A08
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0305
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0305
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
        L_0x0305:
            X.0RP r1 = X.C17280ud.A0F
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0323
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0323
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r8.A03(r0)
        L_0x0323:
            X.0RP r1 = X.C17280ud.A04
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0343
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0343
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            byte r1 = r0.byteValue()
            java.io.OutputStream r0 = r8.A03
            r0.write(r1)
        L_0x0343:
            X.0RP r1 = X.C17280ud.A0A
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0361
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0361
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r8.A03(r0)
        L_0x0361:
            X.0RP r1 = X.C17280ud.A0B
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x037b
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x037b
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
        L_0x037b:
            X.0RP r1 = X.C17280ud.A0C
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0395
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0395
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
        L_0x0395:
            X.0RP r1 = X.C17280ud.A0D
            goto L_0x004d
        L_0x0399:
            java.util.Map r2 = r7.A01
            X.0RP r1 = X.C17280ud.A0p
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x03b5
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x03b5
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
        L_0x03b5:
            X.0RP r1 = X.C17280ud.A0k
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x075e
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x075e
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r8.A03(r0)
            X.0RP r1 = X.C17280ud.A0l
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x03f6
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x03f6
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            X.AnonymousClass0SE.A00(r8, r0)
        L_0x03f6:
            X.0RP r1 = X.C17280ud.A0f
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0419
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0419
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            X.AnonymousClass0SE.A00(r8, r0)
        L_0x0419:
            X.0RP r1 = X.C17280ud.A0i
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0433
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0433
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
        L_0x0433:
            X.0RP r1 = X.C17280ud.A0n
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x044d
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x044d
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
        L_0x044d:
            X.0RP r1 = X.C17280ud.A0o
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0470
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0470
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            X.AnonymousClass0SE.A00(r8, r0)
        L_0x0470:
            X.0RP r1 = X.C17280ud.A0g
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x048a
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x048a
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
        L_0x048a:
            X.0RP r1 = X.C17280ud.A0h
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x04a4
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x04a4
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
        L_0x04a4:
            X.0RP r1 = X.C17280ud.A0m
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x04be
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x04be
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
        L_0x04be:
            X.0RP r1 = X.C17280ud.A0j
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x04dc
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x04dc
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r8.A03(r0)
        L_0x04dc:
            X.0RP r1 = X.C17280ud.A0q
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0065
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0065
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r8.A03(r0)
            goto L_0x0065
        L_0x04fc:
            java.util.Map r2 = r7.A01
            X.0RP r1 = X.C17280ud.A0v
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0518
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0518
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
        L_0x0518:
            X.0RP r1 = X.C17280ud.A0u
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0532
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0532
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
        L_0x0532:
            X.0RP r1 = X.C17280ud.A0w
            goto L_0x004d
        L_0x0536:
            java.util.Map r2 = r7.A01
            X.0RP r1 = X.C17280ud.A0S
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0552
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0552
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
        L_0x0552:
            X.0RP r1 = X.C17280ud.A0Q
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0575
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0575
            A00(r8, r1)
            java.lang.Object r0 = r2.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r1 = r0 << 1
            int r0 = r0 >> 31
            r0 = r0 ^ r1
            X.AnonymousClass0SE.A00(r8, r0)
        L_0x0575:
            X.0RP r1 = X.C17280ud.A0R
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x0065
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto L_0x0065
            A00(r8, r1)
            java.lang.Object r3 = r2.get(r1)
            goto L_0x0750
        L_0x058c:
            java.util.Map r3 = r7.A01
            X.0RP r1 = X.C17280ud.A0U
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x05a8
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x05a8
            A00(r8, r1)
            java.lang.Object r0 = r3.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
        L_0x05a8:
            X.0RP r1 = X.C17280ud.A0d
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x05c2
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x05c2
            A00(r8, r1)
            java.lang.Object r0 = r3.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
        L_0x05c2:
            X.0RP r1 = X.C17280ud.A0c
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x05dc
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x05dc
            A00(r8, r1)
            java.lang.Object r0 = r3.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
        L_0x05dc:
            X.0RP r1 = X.C17280ud.A0V
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x05f6
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x05f6
            A00(r8, r1)
            java.lang.Object r0 = r3.get(r1)
            X.0uc r0 = (X.C17270uc) r0
            r0.A01(r8)
        L_0x05f6:
            X.0RP r1 = X.C17280ud.A0Z
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0610
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x0610
            A00(r8, r1)
            java.lang.Object r0 = r3.get(r1)
            X.0uc r0 = (X.C17270uc) r0
            r0.A01(r8)
        L_0x0610:
            X.0RP r1 = X.C17280ud.A0Y
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x062a
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x062a
            A00(r8, r1)
            java.lang.Object r0 = r3.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
        L_0x062a:
            X.0RP r1 = X.C17280ud.A0X
            boolean r0 = r3.containsKey(r1)
            r4 = 11
            if (r0 == 0) goto L_0x0665
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x0665
            A00(r8, r1)
            java.lang.Object r1 = r3.get(r1)
            java.util.List r1 = (java.util.List) r1
            int r0 = r1.size()
            r8.A02(r4, r0)
            java.util.Iterator r6 = r1.iterator()
        L_0x064e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0665
            java.lang.Object r5 = r6.next()
            byte[] r5 = (byte[]) r5
            int r2 = r5.length
            r1 = 0
            X.AnonymousClass0SE.A00(r8, r2)
            java.io.OutputStream r0 = r8.A03
            r0.write(r5, r1, r2)
            goto L_0x064e
        L_0x0665:
            X.0RP r1 = X.C17280ud.A0a
            boolean r0 = r3.containsKey(r1)
            r2 = 12
            if (r0 == 0) goto L_0x0699
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x0699
            A00(r8, r1)
            java.lang.Object r1 = r3.get(r1)
            java.util.List r1 = (java.util.List) r1
            int r0 = r1.size()
            r8.A02(r2, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0689:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0699
            java.lang.Object r0 = r1.next()
            X.0uc r0 = (X.C17270uc) r0
            r0.A01(r8)
            goto L_0x0689
        L_0x0699:
            X.0RP r1 = X.C17280ud.A0W
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x06cb
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x06cb
            A00(r8, r1)
            java.lang.Object r1 = r3.get(r1)
            java.util.List r1 = (java.util.List) r1
            int r0 = r1.size()
            r8.A02(r2, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x06bb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x06cb
            java.lang.Object r0 = r1.next()
            X.0uc r0 = (X.C17270uc) r0
            r0.A01(r8)
            goto L_0x06bb
        L_0x06cb:
            X.0RP r1 = X.C17280ud.A0e
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x06e5
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x06e5
            A00(r8, r1)
            java.lang.Object r0 = r3.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
        L_0x06e5:
            X.0RP r1 = X.C17280ud.A0T
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x073b
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x073b
            A00(r8, r1)
            java.lang.Object r2 = r3.get(r1)
            java.util.Map r2 = (java.util.Map) r2
            int r0 = r2.size()
            if (r0 != 0) goto L_0x0730
            r0 = 0
        L_0x0703:
            byte r1 = (byte) r0
            java.io.OutputStream r0 = r8.A03
            r0.write(r1)
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x0711:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x073b
            java.lang.Object r1 = r2.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
            java.lang.Object r0 = r1.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r8.A04(r0)
            goto L_0x0711
        L_0x0730:
            X.AnonymousClass0SE.A00(r8, r0)
            byte[] r0 = X.AnonymousClass0SE.A05
            byte r1 = r0[r4]
            int r0 = r1 << 4
            r0 = r0 | r1
            goto L_0x0703
        L_0x073b:
            X.0RP r1 = X.C17280ud.A0b
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0065
            java.lang.Object r0 = r3.get(r1)
            if (r0 == 0) goto L_0x0065
            A00(r8, r1)
            java.lang.Object r3 = r3.get(r1)
        L_0x0750:
            byte[] r3 = (byte[]) r3
            int r2 = r3.length
            r1 = 0
            X.AnonymousClass0SE.A00(r8, r2)
            java.io.OutputStream r0 = r8.A03
            r0.write(r3, r1, r2)
            goto L_0x0065
        L_0x075e:
            java.lang.String r1 = "Required field 'GetIrisDiffs.lastSeqId' was not present!"
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17270uc.A01(X.0SE):void");
    }
}
