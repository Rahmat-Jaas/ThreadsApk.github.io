package com.instagram.debug.devoptions;

import X.AnonymousClass0Sf;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18180wK;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C18240wQ;
import com.facebook.common.dextricks.Constants;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class Nav3Experiment extends AnonymousClass0Sf implements FeatureExperiment {
    public static final Companion Companion = new Companion();
    public final boolean bellIconForAF;
    public final boolean filledTabIconsEnabled;
    public final PanavisionFlags flags;
    public String humanName;
    public final boolean isEnabled;
    public final boolean isModifiedProfileMenu;
    public final boolean isSwappedProfileCreateIcon;
    public String name;
    public final boolean overrideShareToGallery;
    public final boolean swipeRightDirectEnabled;
    public final String tab0;
    public final String tab1;
    public final String tab2;
    public final String tab3;
    public final String tab4;
    public final String topbar0;
    public final String topbar1;
    public final String topbar2;

    public final class Companion {
        public final Nav3Experiment createFromFlags(PanavisionFlags panavisionFlags) {
            PanavisionFlags panavisionFlags2 = panavisionFlags;
            C04220Ms.A0B(panavisionFlags2, 0);
            return new Nav3Experiment(panavisionFlags2, AnonymousClass0wJ.A1X(C18210wN.A0Y(panavisionFlags2, "isEnabled")), C18230wP.A0p(panavisionFlags2, "tab0"), C18230wP.A0p(panavisionFlags2, "tab1"), C18230wP.A0p(panavisionFlags2, "tab2"), C18230wP.A0p(panavisionFlags2, "tab3"), C18230wP.A0p(panavisionFlags2, "tab4"), C18230wP.A0p(panavisionFlags2, "topbar0"), C18230wP.A0p(panavisionFlags2, "topbar1"), C18230wP.A0p(panavisionFlags2, "topbar2"), AnonymousClass0wJ.A1X(C18210wN.A0Y(panavisionFlags2, "swipeRightDirectEnabled")), AnonymousClass0wJ.A1X(C18210wN.A0Y(panavisionFlags2, "overrideShareToGallery")), AnonymousClass0wJ.A1X(C18210wN.A0Y(panavisionFlags2, "isModifiedProfileMenu")), AnonymousClass0wJ.A1X(C18210wN.A0Y(panavisionFlags2, "filledTabIconsEnabled")), AnonymousClass0wJ.A1X(C18210wN.A0Y(panavisionFlags2, "bellIconForAF")), AnonymousClass0wJ.A1X(C18210wN.A0Y(panavisionFlags2, "isSwappedProfileCreateIcon")));
        }

        public static /* synthetic */ Nav3Experiment create$default(Companion companion, String str, String str2, PanavisionFlags panavisionFlags, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, Object obj) {
            int i2 = i;
            boolean A1R = C18240wQ.A1R(i & 8, z);
            if ((i & 16) != 0) {
                str3 = "";
            }
            if ((i & 32) != 0) {
                str4 = "";
            }
            if ((i & 64) != 0) {
                str5 = "";
            }
            if ((i2 & 128) != 0) {
                str6 = "";
            }
            if ((i2 & 256) != 0) {
                str7 = "";
            }
            if ((i2 & 512) != 0) {
                str8 = "";
            }
            if ((i2 & 1024) != 0) {
                str9 = "";
            }
            if ((i2 & 2048) != 0) {
                str10 = "";
            }
            if ((i2 & 4096) != 0) {
                z2 = true;
            }
            return companion.create(str, str2, panavisionFlags, A1R, str3, str4, str5, str6, str7, str8, str9, str10, z2, C18240wQ.A1R(i2 & 8192, z3), C18240wQ.A1R(i2 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET, z4), C18240wQ.A1R(32768 & i, z5), C18240wQ.A1R(65536 & i, z6), C18240wQ.A1R(i & Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP, z7));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final Nav3Experiment create(String str, String str2, PanavisionFlags panavisionFlags, boolean z, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
            String str11 = str2;
            String str12 = str;
            AnonymousClass0wJ.A1N(str12, str11);
            PanavisionFlags panavisionFlags2 = panavisionFlags;
            C04220Ms.A0B(panavisionFlags2, 2);
            String str13 = str3;
            String str14 = str4;
            C18180wK.A1R(str13, str14);
            String str15 = str7;
            String str16 = str5;
            String str17 = str6;
            C18180wK.A1S(str16, str17, str15);
            String str18 = str9;
            String str19 = str8;
            C18240wQ.A1J(str19, 9, str18);
            String str20 = str10;
            C04220Ms.A0B(str20, 11);
            boolean z8 = z;
            boolean z9 = z5;
            boolean z10 = z4;
            boolean z11 = z3;
            Nav3Experiment nav3Experiment = new Nav3Experiment(panavisionFlags2, z8, str13, str14, str16, str17, str15, str19, str18, str20, z2, z11, z10, z9, z6, z7);
            nav3Experiment.setHumanName(str12);
            nav3Experiment.setName(str11);
            return nav3Experiment;
        }

        public Companion() {
        }
    }

    public Nav3Experiment(PanavisionFlags panavisionFlags, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        C04220Ms.A0B(panavisionFlags, 1);
        AnonymousClass0wJ.A1R(str, str2);
        C04220Ms.A0B(str3, 5);
        C18180wK.A1S(str4, str5, str6);
        C18240wQ.A1J(str7, 9, str8);
        this.flags = panavisionFlags;
        this.isEnabled = z;
        this.tab0 = str;
        this.tab1 = str2;
        this.tab2 = str3;
        this.tab3 = str4;
        this.tab4 = str5;
        this.topbar0 = str6;
        this.topbar1 = str7;
        this.topbar2 = str8;
        this.swipeRightDirectEnabled = z2;
        this.overrideShareToGallery = z3;
        this.isModifiedProfileMenu = z4;
        this.filledTabIconsEnabled = z5;
        this.bellIconForAF = z6;
        this.isSwappedProfileCreateIcon = z7;
        this.name = "";
        this.humanName = "";
    }

    private final PanavisionFlags component1() {
        return this.flags;
    }

    public static /* synthetic */ Nav3Experiment copy$default(Nav3Experiment nav3Experiment, PanavisionFlags panavisionFlags, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, Object obj) {
        boolean z8 = z;
        PanavisionFlags panavisionFlags2 = panavisionFlags;
        String str9 = str3;
        String str10 = str2;
        String str11 = str;
        String str12 = str6;
        String str13 = str5;
        String str14 = str4;
        boolean z9 = z2;
        String str15 = str8;
        String str16 = str7;
        boolean z10 = z5;
        boolean z11 = z4;
        boolean z12 = z3;
        boolean z13 = z7;
        int i2 = i;
        boolean z14 = z6;
        Nav3Experiment nav3Experiment2 = nav3Experiment;
        if ((i & 1) != 0) {
            panavisionFlags2 = nav3Experiment2.flags;
        }
        if ((i & 2) != 0) {
            z8 = nav3Experiment2.isEnabled;
        }
        if ((i & 4) != 0) {
            str11 = nav3Experiment2.tab0;
        }
        if ((i & 8) != 0) {
            str10 = nav3Experiment2.tab1;
        }
        if ((i & 16) != 0) {
            str9 = nav3Experiment2.tab2;
        }
        if ((i & 32) != 0) {
            str14 = nav3Experiment2.tab3;
        }
        if ((i & 64) != 0) {
            str13 = nav3Experiment2.tab4;
        }
        if ((i2 & 128) != 0) {
            str12 = nav3Experiment2.topbar0;
        }
        if ((i2 & 256) != 0) {
            str16 = nav3Experiment2.topbar1;
        }
        if ((i2 & 512) != 0) {
            str15 = nav3Experiment2.topbar2;
        }
        if ((i2 & 1024) != 0) {
            z9 = nav3Experiment2.swipeRightDirectEnabled;
        }
        if ((i2 & 2048) != 0) {
            z12 = nav3Experiment2.overrideShareToGallery;
        }
        if ((i2 & 4096) != 0) {
            z11 = nav3Experiment2.isModifiedProfileMenu;
        }
        if ((i2 & 8192) != 0) {
            z10 = nav3Experiment2.filledTabIconsEnabled;
        }
        if ((i2 & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            z14 = nav3Experiment2.bellIconForAF;
        }
        if ((i & 32768) != 0) {
            z13 = nav3Experiment2.isSwappedProfileCreateIcon;
        }
        String str17 = str10;
        String str18 = str9;
        return nav3Experiment2.copy(panavisionFlags2, z8, str11, str17, str18, str14, str13, str12, str16, str15, z9, z12, z11, z10, z14, z13);
    }

    public final String component10() {
        return this.topbar2;
    }

    public final boolean component11() {
        return this.swipeRightDirectEnabled;
    }

    public final boolean component12() {
        return this.overrideShareToGallery;
    }

    public final boolean component13() {
        return this.isModifiedProfileMenu;
    }

    public final boolean component14() {
        return this.filledTabIconsEnabled;
    }

    public final boolean component15() {
        return this.bellIconForAF;
    }

    public final boolean component16() {
        return this.isSwappedProfileCreateIcon;
    }

    public final boolean component2() {
        return this.isEnabled;
    }

    public final String component3() {
        return this.tab0;
    }

    public final String component4() {
        return this.tab1;
    }

    public final String component5() {
        return this.tab2;
    }

    public final String component6() {
        return this.tab3;
    }

    public final String component7() {
        return this.tab4;
    }

    public final String component8() {
        return this.topbar0;
    }

    public final String component9() {
        return this.topbar1;
    }

    public final Nav3Experiment copy(PanavisionFlags panavisionFlags, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        PanavisionFlags panavisionFlags2 = panavisionFlags;
        C04220Ms.A0B(panavisionFlags2, 0);
        String str9 = str;
        String str10 = str2;
        AnonymousClass0wJ.A1Q(str9, str10);
        String str11 = str3;
        String str12 = str4;
        C18180wK.A1R(str11, str12);
        String str13 = str5;
        String str14 = str6;
        String str15 = str7;
        C18180wK.A1S(str13, str14, str15);
        String str16 = str8;
        C04220Ms.A0B(str16, 9);
        return new Nav3Experiment(panavisionFlags2, z, str9, str10, str11, str12, str13, str14, str15, str16, z2, z3, z4, z5, z6, z7);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Nav3Experiment) {
                Nav3Experiment nav3Experiment = (Nav3Experiment) obj;
                if (!C04220Ms.A0I(this.flags, nav3Experiment.flags) || this.isEnabled != nav3Experiment.isEnabled || !C04220Ms.A0I(this.tab0, nav3Experiment.tab0) || !C04220Ms.A0I(this.tab1, nav3Experiment.tab1) || !C04220Ms.A0I(this.tab2, nav3Experiment.tab2) || !C04220Ms.A0I(this.tab3, nav3Experiment.tab3) || !C04220Ms.A0I(this.tab4, nav3Experiment.tab4) || !C04220Ms.A0I(this.topbar0, nav3Experiment.topbar0) || !C04220Ms.A0I(this.topbar1, nav3Experiment.topbar1) || !C04220Ms.A0I(this.topbar2, nav3Experiment.topbar2) || this.swipeRightDirectEnabled != nav3Experiment.swipeRightDirectEnabled || this.overrideShareToGallery != nav3Experiment.overrideShareToGallery || this.isModifiedProfileMenu != nav3Experiment.isModifiedProfileMenu || this.filledTabIconsEnabled != nav3Experiment.filledTabIconsEnabled || this.bellIconForAF != nav3Experiment.bellIconForAF || this.isSwappedProfileCreateIcon != nav3Experiment.isSwappedProfileCreateIcon) {
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

    public final boolean getBellIconForAF() {
        return this.bellIconForAF;
    }

    public final boolean getFilledTabIconsEnabled() {
        return this.filledTabIconsEnabled;
    }

    public String getHumanName() {
        return this.humanName;
    }

    public Boolean getHumanValue() {
        return Boolean.valueOf(C04220Ms.A0I(Companion.createFromFlags(this.flags), this));
    }

    public String getName() {
        return this.name;
    }

    public final boolean getOverrideShareToGallery() {
        return this.overrideShareToGallery;
    }

    public final boolean getSwipeRightDirectEnabled() {
        return this.swipeRightDirectEnabled;
    }

    public final String getTab0() {
        return this.tab0;
    }

    public final String getTab1() {
        return this.tab1;
    }

    public final String getTab2() {
        return this.tab2;
    }

    public final String getTab3() {
        return this.tab3;
    }

    public final String getTab4() {
        return this.tab4;
    }

    public final String getTopbar0() {
        return this.topbar0;
    }

    public final String getTopbar1() {
        return this.topbar1;
    }

    public final String getTopbar2() {
        return this.topbar2;
    }

    public int hashCode() {
        int A04 = C18210wN.A04(this.flags);
        boolean z = this.isEnabled;
        int i = 1;
        if (z) {
            z = true;
        }
        int A07 = AnonymousClass0wJ.A07(this.topbar2, AnonymousClass0wJ.A07(this.topbar1, AnonymousClass0wJ.A07(this.topbar0, AnonymousClass0wJ.A07(this.tab4, AnonymousClass0wJ.A07(this.tab3, AnonymousClass0wJ.A07(this.tab2, AnonymousClass0wJ.A07(this.tab1, AnonymousClass0wJ.A07(this.tab0, (A04 + (z ? 1 : 0)) * 31))))))));
        boolean z2 = this.swipeRightDirectEnabled;
        if (z2) {
            z2 = true;
        }
        int i2 = (A07 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.overrideShareToGallery;
        if (z3) {
            z3 = true;
        }
        int i3 = (i2 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.isModifiedProfileMenu;
        if (z4) {
            z4 = true;
        }
        int i4 = (i3 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.filledTabIconsEnabled;
        if (z5) {
            z5 = true;
        }
        int i5 = (i4 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.bellIconForAF;
        if (z6) {
            z6 = true;
        }
        int i6 = (i5 + (z6 ? 1 : 0)) * 31;
        if (!this.isSwappedProfileCreateIcon) {
            i = 0;
        }
        return i6 + i;
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final boolean isModifiedProfileMenu() {
        return this.isModifiedProfileMenu;
    }

    public final boolean isSwappedProfileCreateIcon() {
        return this.isSwappedProfileCreateIcon;
    }

    public void setExperiment(boolean z) {
        PanavisionFlags panavisionFlags = this.flags;
        C18220wO.A1M(panavisionFlags.getBFlag("isEnabled"), this.isEnabled);
        panavisionFlags.getSFlag("tab0").overrideValue(this.tab0);
        panavisionFlags.getSFlag("tab1").overrideValue(this.tab1);
        panavisionFlags.getSFlag("tab2").overrideValue(this.tab2);
        panavisionFlags.getSFlag("tab3").overrideValue(this.tab3);
        panavisionFlags.getSFlag("tab4").overrideValue(this.tab4);
        panavisionFlags.getSFlag("topbar0").overrideValue(this.topbar0);
        panavisionFlags.getSFlag("topbar1").overrideValue(this.topbar1);
        panavisionFlags.getSFlag("topbar2").overrideValue(this.topbar2);
        C18220wO.A1M(panavisionFlags.getBFlag("swipeRightDirectEnabled"), this.swipeRightDirectEnabled);
        C18220wO.A1M(panavisionFlags.getBFlag("overrideShareToGallery"), this.overrideShareToGallery);
        C18220wO.A1M(panavisionFlags.getBFlag("isModifiedProfileMenu"), this.isModifiedProfileMenu);
        C18220wO.A1M(panavisionFlags.getBFlag("filledTabIconsEnabled"), this.filledTabIconsEnabled);
        C18220wO.A1M(panavisionFlags.getBFlag("bellIconForAF"), this.bellIconForAF);
        C18220wO.A1M(panavisionFlags.getBFlag("isSwappedProfileCreateIcon"), this.isSwappedProfileCreateIcon);
    }

    public /* bridge */ /* synthetic */ void setExperiment(Object obj) {
        setExperiment(AnonymousClass0wJ.A1X(obj));
    }

    public /* synthetic */ Nav3Experiment(PanavisionFlags panavisionFlags, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(panavisionFlags, C18240wQ.A1R(i & 2, z), str, str2, str3, str4, str5, str6, str7, str8, z2, z3, z4, z5, z6, z7);
    }
}
