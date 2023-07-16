package X;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.unit.Constraints;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.7Y3  reason: invalid class name */
public final class AnonymousClass7Y3 implements C147788pu, C145718ky, C147028nG, C143008fx, C143018fy {
    public static final Comparator A0d = C1366083m.A00;
    public static final AnonymousClass0ZU A0e = AnonymousClass8Fd.A00;
    public static final C123497Xd A0f = new AnonymousClass54O();
    public static final C146118lf A0g = new C123677Yb();
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public AnonymousClass84X A05;
    public Modifier A06;
    public AnonymousClass7H8 A07;
    public C146288ly A08;
    public AnonymousClass54T A09;
    public C147098nO A0A;
    public C146118lf A0B;
    public C147168nV A0C;
    public AnonymousClass69J A0D;
    public C872050o A0E;
    public Integer A0F;
    public Integer A0G;
    public Integer A0H;
    public AnonymousClass0YY A0I;
    public AnonymousClass0YY A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public int A0R;
    public AnonymousClass7Y3 A0S;
    public Integer A0T;
    public boolean A0U;
    public boolean A0V;
    public final int A0W;
    public final AnonymousClass75N A0X;
    public final C113976sU A0Y;
    public final C106826fg A0Z;
    public final AnonymousClass7IW A0a;
    public final boolean A0b;
    public final AnonymousClass84X A0c;

    public final void A0M(C147098nO r9) {
        int i;
        C147098nO r1;
        int i2 = 0;
        if (this.A0A == null) {
            String str = null;
            AnonymousClass7Y3 r12 = this.A0S;
            if (r12 == null || C04220Ms.A0I(r12.A0A, r9)) {
                AnonymousClass7Y3 A092 = A09();
                if (A092 == null) {
                    this.A0N = true;
                }
                this.A0A = r9;
                if (A092 != null) {
                    i = A092.A01;
                } else {
                    i = -1;
                }
                this.A01 = i + 1;
                if (AnonymousClass7FT.A01(this) != null) {
                    r9.CJp();
                }
                AnonymousClass7IW r4 = this.A0a;
                r4.A04();
                AnonymousClass84X r0 = this.A0Z.A00;
                int i3 = r0.A00;
                if (i3 > 0) {
                    Object[] objArr = r0.A01;
                    do {
                        ((AnonymousClass7Y3) objArr[i2]).A0M(r9);
                        i2++;
                    } while (i2 < i3);
                }
                A0P(false);
                if (A092 != null) {
                    A092.A0P(false);
                }
                AnonymousClass54T r2 = r4.A04;
                AnonymousClass54T r13 = r4.A06.A06;
                while (!C04220Ms.A0I(r2, r13) && r2 != null) {
                    AnonymousClass54T.A07(r2, r2.A0A, false);
                    r2 = r2.A06;
                }
                AnonymousClass0YY r02 = this.A0I;
                if (r02 != null) {
                    r02.invoke(r9);
                }
                this.A0Y.A00();
                AnonymousClass7YG r42 = r4.A02;
                if ((7168 & r42.A00) != 0) {
                    do {
                        boolean z = true;
                        boolean A1V = C18180wK.A1V(1024 & r42.A01) | C18180wK.A1V(2048 & r42.A01);
                        if ((4096 & r42.A01) == 0) {
                            z = false;
                        }
                        if (A1V || z) {
                            C115916w7.A01(r42, 1);
                        }
                        r42 = r42.A02;
                    } while (r42 != null);
                    return;
                }
                return;
            }
            StringBuilder A0s = C18190wL.A0s("Attaching to a different owner(");
            A0s.append(r9);
            A0s.append(") than the parent's owner(");
            AnonymousClass7Y3 A093 = A09();
            if (A093 != null) {
                r1 = A093.A0A;
            } else {
                r1 = null;
            }
            A0s.append(r1);
            A0s.append("). This tree: ");
            A0s.append(A00(0));
            A0s.append(" Parent tree: ");
            AnonymousClass7Y3 r14 = this.A0S;
            if (r14 != null) {
                str = r14.A00(0);
            }
            throw C18180wK.A0a(C18180wK.A0i(str, A0s));
        }
        StringBuilder A0s2 = C18190wL.A0s("Cannot attach ");
        A0s2.append(this);
        A0s2.append(" as it already is attached.  Tree: ");
        throw C18180wK.A0a(C18180wK.A0i(A00(0), A0s2));
    }

    public final void ANV() {
        A0P(false);
        AnonymousClass54J r1 = this.A0Y.A08;
        if (r1.A05) {
            long j = r1.A03;
            C147098nO r0 = this.A0A;
            if (r0 != null) {
                r0.Bg6(this, j);
                return;
            }
            return;
        }
        C147098nO r12 = this.A0A;
        if (r12 != null) {
            r12.Bg5(true);
        }
    }

    public final void CkD(C147168nV r3) {
        C04220Ms.A0B(r3, 0);
        if (!C04220Ms.A0I(this.A0C, r3)) {
            this.A0C = r3;
            A0P(false);
            AnonymousClass7Y3 A092 = A09();
            if (A092 != null) {
                A092.A0D();
            }
            A0E();
        }
    }

    private final void A01() {
        AnonymousClass7Y3 A092;
        if (this.A0R > 0) {
            this.A0Q = true;
        }
        if (this.A0b && (A092 = A09()) != null) {
            A092.A0Q = true;
        }
    }

    private final void A02() {
        AnonymousClass7IW r1 = this.A0a;
        AnonymousClass84X r0 = r1.A01;
        if (r0 != null) {
            int i = r0.A00;
            AnonymousClass7YG r12 = r1.A05;
            while (true) {
                r12 = r12.A04;
                i--;
                if (r12 != null && i >= 0) {
                    if (r12.A08) {
                        if (r12.A08) {
                            r12.A04();
                            r12.A05();
                        } else {
                            throw C18180wK.A0a("Check failed.");
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public static final void A03(AnonymousClass7Y3 r5) {
        r5.A0T = r5.A0F;
        r5.A0F = AnonymousClass006.A0C;
        AnonymousClass84X A082 = r5.A08();
        int i = A082.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A082.A01;
            do {
                AnonymousClass7Y3 r2 = (AnonymousClass7Y3) objArr[i2];
                if (r2.A0F == AnonymousClass006.A01) {
                    A03(r2);
                }
                i2++;
            } while (i2 < i);
        }
    }

    public static final void A04(AnonymousClass7Y3 r9) {
        boolean z = r9.A0N;
        r9.A0N = true;
        if (!z && r9.A0Y.A06) {
            r9.A0P(true);
        }
        AnonymousClass7IW r0 = r9.A0a;
        AnonymousClass54T r2 = r0.A04;
        AnonymousClass54T r1 = r0.A06.A06;
        while (!C04220Ms.A0I(r2, r1) && r2 != null) {
            if (r2.A0C) {
                r2.A0O();
            }
            r2 = r2.A06;
        }
        AnonymousClass84X A082 = r9.A08();
        int i = A082.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A082.A01;
            do {
                AnonymousClass7Y3 r4 = (AnonymousClass7Y3) objArr[i2];
                if (r4.A03 != Integer.MAX_VALUE) {
                    A04(r4);
                    C113976sU r3 = r4.A0Y;
                    Integer num = r3.A01;
                    if (num.intValue() != 4) {
                        throw C18180wK.A0a(AnonymousClass00U.A0L("Unexpected state ", C98306Ez.A00(num)));
                    } else if (r3.A06) {
                        r4.A0P(true);
                    } else if (r3.A02) {
                        r4.A0O(true);
                    } else if (r3.A04) {
                        r4.A0N(true);
                    }
                }
                i2++;
            } while (i2 < i);
        }
    }

    public static final void A05(AnonymousClass7Y3 r4) {
        if (r4.A0N) {
            int i = 0;
            r4.A0N = false;
            AnonymousClass84X A082 = r4.A08();
            int i2 = A082.A00;
            if (i2 > 0) {
                Object[] objArr = A082.A01;
                do {
                    A05((AnonymousClass7Y3) objArr[i]);
                    i++;
                } while (i < i2);
            }
        }
    }

    public static final void A06(AnonymousClass7Y3 r5, AnonymousClass7Y3 r6) {
        if (r6.A0Y.A00 > 0) {
            C113976sU r1 = r5.A0Y;
            r1.A01(r1.A00 - 1);
        }
        if (r5.A0A != null) {
            r6.A0C();
        }
        r6.A0S = null;
        r6.A0a.A04.A07 = null;
        if (r6.A0b) {
            r5.A0R--;
            AnonymousClass84X r0 = r6.A0Z.A00;
            int i = r0.A00;
            if (i > 0) {
                int i2 = 0;
                Object[] objArr = r0.A01;
                do {
                    ((AnonymousClass7Y3) objArr[i2]).A0a.A04.A07 = null;
                    i2++;
                } while (i2 < i);
            }
        }
        r5.A01();
        r5.A0F();
    }

    public final AnonymousClass84X A07() {
        if (this.A0V) {
            AnonymousClass84X r2 = this.A0c;
            r2.A05();
            r2.A09(A08(), r2.A00);
            r2.A0A(A0d);
            this.A0V = false;
        }
        return this.A0c;
    }

    public final AnonymousClass7Y3 A09() {
        AnonymousClass7Y3 r2 = this.A0S;
        if (r2 == null || !r2.A0b) {
            return r2;
        }
        return r2.A09();
    }

    public final List A0A() {
        AnonymousClass54J r7 = this.A0Y.A08;
        AnonymousClass7Y3 r8 = r7.A0B.A07;
        r8.A0J();
        boolean z = r7.A04;
        AnonymousClass84X r6 = r7.A09;
        if (z) {
            C138678La r5 = C138678La.A00;
            AnonymousClass84X A082 = r8.A08();
            int i = A082.A00;
            if (i > 0) {
                int i2 = 0;
                Object[] objArr = A082.A01;
                do {
                    Object obj = objArr[i2];
                    int i3 = r6.A00;
                    Object invoke = r5.invoke(obj);
                    if (i3 <= i2) {
                        r6.A0C(invoke);
                    } else {
                        r6.A01[i2] = invoke;
                    }
                    i2++;
                } while (i2 < i);
            }
            r6.A07(AnonymousClass84X.A00(r8.A08()), r6.A00);
            r7.A04 = false;
        }
        return r6.A04();
    }

    public final void A0B() {
        this.A0T = this.A0F;
        Integer num = AnonymousClass006.A0C;
        this.A0F = num;
        AnonymousClass84X A082 = A08();
        int i = A082.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A082.A01;
            do {
                AnonymousClass7Y3 r1 = (AnonymousClass7Y3) objArr[i2];
                if (r1.A0F != num) {
                    r1.A0B();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final void A0C() {
        C147098nO r5 = this.A0A;
        String str = null;
        if (r5 == null) {
            AnonymousClass7Y3 A092 = A09();
            if (A092 != null) {
                str = A092.A00(0);
            }
            throw C18180wK.A0a(AnonymousClass00U.A0L("Cannot detach node that is already detached!  Tree: ", str));
        }
        AnonymousClass7IW r1 = this.A0a;
        if ((r1.A02.A00 & 1024) != 0) {
            for (AnonymousClass7YG r7 = r1.A05; r7 != null; r7 = r7.A04) {
                if ((r7.A01 & 1024) != 0 && (r7 instanceof C875353d)) {
                    C875353d r2 = (C875353d) r7;
                    if (r2.A00.BUK()) {
                        ((AndroidComposeView) AnonymousClass6F0.A00(this)).A0Q.ADB(true, false);
                        r2.A08();
                    }
                }
            }
        }
        AnonymousClass7Y3 A093 = A09();
        if (A093 != null) {
            A093.A0D();
            A093.A0P(false);
            this.A0G = AnonymousClass006.A0C;
        }
        AnonymousClass78z r0 = this.A0Y.A08.A0A;
        r0.A01 = true;
        r0.A06 = false;
        r0.A02 = false;
        r0.A05 = false;
        r0.A04 = false;
        r0.A03 = false;
        r0.A00 = null;
        AnonymousClass0YY r02 = this.A0J;
        if (r02 != null) {
            r02.invoke(r5);
        }
        if (AnonymousClass7FT.A01(this) != null) {
            r5.CJp();
        }
        for (AnonymousClass7YG r12 = r1.A05; r12 != null; r12 = r12.A04) {
            if (r12.A08) {
                r12.A05();
            }
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) r5;
        androidComposeView.A0X.A03.A01(this);
        androidComposeView.A09 = true;
        this.A0A = null;
        this.A01 = 0;
        AnonymousClass84X r03 = this.A0Z.A00;
        int i = r03.A00;
        if (i > 0) {
            Object[] objArr = r03.A01;
            int i2 = 0;
            do {
                ((AnonymousClass7Y3) objArr[i2]).A0C();
                i2++;
            } while (i2 < i);
        }
        this.A03 = Integer.MAX_VALUE;
        this.A04 = Integer.MAX_VALUE;
        this.A0N = false;
    }

    public final void A0D() {
        if (this.A0M) {
            AnonymousClass7IW r0 = this.A0a;
            AnonymousClass54T r3 = r0.A06;
            AnonymousClass54T r2 = r0.A04.A07;
            this.A09 = null;
            while (true) {
                if (C04220Ms.A0I(r3, r2)) {
                    break;
                } else if (r3 == null) {
                    r3 = null;
                } else if (r3.A08 != null) {
                    this.A09 = r3;
                    break;
                } else {
                    r3 = r3.A07;
                }
            }
        }
        AnonymousClass54T r1 = this.A09;
        if (r1 == null) {
            AnonymousClass7Y3 A092 = A09();
            if (A092 != null) {
                A092.A0D();
            }
        } else if (r1.A08 != null) {
            r1.A0O();
        } else {
            throw C18190wL.A0a("Required value was null.");
        }
    }

    public final void A0E() {
        AnonymousClass7IW r0 = this.A0a;
        C877654k r1 = r0.A06;
        for (AnonymousClass54T r2 = r0.A04; r2 != r1; r2 = r2.A06) {
            C04220Ms.A0C(r2, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            C146648mb r02 = r2.A08;
            if (r02 != null) {
                r02.invalidate();
            }
        }
        C146648mb r03 = r1.A08;
        if (r03 != null) {
            r03.invalidate();
        }
    }

    public final void A0F() {
        if (this.A0b) {
            AnonymousClass7Y3 A092 = A09();
            if (A092 != null) {
                A092.A0F();
                return;
            }
            return;
        }
        this.A0V = true;
    }

    public final void A0G() {
        C106826fg r3 = this.A0Z;
        AnonymousClass84X r2 = r3.A00;
        int i = r2.A00;
        while (true) {
            i--;
            if (-1 < i) {
                A06(this, (AnonymousClass7Y3) r2.A01[i]);
            } else {
                r2.A05();
                r3.A01.invoke();
                return;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A0H() {
        if (this.A0F == AnonymousClass006.A0C) {
            A03(this);
        }
        try {
            this.A0P = true;
            AnonymousClass54J r4 = this.A0Y.A08;
            if (r4.A07) {
                long j = r4.A01;
                AnonymousClass54J.A01(r4, r4.A03, r4.A00, j);
                this.A0P = false;
                return;
            }
            throw C18180wK.A0a("Check failed.");
        } catch (Throwable th) {
            this.A0P = false;
            throw th;
        }
    }

    public final void A0J() {
        if (this.A0R > 0 && this.A0Q) {
            int i = 0;
            this.A0Q = false;
            AnonymousClass84X r4 = this.A05;
            if (r4 == null) {
                r4 = AnonymousClass84X.A01(new AnonymousClass7Y3[16]);
                this.A05 = r4;
            }
            r4.A05();
            AnonymousClass84X r0 = this.A0Z.A00;
            int i2 = r0.A00;
            if (i2 > 0) {
                Object[] objArr = r0.A01;
                do {
                    AnonymousClass7Y3 r1 = (AnonymousClass7Y3) objArr[i];
                    if (r1.A0b) {
                        r4.A09(r1.A08(), r4.A00);
                    } else {
                        r4.A0C(r1);
                    }
                    i++;
                } while (i < i2);
            }
            this.A0Y.A08.A04 = true;
        }
    }

    public final void A0K(int i, int i2, int i3) {
        if (i != i2) {
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = i;
                if (i > i2) {
                    i5 = i + i4;
                }
                int i6 = i2 + i4;
                if (i <= i2) {
                    i6 = (i2 + i3) - 2;
                }
                C106826fg r0 = this.A0Z;
                AnonymousClass84X r2 = r0.A00;
                Object A032 = r2.A03(i5);
                AnonymousClass0ZU r02 = r0.A01;
                r02.invoke();
                r2.A08(i6, A032);
                r02.invoke();
            }
            A0F();
            A01();
            A0P(false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.54T] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0L(X.AnonymousClass7Y3 r7, int r8) {
        /*
            r6 = this;
            X.7Y3 r0 = r7.A0S
            r4 = 0
            boolean r0 = X.C18220wO.A1U(r0)
            java.lang.String r5 = " Other tree: "
            java.lang.String r2 = "Cannot insert "
            r3 = 0
            if (r0 != 0) goto L_0x0038
            java.lang.StringBuilder r1 = X.C18200wM.A0r()
            r1.append(r2)
            r1.append(r7)
            java.lang.String r0 = " because it already has a parent. This tree: "
            r1.append(r0)
            java.lang.String r0 = r6.A00(r4)
            r1.append(r0)
            r1.append(r5)
            X.7Y3 r0 = r7.A0S
            if (r0 == 0) goto L_0x002f
            java.lang.String r3 = r0.A00(r4)
        L_0x002f:
            java.lang.String r0 = X.C18180wK.A0i(r3, r1)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0038:
            X.8nO r0 = r7.A0A
            if (r0 != 0) goto L_0x00b1
            r7.A0S = r6
            X.6fg r1 = r6.A0Z
            X.84X r0 = r1.A00
            r0.A08(r8, r7)
            X.0ZU r0 = r1.A01
            r0.invoke()
            r6.A0F()
            boolean r2 = r7.A0b
            if (r2 == 0) goto L_0x005d
            boolean r0 = r6.A0b
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00aa
            int r0 = r6.A0R
            int r0 = r0 + 1
            r6.A0R = r0
        L_0x005d:
            r6.A01()
            X.7IW r0 = r7.A0a
            X.54T r1 = r0.A04
            boolean r0 = r6.A0b
            if (r0 == 0) goto L_0x00a7
            X.7Y3 r0 = r6.A0S
            if (r0 == 0) goto L_0x0070
            X.7IW r0 = r0.A0a
        L_0x006e:
            X.54k r3 = r0.A06
        L_0x0070:
            r1.A07 = r3
            if (r2 == 0) goto L_0x0090
            X.6fg r0 = r7.A0Z
            X.84X r0 = r0.A00
            int r3 = r0.A00
            if (r3 <= 0) goto L_0x0090
            java.lang.Object[] r2 = r0.A01
        L_0x007e:
            r0 = r2[r4]
            X.7Y3 r0 = (X.AnonymousClass7Y3) r0
            X.7IW r0 = r0.A0a
            X.54T r1 = r0.A04
            X.7IW r0 = r6.A0a
            X.54k r0 = r0.A06
            r1.A07 = r0
            int r4 = r4 + 1
            if (r4 < r3) goto L_0x007e
        L_0x0090:
            X.8nO r0 = r6.A0A
            if (r0 == 0) goto L_0x0097
            r7.A0M(r0)
        L_0x0097:
            X.6sU r0 = r7.A0Y
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x00a6
            X.6sU r1 = r6.A0Y
            int r0 = r1.A00
            int r0 = r0 + 1
            r1.A01(r0)
        L_0x00a6:
            return
        L_0x00a7:
            X.7IW r0 = r6.A0a
            goto L_0x006e
        L_0x00aa:
            java.lang.String r0 = "Virtual LayoutNode can't be added into a virtual parent"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x00b1:
            java.lang.StringBuilder r1 = X.C18200wM.A0r()
            r1.append(r2)
            r1.append(r7)
            java.lang.String r0 = " because it already has an owner. This tree: "
            r1.append(r0)
            java.lang.String r0 = r6.A00(r4)
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r7.A00(r4)
            java.lang.String r0 = X.C18180wK.A0i(r0, r1)
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Y3.A0L(X.7Y3, int):void");
    }

    public final void A0N(boolean z) {
        C147098nO r1;
        AnonymousClass7Y3 A092;
        if (!this.A0b && (r1 = this.A0A) != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) r1;
            AnonymousClass7HO r3 = androidComposeView.A0X;
            C113976sU r5 = this.A0Y;
            int intValue = r5.A01.intValue();
            if (intValue != 1) {
                if (intValue != 0) {
                    if (intValue == 3) {
                        return;
                    }
                    if (!(intValue == 2 || intValue == 4)) {
                        throw AnonymousClass4VZ.A00();
                    }
                }
                if (!r5.A04 || z) {
                    r5.A04 = true;
                    r5.A05 = true;
                    r5.A02 = true;
                    r5.A03 = true;
                    if (C18190wL.A1Z((Object) null, true) && ((A092 = A09()) == null || !A092.A0Y.A04)) {
                        r3.A03.A00(this);
                    }
                    if (!r3.A01 && !androidComposeView.isLayoutRequested() && androidComposeView.isAttachedToWindow()) {
                        if (androidComposeView.getWidth() == 0 || androidComposeView.getHeight() == 0) {
                            androidComposeView.requestLayout();
                        } else {
                            androidComposeView.invalidate();
                        }
                    }
                }
            }
        }
    }

    public final void A0O(boolean z) {
        C147098nO r1;
        if (!this.A0b && (r1 = this.A0A) != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) r1;
            if (androidComposeView.A0X.A05(this, z) && !androidComposeView.isLayoutRequested() && androidComposeView.isAttachedToWindow()) {
                if (androidComposeView.getWidth() == 0 || androidComposeView.getHeight() == 0) {
                    androidComposeView.requestLayout();
                } else {
                    androidComposeView.invalidate();
                }
            }
        }
    }

    public final void A0P(boolean z) {
        C147098nO r4;
        AnonymousClass7Y3 A092;
        if (!this.A0L && !this.A0b && (r4 = this.A0A) != null) {
            AndroidComposeView androidComposeView = (AndroidComposeView) r4;
            if (androidComposeView.A0X.A06(this, z)) {
                AnonymousClass7Y3 r5 = this;
                if (!androidComposeView.isLayoutRequested() && androidComposeView.isAttachedToWindow()) {
                    while (r5.A0G == AnonymousClass006.A00) {
                        if (!androidComposeView.A0B) {
                            AnonymousClass7Y3 A093 = r5.A09();
                            if (A093 == null) {
                                break;
                            }
                            long j = A093.A0a.A06.A03;
                            if (Constraints.A02(j) == Constraints.A04(j) && Constraints.A01(j) == Constraints.A03(j)) {
                                break;
                            }
                        }
                        r5 = r5.A09();
                        if (r5 == null) {
                            break;
                        }
                    }
                    if (r5 == androidComposeView.A0V || androidComposeView.getWidth() == 0 || androidComposeView.getHeight() == 0) {
                        androidComposeView.requestLayout();
                    } else {
                        androidComposeView.invalidate();
                    }
                }
            }
            AnonymousClass7Y3 r0 = this.A0Y.A08.A0B.A07;
            AnonymousClass7Y3 A094 = r0.A09();
            Integer num = r0.A0F;
            if (A094 != null && num != AnonymousClass006.A0C) {
                while (A094.A0F == num && (A092 = A094.A09()) != null) {
                    A094 = A092;
                }
                int intValue = num.intValue();
                if (intValue == 0) {
                    A094.A0P(z);
                } else if (intValue == 1) {
                    A094.A0O(z);
                } else {
                    throw C18180wK.A0a("Intrinsics isn't used by the parent");
                }
            }
        }
    }

    public final boolean BZg() {
        return AnonymousClass0wJ.A1W(this.A0A);
    }

    public final void BtB() {
        C872050o r0 = this.A0E;
        if (r0 != null) {
            r0.BtB();
        }
        this.A0U = true;
        A02();
    }

    public final void C4L() {
        C877654k r5 = this.A0a.A06;
        AnonymousClass7YG A0L2 = r5.A0L();
        AnonymousClass7YG A022 = AnonymousClass54T.A02(r5, true);
        while (A022 != null && (A022.A00 & 128) != 0) {
            if ((A022.A01 & 128) != 0 && (A022 instanceof C147678pj)) {
                AnonymousClass53X r0 = (AnonymousClass53X) ((C147678pj) A022);
                r0.A01 = r5;
                C147538pV r1 = r0.A00;
                if (r1 instanceof C147448pM) {
                    ((C147448pM) r1).CBC(r5);
                }
            }
            if (A022 != A0L2) {
                A022 = A022.A02;
            } else {
                return;
            }
        }
    }

    public final void CFI() {
        C872050o r0 = this.A0E;
        if (r0 != null) {
            r0.CFI();
        }
        AnonymousClass7IW r02 = this.A0a;
        AnonymousClass54T r3 = r02.A04;
        AnonymousClass54T r2 = r02.A06.A06;
        while (!C04220Ms.A0I(r3, r2) && r3 != null) {
            r3.A0D = true;
            if (r3.A08 != null) {
                AnonymousClass54T.A07(r3, (AnonymousClass0YY) null, false);
            }
            r3 = r3.A06;
        }
    }

    public final void CHS() {
        C872050o r0 = this.A0E;
        if (r0 != null) {
            r0.CHS();
        }
        if (this.A0U) {
            this.A0U = false;
        } else {
            A02();
        }
        this.A0a.A04();
    }

    public final void Cmu(C146288ly r2) {
        if (!C04220Ms.A0I(this.A08, r2)) {
            this.A08 = r2;
            this.A0X.A00.CrC(r2);
            A0P(false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cn8(androidx.compose.ui.Modifier r20) {
        /*
            r19 = this;
            r1 = r20
            r9 = 0
            X.C04220Ms.A0B(r1, r9)
            r4 = r19
            boolean r0 = r4.A0b
            if (r0 == 0) goto L_0x0019
            androidx.compose.ui.Modifier r2 = r4.A06
            X.7Wm r0 = androidx.compose.ui.Modifier.A00
            if (r2 == r0) goto L_0x0019
            java.lang.String r0 = "Modifiers are not supported on virtual LayoutNodes"
            java.lang.IllegalArgumentException r0 = X.C18190wL.A0a(r0)
            throw r0
        L_0x0019:
            r4.A06 = r1
            X.7IW r5 = r4.A0a
            X.7YG r0 = r5.A02
            X.53W r2 = X.C102816Wq.A00
            if (r0 == r2) goto L_0x01be
            r0.A04 = r2
            r2.A02 = r0
            r5.A02 = r2
            X.84X r10 = r5.A01
            r6 = 0
            if (r10 != 0) goto L_0x0034
            X.8pV[] r0 = new X.C147538pV[r9]
            X.84X r10 = X.AnonymousClass84X.A01(r0)
        L_0x0034:
            X.84X r3 = r5.A00
            if (r3 != 0) goto L_0x0040
            r0 = 16
            X.8pV[] r0 = new X.C147538pV[r0]
            X.84X r3 = X.AnonymousClass84X.A01(r0)
        L_0x0040:
            int r0 = r3.A00
            androidx.compose.ui.Modifier[] r0 = new androidx.compose.ui.Modifier[r0]
            X.84X r7 = X.AnonymousClass84X.A01(r0)
        L_0x0048:
            r7.A0C(r1)
        L_0x004b:
            int r0 = r7.A00
            if (r0 == 0) goto L_0x0077
            int r0 = r0 + -1
            java.lang.Object r1 = r7.A03(r0)
            androidx.compose.ui.Modifier r1 = (androidx.compose.ui.Modifier) r1
            boolean r0 = r1 instanceof X.C123317Wl
            if (r0 == 0) goto L_0x0065
            X.7Wl r1 = (X.C123317Wl) r1
            androidx.compose.ui.Modifier r0 = r1.A00
            r7.A0C(r0)
            androidx.compose.ui.Modifier r1 = r1.A01
            goto L_0x0048
        L_0x0065:
            boolean r0 = r1 instanceof X.C147538pV
            if (r0 == 0) goto L_0x006d
            r3.A0C(r1)
            goto L_0x004b
        L_0x006d:
            r0 = 37
            kotlin.jvm.internal.KtLambdaShape147S0100000_I2_2 r0 = X.C86154wM.A10(r3, r0)
            r1.A8A(r0)
            goto L_0x004b
        L_0x0077:
            int r11 = r3.A00
            int r12 = r10.A00
            r7 = 1
            if (r11 != r12) goto L_0x00bf
            X.7YG r8 = r5.A05
            X.7YG r13 = r8.A04
            int r12 = r12 - r7
            r11 = 0
            r16 = 0
        L_0x0086:
            if (r13 == 0) goto L_0x0103
            if (r12 < 0) goto L_0x0174
            java.lang.Object[] r0 = r10.A01
            r15 = r0[r12]
            X.8pV r15 = (X.C147538pV) r15
            java.lang.Object[] r0 = r3.A01
            r14 = r0[r12]
            X.8pV r14 = (X.C147538pV) r14
            X.C04220Ms.A0B(r15, r9)
            X.C04220Ms.A0B(r14, r7)
            boolean r0 = r15.equals(r14)
            if (r0 != 0) goto L_0x00af
            java.lang.Class r1 = r15.getClass()
            java.lang.Class r0 = r14.getClass()
            if (r1 != r0) goto L_0x00ff
            X.AnonymousClass7IW.A03(r15, r14, r13)
        L_0x00af:
            boolean r0 = r13.A08
            if (r0 != 0) goto L_0x00b5
            r16 = 1
        L_0x00b5:
            int r0 = r13.A01
            r11 = r11 | r0
            r13.A00 = r11
            X.7YG r13 = r13.A04
            int r12 = r12 + -1
            goto L_0x0086
        L_0x00bf:
            if (r12 != 0) goto L_0x00d9
            int r11 = r11 - r7
            X.7YG r1 = r5.A05
            r8 = r1
        L_0x00c5:
            if (r11 < 0) goto L_0x0110
            java.lang.Object[] r0 = r3.A01
            r0 = r0[r11]
            X.8pV r0 = (X.C147538pV) r0
            X.7YG r1 = X.AnonymousClass7IW.A00(r0, r1)
            int r0 = r1.A01
            r6 = r6 | r0
            r1.A00 = r6
            int r11 = r11 + -1
            goto L_0x00c5
        L_0x00d9:
            if (r11 != 0) goto L_0x00f0
            int r12 = r12 - r7
            X.7YG r8 = r5.A05
            X.7YG r0 = r8.A04
        L_0x00e0:
            r1 = r0
            if (r0 == 0) goto L_0x00ed
            if (r12 < 0) goto L_0x00ed
            X.7YG r0 = r0.A04
            X.AnonymousClass7IW.A01(r1)
            int r12 = r12 + -1
            goto L_0x00e0
        L_0x00ed:
            r6 = 1
            r7 = 0
            goto L_0x0111
        L_0x00f0:
            X.7YG r8 = r5.A05
            r13 = r10
            r14 = r3
            r15 = r8
            r16 = r5
            r17 = r12
            r18 = r11
            X.AnonymousClass7IW.A02(r13, r14, r15, r16, r17, r18)
            goto L_0x0110
        L_0x00ff:
            int r12 = r12 + 1
            X.7YG r13 = r13.A02
        L_0x0103:
            if (r12 <= 0) goto L_0x0174
            if (r13 == 0) goto L_0x01b7
            r16 = r12
            r15 = r12
            r14 = r5
            r12 = r3
            r11 = r10
            X.AnonymousClass7IW.A02(r11, r12, r13, r14, r15, r16)
        L_0x0110:
            r6 = 1
        L_0x0111:
            r5.A01 = r3
            r10.A05()
            r5.A00 = r10
            X.7YG r0 = r5.A02
            boolean r0 = X.C18180wK.A1Z(r0, r2)
            java.lang.String r1 = "Check failed."
            if (r0 == 0) goto L_0x01b2
            X.7YG r0 = r2.A02
            if (r0 != 0) goto L_0x0127
            r0 = r8
        L_0x0127:
            r5.A02 = r0
            r3 = 0
            r0.A04 = r3
            r2.A02 = r3
            if (r0 == r2) goto L_0x01ad
            if (r6 == 0) goto L_0x0187
            X.54k r6 = r5.A06
        L_0x0134:
            X.7YG r8 = r8.A04
            if (r8 == 0) goto L_0x0177
            int r0 = r8.A01
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0171
            boolean r0 = r8 instanceof X.C147768ps
            if (r0 == 0) goto L_0x0171
            X.54T r0 = r8.A06
            if (r0 == 0) goto L_0x0164
            X.54T r2 = r8.A06
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator"
            X.C04220Ms.A0C(r2, r0)
            X.54l r2 = (X.C877754l) r2
            X.8ps r1 = r2.A00
            r0 = r8
            X.8ps r0 = (X.C147768ps) r0
            X.C04220Ms.A0B(r0, r9)
            r2.A00 = r0
            if (r1 == r8) goto L_0x015e
            r2.A0N()
        L_0x015e:
            r6.A07 = r2
            r2.A06 = r6
            r6 = r2
            goto L_0x0134
        L_0x0164:
            X.7Y3 r1 = r5.A07
            r0 = r8
            X.8ps r0 = (X.C147768ps) r0
            X.54l r2 = new X.54l
            r2.<init>(r0, r1)
            r8.A06 = r2
            goto L_0x015e
        L_0x0171:
            r8.A06 = r6
            goto L_0x0134
        L_0x0174:
            r7 = r16
            goto L_0x0111
        L_0x0177:
            X.7Y3 r0 = r5.A07
            X.7Y3 r0 = r0.A09()
            if (r0 == 0) goto L_0x01a5
            X.7IW r0 = r0.A0a
            X.54k r0 = r0.A06
        L_0x0183:
            r6.A07 = r0
            r5.A04 = r6
        L_0x0187:
            if (r7 == 0) goto L_0x0192
            X.7Y3 r0 = r5.A07
            X.8nO r0 = r0.A0A
            if (r0 == 0) goto L_0x0192
            r5.A04()
        L_0x0192:
            X.54T r2 = r5.A04
            X.54k r0 = r5.A06
            X.54T r1 = r0.A06
        L_0x0198:
            boolean r0 = X.C04220Ms.A0I(r2, r1)
            if (r0 != 0) goto L_0x01a7
            if (r2 == 0) goto L_0x01a7
            r2.A05 = r3
            X.54T r2 = r2.A06
            goto L_0x0198
        L_0x01a5:
            r0 = 0
            goto L_0x0183
        L_0x01a7:
            X.6sU r0 = r4.A0Y
            r0.A00()
            return
        L_0x01ad:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x01b2:
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r1)
            throw r0
        L_0x01b7:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x01be:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7Y3.Cn8(androidx.compose.ui.Modifier):void");
    }

    public AnonymousClass7Y3(boolean z, int i) {
        this.A0b = z;
        this.A0W = i;
        this.A0Z = new C106826fg(AnonymousClass84X.A01(new AnonymousClass7Y3[16]), C86154wM.A13(this, 24));
        this.A0c = AnonymousClass84X.A01(new AnonymousClass7Y3[16]);
        this.A0V = true;
        this.A08 = A0f;
        this.A0X = new AnonymousClass75N(this);
        this.A0C = new AnonymousClass7ZI(1.0f, 1.0f);
        this.A0D = AnonymousClass69J.Ltr;
        this.A0B = A0g;
        this.A03 = Integer.MAX_VALUE;
        this.A04 = Integer.MAX_VALUE;
        Integer num = AnonymousClass006.A0C;
        this.A0G = num;
        this.A0H = num;
        this.A0F = num;
        this.A0T = num;
        this.A0a = new AnonymousClass7IW(this);
        this.A0Y = new C113976sU(this);
        this.A0M = true;
        this.A06 = Modifier.A00;
    }

    private final String A00(int i) {
        StringBuilder A0r = C18200wM.A0r();
        for (int i2 = 0; i2 < i; i2++) {
            A0r.append("  ");
        }
        A0r.append("|-");
        C86154wM.A1W(A0r, toString());
        AnonymousClass84X A082 = A08();
        int i3 = A082.A00;
        if (i3 > 0) {
            Object[] objArr = A082.A01;
            int i4 = 0;
            do {
                A0r.append(((AnonymousClass7Y3) objArr[i4]).A00(i + 1));
                i4++;
            } while (i4 < i3);
        }
        String A0n = C18190wL.A0n(A0r);
        if (i == 0) {
            return C18230wP.A0s(A0n, 0, A0n.length() - 1);
        }
        return A0n;
    }

    public final AnonymousClass84X A08() {
        A0J();
        if (this.A0R == 0) {
            return this.A0Z.A00;
        }
        AnonymousClass84X r0 = this.A05;
        C04220Ms.A0A(r0);
        return r0;
    }

    public final void A0I() {
        AnonymousClass84X A082 = A08();
        int i = A082.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A082.A01;
            do {
                AnonymousClass7Y3 r2 = (AnonymousClass7Y3) objArr[i2];
                Integer num = r2.A0T;
                r2.A0F = num;
                if (num != AnonymousClass006.A0C) {
                    r2.A0I();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final String toString() {
        StringBuilder A0r = C18200wM.A0r();
        A0r.append(AnonymousClass6F7.A00(this));
        A0r.append(" children: ");
        A0r.append(AnonymousClass84X.A00(A08()));
        A0r.append(" measurePolicy: ");
        return C18200wM.A0m(this.A08, A0r);
    }

    public AnonymousClass7Y3() {
        this(false, AnonymousClass55K.A01.addAndGet(1));
    }
}
