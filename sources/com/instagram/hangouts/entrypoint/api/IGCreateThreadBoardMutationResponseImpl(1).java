package com.instagram.hangouts.entrypoint.api;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGCreateThreadBoardMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class IgCreateThreadBoard extends TreeJNI implements C81204nM {

        public final class CanvasData extends TreeJNI implements C81204nM {

            public final class RoomData extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return new String[]{"link_hash"};
                }
            }

            public final class Canvas extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return C18210wN.A1Z();
                }
            }

            public final C108776iv[] getEdgeFields() {
                return C18180wK.A1a(C18190wL.A0G(Canvas.class, "canvas", false), RoomData.class, "room_data", false);
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(CanvasData.class, "canvas_data");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IgCreateThreadBoard.class, "ig_create_thread_board(data:$data)");
    }
}
