package com.instagram.fanclub.api;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18190wL;
import X.C18210wN;
import X.C18230wP;
import X.C61943Wl;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FanClubInfoResponseImpl extends TreeJNI implements C81204nM {

    public final class XigUserByIgidV2 extends TreeJNI implements C81204nM {

        public final class FanClub extends TreeJNI implements C81204nM {

            public final class ContentPreviewMedia extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"display_url", "id", "instagram_media_id"};
                }
            }

            public final class Package extends TreeJNI implements C81204nM {

                public final class EarlyPricing extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"original_sku", "remaining_slots"};
                    }
                }

                public final class Members extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"count"};
                    }
                }

                public final class CustomBenefitsPayload extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"custom_benefits", "has_custom_benefits_set"};
                    }
                }

                public final String[] getScalarFields() {
                    return new String[]{"enabled_benefits", "id", "product_id", "sku", "tier_id"};
                }

                public final C108776iv[] getEdgeFields() {
                    return new C108776iv[]{C18190wL.A0G(CustomBenefitsPayload.class, "custom_benefits_payload", false), C18190wL.A0G(EarlyPricing.class, "early_pricing", false), C18190wL.A0G(Members.class, "members", false)};
                }
            }

            public final class SocialContextSubscribers extends TreeJNI implements C81204nM {

                public final class ProfilePicture extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return C18230wP.A1Z();
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1a(ProfilePicture.class, "profile_picture");
                }

                public final String[] getScalarFields() {
                    return new String[]{"id", C61943Wl.A00()};
                }
            }

            public final class Owner extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return C18210wN.A1Z();
                }
            }

            public final C108776iv[] getEdgeFields() {
                return new C108776iv[]{C18190wL.A0G(Owner.class, "owner", false), C18190wL.A0G(Package.class, "package", false), C18190wL.A0G(SocialContextSubscribers.class, "social_context_subscribers", true), C18190wL.A0G(ContentPreviewMedia.class, "content_preview_media", true)};
            }

            public final String[] getScalarFields() {
                return C18210wN.A1b();
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(FanClub.class, "fan_club");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XigUserByIgidV2.class, "xig_user_by_igid_v2(id:$user_id)");
    }
}
