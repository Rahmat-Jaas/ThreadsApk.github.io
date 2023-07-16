package com.instagram.graphql.instagramschemagraphservices;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C28174Ezk;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class IGGraphQLBanyanQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class GetPaginatedIgShareSheetRankingQuery extends TreeJNI implements C81204nM {

        public final class Entities extends TreeJNI implements C81204nM {

            public final class User extends TreeJNI implements C81204nM {
                public final Class[] getInlineClasses() {
                    return new Class[]{IGBanyanQueryUserImpl.class};
                }
            }

            public final class Thread extends TreeJNI implements C81204nM {

                public final class Users extends TreeJNI implements C81204nM {
                    public final Class[] getInlineClasses() {
                        return new Class[]{IGBanyanQueryUserImpl.class};
                    }
                }

                public final class CreatorBroadcastThreadData extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"audience_type", "ig_creator_profile_picture_url", "is_added_to_inbox"};
                    }
                }

                public final class CreatorSubscriberThreadData extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"ig_creator_igid", "ig_creator_profile_picture_url", "pause_unix_timestamp"};
                    }
                }

                public final String[] getScalarFields() {
                    return new String[]{"canonical", "context_line", "is_following_chat_creator", "media_viewable", "named", "pending", "share_sheet_section", "thread_id", "thread_subtype", "thread_title", "thread_type", "viewer_id"};
                }

                public final C108776iv[] getEdgeFields() {
                    return new C108776iv[]{C18190wL.A0G(Users.class, "users", true), C18190wL.A0G(CreatorSubscriberThreadData.class, "creator_subscriber_thread_data", false), C18190wL.A0G(CreatorBroadcastThreadData.class, "creator_broadcast_thread_data", false)};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return C18180wK.A1a(C18190wL.A0G(User.class, "user", true), Thread.class, "thread", true);
            }
        }

        public final class Ranking extends TreeJNI implements C81204nM {

            public final class ScoreMap extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"entity_type", "id", "score"};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{C28174Ezk.A00(545), C28174Ezk.A00(107), "view_name"};
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1b(ScoreMap.class, "score_map");
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"failed_view_names", "has_next_page", "page_max_id", IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS};
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(Ranking.class, "ranking", true), Entities.class, "entities", false);
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(GetPaginatedIgShareSheetRankingQuery.class, "get_paginated_ig_share_sheet_ranking_query(input:$input)");
    }
}
