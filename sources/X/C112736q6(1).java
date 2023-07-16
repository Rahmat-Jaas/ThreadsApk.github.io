package X;

import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import java.util.Arrays;

/* renamed from: X.6q6  reason: invalid class name and case insensitive filesystem */
public final class C112736q6 {
    public final /* synthetic */ C109326jp A00;
    public final /* synthetic */ AnonymousClass3HX A01;
    public final /* synthetic */ AnonymousClass601 A02;
    public final /* synthetic */ C109326jp A03;

    public C112736q6(AnonymousClass3HX r1, AnonymousClass601 r2, C109326jp r3, C109326jp r4) {
        this.A03 = r3;
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r4;
    }

    public final void A00(Integer num) {
        String str;
        C109326jp r2 = this.A00;
        if (r2 != null) {
            AnonymousClass3HX r1 = this.A01;
            switch (num.intValue()) {
                case 0:
                    str = MessageAvailabilityResponseId$Companion.NOT_AVAILABLE;
                    break;
                case 1:
                    str = "NO_PERMISSION";
                    break;
                case 2:
                    str = "USER_CANCELLED";
                    break;
                default:
                    str = "INTERNAL_ERROR";
                    break;
            }
            C61043Rr.A00(this.A02, new C63893iY(Arrays.asList(new Object[]{r1, str})), r2);
        }
    }
}
