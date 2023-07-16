package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import X.C86154wM;
import com.facebook.pando.TreeJNI;

public final class FBPayAuthFlowsContentQueryFragmentImpl extends TreeJNI implements C81204nM {

    public final class FbpayAuthenticationInformationQuery extends TreeJNI implements C81204nM {

        public final class AuthenticationInformation extends TreeJNI implements C81204nM {

            public final class Actions extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{FBPayAuthenticationFlowImpl.class};
                }
            }

            public final class DialogScreens extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{AuthDialogScreenImpl.class};
                }
            }

            public final class PinScreens extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{PINScreenImpl.class};
                }
            }

            public final class RecoveryScreens extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{PINRecoveryWithPasswordScreenImpl.class};
                }
            }

            public final class VerificationScreens extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{VerificationScreenImpl.class};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return new C108776iv[]{C18190wL.A0G(Actions.class, "actions", true), C18190wL.A0G(PinScreens.class, "pin_screens", true), C18190wL.A0G(DialogScreens.class, "dialog_screens", true), C18190wL.A0G(RecoveryScreens.class, "recovery_screens", true), C18190wL.A0G(VerificationScreens.class, "verification_screens", true)};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(AuthenticationInformation.class, "authentication_information");
        }

        public final String[] getScalarFields() {
            return C86154wM.A1b();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(FbpayAuthenticationInformationQuery.class, "fbpay_authentication_information_query(input:$input)");
    }
}
