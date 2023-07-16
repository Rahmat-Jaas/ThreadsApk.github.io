package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

public final class CreatePayContainerMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class RequestPaymentContainer extends TreeJNI implements C81204nM {

        public final class AdditionalAuthenticationError extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{AdditionalAuthenticationErrorImpl.class};
            }
        }

        public final class ContainerList extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"container_data", "container_external_id", "container_id", "container_type", DevServerEntity.COLUMN_DESCRIPTION, "payment_mode"};
            }
        }

        public final class Error extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{SharedPaymentsErrorImpl.class};
            }
        }

        public final class NonAuthStepUpError extends TreeJNI implements C81204nM {

            public final class StepUpRequirements extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{FBPayNonAuthStepUpImpl.class};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1b(StepUpRequirements.class, "step_up_requirements");
            }
        }

        public final C108776iv[] getEdgeFields() {
            return new C108776iv[]{C18190wL.A0G(ContainerList.class, "container_list", true), C18190wL.A0G(AdditionalAuthenticationError.class, "additional_authentication_error", false), C18190wL.A0G(Error.class, "error", false), C18190wL.A0G(NonAuthStepUpError.class, "non_auth_step_up_error", false)};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(RequestPaymentContainer.class, "request_payment_container(input:$input)");
    }
}
