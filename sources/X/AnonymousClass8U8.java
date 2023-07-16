package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.8U8  reason: invalid class name */
public final class AnonymousClass8U8 extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ C142708fS A04;
    public final /* synthetic */ C145048jk A05;
    public final /* synthetic */ C145058jl A06;
    public final /* synthetic */ C145068jm A07;
    public final /* synthetic */ LazyListState A08;
    public final /* synthetic */ C142878fk A09;
    public final /* synthetic */ C141758cu A0A;
    public final /* synthetic */ Modifier A0B;
    public final /* synthetic */ AnonymousClass0YY A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8U8(C142708fS r2, C145048jk r3, C145058jl r4, C145068jm r5, LazyListState lazyListState, C142878fk r7, C141758cu r8, Modifier modifier, AnonymousClass0YY r10, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A0B = modifier;
        this.A08 = lazyListState;
        this.A07 = r5;
        this.A0E = z;
        this.A0D = z2;
        this.A04 = r2;
        this.A0F = z3;
        this.A03 = i;
        this.A09 = r7;
        this.A06 = r4;
        this.A0A = r8;
        this.A05 = r3;
        this.A0C = r10;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        Modifier modifier = this.A0B;
        LazyListState lazyListState = this.A08;
        C145068jm r8 = this.A07;
        boolean z = this.A0E;
        boolean z2 = this.A0D;
        C142708fS r5 = this.A04;
        boolean z3 = this.A0F;
        int i = this.A03;
        C142878fk r11 = this.A09;
        C145058jl r7 = this.A06;
        C141758cu r12 = this.A0A;
        C115706vm.A00(r5, this.A05, r7, r8, lazyListState, A0H, r11, r12, modifier, this.A0C, i, C115796vv.A00(this.A00), C115796vv.A01(this.A01), this.A02, z, z2, z3);
        return Unit.A00;
    }
}
