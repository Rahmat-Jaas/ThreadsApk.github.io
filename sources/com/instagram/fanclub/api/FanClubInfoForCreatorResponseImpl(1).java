package com.instagram.fanclub.api;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FanClubInfoForCreatorResponseImpl extends TreeJNI implements C81204nM {

    public final class XigUserByIgidV2 extends TreeJNI implements C81204nM {

        public final class FanClub extends TreeJNI implements C81204nM {

            public final class BlockedMembers extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"count"};
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
                    return new String[]{"connected_member_count", "enabled_benefits", "id", "sku"};
                }

                public final C108776iv[] getEdgeFields() {
                    return new C108776iv[]{C18190wL.A0G(Members.class, "members", false), C18190wL.A0G(CustomBenefitsPayload.class, "custom_benefits_payload", false), C18190wL.A0G(EarlyPricing.class, "early_pricing", false)};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"id", "seconds_until_notification"};
            }

            public final Package A00() {
                return (Package) getTreeValue("package", Package.class);
            }

            public final C108776iv[] getEdgeFields() {
                return C18180wK.A1a(C18190wL.A0G(BlockedMembers.class, "blocked_members", false), Package.class, "package", false);
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
