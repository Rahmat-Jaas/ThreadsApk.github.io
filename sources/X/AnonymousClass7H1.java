package X;

import android.content.Context;
import android.os.SystemClock;
import com.instagram.service.session.UserSession;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.KtLambdaShape166S0100000_I2_21;
import kotlin.jvm.internal.KtLambdaShape31S0201000_I2;

/* renamed from: X.7H1  reason: invalid class name */
public final class AnonymousClass7H1 {
    public long A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final Context A06;
    public final C18306AdH A07;
    public final UserSession A08;
    public final C146488mK A09;
    public final String A0A;
    public final LinkedList A0B;
    public final boolean A0C;
    public final boolean A0D;

    public /* synthetic */ AnonymousClass7H1(Context context, C18306AdH adH, UserSession userSession, C146488mK r7, String str, int i, int i2, int i3, long j, boolean z, boolean z2) {
        i2 = (i3 & 128) != 0 ? 3 : i2;
        int i4 = (i3 & 256) != 0 ? 9 : 0;
        boolean A1R = C18240wQ.A1R(i3 & 512, z);
        boolean A1R2 = C18240wQ.A1R(i3 & 1024, z2);
        this.A0A = str;
        this.A06 = context;
        this.A08 = userSession;
        this.A07 = adH;
        this.A09 = r7;
        this.A04 = i;
        this.A05 = j;
        this.A02 = i2;
        this.A03 = i4;
        this.A0D = A1R;
        this.A0C = A1R2;
        this.A0B = new LinkedList();
    }

    private final void A00(BKU bku, C2z c2z, Integer num, int i) {
        LinkedList linkedList = this.A0B;
        if (C18250wR.A1K(linkedList)) {
            if (!(linkedList instanceof Collection) || !linkedList.isEmpty()) {
                Iterator it = linkedList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C109536kA) it.next()).A02 == num) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (this.A01 == 0) {
                this.A01 = this.A02;
            }
        }
        C109536kA r1 = (C109536kA) AnonymousClass00J.A0D(linkedList);
        int i2 = i;
        if (r1 != null) {
            Context context = this.A06;
            UserSession userSession = this.A08;
            C36483JXj BL2 = r1.A00.BL2();
            C04220Ms.A06(BL2);
            C35806J4q.A00(new JPC(context, userSession, BL2, this.A0A, i2, this.A0D, this.A0C, true, true));
        }
        Context context2 = this.A06;
        UserSession userSession2 = this.A08;
        C36483JXj BL22 = bku.BL2();
        C04220Ms.A06(BL22);
        C35806J4q.A00(new JPC(context2, userSession2, BL22, this.A0A, i2, this.A0D, this.A0C, true, true));
        linkedList.add(new C109536kA(bku, c2z, num));
        int i3 = this.A01;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.A01 = i4;
            if (i4 == 0) {
                A01(linkedList, new KtLambdaShape166S0100000_I2_21(num, 25));
            }
        }
    }

    private final boolean A02(C2z c2z, Integer num, int i, int i2) {
        Object obj;
        int[] AwD;
        LinkedList linkedList = this.A0B;
        int size = linkedList.size();
        int i3 = this.A04;
        if (size >= i3) {
            C146488mK r8 = this.A09;
            if (r8.BXA(c2z)) {
                Iterator it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((C109536kA) obj).A02 == num) {
                        break;
                    }
                }
                C109536kA r2 = (C109536kA) obj;
                if (r2 != null) {
                    C2z c2z2 = r2.A01;
                    if (!C04220Ms.A0I(c2z2, c2z) && (AwD = r8.AwD(c2z)) != null) {
                        int i4 = AwD[0];
                        int i5 = (AwD[1] + i4) - 1;
                        if (i4 > i2 || i5 < i) {
                            int[] AwD2 = r8.AwD(c2z2);
                            if (AwD2 != null) {
                                int i6 = AwD2[0];
                                int intValue = num.intValue();
                                if (intValue == 1) {
                                }
                            }
                        }
                        A01(linkedList, new KtLambdaShape166S0100000_I2_21(num, 24));
                        if (linkedList.size() >= i3) {
                            linkedList.remove(r2);
                        }
                        this.A01 = 0;
                    }
                } else if (i3 > 0) {
                    while (linkedList.size() >= i3) {
                        linkedList.pollLast();
                    }
                }
            }
        }
        if (linkedList.size() >= i3) {
            return false;
        }
        return true;
    }

    public final void A03(int i, int i2) {
        C134937yc A0C2;
        int i3 = i;
        int i4 = (i2 + i) - 1;
        Integer A002 = this.A07.A00();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.A00 >= this.A05) {
            this.A00 = elapsedRealtime;
            int intValue = A002.intValue();
            int i5 = 0;
            if (intValue == 1) {
                A01(this.A0B, new KtLambdaShape31S0201000_I2(i3, 15, this, A002));
                A0C2 = AnonymousClass8bI.A0C(Math.max(i4, 0), this.A09.APK());
            } else if (intValue != 0) {
                A0C2 = AnonymousClass8bH.A00;
            } else {
                A01(this.A0B, new KtLambdaShape31S0201000_I2(i4, 15, this, A002));
                A0C2 = AnonymousClass8bI.A09(Math.min(i3, this.A09.APK() - 1), 0);
            }
            C146488mK r10 = this.A09;
            BKU AbU = r10.AbU();
            if (AbU != null) {
                A01(this.A0B, new KtLambdaShape166S0100000_I2_21(AbU, 26));
            }
            int i6 = A0C2.A00;
            int i7 = A0C2.A01;
            int i8 = A0C2.A02;
            if (i8 > 0) {
                if (i6 > i7) {
                    return;
                }
            } else if (i8 >= 0 || i7 > i6) {
                return;
            }
            while (true) {
                C2z AwG = r10.AwG(i6);
                if (AwG != null) {
                    if (AwG.Atv().BSA()) {
                        BKU AbU2 = r10.AbU();
                        BKU Atv = AwG.Atv();
                        int B1w = r10.B1w(AwG);
                        C20066BMj Auh = r10.Auh(Atv);
                        if (Auh != null) {
                            int i9 = Auh.A06;
                            int AWZ = Atv.AWZ();
                            int i10 = 0;
                            while (i9 >= 0 && i9 < AWZ) {
                                BKU A2E = Atv.A2E(i9);
                                if (A2E != null) {
                                    LinkedList linkedList = this.A0B;
                                    LinkedList linkedList2 = linkedList;
                                    if (!(linkedList instanceof Collection) || !linkedList2.isEmpty()) {
                                        Iterator it = linkedList2.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                if (C04220Ms.A0I(((C109536kA) it.next()).A00, A2E)) {
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    }
                                    if (!C04220Ms.A0I(AbU2, A2E) && A2E.A4m(this.A08)) {
                                        if (!A02(Atv, A002, i3, i4)) {
                                            break;
                                        }
                                        A00(A2E, Atv, A002, B1w);
                                        B1w = 0;
                                    }
                                }
                                i10++;
                                i9++;
                                if (i9 == AWZ) {
                                    i9 -= 2;
                                }
                                if (i10 >= 2) {
                                    break;
                                }
                            }
                        }
                    } else if (!C04220Ms.A0I(AbU, AwG.Atv())) {
                        LinkedList linkedList3 = this.A0B;
                        if (!(linkedList3 instanceof Collection) || !linkedList3.isEmpty()) {
                            Iterator it2 = linkedList3.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (C04220Ms.A0I(((C109536kA) it2.next()).A00, AwG.Atv())) {
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        if (r10.BXA(AwG) && A02(AwG, A002, i3, i4)) {
                            A00(AwG.Atv(), AwG, A002, r10.B1w(AwG));
                        }
                    }
                    i5++;
                    if (this.A0B.size() >= this.A04 || i5 >= this.A03) {
                        return;
                    }
                }
                if (i6 != i7) {
                    i6 += i8;
                } else {
                    return;
                }
            }
        }
    }

    public static final void A01(LinkedList linkedList, AnonymousClass0YY r2) {
        Iterator it = linkedList.iterator();
        C04220Ms.A06(it);
        while (it.hasNext()) {
            Object next = it.next();
            C04220Ms.A06(next);
            if (AnonymousClass0wJ.A1X(r2.invoke(next))) {
                it.remove();
            }
        }
    }
}
