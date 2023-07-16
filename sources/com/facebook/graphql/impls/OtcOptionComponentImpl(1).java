package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C81204nM;
import X.I17;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

public final class OtcOptionComponentImpl extends TreeJNI implements C81204nM {

    public final class PuxComponent extends TreeJNI implements C81204nM {

        public final class ExitFlowCta extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{PAYLinkableTextFragmentImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(ExitFlowCta.class, "exit_flow_cta");
        }
    }

    public final class Toggle extends TreeJNI implements C81204nM {

        public final class Description extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{PAYLinkableTextFragmentImpl.class};
            }
        }

        public final class Title extends TreeJNI implements C81204nM {
            public final Class[] getInlineClasses() {
                return new Class[]{PAYLinkableTextFragmentImpl.class};
            }
        }

        public final String[] getScalarFields() {
            return new String[]{"is_default_toggle_state_on"};
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(Title.class, DialogModule.KEY_TITLE, false), Description.class, DevServerEntity.COLUMN_DESCRIPTION, false);
        }
    }

    public final class BackButton extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return C18210wN.A1a();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return new C108776iv[]{C18190wL.A0G(Toggle.class, "toggle", false), C18190wL.A0G(PuxComponent.class, "pux_component", false), C18190wL.A0G(BackButton.class, I17.A00(92), false)};
    }
}
