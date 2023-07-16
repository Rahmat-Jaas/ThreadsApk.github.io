package com.facebook.cameracore.ardelivery.effectmetadatamanager.models;

import X.C18190wL;
import com.google.common.collect.ImmutableList;
import java.util.List;

public class EffectMetadata {
    public final String mEffectId;
    public final String mEffectName;
    public final List mInstructionModels;
    public final String mManifestCapabilities;
    public final String mProductList;
    public final int mSortOrder;
    public final String mThumbnailUrl;
    public final int mThumbnailUrlExpirationTimestamp;
    public final String mThumbnailUrlFallback;

    public String getEffectId() {
        return this.mEffectId;
    }

    public String getEffectName() {
        return this.mEffectName;
    }

    public List getInstructionModels() {
        return this.mInstructionModels;
    }

    public String getManifestCapabilities() {
        return this.mManifestCapabilities;
    }

    public String getProductList() {
        return this.mProductList;
    }

    public int getSortOrder() {
        return this.mSortOrder;
    }

    public String getThumbnailUrl() {
        return this.mThumbnailUrl;
    }

    public int getThumbnailUrlExpirationTimestamp() {
        return this.mThumbnailUrlExpirationTimestamp;
    }

    public String getThumbnailUrlFallback() {
        return this.mThumbnailUrlFallback;
    }

    public String toString() {
        StringBuilder A0s = C18190wL.A0s("EffectMetadata{mEffectId='");
        A0s.append(this.mEffectId);
        A0s.append('\'');
        A0s.append(", mEffectName='");
        A0s.append(this.mEffectName);
        A0s.append('\'');
        A0s.append(", mProductList='");
        A0s.append(this.mProductList);
        A0s.append('\'');
        A0s.append(", mSortOrder=");
        A0s.append(this.mSortOrder);
        A0s.append(", mManifestCapabilities='");
        A0s.append(this.mManifestCapabilities);
        A0s.append('\'');
        A0s.append(", mThumbnailUrl='");
        A0s.append(this.mThumbnailUrl);
        A0s.append('\'');
        A0s.append(", mThumbnailUrlExpirationTimestamp=");
        A0s.append(this.mThumbnailUrlExpirationTimestamp);
        A0s.append(", mThumbnailUrlFallback='");
        A0s.append(this.mThumbnailUrlFallback);
        A0s.append('\'');
        A0s.append(", mInstructionModels=");
        A0s.append(this.mInstructionModels);
        return C18190wL.A0o(A0s);
    }

    public EffectMetadata(String str, String str2, String str3, int i, String str4, String str5, int i2, String str6, ImmutableList immutableList) {
        this.mEffectId = str;
        this.mEffectName = str2;
        this.mProductList = str3;
        this.mSortOrder = i;
        this.mManifestCapabilities = str4;
        this.mThumbnailUrl = str5;
        this.mThumbnailUrlExpirationTimestamp = i2;
        this.mThumbnailUrlFallback = str6;
        this.mInstructionModels = immutableList;
    }
}
