package com.instagram.fanclub.api;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FanClubGiftOptionsResponseImpl extends TreeJNI implements C81204nM {

    public final class XigUserByIgidV2 extends TreeJNI implements C81204nM {

        public final class FanClub extends TreeJNI implements C81204nM {

            public final class Package extends TreeJNI implements C81204nM {

                public final class GiftOptions extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"billing_length", "billing_type", "id", "sku"};
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1b(GiftOptions.class, "gift_options");
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(Package.class, "package");
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
