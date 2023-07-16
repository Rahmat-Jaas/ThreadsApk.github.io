package com.instagram.hangouts.sharesheet.api;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C61943Wl;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGThreadsWithBoardsQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbListIgThreadsWithBoardsQuery extends TreeJNI implements C81204nM {

        public final class IgThreadsWithBoards extends TreeJNI implements C81204nM {

            public final class Users extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"full_name", "pk", "profile_pic_url", C61943Wl.A00()};
                }
            }

            public final String[] getScalarFields() {
                return new String[]{"canvas_id", "thread_id", "thread_image_url", "thread_title"};
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1b(Users.class, "users");
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(IgThreadsWithBoards.class, "ig_threads_with_boards");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbListIgThreadsWithBoardsQuery.class, "xfb_list_ig_threads_with_boards_query(query_keyword:$input)");
    }
}
