package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.C02220Ah;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;

public class KtLambdaShape2S0002000_I2 extends C02220Ah implements AnonymousClass0ZU {
    public int A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape2S0002000_I2(int i, int i2) {
        super(0);
        this.A01 = i2;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A01 != 0) {
            return new LazyGridState(this.A00, 0);
        }
        return new LazyListState(this.A00, 0);
    }
}
