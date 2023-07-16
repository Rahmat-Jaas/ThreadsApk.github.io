package kotlin.jvm.internal;

import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass57K;
import X.AnonymousClass57N;
import X.AnonymousClass67Y;
import X.AnonymousClass6MU;
import X.AnonymousClass6MW;
import X.AnonymousClass8s2;
import X.C02220Ah;
import X.C100506No;
import X.C115556vT;
import X.C115646vg;
import X.C115796vv;
import X.C117906zR;
import X.C121347Fo;
import X.C121357Fp;
import X.C121367Fq;
import X.C146178lm;
import X.C147188nY;
import X.C147218oz;
import X.C19200zT;
import X.C86104wH;
import X.C881656z;
import X.C970767v;
import android.content.Context;
import androidx.compose.ui.Modifier;
import com.instagram.service.session.UserSession;
import kotlin.Unit;

public class KtLambdaShape1S0502000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public final int A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape1S0502000_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, int i3) {
        super(2);
        this.A07 = i3;
        this.A06 = obj;
        this.A05 = obj2;
        this.A02 = obj3;
        this.A04 = obj4;
        this.A03 = obj5;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A07) {
            case 0:
                C147188nY A0H = C86104wH.A0H(obj, obj2);
                C115646vg.A00((C147218oz) this.A02, (C115556vT) this.A06, A0H, (Modifier) this.A05, (AnonymousClass0YY) this.A04, (AnonymousClass0YM) this.A03, this.A00 | 1, this.A01);
                break;
            case 1:
                AnonymousClass0ZU r3 = (AnonymousClass0ZU) this.A04;
                AnonymousClass0YY r4 = (AnonymousClass0YY) this.A06;
                AnonymousClass0YP r5 = (AnonymousClass0YP) this.A05;
                AnonymousClass6MU.A00(C86104wH.A0H(obj, obj2), (Modifier) this.A03, r3, r4, r5, (AnonymousClass8s2) this.A02, C115796vv.A00(this.A00), this.A01);
                break;
            case 2:
                AnonymousClass6MW.A00(C86104wH.A0H(obj, obj2), (Modifier) this.A03, (C146178lm) this.A02, (AnonymousClass0ZU) this.A04, (AnonymousClass0YY) this.A06, (AnonymousClass0YP) this.A05, C115796vv.A00(this.A00), this.A01);
                break;
            case 3:
                C121347Fo.A01(C86104wH.A0H(obj, obj2), (Modifier) this.A02, (AnonymousClass57K) this.A06, (AnonymousClass0ZU) this.A05, (AnonymousClass0ZU) this.A03, (AnonymousClass0ZU) this.A04, C115796vv.A00(this.A00), this.A01);
                break;
            case 4:
                C121357Fp.A01(C86104wH.A0H(obj, obj2), (Modifier) this.A02, (AnonymousClass57N) this.A06, (AnonymousClass0ZU) this.A05, (AnonymousClass0ZU) this.A03, (AnonymousClass0ZU) this.A04, C115796vv.A00(this.A00), this.A01);
                break;
            case 5:
                C970767v r42 = (C970767v) this.A02;
                AnonymousClass67Y r32 = (AnonymousClass67Y) this.A06;
                C121367Fq.A02(C86104wH.A0H(obj, obj2), (Modifier) this.A03, r32, r42, (AnonymousClass0ZU) this.A05, (AnonymousClass0ZU) this.A04, C115796vv.A00(this.A00), this.A01);
                break;
            case 6:
                Modifier modifier = (Modifier) this.A03;
                C881656z r43 = (C881656z) this.A06;
                C100506No.A00((Context) this.A02, C86104wH.A0H(obj, obj2), modifier, r43, (UserSession) this.A05, (AnonymousClass0ZU) this.A04, C115796vv.A00(this.A00), this.A01);
                break;
            default:
                Modifier modifier2 = (Modifier) this.A02;
                AnonymousClass0ZU r52 = (AnonymousClass0ZU) this.A05;
                C117906zR.A00(C86104wH.A0H(obj, obj2), modifier2, (C19200zT) this.A06, (AnonymousClass0ZU) this.A04, r52, (AnonymousClass0YP) this.A03, C115796vv.A00(this.A00), this.A01);
                break;
        }
        return Unit.A00;
    }
}
