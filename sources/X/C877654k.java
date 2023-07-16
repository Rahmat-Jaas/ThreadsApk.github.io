package X;

import android.graphics.Paint;

/* renamed from: X.54k  reason: invalid class name and case insensitive filesystem */
public final class C877654k extends AnonymousClass54T {
    public static final C146398mB A01;
    public final AnonymousClass7YG A00;

    static {
        AnonymousClass7X0 r2 = new AnonymousClass7X0();
        r2.CjA(AnonymousClass7KE.A04);
        Paint paint = r2.A01;
        paint.setStrokeWidth(1.0f);
        C86134wK.A12(paint);
        A01 = r2;
    }

    public final int Bf8(int i) {
        AnonymousClass75N r0 = this.A0H.A0X;
        C146288ly A002 = AnonymousClass75N.A00(r0);
        AnonymousClass7Y3 r2 = r0.A01;
        return A002.Bf9(r2.A0a.A04, r2.A0A(), i);
    }

    public final int BfB(int i) {
        AnonymousClass75N r0 = this.A0H.A0X;
        C146288ly A002 = AnonymousClass75N.A00(r0);
        AnonymousClass7Y3 r2 = r0.A01;
        return A002.BfC(r2.A0a.A04, r2.A0A(), i);
    }

    public final int BgJ(int i) {
        AnonymousClass75N r0 = this.A0H.A0X;
        C146288ly A002 = AnonymousClass75N.A00(r0);
        AnonymousClass7Y3 r2 = r0.A01;
        return A002.BgK(r2.A0a.A04, r2.A0A(), i);
    }

    public final int BgM(int i) {
        AnonymousClass75N r0 = this.A0H.A0X;
        C146288ly A002 = AnonymousClass75N.A00(r0);
        AnonymousClass7Y3 r2 = r0.A01;
        return A002.BgN(r2.A0a.A04, r2.A0A(), i);
    }

    public C877654k(AnonymousClass7Y3 r2) {
        super(r2);
        AnonymousClass53V r0 = new AnonymousClass53V();
        this.A00 = r0;
        r0.A06 = this;
    }

    public final void A0E(AnonymousClass0YY r7, float f, long j) {
        super.A0E(r7, f, j);
        if (!this.A01) {
            A0Q();
            AnonymousClass7Y3 r3 = this.A0H;
            AnonymousClass7Y3 A09 = r3.A09();
            AnonymousClass7IW r0 = r3.A0a;
            C877654k r5 = r0.A06;
            float f2 = r5.A00;
            for (AnonymousClass54T r1 = r0.A04; r1 != r5; r1 = r1.A06) {
                C04220Ms.A0C(r1, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
                f2 += r1.A00;
            }
            if (f2 != r3.A00) {
                r3.A00 = f2;
                if (A09 != null) {
                    A09.A0F();
                    A09.A0D();
                }
            }
            if (!r3.A0N) {
                if (A09 != null) {
                    A09.A0D();
                }
                AnonymousClass7Y3.A04(r3);
            }
            if (A09 == null) {
                r3.A03 = 0;
            } else if (!r3.A0P && A09.A0Y.A01 == AnonymousClass006.A0C) {
                if (r3.A03 == Integer.MAX_VALUE) {
                    int i = A09.A02;
                    r3.A03 = i;
                    A09.A02 = i + 1;
                } else {
                    throw C18180wK.A0a("Place was called on a node which was placed already");
                }
            }
            r3.A0Y.A08.BaV();
        }
    }

    public final C123657Xy Bg4(long j) {
        A0D(j);
        AnonymousClass7Y3 r5 = this.A0H;
        AnonymousClass84X A08 = r5.A08();
        int i = A08.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A08.A01;
            do {
                ((AnonymousClass7Y3) objArr[i2]).A0G = AnonymousClass006.A0C;
                i2++;
            } while (i2 < i);
        }
        A0U(r5.A08.Bg2(this, r5.A0A(), j));
        A0P();
        return this;
    }
}
