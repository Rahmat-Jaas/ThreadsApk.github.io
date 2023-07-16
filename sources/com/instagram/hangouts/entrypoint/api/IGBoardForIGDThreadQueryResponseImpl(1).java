package com.instagram.hangouts.entrypoint.api;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGBoardForIGDThreadQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbIgBoardForIgdThreadQuery extends TreeJNI implements C81204nM {

        public final class Canvas extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"id", "unseen_items_count"};
            }
        }

        public final class RoomData extends TreeJNI implements C81204nM {

            public final class ActiveParticipants extends TreeJNI implements C81204nM {

                public final class IgUsers extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"instagram_user_id"};
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1b(IgUsers.class, "ig_users");
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"active_call_participant_count", "link_hash"};
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(ActiveParticipants.class, "active_participants");
            }
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(Canvas.class, "canvas", false), RoomData.class, "room_data", false);
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbIgBoardForIgdThreadQuery.class, "xfb_ig_board_for_igd_thread_query(group_thread_igid:$group_thread_id,peer_igid:$peer_igid)");
    }
}
