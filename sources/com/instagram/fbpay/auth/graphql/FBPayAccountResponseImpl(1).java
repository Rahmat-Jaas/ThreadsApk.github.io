package com.instagram.fbpay.auth.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBPayAccountResponseImpl extends TreeJNI implements C81204nM {

    public final class FbpayAccountExtended extends TreeJNI implements C81204nM {

        public final class FbpayAccount extends TreeJNI implements C81204nM {

            public final class FbpayAuth extends TreeJNI implements C81204nM {

                public final class AuthenticationTickets extends TreeJNI implements C81204nM {

                    public final class AuthTicketCapabilities extends TreeJNI implements C81204nM {
                        public final String[] getScalarFields() {
                            return new String[]{"cap_name", "ttl"};
                        }
                    }

                    public final String[] getScalarFields() {
                        return new String[]{"auth_ticket_status", "auth_ticket_type", "fingerprint", "id", "ttl"};
                    }

                    public final C108776iv[] getEdgeFields() {
                        return AnonymousClass0wJ.A1b(AuthTicketCapabilities.class, "auth_ticket_capabilities");
                    }
                }

                public final class FbpayPin extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"fbpay_pin_status", "id"};
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return C18180wK.A1a(C18190wL.A0G(FbpayPin.class, "fbpay_pin", false), AuthenticationTickets.class, "authentication_tickets(fbids:$fbids)", true);
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"id", "is_onboarded"};
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(FbpayAuth.class, "fbpay_auth");
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
