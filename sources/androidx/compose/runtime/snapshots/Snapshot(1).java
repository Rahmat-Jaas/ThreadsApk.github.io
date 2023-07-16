package androidx.compose.runtime.snapshots;

import X.AnonymousClass00J;
import X.AnonymousClass0YY;
import X.AnonymousClass53C;
import X.AnonymousClass53E;
import X.AnonymousClass53F;
import X.AnonymousClass53G;
import X.AnonymousClass53H;
import X.AnonymousClass53I;
import X.AnonymousClass6EQ;
import X.AnonymousClass76Y;
import X.AnonymousClass8LS;
import X.C04220Ms;
import X.C113516rY;
import X.C122127Kl;
import X.C134947yd;
import X.C145738l0;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18240wQ;
import X.C40948Lsi;
import X.C86154wM;
import java.util.Set;

public abstract class Snapshot {
    public int A00;
    public boolean A01;
    public int A02;
    public C134947yd A03;

    public void A0A() {
        this.A01 = true;
        synchronized (C122127Kl.A04) {
            int i = this.A00;
            if (i >= 0) {
                C122127Kl.A0A(i);
                this.A00 = -1;
            }
        }
    }

    public final int A04() {
        Snapshot A002;
        if (this instanceof AnonymousClass53H) {
            A002 = ((AnonymousClass53H) this).A00;
            if (A002 == null) {
                A002 = (Snapshot) C86154wM.A0e(C122127Kl.A07);
            }
        } else if (!(this instanceof AnonymousClass53E)) {
            return this.A02;
        } else {
            A002 = AnonymousClass53E.A00((AnonymousClass53E) this);
        }
        return A002.A04();
    }

    public final Snapshot A05() {
        C40948Lsi lsi = C122127Kl.A02;
        Snapshot snapshot = (Snapshot) lsi.A00();
        lsi.A01(this);
        return snapshot;
    }

    public final Snapshot A06(AnonymousClass0YY r8) {
        AnonymousClass53F r6;
        AnonymousClass0YY A012;
        Snapshot A06;
        if (this instanceof AnonymousClass53H) {
            AnonymousClass53H r3 = (AnonymousClass53H) this;
            A012 = AnonymousClass53I.A01(r8, r3.A01, r8);
            Snapshot snapshot = r3.A00;
            if (snapshot == null) {
                snapshot = (Snapshot) C86154wM.A0e(C122127Kl.A07);
            }
            A06 = snapshot.A06((AnonymousClass0YY) null);
        } else if (this instanceof AnonymousClass53G) {
            C122127Kl.A0B(this);
            return new AnonymousClass53F(this, A07(), r8, A04());
        } else if (this instanceof AnonymousClass53F) {
            AnonymousClass53F r0 = (AnonymousClass53F) this;
            int A04 = r0.A04();
            return new AnonymousClass53F(r0.A00, r0.A07(), r8, A04);
        } else {
            AnonymousClass53I r4 = (AnonymousClass53I) this;
            if (r4 instanceof AnonymousClass53E) {
                AnonymousClass53E r42 = (AnonymousClass53E) r4;
                A012 = AnonymousClass53I.A01(r8, r42.A05, r8);
                boolean z = r42.A00;
                AnonymousClass53I A002 = AnonymousClass53E.A00(r42);
                if (z) {
                    return A002.A06(A012);
                }
                A06 = A002.A06((AnonymousClass0YY) null);
            } else if (r4 instanceof AnonymousClass53C) {
                return (Snapshot) C122127Kl.A08(C86154wM.A10(C86154wM.A10(r8, 12), 13));
            } else {
                if (!(!r4.A01)) {
                    throw C18190wL.A0a("Cannot use a disposed snapshot");
                } else if (!r4.A02 || r4.A00 >= 0) {
                    int A042 = r4.A04();
                    r4.A0P(r4.A04());
                    Object obj = C122127Kl.A04;
                    synchronized (obj) {
                        int i = C122127Kl.A00;
                        C122127Kl.A00 = i + 1;
                        C122127Kl.A01 = C122127Kl.A01.A01(i);
                        C134947yd A07 = r4.A07();
                        C04220Ms.A0B(A07, 0);
                        for (int i2 = A042 + 1; i2 < i; i2++) {
                            A07 = A07.A01(i2);
                        }
                        r6 = new AnonymousClass53F(r4, A07, r8, i);
                    }
                    if (r4.A02 || r4.A01) {
                        return r6;
                    }
                    int A043 = r4.A04();
                    synchronized (obj) {
                        AnonymousClass53I.A02(r4);
                    }
                    C134947yd A072 = r4.A07();
                    int A044 = r4.A04();
                    C04220Ms.A0B(A072, 0);
                    for (int i3 = A043 + 1; i3 < A044; i3++) {
                        A072 = A072.A01(i3);
                    }
                    r4.A0H(A072);
                    return r6;
                } else {
                    throw C18180wK.A0a("Unsupported operation on a disposed or applied snapshot");
                }
            }
        }
        return C122127Kl.A01(A06, A012, true);
    }

    public final C134947yd A07() {
        Snapshot A002;
        if (this instanceof AnonymousClass53H) {
            A002 = ((AnonymousClass53H) this).A00;
            if (A002 == null) {
                A002 = (Snapshot) C86154wM.A0e(C122127Kl.A07);
            }
        } else if (!(this instanceof AnonymousClass53E)) {
            return this.A03;
        } else {
            A002 = AnonymousClass53E.A00((AnonymousClass53E) this);
        }
        return A002.A07();
    }

    public final AnonymousClass0YY A08() {
        if (this instanceof AnonymousClass53H) {
            return ((AnonymousClass53H) this).A01;
        }
        if (this instanceof AnonymousClass53G) {
            return ((AnonymousClass53G) this).A01;
        }
        if (this instanceof AnonymousClass53F) {
            return ((AnonymousClass53F) this).A01;
        }
        return ((AnonymousClass53I) this).A05;
    }

    public final void A09() {
        C134947yd A002;
        if (this instanceof AnonymousClass53I) {
            AnonymousClass53I r2 = (AnonymousClass53I) this;
            A002 = C122127Kl.A01.A00(r2.A04()).A02(r2.A01);
        } else {
            A002 = C122127Kl.A01.A00(A04());
        }
        C122127Kl.A01 = A002;
    }

    public final void A0B() {
        if (this instanceof AnonymousClass53H) {
            throw C18240wQ.A0j();
        } else if (this instanceof AnonymousClass53G) {
            ((AnonymousClass53G) this).A00++;
        } else if (this instanceof AnonymousClass53F) {
            throw C18240wQ.A0j();
        } else {
            AnonymousClass53I r1 = (AnonymousClass53I) this;
            if (r1 instanceof AnonymousClass53E) {
                throw C18240wQ.A0j();
            } else if (r1 instanceof AnonymousClass53C) {
                throw C18240wQ.A0j();
            } else {
                r1.A00++;
            }
        }
    }

    public final void A0C() {
        if (this instanceof AnonymousClass53H) {
            throw C18240wQ.A0j();
        } else if (this instanceof AnonymousClass53G) {
            AnonymousClass53G r1 = (AnonymousClass53G) this;
            int i = r1.A00 - 1;
            r1.A00 = i;
            if (i == 0) {
                r1.A0F();
            }
        } else if (this instanceof AnonymousClass53F) {
            throw C18240wQ.A0j();
        } else {
            AnonymousClass53I r5 = (AnonymousClass53I) this;
            if (r5 instanceof AnonymousClass53E) {
                throw C18240wQ.A0j();
            } else if (r5 instanceof AnonymousClass53C) {
                throw C18240wQ.A0j();
            } else {
                int i2 = r5.A00;
                if (i2 > 0) {
                    int i3 = i2 - 1;
                    r5.A00 = i3;
                    if (i3 == 0 && !r5.A02) {
                        Set<C145738l0> A0N = r5.A0N();
                        if (A0N != null) {
                            if (!r5.A02) {
                                r5.A0Q((Set) null);
                                int A04 = r5.A04();
                                for (C145738l0 Ail : A0N) {
                                    for (C113516rY Ail2 = Ail.Ail(); Ail2 != null; Ail2 = Ail2.A01) {
                                        if (Ail2.A00 == A04 || AnonymousClass00J.A0k(r5.A01, Integer.valueOf(Ail2.A00))) {
                                            Ail2.A00 = 0;
                                        }
                                    }
                                }
                            } else {
                                throw C18180wK.A0a("Unsupported operation on a snapshot that has been applied");
                            }
                        }
                        r5.A0F();
                        return;
                    }
                    return;
                }
                throw C18190wL.A0a("Failed requirement.");
            }
        }
    }

    public final void A0D() {
        Snapshot A002;
        if (this instanceof AnonymousClass53H) {
            A002 = ((AnonymousClass53H) this).A00;
            if (A002 == null) {
                A002 = (Snapshot) C86154wM.A0e(C122127Kl.A07);
            }
        } else if (!(this instanceof AnonymousClass53G) && !(this instanceof AnonymousClass53F)) {
            AnonymousClass53I r1 = (AnonymousClass53I) this;
            if (r1 instanceof AnonymousClass53E) {
                A002 = AnonymousClass53E.A00((AnonymousClass53E) r1);
            } else if (r1 instanceof AnonymousClass53C) {
                C122127Kl.A08(AnonymousClass8LS.A00);
                return;
            } else if (!r1.A02 && !r1.A01) {
                r1.A0O();
                return;
            } else {
                return;
            }
        } else {
            return;
        }
        A002.A0D();
    }

    public void A0E() {
        int i = this.A00;
        if (i >= 0) {
            C122127Kl.A0A(i);
            this.A00 = -1;
        }
    }

    public final void A0F() {
        synchronized (C122127Kl.A04) {
            A09();
            A0E();
        }
    }

    public final void A0G(int i) {
        if (this instanceof AnonymousClass53H) {
            throw C18240wQ.A0j();
        } else if (this instanceof AnonymousClass53E) {
            throw C18240wQ.A0j();
        } else {
            this.A02 = i;
        }
    }

    public final void A0H(C134947yd r2) {
        if (this instanceof AnonymousClass53H) {
            throw C18240wQ.A0j();
        } else if (this instanceof AnonymousClass53E) {
            throw C18240wQ.A0j();
        } else {
            C04220Ms.A0B(r2, 0);
            this.A03 = r2;
        }
    }

    public final void A0I(C145738l0 r3) {
        Snapshot A002;
        if (this instanceof AnonymousClass53H) {
            A002 = ((AnonymousClass53H) this).A00;
            if (A002 == null) {
                A002 = (Snapshot) C86154wM.A0e(C122127Kl.A07);
            }
        } else if (this instanceof AnonymousClass53G) {
            throw C18180wK.A0a("Cannot modify a state object in a read-only snapshot");
        } else if (this instanceof AnonymousClass53F) {
            throw C18180wK.A0a("Cannot modify a state object in a read-only snapshot");
        } else {
            AnonymousClass53I r1 = (AnonymousClass53I) this;
            if (r1 instanceof AnonymousClass53E) {
                A002 = AnonymousClass53E.A00((AnonymousClass53E) r1);
            } else {
                Set A0N = r1.A0N();
                if (A0N == null) {
                    A0N = C18200wM.A0u();
                    r1.A0Q(A0N);
                }
                A0N.add(r3);
                return;
            }
        }
        A002.A0I(r3);
    }

    public final boolean A0J() {
        Snapshot A002;
        if (this instanceof AnonymousClass53H) {
            A002 = ((AnonymousClass53H) this).A00;
            if (A002 == null) {
                A002 = (Snapshot) C86154wM.A0e(C122127Kl.A07);
            }
        } else if ((this instanceof AnonymousClass53G) || (this instanceof AnonymousClass53F)) {
            return true;
        } else {
            AnonymousClass53I r1 = (AnonymousClass53I) this;
            if (!(r1 instanceof AnonymousClass53E)) {
                return false;
            }
            A002 = AnonymousClass53E.A00((AnonymousClass53E) r1);
        }
        return A002.A0J();
    }

    public Snapshot(C134947yd r10, int i) {
        int i2;
        int i3;
        this.A03 = r10;
        this.A02 = i;
        if (i != 0) {
            C134947yd A07 = A07();
            C04220Ms.A0B(A07, 1);
            int[] iArr = A07.A03;
            if (iArr != null) {
                i = iArr[0];
            } else {
                long j = A07.A01;
                if (j != 0) {
                    i3 = A07.A00;
                } else {
                    j = A07.A02;
                    i3 = j != 0 ? A07.A00 + 64 : i3;
                }
                i = i3 + AnonymousClass6EQ.A00(j);
            }
            synchronized (C122127Kl.A04) {
                AnonymousClass76Y r5 = C122127Kl.A03;
                int i4 = r5.A01 + 1;
                int[] iArr2 = r5.A04;
                int length = iArr2.length;
                if (i4 > length) {
                    int i5 = length << 1;
                    int[] iArr3 = new int[i5];
                    int[] iArr4 = new int[i5];
                    System.arraycopy(iArr2, 0, iArr3, 0, length);
                    int[] iArr5 = r5.A03;
                    System.arraycopy(iArr5, 0, iArr4, 0, iArr5.length);
                    r5.A04 = iArr3;
                    r5.A03 = iArr4;
                }
                int i6 = r5.A01;
                r5.A01 = i6 + 1;
                int[] iArr6 = r5.A02;
                int length2 = iArr6.length;
                if (r5.A00 >= length2) {
                    int i7 = 0;
                    int i8 = length2 << 1;
                    int[] iArr7 = new int[i8];
                    while (i7 < i8) {
                        int i9 = i7 + 1;
                        iArr7[i7] = i9;
                        i7 = i9;
                    }
                    System.arraycopy(iArr6, 0, iArr7, 0, length2);
                    r5.A02 = iArr7;
                    iArr6 = iArr7;
                }
                i2 = r5.A00;
                r5.A00 = iArr6[i2];
                int[] iArr8 = r5.A04;
                iArr8[i6] = i;
                r5.A03[i6] = i2;
                iArr6[i2] = i6;
                int i10 = iArr8[i6];
                while (i6 > 0) {
                    int i11 = ((i6 + 1) >> 1) - 1;
                    if (iArr8[i11] <= i10) {
                        break;
                    }
                    AnonymousClass76Y.A00(r5, i11, i6);
                    i6 = i11;
                }
            }
        } else {
            i2 = -1;
        }
        this.A00 = i2;
    }

    public static C113516rY A03(Snapshot snapshot, C113516rY r3) {
        return C122127Kl.A03(snapshot.A07(), r3, snapshot.A04());
    }
}
