package com.instagram.unifiedfeedback.api.graphql;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class CXPCommentDeleteMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class XcxpDispatchCommentDelete extends TreeJNI implements C81204nM {

        public final class Error extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"__typename", IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, DialogModule.KEY_MESSAGE, "trace"};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"destination_app"};
        }

        public final class Data extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return C18210wN.A1Z();
            }
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(Data.class, "data", false), Error.class, "error", false);
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(XcxpDispatchCommentDelete.class, "xcxp_dispatch_comment_delete(destinations:[$destination],params:$params)");
    }
}
