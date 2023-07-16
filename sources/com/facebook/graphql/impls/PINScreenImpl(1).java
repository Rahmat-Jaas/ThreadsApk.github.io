package com.facebook.graphql.impls;

import X.C108776iv;
import X.C18190wL;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

public final class PINScreenImpl extends TreeJNI implements C81204nM {

    public final class Description extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{FBPayLinkableTextImpl.class};
        }
    }

    public final class Terms extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{FBPayLinkableTextImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{TraceFieldType.ContentType, "screen_type"};
    }

    public final class EditTextFieldTitle extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return C18210wN.A1a();
        }
    }

    public final class ErrorMessages extends TreeJNI implements C81204nM {
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
        return new C108776iv[]{C18190wL.A0G(Title.class, DialogModule.KEY_TITLE, false), C18190wL.A0G(Subtitle.class, "subtitle", false), C18190wL.A0G(Description.class, DevServerEntity.COLUMN_DESCRIPTION, false), C18190wL.A0G(ErrorMessages.class, "error_messages", true), C18190wL.A0G(EditTextFieldTitle.class, "edit_text_field_title", false), C18190wL.A0G(Terms.class, "terms", false)};
    }
}
