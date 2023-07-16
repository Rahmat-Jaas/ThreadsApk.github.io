package X;

import com.facebookpay.confirmation.model.ECPConfirmationParams;

/* renamed from: X.7ST  reason: invalid class name */
public final class AnonymousClass7ST implements C142618fJ {
    public static final AnonymousClass7ST A00 = new AnonymousClass7ST();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        int i;
        ECPConfirmationParams eCPConfirmationParams = (ECPConfirmationParams) obj;
        String str = eCPConfirmationParams.A01;
        if (C04220Ms.A0I(str, "NEXT")) {
            i = 2131826360;
        } else if (C04220Ms.A0I(str, "CLOSE")) {
            i = 2131826359;
        } else {
            StringBuilder A0s = C18190wL.A0s("Invalid confirmation CTA type {");
            A0s.append(eCPConfirmationParams);
            throw C18190wL.A0a(C18180wK.A0i(".ctaType}", A0s));
        }
        return Integer.valueOf(i);
    }
}
