package X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0br  reason: invalid class name and case insensitive filesystem */
public final class C07650br {
    public static final AtomicReference A00;
    public static final C07650br A01;
    public static volatile C07620bo A02;
    public static volatile AnonymousClass0SD A03;

    static {
        C07650br r0 = new C07650br();
        A01 = r0;
        A00 = new AtomicReference(new C07560bi(r0));
    }

    public static C05190Ru A00() {
        int i;
        C07660bs r1 = (C07660bs) ((C07560bi) A00.get()).A00.get();
        if (r1 == null || (i = r1.A00) == 0) {
            return null;
        }
        return (C07550bh) r1.A01[i - 1];
    }

    public static C05190Ru A02(String str, int i) {
        Integer num;
        C07550bh r1;
        int i2;
        Integer num2;
        AnonymousClass0SD r12;
        if (str != null) {
            AnonymousClass0S8 r0 = AnonymousClass0S9.A00;
            if (r0 == null || (num = r0.BI0()) == null) {
                num = AnonymousClass006.A0C;
            }
            Integer num3 = AnonymousClass006.A0C;
            if (num == num3) {
                return C07570bj.A00;
            }
            C05190Ru A002 = A00();
            if (A002 != null) {
                AnonymousClass0S8 r02 = AnonymousClass0S9.A00;
                if (r02 == null || (num2 = r02.BI0()) == null) {
                    num2 = num3;
                }
                if (num2 != AnonymousClass006.A00 && ((r12 = A03) == null || (!r12.ABp(A002, 3, i)))) {
                    return new C07600bm(A002);
                }
            }
            C07560bi r2 = (C07560bi) A00.get();
            C07660bs r13 = (C07660bs) r2.A00.get();
            if (r13 == null || (i2 = r13.A00) == 0 || (r1 = (C07550bh) r13.A01[i2 - 1]) == null) {
                r1 = null;
            }
            C07550bh A003 = r2.A00(r1, str, 3, i);
            r2.A01(A003);
            return A003;
        }
        throw new IllegalArgumentException(String.format("%s cannot be null.", new Object[]{"tag"}));
    }

    public static C05190Ru A01(C05190Ru r5, int i) {
        Integer num;
        AnonymousClass0SD r1;
        String tag = r5.getTag();
        if (tag != null) {
            C07560bi r3 = (C07560bi) A00.get();
            if (r5 instanceof C07600bm) {
                r5 = ((C07600bm) r5).A00;
            }
            if (!(r5 instanceof C07550bh)) {
                return A02(r5.getTag(), i);
            }
            AnonymousClass0S8 r0 = AnonymousClass0S9.A00;
            if (r0 == null || (num = r0.BI0()) == null) {
                num = AnonymousClass006.A0C;
            }
            if (num == AnonymousClass006.A0C) {
                return C07570bj.A00;
            }
            C05190Ru A002 = A00();
            if (A002 != null && num != AnonymousClass006.A00 && r5.BOa(A002) && ((r1 = A03) == null || (!r1.ABp(A002, 1, i)))) {
                return new C07600bm(A002);
            }
            C07550bh A003 = r3.A00((C07550bh) r5, tag, 1, i);
            r3.A01(A003);
            return A003;
        }
        throw new IllegalArgumentException(String.format("%s cannot be null.", new Object[]{"tag"}));
    }
}
