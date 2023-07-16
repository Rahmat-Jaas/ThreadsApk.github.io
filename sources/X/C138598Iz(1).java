package X;

import ch.boye.httpclientandroidlib.HttpStatus;
import com.fbpay.logging.LoggingContext;

/* renamed from: X.8Iz  reason: invalid class name and case insensitive filesystem */
public final class C138598Iz extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ long A00;
    public final /* synthetic */ LoggingContext A01;
    public final /* synthetic */ Long A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C138598Iz(LoggingContext loggingContext, Long l, String str, long j, boolean z) {
        super(1);
        this.A01 = loggingContext;
        this.A00 = j;
        this.A04 = z;
        this.A03 = str;
        this.A02 = l;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass0A3 r4 = (AnonymousClass0A3) obj;
        AnonymousClass5D8 r2 = new AnonymousClass5D8();
        C86104wH.A1K(r2, this.A01);
        r2.A09("receiver_id", Long.valueOf(this.A00));
        r2.A07("payment_availability", Boolean.valueOf(this.A04));
        r2.A0A("ecp_availability_reason", this.A03);
        C86124wJ.A1K(r2, AnonymousClass000.A00(HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE));
        Long l = this.A02;
        if (l != null) {
            r2.A09("product_item_id", l);
        }
        C86114wI.A1C(r4, r2);
        return r4;
    }
}
