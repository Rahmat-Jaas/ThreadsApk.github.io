package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class IGProactiveWarningBannerQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class IgProactiveWarningBannerQuery extends TreeJNI implements C81204nM {

        public final class SafetyInterventions extends TreeJNI implements C81204nM {

            public final class Interventions extends TreeJNI implements C81204nM {

                public final class ImpressionSettings extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"impression_cooldown_secs", "maximum_global_impressions", "maximum_impressions_per_user"};
                    }
                }

                public final class IxtFlowTarget extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"flow_context", "flow_uri"};
                    }
                }

                public final class Targets extends TreeJNI implements C81204nM {

                    public final class TargetActions extends TreeJNI implements C81204nM {
                        public final String[] getScalarFields() {
                            return new String[]{"action_type", "locations"};
                        }
                    }

                    public final String[] getScalarFields() {
                        return new String[]{"target_user_id"};
                    }

                    public final C108776iv[] getEdgeFields() {
                        return AnonymousClass0wJ.A1b(TargetActions.class, "target_actions");
                    }
                }

                public final String[] getScalarFields() {
                    return new String[]{"priority", "type"};
                }

                public final C108776iv[] getEdgeFields() {
                    return new C108776iv[]{C18190wL.A0G(Targets.class, "targets", true), C18190wL.A0G(IxtFlowTarget.class, "ixt_flow_target", false), C18190wL.A0G(ImpressionSettings.class, "impression_settings", false)};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1b(Interventions.class, "interventions");
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"banner_position", "button_layout", "context", "flow_type", "primary_button_style", "secondary_button_style"};
        }

        public final class PrimaryButtonAccessibilityLabel extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18210wN.A1a();
            }
        }

        public final class PrimaryButtonLabel extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18210wN.A1a();
            }
        }

        public final class SecondaryButtonAccessibilityLabel extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18210wN.A1a();
            }
        }

        public final class SecondaryButtonLabel extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18210wN.A1a();
            }
        }

        public final class Subtitle extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18210wN.A1a();
            }
        }

        public final class Title extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18210wN.A1a();
            }
        }

        public final C108776iv[] getEdgeFields() {
            return new C108776iv[]{C18190wL.A0G(Title.class, DialogModule.KEY_TITLE, false), C18190wL.A0G(Subtitle.class, "subtitle", false), C18190wL.A0G(PrimaryButtonLabel.class, "primary_button_label", false), C18190wL.A0G(PrimaryButtonAccessibilityLabel.class, "primary_button_accessibility_label", false), C18190wL.A0G(SecondaryButtonLabel.class, "secondary_button_label", false), C18190wL.A0G(SecondaryButtonAccessibilityLabel.class, "secondary_button_accessibility_label", false), C18190wL.A0G(SafetyInterventions.class, "safety_interventions", false)};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IgProactiveWarningBannerQuery.class, "ig_proactive_warning_banner_query(target_user_id:$target_user_id,thread_id:$thread_id)");
    }
}
