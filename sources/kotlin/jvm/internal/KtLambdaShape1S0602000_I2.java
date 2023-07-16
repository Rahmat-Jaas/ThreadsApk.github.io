package kotlin.jvm.internal;

import X.AnonymousClass06E;
import X.AnonymousClass0YC;
import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass10I;
import X.AnonymousClass56Y;
import X.AnonymousClass570;
import X.AnonymousClass57B;
import X.AnonymousClass57M;
import X.AnonymousClass6DT;
import X.AnonymousClass7BX;
import X.AnonymousClass7Hw;
import X.AnonymousClass7In;
import X.AnonymousClass7JP;
import X.C02220Ah;
import X.C100516Np;
import X.C100546Ns;
import X.C115556vT;
import X.C115796vv;
import X.C117626yz;
import X.C1183470o;
import X.C1203679w;
import X.C1203779x;
import X.C121327Fm;
import X.C122107Kg;
import X.C144678it;
import X.C147188nY;
import X.C147368pE;
import X.C86104wH;
import X.C90405Lw;
import X.F6u;
import android.content.Context;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0410000_I2;
import com.instagram.service.session.UserSession;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

public class KtLambdaShape1S0602000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public final int A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape1S0602000_I2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2, int i3) {
        super(2);
        this.A08 = i3;
        this.A06 = obj;
        this.A05 = obj2;
        this.A07 = obj3;
        this.A03 = obj4;
        this.A04 = obj5;
        this.A02 = obj6;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A08) {
            case 0:
                AnonymousClass6DT.A00((C115556vT) this.A06, C86104wH.A0H(obj, obj2), (Alignment) this.A03, (Modifier) this.A05, (AnonymousClass0YY) this.A07, (AnonymousClass0YY) this.A04, (AnonymousClass0YC) this.A02, this.A00 | 1, this.A01);
                break;
            case 1:
                C147188nY A0H = C86104wH.A0H(obj, obj2);
                Modifier modifier = (Modifier) this.A05;
                AnonymousClass7JP.A04((C1203679w) this.A03, (C1203779x) this.A04, (C115556vT) this.A06, A0H, modifier, (AnonymousClass0YY) this.A07, (AnonymousClass0YM) this.A02, this.A00 | 1, this.A01);
                break;
            case 2:
                C117626yz.A01(C86104wH.A0H(obj, obj2), (C147368pE) this.A06, (Modifier) this.A03, (AnonymousClass06E) this.A02, (AnonymousClass56Y) this.A07, (AnonymousClass0YY) this.A05, (AnonymousClass0YY) this.A04, C115796vv.A00(this.A00), this.A01);
                break;
            case 3:
                List list = (List) this.A06;
                AnonymousClass7BX.A01(C86104wH.A0H(obj, obj2), (Modifier) this.A03, (AnonymousClass06E) this.A02, (F6u) this.A07, list, (AnonymousClass0ZU) this.A04, (AnonymousClass0YY) this.A05, C115796vv.A00(this.A00), this.A01);
                break;
            case 4:
                AnonymousClass0ZU r6 = (AnonymousClass0ZU) this.A05;
                Integer num = (Integer) this.A02;
                List list2 = (List) this.A03;
                C121327Fm.A01(C86104wH.A0H(obj, obj2), (Modifier) this.A04, num, list2, (AnonymousClass0ZU) this.A07, r6, (AnonymousClass0YY) this.A06, C115796vv.A00(this.A00), this.A01);
                break;
            case 5:
                AnonymousClass0ZU r5 = (AnonymousClass0ZU) this.A03;
                KtCSuperShape0S0410000_I2 ktCSuperShape0S0410000_I2 = (KtCSuperShape0S0410000_I2) this.A06;
                AnonymousClass57M r4 = (AnonymousClass57M) this.A07;
                AnonymousClass7In.A02(C86104wH.A0H(obj, obj2), (Modifier) this.A02, ktCSuperShape0S0410000_I2, r4, r5, (AnonymousClass0YY) this.A04, (AnonymousClass0YY) this.A05, C115796vv.A00(this.A00), this.A01);
                break;
            case 6:
                AnonymousClass0ZU r42 = (AnonymousClass0ZU) this.A05;
                C122107Kg.A04(C86104wH.A0H(obj, obj2), (Modifier) this.A02, (C90405Lw) this.A07, r42, (AnonymousClass0YY) this.A03, (AnonymousClass0YY) this.A06, (AnonymousClass0YY) this.A04, C115796vv.A00(this.A00), this.A01);
                break;
            case 7:
                C100516Np.A00(C86104wH.A0H(obj, obj2), (Modifier) this.A02, (AnonymousClass570) this.A07, (AnonymousClass0ZU) this.A05, (AnonymousClass0ZU) this.A03, (AnonymousClass0ZU) this.A06, (AnonymousClass0ZU) this.A04, C115796vv.A00(this.A00), this.A01);
                break;
            case 8:
                Modifier modifier2 = (Modifier) this.A03;
                AnonymousClass57B r43 = (AnonymousClass57B) this.A07;
                C100546Ns.A00((Context) this.A02, C86104wH.A0H(obj, obj2), modifier2, r43, (UserSession) this.A06, (AnonymousClass0ZU) this.A05, (AnonymousClass0YP) this.A04, C115796vv.A00(this.A00), this.A01);
                break;
            case 9:
                C144678it r44 = (C144678it) this.A07;
                Modifier modifier3 = (Modifier) this.A03;
                AnonymousClass7Hw.A00((LazyListState) this.A02, C86104wH.A0H(obj, obj2), modifier3, r44, (List) this.A06, (AnonymousClass0YY) this.A04, (AnonymousClass0YY) this.A05, C115796vv.A00(this.A00), this.A01);
                break;
            case 10:
                Modifier modifier4 = (Modifier) this.A03;
                AnonymousClass7Hw.A02((LazyListState) this.A02, C86104wH.A0H(obj, obj2), modifier4, (List) this.A06, (Set) this.A07, (AnonymousClass0YY) this.A04, (AnonymousClass0YY) this.A05, C115796vv.A00(this.A00), this.A01);
                break;
            default:
                AnonymousClass0ZU r45 = (AnonymousClass0ZU) this.A04;
                AnonymousClass0ZU r52 = (AnonymousClass0ZU) this.A06;
                AnonymousClass0ZU r62 = (AnonymousClass0ZU) this.A05;
                AnonymousClass10I r3 = (AnonymousClass10I) this.A07;
                C1183470o.A00(C86104wH.A0H(obj, obj2), (Modifier) this.A02, r3, r45, r52, r62, (AnonymousClass0YP) this.A03, C115796vv.A00(this.A00), this.A01);
                break;
        }
        return Unit.A00;
    }
}
