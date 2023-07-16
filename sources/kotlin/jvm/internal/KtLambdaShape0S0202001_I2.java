package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass6MC;
import X.AnonymousClass6YT;
import X.AnonymousClass74X;
import X.AnonymousClass7Ac;
import X.AnonymousClass7D5;
import X.AnonymousClass7KP;
import X.AnonymousClass7KV;
import X.AnonymousClass7W3;
import X.C02220Ah;
import X.C115796vv;
import X.C120537Bh;
import X.C146288ly;
import X.C147188nY;
import X.C86104wH;
import X.C97876Dh;
import X.C98236Es;
import androidx.compose.ui.Modifier;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.List;
import kotlin.Unit;

public class KtLambdaShape0S0202001_I2 extends C02220Ah implements AnonymousClass0YP {
    public float A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0202001_I2(Object obj, Object obj2, float f, int i, int i2, int i3) {
        super(2);
        this.A05 = i3;
        this.A00 = f;
        this.A03 = obj;
        this.A04 = obj2;
        this.A01 = i;
        this.A02 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (2 - this.A05 != 0) {
            AnonymousClass6MC.A00(C86104wH.A0H(obj, obj2), (Modifier) this.A03, (List) this.A04, this.A00, C115796vv.A00(this.A01), this.A02);
        } else {
            C147188nY r13 = (C147188nY) obj;
            if ((AnonymousClass0wJ.A04(obj2) & 11) != 2 || !r13.BCM()) {
                Modifier A002 = C97876Dh.A00(Modifier.A00, this.A00, true);
                long j = C120537Bh.A00(r13).A0W;
                r13.AEA(AnonymousClass6YT.A00);
                Modifier A022 = AnonymousClass7Ac.A02(A002, AnonymousClass7D5.A00, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER, j);
                Object obj3 = this.A04;
                int i = this.A01;
                int i2 = this.A02;
                C146288ly A07 = AnonymousClass7KV.A07(r13, true);
                Object A0p = C147188nY.A0p(r13);
                Object A0n = C147188nY.A0n(r13);
                Object A0m = C147188nY.A0m(r13);
                AnonymousClass0ZU r1 = AnonymousClass74X.A00;
                AnonymousClass0YM A003 = C98236Es.A00(A022);
                AnonymousClass7W3 r2 = (AnonymousClass7W3) r13;
                C147188nY.A0w(r13, r2, r1);
                AnonymousClass7W3.A0a(r13, r2, A07, A0p);
                AnonymousClass7KP.A07(r13, A0n, A0m, A003);
                r13.Cvb(-1948763436);
                C86104wH.A1R(obj3, r13, (AnonymousClass0YM) this.A03, ((i >> 3) & 14) | ((i2 >> 21) & 112));
                AnonymousClass7W3.A0v(r2, true);
            } else {
                r13.CuJ();
            }
        }
        return Unit.A00;
    }
}
