package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBPayContactInfoQueryFragmentImpl extends TreeJNI implements C81204nM {

    public final class FbpayAccountExtended extends TreeJNI implements C81204nM {

        public final class FbpayAccount extends TreeJNI implements C81204nM {

            public final class Emails extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{FBPayEmailFragmentImpl.class};
                }
            }

            public final class Phones extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{FBPayPhoneFragmentImpl.class};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return C18180wK.A1a(C18190wL.A0G(Emails.class, "emails", true), Phones.class, "phones", true);
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(FbpayAccount.class, "fbpay_account");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FbpayAccountExtended.class, "fbpay_account_extended");
    }
}
