package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass7Fz;
import X.AnonymousClass7In;
import X.AnonymousClass7KS;
import X.C02220Ah;
import X.C101196Qg;
import X.C101216Qi;
import X.C101226Qj;
import X.C102746Wj;
import X.C115796vv;
import X.C115826vy;
import X.C117616yy;
import X.C117866zN;
import X.C1183470o;
import X.C1191773v;
import X.C121387Fs;
import X.C122087Kb;
import X.C123027Va;
import X.C123037Vb;
import X.C123057Vd;
import X.C123077Vf;
import X.C147188nY;
import X.C86104wH;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.List;
import kotlin.Unit;

public class KtLambdaShape3S0102000_I2 extends C02220Ah implements AnonymousClass0YP {
    public int A00;
    public int A01;
    public Object A02;
    public final int A03;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3 = obj;
        switch (this.A03) {
            case 0:
                ((C123057Vd) this.A02).A4r(C86104wH.A0H(obj, obj2), this.A01, C115796vv.A00(this.A00));
                break;
            case 1:
                ((C123077Vf) this.A02).A4r(C86104wH.A0H(obj, obj2), this.A01, C115796vv.A00(this.A00));
                break;
            case 2:
                ((C123027Va) this.A02).A4r(C86104wH.A0H(obj, obj2), this.A01, C115796vv.A00(this.A00));
                break;
            case 3:
                ((C123037Vb) this.A02).A4r(C86104wH.A0H(obj, obj2), this.A01, C115796vv.A00(this.A00));
                break;
            case 4:
                C117616yy.A00((Modifier) this.A02, C86104wH.A0H(obj, obj2), C115796vv.A00(this.A00), this.A01);
                break;
            case 5:
                AnonymousClass7In.A05((Modifier) this.A02, C86104wH.A0H(obj, obj2), C115796vv.A00(this.A00), this.A01);
                break;
            case 6:
                C121387Fs.A03((Modifier) this.A02, C86104wH.A0H(obj, obj2), C115796vv.A00(this.A00), this.A01);
                break;
            case 7:
                C117866zN.A01(C86104wH.A0H(obj, obj2), (List) this.A02, this.A01, C115796vv.A00(this.A00));
                break;
            case 8:
                C101196Qg.A00((LazyListState) this.A02, C86104wH.A0H(obj, obj2), this.A01, C115796vv.A00(this.A00));
                break;
            case 9:
                C101216Qi.A00((Modifier) this.A02, C86104wH.A0H(obj, obj2), C115796vv.A00(this.A00), this.A01);
                break;
            case 10:
                C101226Qj.A00((Modifier) this.A02, C86104wH.A0H(obj, obj2), C115796vv.A00(this.A00), this.A01);
                break;
            case 11:
                C1183470o.A01((Modifier) this.A02, C86104wH.A0H(obj, obj2), C115796vv.A00(this.A00), this.A01);
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C147188nY r3 = (C147188nY) obj3;
                if ((AnonymousClass0wJ.A04(obj2) & 11) == 2 && r3.BCM()) {
                    r3.CuJ();
                    break;
                } else {
                    C1191773v.A00(r3, C115826vy.A01(Modifier.A05(Modifier.A00), C102746Wj.A00), new KtLambdaShape5S0102000_I2(this.A02, this.A01, this.A00, 4), (AnonymousClass0YY) null, 48, 4);
                    break;
                }
                break;
            case 13:
                C122087Kb.A0B(C86104wH.A0H(obj, obj2), (AnonymousClass0YY) this.A02, this.A01, C115796vv.A00(this.A00));
                break;
            case 14:
                AnonymousClass7KS.A09(C86104wH.A0H(obj, obj2), (AnonymousClass0ZU) this.A02, this.A01, C115796vv.A00(this.A00));
                break;
            case 15:
                AnonymousClass7Fz.A02(C86104wH.A0H(obj, obj2), (AnonymousClass0YY) this.A02, this.A01, C115796vv.A00(this.A00));
                break;
            default:
                AnonymousClass7Fz.A03(C86104wH.A0H(obj, obj2), (AnonymousClass0YY) this.A02, this.A01, C115796vv.A00(this.A00));
                break;
        }
        return Unit.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape3S0102000_I2(Object obj, int i, int i2, int i3) {
        super(2);
        this.A03 = i3;
        this.A01 = i;
        this.A02 = obj;
        this.A00 = i2;
    }
}
