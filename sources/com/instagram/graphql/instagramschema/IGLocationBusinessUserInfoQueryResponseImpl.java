package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C61963Wn;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class IGLocationBusinessUserInfoQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbOneLinkLoggedOutPageInfoMonoschema extends TreeJNI implements C81204nM {

        public final class Hours extends TreeJNI implements C81204nM {

            public final class Schedule extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"days_in_a_week", "hours_in_a_day"};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"current_status", "hours_today", "is_open", IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS};
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(Schedule.class, "schedule");
            }
        }

        public final class IgBusiness extends TreeJNI implements C81204nM {

            public final class Profile extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"account_type", "address_street", "business_contact_method", "can_hide_category", "category", "category_id", "city_name", "contact_phone_number", "full_name", "has_anonymous_profile_picture", "is_business", "is_call_to_action_enabled", "is_private", "is_profile_audio_call_enabled", "is_verified", "pk", "profile_pic_url", "public_email", "public_phone_country_code", "public_phone_number", "should_show_category", "should_show_public_contacts", C61963Wn.A00(), ServerW3CShippingAddressConstants.POSTAL_CODE};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(Profile.class, "profile");
            }
        }

        public final class PageEffectInfo extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"effect", "num_effects", "thumbnail_url"};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"category", "facebook_places_id", "has_menu", "location_address", "location_city", "location_id", "location_region", "location_zip", FXPFAccessLibraryDebugFragment.NAME, "num_guides", "phone", "price_range", "show_location_page_survey", "website"};
        }

        public final C108776iv[] getEdgeFields() {
            return new C108776iv[]{C18190wL.A0G(Hours.class, "hours", false), C18190wL.A0G(PageEffectInfo.class, "page_effect_info", false), C18190wL.A0G(IgBusiness.class, "ig_business", false)};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbOneLinkLoggedOutPageInfoMonoschema.class, "xfb_one_link_logged_out_page_info_monoschema(input:$input)");
    }
}
