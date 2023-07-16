package com.instagram.graphql.instagramschemagraphservices;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

public final class AiAgentListQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbMessagingGenerativeAiBotQuery extends TreeJNI implements C81204nM {

        public final class Nodes extends TreeJNI implements C81204nM {

            public final class ProfilePicture extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{IgReactMediaPickerNativeModule.HEIGHT, "uri", IgReactMediaPickerNativeModule.WIDTH};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"eimu_id", FXPFAccessLibraryDebugFragment.NAME, "thread_id"};
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(ProfilePicture.class, "profile_picture");
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(Nodes.class, "nodes");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbMessagingGenerativeAiBotQuery.class, "xfb_messaging_generative_ai_bot_query");
    }
}
