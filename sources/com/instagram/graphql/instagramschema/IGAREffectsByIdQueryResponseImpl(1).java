package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C148108qS;
import X.C148118qT;
import X.C148128qU;
import X.C148408qy;
import X.C148468r6;
import X.C18180wK;
import X.C18190wL;
import X.C28174Ezk;
import X.C34008Hyp;
import com.facebook.pando.TreeJNI;
import com.google.common.collect.ImmutableList;

public final class IGAREffectsByIdQueryResponseImpl extends TreeJNI implements C148128qU {

    public final class ArEffects extends TreeJNI implements C148408qy {

        public final class EffectsById extends TreeJNI implements C148108qS {
            public final C34008Hyp A9W() {
                return (C34008Hyp) reinterpret(IGAREffectWWWSchemaImpl.class);
            }

            public final Class[] getInlineClasses() {
                return new Class[]{IGAREffectWWWSchemaImpl.class};
            }
        }

        public final class TargetEffect extends TreeJNI implements C148118qT {
            public final C148468r6 A9m() {
                return (C148468r6) reinterpret(TargetEffectImpl.class);
            }

            public final Class[] getInlineClasses() {
                return new Class[]{TargetEffectImpl.class};
            }
        }

        public final ImmutableList Af1() {
            return getTreeList(C28174Ezk.A00(188), EffectsById.class);
        }

        public final C148118qT BFc() {
            return (C148118qT) getTreeValue("target_effect(id:$target_effect_id,params:$target_effect_params)", TargetEffect.class);
        }

        public final C108776iv[] getEdgeFields() {
            return C18180wK.A1a(C18190wL.A0G(EffectsById.class, C28174Ezk.A00(188), true), TargetEffect.class, "target_effect(id:$target_effect_id,params:$target_effect_params)", false);
        }
    }

    public final C148408qy ARF() {
        return (C148408qy) getTreeValue("ar_effects(device_capabilities:$device_capabilities,surface_identity:$surface_identity)", ArEffects.class);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(ArEffects.class, "ar_effects(device_capabilities:$device_capabilities,surface_identity:$surface_identity)");
    }
}
