package com.facebook.graphql.impls;

import X.AnonymousClass000;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class TopLevelDialogImpl extends TreeJNI implements C81204nM {

    public final class CtaInfo extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"cta_text", "cta_uri"};
        }
    }

    public final class ImageSource extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"uri"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"is_hard_block", DialogModule.KEY_MESSAGE, DialogModule.KEY_TITLE};
    }

    public final C108776iv[] getEdgeFields() {
        return C18180wK.A1a(C18190wL.A0G(CtaInfo.class, "cta_info", true), ImageSource.class, AnonymousClass000.A00(376), false);
    }
}
