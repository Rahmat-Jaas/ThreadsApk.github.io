package kotlin.jvm.internal;

import X.AnonymousClass000;
import X.AnonymousClass0MJ;
import X.AnonymousClass0YY;
import X.AnonymousClass5D8;
import X.AnonymousClass7F6;
import X.AnonymousClass7X9;
import X.C02220Ah;
import X.C104136bI;
import X.C121127Eg;
import X.C146278lx;
import X.C146868n0;
import X.C147558pX;
import X.C86104wH;
import X.C86114wI;
import X.C86124wJ;
import X.C877353x;
import ch.boye.httpclientandroidlib.HttpStatus;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.fbpay.logging.LoggingContext;
import kotlin.Unit;

public class KtLambdaShape0S0300100_I2 extends C02220Ah implements AnonymousClass0YY {
    public long A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape0S0300100_I2(int i, long j, Object obj, Object obj2, Object obj3) {
        super(1);
        this.A04 = i;
        this.A03 = obj;
        this.A01 = obj2;
        this.A00 = j;
        this.A02 = obj3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = obj;
        if (this.A04 != 0) {
            USLEBaseShape0S0000000 uSLEBaseShape0S0000000 = (USLEBaseShape0S0000000) obj2;
            AnonymousClass5D8 r3 = new AnonymousClass5D8();
            C86104wH.A1K(r3, (LoggingContext) this.A02);
            r3.A09("receiver_id", Long.valueOf(this.A00));
            C86124wJ.A1K(r3, AnonymousClass000.A00(HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE));
            Long l = (Long) this.A03;
            if (l != null) {
                r3.A09("product_item_id", l);
            }
            C86114wI.A1C(uSLEBaseShape0S0000000, r3);
            C86114wI.A1G(uSLEBaseShape0S0000000, this.A01);
            return uSLEBaseShape0S0000000;
        }
        C147558pX r5 = (C147558pX) obj2;
        C147558pX.A00(r5);
        AnonymousClass7F6 r0 = (AnonymousClass7F6) this.A03;
        float f = r0.A01;
        float f2 = r0.A03;
        long j = this.A00;
        C146278lx r2 = ((AnonymousClass7X9) r5.Ae6()).A00;
        r2.D7f(f, f2);
        long j2 = C121127Eg.A01;
        r5.AIu((C104136bI) this.A02, (C146868n0) ((AnonymousClass0MJ) this.A01).A00, C877353x.A00, 1.0f, 3, 1, j2, j, j2, j);
        r2.D7f(-f, -f2);
        return Unit.A00;
    }
}
