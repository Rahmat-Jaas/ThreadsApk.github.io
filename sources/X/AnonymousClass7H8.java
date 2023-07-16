package X;

import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.KtLambdaShape48S0200000_I2;

/* renamed from: X.7H8  reason: invalid class name */
public final class AnonymousClass7H8 {
    public int A00;
    public int A01;
    public int A02;
    public C115506vH A03;
    public SubcomposeSlotReusePolicy A04;
    public final AnonymousClass7Y7 A05 = new AnonymousClass7Y7(this);
    public final AnonymousClass7Y3 A06;
    public final Map A07 = C18220wO.A0y();
    public final Map A08 = C18220wO.A0y();
    public final Map A09 = C18220wO.A0y();
    public final AnonymousClass83Z A0A = new AnonymousClass83Z((Set) null, (DefaultConstructorMarker) null, 1);

    public AnonymousClass7H8(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy, AnonymousClass7Y3 r5) {
        this.A06 = r5;
        this.A04 = subcomposeSlotReusePolicy;
    }

    public static final void A01(AnonymousClass7H8 r1, int i, int i2) {
        AnonymousClass7Y3 r12 = r1.A06;
        r12.A0L = true;
        r12.A0K(i, i2, 1);
        r12.A0L = false;
    }

    public final void A04(int i) {
        Snapshot A052;
        this.A02 = 0;
        AnonymousClass7Y3 r9 = this.A06;
        C106826fg r8 = r9.A0Z;
        AnonymousClass84X r7 = r8.A00;
        int A002 = (AnonymousClass84X.A00(r7) - this.A01) - 1;
        int i2 = i;
        if (i2 <= A002) {
            AnonymousClass83Z r4 = this.A0A;
            r4.clear();
            if (i2 <= A002) {
                int i3 = i2;
                while (true) {
                    Object obj = this.A07.get(r7.A04().get(i3));
                    C04220Ms.A0A(obj);
                    r4.A00.add(((C110236lL) obj).A01);
                    if (i3 == A002) {
                        break;
                    }
                    i3++;
                }
            }
            this.A04.BCP(r4);
            Snapshot A022 = C121637Hc.A02();
            try {
                A052 = A022.A05();
                boolean z = false;
                while (A002 >= i2) {
                    AnonymousClass7Y3 r13 = (AnonymousClass7Y3) r7.A04().get(A002);
                    Map map = this.A07;
                    Object obj2 = map.get(r13);
                    C04220Ms.A0A(obj2);
                    C110236lL r1 = (C110236lL) obj2;
                    Object obj3 = r1.A01;
                    if (r4.contains(obj3)) {
                        r13.A0G = AnonymousClass006.A0C;
                        this.A02++;
                        if (C86104wH.A1X(r1.A04)) {
                            C147368pE.A04(r1.A04, false);
                            z = true;
                        }
                    } else {
                        r9.A0L = true;
                        map.remove(r13);
                        C146068la r0 = r1.A00;
                        if (r0 != null) {
                            r0.dispose();
                        }
                        int i4 = (A002 + 1) - 1;
                        if (A002 <= i4) {
                            while (true) {
                                Object A032 = r7.A03(i4);
                                r8.A01.invoke();
                                AnonymousClass7Y3.A06(r9, (AnonymousClass7Y3) A032);
                                if (i4 == A002) {
                                    break;
                                }
                                i4--;
                            }
                        }
                        r9.A0L = false;
                    }
                    this.A09.remove(obj3);
                    A002--;
                }
                C86144wL.A1N(A052);
                A022.A0A();
                if (z) {
                    C121637Hc.A04();
                }
            } catch (Throwable th) {
                A022.A0A();
                throw th;
            }
        }
        A03();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        if (r1 == -1) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass7Y3 A00(X.AnonymousClass7H8 r10, java.lang.Object r11) {
        /*
            int r0 = r10.A02
            r2 = 0
            if (r0 == 0) goto L_0x0085
            X.7Y3 r0 = r10.A06
            X.6fg r0 = r0.A0Z
            X.84X r7 = r0.A00
            int r9 = X.AnonymousClass84X.A00(r7)
            int r0 = r10.A01
            int r9 = r9 - r0
            int r0 = r10.A02
            int r6 = r9 - r0
            r4 = 1
            int r9 = r9 - r4
            r1 = r9
        L_0x0019:
            r8 = -1
            if (r1 < r6) goto L_0x0039
            java.util.List r0 = r7.A04()
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r5 = r10.A07
            java.lang.Object r0 = r5.get(r0)
            X.C04220Ms.A0A(r0)
            X.6lL r0 = (X.C110236lL) r0
            java.lang.Object r0 = r0.A01
            boolean r0 = X.C04220Ms.A0I(r0, r11)
            if (r0 == 0) goto L_0x0089
            if (r1 != r8) goto L_0x005b
        L_0x0039:
            if (r9 < r6) goto L_0x0085
            java.util.List r0 = r7.A04()
            java.lang.Object r0 = r0.get(r9)
            java.util.Map r5 = r10.A07
            java.lang.Object r3 = r5.get(r0)
            X.C04220Ms.A0A(r3)
            X.6lL r3 = (X.C110236lL) r3
            androidx.compose.ui.layout.SubcomposeSlotReusePolicy r1 = r10.A04
            java.lang.Object r0 = r3.A01
            boolean r0 = r1.A9A(r11, r0)
            if (r0 == 0) goto L_0x0086
            r3.A01 = r11
            r1 = r9
        L_0x005b:
            if (r1 == r8) goto L_0x0085
            if (r1 == r6) goto L_0x0062
            A01(r10, r1, r6)
        L_0x0062:
            int r0 = r10.A02
            int r0 = r0 + -1
            r10.A02 = r0
            java.util.List r0 = r7.A04()
            java.lang.Object r2 = r0.get(r6)
            X.7Y3 r2 = (X.AnonymousClass7Y3) r2
            java.lang.Object r1 = r5.get(r2)
            X.C04220Ms.A0A(r1)
            X.6lL r1 = (X.C110236lL) r1
            X.8pE r0 = r1.A04
            X.C147368pE.A04(r0, r4)
            r1.A03 = r4
            X.C121637Hc.A04()
        L_0x0085:
            return r2
        L_0x0086:
            int r9 = r9 + -1
            goto L_0x0039
        L_0x0089:
            int r1 = r1 + -1
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7H8.A00(X.7H8, java.lang.Object):X.7Y3");
    }

    public static final void A02(AnonymousClass7H8 r10, AnonymousClass7Y3 r11, Object obj, AnonymousClass0YP r13) {
        boolean z;
        Snapshot A052;
        Map map = r10.A07;
        Object obj2 = map.get(r11);
        if (obj2 == null) {
            obj2 = new C110236lL(obj, AnonymousClass303.A00);
            map.put(r11, obj2);
        }
        C110236lL r5 = (C110236lL) obj2;
        C146068la r0 = r5.A00;
        if (r0 != null) {
            z = r0.Alt();
        } else {
            z = true;
        }
        if (r5.A02 != r13 || z || r5.A03) {
            r5.A02 = r13;
            Snapshot A022 = C121637Hc.A02();
            try {
                A052 = A022.A05();
                AnonymousClass7Y3 r7 = r10.A06;
                r7.A0L = true;
                AnonymousClass0YP r4 = r5.A02;
                C146068la r02 = r5.A00;
                C115506vH r3 = r10.A03;
                if (r3 != null) {
                    AnonymousClass7WY A012 = AnonymousClass7WY.A01(new KtLambdaShape48S0200000_I2(9, r4, r5), -34810602, true);
                    if (r02 == null || r02.BSt()) {
                        C04220Ms.A0B(r11, 0);
                        r02 = new AnonymousClass7W5(new C874952z(r11), r3);
                    }
                    r02.CjK(A012);
                    r5.A00 = r02;
                    r7.A0L = false;
                    C86144wL.A1N(A052);
                    A022.A0A();
                    r5.A03 = false;
                    return;
                }
                throw C18180wK.A0a("parent composition reference not set");
            } catch (Throwable th) {
                A022.A0A();
                throw th;
            }
        }
    }

    public final void A03() {
        Map map = this.A07;
        int size = map.size();
        AnonymousClass84X r5 = this.A06.A0Z.A00;
        if (size != AnonymousClass84X.A00(r5)) {
            throw C18190wL.A0a(AnonymousClass00U.A0Z("Inconsistency between the count of nodes tracked by the state (", ") and the children count on the SubcomposeLayout (", "). Are you trying to use the state of the disposed SubcomposeLayout?", map.size(), AnonymousClass84X.A00(r5)));
        } else if ((AnonymousClass84X.A00(r5) - this.A02) - this.A01 >= 0) {
            Map map2 = this.A08;
            int size2 = map2.size();
            int i = this.A01;
            if (size2 != i) {
                throw C18190wL.A0a(AnonymousClass00U.A01(i, map2.size(), "Incorrect state. Precomposed children ", ". Map size "));
            }
        } else {
            throw C18190wL.A0a(AnonymousClass00U.A0b("Incorrect state. Total children ", ". Reusable children ", ". Precomposed children ", AnonymousClass84X.A00(r5), this.A02, this.A01));
        }
    }
}
