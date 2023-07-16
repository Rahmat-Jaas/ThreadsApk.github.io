package com.facebook.graphql.impls;

import X.C108776iv;
import X.C18190wL;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;

public final class AuthDialogScreenImpl extends TreeJNI implements C81204nM {
    public final String[] getScalarFields() {
        return new String[]{TraceFieldType.ContentType, "screen_type"};
    }

    public final class Option1 extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return C18210wN.A1a();
        }
    }

    public final class Option2 extends TreeJNI implements C81204nM {
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
        return new C108776iv[]{C18190wL.A0G(Title.class, DialogModule.KEY_TITLE, false), C18190wL.A0G(Subtitle.class, "subtitle", false), C18190wL.A0G(Option1.class, "option1", false), C18190wL.A0G(Option2.class, "option2", false)};
    }
}
