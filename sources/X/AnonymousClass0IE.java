package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0IE  reason: invalid class name */
public final class AnonymousClass0IE extends AnonymousClass0e0 implements AnonymousClass0Wg {
    public C04560Oe A00 = null;
    public final SparseArray A01;
    public final C03710Kk A02;
    public final C05830Wf A03;
    public final AnonymousClass0XE A04;
    public final List A05;
    public final boolean A06;

    public AnonymousClass0IE(C03710Kk r19, AnonymousClass0W4 r20, AnonymousClass0e1 r21, AnonymousClass0XA r22, Set set) {
        SparseArray sparseArray = new SparseArray();
        this.A01 = sparseArray;
        C03710Kk r13 = r19;
        this.A02 = r13;
        this.A06 = r21.A08();
        this.A04 = new AnonymousClass0XE(r13, r20, r22, r21.A02());
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass0X3 r1 = (AnonymousClass0X3) it.next();
            if (r1.isEnabled()) {
                AnonymousClass0X4 AGJ = r1.AGJ();
                C11000jJ r7 = new C11000jJ(this.A02, AGJ);
                arrayList.add(r7);
                for (int i : AGJ.A01) {
                    List list = (List) sparseArray.get(i);
                    if (list == null) {
                        list = new ArrayList();
                        sparseArray.put(i, list);
                    }
                    list.add(r7);
                }
            }
        }
        this.A05 = arrayList;
        SparseArray sparseArray2 = this.A01;
        int size = sparseArray2.size() + 2;
        int[] iArr = new int[size];
        iArr[0] = 46333953;
        iArr[1] = 46342759;
        for (int i2 = 2; i2 < size; i2++) {
            iArr[i2] = sparseArray2.keyAt(i2 - 2);
        }
        this.A03 = new C05830Wf(iArr, (int[]) null);
    }

    public final String getName() {
        return "local_aggregation";
    }

    public final synchronized void onMarkEvent(C05800Wc r8) {
        AnonymousClass0W4 r2;
        Runnable runnable;
        List A002;
        int markerId = r8.getMarkerId();
        if (markerId == 46333953) {
            C04560Oe r0 = this.A00;
            r0.getClass();
            AnonymousClass0X0 r6 = (AnonymousClass0X0) r0.get();
            ArrayList<AnonymousClass0X5> arrayList = new ArrayList<>();
            for (C11000jJ r3 : this.A05) {
                String str = r3.A01.A00;
                synchronized (r3) {
                    A002 = r3.A00();
                    r3.A02.clear();
                }
                arrayList.add(new AnonymousClass0X5(str, A002));
            }
            for (AnonymousClass0X5 A052 : arrayList) {
                AnonymousClass0X0.A05(r6, A052);
            }
            AnonymousClass0XE r02 = this.A04;
            r2 = r02.A03;
            runnable = new AnonymousClass0XB(r02);
        } else if (markerId != 46342759) {
            A00(r8);
        } else {
            AnonymousClass0XE r32 = this.A04;
            C04560Oe r03 = this.A00;
            r03.getClass();
            r2 = r32.A03;
            runnable = new AnonymousClass0XC((AnonymousClass0X0) r03.get(), r32);
        }
        r2.execute(runnable);
    }

    public final synchronized void onMarkerStop(C05800Wc r2) {
        A00(r2);
    }

    private void A00(C05800Wc r18) {
        C05800Wc r8 = r18;
        List list = (List) this.A01.get(r8.getMarkerId());
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                C11000jJ r4 = (C11000jJ) list.get(i);
                synchronized (r4) {
                    AnonymousClass0X4 r11 = r4.A01;
                    C11680kb[] r12 = r11.A03;
                    StringBuilder sb = new StringBuilder();
                    boolean z = false;
                    for (C11680kb r1 : r12) {
                        if (z) {
                            sb.append(":");
                        } else {
                            z = true;
                        }
                        sb.append(r1.AdE(r8));
                    }
                    String obj = sb.toString();
                    Map map = r4.A02;
                    AnonymousClass0X2 r122 = (AnonymousClass0X2) map.get(obj);
                    if (r122 == null) {
                        r122 = new AnonymousClass0X2(r8, r11);
                        map.put(obj, r122);
                    }
                    int i2 = 0;
                    int i3 = 0;
                    for (AnonymousClass0X8 r2 : r11.A02) {
                        if (r2 instanceof C11570kQ) {
                            int i4 = i2 + 1;
                            long[] jArr = r122.A03;
                            jArr[i2] = jArr[i2] + ((C11730ki) ((C11570kQ) r2).A00).BKH(r8);
                            i2 = i4;
                        } else if (r2 instanceof C11460kF) {
                            double[] dArr = r122.A01;
                            dArr[i3] = dArr[i3] + ((C11690kc) ((C11460kF) r2).A00).BKG(r8);
                            i3++;
                        } else {
                            throw new UnsupportedOperationException(AnonymousClass00U.A0L("Unsupported Aggregation: ", r2.getClass().getName()));
                        }
                    }
                    r122.A00++;
                    r4.A03 = r4.A00.now();
                }
            }
            AnonymousClass0XE r82 = this.A04;
            List list2 = this.A05;
            if (r82.A07) {
                long now = r82.A02.now();
                synchronized (r82) {
                    long j = r82.A00;
                    if (now >= r82.A01 + j) {
                        r82.A00 = now;
                        r82.A03.execute(new AnonymousClass0XD(r82, list2, j));
                    }
                }
            }
        }
    }

    public final C05830Wf getListenerMarkers() {
        return this.A03;
    }
}
