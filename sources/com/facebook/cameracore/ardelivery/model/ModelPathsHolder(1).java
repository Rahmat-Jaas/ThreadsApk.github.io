package com.facebook.cameracore.ardelivery.model;

import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.C18190wL;
import X.C18220wO;
import X.C28999Ffo;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.HashMap;
import java.util.Map;

public class ModelPathsHolder {
    public static final String TAG = "ModelPathsHolder";
    public static final int UNKNOWN_VERSION = -1;
    public final VersionedCapability mCapability;
    public final Map mModelPaths;
    public final int mVersion;

    public VersionedCapability getCapability() {
        return this.mCapability;
    }

    public String getModelPath(C28999Ffo ffo) {
        String A0r = C18220wO.A0r(ffo, this.mModelPaths);
        if (A0r == null) {
            AnonymousClass0LU.A0D(TAG, StringFormatUtil.formatStrLocaleSafe("Failed to get model path for model asset type: %s, for capability: %s", ffo.name(), this.mCapability.name()));
        }
        return A0r;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean modelPathsExists(C28999Ffo ffo) {
        return this.mModelPaths.containsKey(ffo);
    }

    public String toString() {
        StringBuilder A0s = C18190wL.A0s("ModelPathsHolder{mCapability=");
        A0s.append(this.mCapability);
        A0s.append(", mVersion=");
        A0s.append(this.mVersion);
        A0s.append(", mModelPaths=");
        A0s.append(this.mModelPaths);
        return C18190wL.A0o(A0s);
    }

    public ModelPathsHolder(VersionedCapability versionedCapability, int i, Map map) {
        this.mCapability = versionedCapability;
        this.mVersion = i;
        this.mModelPaths = map;
    }

    public static ModelPathsHolder create(int i, int i2, int[] iArr, String[] strArr) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            A0y.put(C28999Ffo.values()[iArr[i3]], strArr[i3]);
        }
        return new ModelPathsHolder(VersionedCapability.fromXplatValue(i), i2, A0y);
    }
}
