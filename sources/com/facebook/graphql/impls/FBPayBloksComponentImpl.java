package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C147878q4;
import X.C18180wK;
import X.C18190wL;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class FBPayBloksComponentImpl extends TreeJNI implements C147878q4 {

    public final class Bundle extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"bloks_bundle_tree"};
        }
    }

    public final class OnLoadActions extends TreeJNI implements C81204nM {

        public final class Edges extends TreeJNI implements C81204nM {

            public final class Node extends TreeJNI implements C81204nM {

                public final class ActionBundle extends TreeJNI implements C81204nM {
                    public final String[] getScalarFields() {
                        return new String[]{"bloks_bundle_action"};
                    }
                }

                public final C108776iv[] getEdgeFields() {
                    return AnonymousClass0wJ.A1a(ActionBundle.class, "action_bundle");
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(Node.class, "node");
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(Edges.class, "edges");
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"unique_root_id"};
    }

    public final C108776iv[] getEdgeFields() {
        return C18180wK.A1a(C18190wL.A0G(Bundle.class, "bundle", false), OnLoadActions.class, "on_load_actions", false);
    }
}
