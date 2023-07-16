package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.AnonymousClass20B;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C18250wR;
import X.C85404v0;
import X.C85554vO;
import X.C85704vd;
import X.C85714ve;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.FXPFAccessLibraryDebugFragment;

public final class IGToFBXPostingDestinationsQueryResponseImpl extends TreeJNI implements C85404v0 {

    public final class IgToFbXpostingDestinations extends TreeJNI implements C85554vO {

        public final class LinkedUserDestination extends TreeJNI implements C85704vd {
            public final String[] getScalarFields() {
                return new String[]{"id", FXPFAccessLibraryDebugFragment.NAME, "profile_picture_url", "type", "user_obid"};
            }

            public final String B4V() {
                return getStringValue("profile_picture_url");
            }

            public final AnonymousClass20B BIn() {
                return (AnonymousClass20B) getEnumValue("type", AnonymousClass20B.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            }

            public final String BK3() {
                return getStringValue("user_obid");
            }

            public final String getId() {
                return C18250wR.A0X(this);
            }

            public final String getName() {
                return C18220wO.A0l(this);
            }
        }

        public final class PageDestinations extends TreeJNI implements C85714ve {
            public final String[] getScalarFields() {
                return new String[]{"id", FXPFAccessLibraryDebugFragment.NAME, "plain_page_token", "profile_picture_url", "type"};
            }

            public final String B1p() {
                return getStringValue("plain_page_token");
            }

            public final String B4V() {
                return getStringValue("profile_picture_url");
            }

            public final AnonymousClass20B BIn() {
                return (AnonymousClass20B) getEnumValue("type", AnonymousClass20B.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            }

            public final String getId() {
                return C18250wR.A0X(this);
            }

            public final String getName() {
                return C18220wO.A0l(this);
            }
        }

        public final C85704vd AsJ() {
            return (C85704vd) getTreeValue("linked_user_destination", LinkedUserDestination.class);
        }

        public final ImmutableList Azl() {
            return getTreeList("page_destinations", PageDestinations.class);
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(LinkedUserDestination.class, "linked_user_destination", false), PageDestinations.class, "page_destinations", true);
        }
    }

    public final C85554vO AoD() {
        return (C85554vO) getTreeValue("ig_to_fb_xposting_destinations(query_params:$input)", IgToFbXpostingDestinations.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IgToFbXpostingDestinations.class, "ig_to_fb_xposting_destinations(query_params:$input)");
    }
}
