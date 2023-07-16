package com.facebook.graphql.impls;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class ArEffectsFlmCapabilityQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class FetchArEffects extends TreeJNI implements C81204nM {

        public final class Effect extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"id", "uses_flm_capability"};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(Effect.class, "effect");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(FetchArEffects.class, "fetch_ar_effects(effect_ids:$effect_ids)");
    }
}
