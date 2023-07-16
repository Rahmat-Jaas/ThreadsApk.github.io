package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.AnonymousClass5uO;
import X.C02220Ah;
import kotlin.Unit;

public class KtLambdaShape1S0100200_I2 extends C02220Ah implements AnonymousClass0ZU {
    public long A00;
    public long A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape1S0100200_I2(AnonymousClass5uO r2, int i, long j, long j2) {
        super(0);
        this.A03 = i;
        this.A02 = r2;
        if (i != 0) {
            this.A01 = j;
            this.A00 = j2;
        } else {
            this.A00 = j;
            this.A01 = j2;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        int i = this.A03;
        AnonymousClass5uO r4 = (AnonymousClass5uO) this.A02;
        if (i != 0) {
            KtLambdaShape1S0100200_I2.super.onLastByteAcked(this.A01, this.A00);
        } else {
            KtLambdaShape1S0100200_I2.super.onHeaderBytesReceived(this.A00, this.A01);
        }
        return Unit.A00;
    }
}
