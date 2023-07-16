package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

public final class MetaPayConnectQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class MetaPayWalletConnectPayload extends TreeJNI implements C81204nM {

        public final class FbConnectAccountInfo extends TreeJNI implements C81204nM {

            public final class AutofillAddress extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{MetaPayConnectAddressDetailsImpl.class};
                }
            }

            public final class Credentials extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{MetaPayConnectCredentialImpl.class};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"account_id", "app_name", "email", "has_linked_accounts", FXPFAccessLibraryDebugFragment.NAME, "profile_url"};
            }

            public final C108776iv[] getEdgeFields() {
                return C18180wK.A1a(C18190wL.A0G(Credentials.class, "credentials", true), AutofillAddress.class, "autofill_address", false);
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"connect_cancellation_count"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(FbConnectAccountInfo.class, "fb_connect_account_info");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(MetaPayWalletConnectPayload.class, "meta_pay_wallet_connect_payload");
    }
}
