package kotlin.jvm.internal;

import X.AnonymousClass0ZU;
import X.AnonymousClass6XO;
import X.AnonymousClass7DP;
import X.AnonymousClass7IQ;
import X.AnonymousClass7Kr;
import X.C02220Ah;
import X.C18180wK;
import X.C18240wQ;
import X.C89345Dg;
import com.facebookpay.otc.models.OtcInput;
import com.fbpay.logging.LoggingContext;
import java.util.List;
import kotlin.Unit;

public class KtLambdaShape2S1310000_I2 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public boolean A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape2S1310000_I2(C89345Dg r3, OtcInput otcInput, LoggingContext loggingContext, int i) {
        super(0);
        this.A05 = i;
        if (1 - i != 0) {
            this.A00 = loggingContext;
            this.A03 = "DELETE";
            this.A04 = true;
            this.A02 = r3;
            this.A01 = otcInput;
        } else {
            this.A01 = loggingContext;
            this.A03 = "DELETE";
            this.A04 = true;
            this.A00 = r3;
            this.A02 = otcInput;
        }
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass7Kr r1;
        LoggingContext loggingContext;
        String str;
        boolean z;
        List A0n;
        String str2;
        Object obj;
        AnonymousClass7DP r2;
        switch (this.A05) {
            case 0:
                if (this.A04) {
                    ((AnonymousClass7IQ) this.A02).A04.put(AnonymousClass7IQ.A02(this.A03), new KtLambdaShape22S0100000_I2_2(this.A01, 21));
                }
                C18240wQ.A1G(this.A00);
                return null;
            case 1:
                r1 = AnonymousClass6XO.A00;
                loggingContext = (LoggingContext) this.A01;
                str = this.A03;
                z = !this.A04;
                A0n = C18180wK.A0n(this.A00);
                str2 = null;
                obj = this.A02;
                break;
            default:
                r1 = AnonymousClass6XO.A00;
                loggingContext = (LoggingContext) this.A00;
                str = this.A03;
                z = !this.A04;
                A0n = C18180wK.A0n(this.A02);
                str2 = null;
                obj = this.A01;
                break;
        }
        OtcInput otcInput = (OtcInput) obj;
        if (otcInput != null) {
            r2 = AnonymousClass7DP.A00(otcInput);
        } else {
            r2 = null;
        }
        r1.A0H(r2, loggingContext, str, str2, A0n, z);
        return Unit.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape2S1310000_I2(AnonymousClass7IQ r2, String str, AnonymousClass0ZU r4, AnonymousClass0ZU r5) {
        super(0);
        this.A05 = 0;
        this.A04 = false;
        this.A02 = r2;
        this.A03 = str;
        this.A00 = r4;
        this.A01 = r5;
    }
}
