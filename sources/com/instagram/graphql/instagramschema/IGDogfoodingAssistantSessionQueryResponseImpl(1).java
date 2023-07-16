package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

public final class IGDogfoodingAssistantSessionQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbFetchDogfoodingAssistantSession extends TreeJNI implements C81204nM {

        public final class MinSupportedAppVersions extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"app_id", "min_app_version"};
            }
        }

        public final class Variants extends TreeJNI implements C81204nM {

            public final class Edges extends TreeJNI implements C81204nM {

                public final class Node extends TreeJNI implements C81204nM {

                    public final class GksConfig extends TreeJNI implements C81204nM {
                        public final String[] getScalarFields() {
                            return new String[]{"gk_name", IntentModule.EXTRA_MAP_KEY_FOR_VALUE};
                        }
                    }

                    public final class LaunchersConfig extends TreeJNI implements C81204nM {
                        public final String[] getScalarFields() {
                            return new String[]{"param", "schema", IntentModule.EXTRA_MAP_KEY_FOR_VALUE};
                        }
                    }

                    public final class QesConfig extends TreeJNI implements C81204nM {
                        public final String[] getScalarFields() {
                            return new String[]{"condition_name", "experiment_name", "universe_name"};
                        }
                    }

                    public final String[] getScalarFields() {
                        return new String[]{"is_default", FXPFAccessLibraryDebugFragment.NAME};
                    }

                    public final C108776iv[] getEdgeFields() {
                        return new C108776iv[]{C18190wL.A0G(LaunchersConfig.class, "launchers_config", true), C18190wL.A0G(GksConfig.class, "gks_config", true), C18190wL.A0G(QesConfig.class, "qes_config", true)};
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1a(Node.class, "node");
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1b(Edges.class, "edges");
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"id", FXPFAccessLibraryDebugFragment.NAME, "tag", "task_owner_id"};
        }

        public final class SessionOwner extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18210wN.A1b();
            }
        }

        public final C108776iv[] getEdgeFields() {
            return new C108776iv[]{C18190wL.A0G(MinSupportedAppVersions.class, "min_supported_app_versions", true), C18190wL.A0G(SessionOwner.class, "session_owner", false), C18190wL.A0G(Variants.class, "variants", false)};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbFetchDogfoodingAssistantSession.class, "xfb_fetch_dogfooding_assistant_session(id:$id)");
    }
}
