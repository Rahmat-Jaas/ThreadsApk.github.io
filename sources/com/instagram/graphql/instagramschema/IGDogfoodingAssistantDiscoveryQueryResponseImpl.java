package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGDogfoodingAssistantDiscoveryQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class XfbDogfoodingAssistantSessions extends TreeJNI implements C81204nM {

        public final class Edges extends TreeJNI implements C81204nM {

            public final class Node extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return C18210wN.A1b();
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

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(XfbDogfoodingAssistantSessions.class, "xfb_dogfooding_assistant_sessions(ordering_options:{\"sort_by\":[\"VIEWER_CREATED\",\"VIEWER_DOGFOODED\"]},query_data:{\"apps\":{\"ids\":[567067343352427],\"inclusive\":true}})");
    }
}
