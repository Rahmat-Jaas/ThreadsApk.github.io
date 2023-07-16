package com.facebook.analytics2.logger;

import X.AnonymousClass0CZ;
import X.AnonymousClass0Q7;
import X.C02590Ca;
import X.C02760Ct;
import java.io.IOException;

public class PrivacyControlledUploader implements C02590Ca {
    public static final IOException A02 = new IOException("Upload is skipped due to privacy control.");
    public AnonymousClass0Q7 A00;
    public C02590Ca A01;

    public final void DA0(C02760Ct r2, AnonymousClass0CZ r3) {
        this.A01.DA0(r2, r3);
    }

    public PrivacyControlledUploader(AnonymousClass0Q7 r1, C02590Ca r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
