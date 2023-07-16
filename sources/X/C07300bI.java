package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;

/* renamed from: X.0bI  reason: invalid class name and case insensitive filesystem */
public final class C07300bI implements AnonymousClass0IB {
    public static AnonymousClass0X7 A04;
    public final Executor A00;
    public final Object A01;
    public final List A02 = new ArrayList();
    public final Random A03 = new Random();

    public static synchronized void A00(C07300bI r14, String str, String str2, Throwable th, long j) {
        C07300bI r2 = r14;
        synchronized (r2) {
            C07290bH r5 = C07290bH.A08;
            String str3 = str;
            String str4 = str2;
            Throwable th2 = th;
            long j2 = j;
            if (r5 == null) {
                List list = r2.A02;
                if (list.size() < 100) {
                    AnonymousClass0LU.A0O("lacrima", "Soft error detector missing: %s %s, delaying", str3, str4);
                    list.add(new C04780Pb(str3, str4, th2, j2));
                } else {
                    AnonymousClass0LU.A0O("lacrima", "Soft error detector missing: %s %s, skipping", str3, str4);
                }
            } else {
                List<C04780Pb> list2 = r2.A02;
                if (!list2.isEmpty()) {
                    AnonymousClass0LU.A0O("lacrima", "Sending pending soft errors... [%d]", Integer.valueOf(list2.size()));
                    for (C04780Pb r1 : list2) {
                        synchronized (r2.A01) {
                            try {
                            } catch (Throwable th3) {
                                while (true) {
                                    th = th3;
                                    break;
                                }
                            }
                        }
                        if (r5 != null) {
                            r5.A00(r1.A01, r1.A02, r1.A03, r1.A00, true);
                        }
                    }
                }
                synchronized (r2.A01) {
                    try {
                    } catch (Throwable th4) {
                        while (true) {
                            th = th4;
                        }
                        throw th;
                    }
                }
                if (r5 != null) {
                    r5.A00(str3, str4, th2, j2, true);
                }
            }
        }
        return;
        throw th;
    }

    public final void Ccz(String str, Integer num, String str2) {
        Ccy(num, str, str2, (Throwable) null);
    }

    public final void CdE(String str) {
    }

    public final void CdK(String str, String str2) {
        this.A00.execute(new C04770Pa(this, (Throwable) null));
    }

    public final void CuW(String str, String str2) {
        CuV(new AnonymousClass0IH(str, str2, 1000, (Throwable) null));
    }

    public final void CuX(String str, String str2, int i) {
        CuV(new AnonymousClass0IH(str, str2, i, (Throwable) null));
    }

    public final void Cua(String str, Throwable th, int i) {
        String message = th.getMessage();
        if (message == null) {
            message = "Empty cause message";
        }
        Cuc(str, message, 1, th);
    }

    public final void CYW(String str, String str2) {
        synchronized (this.A01) {
            A04.A02(str, str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r5 == X.AnonymousClass006.A0j) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Ccy(java.lang.Integer r5, java.lang.String r6, java.lang.String r7, java.lang.Throwable r8) {
        /*
            r4 = this;
            java.lang.Integer r0 = X.AnonymousClass006.A1L
            if (r5 == r0) goto L_0x000a
            java.lang.Integer r0 = X.AnonymousClass006.A0j
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r5 != r0) goto L_0x000b
        L_0x000a:
            r3 = 1
        L_0x000b:
            java.lang.String r2 = "IMPACT_"
            java.lang.String r1 = X.AnonymousClass0I8.A00(r5)
            java.lang.String r0 = "::"
            java.lang.String r0 = X.AnonymousClass00U.A0d(r2, r1, r0, r6)
            r4.Cuc(r0, r7, r3, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07300bI.Ccy(java.lang.Integer, java.lang.String, java.lang.String, java.lang.Throwable):void");
    }

    public final void CuV(AnonymousClass0IH r4) {
        if (this.A03.nextInt(Math.max(1, r4.A00)) == 0) {
            Throwable th = r4.A03;
            if (th == null) {
                th = new AnonymousClass08H(AnonymousClass00U.A0V(r4.A01, " | ", r4.A02), (Throwable) null);
            }
            this.A00.execute(new AnonymousClass0PX(r4, this, th));
        }
    }

    public final void CuY(String str, String str2, Throwable th) {
        CuV(new AnonymousClass0IH(str, str2, 1000, th));
    }

    public final void Cuc(String str, String str2, int i, Throwable th) {
        CuV(new AnonymousClass0IH(str, str2, i, th));
    }

    public final void Cuf(String str, String str2) {
        Ccz(str, AnonymousClass006.A1L, str2);
    }

    public final void Cug(String str, String str2, Throwable th) {
        Ccy(AnonymousClass006.A1L, str, "Choreographer reflection failed.", th);
    }

    public final void Cuh(String str, Throwable th) {
        String str2;
        Integer num = AnonymousClass006.A1L;
        if (th.getMessage() != null) {
            str2 = th.getMessage();
        } else {
            str2 = "";
        }
        Ccy(num, str, str2, th);
    }

    public C07300bI(Executor executor) {
        Object obj = new Object();
        this.A01 = obj;
        this.A00 = executor;
        synchronized (obj) {
            A04 = AnonymousClass0X7.A00();
        }
    }

    public final void CdL(String str, Throwable th) {
        th.getMessage();
        this.A00.execute(new C04770Pa(this, th));
    }

    public final void CuZ(String str, Throwable th) {
        String message = th.getMessage();
        if (message == null) {
            message = "Empty cause message";
        }
        CuY(str, message, th);
    }
}
