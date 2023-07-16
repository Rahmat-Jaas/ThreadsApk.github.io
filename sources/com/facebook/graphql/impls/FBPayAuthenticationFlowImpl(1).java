package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;

public final class FBPayAuthenticationFlowImpl extends TreeJNI implements C81204nM {

    public final class Steps extends TreeJNI implements C81204nM {

        public final class SubActions extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"action_type", "sub_action_type"};
            }

            public final class Text extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return C18210wN.A1a();
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(Text.class, "text");
            }
        }

        public final String[] getScalarFields() {
            return new String[]{TraceFieldType.ContentType, "next_step_type", "screen_type", "step_type"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(SubActions.class, "sub_actions");
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"action_type", "first_step_type"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(Steps.class, "steps");
    }
}
