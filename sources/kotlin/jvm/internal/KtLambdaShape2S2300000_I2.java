package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass58M;
import X.AnonymousClass7DP;
import X.AnonymousClass7JJ;
import X.AnonymousClass7Kr;
import X.C02220Ah;
import X.C128957ke;
import X.C18180wK;
import X.C18220wO;
import X.C86104wH;
import com.fbpay.logging.LoggingContext;
import java.util.LinkedHashMap;
import kotlin.Unit;

public class KtLambdaShape2S2300000_I2 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape2S2300000_I2(Object obj, Object obj2, Object obj3, String str, String str2) {
        super(1);
        this.A00 = obj;
        this.A03 = str;
        this.A02 = obj2;
        this.A01 = obj3;
        this.A04 = str2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A1X = AnonymousClass0wJ.A1X(obj);
        C128957ke A002 = AnonymousClass7JJ.A00();
        AnonymousClass58M r0 = (AnonymousClass58M) this.A02;
        LoggingContext A0v = r0.A0v();
        String str = this.A04;
        Object obj2 = this.A00;
        Object obj3 = this.A01;
        AnonymousClass7DP A032 = r0.A1O.A03();
        String str2 = this.A03;
        LinkedHashMap A0y = C18220wO.A0y();
        AnonymousClass7Kr.A0B(A032, A0y);
        C86104wH.A1V(A0y, A1X);
        if (str2 != null) {
            A0y.put("selected_credential_state", str2);
        }
        C128957ke.A04(C18180wK.A0I(C86104wH.A0K(C128957ke.A00(A002, str), "client_load_credential_success"), 263), A0v, new KtLambdaShape3S1400000_I2(A0y, obj3, A0v, obj2, str, 3));
        return Unit.A00;
    }
}
