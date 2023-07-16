package com.instagram.graphql.instagramschemagraphservices;

import X.C108776iv;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class CustomServiceDataObjectImpl extends TreeJNI implements C81204nM {

    public final class InlineCrossPostingCustomClientServiceData extends TreeJNI implements C81204nM {

        public final class AutoXpostSetting extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"auto_crosspost_setting_surface", "auto_crosspost_setting_timestamp", "is_auto_crosspost_enabled", "source_surface"};
            }
        }

        public final class DestinationMetadataServiceData extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"destination_name", "destination_profile_url_link"};
            }
        }

        public final class FbFeedPrivacySettingServiceData extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"feed_privacy_type"};
            }
        }

        public final class FbReelsPrivacySettingServiceData extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"fb_reels_audience", "privacy_option_name"};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return new C108776iv[]{C18190wL.A0G(DestinationMetadataServiceData.class, "destination_metadata_service_data", false), C18190wL.A0G(FbFeedPrivacySettingServiceData.class, "fb_feed_privacy_setting_service_data", false), C18190wL.A0G(FbReelsPrivacySettingServiceData.class, "fb_reels_privacy_setting_service_data", false), C18190wL.A0G(AutoXpostSetting.class, "auto_xpost_setting", true)};
        }
    }

    public final class InlineFXExampleCustomClientServiceData extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"sample_field"};
        }
    }

    public final Class[] getInlineClasses() {
        return new Class[]{InlineFXExampleCustomClientServiceData.class, InlineCrossPostingCustomClientServiceData.class};
    }
}
