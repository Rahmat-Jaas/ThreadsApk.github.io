package X;

import com.fbpay.logging.LoggingContext;

/* renamed from: X.8Il  reason: invalid class name */
public final class AnonymousClass8Il extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass66S A01;
    public final /* synthetic */ LoggingContext A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Il(AnonymousClass66S r2, LoggingContext loggingContext, long j, boolean z) {
        super(1);
        this.A02 = loggingContext;
        this.A03 = z;
        this.A00 = j;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass6B6 r1;
        AnonymousClass0A3 r5 = (AnonymousClass0A3) obj;
        AnonymousClass5D7 r3 = new AnonymousClass5D7();
        AnonymousClass7Hr.A04(r3, this.A02);
        AnonymousClass5CX r2 = new AnonymousClass5CX();
        r2.A07("payment_availability", Boolean.valueOf(this.A03));
        r2.A09("receiver_id", Long.valueOf(this.A00));
        r3.A0B("ecp_preprocessing_response", C18180wK.A0n(r2));
        AnonymousClass66S r22 = this.A01;
        int ordinal = r22.ordinal();
        if (ordinal == 2) {
            r1 = AnonymousClass6B6.PUX;
        } else if (ordinal == 1) {
            r1 = AnonymousClass6B6.NUX;
        } else {
            throw C18190wL.A0a(AnonymousClass0wJ.A0t("Invalid experience type: ", r22));
        }
        r3.A04(r1, "ecp_experience_type");
        C86114wI.A1C(r5, r3);
        return r5;
    }
}
