package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.AnonymousClass4v8;
import X.AnonymousClass4v9;
import X.C108776iv;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;

public final class IgPaymentsSettingsShippingInfoViewImpl extends TreeJNI implements AnonymousClass4v9 {

    public final class MailingAddresses extends TreeJNI implements AnonymousClass4v8 {

        public final class Edges extends TreeJNI implements C81204nM {

            public final class Node extends TreeJNI implements C81204nM {
                public final String[] getScalarFields() {
                    return C18210wN.A1Z();
                }
            }

            public final C108776iv[] getEdgeFields() {
                return AnonymousClass0wJ.A1a(Node.class, "node");
            }
        }

        public final ImmutableList Aeb() {
            return getTreeList("edges", Edges.class);
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1b(Edges.class, "edges");
        }
    }

    public final AnonymousClass4v8 AtG() {
        return (AnonymousClass4v8) getTreeValue("mailing_addresses(first:1)", MailingAddresses.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(MailingAddresses.class, "mailing_addresses(first:1)");
    }

    public final String[] getScalarFields() {
        return C18210wN.A1Z();
    }
}
