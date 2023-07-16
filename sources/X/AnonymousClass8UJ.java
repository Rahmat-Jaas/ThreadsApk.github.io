package X;

import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.8UJ  reason: invalid class name */
public final class AnonymousClass8UJ extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ int A05;
    public final /* synthetic */ C967266l A06;
    public final /* synthetic */ SnapFlingBehavior A07;
    public final /* synthetic */ C145068jm A08;
    public final /* synthetic */ AnonymousClass8cm A09;
    public final /* synthetic */ PagerState A0A;
    public final /* synthetic */ C142878fk A0B;
    public final /* synthetic */ C141758cu A0C;
    public final /* synthetic */ Modifier A0D;
    public final /* synthetic */ C146088lc A0E;
    public final /* synthetic */ AnonymousClass0YY A0F;
    public final /* synthetic */ AnonymousClass0YM A0G;
    public final /* synthetic */ boolean A0H;
    public final /* synthetic */ boolean A0I;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8UJ(C967266l r2, SnapFlingBehavior snapFlingBehavior, C145068jm r4, AnonymousClass8cm r5, PagerState pagerState, C142878fk r7, C141758cu r8, Modifier modifier, C146088lc r10, AnonymousClass0YY r11, AnonymousClass0YM r12, float f, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        super(2);
        this.A0D = modifier;
        this.A0A = pagerState;
        this.A05 = i;
        this.A09 = r5;
        this.A00 = f;
        this.A06 = r2;
        this.A04 = i2;
        this.A0C = r8;
        this.A0B = r7;
        this.A08 = r4;
        this.A07 = snapFlingBehavior;
        this.A0I = z;
        this.A0H = z2;
        this.A0F = r11;
        this.A0E = r10;
        this.A0G = r12;
        this.A01 = i3;
        this.A02 = i4;
        this.A03 = i5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H2 = C86104wH.A0H(obj, obj2);
        Modifier modifier = this.A0D;
        PagerState pagerState = this.A0A;
        int i = this.A05;
        AnonymousClass8cm r14 = this.A09;
        float f = this.A00;
        C967266l r11 = this.A06;
        int i2 = this.A04;
        C141758cu r9 = this.A0C;
        C142878fk r8 = this.A0B;
        C145068jm r7 = this.A08;
        SnapFlingBehavior snapFlingBehavior = this.A07;
        boolean z = this.A0I;
        boolean z2 = this.A0H;
        AnonymousClass0YY r3 = this.A0F;
        C146088lc r2 = this.A0E;
        C146088lc r20 = r2;
        AnonymousClass0YY r21 = r3;
        AnonymousClass0YM r22 = this.A0G;
        C142878fk r17 = r8;
        C141758cu r18 = r9;
        PagerState pagerState2 = pagerState;
        SnapFlingBehavior snapFlingBehavior2 = snapFlingBehavior;
        C145068jm r13 = r7;
        AnonymousClass7C8.A00(r11, snapFlingBehavior2, r13, r14, pagerState2, A0H2, r17, r18, modifier, r20, r21, r22, f, i, i2, C115796vv.A00(this.A01), C115796vv.A01(this.A02), this.A03, z, z2);
        return Unit.A00;
    }
}
