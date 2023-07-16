package com.fbpay.w3c.security;

import X.AnonymousClass00U;
import X.AnonymousClass0ZU;
import X.AnonymousClass7E9;
import X.AnonymousClass8HI;
import X.AnonymousClass8NI;
import X.C86154wM;
import java.util.concurrent.TimeUnit;

public final class SecurityProviderEphemeral extends AnonymousClass7E9 {
    public static AnonymousClass0ZU A00 = AnonymousClass8HI.A00;
    public static final long A01 = C86154wM.A08(TimeUnit.MINUTES);

    public SecurityProviderEphemeral(long j) {
        super(AnonymousClass00U.A08(j, "W3C_PAYMENT_ENCRYPTION_KEY_"), AnonymousClass8NI.A00, 2, true);
    }
}
