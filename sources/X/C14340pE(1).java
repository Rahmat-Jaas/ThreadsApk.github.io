package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0pE  reason: invalid class name and case insensitive filesystem */
public final class C14340pE extends AnonymousClass062 {
    public AnonymousClass061 A00 = AnonymousClass061.INITIALIZED;
    public ArrayList A01 = new ArrayList();
    public int A02;
    public L8T A03 = new L8T();
    public boolean A04;
    public boolean A05;
    public final WeakReference A06;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r7.A04 != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.AnonymousClass065 r8) {
        /*
            r7 = this;
            r5 = 0
            X.C04220Ms.A0B(r8, r5)
            java.lang.String r0 = "addObserver"
            A05(r0)
            X.061 r1 = r7.A00
            X.061 r0 = X.AnonymousClass061.DESTROYED
            if (r1 == r0) goto L_0x0011
            X.061 r0 = X.AnonymousClass061.INITIALIZED
        L_0x0011:
            X.069 r3 = new X.069
            r3.<init>(r0, r8)
            X.L8T r0 = r7.A03
            java.lang.Object r0 = r0.A04(r8, r3)
            if (r0 != 0) goto L_0x009d
            java.lang.ref.WeakReference r0 = r7.A06
            java.lang.Object r4 = r0.get()
            X.066 r4 = (X.AnonymousClass066) r4
            if (r4 == 0) goto L_0x009d
            int r0 = r7.A02
            if (r0 != 0) goto L_0x0031
            boolean r0 = r7.A04
            r6 = 0
            if (r0 == 0) goto L_0x0032
        L_0x0031:
            r6 = 1
        L_0x0032:
            X.061 r1 = r7.A00(r8)
            int r0 = r7.A02
            int r0 = r0 + 1
            r7.A02 = r0
        L_0x003c:
            X.061 r0 = r3.A00
            int r0 = r0.compareTo(r1)
            if (r0 >= 0) goto L_0x0092
            X.L8T r0 = r7.A03
            boolean r0 = r0.A09(r8)
            if (r0 == 0) goto L_0x0092
            X.061 r0 = r3.A00
            java.util.ArrayList r2 = r7.A01
            r2.add(r0)
            X.C04220Ms.A0B(r0, r5)
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x007c
            r0 = 3
            if (r1 == r0) goto L_0x0079
            r0 = 1
            if (r1 == r0) goto L_0x007f
            java.lang.String r0 = "no event up from "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.061 r0 = r3.A00
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0079:
            X.060 r0 = X.AnonymousClass060.ON_RESUME
            goto L_0x0081
        L_0x007c:
            X.060 r0 = X.AnonymousClass060.ON_START
            goto L_0x0081
        L_0x007f:
            X.060 r0 = X.AnonymousClass060.ON_CREATE
        L_0x0081:
            r3.A00(r0, r4)
            int r0 = r2.size()
            int r0 = r0 + -1
            r2.remove(r0)
            X.061 r1 = r7.A00(r8)
            goto L_0x003c
        L_0x0092:
            if (r6 != 0) goto L_0x0097
            r7.A01()
        L_0x0097:
            int r0 = r7.A02
            int r0 = r0 + -1
            r7.A02 = r0
        L_0x009d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14340pE.A07(X.065):void");
    }

    public final void A08(AnonymousClass065 r2) {
        C04220Ms.A0B(r2, 0);
        A05("removeObserver");
        this.A03.A03(r2);
    }

    public final void A09(AnonymousClass060 r2) {
        C04220Ms.A0B(r2, 0);
        A05("handleLifecycleEvent");
        A02(r2.A00());
    }

    public final void A0A(AnonymousClass061 r2) {
        C04220Ms.A0B(r2, 0);
        A05("setCurrentState");
        A02(r2);
    }

    private final AnonymousClass061 A00(AnonymousClass065 r5) {
        AnonymousClass061 r3;
        AnonymousClass069 r0;
        Map.Entry A08 = this.A03.A08(r5);
        AnonymousClass061 r2 = null;
        if (A08 == null || (r0 = (AnonymousClass069) A08.getValue()) == null) {
            r3 = null;
        } else {
            r3 = r0.A00;
        }
        ArrayList arrayList = this.A01;
        if (!arrayList.isEmpty()) {
            r2 = (AnonymousClass061) arrayList.get(arrayList.size() - 1);
        }
        AnonymousClass061 r1 = this.A00;
        C04220Ms.A0B(r1, 0);
        if (r3 != null && r3.compareTo(r1) < 0) {
            r1 = r3;
        }
        if (r2 == null || r2.compareTo(r1) >= 0) {
            return r1;
        }
        return r2;
    }

    private final void A01() {
        AnonymousClass066 r3 = (AnonymousClass066) this.A06.get();
        if (r3 == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean A062 = A06();
            this.A05 = false;
            if (!A062) {
                AnonymousClass061 r1 = this.A00;
                Map.Entry A063 = this.A03.A06();
                C04220Ms.A0A(A063);
                if (r1.compareTo(((AnonymousClass069) A063.getValue()).A00) < 0) {
                    A03(r3);
                }
                Map.Entry A07 = this.A03.A07();
                if (!this.A05 && A07 != null && this.A00.compareTo(((AnonymousClass069) A07.getValue()).A00) > 0) {
                    A04(r3);
                }
            } else {
                return;
            }
        }
    }

    private final void A02(AnonymousClass061 r5) {
        AnonymousClass061 r3 = this.A00;
        if (r3 == r5) {
            return;
        }
        if (r3 == AnonymousClass061.INITIALIZED && r5 == AnonymousClass061.DESTROYED) {
            StringBuilder sb = new StringBuilder("no event down from ");
            sb.append(r3);
            sb.append(" in component ");
            sb.append(this.A06.get());
            throw new IllegalStateException(sb.toString());
        }
        this.A00 = r5;
        if (this.A04 || this.A02 != 0) {
            this.A05 = true;
            return;
        }
        this.A04 = true;
        A01();
        this.A04 = false;
        if (this.A00 == AnonymousClass061.DESTROYED) {
            this.A03 = new L8T();
        }
    }

    private final void A03(AnonymousClass066 r7) {
        Iterator A052 = this.A03.A05();
        while (A052.hasNext() && !this.A05) {
            Map.Entry entry = (Map.Entry) A052.next();
            C04220Ms.A04(entry);
            Object key = entry.getKey();
            AnonymousClass069 r3 = (AnonymousClass069) entry.getValue();
            while (r3.A00.compareTo(this.A00) > 0 && !this.A05 && this.A03.A09(key)) {
                AnonymousClass060 A002 = C012805y.A00(r3.A00);
                if (A002 != null) {
                    AnonymousClass061 A003 = A002.A00();
                    ArrayList arrayList = this.A01;
                    arrayList.add(A003);
                    r3.A00(A002, r7);
                    arrayList.remove(arrayList.size() - 1);
                } else {
                    StringBuilder sb = new StringBuilder("no event down from ");
                    sb.append(r3.A00);
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
    }

    private final void A04(AnonymousClass066 r7) {
        AnonymousClass060 r0;
        L8S A022 = this.A03.A02();
        while (A022.hasNext() && !this.A05) {
            Map.Entry entry = (Map.Entry) A022.next();
            Object key = entry.getKey();
            AnonymousClass069 r3 = (AnonymousClass069) entry.getValue();
            while (r3.A00.compareTo(this.A00) < 0 && !this.A05 && this.A03.A09(key)) {
                AnonymousClass061 r1 = r3.A00;
                ArrayList arrayList = this.A01;
                arrayList.add(r1);
                C04220Ms.A0B(r1, 0);
                int ordinal = r1.ordinal();
                if (ordinal == 2) {
                    r0 = AnonymousClass060.ON_START;
                } else if (ordinal == 3) {
                    r0 = AnonymousClass060.ON_RESUME;
                } else if (ordinal != 1) {
                    StringBuilder sb = new StringBuilder("no event up from ");
                    sb.append(r3.A00);
                    throw new IllegalStateException(sb.toString());
                } else {
                    r0 = AnonymousClass060.ON_CREATE;
                }
                r3.A00(r0, r7);
                arrayList.remove(arrayList.size() - 1);
            }
        }
    }

    private final boolean A06() {
        L8T l8t = this.A03;
        if (l8t.A00() != 0) {
            Map.Entry A062 = l8t.A06();
            C04220Ms.A0A(A062);
            AnonymousClass061 r2 = ((AnonymousClass069) A062.getValue()).A00;
            Map.Entry A07 = this.A03.A07();
            C04220Ms.A0A(A07);
            AnonymousClass061 r1 = ((AnonymousClass069) A07.getValue()).A00;
            if (!(r2 == r1 && this.A00 == r1)) {
                return false;
            }
        }
        return true;
    }

    public C14340pE(AnonymousClass066 r2) {
        this.A06 = new WeakReference(r2);
    }

    public static final void A05(String str) {
        if (!L8O.A00().A03()) {
            throw new IllegalStateException(AnonymousClass00U.A0V("Method ", str, " must be called on the main thread"));
        }
    }
}
