package com.instagram.graphql.instagramschema;

import X.AnonymousClass0wJ;
import X.AnonymousClass25X;
import X.C108776iv;
import X.C148338qr;
import X.C148468r6;
import X.C34008Hyp;
import X.C86104wH;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;

public final class TargetEffectImpl extends TreeJNI implements C148468r6 {

    public final class Effect extends TreeJNI implements C148338qr {
        public final C34008Hyp A9W() {
            if (!isFulfilled("InstagramCameraAREffect")) {
                return null;
            }
            return (C34008Hyp) reinterpret(IGAREffectWWWSchemaImpl.class);
        }

        public final Class[] getInlineClasses() {
            return new Class[]{IGAREffectWWWSchemaImpl.class};
        }
    }

    public final String[] getScalarFields() {
        return new String[]{"failure_code", TraceFieldType.FailureReason};
    }

    public final C148338qr Aee() {
        return (C148338qr) getTreeValue("effect", Effect.class);
    }

    public final AnonymousClass25X Ah8() {
        return (AnonymousClass25X) C86104wH.A0a(this, AnonymousClass25X.A01, "failure_code");
    }

    public final String AhA() {
        return getStringValue(TraceFieldType.FailureReason);
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(Effect.class, "effect");
    }
}
