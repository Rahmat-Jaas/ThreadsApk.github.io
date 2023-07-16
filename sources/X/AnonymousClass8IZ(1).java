package X;

import com.facebook.redex.IDxFunctionShape11S1300000_2_I2;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.fbpay.logging.LoggingContext;

/* renamed from: X.8IZ  reason: invalid class name */
public final class AnonymousClass8IZ extends C02220Ah implements AnonymousClass0YY {
    public final /* synthetic */ ECPRepositoryImpl A00;
    public final /* synthetic */ LoggingContext A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8IZ(ECPRepositoryImpl eCPRepositoryImpl, LoggingContext loggingContext, String str) {
        super(1);
        this.A01 = loggingContext;
        this.A00 = eCPRepositoryImpl;
        this.A02 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass7Kx r3 = (AnonymousClass7Kx) obj;
        C04220Ms.A0B(r3, 0);
        return AnonymousClass7Kx.A02(new IDxFunctionShape11S1300000_2_I2(this.A00, this.A01, r3, this.A02, 0), r3);
    }
}
