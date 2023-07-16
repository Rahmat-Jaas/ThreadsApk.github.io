package com.instagram.clips.api;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.dialog.DialogModule;

public final class ClipsProfileFragmentImpl extends TreeJNI implements C81204nM {

    public final class Items extends TreeJNI implements C81204nM {

        public final class Media extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"is_defer_fulfilled(fragment_name:\"ClipsProfileFullMedia\")"};
            }

            public final Class[] getInlineClasses() {
                return new Class[]{ClipsProfileFullMediaImpl.class, ClipsProfileLightweightMediaImpl.class};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(Media.class, "media");
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"is_defer_fulfilled(fragment_name:\"ClipsProfilePagingInfo\")"};
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(Items.class, DialogModule.KEY_ITEMS);
    }

    public final Class[] getInlineClasses() {
        return new Class[]{ClipsProfilePagingInfoImpl.class};
    }
}
