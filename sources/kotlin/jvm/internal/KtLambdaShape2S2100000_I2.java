package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass58M;
import X.AnonymousClass7DP;
import X.AnonymousClass7JJ;
import X.AnonymousClass7Kr;
import X.C02220Ah;
import X.C128957ke;
import X.C133877wc;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C86104wH;
import com.facebookpay.common.recyclerview.adapteritems.PuxContactItem;
import com.fbpay.logging.LoggingContext;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

public class KtLambdaShape2S2100000_I2 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public String A01;
    public String A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape2S2100000_I2(String str, String str2, Map map, int i) {
        super(1);
        this.A03 = i;
        switch (i) {
            case 1:
            case 3:
            case 4:
                this.A01 = str;
                this.A02 = str2;
                break;
            default:
                this.A02 = str;
                this.A01 = str2;
                break;
        }
        this.A00 = map;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Long l;
        String str;
        switch (this.A03) {
            case 1:
                C86104wH.A0N(obj).AGB(this.A01, this.A02, (Map) this.A00);
                break;
            case 2:
                C86104wH.A0N(obj).AL7(this.A02, this.A01, (Map) this.A00);
                break;
            case 3:
                C86104wH.A0N(obj).AL8(this.A01, this.A02, (Map) this.A00);
                break;
            case 4:
                return C86104wH.A0N(obj).BJf(this.A01, this.A02, (Map) this.A00);
            case 5:
                boolean A1X = AnonymousClass0wJ.A1X(obj);
                C128957ke A002 = AnonymousClass7JJ.A00();
                AnonymousClass58M r1 = (AnonymousClass58M) this.A00;
                LoggingContext A0v = r1.A0v();
                String str2 = this.A02;
                PuxContactItem puxContactItem = (PuxContactItem) r1.A0I.A01;
                if (puxContactItem == null || (str = puxContactItem.A02) == null) {
                    l = null;
                } else {
                    l = AnonymousClass0wJ.A0d(str);
                }
                AnonymousClass7DP A032 = r1.A1O.A03();
                String str3 = this.A01;
                LinkedHashMap A0y = C18220wO.A0y();
                AnonymousClass7Kr.A0B(A032, A0y);
                C86104wH.A1V(A0y, A1X);
                if (str3 != null) {
                    A0y.put("selected_contact_state", str3);
                }
                C128957ke.A04(C18180wK.A0I(C86104wH.A0K(C128957ke.A00(A002, str2), "client_load_contact_success"), 260), A0v, new KtLambdaShape3S1300000_I2(A0v, l, str2, (Map) A0y, 13));
                break;
            default:
                ((C133877wc) this.A00).A01.flowAnnotate(C18190wL.A08(obj), this.A01, this.A02);
                break;
        }
        return Unit.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape2S2100000_I2(Object obj, String str, String str2, int i) {
        super(1);
        this.A03 = i;
        this.A00 = obj;
        this.A02 = str;
        this.A01 = str2;
    }
}
