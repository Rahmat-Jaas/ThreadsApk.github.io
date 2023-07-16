package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.AwaitLazyListStateSet;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerWrapperFlingBehavior;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* renamed from: X.8ZC  reason: invalid class name */
public final class AnonymousClass8ZC extends C02220Ah implements AnonymousClass0YM {
    public final /* synthetic */ AnonymousClass8cm A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ int A05;
    public final /* synthetic */ int A06;
    public final /* synthetic */ C145068jm A07;
    public final /* synthetic */ PagerState A08;
    public final /* synthetic */ PagerWrapperFlingBehavior A09;
    public final /* synthetic */ C142878fk A0A;
    public final /* synthetic */ C141758cu A0B;
    public final /* synthetic */ C146088lc A0C;
    public final /* synthetic */ C147168nV A0D;
    public final /* synthetic */ AnonymousClass0YY A0E;
    public final /* synthetic */ AnonymousClass0YM A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;
    public final /* synthetic */ boolean A0I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8ZC(C145068jm r2, AnonymousClass8cm r3, PagerState pagerState, PagerWrapperFlingBehavior pagerWrapperFlingBehavior, C142878fk r6, C141758cu r7, C146088lc r8, C147168nV r9, AnonymousClass0YY r10, AnonymousClass0YM r11, float f, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        super(3);
        this.A0G = z;
        this.A0D = r9;
        this.A02 = f;
        this.A01 = f2;
        this.A0H = z2;
        this.A08 = pagerState;
        this.A03 = i;
        this.A07 = r2;
        this.A09 = pagerWrapperFlingBehavior;
        this.A0I = z3;
        this.A05 = i2;
        this.A0A = r6;
        this.A0B = r7;
        this.A04 = i3;
        this.A00 = r3;
        this.A06 = i4;
        this.A0E = r10;
        this.A0C = r8;
        this.A0F = r11;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int A022;
        C142878fk r13;
        C141758cu r2;
        C147278p5 r22 = (C147278p5) obj;
        C147188nY r10 = (C147188nY) obj2;
        int A042 = AnonymousClass0wJ.A04(obj3);
        C04220Ms.A0B(r22, 0);
        if ((A042 & 14) == 0) {
            i = C147188nY.A0F(r10, r22) | A042;
        } else {
            i = A042;
        }
        if ((i & 91) != 18 || !r10.BCM()) {
            boolean z = this.A0G;
            long j = ((AnonymousClass7V4) r22).A00;
            if (z) {
                A022 = Constraints.A01(j);
            } else {
                A022 = Constraints.A02(j);
            }
            C147168nV r1 = this.A0D;
            int i2 = 0;
            Integer valueOf = Integer.valueOf(A022);
            float f = this.A02;
            C134847yT A002 = C134847yT.A00(f);
            float f2 = this.A01;
            Object[] A13 = C147188nY.A13(r10, r1, valueOf, A002, C134847yT.A00(f2));
            boolean z2 = false;
            do {
                z2 = C147188nY.A12(r10, A13[i2], z2);
                i2++;
            } while (i2 < 4);
            AnonymousClass7W3 r14 = (AnonymousClass7W3) r10;
            Object A132 = r14.A13();
            if (z2 || A132 == AnonymousClass7GN.A00) {
                r1.CfL(f);
                A132 = C134847yT.A00(r1.CxE(A022 - r1.CfL(f2)));
                r14.A14(A132);
            }
            AnonymousClass7W3.A0w(r14, false);
            float f3 = ((C134847yT) A132).A00;
            boolean z3 = this.A0H;
            if (!z3) {
                r13 = AnonymousClass7KV.A02;
            } else {
                r13 = AnonymousClass7KV.A01;
            }
            if (!z3) {
                r2 = AnonymousClass7KV.A05;
            } else {
                r2 = AnonymousClass7KV.A03;
            }
            PagerState pagerState = this.A08;
            boolean A0y = C147188nY.A0y(r10, pagerState);
            Object A133 = r14.A13();
            if (A0y || A133 == AnonymousClass7GN.A00) {
                A133 = new LazyListState(pagerState.A01, AnonymousClass8bA.A02(((float) r1.CfL(f3)) * pagerState.A00));
                pagerState.A04.CrC(A133);
                AwaitLazyListStateSet awaitLazyListStateSet = pagerState.A02;
                if (!awaitLazyListStateSet.A01) {
                    awaitLazyListStateSet.A01 = true;
                    C146958n9 r12 = awaitLazyListStateSet.A00;
                    if (r12 != null) {
                        r12.resumeWith(Unit.A00);
                    }
                    awaitLazyListStateSet.A00 = null;
                }
                r14.A14(A133);
            }
            AnonymousClass7W3.A0w(r14, false);
            C123327Wm r222 = Modifier.A00;
            C04220Ms.A0B(r13, 1);
            AnonymousClass7V0 r5 = new AnonymousClass7V0(C86164wN.A0u(r13, 1), f, true);
            C145058jl A023 = AnonymousClass7J3.A02(r2, f);
            C145068jm r18 = this.A07;
            PagerWrapperFlingBehavior pagerWrapperFlingBehavior = this.A09;
            boolean z4 = this.A0I;
            int i3 = this.A05;
            C142878fk r142 = this.A0A;
            C141758cu r132 = this.A0B;
            int i4 = this.A06;
            AnonymousClass0YY r3 = this.A0E;
            C146088lc r23 = this.A0C;
            AnonymousClass0YM r15 = this.A0F;
            int i5 = this.A04;
            AnonymousClass8JR r232 = new AnonymousClass8JR(r23, r3, r15, f3, i4, i5, z);
            int i6 = this.A03;
            int i7 = i6 >> 21;
            boolean z5 = z4;
            int i8 = i3;
            AnonymousClass7V0 r152 = r5;
            C145068jm r17 = r18;
            LazyListState lazyListState = (LazyListState) A133;
            PagerWrapperFlingBehavior pagerWrapperFlingBehavior2 = pagerWrapperFlingBehavior;
            C115706vm.A00(pagerWrapperFlingBehavior2, r152, A023, r17, lazyListState, r10, r142, r132, r222, r232, i8, (i7 & 896) | 6 | ((i5 << 3) & 7168) | ((i5 << 15) & 3670016) | (29360128 & (i6 << 3)) | (234881024 & i6), i7 & 14, 0, z3, z, z5);
        } else {
            r10.CuJ();
        }
        return Unit.A00;
    }
}
