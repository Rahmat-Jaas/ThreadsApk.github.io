package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import com.instagram.debug.devoptions.PanavisionDevUtil;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class BooleanFeatureExperiment implements FeatureExperiment {
    public static final Companion Companion = new Companion();
    public final Pair androidSecondaryCtaEnabled;
    public final Pair bottomSheetTabIcons;
    public final Pair captionTagsH;
    public final Pair captionTagsV;
    public final PanavisionFlags flags;
    public String humanName = "";
    public final Pair isCaptionInBottomSheet;
    public final Pair isDarkModeEnabled;
    public final Pair isUfiVertical;
    public String name = "";
    public final Pair useCombinedView;

    public final class Companion {
        public static /* synthetic */ BooleanFeatureExperiment create$default(Companion companion, String str, String str2, PanavisionFlags panavisionFlags, Pair pair, Pair pair2, Pair pair3, Pair pair4, Pair pair5, Pair pair6, Pair pair7, Pair pair8, int i, Object obj) {
            if ((i & 8) != 0) {
                pair = null;
            }
            if ((i & 16) != 0) {
                pair2 = null;
            }
            if ((i & 32) != 0) {
                pair3 = null;
            }
            if ((i & 64) != 0) {
                pair4 = null;
            }
            if ((i & 128) != 0) {
                pair5 = null;
            }
            if ((i & 256) != 0) {
                pair6 = null;
            }
            if ((i & 512) != 0) {
                pair7 = null;
            }
            if ((i & 1024) != 0) {
                pair8 = null;
            }
            return companion.create(str, str2, panavisionFlags, pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8);
        }

        public final BooleanFeatureExperiment create(String str, String str2, PanavisionFlags panavisionFlags, Pair pair, Pair pair2, Pair pair3, Pair pair4, Pair pair5, Pair pair6, Pair pair7, Pair pair8) {
            AnonymousClass0wJ.A1N(str, str2);
            C04220Ms.A0B(panavisionFlags, 2);
            BooleanFeatureExperiment booleanFeatureExperiment = new BooleanFeatureExperiment(panavisionFlags, pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8);
            booleanFeatureExperiment.setHumanName(str);
            booleanFeatureExperiment.setName(str2);
            return booleanFeatureExperiment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public BooleanFeatureExperiment(PanavisionFlags panavisionFlags, Pair pair, Pair pair2, Pair pair3, Pair pair4, Pair pair5, Pair pair6, Pair pair7, Pair pair8) {
        C04220Ms.A0B(panavisionFlags, 1);
        this.flags = panavisionFlags;
        this.isUfiVertical = pair;
        this.useCombinedView = pair2;
        this.isDarkModeEnabled = pair3;
        this.isCaptionInBottomSheet = pair4;
        this.bottomSheetTabIcons = pair5;
        this.captionTagsH = pair6;
        this.captionTagsV = pair7;
        this.androidSecondaryCtaEnabled = pair8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r4.booleanValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean compareBFlag(java.lang.Boolean r4, java.lang.String r5) {
        /*
            r3 = this;
            r2 = 1
            if (r4 == 0) goto L_0x0014
            boolean r1 = r4.booleanValue()
            com.instagram.debug.devoptions.PanavisionFlags r0 = r3.flags
            java.lang.Object r0 = X.C18210wN.A0Y(r0, r5)
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == r1) goto L_0x0014
            r2 = 0
        L_0x0014:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.BooleanFeatureExperiment.compareBFlag(java.lang.Boolean, java.lang.String):boolean");
    }

    public void setHumanName(String str) {
        C04220Ms.A0B(str, 0);
        this.humanName = str;
    }

    public void setName(String str) {
        C04220Ms.A0B(str, 0);
        this.name = str;
    }

    private final void setBFlag(boolean z, Pair pair, String str) {
        Object obj;
        if (pair != null) {
            PanavisionDevUtil.ExperimentFlag bFlag = this.flags.getBFlag(str);
            if (z) {
                obj = pair.A00;
            } else {
                obj = pair.A01;
            }
            bFlag.overrideValue(obj);
        }
    }

    public final Pair getAndroidSecondaryCtaEnabled() {
        return this.androidSecondaryCtaEnabled;
    }

    public final Pair getBottomSheetTabIcons() {
        return this.bottomSheetTabIcons;
    }

    public final Pair getCaptionTagsH() {
        return this.captionTagsH;
    }

    public final Pair getCaptionTagsV() {
        return this.captionTagsV;
    }

    public final PanavisionFlags getFlags() {
        return this.flags;
    }

    public String getHumanName() {
        return this.humanName;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0080, code lost:
        if (compareBFlag(r1, "androidSecondaryCtaEnabled") == false) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean getHumanValue() {
        /*
            r3 = this;
            kotlin.Pair r0 = r3.isUfiVertical
            r1 = 0
            if (r0 == 0) goto L_0x0094
            java.lang.Object r2 = r0.A00
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L_0x0009:
            java.lang.String r0 = "isUfiVertical"
            boolean r0 = r3.compareBFlag(r2, r0)
            if (r0 == 0) goto L_0x0082
            kotlin.Pair r0 = r3.useCombinedView
            if (r0 == 0) goto L_0x0092
            java.lang.Object r2 = r0.A00
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L_0x0019:
            java.lang.String r0 = "useCombinedView"
            boolean r0 = r3.compareBFlag(r2, r0)
            if (r0 == 0) goto L_0x0082
            kotlin.Pair r0 = r3.isDarkModeEnabled
            if (r0 == 0) goto L_0x0090
            java.lang.Object r2 = r0.A00
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L_0x0029:
            java.lang.String r0 = "isDarkModeEnabled"
            boolean r0 = r3.compareBFlag(r2, r0)
            if (r0 == 0) goto L_0x0082
            kotlin.Pair r0 = r3.isCaptionInBottomSheet
            if (r0 == 0) goto L_0x008e
            java.lang.Object r2 = r0.A00
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L_0x0039:
            java.lang.String r0 = "isCaptionInBottomSheet"
            boolean r0 = r3.compareBFlag(r2, r0)
            if (r0 == 0) goto L_0x0082
            kotlin.Pair r0 = r3.bottomSheetTabIcons
            if (r0 == 0) goto L_0x008c
            java.lang.Object r2 = r0.A00
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L_0x0049:
            java.lang.String r0 = "bottomSheetTabIcons"
            boolean r0 = r3.compareBFlag(r2, r0)
            if (r0 == 0) goto L_0x0082
            kotlin.Pair r0 = r3.captionTagsH
            if (r0 == 0) goto L_0x008a
            java.lang.Object r2 = r0.A00
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L_0x0059:
            java.lang.String r0 = "captionTagsH"
            boolean r0 = r3.compareBFlag(r2, r0)
            if (r0 == 0) goto L_0x0082
            kotlin.Pair r0 = r3.captionTagsV
            if (r0 == 0) goto L_0x0088
            java.lang.Object r2 = r0.A00
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L_0x0069:
            java.lang.String r0 = "captionTagsV"
            boolean r0 = r3.compareBFlag(r2, r0)
            if (r0 == 0) goto L_0x0082
            kotlin.Pair r0 = r3.androidSecondaryCtaEnabled
            if (r0 == 0) goto L_0x0079
            java.lang.Object r1 = r0.A00
            java.lang.Boolean r1 = (java.lang.Boolean) r1
        L_0x0079:
            java.lang.String r0 = "androidSecondaryCtaEnabled"
            boolean r1 = r3.compareBFlag(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0083
        L_0x0082:
            r0 = 0
        L_0x0083:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0088:
            r2 = r1
            goto L_0x0069
        L_0x008a:
            r2 = r1
            goto L_0x0059
        L_0x008c:
            r2 = r1
            goto L_0x0049
        L_0x008e:
            r2 = r1
            goto L_0x0039
        L_0x0090:
            r2 = r1
            goto L_0x0029
        L_0x0092:
            r2 = r1
            goto L_0x0019
        L_0x0094:
            r2 = r1
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.BooleanFeatureExperiment.getHumanValue():java.lang.Boolean");
    }

    public String getName() {
        return this.name;
    }

    public final Pair getUseCombinedView() {
        return this.useCombinedView;
    }

    public final Pair isCaptionInBottomSheet() {
        return this.isCaptionInBottomSheet;
    }

    public final Pair isDarkModeEnabled() {
        return this.isDarkModeEnabled;
    }

    public final Pair isUfiVertical() {
        return this.isUfiVertical;
    }

    public void setExperiment(boolean z) {
        setBFlag(z, this.isUfiVertical, "isUfiVertical");
        setBFlag(z, this.useCombinedView, "useCombinedView");
        setBFlag(z, this.isDarkModeEnabled, "isDarkModeEnabled");
        setBFlag(z, this.isCaptionInBottomSheet, "isCaptionInBottomSheet");
        setBFlag(z, this.bottomSheetTabIcons, "bottomSheetTabIcons");
        setBFlag(z, this.captionTagsH, "captionTagsH");
        setBFlag(z, this.captionTagsV, "captionTagsV");
        setBFlag(z, this.androidSecondaryCtaEnabled, "androidSecondaryCtaEnabled");
    }

    public /* bridge */ /* synthetic */ void setExperiment(Object obj) {
        setExperiment(AnonymousClass0wJ.A1X(obj));
    }
}
