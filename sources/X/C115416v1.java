package X;

import androidx.paging.PageEvent$Insert;
import androidx.paging.PagingConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.6v1  reason: invalid class name and case insensitive filesystem */
public final class C115416v1 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C115476vB A05;
    public final PagingConfig A06;
    public final List A07;
    public final List A08;
    public final Map A09 = C18220wO.A0y();
    public final C86064wD A0A = new C27443EnZ();
    public final C86064wD A0B = new C27443EnZ();

    public final C113226qx A00(AnonymousClass67E r13, C885659e r14) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean A1Z = AnonymousClass0wJ.A1Z(r14, r13);
        int ordinal = r13.ordinal();
        int i5 = 0;
        if (ordinal != 0) {
            if (ordinal == A1Z) {
                i5 = -this.A03;
            } else if (ordinal == 2) {
                i5 = (this.A08.size() - this.A03) - 1;
            } else {
                throw AnonymousClass4VZ.A00();
            }
        }
        List A0n = C18180wK.A0n(new C1202779m(r14.A04, (List) null, new int[]{i5}, i5));
        boolean z = this.A06.A05;
        if (ordinal == 0) {
            if (z) {
                i = this.A01;
                i2 = this.A00;
            } else {
                i = 0;
                i2 = 0;
            }
            return new PageEvent$Insert(this.A05.A01(), (C1201779c) null, AnonymousClass67E.REFRESH, A0n, i, i2);
        } else if (ordinal != A1Z) {
            if (z) {
                i4 = this.A00;
            } else {
                i4 = 0;
            }
            return new PageEvent$Insert(this.A05.A01(), (C1201779c) null, AnonymousClass67E.APPEND, A0n, -1, i4);
        } else {
            if (z) {
                i3 = this.A01;
            } else {
                i3 = 0;
            }
            return new PageEvent$Insert(this.A05.A01(), (C1201779c) null, AnonymousClass67E.PREPEND, A0n, i3, -1);
        }
    }

    public final boolean A02(AnonymousClass67E r6, C885659e r7, int i) {
        Map map;
        AnonymousClass67E r0;
        int i2;
        int i3;
        int A022 = C18200wM.A02(1, r6, r7);
        int ordinal = r6.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == A022) {
                    if (C18190wL.A1a(this.A08)) {
                        if (i == this.A02) {
                            this.A07.add(r7);
                            int i4 = r7.A00;
                            if (i4 == Integer.MIN_VALUE) {
                                if (this.A06.A05) {
                                    i3 = this.A00;
                                } else {
                                    i3 = 0;
                                }
                                i4 = i3 - r7.A04.size();
                                if (i4 < 0) {
                                    i4 = 0;
                                }
                            }
                            this.A00 = i4;
                            map = this.A09;
                            r0 = AnonymousClass67E.APPEND;
                        }
                        return false;
                    }
                    throw C18180wK.A0a("should've received an init before append");
                }
                return true;
            } else if (C18190wL.A1a(this.A08)) {
                if (i == this.A04) {
                    this.A07.add(0, r7);
                    this.A03++;
                    int i5 = r7.A01;
                    if (i5 == Integer.MIN_VALUE) {
                        if (this.A06.A05) {
                            i2 = this.A01;
                        } else {
                            i2 = 0;
                        }
                        i5 = i2 - r7.A04.size();
                        if (i5 < 0) {
                            i5 = 0;
                        }
                    }
                    this.A01 = i5;
                    map = this.A09;
                    r0 = AnonymousClass67E.PREPEND;
                }
                return false;
            } else {
                throw C18180wK.A0a("should've received an init before prepend");
            }
            map.remove(r0);
            return true;
        } else if (!this.A08.isEmpty()) {
            throw C18180wK.A0a("cannot receive multiple init calls");
        } else if (i == 0) {
            this.A07.add(r7);
            this.A03 = 0;
            int i6 = r7.A00;
            if (i6 == Integer.MIN_VALUE) {
                i6 = 0;
            }
            this.A00 = i6;
            int i7 = r7.A01;
            if (i7 == Integer.MIN_VALUE) {
                i7 = 0;
            }
            this.A01 = i7;
            return true;
        } else {
            throw C18180wK.A0a("init loadId must be the initial value, 0");
        }
    }

    public final C115116uX A01(C885959j r10) {
        Integer num;
        int i;
        int i2;
        int size;
        List list = this.A08;
        List A0N = AnonymousClass00J.A0N(list);
        if (r10 != null) {
            PagingConfig pagingConfig = this.A06;
            if (pagingConfig.A05) {
                i2 = this.A01;
            } else {
                i2 = 0;
            }
            int i3 = -this.A03;
            int A0B2 = C86104wH.A0B(list) - this.A03;
            int i4 = r10.A01;
            for (int i5 = i3; i5 < i4; i5++) {
                if (i5 > A0B2) {
                    size = pagingConfig.A03;
                } else {
                    size = ((C885659e) list.get(this.A03 + i5)).A04.size();
                }
                i2 += size;
            }
            int i6 = i2 + r10.A00;
            if (i4 < i3) {
                i6 -= pagingConfig.A03;
            }
            num = Integer.valueOf(i6);
        } else {
            num = null;
        }
        PagingConfig pagingConfig2 = this.A06;
        if (pagingConfig2.A05) {
            i = this.A01;
        } else {
            i = 0;
        }
        return new C115116uX(pagingConfig2, num, A0N, i);
    }

    public C115416v1(PagingConfig pagingConfig) {
        this.A06 = pagingConfig;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        this.A07 = A0v;
        this.A08 = A0v;
        C115476vB r2 = new C115476vB();
        r2.A02(AnonymousClass59J.A00, AnonymousClass67E.REFRESH);
        this.A05 = r2;
    }
}
