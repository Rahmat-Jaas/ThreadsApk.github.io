package kotlin.jvm.internal;

import X.AnonymousClass0YY;
import X.AnonymousClass5DC;
import X.AnonymousClass6Ax;
import X.AnonymousClass75O;
import X.AnonymousClass7Hr;
import X.C02220Ah;
import X.C1371586i;
import X.C86104wH;
import X.C86114wI;
import X.C86124wJ;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.fbpay.logging.LoggingContext;
import java.util.List;
import kotlin.Unit;

public class KtLambdaShape2S1410000_I2 extends C02220Ah implements AnonymousClass0YY {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public String A04;
    public boolean A05;
    public final int A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape2S1410000_I2(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, boolean z) {
        super(1);
        this.A06 = i;
        this.A03 = obj;
        this.A05 = z;
        this.A00 = obj2;
        this.A04 = str;
        this.A01 = obj3;
        this.A02 = obj4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A06 != 0) {
            USLEBaseShape0S0000000 uSLEBaseShape0S0000000 = (USLEBaseShape0S0000000) obj;
            AnonymousClass5DC r3 = new AnonymousClass5DC();
            LoggingContext loggingContext = (LoggingContext) this.A03;
            C86104wH.A1K(r3, loggingContext);
            r3.A07("perform_validation", Boolean.valueOf(this.A05));
            r3.A0B("account_mutation_data_list", (List) this.A00);
            AnonymousClass7Hr.A03(r3, loggingContext);
            C86124wJ.A1K(r3, this.A04);
            AnonymousClass6Ax r1 = (AnonymousClass6Ax) this.A01;
            if (r1 != null) {
                r3.A04(r1, "account_mutation_failure_step");
            }
            C86114wI.A1C(uSLEBaseShape0S0000000, r3);
            C86114wI.A1G(uSLEBaseShape0S0000000, this.A02);
            return uSLEBaseShape0S0000000;
        }
        C1371586i A002 = AnonymousClass75O.A00(obj);
        A002.A01("enabled", Boolean.valueOf(this.A05));
        A002.A01("onClickLabel", this.A04);
        A002.A01("role", this.A03);
        A002.A01("onClick", this.A02);
        A002.A01("indication", this.A00);
        A002.A01("interactionSource", this.A01);
        return Unit.A00;
    }
}
