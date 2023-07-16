package com.facebook.dcp.model;

import X.AnonymousClass6WA;
import X.AnonymousClass8sP;
import X.C04220Ms;
import kotlinx.serialization.Serializable;

@Serializable
public final class Matrix {
    public static final Companion Companion = new Companion();
    public final float[][] A00;

    public final class Companion {
        public final AnonymousClass8sP serializer() {
            return Matrix$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Matrix(float[][] fArr, int i) {
        if (1 != (i & 1)) {
            AnonymousClass6WA.A00(Matrix$$serializer.descriptor, i, 1);
            throw null;
        } else {
            this.A00 = fArr;
        }
    }

    public Matrix(float[][] fArr) {
        C04220Ms.A0B(fArr, 1);
        this.A00 = fArr;
    }
}
