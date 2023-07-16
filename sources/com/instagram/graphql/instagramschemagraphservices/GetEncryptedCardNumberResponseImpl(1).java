package com.instagram.graphql.instagramschemagraphservices;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class GetEncryptedCardNumberResponseImpl extends TreeJNI implements C81204nM {

    public final class AutofillEncryptedCreditCard extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"encrypted_card_number"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(AutofillEncryptedCreditCard.class, "autofill_encrypted_credit_card(data:$input)");
    }
}
