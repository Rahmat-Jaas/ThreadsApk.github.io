package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.C02220Ah;
import X.C115696vl;
import X.C115796vv;
import X.C141758cu;
import X.C142708fS;
import X.C142878fk;
import X.C145048jk;
import X.C145058jl;
import X.C145068jm;
import X.C147188nY;
import X.C86104wH;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape0S0722000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public boolean A09;
    public boolean A0A;
    public final int A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0722000_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, int i2, int i3, boolean z, boolean z2) {
        super(2);
        this.A0B = i3;
        this.A06 = obj;
        this.A07 = obj2;
        this.A03 = obj3;
        this.A09 = z;
        this.A05 = obj4;
        this.A08 = obj5;
        this.A04 = obj6;
        this.A0A = z2;
        this.A02 = obj7;
        this.A01 = i;
        this.A00 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A0B;
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        Modifier modifier = (Modifier) this.A06;
        LazyListState lazyListState = (LazyListState) this.A07;
        C145068jm r3 = (C145068jm) this.A03;
        boolean z = this.A09;
        if (i != 0) {
            C115696vl.A00((C142708fS) this.A04, (C145048jk) this.A05, r3, lazyListState, A0H, (C141758cu) this.A08, modifier, (AnonymousClass0YY) this.A02, C115796vv.A00(this.A01), this.A00, z, this.A0A);
        } else {
            C115696vl.A01((C142708fS) this.A04, (C145058jl) this.A08, r3, lazyListState, A0H, (C142878fk) this.A05, modifier, (AnonymousClass0YY) this.A02, C115796vv.A00(this.A01), this.A00, z, this.A0A);
        }
        return Unit.A00;
    }
}
