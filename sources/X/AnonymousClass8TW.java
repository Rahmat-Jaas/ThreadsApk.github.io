package X;

import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

/* renamed from: X.8TW  reason: invalid class name */
public final class AnonymousClass8TW extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C142708fS A02;
    public final /* synthetic */ C145048jk A03;
    public final /* synthetic */ C145058jl A04;
    public final /* synthetic */ C145068jm A05;
    public final /* synthetic */ AnonymousClass8cd A06;
    public final /* synthetic */ LazyGridState A07;
    public final /* synthetic */ Modifier A08;
    public final /* synthetic */ AnonymousClass0YY A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8TW(C142708fS r2, C145048jk r3, C145058jl r4, C145068jm r5, AnonymousClass8cd r6, LazyGridState lazyGridState, Modifier modifier, AnonymousClass0YY r9, int i, int i2, boolean z, boolean z2) {
        super(2);
        this.A06 = r6;
        this.A08 = modifier;
        this.A07 = lazyGridState;
        this.A05 = r5;
        this.A0A = z;
        this.A04 = r4;
        this.A03 = r3;
        this.A02 = r2;
        this.A0B = z2;
        this.A09 = r9;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        AnonymousClass8cd r5 = this.A06;
        Modifier modifier = this.A08;
        LazyGridState lazyGridState = this.A07;
        C145068jm r4 = this.A05;
        boolean z = this.A0A;
        C145058jl r3 = this.A04;
        C145048jk r2 = this.A03;
        C97956Dp.A00(this.A02, r2, r3, r4, r5, lazyGridState, A0H, modifier, this.A09, C115796vv.A00(this.A00), this.A01, z, this.A0B);
        return Unit.A00;
    }
}
