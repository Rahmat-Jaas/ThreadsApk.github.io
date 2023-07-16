package com.instagram.debug.image;

import X.AnonymousClass0wJ;
import X.C09120et;
import X.C18180wK;
import X.C18220wO;
import com.instagram.debug.network.DebugNetworkShapingConfigurationFactory$createStaticConfiguration$1;
import com.instagram.debug.network.NetworkShapingConfiguration;

public class ImageDebugConfiguration {
    public final boolean mIsDiskLayerEnabled;
    public final boolean mIsMemoryLayerEnabled;
    public final boolean mLongClickToCopyUrl;
    public final NetworkShapingConfiguration mNetworkShapingConfig;
    public final OverlayDisplayMode mOverlayDisplayMode;
    public final boolean mShowCacheKey;
    public final boolean mShowColorFidelity;
    public final boolean mShowFileSize;
    public final LoadSourceDisplayMode mShowLoadSource;
    public final boolean mShowOffscreenPixelsPerc;
    public final boolean mShowRes;
    public final boolean mShowResPerc;
    public final boolean mShowScans;

    public enum LoadSourceDisplayMode {
        HIDE,
        NAME,
        COLOR
    }

    public enum OverlayDisplayMode {
        NORMAL,
        TINY
    }

    public boolean isDiskLayerEnabled() {
        return this.mIsDiskLayerEnabled;
    }

    public boolean isImageOverlayOn() {
        if (this.mShowLoadSource != LoadSourceDisplayMode.HIDE || this.mShowRes || this.mShowResPerc || this.mShowOffscreenPixelsPerc || this.mShowScans || this.mShowFileSize || this.mShowCacheKey || this.mShowColorFidelity) {
            return true;
        }
        return false;
    }

    public boolean isMemoryLayerEnabled() {
        return this.mIsMemoryLayerEnabled;
    }

    public boolean isNetworkShapingOn() {
        return this.mNetworkShapingConfig.isNetworkShapingOn();
    }

    public boolean shouldOverrideLongClick() {
        return this.mLongClickToCopyUrl;
    }

    public ImageDebugConfiguration() {
        C09120et A02 = C09120et.A02();
        this.mIsMemoryLayerEnabled = AnonymousClass0wJ.A1V(A02.A0K);
        this.mIsDiskLayerEnabled = AnonymousClass0wJ.A1V(A02.A0J);
        this.mOverlayDisplayMode = (OverlayDisplayMode) getEnumFromInt(OverlayDisplayMode.class, AnonymousClass0wJ.A04(C18220wO.A0f(A02.A0T)));
        this.mShowLoadSource = (LoadSourceDisplayMode) getEnumFromInt(LoadSourceDisplayMode.class, AnonymousClass0wJ.A04(C18220wO.A0f(A02.A0X)));
        this.mShowRes = AnonymousClass0wJ.A1V(A02.A0V);
        this.mShowResPerc = AnonymousClass0wJ.A1V(A02.A0W);
        this.mShowOffscreenPixelsPerc = AnonymousClass0wJ.A1V(A02.A0Y);
        this.mShowScans = AnonymousClass0wJ.A1V(A02.A0Z);
        this.mShowFileSize = AnonymousClass0wJ.A1V(A02.A0U);
        this.mShowCacheKey = AnonymousClass0wJ.A1V(A02.A0R);
        this.mShowColorFidelity = AnonymousClass0wJ.A1V(A02.A0S);
        this.mNetworkShapingConfig = new DebugNetworkShapingConfigurationFactory$createStaticConfiguration$1((long) AnonymousClass0wJ.A04(C18220wO.A0f(A02.A0O)), AnonymousClass0wJ.A04(C18220wO.A0f(A02.A0P)), AnonymousClass0wJ.A04(C18220wO.A0f(A02.A0Q)));
        this.mLongClickToCopyUrl = C18180wK.A1V(AnonymousClass0wJ.A04(C18220wO.A0f(A02.A0N)));
    }

    public static Enum getEnumFromInt(Class cls, int i) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        enumArr.getClass();
        if (i < 0 || i >= enumArr.length) {
            i = 0;
        }
        return enumArr[i];
    }

    public boolean shouldTrackViews() {
        if (isImageOverlayOn() || this.mLongClickToCopyUrl) {
            return true;
        }
        return false;
    }
}
