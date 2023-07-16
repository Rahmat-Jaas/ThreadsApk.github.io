package com.instagram.common.api.base;

import X.AnonymousClass0LU;
import X.AnonymousClass0TJ;
import X.AnonymousClass0YP;
import X.AnonymousClass0YY;
import X.AnonymousClass0wJ;
import X.AnonymousClass1j8;
import X.AnonymousClass1j9;
import X.AnonymousClass3XX;
import X.AnonymousClass5x7;
import X.AnonymousClass5yI;
import X.AnonymousClass5z0;
import X.AnonymousClass7GU;
import X.AnonymousClass7IV;
import X.AnonymousClass8s9;
import X.C04220Ms;
import X.C10450iM;
import X.C105226d5;
import X.C108296i8;
import X.C13950oZ;
import X.C14030oh;
import X.C146368m8;
import X.C146578mT;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C26743EUq;
import X.C28174Ezk;
import X.C31155GhB;
import X.C40928Lrq;
import X.C63623hv;
import X.C63803iN;
import X.C63813iO;
import X.C63873iU;
import X.C85794vm;
import X.C86104wH;
import X.C86114wI;
import X.C86124wJ;
import X.C86154wM;
import X.C86164wN;
import X.C954060e;
import X.EO3;
import androidx.fragment.app.Fragment;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload;
import com.facebook.browser.lite.extensions.autofill.model.AutofillSettings;
import com.facebook.cameracore.mediapipeline.services.targetrecognition.interfaces.TargetRecognitionResponseCallback;
import com.instagram.business.fragment.SupportLinksFragment;
import com.instagram.business.fragment.SupportProfileDisplayOptionsFragment;
import com.instagram.business.fragment.SupportServiceEditUrlFragment;
import com.instagram.business.fragment.SupportServicePartnerSelectionFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public class IDxACallbackShape112S0100000_2_I2 extends C63873iU {
    public Object A00;
    public final int A01;

    public IDxACallbackShape112S0100000_2_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onFail(AnonymousClass3XX r13) {
        int i;
        int i2;
        long j;
        String str;
        Object obj;
        switch (this.A01) {
            case 0:
                i = AnonymousClass0wJ.A00(-1651615687, r13);
                C146578mT r1 = (C146578mT) r13.A00;
                if (r1 != null) {
                    obj = new AnonymousClass1j9(r1);
                } else {
                    Throwable th = r13.A01;
                    if (th != null) {
                        obj = new AnonymousClass1j8(th);
                    } else {
                        obj = null;
                    }
                    C04220Ms.A0A(obj);
                }
                C146368m8 r3 = (C146368m8) this.A00;
                C63623hv.A09("PrefetchScheduler-3", C86154wM.A11(r3, obj, 37));
                r3.ADR((Throwable) null);
                i2 = -866694893;
                break;
            case 1:
                i = C14030oh.A03(1951994439);
                C04220Ms.A0B(r13, 0);
                ((AnonymousClass0YP) this.A00).invoke(false, r13.A01);
                i2 = 1029271581;
                break;
            case 2:
                i = C14030oh.A03(643874591);
                C86124wJ.A1H((Fragment) this.A00);
                i2 = 1734122259;
                break;
            case 3:
                i = C14030oh.A03(1013412877);
                AnonymousClass5x7 r0 = (AnonymousClass5x7) this.A00;
                AnonymousClass5x7.A02(r0, false);
                C63813iO.A03(r0.requireContext(), (String) null, 2131834837, 0);
                i2 = 1914928528;
                break;
            case 4:
                i = C14030oh.A03(525739344);
                SupportLinksFragment supportLinksFragment = (SupportLinksFragment) this.A00;
                C63813iO.A00(supportLinksFragment.getContext(), 2131836068);
                supportLinksFragment.A05 = false;
                SupportLinksFragment.A00(supportLinksFragment);
                supportLinksFragment.A01.A05(supportLinksFragment.A05);
                i2 = 1218814719;
                break;
            case 5:
                i = C14030oh.A03(-516261102);
                SupportProfileDisplayOptionsFragment supportProfileDisplayOptionsFragment = (SupportProfileDisplayOptionsFragment) this.A00;
                C63813iO.A00(supportProfileDisplayOptionsFragment.requireContext(), 2131836068);
                AnonymousClass5yI r32 = supportProfileDisplayOptionsFragment.A02;
                r32.A01 = AnonymousClass0wJ.A0v();
                r32.A00 = null;
                AnonymousClass5yI.A00(r32);
                i2 = 209452064;
                break;
            case 6:
                i = C14030oh.A03(910817748);
                super.onFail(r13);
                SupportServiceEditUrlFragment supportServiceEditUrlFragment = (SupportServiceEditUrlFragment) this.A00;
                supportServiceEditUrlFragment.A04.dismiss();
                String A0r = C86104wH.A0r(supportServiceEditUrlFragment, r13);
                AnonymousClass7IV r8 = supportServiceEditUrlFragment.A02;
                String str2 = supportServiceEditUrlFragment.A07;
                String str3 = supportServiceEditUrlFragment.A05;
                String str4 = supportServiceEditUrlFragment.A0B;
                String str5 = supportServiceEditUrlFragment.A06;
                boolean A1Z = AnonymousClass0wJ.A1Z(str2, str3);
                AnonymousClass0wJ.A1Q(str4, str5);
                USLEBaseShape0S0000000 A002 = AnonymousClass7IV.A00(r8);
                C18190wL.A1I(A002, "remove_link");
                C18210wN.A1A(A002, "error");
                AnonymousClass7IV.A02(A002, r8, str2, str3, A1Z);
                C86114wI.A1F(A002, str4, str5);
                A002.A1J(A0r);
                A002.Bb4();
                i2 = -732700354;
                break;
            case 7:
                i = C14030oh.A03(-971687373);
                super.onFail(r13);
                SupportServiceEditUrlFragment supportServiceEditUrlFragment2 = (SupportServiceEditUrlFragment) this.A00;
                String A0r2 = C86104wH.A0r(supportServiceEditUrlFragment2, r13);
                AnonymousClass7IV r9 = supportServiceEditUrlFragment2.A02;
                String str6 = supportServiceEditUrlFragment2.A07;
                String str7 = supportServiceEditUrlFragment2.A05;
                String str8 = supportServiceEditUrlFragment2.A0B;
                String str9 = supportServiceEditUrlFragment2.A06;
                AnonymousClass0wJ.A1O(str7, str8);
                C04220Ms.A0B(str9, 3);
                USLEBaseShape0S0000000 A003 = AnonymousClass7IV.A00(r9);
                C18190wL.A1I(A003, "remove_action_button");
                AnonymousClass7IV.A03(A003, r9, "error", str6, false);
                A003.A0S("partner_id", AnonymousClass0wJ.A0d(str7));
                C86114wI.A1F(A003, str8, str9);
                A003.A1J(A0r2);
                C86164wN.A1C(A003, (String) null);
                i2 = 1184469682;
                break;
            case 8:
                i = C14030oh.A03(870033390);
                super.onFail(r13);
                SupportServicePartnerSelectionFragment supportServicePartnerSelectionFragment = (SupportServicePartnerSelectionFragment) this.A00;
                C63813iO.A00(supportServicePartnerSelectionFragment.getContext(), 2131836068);
                SpinnerImageView spinnerImageView = supportServicePartnerSelectionFragment.mLoadingSpinner;
                if (spinnerImageView != null) {
                    spinnerImageView.setVisibility(8);
                }
                Throwable th2 = r13.A01;
                if (th2 != null) {
                    str = th2.getMessage();
                } else {
                    str = null;
                }
                AnonymousClass7IV r5 = supportServicePartnerSelectionFragment.A03;
                String obj2 = supportServicePartnerSelectionFragment.A01.toString();
                boolean z = supportServicePartnerSelectionFragment.A08;
                USLEBaseShape0S0000000 A004 = AnonymousClass7IV.A00(r5);
                C18190wL.A1I(A004, "fetch_partners");
                AnonymousClass7IV.A03(A004, r5, "error", obj2, z);
                A004.A1J(str);
                A004.Bb4();
                i2 = -1541997677;
                break;
            case 9:
                i = AnonymousClass0wJ.A00(164441131, r13);
                super.onFail(r13);
                AnonymousClass0LU.A0B(C28174Ezk.A00(381), "Target recognition features API request failed");
                Throwable th3 = r13.A01;
                if (th3 != null) {
                    j = (long) th3.hashCode();
                } else {
                    j = -1;
                }
                ((TargetRecognitionResponseCallback) this.A00).handleCallbackError("/camera_recognizer", j);
                i2 = -1533204656;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = C14030oh.A03(-849996812);
                i2 = -895649414;
                break;
            case 14:
                i = AnonymousClass0wJ.A00(200817257, r13);
                AnonymousClass8s9.A00(r13, (AnonymousClass8s9) this.A00);
                i2 = -1723435882;
                break;
            case 15:
                i = AnonymousClass0wJ.A00(902496414, r13);
                AnonymousClass8s9.A00(r13, (AnonymousClass8s9) this.A00);
                i2 = -472322191;
                break;
            case 16:
                i = AnonymousClass0wJ.A00(-1830696385, r13);
                super.onFail(r13);
                AnonymousClass0LU.A0N("FxExperimentationHelper", "Error: %s", "Unable to fetch Linked Account FX Status");
                Throwable th4 = r13.A01;
                if (th4 != null) {
                    C10450iM.A06("FxExperimentationHelper", "Unable to fetch Linked Account FX Status", th4);
                } else {
                    C10450iM.A03("FxExperimentationHelper", "Unable to fetch Linked Account FX Status");
                }
                UserSession userSession = (UserSession) this.A00;
                if (!userSession.hasEnded()) {
                    C31155GhB.A04(new C954060e(userSession), 713, 3, (int) AnonymousClass7GU.A00, true, true);
                }
                i2 = -323655194;
                break;
            case LangUtils.HASH_SEED /*17*/:
                i = C14030oh.A03(788982443);
                ((C108296i8) this.A00).A00.A0G(new AutofillSettings((AutofillConnectPayload) null, 0, 0, 0, false, false, false, true));
                i2 = -2060504305;
                break;
            case 19:
                i = C14030oh.A03(663261127);
                C10450iM.A00().CuW("AdActivityRemoveMutationUtils", "AdActivity remove mutation failed");
                i2 = -379724699;
                break;
            case 20:
                i = C14030oh.A03(-1276769821);
                C10450iM.A00().CuW("AdActivityRemoveMutationUtils", "AdActivity remove undo mutation failed");
                i2 = -508268618;
                break;
            case 22:
                i = C14030oh.A03(1461760453);
                EO3.A0B((EO3) this.A00);
                i2 = 1705990681;
                break;
            case 24:
                i = AnonymousClass0wJ.A00(-1473196237, r13);
                i2 = -848242886;
                break;
            default:
                super.onFail(r13);
                return;
        }
        C14030oh.A0A(i2, i);
    }

    public final void onFailInBackground(C26743EUq eUq) {
        if (11 - this.A01 != 0) {
            super.onFailInBackground(eUq);
            return;
        }
        int A03 = C14030oh.A03(53853132);
        ((C40928Lrq) this.A00).A00((String) null);
        C14030oh.A0A(-1717120128, A03);
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A01) {
            case 4:
                i = C14030oh.A03(553070340);
                SupportLinksFragment supportLinksFragment = (SupportLinksFragment) this.A00;
                supportLinksFragment.mLoadingIndicator.setVisibility(8);
                supportLinksFragment.mPartnerTypeRowsContainer.setVisibility(0);
                i2 = -756355587;
                break;
            case 5:
                i = C14030oh.A03(-417586283);
                ((SupportProfileDisplayOptionsFragment) this.A00).mLoadingIndicator.setVisibility(8);
                i2 = -609692414;
                break;
            case 7:
                i = C14030oh.A03(1905322300);
                ((SupportServiceEditUrlFragment) this.A00).A04.dismiss();
                i2 = 410125530;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = C14030oh.A03(1586827411);
                i2 = -824280503;
                break;
            case 23:
                i = C14030oh.A03(-54111270);
                ((AnonymousClass0YY) this.A00).invoke(C18180wK.A0Y());
                i2 = -2092977370;
                break;
            case 24:
                i = C14030oh.A03(611884532);
                i2 = -1704246658;
                break;
            default:
                super.onFinish();
                return;
        }
        C14030oh.A0A(i2, i);
    }

    public final void onStart() {
        int i;
        int i2;
        switch (this.A01) {
            case 4:
                i = C14030oh.A03(2091804319);
                SupportLinksFragment supportLinksFragment = (SupportLinksFragment) this.A00;
                supportLinksFragment.mPartnerTypeRowsContainer.setVisibility(8);
                supportLinksFragment.mLoadingIndicator.setVisibility(0);
                i2 = -773764952;
                break;
            case 5:
                i = C14030oh.A03(-1177372014);
                ((SupportProfileDisplayOptionsFragment) this.A00).mLoadingIndicator.setVisibility(0);
                i2 = 1820422460;
                break;
            case 6:
                i = C14030oh.A03(879838075);
                C13950oZ.A00(((SupportServiceEditUrlFragment) this.A00).A04);
                i2 = -202002914;
                break;
            case 24:
                i = C14030oh.A03(1322235914);
                i2 = 1406234886;
                break;
            default:
                super.onStart();
                return;
        }
        C14030oh.A0A(i2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0079, code lost:
        if (r3 <= 0) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x07de, code lost:
        r6 = "response";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x07e0, code lost:
        X.C04220Ms.A0E(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x07e4, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0948, code lost:
        X.C14030oh.A0A(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x094b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c9, code lost:
        if (X.C04220Ms.A0I(r3, "0") == false) goto L_0x00cb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r29) {
        /*
            r28 = this;
            r0 = r28
            r2 = r29
            int r1 = r0.A01
            switch(r1) {
                case 0: goto L_0x000d;
                case 1: goto L_0x0039;
                case 2: goto L_0x00e5;
                case 3: goto L_0x0132;
                case 4: goto L_0x0160;
                case 5: goto L_0x0287;
                case 6: goto L_0x02df;
                case 7: goto L_0x037f;
                case 8: goto L_0x03ea;
                case 9: goto L_0x0456;
                case 10: goto L_0x047d;
                case 11: goto L_0x0009;
                case 12: goto L_0x04a5;
                case 13: goto L_0x04cc;
                case 14: goto L_0x052c;
                case 15: goto L_0x0551;
                case 16: goto L_0x0576;
                case 17: goto L_0x05a5;
                case 18: goto L_0x072b;
                case 19: goto L_0x07e5;
                case 20: goto L_0x081f;
                case 21: goto L_0x0859;
                case 22: goto L_0x0891;
                case 23: goto L_0x0009;
                case 24: goto L_0x08b1;
                case 25: goto L_0x08ec;
                case 26: goto L_0x0915;
                default: goto L_0x0009;
            }
        L_0x0009:
            super.onSuccess(r2)
            return
        L_0x000d:
            r1 = 766497713(0x2dafd3b1, float:1.9989206E-11)
            int r1 = X.C14030oh.A03(r1)
            r3 = 214017606(0xcc1a646, float:2.983643E-31)
            int r4 = X.AnonymousClass0wJ.A00(r3, r2)
            java.lang.Object r3 = r0.A00
            X.8m8 r3 = (X.C146368m8) r3
            r0 = 38
            kotlin.jvm.internal.KtLambdaShape17S0200000_I2_1 r2 = X.C86154wM.A11(r3, r2, r0)
            java.lang.String r0 = "PrefetchScheduler-2"
            X.C63623hv.A09(r0, r2)
            r0 = 0
            r3.ADR(r0)
            r0 = 1925351736(0x72c28938, float:7.7063653E30)
            X.C14030oh.A0A(r0, r4)
            r0 = -1900484467(0xffffffff8eb8e88d, float:-4.558344E-30)
            goto L_0x0948
        L_0x0039:
            r1 = 1324821100(0x4ef72a6c, float:2.07337626E9)
            int r1 = X.C14030oh.A03(r1)
            X.5z0 r2 = (X.AnonymousClass5z0) r2
            r3 = -10629142(0xffffffffff5dcfea, float:-2.9483894E38)
            int r4 = X.AnonymousClass0wJ.A00(r3, r2)
            java.lang.Object r12 = r2.A01
            com.facebook.pando.TreeJNI r12 = (com.facebook.pando.TreeJNI) r12
            r13 = 1
            if (r12 == 0) goto L_0x007b
            java.lang.Class<com.instagram.graphql.instagramschema.HasAvatarQueryResponseImpl$Viewer> r3 = com.instagram.graphql.instagramschema.HasAvatarQueryResponseImpl.Viewer.class
            java.lang.String r2 = "viewer"
            com.facebook.pando.TreeJNI r5 = r12.getTreeValue(r2, r3)
            if (r5 == 0) goto L_0x007b
            java.lang.Class<com.instagram.graphql.instagramschema.HasAvatarQueryResponseImpl$Viewer$User> r3 = com.instagram.graphql.instagramschema.HasAvatarQueryResponseImpl.Viewer.User.class
            java.lang.String r2 = "user"
            com.facebook.pando.TreeJNI r5 = r5.getTreeValue(r2, r3)
            if (r5 == 0) goto L_0x007b
            java.lang.Class<com.instagram.graphql.instagramschema.HasAvatarQueryResponseImpl$Viewer$User$UserAvatar> r3 = com.instagram.graphql.instagramschema.HasAvatarQueryResponseImpl.Viewer.User.UserAvatar.class
            java.lang.String r2 = "user_avatar"
            com.facebook.pando.TreeJNI r2 = r5.getTreeValue(r2, r3)
            if (r2 == 0) goto L_0x007b
            java.lang.String r2 = X.C18220wO.A0m(r2)
            if (r2 == 0) goto L_0x007b
            int r3 = r2.length()
            r2 = 1
            if (r3 > 0) goto L_0x007c
        L_0x007b:
            r2 = 0
        L_0x007c:
            r5 = 0
            if (r2 == 0) goto L_0x00e3
            if (r12 == 0) goto L_0x00e3
            java.lang.Class<com.instagram.graphql.instagramschema.HasAvatarQueryResponseImpl$Viewer> r11 = com.instagram.graphql.instagramschema.HasAvatarQueryResponseImpl.Viewer.class
            java.lang.String r10 = "viewer"
            com.facebook.pando.TreeJNI r2 = r12.getTreeValue(r10, r11)
            if (r2 == 0) goto L_0x00e3
            java.lang.Class<com.instagram.graphql.instagramschema.HasAvatarQueryResponseImpl$Viewer$User> r9 = com.instagram.graphql.instagramschema.HasAvatarQueryResponseImpl.Viewer.User.class
            java.lang.String r8 = "user"
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r8, r9)
            if (r2 == 0) goto L_0x00e3
            java.lang.Class<com.instagram.graphql.instagramschema.HasAvatarQueryResponseImpl$Viewer$User$UserAvatar> r7 = com.instagram.graphql.instagramschema.HasAvatarQueryResponseImpl.Viewer.User.UserAvatar.class
            java.lang.String r6 = "user_avatar"
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r6, r7)
            if (r2 == 0) goto L_0x00e3
            java.lang.String r3 = "config_hash"
            java.lang.String r2 = r2.getStringValue(r3)
            if (r2 == 0) goto L_0x00e3
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x00e3
            com.facebook.pando.TreeJNI r2 = r12.getTreeValue(r10, r11)
            if (r2 == 0) goto L_0x00e1
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r8, r9)
            if (r2 == 0) goto L_0x00e1
            com.facebook.pando.TreeJNI r2 = r2.getTreeValue(r6, r7)
            if (r2 == 0) goto L_0x00e1
            java.lang.String r3 = r2.getStringValue(r3)
        L_0x00c3:
            java.lang.String r2 = "0"
            boolean r2 = X.C04220Ms.A0I(r3, r2)
            if (r2 != 0) goto L_0x00e3
        L_0x00cb:
            java.lang.Object r2 = r0.A00
            X.0YP r2 = (X.AnonymousClass0YP) r2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            r2.invoke(r0, r5)
            r0 = 742313714(0x2c3ecef2, float:2.7115502E-12)
            X.C14030oh.A0A(r0, r4)
            r0 = 1646810614(0x622855f6, float:7.763118E20)
            goto L_0x0948
        L_0x00e1:
            r3 = r5
            goto L_0x00c3
        L_0x00e3:
            r13 = 0
            goto L_0x00cb
        L_0x00e5:
            r1 = -612877133(0xffffffffdb783cb3, float:-6.9872534E16)
            int r1 = X.C14030oh.A03(r1)
            X.5uD r2 = (X.AnonymousClass5uD) r2
            r3 = -1347486797(0xffffffffafaefbb3, float:-3.182926E-10)
            int r5 = X.C14030oh.A03(r3)
            r4 = 0
            X.C04220Ms.A0B(r2, r4)
            java.lang.Object r3 = r0.A00
            X.5x7 r3 = (X.AnonymousClass5x7) r3
            r3.A02 = r2
            java.lang.String r6 = "adInfo"
            java.util.ArrayList r0 = r2.A02
            if (r0 == 0) goto L_0x012e
            boolean r0 = X.C18250wR.A1K(r0)
            if (r0 == 0) goto L_0x011b
            X.5uD r0 = r3.A02
            if (r0 == 0) goto L_0x07e0
            java.util.ArrayList r0 = r0.A02
            if (r0 == 0) goto L_0x012e
            java.lang.Object r0 = r0.get(r4)
            X.6mg r0 = (X.C111036mg) r0
            r3.A01 = r0
        L_0x011b:
            X.4u2 r0 = r3.A00
            r3.configureActionBar(r0)
            X.AnonymousClass5x7.A00(r3)
            r0 = 1524813381(0x5ae2ce45, float:3.19200702E16)
            X.C14030oh.A0A(r0, r5)
            r0 = 583107460(0x22c18384, float:5.2452002E-18)
            goto L_0x0948
        L_0x012e:
            java.lang.String r6 = "adDetails"
            goto L_0x07e0
        L_0x0132:
            r1 = -1093582771(0xffffffffbed1404d, float:-0.4086937)
            int r1 = X.C14030oh.A03(r1)
            r2 = -771505978(0xffffffffd203c0c6, float:-1.41468729E11)
            int r4 = X.C14030oh.A03(r2)
            java.lang.Object r3 = r0.A00
            X.5x7 r3 = (X.AnonymousClass5x7) r3
            r0 = 1
            X.AnonymousClass5x7.A02(r3, r0)
            X.6mg r2 = r3.A01
            if (r2 == 0) goto L_0x0152
            r0 = 0
            r2.A07 = r0
            r0 = 0
            r2.A03 = r0
        L_0x0152:
            X.AnonymousClass5x7.A00(r3)
            r0 = 1678137702(0x64065966, float:9.913222E21)
            X.C14030oh.A0A(r0, r4)
            r0 = 1503176302(0x5998a66e, float:5.3708985E15)
            goto L_0x0948
        L_0x0160:
            r1 = 911215868(0x36500cfc, float:3.1001973E-6)
            int r1 = X.C14030oh.A03(r1)
            X.5tn r2 = (X.C94125tn) r2
            r3 = 2105067287(0x7d78c717, float:2.0667642E37)
            int r19 = X.C14030oh.A03(r3)
            java.lang.Object r7 = r0.A00
            com.instagram.business.fragment.SupportLinksFragment r7 = (com.instagram.business.fragment.SupportLinksFragment) r7
            android.view.ViewGroup r0 = r7.mPartnerTypeRowsContainer
            r0.removeAllViews()
            r11 = 0
            r7.A05 = r11
            java.util.List r0 = r2.A01
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            X.83w r18 = r0.iterator()
            r3 = 0
            r17 = r3
        L_0x0189:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0252
            java.lang.Object r14 = r18.next()
            X.5tw r14 = (X.C94215tw) r14
            java.lang.String r13 = r14.A02
            X.5KP r12 = r14.A00
            if (r12 != 0) goto L_0x024e
            r4 = 0
        L_0x019c:
            java.lang.String r0 = r14.A01
            r20 = r0
            android.view.LayoutInflater r6 = r7.A00
            r5 = 2131497090(0x7f0c1082, float:1.8617763E38)
            android.view.ViewGroup r0 = r7.mPartnerTypeRowsContainer
            android.view.View r15 = r6.inflate(r5, r0, r11)
            r0 = 2131306235(0x7f0926fb, float:1.8230663E38)
            android.view.View r10 = X.C18180wK.A0E(r15, r0)
            r0 = 2131306450(0x7f0927d2, float:1.82311E38)
            android.view.View r9 = X.C18180wK.A0E(r10, r0)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r0 = 2131306436(0x7f0927c4, float:1.8231071E38)
            android.view.View r8 = X.C18180wK.A0E(r10, r0)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r0 = 2131306430(0x7f0927be, float:1.8231059E38)
            android.view.View r6 = X.C18180wK.A0E(r15, r0)
            android.widget.TextView r6 = (android.widget.TextView) r6
            boolean r16 = android.text.TextUtils.isEmpty(r4)
            r5 = 8
            r0 = r20
            boolean r0 = com.instagram.business.fragment.SupportLinksFragment.A01(r12, r0)
            if (r0 == 0) goto L_0x01e1
            if (r12 == 0) goto L_0x0246
            java.lang.String r13 = r12.A05
            if (r13 == 0) goto L_0x0246
        L_0x01e1:
            if (r16 != 0) goto L_0x023c
            r9.setText(r13)
            r8.setText(r4)
            r10.setVisibility(r11)
            r6.setVisibility(r5)
        L_0x01ef:
            java.lang.Integer r0 = X.AnonymousClass006.A01
            X.AnonymousClass7FY.A02(r15, r0)
            android.view.ViewGroup r0 = r7.mPartnerTypeRowsContainer
            r0.addView(r15)
            X.5KP r6 = r14.A00
            java.lang.String r5 = r14.A01
            r4 = 2
            com.facebook.redex.IDxCListenerShape9S1200000_2_I2 r0 = new com.facebook.redex.IDxCListenerShape9S1200000_2_I2
            r0.<init>(r7, r6, r5, r4)
            r15.setOnClickListener(r0)
            r0 = 2131296500(0x7f0900f4, float:1.8210918E38)
            android.view.View r6 = X.C18180wK.A0E(r15, r0)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            java.lang.String r5 = r14.A01
            java.util.Map r4 = X.AnonymousClass691.A02
            boolean r0 = r4.containsKey(r5)
            if (r0 == 0) goto L_0x0239
            java.lang.Object r0 = r4.get(r5)
            X.691 r0 = (X.AnonymousClass691) r0
        L_0x021f:
            int r0 = r0.A00
            r6.setImageResource(r0)
            X.5KP r5 = r14.A00
            if (r5 == 0) goto L_0x0189
            r0 = 1
            r7.A05 = r0
            java.lang.String r4 = r5.A04
            java.lang.String r0 = r2.A00
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0189
            r17 = r5
            goto L_0x0189
        L_0x0239:
            X.691 r0 = X.AnonymousClass691.A04
            goto L_0x021f
        L_0x023c:
            r6.setText(r13)
            r10.setVisibility(r5)
            r6.setVisibility(r11)
            goto L_0x01ef
        L_0x0246:
            r0 = 2131829410(0x7f1122a2, float:1.9291788E38)
            java.lang.String r13 = r7.getString(r0)
            goto L_0x01e1
        L_0x024e:
            java.lang.String r4 = r12.A06
            goto L_0x019c
        L_0x0252:
            com.instagram.service.session.UserSession r0 = r7.A02
            com.instagram.user.model.User r2 = X.AnonymousClass0wJ.A0Y(r0)
            r0 = r17
            r2.A1j(r0)
            if (r17 == 0) goto L_0x0268
            r2.A2J(r11)
            java.lang.String r0 = r0.A04
            com.instagram.api.schemas.SMBPartnerType r3 = X.C99726Kn.A00(r0)
        L_0x0268:
            r2.A1p(r3)
            com.instagram.service.session.UserSession r0 = r7.A02
            X.C18210wN.A1J(r0, r2)
            com.instagram.business.fragment.SupportLinksFragment.A00(r7)
            X.7IV r2 = r7.A01
            boolean r0 = r7.A05
            r2.A05(r0)
            r2 = 1422217074(0x54c54f72, float:6.7795314E12)
            r0 = r19
            X.C14030oh.A0A(r2, r0)
            r0 = -927035984(0xffffffffc8be8db0, float:-390253.5)
            goto L_0x0948
        L_0x0287:
            r1 = -829254534(0xffffffffce92947a, float:-1.22960205E9)
            int r1 = X.C14030oh.A03(r1)
            X.5tn r2 = (X.C94125tn) r2
            r3 = 616253035(0x24bb466b, float:8.1217615E-17)
            int r6 = X.C14030oh.A03(r3)
            java.lang.Object r3 = r0.A00
            com.instagram.business.fragment.SupportProfileDisplayOptionsFragment r3 = (com.instagram.business.fragment.SupportProfileDisplayOptionsFragment) r3
            X.5yI r7 = r3.A02
            java.util.List r0 = r2.A01
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            X.8mR r5 = r3.A01
            if (r0 == 0) goto L_0x02a9
            r7.A01 = r0
        L_0x02a9:
            r0 = 0
            r7.A00 = r0
            if (r5 == 0) goto L_0x02d1
            java.util.List r0 = r7.A01
            java.util.Iterator r4 = r0.iterator()
        L_0x02b4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x02d1
            java.lang.Object r3 = r4.next()
            X.5tw r3 = (X.C94215tw) r3
            java.lang.String r2 = r3.A01
            java.lang.String r0 = r5.AWx()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x02b4
            X.5KP r0 = r3.A00
            r7.A00 = r0
            goto L_0x02b4
        L_0x02d1:
            X.AnonymousClass5yI.A00(r7)
            r0 = 1221791353(0x48d30e79, float:432243.78)
            X.C14030oh.A0A(r0, r6)
            r0 = -1166416025(0xffffffffba79e767, float:-9.533078E-4)
            goto L_0x0948
        L_0x02df:
            r1 = 789719433(0x2f122989, float:1.3293379E-10)
            int r1 = X.C14030oh.A03(r1)
            r3 = 306316548(0x12420504, float:6.122179E-28)
            int r7 = X.C14030oh.A03(r3)
            super.onSuccess(r2)
            java.lang.Object r4 = r0.A00
            com.instagram.business.fragment.SupportServiceEditUrlFragment r4 = (com.instagram.business.fragment.SupportServiceEditUrlFragment) r4
            r3 = 0
            com.instagram.business.fragment.SupportServiceEditUrlFragment.A00(r3, r4)
            boolean r2 = r4.A0D
            if (r2 == 0) goto L_0x030b
            java.lang.String r2 = r4.A08     // Catch:{ IllegalArgumentException -> 0x0312 }
            com.instagram.api.schemas.SMBPartnerType r2 = X.C99726Kn.A00(r2)     // Catch:{ IllegalArgumentException -> 0x0312 }
            if (r2 != 0) goto L_0x0311
            java.lang.String r2 = "No SMBPartnerType for provided category type"
            java.lang.IllegalArgumentException r2 = X.C18190wL.A0a(r2)     // Catch:{ IllegalArgumentException -> 0x0312 }
            throw r2     // Catch:{ IllegalArgumentException -> 0x0312 }
        L_0x030b:
            java.lang.String r2 = r4.A08
            com.instagram.api.schemas.SMBPartnerType r2 = X.C99726Kn.A00(r2)
        L_0x0311:
            r3 = r2
        L_0x0312:
            com.instagram.api.schemas.SMBPartnerType r2 = r4.A01
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x036f
            com.instagram.service.session.UserSession r2 = r4.A03
            r0 = 7
            com.instagram.common.api.base.IDxACallbackShape112S0100000_2_I2 r5 = new com.instagram.common.api.base.IDxACallbackShape112S0100000_2_I2
            r5.<init>(r4, r0)
            X.H1T r3 = X.AnonymousClass0wJ.A0N(r2)
            java.lang.String r0 = "accounts/remove_profile_action_button/"
            r3.A0J(r0)
            java.lang.Class<X.5u8> r2 = X.AnonymousClass5u8.class
            java.lang.Class<X.6zr> r0 = X.C118166zr.class
            X.H8c r0 = X.C18180wK.A0T(r3, r2, r0)
            r0.A00 = r5
            r4.schedule(r0)
        L_0x0338:
            X.7IV r9 = r4.A02
            java.lang.String r8 = r4.A07
            java.lang.String r6 = r4.A05
            java.lang.String r5 = r4.A0B
            java.lang.String r4 = r4.A06
            r3 = 0
            X.C04220Ms.A0B(r8, r3)
            X.AnonymousClass0wJ.A1O(r6, r5)
            r0 = 3
            X.C04220Ms.A0B(r4, r0)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.AnonymousClass7IV.A00(r9)
            java.lang.String r0 = "remove_link"
            X.C18190wL.A1I(r2, r0)
            java.lang.String r0 = "success"
            X.C18210wN.A1A(r2, r0)
            X.AnonymousClass7IV.A02(r2, r9, r8, r6, r3)
            X.C86114wI.A1F(r2, r5, r4)
            r2.Bb4()
            r0 = -348365956(0xffffffffeb3c5b7c, float:-2.2771008E26)
            X.C14030oh.A0A(r0, r7)
            r0 = 1149597689(0x448577f9, float:1067.7491)
            goto L_0x0948
        L_0x036f:
            X.0wh r2 = r4.A04
            r2.dismiss()
            android.os.Handler r3 = r4.A0G
            X.7zh r2 = new X.7zh
            r2.<init>(r0)
            r3.post(r2)
            goto L_0x0338
        L_0x037f:
            r1 = -376933576(0xffffffffe9887338, float:-2.0619752E25)
            int r1 = X.C14030oh.A03(r1)
            r3 = 1545245869(0x5c1a94ad, float:1.74042469E17)
            int r8 = X.C14030oh.A03(r3)
            super.onSuccess(r2)
            java.lang.Object r4 = r0.A00
            com.instagram.business.fragment.SupportServiceEditUrlFragment r4 = (com.instagram.business.fragment.SupportServiceEditUrlFragment) r4
            com.instagram.service.session.UserSession r2 = r4.A03
            com.instagram.user.model.User r3 = X.AnonymousClass0wJ.A0Y(r2)
            r10 = 0
            r3.A1p(r10)
            r3.A1j(r10)
            com.instagram.service.session.UserSession r2 = r4.A03
            X.C18210wN.A1J(r2, r3)
            android.os.Handler r3 = r4.A0G
            X.7zj r2 = new X.7zj
            r2.<init>(r0)
            r3.post(r2)
            X.7IV r9 = r4.A02
            java.lang.String r7 = r4.A07
            java.lang.String r6 = r4.A05
            java.lang.String r5 = r4.A0B
            java.lang.String r4 = r4.A06
            r2 = 0
            X.AnonymousClass0wJ.A1O(r6, r5)
            r0 = 3
            X.C04220Ms.A0B(r4, r0)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r3 = X.AnonymousClass7IV.A00(r9)
            java.lang.String r0 = "remove_action_button"
            X.C18190wL.A1I(r3, r0)
            java.lang.String r0 = "success"
            X.AnonymousClass7IV.A03(r3, r9, r0, r7, r2)
            java.lang.Long r2 = X.AnonymousClass0wJ.A0d(r6)
            java.lang.String r0 = "partner_id"
            r3.A0S(r0, r2)
            X.C86114wI.A1F(r3, r5, r4)
            X.C86164wN.A1C(r3, r10)
            r0 = -1289067143(0xffffffffb32a6579, float:-3.96735E-8)
            X.C14030oh.A0A(r0, r8)
            r0 = 943689919(0x383f90bf, float:4.5672754E-5)
            goto L_0x0948
        L_0x03ea:
            r1 = -128272203(0xfffffffff85ab8b5, float:-1.7744797E34)
            int r1 = X.C14030oh.A03(r1)
            X.5tQ r2 = (X.AnonymousClass5tQ) r2
            r3 = 717348190(0x2ac1dd5e, float:3.443729E-13)
            int r6 = X.C14030oh.A03(r3)
            super.onSuccess(r2)
            java.lang.Object r7 = r0.A00
            com.instagram.business.fragment.SupportServicePartnerSelectionFragment r7 = (com.instagram.business.fragment.SupportServicePartnerSelectionFragment) r7
            java.util.List r0 = r2.A00
            r7.A07 = r0
            X.5yH r4 = r7.A02
            r4.A00 = r0
            r4.clear()
            java.util.List r0 = r4.A00
            if (r0 == 0) goto L_0x0424
            java.util.Iterator r3 = r0.iterator()
        L_0x0414:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0424
            java.lang.Object r2 = r3.next()
            X.5yM r0 = r4.A01
            r4.addModel(r2, r0)
            goto L_0x0414
        L_0x0424:
            r4.notifyDataSetChanged()
            com.instagram.ui.widget.spinner.SpinnerImageView r2 = r7.mLoadingSpinner
            if (r2 == 0) goto L_0x0430
            r0 = 8
            r2.setVisibility(r0)
        L_0x0430:
            X.7IV r5 = r7.A03
            com.instagram.api.schemas.SMBPartnerType r0 = r7.A01
            java.lang.String r4 = r0.toString()
            boolean r3 = r7.A08
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r2 = X.AnonymousClass7IV.A00(r5)
            java.lang.String r0 = "fetch_partners"
            X.C18190wL.A1I(r2, r0)
            java.lang.String r0 = "success"
            X.AnonymousClass7IV.A03(r2, r5, r0, r4, r3)
            r2.Bb4()
            r0 = -765781998(0xffffffffd25b1812, float:-2.35250418E11)
            X.C14030oh.A0A(r0, r6)
            r0 = -1255433838(0xffffffffb52b9992, float:-6.392594E-7)
            goto L_0x0948
        L_0x0456:
            r1 = -958258802(0xffffffffc6e2218e, float:-28944.777)
            int r1 = X.C14030oh.A03(r1)
            X.5ys r2 = (X.C95105ys) r2
            r3 = 1741773255(0x67d159c7, float:1.9772614E24)
            int r4 = X.AnonymousClass0wJ.A00(r3, r2)
            super.onSuccess(r2)
            java.lang.Object r3 = r0.A00
            com.facebook.cameracore.mediapipeline.services.targetrecognition.interfaces.TargetRecognitionResponseCallback r3 = (com.facebook.cameracore.mediapipeline.services.targetrecognition.interfaces.TargetRecognitionResponseCallback) r3
            java.lang.String r0 = r2.A00
            r3.handleCallbackResponse(r0)
            r0 = 1140803027(0x43ff45d3, float:510.5455)
            X.C14030oh.A0A(r0, r4)
            r0 = 1123918599(0x42fda307, float:126.81841)
            goto L_0x0948
        L_0x047d:
            r1 = -11772752(0xffffffffff4c5cb0, float:-2.7164377E38)
            int r1 = X.C14030oh.A03(r1)
            X.5st r2 = (X.AnonymousClass5st) r2
            r3 = 1119973763(0x42c17183, float:96.7217)
            int r4 = X.AnonymousClass0wJ.A00(r3, r2)
            X.7oa r3 = r2.A00
            if (r3 == 0) goto L_0x07de
            java.lang.Object r2 = r0.A00
            X.Dmf r2 = (X.C25494Dmf) r2
            java.util.List r0 = r3.A01
            r2.A01(r0)
            r0 = 1933310119(0x733bf8a7, float:1.489262E31)
            X.C14030oh.A0A(r0, r4)
            r0 = 110808088(0x69acc18, float:5.822825E-35)
            goto L_0x0948
        L_0x04a5:
            r1 = 1180182424(0x46582798, float:13833.898)
            int r1 = X.C14030oh.A03(r1)
            X.5tx r2 = (X.C94225tx) r2
            r3 = 46513415(0x2c5bd07, float:2.9055045E-37)
            int r4 = X.C14030oh.A03(r3)
            java.lang.Object r3 = r0.A00
            X.FVN r3 = (X.FVN) r3
            X.6q7 r0 = r3.A0A
            r0.A00(r2)
            X.FVN.A02(r3)
            r0 = -851264650(0xffffffffcd42bb76, float:-2.04191584E8)
            X.C14030oh.A0A(r0, r4)
            r0 = -975699191(0xffffffffc5d80309, float:-6912.3794)
            goto L_0x0948
        L_0x04cc:
            r1 = -244331577(0xfffffffff16fcbc7, float:-1.1874123E30)
            int r1 = X.C14030oh.A03(r1)
            X.5tz r2 = (X.C94245tz) r2
            r3 = 1641467111(0x61d6cce7, float:4.95296E20)
            int r5 = X.C14030oh.A03(r3)
            java.lang.Object r6 = r0.A00
            X.7Gl r6 = (X.C121497Gl) r6
            r0 = 0
            r6.A08 = r0
            long r3 = java.lang.System.currentTimeMillis()
            r6.A01 = r3
            java.lang.String r0 = r2.A01
            r6.A06 = r0
            java.lang.Integer r0 = r2.A00
            int r0 = r0.intValue()
            r6.A00 = r0
            java.util.ArrayList r3 = X.AnonymousClass0wJ.A0v()
            java.util.List r0 = r2.A02
            java.util.Iterator r2 = r0.iterator()
        L_0x04ff:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0509
            X.C18190wL.A1T(r3, r2)
            goto L_0x04ff
        L_0x0509:
            r6.A07 = r3
            com.instagram.service.session.UserSession r4 = r6.A0B
            X.0TJ r0 = X.AnonymousClass0TJ.A05
            r2 = 2342154878937334518(0x20810174000202f6, double:4.058692095556571E-152)
            boolean r0 = X.C63803iN.A0E(r0, r4, r2)
            if (r0 == 0) goto L_0x0528
            X.C121497Gl.A01(r6)
        L_0x051d:
            r0 = 964538741(0x397db175, float:2.4194068E-4)
            X.C14030oh.A0A(r0, r5)
            r0 = 200704934(0xbf683a6, float:9.4953836E-32)
            goto L_0x0948
        L_0x0528:
            X.C121497Gl.A02(r6)
            goto L_0x051d
        L_0x052c:
            r1 = 1329643109(0x4f40be65, float:3.23370317E9)
            int r1 = X.C14030oh.A03(r1)
            r3 = -1439720624(0xffffffffaa2f9b50, float:-1.5597007E-13)
            int r4 = X.AnonymousClass0wJ.A00(r3, r2)
            java.lang.Object r3 = r0.A00
            X.8s9 r3 = (X.AnonymousClass8s9) r3
            X.1jA r2 = X.AnonymousClass1jA.A00(r2)
            r0 = 0
            r3.Cf0(r2, r0)
            r0 = 206525818(0xc4f557a, float:1.5972422E-31)
            X.C14030oh.A0A(r0, r4)
            r0 = -419624273(0xffffffffe6fd0aaf, float:-5.974779E23)
            goto L_0x0948
        L_0x0551:
            r1 = -873927521(0xffffffffcbe8ec9f, float:-3.0529854E7)
            int r1 = X.C14030oh.A03(r1)
            r3 = 1851054779(0x6e54dabb, float:1.6468813E28)
            int r4 = X.AnonymousClass0wJ.A00(r3, r2)
            java.lang.Object r3 = r0.A00
            X.8s9 r3 = (X.AnonymousClass8s9) r3
            X.1jA r2 = X.AnonymousClass1jA.A00(r2)
            r0 = 0
            r3.Cf0(r2, r0)
            r0 = 1313224143(0x4e4635cf, float:8.3135379E8)
            X.C14030oh.A0A(r0, r4)
            r0 = -1224648004(0xffffffffb7015abc, float:-7.710125E-6)
            goto L_0x0948
        L_0x0576:
            r1 = -394627135(0xffffffffe87a77c1, float:-4.7312028E24)
            int r1 = X.C14030oh.A03(r1)
            X.5z0 r2 = (X.AnonymousClass5z0) r2
            r3 = 1823630116(0x6cb26324, float:1.7252558E27)
            int r6 = X.AnonymousClass0wJ.A00(r3, r2)
            java.lang.Object r5 = r0.A00
            com.instagram.service.session.UserSession r5 = (com.instagram.service.session.UserSession) r5
            X.0TJ r0 = X.AnonymousClass0TJ.A05
            r3 = 36313037954614539(0x8102840000050b, double:3.027849651141019E-306)
            boolean r0 = X.C63803iN.A0E(r0, r5, r3)
            if (r0 != 0) goto L_0x059a
            X.AnonymousClass7GU.A00(r2, r5)
        L_0x059a:
            r0 = 1103775869(0x41ca487d, float:25.285395)
            X.C14030oh.A0A(r0, r6)
            r0 = 1105829666(0x41e99f22, float:29.202702)
            goto L_0x0948
        L_0x05a5:
            r1 = -224443204(0xfffffffff29f44bc, float:-6.309275E30)
            int r1 = X.C14030oh.A03(r1)
            X.5z0 r2 = (X.AnonymousClass5z0) r2
            r3 = 1712228265(0x660e87a9, float:1.6826963E23)
            int r7 = X.AnonymousClass0wJ.A00(r3, r2)
            java.lang.Object r2 = r2.A01
            X.4uq r2 = (X.C85304uq) r2
            r12 = 0
            if (r2 == 0) goto L_0x0700
            X.4vg r10 = r2.Ao0()
            if (r10 == 0) goto L_0x0700
            int r21 = r10.AZ8()
            boolean r24 = r10.Ale()
            int r22 = r10.B0M()
            boolean r25 = r10.Aq3()
            boolean r26 = r10.Apk()
            boolean r27 = r10.App()
            X.8rD r8 = r10.AZ5()
            if (r8 == 0) goto L_0x06fb
            X.8qY r2 = r8.ASN()
            if (r2 == 0) goto L_0x0684
            X.8rB r4 = r2.APX()
        L_0x05ea:
            java.lang.String r3 = r8.getName()
            java.lang.String r2 = "name"
            kotlin.Pair r13 = X.C18180wK.A0p(r2, r3)
            java.lang.String r3 = r8.AfO()
            java.lang.String r2 = "email"
            kotlin.Pair r14 = X.C18180wK.A0p(r2, r3)
            if (r4 == 0) goto L_0x0682
            java.lang.String r3 = r4.APc()
        L_0x0604:
            java.lang.String r2 = "address-line1"
            kotlin.Pair r15 = X.C18180wK.A0p(r2, r3)
            if (r4 == 0) goto L_0x0680
            java.lang.String r3 = r4.APd()
        L_0x0610:
            java.lang.String r2 = "address-line2"
            kotlin.Pair r16 = X.C18180wK.A0p(r2, r3)
            if (r4 == 0) goto L_0x067e
            java.lang.String r3 = r4.APa()
        L_0x061c:
            java.lang.String r2 = "address-level1"
            kotlin.Pair r17 = X.C18180wK.A0p(r2, r3)
            if (r4 == 0) goto L_0x067c
            java.lang.String r3 = r4.APb()
        L_0x0628:
            java.lang.String r2 = "address-level2"
            kotlin.Pair r18 = X.C18180wK.A0p(r2, r3)
            if (r4 == 0) goto L_0x067a
            java.lang.String r3 = r4.B2P()
        L_0x0634:
            java.lang.String r2 = "postal-code"
            kotlin.Pair r19 = X.C18180wK.A0p(r2, r3)
            if (r4 == 0) goto L_0x0678
            java.lang.String r3 = r4.Aa7()
        L_0x0640:
            java.lang.String r2 = "country"
            kotlin.Pair r20 = X.C18180wK.A0p(r2, r3)
            kotlin.Pair[] r2 = new kotlin.Pair[]{r13, r14, r15, r16, r17, r18, r19, r20}
            java.util.Map r2 = X.AnonymousClass4WJ.A0H(r2)
            java.util.ArrayList r5 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r6 = X.AnonymousClass0wJ.A0z(r2)
        L_0x0656:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0687
            java.util.Map$Entry r2 = X.C18180wK.A0o(r6)
            java.lang.Object r4 = r2.getKey()
            java.lang.String r3 = X.C18230wP.A0u(r2)
            if (r3 == 0) goto L_0x0656
            int r2 = r3.length()
            if (r2 == 0) goto L_0x0656
            kotlin.Pair r2 = X.C18180wK.A0p(r4, r3)
            r5.add(r2)
            goto L_0x0656
        L_0x0678:
            r3 = r12
            goto L_0x0640
        L_0x067a:
            r3 = r12
            goto L_0x0634
        L_0x067c:
            r3 = r12
            goto L_0x0628
        L_0x067e:
            r3 = r12
            goto L_0x061c
        L_0x0680:
            r3 = r12
            goto L_0x0610
        L_0x0682:
            r3 = r12
            goto L_0x0604
        L_0x0684:
            r4 = r12
            goto L_0x05ea
        L_0x0687:
            java.util.Map r6 = X.AnonymousClass4WJ.A0B(r5)
            java.lang.String r5 = r8.AOT()
            java.lang.String r4 = r8.B4X()
            com.google.common.collect.ImmutableList r3 = r8.Aan()
            X.C04220Ms.A06(r3)
            java.util.ArrayList r2 = X.AnonymousClass0wJ.A0v()
            java.util.Iterator r9 = r3.iterator()
        L_0x06a2:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L_0x06f1
            java.lang.Object r3 = r9.next()
            X.8rC r3 = (X.C148508rC) r3
            X.C04220Ms.A04(r3)
            java.lang.String r8 = r3.Ar9()
            if (r8 == 0) goto L_0x06a2
            int r8 = r8.length()
            if (r8 == 0) goto L_0x06a2
            r14 = 0
            java.lang.String r15 = r3.BH2()
            java.lang.String r18 = r3.Aal()
            java.lang.String r16 = r3.AnP()
            java.lang.String r8 = r3.AWU()
            if (r8 == 0) goto L_0x06ef
            java.lang.Integer r13 = X.C86124wJ.A0h(r8)
        L_0x06d4:
            java.lang.String r8 = r3.AWV()
            if (r8 == 0) goto L_0x06de
            java.lang.Integer r14 = X.C86124wJ.A0h(r8)
        L_0x06de:
            java.lang.String r20 = r3.Ar9()
            com.fbpay.w3c.CardDetails r11 = new com.fbpay.w3c.CardDetails
            r17 = r12
            r19 = r12
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r2.add(r11)
            goto L_0x06a2
        L_0x06ef:
            r13 = r12
            goto L_0x06d4
        L_0x06f1:
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r3 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData
            r3.<init>((java.util.Map) r6)
            com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload r12 = new com.facebook.browser.lite.extensions.autofill.model.AutofillConnectPayload
            r12.<init>(r3, r5, r4, r2)
        L_0x06fb:
            int r23 = r10.AZ4()
            goto L_0x070e
        L_0x0700:
            r21 = 0
            r24 = 0
            r22 = 0
            r25 = 0
            r26 = 0
            r27 = 1
            r23 = 0
        L_0x070e:
            com.facebook.browser.lite.extensions.autofill.model.AutofillSettings r2 = new com.facebook.browser.lite.extensions.autofill.model.AutofillSettings
            r19 = r2
            r20 = r12
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            java.lang.Object r0 = r0.A00
            X.6i8 r0 = (X.C108296i8) r0
            X.56r r0 = r0.A00
            r0.A0G(r2)
            r0 = 840327906(0x321662e2, float:8.7536325E-9)
            X.C14030oh.A0A(r0, r7)
            r0 = 1131219648(0x436d0ac0, float:237.04199)
            goto L_0x0948
        L_0x072b:
            r1 = -2134400481(0xffffffff80c7a21f, float:-1.8333422E-38)
            int r1 = X.C14030oh.A03(r1)
            X.5t4 r2 = (X.AnonymousClass5t4) r2
            r3 = -1809531369(0xffffffff9424be17, float:-8.317373E-27)
            int r3 = X.C14030oh.A03(r3)
            r4 = 0
            X.C04220Ms.A0B(r2, r4)
            super.onSuccess(r2)
            java.lang.Object r5 = r0.A00
            X.79s r5 = (X.C1203279s) r5
            java.util.HashMap r6 = X.AnonymousClass0wJ.A0y()
            X.6h2 r0 = r2.A00
            if (r0 == 0) goto L_0x07de
            java.lang.String r0 = r0.A00
            X.MMo r8 = X.C18180wK.A0L(r0)
            X.LcR r7 = r8.A0f()
            X.LcR r0 = X.C40318LcR.START_OBJECT
            if (r7 == r0) goto L_0x077f
            r8.A0x()
            r6 = 0
        L_0x0760:
            X.6h2 r0 = r2.A00
            if (r0 == 0) goto L_0x07de
            java.lang.String r4 = r0.A01
            if (r6 == 0) goto L_0x0774
            X.0gW r2 = X.AnonymousClass0gN.A00()
            X.61O r0 = new X.61O
            r0.<init>(r5, r4, r6)
            r2.AKp(r0)
        L_0x0774:
            r0 = 2041567416(0x79afd8b8, float:1.1413094E35)
            X.C14030oh.A0A(r0, r3)
            r0 = -580308380(0xffffffffdd693264, float:-1.05022519E18)
            goto L_0x0948
        L_0x077f:
            X.LcR r7 = r8.A0g()
            X.LcR r0 = X.C40318LcR.END_OBJECT
            if (r7 == r0) goto L_0x07c1
            java.lang.String r11 = X.AnonymousClass0wJ.A0q(r8)
            java.lang.String r0 = r8.A0p()
            X.C04220Ms.A06(r0)
            java.lang.Double r0 = X.C81074n3.A04(r0)
            if (r0 == 0) goto L_0x07bd
            X.C04220Ms.A06(r11)
            com.facebook.dcp.model.Type r10 = com.facebook.dcp.model.Type.DOUBLE
            r24 = 0
            double r21 = r0.doubleValue()
            r12 = 0
            r23 = 16372(0x3ff4, float:2.2942E-41)
            com.facebook.dcp.model.FeatureData r9 = new com.facebook.dcp.model.FeatureData
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            r26 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r24, r26)
            r6.put(r11, r9)
        L_0x07bd:
            r8.A0x()
            goto L_0x077f
        L_0x07c1:
            com.instagram.service.session.UserSession r0 = r5.A06
            java.lang.String r9 = r0.getUserId()
            java.lang.String r8 = r0.getUserId()
            com.facebook.dcp.model.Type r7 = com.facebook.dcp.model.Type.CLIENT_CONTEXT
            r0 = 28
            com.facebook.dcp.model.ExampleContext r4 = new com.facebook.dcp.model.ExampleContext
            r4.<init>(r7, r8, r0)
            com.facebook.dcp.model.Example r0 = new com.facebook.dcp.model.Example
            r0.<init>(r4, r9, r6)
            java.util.List r6 = X.C18180wK.A0n(r0)
            goto L_0x0760
        L_0x07de:
            java.lang.String r6 = "response"
        L_0x07e0:
            X.C04220Ms.A0E(r6)
            r0 = 0
            throw r0
        L_0x07e5:
            r1 = -537249647(0xffffffffdffa3891, float:-3.606064E19)
            int r1 = X.C14030oh.A03(r1)
            X.5z0 r2 = (X.AnonymousClass5z0) r2
            r3 = -1715416918(0xffffffff99c0d0aa, float:-1.9936613E-23)
            int r5 = X.AnonymousClass0wJ.A00(r3, r2)
            java.lang.Object r4 = r0.A00
            X.8jR r4 = (X.C144878jR) r4
            java.lang.Object r3 = r2.A01
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            if (r3 == 0) goto L_0x081d
            java.lang.Class<com.instagram.graphql.instagramschema.AdActivityRemoveMutationResponseImpl$XfbDeleteRecentAdActivity> r2 = com.instagram.graphql.instagramschema.AdActivityRemoveMutationResponseImpl.XfbDeleteRecentAdActivity.class
            java.lang.String r0 = "xfb_delete_recent_ad_activity(data:$input)"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r0, r2)
            if (r2 == 0) goto L_0x081d
            java.lang.String r0 = "success"
            java.lang.Boolean r0 = X.C18250wR.A0S(r2, r0)
        L_0x080f:
            r4.CNJ(r0)
            r0 = -1180102172(0xffffffffb9a911e4, float:-3.224752E-4)
            X.C14030oh.A0A(r0, r5)
            r0 = -1786905258(0xffffffff957dfd56, float:-5.129279E-26)
            goto L_0x0948
        L_0x081d:
            r0 = 0
            goto L_0x080f
        L_0x081f:
            r1 = -1458796909(0xffffffffa90c8693, float:-3.120297E-14)
            int r1 = X.C14030oh.A03(r1)
            X.5z0 r2 = (X.AnonymousClass5z0) r2
            r3 = 1173580065(0x45f36921, float:7789.141)
            int r5 = X.AnonymousClass0wJ.A00(r3, r2)
            java.lang.Object r4 = r0.A00
            X.8jR r4 = (X.C144878jR) r4
            java.lang.Object r3 = r2.A01
            com.facebook.pando.TreeJNI r3 = (com.facebook.pando.TreeJNI) r3
            if (r3 == 0) goto L_0x0857
            java.lang.Class<com.instagram.graphql.instagramschema.AdActivityRemoveUndoMutationResponseImpl$XfbUndoDeleteRecentAdActivity> r2 = com.instagram.graphql.instagramschema.AdActivityRemoveUndoMutationResponseImpl.XfbUndoDeleteRecentAdActivity.class
            java.lang.String r0 = "xfb_undo_delete_recent_ad_activity(data:$input)"
            com.facebook.pando.TreeJNI r2 = r3.getTreeValue(r0, r2)
            if (r2 == 0) goto L_0x0857
            java.lang.String r0 = "success"
            java.lang.Boolean r0 = X.C18250wR.A0S(r2, r0)
        L_0x0849:
            r4.CNJ(r0)
            r0 = 1552884126(0x5c8f219e, float:3.22303073E17)
            X.C14030oh.A0A(r0, r5)
            r0 = 1395924451(0x53341de3, float:7.7359553E11)
            goto L_0x0948
        L_0x0857:
            r0 = 0
            goto L_0x0849
        L_0x0859:
            r1 = 120249975(0x72ade77, float:1.2854755E-34)
            int r1 = X.C14030oh.A03(r1)
            X.5tt r2 = (X.C94185tt) r2
            r3 = 1146106671(0x4450332f, float:832.79974)
            int r5 = X.C14030oh.A03(r3)
            X.BOd r3 = r2.A01
            if (r3 == 0) goto L_0x0886
            java.lang.Object r4 = r0.A00
            X.9P8 r4 = (X.AnonymousClass9P8) r4
            X.C19554AyF.A02()
            com.instagram.service.session.UserSession r0 = r4.A04
            com.instagram.reels.store.ReelStore r3 = com.instagram.reels.store.ReelStore.A02(r0)
            X.BOd r2 = r2.A01
            r0 = 0
            com.instagram.model.reels.Reel r0 = r3.A0G(r2, r0)
            r4.A01 = r0
            X.AnonymousClass9P8.A01(r4)
        L_0x0886:
            r0 = 1899623549(0x7139f47d, float:9.208047E29)
            X.C14030oh.A0A(r0, r5)
            r0 = 1072015312(0x3fe5a7d0, float:1.7941837)
            goto L_0x0948
        L_0x0891:
            r1 = 87875615(0x53ce01f, float:8.880882E-36)
            int r1 = X.C14030oh.A03(r1)
            r2 = -879578621(0xffffffffcb92b203, float:-1.9227654E7)
            int r2 = X.C14030oh.A03(r2)
            java.lang.Object r0 = r0.A00
            X.EO3 r0 = (X.EO3) r0
            X.EO3.A0B(r0)
            r0 = -1696171297(0xffffffff9ae67adf, float:-9.532428E-23)
            X.C14030oh.A0A(r0, r2)
            r0 = 984560290(0x3aaf32a2, float:0.001336653)
            goto L_0x0948
        L_0x08b1:
            r1 = -2062774077(0xffffffff850c90c3, float:-6.609357E-36)
            int r1 = X.C14030oh.A03(r1)
            X.9Me r2 = (X.C156169Me) r2
            r3 = -1102430412(0xffffffffbe4a3f34, float:-0.19750673)
            int r4 = X.AnonymousClass0wJ.A00(r3, r2)
            java.lang.Object r3 = r0.A00
            com.instagram.urlhandlers.clipsapp.ClipsAppUrlHandlerActivity r3 = (com.instagram.urlhandlers.clipsapp.ClipsAppUrlHandlerActivity) r3
            java.util.List r0 = r2.A04
            X.C04220Ms.A06(r0)
            java.lang.Object r2 = X.AnonymousClass00J.A0D(r0)
            X.BKU r2 = (X.BKU) r2
            if (r2 == 0) goto L_0x08e2
            X.0Oa r0 = r3.A00
            com.instagram.service.session.UserSession r0 = X.AnonymousClass0wJ.A0X(r0)
            X.Awj r0 = X.C19462Awj.A01(r0)
            r0.A03(r2)
            com.instagram.urlhandlers.clipsapp.ClipsAppUrlHandlerActivity.A00(r2, r3)
        L_0x08e2:
            r0 = 1696826654(0x6523851e, float:4.826258E22)
            X.C14030oh.A0A(r0, r4)
            r0 = -1273428745(0xffffffffb41904f7, float:-1.4251042E-7)
            goto L_0x0948
        L_0x08ec:
            r1 = -1383383409(0xffffffffad8b3e8f, float:-1.5830252E-11)
            int r1 = X.C14030oh.A03(r1)
            X.9Me r2 = (X.C156169Me) r2
            r3 = 2143989385(0x7fcaae89, float:NaN)
            int r3 = X.C14030oh.A03(r3)
            java.util.List r2 = r2.A04
            java.lang.Object r2 = X.C18240wQ.A0b(r2)
            X.BKU r2 = (X.BKU) r2
            java.lang.Object r0 = r0.A00
            X.0i6 r0 = (X.C10300i6) r0
            r2.AAy(r0)
            r0 = -1432114282(0xffffffffaaa3ab96, float:-2.9073678E-13)
            X.C14030oh.A0A(r0, r3)
            r0 = -1778526976(0xffffffff95fdd500, float:-1.0252194E-25)
            goto L_0x0948
        L_0x0915:
            r1 = 988894581(0x3af15575, float:0.0018412309)
            int r1 = X.C14030oh.A03(r1)
            X.5tk r2 = (X.C94095tk) r2
            r3 = -177986390(0xfffffffff56424aa, float:-2.8920589E32)
            int r5 = X.C14030oh.A03(r3)
            java.util.List r2 = r2.A00
            java.util.Iterator r4 = r2.iterator()
        L_0x092b:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x093f
            java.lang.Object r3 = r4.next()
            X.BKU r3 = (X.BKU) r3
            java.lang.Object r2 = r0.A00
            X.0i6 r2 = (X.C10300i6) r2
            r3.AAy(r2)
            goto L_0x092b
        L_0x093f:
            r0 = -1702082004(0xffffffff9a8c4a2c, float:-5.8022474E-23)
            X.C14030oh.A0A(r0, r5)
            r0 = -1176000967(0xffffffffb9e7a639, float:-4.41836E-4)
        L_0x0948:
            X.C14030oh.A0A(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.api.base.IDxACallbackShape112S0100000_2_I2.onSuccess(java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int i;
        int i2;
        switch (this.A01) {
            case 11:
                i = C14030oh.A03(1508409394);
                C85794vm r7 = (C85794vm) obj;
                int A002 = AnonymousClass0wJ.A00(-2116920945, r7);
                ((C40928Lrq) this.A00).A00(((C105226d5) r7.D7H()).A00);
                C14030oh.A0A(1772282221, A002);
                i2 = 659107002;
                break;
            case 16:
                i = C14030oh.A03(-1971063310);
                AnonymousClass5z0 r72 = (AnonymousClass5z0) obj;
                int A003 = AnonymousClass0wJ.A00(1921176164, r72);
                UserSession userSession = (UserSession) this.A00;
                if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36313037954614539L)) {
                    AnonymousClass7GU.A00(r72, userSession);
                }
                C14030oh.A0A(1911765239, A003);
                i2 = 1271628254;
                break;
            default:
                super.onSuccessInBackground(obj);
                return;
        }
        C14030oh.A0A(i2, i);
    }
}
