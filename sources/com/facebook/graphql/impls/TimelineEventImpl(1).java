package com.facebook.graphql.impls;

import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

public final class TimelineEventImpl extends TreeJNI implements C81204nM {

    public final class Description extends TreeJNI implements C81204nM {
        public final Class[] getInlineClasses() {
            return new Class[]{PAYTextWithLinksFragmentImpl.class};
        }
    }

    public final class Icon extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"color_enum", "name_enum", "size_enum", "variant_enum"};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"accessibility_label", "subtitle", DialogModule.KEY_TITLE, "type"};
    }

    public final C108776iv[] getEdgeFields() {
        return C18180wK.A1a(C18190wL.A0G(Icon.class, "icon", false), Description.class, DevServerEntity.COLUMN_DESCRIPTION, false);
    }
}
