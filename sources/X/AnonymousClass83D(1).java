package X;

import java.util.List;

/* renamed from: X.83D  reason: invalid class name */
public final /* synthetic */ class AnonymousClass83D implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass773 A01;
    public final /* synthetic */ C40682Llc A02;
    public final /* synthetic */ AnonymousClass89E A03;
    public final /* synthetic */ AnonymousClass89E A04;
    public final /* synthetic */ AnonymousClass89E A05;
    public final /* synthetic */ AnonymousClass59S A06;

    public /* synthetic */ AnonymousClass83D(AnonymousClass773 r1, C40682Llc llc, AnonymousClass89E r3, AnonymousClass89E r4, AnonymousClass89E r5, AnonymousClass59S r6, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = llc;
        this.A06 = r6;
        this.A05 = r5;
    }

    public final void run() {
        AnonymousClass773 r7 = this.A01;
        int i = this.A00;
        AnonymousClass89E r6 = this.A03;
        AnonymousClass89E r9 = this.A04;
        C40682Llc llc = this.A02;
        AnonymousClass59S r11 = this.A06;
        AnonymousClass89E r1 = this.A05;
        if (r7.A00 == i) {
            AnonymousClass89F r0 = r1.A02;
            int i2 = r0.A02 + r0.A00;
            AnonymousClass89E r4 = r7.A02;
            if (r4 == null || r7.A01 != null) {
                throw C18180wK.A0a("must be in snapshot state to apply diff");
            }
            r7.A01 = r6;
            AnonymousClass0YP r2 = (AnonymousClass0YP) r7.A0A;
            C04220Ms.A0B(r2, 0);
            List list = r6.A05;
            C000300e.A0v(C138968Md.A00, list);
            list.add(C86144wL.A0w(r2));
            r6.A05(r2);
            r7.A02 = null;
            AnonymousClass89F r02 = r4.A02;
            AnonymousClass89F r16 = r02;
            C146128lg r22 = r7.A03;
            if (r22 != null) {
                AnonymousClass89F r92 = r9.A02;
                M0N.A02(llc, r02, r92, r22);
                C113236qy r13 = r7.A05;
                C04220Ms.A0B(r13, 0);
                List list2 = r11.A00;
                C134937yc A0B = AnonymousClass8bI.A0B(AnonymousClass8bI.A0C(0, list2.size()), 3);
                int i3 = A0B.A00;
                int i4 = A0B.A01;
                int i5 = A0B.A02;
                if (i5 <= 0 ? !(i5 >= 0 || i4 > i3) : i3 <= i4) {
                    while (true) {
                        int A042 = AnonymousClass0wJ.A04(list2.get(i3));
                        if (A042 == 0) {
                            r13.A00(AnonymousClass0wJ.A04(list2.get(i3 + 1)), AnonymousClass0wJ.A04(list2.get(i3 + 2)));
                        } else if (A042 == 1) {
                            r13.A01(AnonymousClass0wJ.A04(list2.get(i3 + 1)), AnonymousClass0wJ.A04(list2.get(i3 + 2)));
                        } else if (A042 == 2) {
                            int A043 = AnonymousClass0wJ.A04(list2.get(i3 + 1));
                            int A044 = AnonymousClass0wJ.A04(list2.get(i3 + 2));
                            if (r13 instanceof AnonymousClass59S) {
                                List list3 = ((AnonymousClass59S) r13).A00;
                                C86144wL.A1V(list3, 2);
                                C86144wL.A1V(list3, A043);
                                C86144wL.A1V(list3, A044);
                            } else {
                                C146128lg r03 = ((AnonymousClass59R) r13).A00.A03;
                                if (r03 != null) {
                                    r03.CFn(A043, A044);
                                } else {
                                    C04220Ms.A0E("updateCallback");
                                    throw null;
                                }
                            }
                        } else {
                            throw C18180wK.A0a("Unexpected recording value");
                        }
                        if (i3 == i4) {
                            break;
                        }
                        i3 += i5;
                    }
                }
                list2.clear();
                List list4 = r6.A04;
                C000300e.A0v(C78094hs.A00, list4);
                list4.add(C86144wL.A0w(r13));
                if (!r6.isEmpty()) {
                    r6.A02(AnonymousClass8bI.A02(M0N.A00(llc, r16, r92, i2), 0, C86164wN.A05(r6)));
                }
                AnonymousClass773.A00(r7, r4, r7.A01);
                return;
            }
            C04220Ms.A0E("updateCallback");
            throw null;
        }
    }
}
