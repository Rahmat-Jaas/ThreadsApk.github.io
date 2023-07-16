package X;

import java.util.List;
import java.util.TreeSet;

/* renamed from: X.1mN  reason: invalid class name */
public final class AnonymousClass1mN extends AnonymousClass0gG {
    public final /* synthetic */ AnonymousClass3XY A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1mN(AnonymousClass3XY r4) {
        super(177, 4, false, false);
        this.A00 = r4;
    }

    public final void run() {
        AnonymousClass3Y6 r6;
        AnonymousClass3XY r3 = this.A00;
        C37228Jmt jmt = r3.A00;
        synchronized (jmt) {
            r6 = (AnonymousClass3Y6) jmt.A01("state-v1", false);
        }
        AnonymousClass3Y6 r5 = r3.A01;
        synchronized (r5) {
            if (r6 != null) {
                long currentTimeMillis = System.currentTimeMillis();
                synchronized (r6) {
                    for (C62303Ye r7 : r6.A00) {
                        String A0L = AnonymousClass00U.A0L(r7.A02, r7.A01);
                        C62303Ye r8 = (C62303Ye) r5.A01.get(A0L);
                        if (r8 != null) {
                            synchronized (r8) {
                                synchronized (r7) {
                                    List list = r8.A05;
                                    List list2 = r7.A05;
                                    TreeSet treeSet = new TreeSet(list);
                                    treeSet.addAll(list2);
                                    r8.A05 = C18200wM.A0s(treeSet);
                                    List list3 = r8.A06;
                                    List list4 = r7.A06;
                                    TreeSet treeSet2 = new TreeSet(list3);
                                    treeSet2.addAll(list4);
                                    r8.A06 = C18200wM.A0s(treeSet2);
                                    List list5 = r8.A04;
                                    List list6 = r7.A04;
                                    TreeSet treeSet3 = new TreeSet(list5);
                                    treeSet3.addAll(list6);
                                    r8.A04 = C18200wM.A0s(treeSet3);
                                    if (r8.A00.longValue() == 0) {
                                        r8.A00 = r7.A00;
                                    }
                                }
                            }
                        } else if (r7.A00.longValue() < currentTimeMillis) {
                            AnonymousClass3Y6.A00(r7, r5, A0L);
                        }
                    }
                }
            }
        }
    }
}
