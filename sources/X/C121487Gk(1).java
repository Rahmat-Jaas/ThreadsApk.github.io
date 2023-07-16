package X;

import androidx.paging.PagingSource;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.KtSLambdaShape4S0401000_I2;

/* renamed from: X.7Gk  reason: invalid class name and case insensitive filesystem */
public final class C121487Gk {
    public C112356pR A00 = new AnonymousClass59U(this);
    public final C141928dU A01;
    public final PagingSource A02;
    public final AtomicBoolean A03 = C18230wP.A0w();
    public final C27219EgD A04;
    public final C27219EgD A05;
    public final C83224qz A06;
    public final C141918dT A07;
    public final C98476Fr A08;

    public C121487Gk(C141918dT r2, C141928dU r3, C98476Fr r4, PagingSource pagingSource, C27219EgD egD, C27219EgD egD2, C83224qz r8) {
        C04220Ms.A0B(r2, 7);
        this.A06 = r8;
        this.A08 = r4;
        this.A02 = pagingSource;
        this.A05 = egD;
        this.A04 = egD2;
        this.A01 = r3;
        this.A07 = r2;
    }

    public static final void A00(C121487Gk r8) {
        Object obj;
        C121487Gk r5 = r8;
        AnonymousClass89F r1 = (AnonymousClass89F) r8.A07;
        if ((!r1.A05 || r1.A01 > 0) && (obj = ((C885659e) AnonymousClass00J.A0E(r1.A06)).A02) != null) {
            C112356pR r12 = r8.A00;
            AnonymousClass67E r6 = AnonymousClass67E.APPEND;
            r12.A00(AnonymousClass59J.A00, r6);
            AnonymousClass59Z r7 = new AnonymousClass59Z(15, obj, true);
            C25237DiI.A00((Integer) null, r8.A04, new KtSLambdaShape4S0401000_I2((C146958n9) null, (Object) r5, (Object) r6, (Object) r7, 9), r8.A06, 2);
            return;
        }
        AnonymousClass67E r2 = AnonymousClass67E.APPEND;
        C885659e r13 = C885659e.A05;
        C04220Ms.A0C(r13, "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Page<Key of androidx.paging.PagingSource.LoadResult.Page.Companion.empty, Value of androidx.paging.PagingSource.LoadResult.Page.Companion.empty>");
        A02(r8, r2, r13);
    }

    public static final void A01(C121487Gk r8) {
        Object obj;
        C121487Gk r5 = r8;
        AnonymousClass89F r2 = (AnonymousClass89F) r8.A07;
        if ((!r2.A05 || r2.A02 + r2.A03 > 0) && (obj = ((C885659e) AnonymousClass00J.A0C(r2.A06)).A03) != null) {
            C112356pR r1 = r8.A00;
            AnonymousClass67E r6 = AnonymousClass67E.PREPEND;
            r1.A00(AnonymousClass59J.A00, r6);
            C885259a r7 = new C885259a(15, obj, true);
            C25237DiI.A00((Integer) null, r8.A04, new KtSLambdaShape4S0401000_I2((C146958n9) null, (Object) r5, (Object) r6, (Object) r7, 9), r8.A06, 2);
            return;
        }
        AnonymousClass67E r22 = AnonymousClass67E.PREPEND;
        C885659e r12 = C885659e.A05;
        C04220Ms.A0C(r12, "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Page<Key of androidx.paging.PagingSource.LoadResult.Page.Companion.empty, Value of androidx.paging.PagingSource.LoadResult.Page.Companion.empty>");
        A02(r8, r22, r12);
    }

    public static final void A02(C121487Gk r9, AnonymousClass67E r10, C885659e r11) {
        int size;
        AnonymousClass59K r0;
        if (!r9.A03.get()) {
            AnonymousClass59W r6 = (AnonymousClass59W) r9.A01;
            boolean A1Z = AnonymousClass0wJ.A1Z(r10, r11);
            List list = r11.A04;
            AnonymousClass89F r7 = r6.A02;
            if (r10 == AnonymousClass67E.APPEND) {
                int size2 = list.size();
                if (size2 != 0) {
                    r7.A06.add(r11);
                    int i = r7.A04 + size2;
                    r7.A04 = i;
                    int i2 = r7.A01;
                    int min = Math.min(i2, size2);
                    int i3 = size2 - min;
                    if (min != 0) {
                        r7.A01 = i2 - min;
                    }
                    int i4 = (r7.A02 + i) - size2;
                    r6.A03(i4, min);
                    r6.A04(i4 + min, i3);
                }
                size = r6.A00 - list.size();
                r6.A00 = size;
            } else if (r10 == AnonymousClass67E.PREPEND) {
                int size3 = list.size();
                if (size3 != 0) {
                    r7.A06.add(0, r11);
                    r7.A04 += size3;
                    int i5 = r7.A02;
                    int min2 = Math.min(i5, size3);
                    int i6 = size3 - min2;
                    if (min2 != 0) {
                        i5 -= min2;
                        r7.A02 = i5;
                    }
                    r7.A03 -= i6;
                    r6.A03(i5, min2);
                    r6.A04(0, i6);
                    r6.A02 += i6;
                    r6.A01 += i6;
                }
                size = r6.A03 - list.size();
                r6.A03 = size;
            } else {
                throw C18190wL.A0a(AnonymousClass0wJ.A0t("unexpected result type ", r10));
            }
            if (size <= 0 || !C18190wL.A1a(list)) {
                C112356pR r1 = r9.A00;
                if (list.isEmpty()) {
                    r0 = AnonymousClass59K.A00;
                } else {
                    r0 = AnonymousClass59K.A01;
                }
                r1.A00(r0, r10);
            } else if (r10.ordinal() != A1Z) {
                A00(r9);
            } else {
                A01(r9);
            }
        }
    }
}
