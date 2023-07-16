package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import ch.boye.httpclientandroidlib.cookie.ClientCookie;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

public final class OnDeviceFLMetadataResponseImpl extends TreeJNI implements C81204nM {

    public final class OnDeviceFlMetadata extends TreeJNI implements C81204nM {

        public final class SignalMetadata extends TreeJNI implements C81204nM {

            public final class Signals extends TreeJNI implements C81204nM {

                public final class Base extends TreeJNI implements C81204nM {

                    public final class Default extends TreeJNI implements C81204nM {
                        public final String[] getScalarFields() {
                            return new String[]{"double_list", "float_value", "int32_list", "int_value", "string_list", "string_value"};
                        }
                    }

                    public final String[] getScalarFields() {
                        return new String[]{"type"};
                    }

                    public final C108776iv[] getEdgeFields() {
                        return AnonymousClass0wJ.A1a(Default.class, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
                    }
                }

                public final class Cache extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"cache_ttl_in_days"};
                    }
                }

                public final class Time extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"refresh_interval_in_seconds", "schedule_interval_in_minutes", "time_out_in_seconds"};
                    }
                }

                public final String[] getScalarFields() {
                    return new String[]{"collection_delay", "id", "purpose", "real_time", ClientCookie.VERSION_ATTR};
                }

                public final C108776iv[] getEdgeFields() {
                    return new C108776iv[]{C18190wL.A0G(Base.class, "base", false), C18190wL.A0G(Cache.class, "cache", false), C18190wL.A0G(Time.class, "time", false)};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{ClientCookie.VERSION_ATTR};
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1b(Signals.class, "signals");
            }
        }

        public final class Usecases extends TreeJNI implements C81204nM {

            public final class CacheConfig extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"cache_ttl_in_days"};
                }
            }

            public final class Context extends TreeJNI implements C81204nM {

                public final class UsecaseFeatures extends TreeJNI implements C81204nM {

                    public final class Default extends TreeJNI implements C81204nM {
                        public final String[] getScalarFields() {
                            return new String[]{"float_value", "int_value", "string_list", "string_value"};
                        }
                    }

                    public final String[] getScalarFields() {
                        return new String[]{FXPFAccessLibraryDebugFragment.NAME, "type"};
                    }

                    public final C108776iv[] getEdgeFields() {
                        return AnonymousClass0wJ.A1a(Default.class, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
                    }
                }

                public final String[] getScalarFields() {
                    return new String[]{"feature_ids", "signal_ids"};
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1b(UsecaseFeatures.class, "usecase_features");
                }
            }

            public final class FeaturesConfig extends TreeJNI implements C81204nM {

                public final class FeaturesList extends TreeJNI implements C81204nM {

                    public final class MetadataConfig extends TreeJNI implements C81204nM {

                        public final class Metadata extends TreeJNI implements C81204nM {

                            public final class Cache extends TreeJNI implements C81204nM {
                                public final String[] getScalarFields() {
                                    return new String[]{"cache_ttl_in_days"};
                                }
                            }

                            public final String[] getScalarFields() {
                                return new String[]{"input_signal_list", "log_level", "package", "source", "transformer_name"};
                            }

                            public final C108776iv[] getEdgeFields() {
                                return AnonymousClass0wJ.A1a(Cache.class, "cache");
                            }
                        }

                        public final class Value extends TreeJNI implements C81204nM {

                            public final class Default extends TreeJNI implements C81204nM {
                                public final String[] getScalarFields() {
                                    return new String[]{"double_list", "float_value", "int32_list", "int_value", "string_list", "string_value"};
                                }
                            }

                            public final String[] getScalarFields() {
                                return new String[]{"type"};
                            }

                            public final C108776iv[] getEdgeFields() {
                                return AnonymousClass0wJ.A1a(Default.class, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
                            }
                        }

                        public final String[] getScalarFields() {
                            return new String[]{ClientCookie.VERSION_ATTR};
                        }

                        public final C108776iv[] getEdgeFields() {
                            return C18180wK.A1a(C18190wL.A0G(Value.class, IntentModule.EXTRA_MAP_KEY_FOR_VALUE, false), Metadata.class, "metadata", false);
                        }
                    }

                    public final String[] getScalarFields() {
                        return new String[]{"id", FXPFAccessLibraryDebugFragment.NAME};
                    }

                    public final C108776iv[] getEdgeFields() {
                        return AnonymousClass0wJ.A1b(MetadataConfig.class, "metadata_config");
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1b(FeaturesList.class, "features_list");
                }
            }

            public final class PredictorConfig extends TreeJNI implements C81204nM {

                public final class ControlConfig extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"is_cache_enabled", "is_enabled", "is_logging_enabled"};
                    }
                }

                public final class CacheConfig extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"cache_ttl_in_days", "cache_ttl_in_minutes"};
                    }
                }

                public final class Features extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"id", ClientCookie.VERSION_ATTR};
                    }
                }

                public final class ModelConfig extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"default_confidence", "model_asset_name", "model_name", "model_positive_threshold", "model_version"};
                    }
                }

                public final class TimeConfig extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"refresh_interval_in_seconds", "schedule_interval_in_minutes", "time_out_in_seconds"};
                    }
                }

                public final String[] getScalarFields() {
                    return new String[]{"feature_preference", "log_level"};
                }

                public final C108776iv[] getEdgeFields() {
                    return new C108776iv[]{C18190wL.A0G(Features.class, "features", true), C18190wL.A0G(ModelConfig.class, "model_config", false), C18190wL.A0G(ControlConfig.class, "control_config", false), C18190wL.A0G(TimeConfig.class, "time_config", false), C18190wL.A0G(CacheConfig.class, "cache_config", false)};
                }
            }

            public final class TrainerConfig extends TreeJNI implements C81204nM {

                public final class Features extends TreeJNI implements C81204nM {

                    public final class Rules extends TreeJNI implements C81204nM {

                        public final class Value extends TreeJNI implements C81204nM {
                            public final String[] getScalarFields() {
                                return new String[]{"double_list", "float_value", "int32_list", "int_value", "string_list", "string_value"};
                            }
                        }

                        public final String[] getScalarFields() {
                            return new String[]{"comparator", "type"};
                        }

                        public final C108776iv[] getEdgeFields() {
                            return AnonymousClass0wJ.A1a(Value.class, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                        }
                    }

                    public final String[] getScalarFields() {
                        return new String[]{"id", ClientCookie.VERSION_ATTR};
                    }

                    public final C108776iv[] getEdgeFields() {
                        return AnonymousClass0wJ.A1b(Rules.class, "rules");
                    }
                }

                public final class TimeConfig extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"refresh_interval_in_seconds", "schedule_interval_in_minutes", "time_out_in_seconds"};
                    }
                }

                public final String[] getScalarFields() {
                    return new String[]{"feature_preference", "is_enabled", "log_level"};
                }

                public final C108776iv[] getEdgeFields() {
                    return C18180wK.A1a(C18190wL.A0G(Features.class, "features", true), TimeConfig.class, "time_config", false);
                }
            }

            public final class UseCase extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"use_case_name", ClientCookie.VERSION_ATTR};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"purpose"};
            }

            public final C108776iv[] getEdgeFields() {
                return new C108776iv[]{C18190wL.A0G(UseCase.class, "use_case", false), C18190wL.A0G(Context.class, "context", false), C18190wL.A0G(CacheConfig.class, "cache_config", false), C18190wL.A0G(FeaturesConfig.class, "features_config", false), C18190wL.A0G(TrainerConfig.class, "trainer_config", false), C18190wL.A0G(PredictorConfig.class, "predictor_config", false)};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(Usecases.class, "usecases", true), SignalMetadata.class, "signal_metadata", false);
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(OnDeviceFlMetadata.class, "on_device_fl_metadata(input_params:{\"client_signal_metadata_version\":$client_signal_metadata_version,\"usecases\":$usecases})");
    }
}
