package kotlin.jvm.internal;

import X.AnonymousClass06E;
import X.AnonymousClass0YM;
import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass56S;
import X.AnonymousClass5I3;
import X.AnonymousClass6M8;
import X.AnonymousClass6N5;
import X.C02220Ah;
import X.C100106Lz;
import X.C115286uo;
import X.C115646vg;
import X.C115796vv;
import X.C117746zB;
import X.C117876zO;
import X.C121377Fr;
import X.C146638ma;
import X.C147188nY;
import X.C147218oz;
import X.C147258p3;
import X.C86104wH;
import X.C882357g;
import X.C883757u;
import X.C884057x;
import X.C968166u;
import androidx.compose.ui.Modifier;
import kotlin.Unit;

public class KtLambdaShape0S1402000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public String A06;
    public final int A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S1402000_I2(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, int i2, int i3) {
        super(2);
        this.A07 = i3;
        this.A05 = obj;
        this.A04 = obj2;
        this.A02 = obj3;
        this.A06 = str;
        this.A03 = obj4;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A07) {
            case 0:
                C147188nY A0H = C86104wH.A0H(obj, obj2);
                Object obj3 = this.A05;
                C115646vg.A01((C147218oz) this.A02, A0H, (Modifier) this.A04, obj3, this.A06, (AnonymousClass0YM) this.A03, this.A00 | 1, this.A01);
                break;
            case 1:
                C968166u r4 = (C968166u) this.A05;
                Modifier modifier = (Modifier) this.A03;
                C100106Lz.A00((C147258p3) this.A02, C86104wH.A0H(obj, obj2), modifier, r4, this.A06, (AnonymousClass0ZU) this.A04, C115796vv.A00(this.A00), this.A01);
                break;
            case 2:
                C115286uo r3 = (C115286uo) this.A02;
                String str = this.A06;
                AnonymousClass6M8.A00(C86104wH.A0H(obj, obj2), (Modifier) this.A03, r3, (AnonymousClass5I3) this.A05, str, (AnonymousClass0ZU) this.A04, C115796vv.A00(this.A00), this.A01);
                break;
            case 3:
                C117746zB.A00(C86104wH.A0H(obj, obj2), (Modifier) this.A02, (AnonymousClass56S) this.A05, this.A06, (AnonymousClass0ZU) this.A03, (AnonymousClass0YY) this.A04, C115796vv.A00(this.A00), this.A01);
                break;
            case 4:
                AnonymousClass6N5.A00(C86104wH.A0H(obj, obj2), (Modifier) this.A02, (C882357g) this.A05, this.A06, (AnonymousClass0ZU) this.A04, (AnonymousClass0YY) this.A03, C115796vv.A00(this.A00), this.A01);
                break;
            case 5:
                C147188nY A0H2 = C86104wH.A0H(obj, obj2);
                String str2 = this.A06;
                C121377Fr.A02(A0H2, (Modifier) this.A02, (C146638ma) this.A04, (C884057x) this.A05, str2, (AnonymousClass0ZU) this.A03, C115796vv.A00(this.A00), this.A01);
                break;
            default:
                AnonymousClass06E r32 = (AnonymousClass06E) this.A02;
                C117876zO.A01(C86104wH.A0H(obj, obj2), (Modifier) this.A03, r32, (C883757u) this.A05, this.A06, (AnonymousClass0ZU) this.A04, C115796vv.A00(this.A00), this.A01);
                break;
        }
        return Unit.A00;
    }
}
