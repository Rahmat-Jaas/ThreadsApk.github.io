package kotlin.jvm.internal;

import X.AnonymousClass0YP;
import X.AnonymousClass0ZU;
import X.AnonymousClass2C6;
import X.AnonymousClass7JJ;
import X.C02220Ah;
import X.C128957ke;
import X.C18180wK;
import X.C22775Cg2;
import X.C30856GZq;
import X.C86104wH;
import com.facebookpay.addresstypeahead.controller.AddressTypeaheadController;
import com.fbpay.logging.LoggingContext;
import kotlin.Unit;

public class KtLambdaShape5S1201000_I2 extends C02220Ah implements AnonymousClass0ZU {
    public int A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape5S1201000_I2(Object obj, Object obj2, String str, int i, int i2) {
        super(0);
        this.A04 = i2;
        this.A02 = obj;
        this.A03 = str;
        this.A00 = i;
        this.A01 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        if (this.A04 != 0) {
            C30856GZq gZq = (C30856GZq) this.A02;
            int i = this.A00;
            String str = this.A03;
            C30856GZq.A01(gZq, gZq.A04.A01(), (C22775Cg2) this.A01, str, new IDxRImplShape185S0000000_5_I2(gZq, 4), (AnonymousClass0YP) null, i, false, false);
        } else {
            C128957ke A002 = AnonymousClass7JJ.A00();
            AddressTypeaheadController addressTypeaheadController = (AddressTypeaheadController) this.A02;
            LoggingContext loggingContext = addressTypeaheadController.A07;
            C128957ke.A04(C18180wK.A0I(C86104wH.A0K(A002.A00, "user_click_ecpaddresstypeahead_atomic"), 2833), loggingContext, new KtLambdaShape1S1202000_I2(loggingContext, (Object) null, "address_suggestion", AnonymousClass2C6.A00(this.A03), this.A00, 0));
            addressTypeaheadController.A09.invoke(this.A01);
        }
        return Unit.A00;
    }
}
