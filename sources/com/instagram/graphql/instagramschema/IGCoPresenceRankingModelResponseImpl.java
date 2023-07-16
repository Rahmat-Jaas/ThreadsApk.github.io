package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C18230wP;
import X.C61963Wn;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;

public final class IGCoPresenceRankingModelResponseImpl extends TreeJNI implements C81204nM {

    public final class GetIgBanyanRankingQuery extends TreeJNI implements C81204nM {

        public final class Entities extends TreeJNI implements C81204nM {

            public final class IgUsers extends TreeJNI implements C81204nM {

                public final class ProfilePicture extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return C18230wP.A1Z();
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1a(ProfilePicture.class, "profile_picture");
                }

                public final String[] getScalarFields() {
                    return new String[]{"instagram_user_id", C61963Wn.A00()};
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1b(IgUsers.class, "ig_users");
            }
        }

        public final class RankingResults extends TreeJNI implements C81204nM {

            public final class Items extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"entity_type", "igid", "score"};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"error", TraceFieldType.RequestID, "view"};
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1b(Items.class, DialogModule.KEY_ITEMS);
            }
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(RankingResults.class, "ranking_results", true), Entities.class, "entities", false);
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(GetIgBanyanRankingQuery.class, "get_ig_banyan_ranking_query(input:{\"views\":$views})");
    }
}
