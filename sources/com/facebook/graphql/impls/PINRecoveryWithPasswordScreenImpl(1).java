package com.facebook.graphql.impls;

import X.C108776iv;
import X.C18190wL;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

public final class PINRecoveryWithPasswordScreenImpl extends TreeJNI implements C81204nM {
    public final String[] getScalarFields() {
        return new String[]{TraceFieldType.ContentType, "screen_type"};
    }

    public final class ActionText extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return C18210wN.A1a();
        }
    }

    public final class Description extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return C18210wN.A1a();
        }
    }

    public final class EditFieldHint extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return C18210wN.A1a();
        }
    }

    public final class ErrorMessage extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return C18210wN.A1a();
        }
    }

    public final class Subtitle extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return C18210wN.A1a();
        }
    }

    public final class Title extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return C18210wN.A1a();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return new C108776iv[]{C18190wL.A0G(Title.class, DialogModule.KEY_TITLE, false), C18190wL.A0G(Subtitle.class, "subtitle", false), C18190wL.A0G(Description.class, DevServerEntity.COLUMN_DESCRIPTION, false), C18190wL.A0G(ActionText.class, "action_text", false), C18190wL.A0G(ErrorMessage.class, "error_message", false), C18190wL.A0G(EditFieldHint.class, "edit_field_hint", false)};
    }
}
