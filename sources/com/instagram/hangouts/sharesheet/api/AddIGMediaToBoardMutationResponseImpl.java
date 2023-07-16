package com.instagram.hangouts.sharesheet.api;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class AddIGMediaToBoardMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbAddIgMediaToBoard extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"client_mutation_id"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbAddIgMediaToBoard.class, "xfb_add_ig_media_to_board(data:$data)");
    }
}
