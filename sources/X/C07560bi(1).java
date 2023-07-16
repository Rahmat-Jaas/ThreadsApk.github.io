package X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0bi  reason: invalid class name and case insensitive filesystem */
public final class C07560bi {
    public final ThreadLocal A00 = new ThreadLocal();
    public final C07650br A01;
    public final AtomicInteger A02 = new AtomicInteger();

    public final void A01(C07550bh r7) {
        ThreadLocal threadLocal = this.A00;
        C07660bs r5 = (C07660bs) threadLocal.get();
        if (r5 == null) {
            r5 = new C07660bs();
            threadLocal.set(r5);
        }
        Object[] objArr = r5.A01;
        int length = objArr.length;
        int i = r5.A00;
        if (i >= length) {
            int i2 = length >> 1;
            if (length < 64) {
                i2 = length;
            }
            int i3 = length + i2;
            if (i3 >= 0) {
                objArr = Arrays.copyOf(objArr, i3);
                r5.A01 = objArr;
            } else {
                throw new IllegalStateException(AnonymousClass00U.A0S("Stack reached max capacity of ", "!", i));
            }
        }
        int i4 = r5.A00;
        r5.A00 = i4 + 1;
        objArr[i4] = r7;
        C07620bo r0 = C07650br.A02;
        if (r0 != null) {
            r0.BjR(r7);
        }
    }

    public C07560bi(C07650br r2) {
        this.A01 = r2;
    }

    public final C07550bh A00(C07550bh r15, String str, int i, int i2) {
        C07690bv r3;
        AnonymousClass07V r4;
        long j;
        int i3;
        long id = Thread.currentThread().getId();
        int andIncrement = this.A02.getAndIncrement();
        AnonymousClass0SD r1 = C07650br.A03;
        if (r15 == null) {
            r3 = AnonymousClass0KH.A00;
        } else {
            r3 = r15.A09;
        }
        int i4 = i;
        int i5 = i2;
        if (r1 == null || !r1.CsL(r15, i4, i5)) {
            r4 = AnonymousClass0KG.A00;
        } else {
            AnonymousClass07V r42 = new AnonymousClass07V();
            r1.AMZ(r42, r15, i4, i5);
            r4 = r42;
        }
        if (r15 == null) {
            j = -1;
            i3 = -1;
        } else {
            j = r15.A08;
            i3 = r15.A07;
        }
        return new C07550bh(this, r3, r4, str, i3, andIncrement, i4, i5, j, id);
    }
}
