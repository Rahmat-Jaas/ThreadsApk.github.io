package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.intent.IntentModule;

public final class OnDeviceFLFeaturesResponseImpl extends TreeJNI implements C81204nM {

    public final class OnDeviceFlFeatures extends TreeJNI implements C81204nM {

        public final class Features extends TreeJNI implements C81204nM {

            public final class IntFeatures extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"id", IntentModule.EXTRA_MAP_KEY_FOR_VALUE};
                }
            }

            public final class StringFeatures extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"id", IntentModule.EXTRA_MAP_KEY_FOR_VALUE};
                }
            }

            public final class Context extends TreeJNI implements C81204nM {

                public final class FloatFeatures extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"id", IntentModule.EXTRA_MAP_KEY_FOR_VALUE};
                    }
                }

                public final class IntFeatures extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"id", IntentModule.EXTRA_MAP_KEY_FOR_VALUE};
                    }
                }

                public final class StringFeatures extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"id", IntentModule.EXTRA_MAP_KEY_FOR_VALUE};
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return new C108776iv[]{C18190wL.A0G(IntFeatures.class, "int_features", true), C18190wL.A0G(FloatFeatures.class, "float_features", true), C18190wL.A0G(StringFeatures.class, "string_features", true)};
                }
            }

            public final class FloatFeatures extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"id", IntentModule.EXTRA_MAP_KEY_FOR_VALUE};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"id"};
            }

            public final C108776iv[] getEdgeFields() {
                return new C108776iv[]{C18190wL.A0G(Context.class, "context", false), C18190wL.A0G(IntFeatures.class, "int_features", true), C18190wL.A0G(FloatFeatures.class, "float_features", true), C18190wL.A0G(StringFeatures.class, "string_features", true)};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"time_stamp", "usecase", ClientCookie.VERSION_ATTR};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(Features.class, "features");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(OnDeviceFlFeatures.class, "on_device_fl_features(input_params:{\"client_msg\":$client_msg,\"client_msg_type\":$client_msg_type,\"contexts\":$contexts,\"purpose\":$purpose,\"test_id\":$test_id,\"usecase\":$usecase,\"version\":$version})");
    }
}
