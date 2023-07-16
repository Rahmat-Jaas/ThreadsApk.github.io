package com.instagram.urlhandler;

import X.AnonymousClass0wJ;
import X.AnonymousClass3YR;
import X.C04220Ms;
import X.C10300i6;
import X.C14030oh;
import X.C15430rJ;
import X.C18190wL;
import android.os.Bundle;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.service.session.UserSession;

public abstract class UserSessionUrlHandlerActivity extends BaseFragmentActivity {
    public C10300i6 A00;

    public C10300i6 getSession() {
        return this.A00;
    }

    public static String A00(String str, int i) {
        String str2 = C15430rJ.A01(str).getPathSegments().get(i);
        C04220Ms.A06(str2);
        return str2;
    }

    public final void onCreate(Bundle bundle) {
        int i;
        int A002 = C14030oh.A00(1684039386);
        super.onCreate(bundle);
        Bundle A0C = AnonymousClass0wJ.A0C(this);
        if (A0C == null) {
            finish();
            i = 1186046370;
        } else {
            C10300i6 A0S = C18190wL.A0S(A0C);
            this.A00 = A0S;
            if (A0S instanceof UserSession) {
                A0I(bundle, A0C, (UserSession) A0S);
            } else {
                AnonymousClass3YR.A00(this, A0C, A0S);
                finish();
            }
            i = 1549420951;
        }
        C14030oh.A07(i, A002);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: com.instagram.urlhandlers.commerceappeals.CommerceAppealsEditMediaInfoUrlHandlerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v45, resolved type: com.instagram.urlhandlers.creatormonetizationopenaccess.CreatorMonetizationOpenAccessUrlHandlerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v67, resolved type: com.instagram.urlhandlers.commerceappeals.CommerceAppealsEditMediaInfoUrlHandlerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v68, resolved type: com.instagram.urlhandlers.commerceappeals.CommerceAppealsEditMediaInfoUrlHandlerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v69, resolved type: com.instagram.urlhandlers.commerceappeals.CommerceAppealsEditMediaInfoUrlHandlerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v70, resolved type: com.instagram.urlhandlers.commerceappeals.CommerceAppealsEditMediaInfoUrlHandlerActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v71, resolved type: com.instagram.urlhandlers.commerceappeals.CommerceAppealsEditMediaInfoUrlHandlerActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05b4, code lost:
        if (r4.length() != 0) goto L_0x05b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x07c3, code lost:
        r0.setArguments(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x07d1, code lost:
        if (r3.equals(r1) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x07d3, code lost:
        r4 = X.AnonymousClass0wJ.A0Q(r15, r0);
        r4.A0C = false;
        X.C24016D5r.A00();
        r0 = new X.C25802DsG().A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x07e5, code lost:
        r4.A03 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x0b57, code lost:
        r3 = getSupportFragmentManager();
        r3.A0v(new com.facebook.redex.IDxCListenerShape222S0200000_1_I2((androidx.fragment.app.FragmentActivity) r15, r3, 4));
        r2 = X.C63263h8.A00(r0, r4, r5);
        r2.A00 = new com.instagram.bloks.util.IDxACallbackShape10S0300000_1_I2(12, 42, r15, r0, r15);
        X.C31155GhB.A03(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x0b7a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(android.os.Bundle r24, android.os.Bundle r25, com.instagram.service.session.UserSession r26) {
        /*
            r23 = this;
            r15 = r23
            boolean r1 = r15 instanceof com.instagram.urlhandlers.userblockedlist.UserBlockedListUrlHandlerActivity
            r0 = r26
            if (r1 == 0) goto L_0x001a
            r1 = 1
            X.C04220Ms.A0B(r0, r1)
            X.36t r1 = X.C50452t1.A00()
            X.ExX r1 = r1.A00
            androidx.fragment.app.Fragment r1 = r1.BhZ(r0)
            X.C18180wK.A16(r1, r15, r0)
        L_0x0019:
            return
        L_0x001a:
            boolean r1 = r15 instanceof com.instagram.urlhandlers.security.SecurityUrlHandlerActivity
            if (r1 == 0) goto L_0x004f
            r5 = r15
            com.instagram.urlhandlers.security.SecurityUrlHandlerActivity r5 = (com.instagram.urlhandlers.security.SecurityUrlHandlerActivity) r5
            r1 = 1
            X.0TJ r3 = X.C18250wR.A0D(r0, r1)
            r1 = 36316409504205922(0x81059500040c62, double:3.02998183267875E-306)
            boolean r1 = X.C63803iN.A0E(r3, r0, r1)
            if (r1 == 0) goto L_0x0b7b
            X.0m7 r2 = r5.getSupportFragmentManager()
            X.054 r1 = r5.A00
            r2.A0v(r1)
            java.lang.String r4 = "deeplink_screen"
            java.lang.String r3 = "security_and_login"
            r2 = 0
            r1 = 2
            X.C04220Ms.A0B(r0, r1)
            X.7qT r1 = X.C18220wO.A0T(r5, r5, r0)
            X.4A9 r0 = X.C63013bK.A00(r1, r0, r4, r3, r2)
            r5.schedule(r0)
            return
        L_0x004f:
            boolean r1 = r15 instanceof com.instagram.urlhandlers.hidelikes.HideLikesUrlHandlerActivity
            if (r1 == 0) goto L_0x0073
            r1 = 1
            X.C04220Ms.A0B(r0, r1)
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = "com.instagram.portable_settings.hide_likes_and_view_counts_settings"
            X.3iE r3 = X.C63743iE.A02(r1, r2)
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.C18190wL.A0N(r0)
            r1 = 2131828321(0x7f111e61, float:1.928958E38)
            X.C18210wN.A0s(r15, r2, r1)
            X.1c8 r1 = X.C62853b1.A02(r2, r3)
            X.C18180wK.A16(r1, r15, r0)
            return
        L_0x0073:
            boolean r1 = r15 instanceof com.instagram.urlhandlers.downloadyourinformation.DownloadYourInformationUrlHandlerActivity
            if (r1 == 0) goto L_0x00a8
            r5 = r15
            com.instagram.urlhandlers.downloadyourinformation.DownloadYourInformationUrlHandlerActivity r5 = (com.instagram.urlhandlers.downloadyourinformation.DownloadYourInformationUrlHandlerActivity) r5
            r1 = 1
            X.0TJ r3 = X.C18250wR.A0D(r0, r1)
            r1 = 36316409504205922(0x81059500040c62, double:3.02998183267875E-306)
            boolean r1 = X.C63803iN.A0E(r3, r0, r1)
            if (r1 == 0) goto L_0x0b87
            X.0m7 r2 = r5.getSupportFragmentManager()
            X.054 r1 = r5.A00
            r2.A0v(r1)
            java.lang.String r4 = "deeplink_screen"
            java.lang.String r3 = "unified_dyi_home"
            r2 = 0
            r1 = 2
            X.C04220Ms.A0B(r0, r1)
            X.7qT r1 = X.C18220wO.A0T(r5, r5, r0)
            X.4A9 r0 = X.C63013bK.A00(r1, r0, r4, r3, r2)
            r5.schedule(r0)
            return
        L_0x00a8:
            boolean r1 = r15 instanceof com.instagram.urlhandlers.directthreadinternal.DirectThreadInternalUrlHandlerActivity
            r2 = r25
            if (r1 == 0) goto L_0x00c2
            r6 = 1
            int r5 = X.C18200wM.A02(r6, r0, r2)
            java.lang.String r2 = X.C18190wL.A0i(r2)
            if (r2 == 0) goto L_0x0bfb
            int r1 = r2.length()
            if (r1 <= 0) goto L_0x0bfb
            r7 = 0
            goto L_0x0b93
        L_0x00c2:
            boolean r1 = r15 instanceof com.instagram.urlhandlers.directsuggestedreplysettings.DirectSuggestedReplySettingsUriHandlerActivity
            if (r1 == 0) goto L_0x00d4
            r1 = 1
            X.C04220Ms.A0B(r0, r1)
            X.Drz r1 = new X.Drz
            r1.<init>(r15, r0)
            java.lang.NullPointerException r0 = X.C18200wM.A0d()
            throw r0
        L_0x00d4:
            boolean r1 = r15 instanceof com.instagram.urlhandlers.directpollmessage.DirectPollMessageUrlHandlerActivity
            if (r1 == 0) goto L_0x0156
            r5 = 1
            int r6 = X.C18200wM.A02(r5, r0, r2)
            java.lang.String r7 = X.C18190wL.A0i(r2)
            if (r7 != 0) goto L_0x00e5
            java.lang.String r7 = ""
        L_0x00e5:
            int r1 = r7.length()
            if (r1 == 0) goto L_0x0152
            r8 = 0
            android.net.Uri r3 = X.C15430rJ.A01(r7)
            java.lang.String r2 = r3.getScheme()
            java.lang.String r1 = "instagram"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x0152
            java.lang.String r2 = r3.getHost()
            java.lang.String r1 = "thread"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x0152
            int r2 = X.C18240wQ.A03(r3)
            r1 = 3
            if (r2 != r1) goto L_0x0152
            java.util.List r1 = r3.getPathSegments()
            java.lang.String r2 = X.C18190wL.A0p(r1, r5)
            java.lang.String r1 = "group_polls"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x0152
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r4 = com.instagram.modal.TransparentModalActivity.class
            android.os.Bundle r3 = X.C18180wK.A06()
            java.lang.String r2 = "bottom_sheet_content_fragment"
            java.lang.String r1 = "direct_poll_message_details"
            r3.putString(r2, r1)
            java.lang.String r1 = "finish_host_activity_on_dismissed"
            r3.putBoolean(r1, r5)
            java.lang.String r2 = A00(r7, r8)
            java.lang.String r1 = "poll_message_thread_key"
            r3.putString(r1, r2)
            java.lang.String r2 = A00(r7, r6)
            java.lang.String r1 = "poll_message_poll_id"
            r3.putString(r1, r2)
            java.lang.String r1 = "bottom_sheet"
            X.3iT r1 = X.C63863iT.A02(r15, r3, r0, r4, r1)
            r1.A0C = r5
            int[] r0 = com.instagram.modal.ModalActivity.A06
            r1.A0F = r0
            r1.A0I(r15)
        L_0x0152:
            r15.finish()
            return
        L_0x0156:
            boolean r1 = r15 instanceof com.instagram.urlhandlers.crossapptagging.XATTagsSettingsUrlHandlerActivity
            if (r1 == 0) goto L_0x0185
            X.AnonymousClass0wJ.A1O(r0, r2)
            java.lang.String r1 = X.C18190wL.A0i(r2)
            if (r1 == 0) goto L_0x0152
            int r1 = r1.length()
            if (r1 == 0) goto L_0x0152
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.lang.String r1 = "com.instagram.portable_settings.hide_tags_and_mentions_settings"
            X.3iE r3 = X.C63743iE.A02(r1, r2)
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.C18190wL.A0N(r0)
            r1 = 2131838142(0x7f1144be, float:1.9309499E38)
            X.C18210wN.A0s(r15, r2, r1)
            X.1c8 r1 = X.C62853b1.A02(r2, r3)
            X.C18180wK.A16(r1, r15, r0)
            return
        L_0x0185:
            boolean r1 = r15 instanceof com.instagram.urlhandlers.creatortools.CreatorToolsUrlHandlerActivity
            if (r1 == 0) goto L_0x01c3
            X.AnonymousClass0wJ.A1O(r0, r2)
            java.lang.String r1 = X.C18190wL.A0i(r2)
            if (r1 == 0) goto L_0x0152
            android.net.Uri r1 = X.C18210wN.A0A(r1)
            java.lang.String r3 = "entry_point"
            java.lang.String r2 = r1.getQueryParameter(r3)
            X.Drz r4 = X.C18180wK.A0Q(r15, r0)
            X.AnonymousClass2MG.A00()
            X.1Zw r1 = new X.1Zw
            r1.<init>()
            kotlin.Pair r0 = X.C18180wK.A0p(r3, r2)
            r3 = 0
            kotlin.Pair[] r0 = new kotlin.Pair[]{r0}
            android.os.Bundle r0 = X.C98316Fa.A00(r0)
            r1.setArguments(r0)
            r4.A03 = r1
            r4.A08()
        L_0x01bd:
            r4.A0C = r3
        L_0x01bf:
            r4.A05()
            return
        L_0x01c3:
            boolean r1 = r15 instanceof com.instagram.urlhandlers.creatorresumeonboarding.CreatorResumeOnboardingUrlHandlerActivity
            if (r1 == 0) goto L_0x01fc
            X.AnonymousClass0wJ.A1O(r0, r2)
            java.lang.String r1 = X.C18190wL.A0i(r2)
            if (r1 == 0) goto L_0x0152
            r14 = 0
            android.net.Uri r3 = X.C18210wN.A0A(r1)
            java.lang.String r1 = "product"
            java.lang.String r2 = r3.getQueryParameter(r1)
            java.lang.String r1 = "origin"
            java.lang.String r19 = r3.getQueryParameter(r1)
            java.lang.String r1 = "created_deal_id"
            java.lang.String r20 = r3.getQueryParameter(r1)
            java.lang.String r1 = "fe_id"
            java.lang.String r21 = r3.getQueryParameter(r1)
            java.lang.String r18 = "CreatorResumeOnboardingUrlHandlerActivity"
            com.instagram.api.schemas.UserMonetizationProductType r16 = X.AnonymousClass2FJ.A00(r2)
            r22 = r14
            r17 = r0
            X.C102006Tl.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0152
        L_0x01fc:
            boolean r1 = r15 instanceof com.instagram.urlhandlers.creatoronboarding.CreatorOnboardingUrlHandlerActivity
            if (r1 == 0) goto L_0x023b
            r9 = 1
            X.AnonymousClass0wJ.A1M(r0, r9, r2)
            java.lang.String r1 = X.C18190wL.A0i(r2)
            if (r1 == 0) goto L_0x0152
            r2 = 0
            android.net.Uri r5 = X.C15430rJ.A01(r1)
            java.lang.String r1 = X.C18190wL.A0n(r5)
            java.lang.String r13 = "igtv_revshare_onboarding"
            r4 = 0
            r7 = 0
            boolean r1 = X.AnonymousClass8bP.A0j(r1, r13, r7)
            if (r1 == 0) goto L_0x07e9
            java.lang.String r1 = "origin"
            java.lang.String r3 = r5.getQueryParameter(r1)
            if (r3 == 0) goto L_0x022e
            java.util.Locale r1 = java.util.Locale.US
            X.C04220Ms.A08(r1)
            java.lang.String r4 = X.C18220wO.A0u(r1, r3)
        L_0x022e:
            java.lang.String r1 = "PRO_HOME"
            boolean r1 = X.C04220Ms.A0I(r4, r1)
            if (r1 != 0) goto L_0x07e9
            r15.getSession()
            goto L_0x0152
        L_0x023b:
            boolean r1 = r15 instanceof com.instagram.urlhandlers.creatormonetizationopenaccess.CreatorMonetizationOpenAccessUrlHandlerActivity
            if (r1 == 0) goto L_0x028d
            r4 = r15
            com.instagram.urlhandlers.creatormonetizationopenaccess.CreatorMonetizationOpenAccessUrlHandlerActivity r4 = (com.instagram.urlhandlers.creatormonetizationopenaccess.CreatorMonetizationOpenAccessUrlHandlerActivity) r4
            X.AnonymousClass0wJ.A1O(r0, r2)
            java.lang.String r3 = X.C18190wL.A0i(r2)
            if (r3 == 0) goto L_0x0c1b
            X.0m7 r2 = r4.getSupportFragmentManager()
            X.054 r1 = r4.A00
            r2.A0v(r1)
            android.net.Uri r1 = X.C18210wN.A0A(r3)
            r7 = 0
            java.lang.String r6 = X.C18190wL.A0n(r1)
            java.lang.String r5 = "origin"
            java.lang.String r2 = r1.getQueryParameter(r5)
            java.lang.String r3 = "id"
            java.lang.String r1 = r1.getQueryParameter(r3)
            kotlin.Pair r2 = X.C18180wK.A0p(r5, r2)
            kotlin.Pair r1 = X.C18180wK.A0p(r3, r1)
            java.util.HashMap r2 = X.AnonymousClass4WJ.A08(r2, r1)
            java.lang.String r1 = "open_access_application_enrollment"
            boolean r1 = X.AnonymousClass8bP.A0j(r6, r1, r7)
            if (r1 == 0) goto L_0x0a97
            X.Drz r4 = X.AnonymousClass0wJ.A0Q(r4, r0)
            r4.A0C = r7
            java.lang.String r1 = "com.instagram.creator_monetization.open_access.screens.application_start"
            X.1c8 r0 = X.C62853b1.A03(r0, r1, r2)
        L_0x0289:
            r4.A03 = r0
            goto L_0x01bf
        L_0x028d:
            boolean r1 = r15 instanceof com.instagram.urlhandlers.completeyourprofile.CompleteYourProfileUrlHandlerActivity
            if (r1 == 0) goto L_0x02cf
            r5 = 1
            X.AnonymousClass0wJ.A1M(r0, r5, r2)
            X.0m7 r4 = r15.getSupportFragmentManager()
            r3 = 4
            com.facebook.redex.IDxCListenerShape426S0100000_1_I2 r1 = new com.facebook.redex.IDxCListenerShape426S0100000_1_I2
            r1.<init>(r15, r3)
            r4.A0v(r1)
            com.instagram.profile.edit.fragment.CompleteYourProfileFragment r4 = new com.instagram.profile.edit.fragment.CompleteYourProfileFragment
            r4.<init>()
            android.os.Bundle r3 = r4.mArguments
            if (r3 != 0) goto L_0x02af
            android.os.Bundle r3 = X.C18180wK.A06()
        L_0x02af:
            r3.putAll(r2)
            java.lang.String r2 = "entry_point"
            java.lang.String r1 = "professional_onboarding_checklist"
            r3.putString(r2, r1)
            r4.setArguments(r3)
            X.3Db r6 = new X.3Db
            r6.<init>()
            r10 = 0
            X.33f r1 = new X.33f
            r1.<init>(r0)
            r7 = r4
            r8 = r15
            r9 = r1
            r11 = r5
            r6.A00(r7, r8, r9, r10, r11)
            return
        L_0x02cf:
            boolean r1 = r15 instanceof com.instagram.urlhandlers.commerceappeals.CommerceAppealsEditMediaInfoUrlHandlerActivity
            if (r1 == 0) goto L_0x0325
            r4 = r15
            com.instagram.urlhandlers.commerceappeals.CommerceAppealsEditMediaInfoUrlHandlerActivity r4 = (com.instagram.urlhandlers.commerceappeals.CommerceAppealsEditMediaInfoUrlHandlerActivity) r4
            X.AnonymousClass0wJ.A1O(r0, r2)
            java.lang.String r3 = X.C18190wL.A0i(r2)
            if (r3 == 0) goto L_0x0c1b
            X.0m7 r2 = r4.getSupportFragmentManager()
            X.054 r1 = r4.A00
            r2.A0v(r1)
            android.net.Uri r2 = X.C18210wN.A0A(r3)
            java.lang.String r1 = "media_id"
            java.lang.String r5 = r2.getQueryParameter(r1)
            java.lang.String r1 = "uid"
            java.lang.String r3 = r2.getQueryParameter(r1)
            if (r5 == 0) goto L_0x0c1b
            com.instagram.user.model.User r1 = X.AnonymousClass0wJ.A0Y(r0)
            java.lang.String r2 = r1.getId()
            java.lang.String r1 = ""
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x0c1b
            boolean r1 = r2.equals(r3)
            if (r1 == 0) goto L_0x0c1b
            X.Drz r4 = X.C18180wK.A0Q(r4, r0)
            X.DnJ r0 = X.C25529DnJ.A02
            X.DZN r2 = r0.A01()
            X.Ffc r0 = X.C28991Ffc.PHOTO
            int r1 = r0.A00
            r0 = -1
            X.IcN r0 = r2.A00(r5, r1, r0, r0)
            goto L_0x0289
        L_0x0325:
            boolean r1 = r15 instanceof com.instagram.urlhandlers.channelsgatedcontent.DirectChannelsGatedContentUpsellUrlHandlerActivity
            if (r1 == 0) goto L_0x03b9
            r5 = 1
            int r4 = X.C18200wM.A02(r5, r0, r2)
            java.lang.String r7 = X.C18190wL.A0i(r2)
            if (r7 != 0) goto L_0x0336
            java.lang.String r7 = ""
        L_0x0336:
            int r1 = r7.length()
            if (r1 == 0) goto L_0x0152
            r6 = 0
            android.net.Uri r3 = X.C15430rJ.A01(r7)
            java.lang.String r2 = r3.getScheme()
            java.lang.String r1 = "instagram"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x0152
            java.lang.String r2 = r3.getHost()
            java.lang.String r1 = "thread"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x0152
            int r1 = X.C18240wQ.A03(r3)
            if (r1 != r4) goto L_0x0152
            java.util.List r1 = r3.getPathSegments()
            java.lang.String r2 = X.C18190wL.A0p(r1, r5)
            java.lang.String r1 = "show_gated_channel_content_upsell"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x0152
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r1 = 36321443207977793(0x810a2900241b41, double:3.0331651672131793E-306)
            boolean r1 = X.C63803iN.A0E(r3, r0, r1)
            if (r1 == 0) goto L_0x0152
            java.lang.String r2 = A00(r7, r6)
            X.H8D r1 = X.C60883Qx.A00(r0)
            X.C04220Ms.A06(r1)
            X.HEL r1 = X.H8D.A01(r1, r2)
            if (r1 == 0) goto L_0x0152
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r4 = com.instagram.modal.TransparentModalActivity.class
            android.os.Bundle r3 = X.C18180wK.A06()
            java.lang.String r2 = "bottom_sheet_content_fragment"
            java.lang.String r1 = "direct_channels_gated_content_upsell"
            r3.putString(r2, r1)
            java.lang.String r1 = "finish_host_activity_on_dismissed"
            r3.putBoolean(r1, r5)
            java.lang.String r2 = A00(r7, r6)
            java.lang.String r1 = "channel_thread_key"
            r3.putString(r1, r2)
            java.lang.String r1 = "bottom_sheet"
            X.3iT r1 = X.C63863iT.A02(r15, r3, r0, r4, r1)
            r1.A0C = r5
            int[] r0 = com.instagram.modal.ModalActivity.A06
            r1.A0F = r0
            r1.A0I(r15)
            goto L_0x0152
        L_0x03b9:
            boolean r1 = r15 instanceof com.instagram.urlhandlers.businessprofilecalling.BusinessProfileCallingUrlHandlerActivity
            if (r1 == 0) goto L_0x03f4
            r6 = r15
            com.instagram.urlhandlers.businessprofilecalling.BusinessProfileCallingUrlHandlerActivity r6 = (com.instagram.urlhandlers.businessprofilecalling.BusinessProfileCallingUrlHandlerActivity) r6
            X.AnonymousClass0wJ.A1O(r0, r2)
            X.0i6 r4 = r6.getSession()
            X.24p r3 = X.C311924p.EDIT_PROFILE
            java.lang.String r1 = X.C18180wK.A0e()
            java.lang.String r5 = "deep_link"
            com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger r4 = X.C37076Jk8.A01(r3, r4, r5, r1)
            com.instagram.service.session.UserSession r1 = X.C18180wK.A0V(r2)
            com.instagram.user.model.User r2 = X.AnonymousClass0wJ.A0Y(r1)
            X.Dd0 r1 = X.C62883b4.A01()
            X.DeW r3 = r1.A00()
            boolean r1 = r2.A3b()
            r2 = 0
            androidx.fragment.app.Fragment r1 = r3.A03(r4, r5, r1, r2)
            X.Drz r0 = X.C18180wK.A0Q(r6, r0)
            X.C18220wO.A1B(r1, r0, r2)
            return
        L_0x03f4:
            boolean r1 = r15 instanceof com.instagram.urlhandlers.brandedcontentad.BrandedContentAdUrlHandlerActivity
            if (r1 == 0) goto L_0x0428
            r4 = 1
            int r6 = X.C18200wM.A02(r4, r0, r2)
            java.lang.String r1 = X.C18190wL.A0i(r2)
            if (r1 == 0) goto L_0x0152
            r7 = 0
            android.net.Uri r8 = X.C15430rJ.A01(r1)
            java.lang.String r1 = "destination"
            java.lang.String r2 = r8.getQueryParameter(r1)
            java.lang.String r1 = "data"
            java.lang.String r3 = r8.getQueryParameter(r1)
            java.lang.String r5 = "entry_point"
            java.lang.String r8 = r8.getQueryParameter(r5)
            if (r8 != 0) goto L_0x041e
            java.lang.String r8 = "DEEP_LINK"
        L_0x041e:
            if (r2 == 0) goto L_0x0152
            int r1 = r2.hashCode()
            switch(r1) {
                case -1146486146: goto L_0x0ab0;
                case 441045596: goto L_0x0671;
                case 1114935692: goto L_0x0abc;
                case 1898854722: goto L_0x0af2;
                default: goto L_0x0427;
            }
        L_0x0427:
            return
        L_0x0428:
            boolean r1 = r15 instanceof com.instagram.urlhandlers.brandedcontent.BrandedContentUrlHandlerActivity
            if (r1 == 0) goto L_0x0466
            X.AnonymousClass0wJ.A1O(r0, r2)
            java.lang.String r1 = X.C18190wL.A0i(r2)
            if (r1 == 0) goto L_0x0152
            r14 = 0
            android.net.Uri r4 = X.C18210wN.A0A(r1)
            java.lang.String r3 = X.C18190wL.A0n(r4)
            java.lang.String r1 = "branded_content_deal_creator_payout"
            r2 = 0
            boolean r1 = X.AnonymousClass8bP.A0j(r3, r1, r2)
            if (r1 == 0) goto L_0x06e0
            X.0TJ r3 = X.AnonymousClass0TJ.A05
            r1 = 36317775303544823(0x8106d300000ff7, double:3.0308455696803034E-306)
            boolean r1 = X.C63803iN.A0E(r3, r0, r1)
            if (r1 == 0) goto L_0x0152
            java.lang.String r18 = "BrandedContentUrlHandlerActivity"
            com.instagram.api.schemas.UserMonetizationProductType r16 = com.instagram.api.schemas.UserMonetizationProductType.BRANDED_CONTENT_DEAL_CREATOR
            java.lang.String r19 = "SETTINGS"
            r20 = r14
            r21 = r14
            r22 = r14
            r17 = r0
            X.C102006Tl.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        L_0x0466:
            boolean r1 = r15 instanceof com.instagram.urlhandlers.bloksformflow.BloksFormFlowUrlHandlerActivity
            if (r1 == 0) goto L_0x054c
            r4 = 1
            X.AnonymousClass0wJ.A1M(r0, r4, r2)
            r3 = 0
            com.instagram.bloks.hosting.IgBloksScreenConfig r8 = X.C18190wL.A0N(r0)
            java.lang.String r9 = "com.bloks.www.bloks.form.flow.start"
            r8.A0P = r9
            android.content.Intent r5 = r15.getIntent()
            if (r5 == 0) goto L_0x0549
            java.lang.String r1 = "user_id"
            java.lang.String r5 = r5.getStringExtra(r1)
        L_0x0483:
            android.content.Intent r6 = r15.getIntent()
            if (r6 == 0) goto L_0x0546
            java.lang.String r1 = "product"
            java.lang.String r12 = r6.getStringExtra(r1)
        L_0x048f:
            android.content.Intent r6 = r15.getIntent()
            if (r6 == 0) goto L_0x0543
            java.lang.String r1 = "entrypoint"
            java.lang.String r10 = r6.getStringExtra(r1)
        L_0x049b:
            if (r5 == 0) goto L_0x04ab
            int r1 = r5.length()
            if (r1 == 0) goto L_0x04ab
            if (r12 == 0) goto L_0x04ab
            int r1 = r12.length()
            if (r1 != 0) goto L_0x04ae
        L_0x04ab:
            r15.finish()
        L_0x04ae:
            java.lang.String r1 = r0.getUserId()
            boolean r1 = X.C04220Ms.A0I(r1, r5)
            if (r1 == 0) goto L_0x04fb
            java.util.HashMap r11 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r7 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r6 = X.AnonymousClass0wJ.A0y()
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>(r4)
            java.lang.String r1 = "product"
            r11.put(r1, r12)
            r2 = 0
            r5.set(r2)
            if (r10 == 0) goto L_0x04da
            int r1 = r10.length()
            if (r1 != 0) goto L_0x04dc
        L_0x04da:
            java.lang.String r10 = "UNKNOWN"
        L_0x04dc:
            java.lang.String r1 = "entry_point"
            r11.put(r1, r10)
            int r1 = r5.nextClearBit(r2)
            if (r1 < r4) goto L_0x0c1f
            X.3iE r1 = X.C63743iE.A03(r9, r11, r7)
            r1.A03 = r3
            r1.A02 = r3
            androidx.fragment.app.Fragment r1 = X.C63743iE.A00(r15, r8, r1, r6)
            X.Drz r0 = X.C18180wK.A0Q(r15, r0)
            X.C18220wO.A1B(r1, r0, r2)
        L_0x04fa:
            return
        L_0x04fb:
            X.0BO r14 = r0.multipleAccountHelper
            java.util.List r1 = r14.A0G(r3)
            boolean r1 = X.AnonymousClass00J.A0k(r1, r5)
            if (r1 == 0) goto L_0x0c27
            com.instagram.user.model.User r3 = r14.A0E(r5)
            if (r3 == 0) goto L_0x04fa
            boolean r1 = r14.A0N(r15, r0, r3)
            if (r1 == 0) goto L_0x04fa
            java.lang.String r2 = X.C18190wL.A0i(r2)
            if (r2 == 0) goto L_0x04fa
            int r1 = r2.length()
            if (r1 == 0) goto L_0x04fa
            android.content.Intent r2 = X.C18190wL.A0B(r2)     // Catch:{ SecurityException -> 0x04fa }
            r1 = 65536(0x10000, float:9.18355E-41)
            android.content.Intent r2 = r2.setFlags(r1)     // Catch:{ SecurityException -> 0x04fa }
            X.C04220Ms.A06(r2)     // Catch:{ SecurityException -> 0x04fa }
            java.lang.String r1 = r15.getPackageName()     // Catch:{ SecurityException -> 0x04fa }
            r2.setPackage(r1)     // Catch:{ SecurityException -> 0x04fa }
            java.lang.String r19 = "deep_link"
            r18 = r3
            r17 = r0
            r16 = r2
            r14.A0H(r15, r16, r17, r18, r19)     // Catch:{ SecurityException -> 0x04fa }
            r15.finish()     // Catch:{ SecurityException -> 0x04fa }
            goto L_0x0c26
        L_0x0543:
            r10 = r3
            goto L_0x049b
        L_0x0546:
            r12 = r3
            goto L_0x048f
        L_0x0549:
            r5 = r3
            goto L_0x0483
        L_0x054c:
            boolean r1 = r15 instanceof com.instagram.urlhandlers.blokscommerceappeal.BloksCommerceAppealUrlHandlerActivity
            if (r1 == 0) goto L_0x059a
            X.AnonymousClass0wJ.A1O(r0, r2)
            java.lang.String r1 = X.C18190wL.A0i(r2)
            if (r1 == 0) goto L_0x0152
            android.net.Uri r4 = X.C18210wN.A0A(r1)
            java.lang.String r1 = "media_id"
            java.lang.String r3 = r4.getQueryParameter(r1)
            java.lang.String r7 = "action"
            java.lang.String r2 = r4.getQueryParameter(r7)
            java.lang.String r6 = "source"
            java.lang.String r5 = r4.getQueryParameter(r6)
            if (r3 == 0) goto L_0x0152
            if (r2 == 0) goto L_0x0152
            if (r5 == 0) goto L_0x0152
            r4 = 0
            java.lang.String r1 = "ig_media_id"
            kotlin.Pair r3 = X.C18180wK.A0p(r1, r3)
            kotlin.Pair r2 = X.C18180wK.A0p(r7, r2)
            kotlin.Pair r1 = X.C18180wK.A0p(r6, r5)
            kotlin.Pair[] r1 = new kotlin.Pair[]{r3, r2, r1}
            java.util.HashMap r2 = X.AnonymousClass4WJ.A09(r1)
            java.lang.String r1 = "com.bloks.www.commerce.media_untagging_appeals"
            X.1c8 r1 = X.C62853b1.A03(r0, r1, r2)
            X.Drz r0 = X.C18180wK.A0Q(r15, r0)
            X.C18220wO.A1B(r1, r0, r4)
            return
        L_0x059a:
            boolean r1 = r15 instanceof com.instagram.urlhandlers.birthdayvisibilitysettings.BirthdayVisibilitySettingsUrlHandlerActivity
            if (r1 == 0) goto L_0x05d6
            r5 = 1
            X.AnonymousClass0wJ.A1M(r0, r5, r2)
            android.content.Intent r3 = r15.getIntent()
            if (r3 == 0) goto L_0x05d4
            java.lang.String r1 = "target_user_id"
            java.lang.String r4 = r3.getStringExtra(r1)
            if (r4 == 0) goto L_0x05b6
            int r1 = r4.length()
            if (r1 != 0) goto L_0x05b9
        L_0x05b6:
            r15.finish()
        L_0x05b9:
            java.lang.String r1 = r0.getUserId()
            boolean r1 = X.C04220Ms.A0I(r1, r4)
            if (r1 == 0) goto L_0x0a58
            X.Drz r4 = X.C18180wK.A0Q(r15, r0)
            r0 = 0
            r4.A0C = r0
            X.C18190wL.A10()
            X.1x6 r0 = new X.1x6
            r0.<init>()
            goto L_0x0289
        L_0x05d4:
            r4 = 0
            goto L_0x05b6
        L_0x05d6:
            boolean r1 = r15 instanceof com.instagram.urlhandlers.birthdayeffectssettings.BirthdayEffectsSettingsUrlHandlerActivity
            if (r1 == 0) goto L_0x05fb
            r1 = 1
            X.0TJ r3 = X.C18250wR.A0D(r0, r1)
            r1 = 36328100404996378(0x8110370001291a, double:3.037375205414113E-306)
            boolean r1 = X.C63803iN.A0E(r3, r0, r1)
            if (r1 == 0) goto L_0x0152
            X.Drz r4 = X.C18180wK.A0Q(r15, r0)
            r0 = 0
            r4.A0C = r0
            X.C18190wL.A10()
            X.1Yx r0 = new X.1Yx
            r0.<init>()
            goto L_0x0289
        L_0x05fb:
            boolean r1 = r15 instanceof com.instagram.urlhandlers.birthdaycenter.BirthdayCenterUrlHandlerActivity
            if (r1 == 0) goto L_0x0620
            r1 = 1
            X.0TJ r3 = X.C18250wR.A0D(r0, r1)
            r1 = 36328100404930841(0x81103700002919, double:3.0373752053726674E-306)
            boolean r1 = X.C63803iN.A0E(r3, r0, r1)
            if (r1 == 0) goto L_0x0152
            X.Drz r4 = X.C18180wK.A0Q(r15, r0)
            r0 = 0
            r4.A0C = r0
            X.C18190wL.A10()
            X.1Yh r0 = new X.1Yh
            r0.<init>()
            goto L_0x0289
        L_0x0620:
            boolean r1 = r15 instanceof com.instagram.urlhandlers.artistselfservelinking.ArtistSelfServeLinkingHandlerActivity
            if (r1 == 0) goto L_0x0642
            r1 = 1
            X.C04220Ms.A0B(r0, r1)
            r1 = r24
            r15.onCreate(r1)
            X.Drz r4 = X.AnonymousClass0wJ.A0Q(r15, r0)
            r0 = 0
            r4.A0C = r0
            X.DaC r0 = X.C24798DaC.A01
            if (r0 == 0) goto L_0x0caa
            r0.A00()
            X.1Zy r0 = new X.1Zy
            r0.<init>()
            goto L_0x0289
        L_0x0642:
            boolean r1 = r15 instanceof com.instagram.urlhandlers.adspayments.AdsPaymentsUrlHandlerActivity
            if (r1 == 0) goto L_0x065b
            r1 = 1
            X.C04220Ms.A0B(r0, r1)
            X.Drz r4 = X.C18180wK.A0Q(r15, r0)
            r0 = 0
            r4.A0C = r0
            X.C18190wL.A10()
            X.Ipr r0 = new X.Ipr
            r0.<init>()
            goto L_0x0289
        L_0x065b:
            boolean r1 = r15 instanceof com.instagram.urlhandlers.adactivity.AdActivityUrlHandlerActivity
            if (r1 == 0) goto L_0x0c6f
            X.0i6 r0 = r15.getSession()
            X.Drz r4 = X.C18180wK.A0Q(r15, r0)
            r0 = 0
            r4.A0C = r0
            com.instagram.adshistory.fragment.RecentAdActivityFragment r0 = new com.instagram.adshistory.fragment.RecentAdActivityFragment
            r0.<init>()
            goto L_0x0289
        L_0x0671:
            java.lang.String r1 = "approve_posts_for_ads"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0019
            r3 = 0
            X.0TJ r4 = X.C18250wR.A0D(r8, r6)
            r1 = 36325252841677840(0x810da000012410, double:3.0355743949052527E-306)
            boolean r1 = X.C63803iN.A0E(r4, r0, r1)
            if (r1 == 0) goto L_0x06c1
            com.instagram.bloks.hosting.IgBloksScreenConfig r9 = X.C18190wL.A0N(r0)
            java.lang.String r6 = "com.bloks.www.ig.branded_content_ads.individual_posts"
            r9.A0P = r6
            r1 = 2131822573(0x7f1107ed, float:1.9277921E38)
            X.C18210wN.A0s(r15, r9, r1)
            java.util.HashMap r5 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r4 = X.AnonymousClass0wJ.A0y()
            java.util.HashMap r2 = X.AnonymousClass0wJ.A0y()
            java.util.BitSet r1 = new java.util.BitSet
            r1.<init>(r3)
            java.lang.String r1 = "prior_module"
            r5.put(r1, r8)
            X.3iE r1 = X.C63743iE.A03(r6, r5, r4)
            r1.A03 = r7
            r1.A02 = r7
            androidx.fragment.app.Fragment r1 = X.C63743iE.A00(r15, r9, r1, r2)
            X.Drz r4 = X.C18180wK.A0Q(r15, r0)
            r4.A03 = r1
            goto L_0x01bd
        L_0x06c1:
            X.Drz r4 = X.C18180wK.A0Q(r15, r0)
            X.C24016D5r.A00()
            android.os.Bundle r1 = X.C18180wK.A06()
            r1.putString(r5, r8)
            java.lang.String r0 = "media_id"
            r1.putString(r0, r7)
            X.1ZQ r0 = new X.1ZQ
            r0.<init>()
            r0.setArguments(r1)
            r4.A03 = r0
            goto L_0x01bd
        L_0x06e0:
            java.lang.String r1 = "branded_content_project"
            boolean r1 = X.AnonymousClass8bP.A0j(r3, r1, r2)
            if (r1 == 0) goto L_0x072c
            java.lang.String r1 = "project_id"
            java.lang.String r3 = r4.getQueryParameter(r1)
            if (r3 == 0) goto L_0x0152
            boolean r1 = X.AnonymousClass8bQ.A0n(r3)
            if (r1 != 0) goto L_0x0152
            com.instagram.bloks.hosting.IgBloksScreenConfig r6 = X.C18190wL.A0N(r0)
            java.lang.String r1 = "ent_id"
            kotlin.Pair r5 = X.C18180wK.A0p(r1, r3)
            java.lang.String r3 = "use_case"
            java.lang.String r1 = "PROJECT"
            kotlin.Pair r4 = X.C18180wK.A0p(r3, r1)
            java.lang.String r3 = "entrypoint"
            java.lang.String r1 = "PARTNERSHIP_THREAD"
            kotlin.Pair r1 = X.C18180wK.A0p(r3, r1)
            kotlin.Pair[] r1 = new kotlin.Pair[]{r5, r4, r1}
            java.util.Map r3 = X.AnonymousClass4WJ.A0H(r1)
            java.lang.String r1 = "com.bloks.www.creator_commerce.project_details"
            X.3iE r1 = X.C63743iE.A02(r1, r3)
            androidx.fragment.app.Fragment r1 = r1.A0B(r15, r6)
            X.Drz r4 = X.C18180wK.A0Q(r15, r0)
            r4.A03 = r1
            r4.A0C = r2
            goto L_0x01bf
        L_0x072c:
            java.lang.String r1 = "destination"
            java.lang.String r3 = r4.getQueryParameter(r1)
            java.lang.String r6 = "entry_point"
            java.lang.String r5 = r4.getQueryParameter(r6)
            java.lang.String r7 = ""
            if (r5 != 0) goto L_0x073d
            r5 = r7
        L_0x073d:
            java.lang.String r1 = "creator_name"
            java.lang.String r8 = r4.getQueryParameter(r1)
            if (r8 != 0) goto L_0x0746
            r8 = r7
        L_0x0746:
            java.lang.String r1 = "creator_id"
            java.lang.String r9 = r4.getQueryParameter(r1)
            if (r9 != 0) goto L_0x074f
            r9 = r7
        L_0x074f:
            java.lang.String r1 = "media_id"
            java.lang.String r1 = r4.getQueryParameter(r1)
            if (r1 == 0) goto L_0x0758
            r7 = r1
        L_0x0758:
            if (r3 == 0) goto L_0x0152
            int r1 = r3.hashCode()
            java.lang.String r4 = "entrypoint"
            switch(r1) {
                case -1711915649: goto L_0x0764;
                case -1081434779: goto L_0x078a;
                case -335082989: goto L_0x078d;
                case -92572578: goto L_0x0aff;
                case 21116443: goto L_0x07c7;
                case 100344454: goto L_0x0b12;
                case 595233003: goto L_0x0a47;
                case 1766549027: goto L_0x0b45;
                default: goto L_0x0763;
            }
        L_0x0763:
            return
        L_0x0764:
            java.lang.String r1 = "approve_content_creators"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0019
            X.Drz r4 = X.C18180wK.A0Q(r15, r0)
            r4.A0C = r2
            X.C24016D5r.A00()
            X.DsG r0 = new X.DsG
            r0.<init>()
            X.C04220Ms.A0B(r5, r2)
            android.os.Bundle r3 = X.C18180wK.A06()
            X.CV1 r0 = new X.CV1
            r0.<init>()
            r3.putString(r6, r5)
            goto L_0x07c3
        L_0x078a:
            java.lang.String r1 = "manage"
            goto L_0x07cd
        L_0x078d:
            java.lang.String r1 = "branded_content_approve_media"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0019
            X.Drz r4 = X.C18180wK.A0Q(r15, r0)
            r4.A0C = r2
            X.C24016D5r.A00()
            java.lang.String r5 = "deep_link"
            android.os.Bundle r3 = X.C18180wK.A06()
            java.lang.String r0 = "ARGUMENT_BRANDED_CONTENT_USER_ID"
            r3.putString(r0, r9)
            r2 = 31
            r1 = 8
            r0 = 30
            java.lang.String r0 = X.AnonymousClass3QD.A00(r2, r1, r0)
            r3.putString(r0, r8)
            java.lang.String r0 = "ARGUMENT_MEDIA_ID"
            r3.putString(r0, r7)
            r3.putString(r6, r5)
            X.CSP r0 = new X.CSP
            r0.<init>()
        L_0x07c3:
            r0.setArguments(r3)
            goto L_0x07e5
        L_0x07c7:
            r1 = 101(0x65, float:1.42E-43)
            java.lang.String r1 = X.C28174Ezk.A00(r1)
        L_0x07cd:
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0019
            X.Drz r4 = X.AnonymousClass0wJ.A0Q(r15, r0)
            r4.A0C = r2
            X.C24016D5r.A00()
            X.DsG r0 = new X.DsG
            r0.<init>()
            androidx.fragment.app.Fragment r0 = r0.A06()
        L_0x07e5:
            r4.A03 = r0
            goto L_0x01bf
        L_0x07e9:
            java.lang.String r6 = X.C18190wL.A0n(r5)
            java.lang.String r8 = "origin"
            java.lang.String r3 = r5.getQueryParameter(r8)
            if (r3 == 0) goto L_0x0a35
            java.util.Locale r1 = java.util.Locale.US
            X.C04220Ms.A08(r1)
            java.lang.String r4 = X.C18220wO.A0u(r1, r3)
        L_0x07fe:
            java.lang.String r1 = "id"
            java.lang.String r3 = r5.getQueryParameter(r1)
            java.lang.String r1 = "product"
            java.lang.String r14 = r5.getQueryParameter(r1)
            java.lang.String r1 = "program"
            java.lang.String r12 = r5.getQueryParameter(r1)
            java.lang.String r1 = "intent"
            r5.getQueryParameter(r1)
            java.lang.String r1 = "deal_template_id"
            java.lang.String r11 = r5.getQueryParameter(r1)
            java.lang.String r1 = "fbid_of_incentive"
            java.lang.String r10 = r5.getQueryParameter(r1)
            boolean r1 = X.AnonymousClass8bP.A0j(r6, r13, r7)
            if (r1 == 0) goto L_0x083d
            X.3Ek r1 = X.AnonymousClass2S8.A00()
            X.3Do r2 = r1.A00()
            com.instagram.api.schemas.IGRevShareProductType r1 = com.instagram.api.schemas.IGRevShareProductType.PROFILE_ADS
            androidx.fragment.app.Fragment r2 = r2.A00(r1, r4, r3)
        L_0x0835:
            X.Drz r0 = X.AnonymousClass0wJ.A0Q(r15, r0)
            X.C18230wP.A19(r2, r0)
            return
        L_0x083d:
            java.lang.String r1 = "reels_overlay_ads_onboarding"
            boolean r1 = X.AnonymousClass8bP.A0j(r6, r1, r7)
            if (r1 == 0) goto L_0x0854
            X.3Ek r1 = X.AnonymousClass2S8.A00()
            X.3Do r2 = r1.A00()
            com.instagram.api.schemas.IGRevShareProductType r1 = com.instagram.api.schemas.IGRevShareProductType.REELS_OVERLAY_ADS
            androidx.fragment.app.Fragment r2 = r2.A00(r1, r4, r3)
            goto L_0x0835
        L_0x0854:
            java.lang.String r1 = "user_pay_onboarding"
            boolean r1 = X.AnonymousClass8bP.A0j(r6, r1, r7)
            if (r1 == 0) goto L_0x0869
            X.DaE r1 = X.C24270DFm.A00()
            X.DcE r1 = r1.A00()
            androidx.fragment.app.Fragment r2 = r1.A01(r4, r3)
            goto L_0x0835
        L_0x0869:
            java.lang.String r1 = "incentive_platform_management"
            boolean r1 = X.AnonymousClass8bP.A0j(r6, r1, r7)
            if (r1 == 0) goto L_0x087a
            X.3Ve r1 = X.C122117Ki.A06()
            androidx.fragment.app.Fragment r2 = r1.A04(r0, r4, r3, r12)
            goto L_0x0835
        L_0x087a:
            java.lang.String r1 = "incentive_platform_available_bonus"
            boolean r1 = X.AnonymousClass8bP.A0j(r6, r1, r7)
            if (r1 == 0) goto L_0x08a8
            X.3Ve r1 = X.C122117Ki.A06()
            if (r11 != 0) goto L_0x08a3
            X.C04220Ms.A0B(r0, r7)
            if (r4 == 0) goto L_0x0896
            java.util.Locale r1 = java.util.Locale.US
            X.C04220Ms.A08(r1)
            java.lang.String r2 = X.C18190wL.A0r(r1, r4)
        L_0x0896:
            java.lang.String r1 = "entry_point"
            java.util.HashMap r2 = X.C63203gz.A03(r1, r2)
            java.lang.String r1 = "com.instagram.incentive_platform.screens.deal_information"
            X.1c8 r2 = X.C62853b1.A03(r0, r1, r2)
            goto L_0x0835
        L_0x08a3:
            androidx.fragment.app.Fragment r2 = r1.A02(r0, r11, r4)
            goto L_0x0835
        L_0x08a8:
            java.lang.String r1 = "incentive_platform_progress_tracking"
            boolean r1 = X.AnonymousClass8bP.A0j(r6, r1, r7)
            if (r1 == 0) goto L_0x08ba
            X.3Ve r1 = X.C122117Ki.A06()
            androidx.fragment.app.Fragment r2 = r1.A03(r0, r4, r10)
            goto L_0x0835
        L_0x08ba:
            java.lang.String r1 = "incentive_platform_xar_upsell"
            boolean r1 = X.AnonymousClass8bP.A0j(r6, r1, r7)
            if (r1 == 0) goto L_0x08d4
            X.3Ve r14 = X.C122117Ki.A06()
            X.44M r16 = X.AnonymousClass44M.A00
            java.lang.String r19 = "PRO_HOME"
            r18 = r10
            r17 = r0
            androidx.fragment.app.Fragment r2 = r14.A01(r15, r16, r17, r18, r19)
            goto L_0x0835
        L_0x08d4:
            java.lang.String r1 = "product_eligibility"
            boolean r1 = X.AnonymousClass8bP.A0j(r6, r1, r7)
            if (r1 == 0) goto L_0x08ee
            X.C24182DCb.A00()
            com.instagram.monetization.impl.MonetizationFragmentFactoryImpl r3 = new com.instagram.monetization.impl.MonetizationFragmentFactoryImpl
            r3.<init>()
            com.instagram.api.schemas.UserMonetizationProductType r1 = X.AnonymousClass2FJ.A00(r14)
            androidx.fragment.app.Fragment r2 = r3.A00(r1, r0, r2, r7)
            goto L_0x0835
        L_0x08ee:
            java.lang.String r1 = "subscriptions_management"
            boolean r1 = X.AnonymousClass8bP.A0j(r6, r1, r7)
            if (r1 == 0) goto L_0x0900
            X.3Hg r1 = X.AnonymousClass3WJ.A00()
            androidx.fragment.app.Fragment r2 = r1.A02(r4)
            goto L_0x0835
        L_0x0900:
            java.lang.String r1 = "subscriptions_guided_activation_confirmation"
            boolean r1 = X.AnonymousClass8bP.A0j(r6, r1, r7)
            if (r1 == 0) goto L_0x091f
            X.AnonymousClass3WJ.A02()
            X.C04220Ms.A0B(r4, r9)
            X.1bT r2 = new X.1bT
            r2.<init>()
            android.os.Bundle r1 = X.C18180wK.A09(r8, r4)
            X.AnonymousClass3W9.A02(r1, r0)
            r2.setArguments(r1)
            goto L_0x0835
        L_0x091f:
            java.lang.String r1 = "fan_club/subscribed_tab"
            boolean r1 = X.AnonymousClass8bP.A0j(r6, r1, r7)
            if (r1 == 0) goto L_0x09ef
            com.instagram.user.model.User r8 = X.AnonymousClass0wJ.A0Y(r0)
            X.36t r1 = X.C50452t1.A00()
            X.ExX r6 = r1.A00
            X.D1z r4 = X.C23937D1z.SUBSCRIBED
            java.lang.String r3 = r8.getId()
            r1 = 12
            com.instagram.user.recommended.FollowListData r4 = X.AnonymousClass3PT.A00(r4, r3, r1, r7)
            X.ETT r6 = (X.ETT) r6
            X.C04220Ms.A0B(r4, r9)
            android.os.Bundle r5 = X.AnonymousClass0wJ.A0E(r0)
            java.lang.String r3 = r8.BK7()
            java.lang.String r1 = "UnifiedFollowFragment.PROFILE_USER_NAME"
            r5.putString(r1, r3)
            java.lang.String r1 = "UnifiedFollowFragment.INITIAL_FOLLOW_LIST_DATA"
            r5.putParcelable(r1, r4)
            java.lang.Integer r1 = r8.A0r()
            r4 = 0
            int r3 = X.C18210wN.A03(r1)
            java.lang.String r1 = "UnifiedFollowFragment.MUTUAL_FOLLOWERS_COUNT"
            r5.putInt(r1, r3)
            java.lang.Integer r1 = r8.A0n()
            int r3 = X.C18210wN.A03(r1)
            java.lang.String r1 = "UnifiedFollowFragment.FOLLOWER_COUNT"
            r5.putInt(r1, r3)
            java.lang.Integer r1 = r8.A0o()
            int r3 = X.C18210wN.A03(r1)
            java.lang.String r1 = "UnifiedFollowFragment.FOLLOWING_COUNT"
            r5.putInt(r1, r3)
            X.MeW r7 = r8.A05
            java.lang.Integer r1 = r7.Aak()
            int r3 = X.C18210wN.A03(r1)
            java.lang.String r1 = "UnifiedFollowFragment.EXTRA_SUBSCRIBED_COUNT"
            r5.putInt(r1, r3)
            java.lang.String r1 = "UnifiedFollowFragment.EXTRA_SHOW_CREATOR_RECS"
            r5.putBoolean(r1, r9)
            X.4te r3 = r8.A0J()
            if (r3 == 0) goto L_0x09ed
            int r4 = r3.Axu()
            boolean r1 = r3.BZq()
            if (r1 == 0) goto L_0x09ed
            int r3 = r3.Axw()
        L_0x09a4:
            java.lang.String r1 = "UnifiedFollowFragment.EXTRA_ADMINS_COUNT"
            r5.putInt(r1, r4)
            java.lang.String r1 = "UnifiedFollowFragment.EXTRA_BLOCKED_COUNT"
            r5.putInt(r1, r3)
            boolean r3 = r8.A3S()
            java.lang.String r1 = "UnifiedFollowFragment.EXTRA_USER_IS_GROUP_PROFILE"
            r5.putBoolean(r1, r3)
            X.23m r3 = X.AnonymousClass2SU.A00(r0, r8)
            java.lang.String r1 = "UnifiedFollowFragment.EXTRA_LOGGING_FOLLOW_STATUS"
            r5.putSerializable(r1, r3)
            java.lang.Boolean r1 = r7.Ala()
            boolean r3 = X.C18210wN.A1T(r1)
            java.lang.String r1 = "UnifiedFollowFragment.HAS_SIMILAR_ACCOUNTS"
            r5.putBoolean(r1, r3)
            X.0TJ r1 = X.AnonymousClass0TJ.A05
            r3 = 36319604959614210(0x81087d00001502, double:3.0320026515460174E-306)
            boolean r3 = X.C63803iN.A0E(r1, r0, r3)
            java.lang.String r1 = "UnifiedFollowFragment.EXTRA_SHOW_SUBSCRIBED_TAB_IN_FOLLOWING"
            r5.putBoolean(r1, r3)
            java.lang.String r1 = "UnifiedFollowFragment.ID_TO_ALGORITHM_MAP"
            r5.putSerializable(r1, r2)
            java.lang.String r1 = "SimilarAccountsFragment.ARGUMENT_CHAINED_IDS"
            r5.putStringArrayList(r1, r2)
            androidx.fragment.app.Fragment r2 = r6.Bhm(r5)
            goto L_0x0835
        L_0x09ed:
            r3 = 0
            goto L_0x09a4
        L_0x09ef:
            java.lang.String r1 = "creator_tools_value_props"
            boolean r1 = X.AnonymousClass8bP.A0j(r6, r1, r7)
            if (r1 == 0) goto L_0x0a11
            X.AnonymousClass2MG.A00()
            X.3De r3 = new X.3De
            r3.<init>()
            java.lang.String r1 = "flow_type"
            java.lang.String r1 = r5.getQueryParameter(r1)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r1 = "pro_home"
            androidx.fragment.app.Fragment r2 = r3.A00(r2, r1)
            goto L_0x0835
        L_0x0a11:
            java.lang.String r1 = "content_appreciation_management"
            boolean r1 = X.AnonymousClass8bP.A0j(r6, r1, r7)
            if (r1 == 0) goto L_0x0152
            java.lang.String r1 = "start_onboarding"
            java.lang.String r1 = r5.getQueryParameter(r1)
            boolean r10 = java.lang.Boolean.parseBoolean(r1)
            X.6uP r1 = X.AnonymousClass2FT.A00()
            X.6nr r5 = r1.A01()
            r6 = r0
            r7 = r4
            r8 = r3
            r9 = r2
            androidx.fragment.app.Fragment r2 = r5.A00(r6, r7, r8, r9, r10)
            goto L_0x0835
        L_0x0a35:
            java.lang.String r1 = X.C18190wL.A0n(r5)
            boolean r1 = X.AnonymousClass8bP.A0j(r1, r13, r7)
            if (r1 == 0) goto L_0x0a43
            java.lang.String r4 = "EMAIL"
            goto L_0x07fe
        L_0x0a43:
            java.lang.String r4 = "PRO_HOME"
            goto L_0x07fe
        L_0x0a47:
            java.lang.String r1 = "notification"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0019
            android.os.Bundle r1 = X.C18180wK.A06()
            X.C05050Qq.A00(r1, r0)
            goto L_0x0152
        L_0x0a58:
            X.0BO r14 = r0.multipleAccountHelper
            r3 = 0
            java.util.List r1 = r14.A0G(r3)
            boolean r1 = X.AnonymousClass00J.A0k(r1, r4)
            if (r1 == 0) goto L_0x0a7f
            com.instagram.user.model.User r3 = r14.A0E(r4)
            if (r3 == 0) goto L_0x0019
            boolean r1 = r14.A0N(r15, r0, r3)
            if (r1 == 0) goto L_0x0019
            java.lang.String r2 = X.C18190wL.A0i(r2)
            if (r2 == 0) goto L_0x0019
            int r1 = r2.length()
            if (r1 == 0) goto L_0x0019
            goto L_0x0c41
        L_0x0a7f:
            boolean r1 = X.AnonymousClass2RP.A00(r0)
            if (r1 == 0) goto L_0x0a8e
            java.lang.String r1 = "IS_ADD_ACCOUNT_FLOW"
            r2.putBoolean(r1, r5)
            X.AnonymousClass3YR.A00(r15, r2, r0)
            return
        L_0x0a8e:
            r1 = 2131830299(0x7f11261b, float:1.9293591E38)
            r0 = 0
            X.C63813iO.A03(r15, r3, r1, r0)
            goto L_0x0152
        L_0x0a97:
            java.lang.String r1 = "open_access_profile_review_status"
            boolean r1 = X.AnonymousClass8bP.A0j(r6, r1, r7)
            if (r1 == 0) goto L_0x0019
            X.44L r3 = X.AnonymousClass44L.A00
            java.lang.String r1 = "com.instagram.creator_monetization.open_access.utils.open_access_monetization_status_handler"
            X.4A9 r2 = X.C63263h8.A00(r0, r1, r2)
            r1 = 13
            X.AnonymousClass4A9.A02(r2, r3, r4, r0, r1)
            X.C31155GhB.A03(r2)
            return
        L_0x0ab0:
            java.lang.String r1 = "bca_permission_request"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0019
            X.C59453Kw.A00(r15, r0, r8, r3, r4)
            return
        L_0x0abc:
            java.lang.String r0 = "copy_ad_code_xma"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0019
            if (r3 != 0) goto L_0x0ac8
            java.lang.String r3 = ""
        L_0x0ac8:
            android.content.Context r2 = r15.getApplicationContext()
            java.lang.String r0 = "clipboard"
            java.lang.Object r1 = r2.getSystemService(r0)
            boolean r0 = r1 instanceof android.content.ClipboardManager
            if (r0 == 0) goto L_0x0019
            android.content.ClipboardManager r1 = (android.content.ClipboardManager) r1
            if (r1 == 0) goto L_0x0019
            r0 = 2131832168(0x7f112d68, float:1.9297382E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0k(r2, r0)
            X.C18250wR.A0n(r1, r0, r3)
            X.3iD r1 = X.C63733iD.A00()
            r0 = 2131822530(0x7f1107c2, float:1.9277834E38)
            X.C63733iD.A07(r2, r1, r0)
            X.C63733iD.A0A(r1)
            return
        L_0x0af2:
            java.lang.String r1 = "bca_settings"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0019
            r1 = 0
            X.C59453Kw.A01(r15, r0, r8, r4, r1)
            return
        L_0x0aff:
            java.lang.String r1 = "partnerships_creator_onboarding"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0019
            kotlin.Pair r1 = X.C18180wK.A0p(r4, r5)
            java.util.Map r5 = X.AnonymousClass4WK.A0O(r1)
            java.lang.String r4 = "com.instagram.branded_content.onboarding.creator.onboarding_handler"
            goto L_0x0b57
        L_0x0b12:
            java.lang.String r1 = "inbox"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0019
            boolean r1 = X.C25771Drk.A03(r0)
            if (r1 == 0) goto L_0x0019
            boolean r1 = X.C59473Ky.A01(r0)
            if (r1 != 0) goto L_0x0b2c
            boolean r1 = X.C59473Ky.A00(r0)
            if (r1 == 0) goto L_0x0019
        L_0x0b2c:
            java.lang.String r3 = "DirectFragment.ENTRY_POINT"
            java.lang.String r1 = "branded_content"
            android.os.Bundle r4 = X.C18180wK.A09(r3, r1)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            java.lang.String r1 = "bc_partnership_inbox"
            X.3iT r0 = X.C63863iT.A04(r15, r4, r0, r3, r1)
            r0.A0G()
            r0.A07 = r2
            r0.A0I(r15)
            return
        L_0x0b45:
            java.lang.String r1 = "partnerships_brand_onboarding"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0019
            kotlin.Pair r1 = X.C18180wK.A0p(r4, r5)
            java.util.Map r5 = X.AnonymousClass4WK.A0O(r1)
            java.lang.String r4 = "com.instagram.branded_content.onboarding.brand.brand_onboarding_handler"
        L_0x0b57:
            X.0m7 r3 = r15.getSupportFragmentManager()
            r2 = 4
            com.facebook.redex.IDxCListenerShape222S0200000_1_I2 r1 = new com.facebook.redex.IDxCListenerShape222S0200000_1_I2
            r1.<init>((androidx.fragment.app.FragmentActivity) r15, (X.C12560m7) r3, (int) r2)
            r3.A0v(r1)
            X.4A9 r2 = X.C63263h8.A00(r0, r4, r5)
            r4 = 12
            r5 = 42
            com.instagram.bloks.util.IDxACallbackShape10S0300000_1_I2 r1 = new com.instagram.bloks.util.IDxACallbackShape10S0300000_1_I2
            r3 = r1
            r6 = r15
            r7 = r0
            r8 = r15
            r3.<init>(r4, r5, r6, r7, r8)
            r2.A00 = r1
            X.C31155GhB.A03(r2)
            return
        L_0x0b7b:
            X.C18190wL.A10()
            X.1wk r1 = new X.1wk
            r1.<init>()
            X.C18180wK.A16(r1, r5, r0)
            return
        L_0x0b87:
            X.C18190wL.A10()
            X.1uw r1 = new X.1uw
            r1.<init>()
            X.C18180wK.A16(r1, r5, r0)
            return
        L_0x0b93:
            android.net.Uri r3 = X.C15430rJ.A01(r2)     // Catch:{ SecurityException -> 0x0bfb }
            if (r3 == 0) goto L_0x0bfb
            java.lang.String r2 = "direct-thread"
            java.lang.String r1 = r3.getHost()
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0bfb
            java.lang.String r1 = "id"
            java.lang.String r4 = r3.getQueryParameter(r1)
            if (r4 == 0) goto L_0x0bfb
            java.lang.String r1 = "is_interop_user"
            boolean r1 = r3.getBooleanQueryParameter(r1, r7)
            X.Dnj r3 = X.AnonymousClass6VR.A00(r0)
            if (r1 == 0) goto L_0x0c03
            long r1 = java.lang.Long.parseLong(r4)
            com.instagram.user.model.User r1 = r3.A00(r1)
            if (r1 != 0) goto L_0x0c14
            X.3Y8 r3 = X.AnonymousClass3Y8.A02
            com.facebook.redex.IDxFListenerShape235S0200000_1_I2 r2 = new com.facebook.redex.IDxFListenerShape235S0200000_1_I2
            r2.<init>(r6, r0, r15)
            java.util.HashSet r1 = r3.A01
            boolean r1 = r1.add(r4)
            if (r1 == 0) goto L_0x0bfb
            com.instagram.common.api.base.IDxACallbackShape0S1300000_1_I2 r6 = new com.instagram.common.api.base.IDxACallbackShape0S1300000_1_I2
            r10 = r4
            r11 = r5
            r8 = r2
            r9 = r3
            r7 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            X.H1T r2 = X.AnonymousClass0wJ.A0P(r0)
            java.lang.String r0 = "video_call/user/"
            r2.A0J(r0)
            java.lang.String r0 = "user_fbid"
            r2.A0O(r0, r4)
            java.lang.Class<X.1So> r1 = X.C21891So.class
            java.lang.Class<X.3PI> r0 = X.AnonymousClass3PI.class
            X.H8c r1 = X.AnonymousClass0wJ.A0T(r2, r1, r0)
            r1.A00 = r6
            X.8kf r0 = r3.A00
            if (r0 == 0) goto L_0x0bff
            r0.schedule(r1)
        L_0x0bfb:
            r15.finish()
            return
        L_0x0bff:
            X.C31155GhB.A03(r1)
            goto L_0x0bfb
        L_0x0c03:
            com.instagram.user.model.User r1 = r3.A03(r4)
            if (r1 != 0) goto L_0x0c14
            X.3Y8 r2 = X.AnonymousClass3Y8.A02
            com.facebook.redex.IDxFListenerShape235S0200000_1_I2 r1 = new com.facebook.redex.IDxFListenerShape235S0200000_1_I2
            r1.<init>(r5, r0, r15)
            r2.A00(r0, r1, r4)
            goto L_0x0bfb
        L_0x0c14:
            java.lang.String r0 = "Must call setInstanceSupplier first"
            X.AnonymousClass7Ko.A0E(r7, r0)
            r0 = 0
            throw r0
        L_0x0c1b:
            r4.finish()
            return
        L_0x0c1f:
            java.lang.String r0 = "Missing Required Props"
            java.lang.IllegalStateException r0 = X.C18180wK.A0a(r0)
            throw r0
        L_0x0c26:
            return
        L_0x0c27:
            boolean r1 = X.AnonymousClass2RP.A00(r0)
            if (r1 == 0) goto L_0x0c36
            java.lang.String r1 = "IS_ADD_ACCOUNT_FLOW"
            r2.putBoolean(r1, r4)
            X.AnonymousClass3YR.A00(r15, r2, r0)
            return
        L_0x0c36:
            r1 = 2131830299(0x7f11261b, float:1.9293591E38)
            r0 = 0
            X.C63813iO.A03(r15, r3, r1, r0)
            r15.finish()
            return
        L_0x0c41:
            android.net.Uri r1 = X.C15430rJ.A01(r2)     // Catch:{ SecurityException -> 0x0c62 }
            android.content.Intent r2 = X.C62333Yi.A00(r15)     // Catch:{ SecurityException -> 0x0c62 }
            r2.setData(r1)     // Catch:{ SecurityException -> 0x0c62 }
            java.lang.String r1 = r15.getPackageName()     // Catch:{ SecurityException -> 0x0c62 }
            r2.setPackage(r1)     // Catch:{ SecurityException -> 0x0c62 }
            java.lang.String r19 = "deep_link"
            r18 = r3
            r17 = r0
            r16 = r2
            r14.A0H(r15, r16, r17, r18, r19)     // Catch:{ SecurityException -> 0x0c62 }
            r15.finish()     // Catch:{ SecurityException -> 0x0c62 }
            return
        L_0x0c62:
            X.0on r2 = X.C10770iu.A00()
            r1 = 817897458(0x30c01ff2, float:1.3978918E-9)
            java.lang.String r0 = "BirthdayVisibilitySettingsUrlHandlerActivity:onCreate: failed to switch account to another logged in user"
            X.C18250wR.A13(r2, r0, r1)
            return
        L_0x0c6f:
            r3 = r15
            com.instagram.urlhandlers.accountstatus.AccountStatusUrlHandlerActivity r3 = (com.instagram.urlhandlers.accountstatus.AccountStatusUrlHandlerActivity) r3
            X.AnonymousClass0wJ.A1O(r0, r2)
            java.lang.String r1 = X.C18190wL.A0i(r2)
            if (r1 != 0) goto L_0x0c7f
            r3.finish()
            return
        L_0x0c7f:
            android.net.Uri r2 = X.C15430rJ.A01(r1)
            java.lang.String r1 = "location"
            java.lang.String r2 = r2.getQueryParameter(r1)
            X.3RM r7 = X.AnonymousClass3RM.A00
            if (r7 == 0) goto L_0x0caa
            X.LcG r1 = X.C40309LcG.A0z
            java.lang.Enum r1 = com.facebook.graphql.enums.EnumHelper.A00(r2, r1)
            X.LcG r1 = (X.C40309LcG) r1
            X.C04220Ms.A06(r1)
            r8 = 0
            r4 = r3
            r5 = r1
            r6 = r0
            r9 = r8
            r10 = r8
            X.3ad r1 = X.AnonymousClass3RM.A00(r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.fragment.app.Fragment r1 = r1.A03()
            X.C18180wK.A16(r1, r3, r0)
            return
        L_0x0caa:
            X.C18250wR.A0k()
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.urlhandler.UserSessionUrlHandlerActivity.A0I(android.os.Bundle, android.os.Bundle, com.instagram.service.session.UserSession):void");
    }
}
