package com.facebook.exoplayer.formatevaluator.configuration;

import X.AnonymousClass000;
import X.AnonymousClass0wJ;
import X.AnonymousClass22Z;
import X.AnonymousClass39O;
import X.AnonymousClass3HI;
import X.C04220Ms;
import X.C18190wL;
import X.C18220wO;
import X.C72304Nk;
import X.JXz;
import android.net.ConnectivityManager;
import com.facebook.react.uimanager.BaseViewManager;
import java.util.Locale;
import org.webrtc.CameraVideoCapturer;

public final class AbrContextAwareConfiguration {
    public final C72304Nk abrSetting;
    public final AnonymousClass3HI connectivityManagerHolder;
    public final boolean enableForegroundPrefetchQualityExperimentation;
    public final boolean isBackgroundPrefetch;
    public final boolean isIGClips;
    public final boolean isIGStory;
    public final boolean isLive;
    public final boolean isPrefetch;
    public final boolean isSponsored;
    public final boolean isStory;
    public final boolean isThumbnail;
    public final JXz playbackPreferences;

    public final int getHighBwRiskConfPct(AnonymousClass22Z r3) {
        int i;
        int i2;
        int i3;
        C04220Ms.A0B(r3, 0);
        if (this.isLive) {
            return 75;
        }
        if (this.isBackgroundPrefetch && (i3 = this.abrSetting.A0G) > 0) {
            return i3;
        }
        if (this.isSponsored) {
            C72304Nk r1 = this.abrSetting;
            int i4 = r1.A0D;
            if (i4 > 0) {
                return i4;
            }
            if (this.isPrefetch) {
                i2 = r1.A0F;
            } else {
                i2 = r1.A0E;
            }
            if (i2 > 0) {
                return i2;
            }
        }
        if (!this.isPrefetch || !this.enableForegroundPrefetchQualityExperimentation || (i = this.abrSetting.A0H) <= 0) {
            return this.abrSetting.A0I;
        }
        return i;
    }

    public final int getLatencyAdjustedLowestQualityIndex(int i, AnonymousClass22Z r3) {
        C04220Ms.A0B(r3, 1);
        return i - 1;
    }

    public final double getRiskAdjFactor(boolean z, AnonymousClass22Z r4) {
        C04220Ms.A0B(r4, 1);
        boolean z2 = this.isLive;
        if (z || !z2 || r4 == AnonymousClass22Z.LOW_LATENCY) {
            return 0.0d;
        }
        AnonymousClass22Z r1 = AnonymousClass22Z.ULTRA_LOW_LATENCY;
        C72304Nk r0 = this.abrSetting;
        if (r4 != r1) {
            return r0.A00;
        }
        return 0.0d;
    }

    public final boolean getSystemicRiskEnable(boolean z) {
        boolean z2;
        boolean z3 = this.isLive;
        if (z) {
            C72304Nk r0 = this.abrSetting;
            if (!z3) {
                return r0.A0P;
            }
            return false;
        }
        if (z3) {
            C72304Nk r1 = this.abrSetting;
            if (!r1.A0S) {
                return false;
            }
            z2 = r1.A0N;
        } else {
            boolean z4 = this.isStory;
            C72304Nk r12 = this.abrSetting;
            if (!z4) {
                return r12.A0S;
            }
            if (!r12.A0S) {
                return false;
            }
            z2 = r12.A0U;
        }
        return z2;
    }

    public final double getSystemicRiskFactor(boolean z, AnonymousClass22Z r7) {
        C04220Ms.A0B(r7, 1);
        boolean z2 = this.isLive;
        if (z) {
            C72304Nk r0 = this.abrSetting;
            if (z2) {
                return 2.0d;
            }
            return r0.A07;
        } else if (!z2) {
            if (isOnWifi() && this.isBackgroundPrefetch) {
                double d = this.abrSetting.A0A;
                if (d > 0.0d) {
                    return d;
                }
            }
            return this.abrSetting.A09;
        } else if (r7 == AnonymousClass22Z.LOW_LATENCY) {
            return 0.0d;
        } else {
            AnonymousClass22Z r1 = AnonymousClass22Z.ULTRA_LOW_LATENCY;
            C72304Nk r02 = this.abrSetting;
            if (r7 != r1) {
                return r02.A01;
            }
            return 0.0d;
        }
    }

    public final double getVirtualBufferPercent(AnonymousClass22Z r3) {
        C04220Ms.A0B(r3, 0);
        if (r3 == AnonymousClass22Z.LOW_LATENCY || r3 == AnonymousClass22Z.ULTRA_LOW_LATENCY) {
            return 0.0d;
        }
        boolean z = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (z) {
            return r0.A03;
        }
        return 0.0d;
    }

    public final boolean isSystemicRiskIBR(boolean z, AnonymousClass39O r5) {
        if (z) {
            boolean z2 = this.isLive;
            C72304Nk r0 = this.abrSetting;
            if (z2 || !r0.A0Q || r5 == null || !r5.A02) {
                return true;
            }
        }
        return false;
    }

    public final boolean shouldUseServerSideBWE(AnonymousClass22Z r2) {
        C04220Ms.A0B(r2, 0);
        return false;
    }

    private final boolean getEnableInitialBitrateBoosterByNetworkQuality() {
        return false;
    }

    private final float getInitialBitrateBoosterByNetworkQuality() {
        return 1.0f;
    }

    public final boolean enableAndroidAPIBitrate() {
        return false;
    }

    public final boolean enableConfRiskBwCache() {
        return false;
    }

    public final boolean enableMosOverride() {
        return false;
    }

    public final boolean enableSmartCacheOverrideForPrefetch() {
        return false;
    }

    public final boolean enableSmartCacheOverrideOnlyWhenHighMos() {
        return false;
    }

    public final boolean enableSmartCacheOverrideOnlyWhenHighMosForPrefetch() {
        return false;
    }

    public final boolean enableXPlatBweParity() {
        return false;
    }

    public final long getAbrDurationForIntentional() {
        return 0;
    }

    public final boolean getAllowAbrUpToWatchableMosInLowBuffer() {
        return false;
    }

    public final boolean getAllowAudioFormatsLowerThanDefault() {
        return false;
    }

    public final int getAndroidBandwidthFallbackNumberOfSamples() {
        return -1;
    }

    public final long getAocDefaultLimitIntentionalKbps() {
        return 0;
    }

    public final long getAocDefaultLimitUnintentionalKbps() {
        return 0;
    }

    public final float getAudioBandwidthFraction() {
        boolean z = this.isLive;
        isOnWifi();
        if (z) {
            return 0.01f;
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public final float getAudioPrefetchBandwidthFraction() {
        if (this.isLive) {
            return 0.01f;
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public final boolean getAvoidUsingDefaultQualityForIdealWhenNoBWEstimate() {
        return this.abrSetting.A1I;
    }

    public final float getBWWeightLimitForBWEDampening() {
        return 800.0f;
    }

    public final float getBandwidthMultiplier() {
        synchronized (this.playbackPreferences) {
        }
        return 1.0f;
    }

    public final boolean getBypassWidthLimitsSponsoredVerticalVideos() {
        if (this.isLive) {
            return false;
        }
        return true;
    }

    public final boolean getBypassWidthLimitsStories() {
        return false;
    }

    public final boolean getBypassWidthLimitsStoriesPrefetch() {
        return false;
    }

    public final ConnectivityManager getConnectivityManager() {
        AnonymousClass3HI r2 = this.connectivityManagerHolder;
        if (r2 == null) {
            return null;
        }
        if (r2.A00 == null) {
            try {
                r2.A00 = (ConnectivityManager) r2.A02.getSystemService("connectivity");
            } catch (NullPointerException unused) {
            }
        }
        return r2.A00;
    }

    public final String getDataConnectionQuality() {
        return "UNKNOWN";
    }

    public final int getDefaultBwRiskConfPct() {
        return 50;
    }

    public final float getDropRenderFrameRatioForPreventAbrUp() {
        return 1.0f;
    }

    public final boolean getEnableBsrV2Definition() {
        return false;
    }

    public final boolean getEnableCdnBandwidthRestriction() {
        return false;
    }

    public final boolean getEnableSegmentBitrate() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.A1H;
    }

    public final boolean getEnableVodPrefetchQSFix() {
        return false;
    }

    public final boolean getForceCurrentNoWatchableFormatFrameDrop() {
        return true;
    }

    public final float getFrameDropFactor() {
        return 1.0f;
    }

    public final boolean getHashUrlForUnique() {
        return false;
    }

    public final int getHighBufferBandwidthConfPct() {
        boolean z = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (z) {
            return r0.A0q;
        }
        return 65;
    }

    public final double getHighOrBetterMosThreshold() {
        return 0.0d;
    }

    public final boolean getHonorDefaultBandwidthForSR() {
        return false;
    }

    public final int getInitSegmentBandwidthExclusionLimitBytes() {
        return this.abrSetting.A0k;
    }

    public final float getLambdaFallingBufferConfidenceCalculator() {
        boolean z = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (z) {
            return r0.A0b;
        }
        return r0.A0X;
    }

    public final float getLambdaRisingBufferConfidenceCalculator() {
        boolean z = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (z) {
            return r0.A0c;
        }
        return r0.A0Y;
    }

    public final int getLatencyBasedAbrTargetBufferSizeMs() {
        boolean z = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (z) {
            return r0.A0o;
        }
        return r0.A0l;
    }

    public final int getLowBufferBandwidthConfPct() {
        if (this.isLive) {
            return 85;
        }
        return 90;
    }

    public final int getLowWatermarkMs() {
        if (this.isLive) {
            return this.playbackPreferences.A00;
        }
        return Integer.MAX_VALUE;
    }

    public final double getMaxAlphaLowPassEMABwDown() {
        return 0.0d;
    }

    public final double getMaxAlphaLowPassEMABwUp() {
        return 0.0d;
    }

    public final double getMaxAlphaLowPassEMABwVol() {
        return 0.0d;
    }

    public final double getMaxAlphaLowPassEMATtfbDown() {
        return 0.0d;
    }

    public final double getMaxAlphaLowPassEMATtfbUp() {
        return 0.0d;
    }

    public final double getMaxAlphaLowPassEMATtfbVol() {
        return 0.0d;
    }

    public final float getMaxBandwidthMultiplier() {
        return 2.0f;
    }

    public final long getMaxBufferedDurationFallingBufferMs() {
        int i;
        boolean z = this.isLive;
        boolean z2 = this.isStory;
        if (z) {
            C72304Nk r0 = this.abrSetting;
            if (z2) {
                i = r0.A0x;
            } else {
                i = r0.A0r;
            }
        } else {
            C72304Nk r02 = this.abrSetting;
            if (z2) {
                i = r02.A1A;
            } else {
                i = r02.A0y;
            }
        }
        return (long) i;
    }

    public final long getMaxDurationForQualityDecreaseMs() {
        int i;
        boolean z = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (z) {
            i = r0.A0s;
        } else {
            i = r0.A0z;
        }
        return (long) i;
    }

    public final int getMaxInitialBitrate() {
        int i;
        boolean z = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (z) {
            i = 50000;
        } else {
            i = r0.A10;
        }
        return (int) (((double) i) * 1.0d);
    }

    public final int getMaxNumberSmallBwSamplesIgnored() {
        return 0;
    }

    public final float getMaxTTFBMultiplier() {
        return 3.0f;
    }

    public final int getMaxWidthCell() {
        boolean z = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (z) {
            return r0.A0t;
        }
        return r0.A11;
    }

    public final int getMaxWidthInlinePlayer() {
        boolean z = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (z) {
            return r0.A0u;
        }
        return r0.A12;
    }

    public final int getMaxWidthSphericalVideo() {
        return 0;
    }

    public final int getMaxWidthToPrefetch() {
        if (this.playbackPreferences.A07()) {
            return 0;
        }
        boolean z = this.isLive;
        boolean isOnWifi = isOnWifi();
        if (z) {
            C72304Nk r0 = this.abrSetting;
            if (isOnWifi) {
                return r0.A0w;
            }
            return r0.A0v;
        }
        C72304Nk r02 = this.abrSetting;
        if (isOnWifi) {
            return r02.A13;
        }
        return r02.A14;
    }

    public final int getMinBufferedDurationMsForMosAwareCache() {
        return 0;
    }

    public final long getMinDurationForHighBWQualityIncreaseMs() {
        int i;
        boolean z = this.isLive;
        boolean z2 = this.isStory;
        if (z) {
            i = -1;
        } else {
            C72304Nk r0 = this.abrSetting;
            if (z2) {
                i = r0.A1B;
            } else {
                i = r0.A15;
            }
        }
        return (long) i;
    }

    public final int getMinFramesDropForPreventAbrUp() {
        return 0;
    }

    public final int getMinFramesRenderedForPreventAbrUp() {
        return 0;
    }

    public final int getMinMosConstraintLimit() {
        return 0;
    }

    public final int getMinMosForCachedQuality() {
        if (this.isLive) {
            return 0;
        }
        boolean z = this.isStory;
        C72304Nk r0 = this.abrSetting;
        if (!z) {
            return r0.A16;
        }
        return 0;
    }

    public final double getMinOverallMosForABR() {
        return this.abrSetting.A04;
    }

    public final float getMinPartiallyCachedSpan() {
        return 1.0f;
    }

    public final float getMinTTFBMultiplier() {
        return 0.5f;
    }

    public final int getMinWatchableMos() {
        return this.abrSetting.A17;
    }

    public final float getMinWidthMultiplierFrameDrop() {
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public final int getModBwRiskConfPct() {
        return this.abrSetting.A0L;
    }

    public final double getModOverallMosForABR() {
        return this.abrSetting.A05;
    }

    public final int getMosDiffPctForCachedQuality() {
        return 0;
    }

    public final float getMosPrefetchFractionByNetworkQuality() {
        return 1.0f;
    }

    public final int getPersonalizedBWRiskConfPctAggressive() {
        return 70;
    }

    public final int getPersonalizedBWRiskConfPctConservative() {
        return 80;
    }

    public final int getPersonalizedBWRiskConfPctNormal() {
        return 75;
    }

    public final int getPersonalizedBWRiskConfPctVeryAggressive() {
        return 65;
    }

    public final int getPersonalizedBWRiskConfPctVeryConservative() {
        return 85;
    }

    public final long getPersonalizedConservativeStallDuration() {
        return 30000;
    }

    public final double getPersonalizedRiskMultiplierAggressive() {
        return 1.0d;
    }

    public final double getPersonalizedRiskMultiplierConservative() {
        return 1.0d;
    }

    public final double getPersonalizedRiskMultiplierVeryAggressive() {
        return 1.0d;
    }

    public final double getPersonalizedRiskMultiplierVeryConservative() {
        return 1.0d;
    }

    public final double getPersonalizedVirtualBufferPercent() {
        return 0.0d;
    }

    public final JXz getPlaybackPreferences() {
        return this.playbackPreferences;
    }

    public final int getPredictiveABRDownBufferMs() {
        return 0;
    }

    public final int getPredictiveABRMaxSingleCycleDepletionMs() {
        return 0;
    }

    public final float getPredictiveABRTtfbRatio() {
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public final int getPredictiveABRUpBufferMs() {
        return 0;
    }

    public final boolean getPredictiveABRUpOnLiveHead() {
        return false;
    }

    public final int getPredictiveABRUpRetryIntervalMs() {
        return 0;
    }

    public final float getPrefetchDurationMultiplier() {
        boolean z = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (z) {
            return r0.A0d;
        }
        return r0.A0j;
    }

    public final int getPrefetchLongQueueBandwidthConfPct() {
        boolean z = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (z) {
            return -1;
        }
        return r0.A18;
    }

    public final float getPrefetchLongQueueBandwidthFraction() {
        boolean z = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (z) {
            return r0.A0Z;
        }
        return r0.A0g;
    }

    public final int getPrefetchLongQueueSizeThreshold() {
        boolean z = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (z) {
            return r0.A0p;
        }
        return 3;
    }

    public final int getPrefetchShortQueueBandwidthConfPct() {
        boolean z = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (z) {
            return -1;
        }
        return r0.A19;
    }

    public final float getPrefetchShortQueueBandwidthFraction() {
        boolean z = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (z) {
            return r0.A0a;
        }
        return r0.A0h;
    }

    public final int getRiskRewardRatioBufferLimitMs() {
        return 0;
    }

    public final float getRiskRewardRatioLowerBound() {
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public final float getRiskRewardRatioUpperBound() {
        if (this.isLive) {
            return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        if (!this.isStory || ((double) BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) <= 0.0d) {
            return this.abrSetting.A0i;
        }
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public final float getScreenWidthMultiplierLandscapeVideo() {
        boolean z = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (z) {
            return r0.A0e;
        }
        return 1.2f;
    }

    public final float getScreenWidthMultiplierPortraitVideo() {
        boolean z = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (z) {
            return r0.A0f;
        }
        return 1.2f;
    }

    public final boolean getServerSideForwardBwe() {
        return false;
    }

    public final boolean getShouldAvoidOnCellular() {
        boolean z = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (z) {
            return false;
        }
        return r0.A1F;
    }

    public final boolean getShouldCountFirstChunkOnly() {
        return false;
    }

    public final boolean getShouldEnableAudioIbr() {
        boolean z = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (z) {
            return false;
        }
        return r0.A1E;
    }

    public final boolean getShouldEnableAudioIbrCache() {
        boolean z = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (z) {
            return false;
        }
        return r0.A1D;
    }

    public final boolean getShouldEnableBwOnlyEstimationForLongPoll() {
        return false;
    }

    public final boolean getShouldEnableMultiAudioSupport() {
        return this.abrSetting.A1G;
    }

    public final boolean getShouldEnableTtfbOnlyEstimation() {
        return false;
    }

    public final boolean getShouldTreatShortFormAsStories() {
        return false;
    }

    public final boolean getShouldUseServerSideGoodput() {
        return false;
    }

    public final boolean getSkipCachedAsCurrent() {
        return this.abrSetting.A1M;
    }

    public final double getSmartCacheOverrideThreshold() {
        return 0.0d;
    }

    public final double getSmartCacheOverrideThresholdForPrefetch() {
        return 0.0d;
    }

    public final float getSoftMinMosBandwidthFractionForAbrSelector() {
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public final float getSoftMinMosForAbrSelector() {
        return BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
    }

    public final int getSsAbrSampleMaxValidTimeAcrossVideosMs() {
        return 30000;
    }

    public final int getSsAbrSampleMaxValidTimeMs() {
        return 10000;
    }

    public final int getSystemicRiskAvgSegmentDurationMs() {
        boolean z = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (z) {
            return r0.A0J;
        }
        return CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS;
    }

    public final double getSystemicRiskBitrateBoostFactor(boolean z) {
        if (!z) {
            return 1.0d;
        }
        boolean z2 = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (!z2) {
            return r0.A06;
        }
        return 1.0d;
    }

    public final boolean getSystemicRiskEnableDynamicOtherBitrate(boolean z) {
        if (!z) {
            return false;
        }
        boolean z2 = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (!z2) {
            return r0.A0R;
        }
        return false;
    }

    public final boolean getSystemicRiskEnableForPrefetch() {
        return this.abrSetting.A0T;
    }

    public final double getSystemicRiskLowMosFactor(boolean z) {
        boolean z2 = this.isLive;
        if (z) {
            C72304Nk r0 = this.abrSetting;
            if (!z2) {
                return r0.A08;
            }
            return 1.2d;
        } else if (z2) {
            return this.abrSetting.A02;
        } else {
            if (!isOnWifi() || !this.isBackgroundPrefetch) {
                return 1.2d;
            }
            double d = this.abrSetting.A0B;
            if (d > 0.0d) {
                return d;
            }
            return 1.2d;
        }
    }

    public final int getSystemicRiskMaxLookaheadDurationMs() {
        boolean z = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (z) {
            return r0.A0K;
        }
        return 0;
    }

    public final double getSystemicRiskModMosFactor() {
        return this.abrSetting.A0C;
    }

    public final int getSystemicRiskOtherBitrate(boolean z) {
        if (!z) {
            return 0;
        }
        boolean z2 = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (!z2) {
            return r0.A0M;
        }
        return 0;
    }

    public final float getTTFBWeightLimitForBWEDampening() {
        return 300.0f;
    }

    public final boolean getTreatCurrentNullAsLowBuffer() {
        return false;
    }

    public final int getTtfbMsecWithServerSideGoodput() {
        return -1;
    }

    public final boolean getUseDefaultFormatForScreenWidthConstraints() {
        return false;
    }

    public final boolean getUsePlaybackCsvqm() {
        return false;
    }

    public final boolean getUsePlaybackMosForLowMosABR() {
        return this.abrSetting.A0W;
    }

    public final boolean getUseUnifiedUploadMos() {
        return false;
    }

    public final int getVeryHighBufferDurationMsForBandwidthBoost() {
        return -1;
    }

    public final boolean isLive() {
        return this.isLive;
    }

    public final boolean isOnWifi() {
        AnonymousClass3HI r0 = this.connectivityManagerHolder;
        if (r0 != null) {
            return r0.A01();
        }
        return false;
    }

    public final boolean overrideCacheWhenHighMos() {
        return false;
    }

    public final boolean overrideCacheWhenHighMosForPrefetch() {
        return false;
    }

    public final boolean shouldAlwaysPlayCachedData() {
        return false;
    }

    public final boolean shouldAvoidOnABR() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.A1K;
    }

    public final boolean shouldDeleteNonSR() {
        return this.abrSetting.A0O;
    }

    public final boolean shouldDeprecateLiveInitialABR() {
        return false;
    }

    public final boolean shouldExcludeCDNResponseTimeForLongPoll() {
        return this.abrSetting.A1J;
    }

    public final boolean shouldLogInbandTelemetryBweDebugString() {
        return false;
    }

    public final boolean shouldLowestSelectorIgnoreCurrent() {
        return this.isThumbnail;
    }

    public final boolean shouldSelectIntermediateFormatRiskRewardBased() {
        return false;
    }

    public final boolean shouldUseLogarithmicRisk() {
        return this.abrSetting.A1N;
    }

    public final boolean shouldUseLowPassEMAAsymmetryForBWEstimation() {
        return false;
    }

    public final boolean shouldUseLowPassEMAForBWEstimation() {
        return false;
    }

    public final boolean shouldUseLowPassWithWeightedEMAForBWEstimation() {
        return false;
    }

    public final boolean shouldUseMosAwareCachedSelection() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.A1O;
    }

    public final boolean shouldUseRiskRewardRatio(boolean z) {
        if (z) {
            return false;
        }
        boolean z2 = this.isLive;
        C72304Nk r0 = this.abrSetting;
        if (!z2) {
            return r0.A1P;
        }
        return false;
    }

    public final boolean updateFormatsWithIntentionChange() {
        return false;
    }

    public final boolean useMaxBitrateForABRIfLower() {
        return false;
    }

    public final boolean useMaxBitrateForAOCIfLower() {
        return false;
    }

    public final boolean useOverallMosForABR() {
        if (this.isLive) {
            return false;
        }
        return this.abrSetting.A0V;
    }

    public final boolean usePersonalizedBWRiskConfPcts() {
        return false;
    }

    public final boolean usePersonalizedRiskMultipliers() {
        return false;
    }

    public final boolean usePersonalizedVirtualBuffer() {
        return false;
    }

    public AbrContextAwareConfiguration(C72304Nk r5, AnonymousClass3HI r6, JXz jXz, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        AnonymousClass0wJ.A1P(r5, jXz);
        this.abrSetting = r5;
        this.connectivityManagerHolder = r6;
        this.playbackPreferences = jXz;
        this.isLive = z;
        String A01 = jXz.A01();
        synchronized (jXz) {
        }
        boolean z5 = false;
        this.isStory = !"fb_stories".equalsIgnoreCase(A01) ? false : true;
        this.isIGStory = AnonymousClass000.A00(438).equalsIgnoreCase(A01);
        this.isIGClips = A01 != null ? C18220wO.A1V("clips_viewer_", 1, C18190wL.A0r(Locale.ROOT, A01)) : z5;
        this.isThumbnail = jXz.A08();
        synchronized (jXz) {
            z3 = jXz.A06;
        }
        this.isSponsored = z3;
        synchronized (jXz) {
            z4 = jXz.A05;
        }
        this.isBackgroundPrefetch = z4;
        this.enableForegroundPrefetchQualityExperimentation = jXz.A04;
        this.isPrefetch = z2;
    }

    public final int getAudioMaxInitialBitrate() {
        return 50000;
    }

    public final int getLiveDefaultMaxWidth() {
        boolean isOnWifi = isOnWifi();
        C72304Nk r0 = this.abrSetting;
        if (isOnWifi) {
            return r0.A0n;
        }
        return r0.A0m;
    }

    public final float getMainProcessBitrateMultiplier() {
        return 0.6f;
    }

    public final float getMinBandwidthMultiplier() {
        return 0.3f;
    }

    public final long getPersonalizedAggressiveStallDuration() {
        return 120000;
    }

    public final long getPersonalizedVeryAggressiveStallDuration() {
        return 300000;
    }

    public final boolean enableSmartCacheOverride(boolean z) {
        return false;
    }
}
