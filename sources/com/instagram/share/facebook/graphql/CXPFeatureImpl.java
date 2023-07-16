package com.instagram.share.facebook.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class CXPFeatureImpl extends TreeJNI implements C81204nM {

    public final class FeatureProperties extends TreeJNI implements C81204nM {

        public final class PropertyValue extends TreeJNI implements C81204nM {

            public final class PropertyFeatureListValue extends TreeJNI implements C81204nM {

                public final class FeatureList extends TreeJNI implements C81204nM {

                    public final class FeatureListFeatureProperties extends TreeJNI implements C81204nM {
                        public final String[] getScalarFields() {
                            return new String[]{"property_name"};
                        }
                    }

                    public final String[] getScalarFields() {
                        return new String[]{"feature_name"};
                    }

                    public final C108776iv[] getEdgeFields() {
                        return AnonymousClass0wJ.A1b(FeatureListFeatureProperties.class, "feature_properties");
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1b(FeatureList.class, "feature_list");
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"property_string_list_value", "property_string_value"};
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(PropertyFeatureListValue.class, "property_feature_list_value");
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"property_name"};
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(PropertyValue.class, "property_value");
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"feature_name"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(FeatureProperties.class, "feature_properties");
    }
}
