package X;

import androidx.paging.PagingConfig;
import androidx.paging.PagingSource;
import java.lang.ref.Reference;
import java.util.AbstractList;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape148S0100000_I2_3;

/* renamed from: X.89E  reason: invalid class name */
public abstract class AnonymousClass89E<T> extends AbstractList<T> {
    public Runnable A00;
    public final C98476Fr A01;
    public final AnonymousClass89F A02;
    public final PagingSource A03;
    public final List A04 = AnonymousClass0wJ.A0v();
    public final List A05 = AnonymousClass0wJ.A0v();
    public final C27219EgD A06;
    public final C83224qz A07;

    public static void A00(AnonymousClass773 r5, AnonymousClass89E r6) {
        C113236qy r3 = r5.A05;
        C04220Ms.A0B(r3, 0);
        C000300e.A0v(new KtLambdaShape148S0100000_I2_3(r3, 14), r6.A04);
        AnonymousClass0A8 r32 = r5.A0A;
        C04220Ms.A0B(r32, 0);
        C000300e.A0v(new KtLambdaShape148S0100000_I2_3(r32, 15), r6.A05);
    }

    public final Object A01() {
        if (this instanceof AnonymousClass59V) {
            return ((AnonymousClass59V) this).A00.A01();
        }
        AnonymousClass59W r4 = (AnonymousClass59W) this;
        AnonymousClass89F r5 = r4.A02;
        C04220Ms.A0B(r4.A01, 0);
        List list = r5.A06;
        if (!list.isEmpty()) {
            List A0N = AnonymousClass00J.A0N(list);
            C04220Ms.A0C(A0N, "null cannot be cast to non-null type kotlin.collections.List<androidx.paging.PagingSource.LoadResult.Page<kotlin.Any, T of androidx.paging.PagedStorage>>");
            Object A022 = r4.A05.A02(new C115116uX(new PagingConfig(15, 15, 45, true, Integer.MAX_VALUE, 32), Integer.valueOf(r5.A02 + r5.A00), A0N, r5.A02));
            if (A022 != null) {
                return A022;
            }
        }
        return r4.A06;
    }

    public final void A02(int i) {
        if (i < 0 || i >= size()) {
            throw C86114wI.A0a("Index: ", ", Size: ", i, size());
        }
        AnonymousClass89F r3 = this.A02;
        r3.A00 = AnonymousClass8bI.A02(i - r3.A02, 0, r3.A04 - 1);
        if (!(this instanceof AnonymousClass59V)) {
            AnonymousClass59W r32 = (AnonymousClass59W) this;
            AnonymousClass89F r2 = r32.A02;
            int i2 = r2.A02;
            int i3 = 15 - (i - i2);
            int i4 = ((i + 15) + 1) - (i2 + r2.A04);
            int max = Math.max(i3, r32.A03);
            r32.A03 = max;
            if (max > 0) {
                C121487Gk r22 = r32.A04;
                C104236bS r1 = r22.A00.A02;
                if ((r1 instanceof AnonymousClass59K) && !r1.A00) {
                    C121487Gk.A01(r22);
                }
            }
            int max2 = Math.max(i4, r32.A00);
            r32.A00 = max2;
            if (max2 > 0) {
                C121487Gk r23 = r32.A04;
                C104236bS r12 = r23.A00.A00;
                if ((r12 instanceof AnonymousClass59K) && !r12.A00) {
                    C121487Gk.A00(r23);
                }
            }
            r32.A02 = Math.min(r32.A02, i);
            r32.A01 = Math.max(r32.A01, i);
        }
    }

    public final void A03(int i, int i2) {
        if (i2 != 0) {
            for (Reference reference : AnonymousClass00J.A0L(this.A04)) {
                C113236qy r0 = (C113236qy) reference.get();
                if (r0 != null) {
                    r0.A00(i, i2);
                }
            }
        }
    }

    public final void A04(int i, int i2) {
        if (i2 != 0) {
            for (Reference reference : AnonymousClass00J.A0L(this.A04)) {
                C113236qy r0 = (C113236qy) reference.get();
                if (r0 != null) {
                    r0.A01(i, i2);
                }
            }
        }
    }

    public final void A05(AnonymousClass0YP r4) {
        if (!(this instanceof AnonymousClass59V)) {
            C112356pR r2 = ((AnonymousClass59W) this).A04.A00;
            r4.invoke(AnonymousClass67E.REFRESH, r2.A01);
            r4.invoke(AnonymousClass67E.PREPEND, r2.A02);
            r4.invoke(AnonymousClass67E.APPEND, r2.A00);
        }
    }

    public final Object get(int i) {
        return this.A02.get(i);
    }

    public final /* bridge */ int size() {
        return this.A02.size();
    }

    public AnonymousClass89E(C98476Fr r2, AnonymousClass89F r3, PagingSource pagingSource, C27219EgD egD, C83224qz r6) {
        AnonymousClass0wJ.A1O(pagingSource, r6);
        C18190wL.A1S(egD, 3, r2);
        this.A03 = pagingSource;
        this.A07 = r6;
        this.A06 = egD;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final /* bridge */ Object remove(int i) {
        return super.remove(i);
    }
}
