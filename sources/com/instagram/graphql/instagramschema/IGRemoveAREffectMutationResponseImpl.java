package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C18210wN;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class IGRemoveAREffectMutationResponseImpl extends TreeJNI implements C81204nM {

    public final class HideEffect extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return C18210wN.A1Z();
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(HideEffect.class, "hide_effect(effect_id:$effect_id)");
    }
}
