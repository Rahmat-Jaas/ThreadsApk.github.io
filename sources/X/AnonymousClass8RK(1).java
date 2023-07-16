package X;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Unit;

/* renamed from: X.8RK  reason: invalid class name */
public final class AnonymousClass8RK extends C02220Ah implements AnonymousClass0YP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ LazyListState A03;
    public final /* synthetic */ AnonymousClass0ZU A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8RK(LazyListState lazyListState, AnonymousClass0ZU r3, int i, int i2, int i3) {
        super(2);
        this.A03 = lazyListState;
        this.A02 = i;
        this.A04 = r3;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        AnonymousClass70X.A00(this.A03, A0H, this.A04, this.A02, C115796vv.A00(this.A00), this.A01);
        return Unit.A00;
    }
}
