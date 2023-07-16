package com.instagram.debug.devoptions;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;
import X.C18210wN;
import X.C18220wO;
import X.C18240wQ;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class PanaVisionExperiment extends AnonymousClass0Sf implements Experiment {
    public static final Companion Companion = new Companion();
    public final boolean controlOnlyTallVideoEnabled;
    public final PanavisionFlags flags;
    public String humanName;
    public final boolean isCommentComposerEnabled;
    public final boolean isDarkModeEnabled;
    public final boolean isImmersiveEnabled;
    public final boolean isRifuDisabled;
    public final boolean isTallVideoEnabled;
    public final boolean isUfiVertical;
    public String name;
    public final String panavisionAdMode;
    public final double panavisionMilestone;

    public final class Companion {
        public final PanaVisionExperiment createFromFlags(PanavisionFlags panavisionFlags) {
            C04220Ms.A0B(panavisionFlags, 0);
            return new PanaVisionExperiment(panavisionFlags, AnonymousClass0wJ.A1X(C18210wN.A0Y(panavisionFlags, "isRifuDisabled")), AnonymousClass0wJ.A1X(C18210wN.A0Y(panavisionFlags, "isUfiVertical")), AnonymousClass0wJ.A1X(C18210wN.A0Y(panavisionFlags, "isTallVideoEnabled")), AnonymousClass0wJ.A1X(C18210wN.A0Y(panavisionFlags, "isCommentComposerEnabled")), AnonymousClass0wJ.A1X(C18210wN.A0Y(panavisionFlags, "controlOnlyTallVideoEnabled")), AnonymousClass0wJ.A1X(C18210wN.A0Y(panavisionFlags, "isImmersiveEnabled")), AnonymousClass0wJ.A1X(C18210wN.A0Y(panavisionFlags, "isDarkModeEnabled")), (String) panavisionFlags.getSFlag("panavisionAdMode").getCurrentValue(), ((Number) panavisionFlags.getDFlag("panavisionMilestone").getCurrentValue()).doubleValue());
        }

        public static /* synthetic */ PanaVisionExperiment create$default(Companion companion, String str, String str2, PanavisionFlags panavisionFlags, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str3, double d, int i, Object obj) {
            boolean A1R = C18240wQ.A1R(i & 8, z);
            boolean A1R2 = C18240wQ.A1R(i & 16, z2);
            boolean A1R3 = C18240wQ.A1R(i & 32, z3);
            boolean A1R4 = C18240wQ.A1R(i & 64, z4);
            boolean A1R5 = C18240wQ.A1R(i & 128, z5);
            boolean A1R6 = C18240wQ.A1R(i & 256, z6);
            boolean A1R7 = C18240wQ.A1R(i & 512, z7);
            if ((i & 1024) != 0) {
                str3 = "";
            }
            if ((i & 2048) != 0) {
                d = 0.0d;
            }
            return companion.create(str, str2, panavisionFlags, A1R, A1R2, A1R3, A1R4, A1R5, A1R6, A1R7, str3, d);
        }

        public final PanaVisionExperiment create(String str, String str2, PanavisionFlags panavisionFlags, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str3, double d) {
            AnonymousClass0wJ.A1N(str, str2);
            String str4 = str3;
            C18240wQ.A1J(panavisionFlags, 2, str4);
            PanaVisionExperiment panaVisionExperiment = new PanaVisionExperiment(panavisionFlags, z, z2, z3, z4, z5, z6, z7, str4, d);
            panaVisionExperiment.setHumanName(str);
            panaVisionExperiment.setName(str2);
            return panaVisionExperiment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    private final PanavisionFlags component1() {
        return this.flags;
    }

    public static /* synthetic */ PanaVisionExperiment copy$default(PanaVisionExperiment panaVisionExperiment, PanavisionFlags panavisionFlags, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str, double d, int i, Object obj) {
        if ((i & 1) != 0) {
            panavisionFlags = panaVisionExperiment.flags;
        }
        if ((i & 2) != 0) {
            z = panaVisionExperiment.isRifuDisabled;
        }
        if ((i & 4) != 0) {
            z2 = panaVisionExperiment.isUfiVertical;
        }
        if ((i & 8) != 0) {
            z3 = panaVisionExperiment.isTallVideoEnabled;
        }
        if ((i & 16) != 0) {
            z4 = panaVisionExperiment.isCommentComposerEnabled;
        }
        if ((i & 32) != 0) {
            z5 = panaVisionExperiment.controlOnlyTallVideoEnabled;
        }
        if ((i & 64) != 0) {
            z6 = panaVisionExperiment.isImmersiveEnabled;
        }
        if ((i & 128) != 0) {
            z7 = panaVisionExperiment.isDarkModeEnabled;
        }
        if ((i & 256) != 0) {
            str = panaVisionExperiment.panavisionAdMode;
        }
        if ((i & 512) != 0) {
            d = panaVisionExperiment.panavisionMilestone;
        }
        return panaVisionExperiment.copy(panavisionFlags, z, z2, z3, z4, z5, z6, z7, str, d);
    }

    public final double component10() {
        return this.panavisionMilestone;
    }

    public final boolean component2() {
        return this.isRifuDisabled;
    }

    public final boolean component3() {
        return this.isUfiVertical;
    }

    public final boolean component4() {
        return this.isTallVideoEnabled;
    }

    public final boolean component5() {
        return this.isCommentComposerEnabled;
    }

    public final boolean component6() {
        return this.controlOnlyTallVideoEnabled;
    }

    public final boolean component7() {
        return this.isImmersiveEnabled;
    }

    public final boolean component8() {
        return this.isDarkModeEnabled;
    }

    public final String component9() {
        return this.panavisionAdMode;
    }

    public final PanaVisionExperiment copy(PanavisionFlags panavisionFlags, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str, double d) {
        String str2 = str;
        C18210wN.A1M(panavisionFlags, 0, str2);
        return new PanaVisionExperiment(panavisionFlags, z, z2, z3, z4, z5, z6, z7, str2, d);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PanaVisionExperiment) {
                PanaVisionExperiment panaVisionExperiment = (PanaVisionExperiment) obj;
                if (!(C04220Ms.A0I(this.flags, panaVisionExperiment.flags) && this.isRifuDisabled == panaVisionExperiment.isRifuDisabled && this.isUfiVertical == panaVisionExperiment.isUfiVertical && this.isTallVideoEnabled == panaVisionExperiment.isTallVideoEnabled && this.isCommentComposerEnabled == panaVisionExperiment.isCommentComposerEnabled && this.controlOnlyTallVideoEnabled == panaVisionExperiment.controlOnlyTallVideoEnabled && this.isImmersiveEnabled == panaVisionExperiment.isImmersiveEnabled && this.isDarkModeEnabled == panaVisionExperiment.isDarkModeEnabled && C04220Ms.A0I(this.panavisionAdMode, panaVisionExperiment.panavisionAdMode) && Double.compare(this.panavisionMilestone, panaVisionExperiment.panavisionMilestone) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void setHumanName(String str) {
        C04220Ms.A0B(str, 0);
        this.humanName = str;
    }

    public void setName(String str) {
        C04220Ms.A0B(str, 0);
        this.name = str;
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PanaVisionExperiment(com.instagram.debug.devoptions.PanavisionFlags r14, boolean r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, java.lang.String r22, double r23, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r13 = this;
            r1 = r25
            r11 = r23
            r10 = r22
            r0 = r25 & 2
            r9 = 0
            boolean r3 = X.C18240wQ.A1R(r0, r15)
            r0 = r25 & 4
            r2 = r16
            boolean r4 = X.C18240wQ.A1R(r0, r2)
            r0 = r25 & 8
            r2 = r17
            boolean r5 = X.C18240wQ.A1R(r0, r2)
            r0 = r25 & 16
            r2 = r18
            boolean r6 = X.C18240wQ.A1R(r0, r2)
            r0 = r25 & 32
            r2 = r19
            boolean r7 = X.C18240wQ.A1R(r0, r2)
            r0 = r25 & 64
            r2 = r20
            boolean r8 = X.C18240wQ.A1R(r0, r2)
            r0 = r1 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x003b
            r9 = r21
        L_0x003b:
            r0 = r1 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0041
            java.lang.String r10 = ""
        L_0x0041:
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0047
            r11 = 0
        L_0x0047:
            r1 = r13
            r2 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.PanaVisionExperiment.<init>(com.instagram.debug.devoptions.PanavisionFlags, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final boolean getControlOnlyTallVideoEnabled() {
        return this.controlOnlyTallVideoEnabled;
    }

    public String getHumanName() {
        return this.humanName;
    }

    public String getName() {
        return this.name;
    }

    public final String getPanavisionAdMode() {
        return this.panavisionAdMode;
    }

    public final double getPanavisionMilestone() {
        return this.panavisionMilestone;
    }

    public int hashCode() {
        int A04 = C18210wN.A04(this.flags);
        boolean z = this.isRifuDisabled;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = (A04 + (z ? 1 : 0)) * 31;
        boolean z2 = this.isUfiVertical;
        if (z2) {
            z2 = true;
        }
        int i3 = (i2 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.isTallVideoEnabled;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.isCommentComposerEnabled;
        if (z4) {
            z4 = true;
        }
        int i5 = (i4 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.controlOnlyTallVideoEnabled;
        if (z5) {
            z5 = true;
        }
        int i6 = (i5 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.isImmersiveEnabled;
        if (z6) {
            z6 = true;
        }
        int i7 = (i6 + (z6 ? 1 : 0)) * 31;
        if (!this.isDarkModeEnabled) {
            i = 0;
        }
        return AnonymousClass0wJ.A07(this.panavisionAdMode, (i7 + i) * 31) + C18190wL.A02(Double.doubleToLongBits(this.panavisionMilestone));
    }

    public boolean isActive() {
        return C04220Ms.A0I(Companion.createFromFlags(this.flags), this);
    }

    public final boolean isCommentComposerEnabled() {
        return this.isCommentComposerEnabled;
    }

    public final boolean isDarkModeEnabled() {
        return this.isDarkModeEnabled;
    }

    public final boolean isImmersiveEnabled() {
        return this.isImmersiveEnabled;
    }

    public final boolean isRifuDisabled() {
        return this.isRifuDisabled;
    }

    public final boolean isTallVideoEnabled() {
        return this.isTallVideoEnabled;
    }

    public final boolean isUfiVertical() {
        return this.isUfiVertical;
    }

    public void setOverrides() {
        PanavisionFlags panavisionFlags = this.flags;
        C18220wO.A1M(panavisionFlags.getBFlag("isRifuDisabled"), this.isRifuDisabled);
        C18220wO.A1M(panavisionFlags.getBFlag("isUfiVertical"), this.isUfiVertical);
        C18220wO.A1M(panavisionFlags.getBFlag("isCommentComposerEnabled"), this.isCommentComposerEnabled);
        C18220wO.A1M(panavisionFlags.getBFlag("isTallVideoEnabled"), this.isTallVideoEnabled);
        C18220wO.A1M(panavisionFlags.getBFlag("controlOnlyTallVideoEnabled"), this.controlOnlyTallVideoEnabled);
        C18220wO.A1M(panavisionFlags.getBFlag("isImmersiveEnabled"), this.isImmersiveEnabled);
        C18220wO.A1M(panavisionFlags.getBFlag("isDarkModeEnabled"), this.isDarkModeEnabled);
        panavisionFlags.getSFlag("panavisionAdMode").overrideValue(this.panavisionAdMode);
        panavisionFlags.getDFlag("panavisionMilestone").overrideValue(Double.valueOf(this.panavisionMilestone));
    }

    public PanaVisionExperiment(PanavisionFlags panavisionFlags, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str, double d) {
        C04220Ms.A0B(panavisionFlags, 1);
        C04220Ms.A0B(str, 9);
        this.flags = panavisionFlags;
        this.isRifuDisabled = z;
        this.isUfiVertical = z2;
        this.isTallVideoEnabled = z3;
        this.isCommentComposerEnabled = z4;
        this.controlOnlyTallVideoEnabled = z5;
        this.isImmersiveEnabled = z6;
        this.isDarkModeEnabled = z7;
        this.panavisionAdMode = str;
        this.panavisionMilestone = d;
        this.name = "";
        this.humanName = "";
    }
}
