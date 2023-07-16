package X;

import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.8UA  reason: invalid class name */
public final class AnonymousClass8UA extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ int A05;
    public final /* synthetic */ SnapFlingBehavior A06;
    public final /* synthetic */ C145068jm A07;
    public final /* synthetic */ AnonymousClass8cm A08;
    public final /* synthetic */ PagerState A09;
    public final /* synthetic */ C141758cu A0A;
    public final /* synthetic */ Modifier A0B;
    public final /* synthetic */ C146088lc A0C;
    public final /* synthetic */ AnonymousClass0YY A0D;
    public final /* synthetic */ AnonymousClass0YM A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ boolean A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8UA(SnapFlingBehavior snapFlingBehavior, C145068jm r3, AnonymousClass8cm r4, PagerState pagerState, C141758cu r6, Modifier modifier, C146088lc r8, AnonymousClass0YY r9, AnonymousClass0YM r10, float f, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        super(2);
        this.A05 = i;
        this.A0B = modifier;
        this.A09 = pagerState;
        this.A07 = r3;
        this.A08 = r4;
        this.A04 = i2;
        this.A00 = f;
        this.A0A = r6;
        this.A06 = snapFlingBehavior;
        this.A0G = z;
        this.A0F = z2;
        this.A0D = r9;
        this.A0C = r8;
        this.A0E = r10;
        this.A01 = i3;
        this.A02 = i4;
        this.A03 = i5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        int i = this.A05;
        Modifier modifier = this.A0B;
        PagerState pagerState = this.A09;
        C145068jm r13 = this.A07;
        AnonymousClass8cm r14 = this.A08;
        int i2 = this.A04;
        float f = this.A00;
        C141758cu r6 = this.A0A;
        SnapFlingBehavior snapFlingBehavior = this.A06;
        boolean z = this.A0G;
        boolean z2 = this.A0F;
        AnonymousClass0YY r3 = this.A0D;
        C146088lc r2 = this.A0C;
        int i3 = i;
        float f2 = f;
        AnonymousClass0YM r21 = this.A0E;
        AnonymousClass0YY r20 = r3;
        C146088lc r19 = r2;
        Modifier modifier2 = modifier;
        C141758cu r17 = r6;
        AnonymousClass7C8.A01(snapFlingBehavior, r13, r14, pagerState, A0H, r17, modifier2, r19, r20, r21, f2, i3, i2, C115796vv.A00(this.A01), C115796vv.A01(this.A02), this.A03, z, z2);
        return Unit.A00;
    }
}
