package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass6N8;
import X.C02220Ah;
import X.C115796vv;
import X.C117826zJ;
import X.C147188nY;
import X.C86104wH;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape3S2102000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public String A03;
    public String A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape3S2102000_I2(Object obj, String str, String str2, int i, int i2, int i3) {
        super(2);
        this.A05 = i3;
        this.A01 = i;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = obj;
        this.A00 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A05;
        C147188nY A0H = C86104wH.A0H(obj, obj2);
        if (i != 0) {
            int i2 = this.A01;
            C117826zJ.A00(A0H, (Modifier) this.A02, this.A04, this.A03, i2, C115796vv.A00(this.A00));
        } else {
            AnonymousClass6N8.A00(A0H, this.A04, this.A03, (AnonymousClass0ZU) this.A02, C115796vv.A00(this.A00), this.A01);
        }
        return Unit.A00;
    }
}
