package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C18190wL;
import X.C28161tl;
import com.instagram.service.session.UserSession;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class UserPreferenceBooleanFeatureExperiment implements FeatureExperiment {
    public static final Companion Companion = new Companion();
    public String humanName = "";
    public final Pair immersiveDebugOverlay;
    public final Pair lithoCoalescedView;
    public String name = "";
    public final UserSession userSession;

    public final class Companion {
        public static /* synthetic */ UserPreferenceBooleanFeatureExperiment create$default(Companion companion, String str, String str2, UserSession userSession, Pair pair, Pair pair2, int i, Object obj) {
            if ((i & 8) != 0) {
                pair = null;
            }
            if ((i & 16) != 0) {
                pair2 = null;
            }
            return companion.create(str, str2, userSession, pair, pair2);
        }

        public final UserPreferenceBooleanFeatureExperiment create(String str, String str2, UserSession userSession, Pair pair, Pair pair2) {
            AnonymousClass0wJ.A1N(str, str2);
            C04220Ms.A0B(userSession, 2);
            UserPreferenceBooleanFeatureExperiment userPreferenceBooleanFeatureExperiment = new UserPreferenceBooleanFeatureExperiment(userSession, pair, pair2);
            userPreferenceBooleanFeatureExperiment.setHumanName(str);
            userPreferenceBooleanFeatureExperiment.setName(str2);
            return userPreferenceBooleanFeatureExperiment;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public UserPreferenceBooleanFeatureExperiment(UserSession userSession2, Pair pair, Pair pair2) {
        C04220Ms.A0B(userSession2, 1);
        this.userSession = userSession2;
        this.immersiveDebugOverlay = pair;
        this.lithoCoalescedView = pair2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = r4.booleanValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean compareBFlag(java.lang.Boolean r4, X.AnonymousClass0ZU r5) {
        /*
            r3 = this;
            r2 = 1
            if (r4 == 0) goto L_0x0012
            boolean r1 = r4.booleanValue()
            java.lang.Object r0 = r5.invoke()
            boolean r0 = X.AnonymousClass0wJ.A1X(r0)
            if (r0 == r1) goto L_0x0012
            r2 = 0
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.UserPreferenceBooleanFeatureExperiment.compareBFlag(java.lang.Boolean, X.0ZU):boolean");
    }

    public void setHumanName(String str) {
        C04220Ms.A0B(str, 0);
        this.humanName = str;
    }

    public void setName(String str) {
        C04220Ms.A0B(str, 0);
        this.name = str;
    }

    /* access modifiers changed from: private */
    public final boolean getImmersiveDebugOverlayFlag() {
        return C18190wL.A1X(C28161tl.A04(this.userSession), "feed_overlay_dev");
    }

    /* access modifiers changed from: private */
    public final boolean getLithoCoalescedFlag() {
        return C18190wL.A1X(C28161tl.A04(this.userSession), "feed_litho_coalesced_dev");
    }

    private final void setImmersiveDebugOverlayFlag(boolean z) {
        AnonymousClass0wJ.A13(C28161tl.A03(this.userSession), "feed_overlay_dev", z);
    }

    private final void setLithoCoalescedFlag(boolean z) {
        AnonymousClass0wJ.A13(C28161tl.A03(this.userSession), "feed_litho_coalesced_dev", z);
    }

    public String getHumanName() {
        return this.humanName;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (compareBFlag(r1, new com.instagram.debug.devoptions.UserPreferenceBooleanFeatureExperiment$humanValue$2(r3)) == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Boolean getHumanValue() {
        /*
            r3 = this;
            kotlin.Pair r0 = r3.immersiveDebugOverlay
            r1 = 0
            if (r0 == 0) goto L_0x002e
            java.lang.Object r2 = r0.A00
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L_0x0009:
            com.instagram.debug.devoptions.UserPreferenceBooleanFeatureExperiment$humanValue$1 r0 = new com.instagram.debug.devoptions.UserPreferenceBooleanFeatureExperiment$humanValue$1
            r0.<init>(r3)
            boolean r0 = r3.compareBFlag(r2, r0)
            if (r0 == 0) goto L_0x0028
            kotlin.Pair r0 = r3.lithoCoalescedView
            if (r0 == 0) goto L_0x001c
            java.lang.Object r1 = r0.A00
            java.lang.Boolean r1 = (java.lang.Boolean) r1
        L_0x001c:
            com.instagram.debug.devoptions.UserPreferenceBooleanFeatureExperiment$humanValue$2 r0 = new com.instagram.debug.devoptions.UserPreferenceBooleanFeatureExperiment$humanValue$2
            r0.<init>(r3)
            boolean r1 = r3.compareBFlag(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x002e:
            r2 = r1
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.debug.devoptions.UserPreferenceBooleanFeatureExperiment.getHumanValue():java.lang.Boolean");
    }

    public final Pair getImmersiveDebugOverlay() {
        return this.immersiveDebugOverlay;
    }

    public final Pair getLithoCoalescedView() {
        return this.lithoCoalescedView;
    }

    public String getName() {
        return this.name;
    }

    public void setExperiment(boolean z) {
        Object obj;
        Object obj2;
        Pair pair = this.immersiveDebugOverlay;
        if (pair != null) {
            if (z) {
                obj2 = pair.A00;
            } else {
                obj2 = pair.A01;
            }
            setImmersiveDebugOverlayFlag(AnonymousClass0wJ.A1X(obj2));
        }
        Pair pair2 = this.lithoCoalescedView;
        if (pair2 != null) {
            if (z) {
                obj = pair2.A00;
            } else {
                obj = pair2.A01;
            }
            setLithoCoalescedFlag(AnonymousClass0wJ.A1X(obj));
        }
    }

    public /* bridge */ /* synthetic */ void setExperiment(Object obj) {
        setExperiment(AnonymousClass0wJ.A1X(obj));
    }
}
