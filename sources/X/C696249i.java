package X;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewConfiguration;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S5200000_I2;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.redex.IDxCListenerShape278S0200000_1_I2;
import com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceBottomSheetQueryResponseImpl;
import com.instagram.crossposting.feed.graphql.FBToIGDefaultAudienceSettingQueryResponseImpl;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.service.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.49i  reason: invalid class name and case insensitive filesystem */
public final class C696249i implements AnonymousClass0i4, CallerContextable {
    public static final CallerContext A06 = CallerContext.A00(C696249i.class);
    public static final C63073bQ A07 = new C63073bQ();
    public static final String __redex_internal_original_name = "FeedCrosspostingAudienceSettingManager";
    public int A00;
    public KtCSuperShape0S5200000_I2 A01;
    public PendingMedia A02;
    public boolean A03;
    public C209416t A04;
    public final UserSession A05;

    public C696249i(UserSession userSession) {
        C04220Ms.A0B(userSession, 1);
        this.A05 = userSession;
    }

    public static final boolean A00(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        if (!C63073bQ.A03(userSession) || !C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36318771736023803L)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(UserSession userSession) {
        C04220Ms.A0B(userSession, 0);
        long currentTimeMillis = System.currentTimeMillis();
        int i = C28161tl.A04(userSession).getInt("fb_feed_crossposting_default_privacy_consent_times_shown", 0);
        long A052 = C18180wK.A05(C28161tl.A04(userSession), "fb_feed_crossposting_default_privacy_consent_time_stamp_ms");
        AnonymousClass0TJ r3 = AnonymousClass0TJ.A06;
        if (((long) i) < C63803iN.A03(r3, userSession, 36601603922398934L) || currentTimeMillis - A052 > TimeUnit.DAYS.toMillis(C63803iN.A03(r3, userSession, 36601603922464471L))) {
            return true;
        }
        return false;
    }

    public final synchronized KtCSuperShape0S5200000_I2 A03() {
        return this.A01;
    }

    public final synchronized C209416t A04() {
        return this.A04;
    }

    public final synchronized void A08(Activity activity, Context context, String str) {
        AnonymousClass0wJ.A1N(activity, context);
        AnonymousClass2MI.A00(new C69894Ax(activity, context, this, str), this.A05);
    }

    public final void A0A(Context context, FragmentActivity fragmentActivity, C84164se r13, UserSession userSession, String str) {
        C18180wK.A1Q(str, 2, userSession);
        AnonymousClass1ak A002 = AnonymousClass2MH.A00(str);
        C84164se r6 = r13;
        A002.A01 = new IDxCListenerShape278S0200000_1_I2(1, r13, this);
        C37032Jj9 A0Y = C18200wM.A0Y(userSession, false);
        Context context2 = context;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        A0Y.A0J = new C71974Lm(context2, fragmentActivity2, r6, this, userSession, str);
        A0Y.A08 = ViewConfiguration.get(fragmentActivity).getScaledPagingTouchSlop();
        C18200wM.A16(fragmentActivity, A002, A0Y);
    }

    public final synchronized void A0B(C209416t r2) {
        this.A04 = r2;
    }

    public final synchronized void A0C(String str) {
        C209416t r0 = this.A04;
        if (r0 == null || !r0.A00) {
            AnonymousClass2MI.A00(new C69884Aw(this, str), this.A05);
        }
    }

    public final synchronized boolean A0F() {
        boolean z;
        C209416t r0 = this.A04;
        z = true;
        if (r0 == null || !r0.A00) {
            z = false;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        if (A0E() == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean A0G(com.instagram.service.session.UserSession r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            X.C04220Ms.A0B(r3, r0)     // Catch:{ all -> 0x001b }
            boolean r0 = X.C63073bQ.A03(r3)     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0018
            boolean r0 = r2.A0F()     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0018
            boolean r1 = r2.A0E()     // Catch:{ all -> 0x001b }
            r0 = 1
            if (r1 != 0) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            monitor-exit(r2)
            return r0
        L_0x001b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C696249i.A0G(com.instagram.service.session.UserSession):boolean");
    }

    static {
        TimeUnit.DAYS.toMillis(14);
    }

    public final void A05() {
        UserSession userSession = this.A05;
        if (C63073bQ.A03(userSession)) {
            C59693Lv.A00(C320129v.FETCH_SETTING_ATTEMPT, userSession);
            H1T A0P = C18180wK.A0P(userSession);
            C18220wO.A1K(A0P, "ig_fb_xposting/fb_feed/privacy_setting/check/");
            C32165H8c A0T = AnonymousClass0wJ.A0T(A0P, AnonymousClass1S7.class, C59703Lw.class);
            C63873iU.A0E(A0T, this, 49);
            C31155GhB.A05(A0T, 691, 3, true, true);
        }
    }

    public final synchronized void A06() {
        synchronized (this) {
            UserSession userSession = this.A05;
            AnonymousClass349 r2 = new AnonymousClass349(this);
            C31580Grx A012 = AnonymousClass3WK.A01(userSession);
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C63233h2.A01(), "FBToIGDefaultAudienceSettingQuery", GraphQlCallInput.A00().A07(), GraphQlCallInput.A00().A07(), FBToIGDefaultAudienceSettingQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xcxp_get_feed_crossposting_default_audience_status");
            AnonymousClass0TJ r9 = AnonymousClass0TJ.A05;
            C18250wR.A12(pandoGraphQLRequest.setFreshCacheAgeMs(C63803iN.A03(r9, userSession, 36607393538445995L) * StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS).setMaxToleratedCacheAgeMs(C63803iN.A03(r9, userSession, 36607393538249384L) * StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS), A012, r2, 5);
        }
    }

    public final synchronized void A07() {
        synchronized (this) {
            UserSession userSession = this.A05;
            AnonymousClass34A r2 = new AnonymousClass34A(this);
            C31580Grx A012 = AnonymousClass3WK.A01(userSession);
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C63233h2.A01(), "FBToIGDefaultAudienceBottomSheetQuery", GraphQlCallInput.A00().A07(), GraphQlCallInput.A00().A07(), FBToIGDefaultAudienceBottomSheetQueryResponseImpl.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xcxp_get_feed_crossposting_audience_consent_content");
            AnonymousClass0TJ r9 = AnonymousClass0TJ.A05;
            C18250wR.A12(pandoGraphQLRequest.setFreshCacheAgeMs(C63803iN.A03(r9, userSession, 36607393538380458L) * StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS).setMaxToleratedCacheAgeMs(C63803iN.A03(r9, userSession, 36607393538314921L) * StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS), A012, r2, 6);
        }
    }

    public final void A09(Context context, int i, int i2) {
        String str;
        C320129v r0 = C320129v.UPDATE_SETTING_ATTEMPT;
        UserSession userSession = this.A05;
        C59693Lv.A00(r0, userSession);
        PendingMedia pendingMedia = this.A02;
        if (pendingMedia != null) {
            str = pendingMedia.A3C;
        } else {
            str = null;
        }
        String str2 = str;
        if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36323921401749675L)) {
            str2 = null;
        }
        H1T A0P = C18180wK.A0P(userSession);
        A0P.A0J("ig_fb_xposting/fb_feed/privacy_setting/update/");
        C18250wR.A16(A0P);
        C18240wQ.A18(A0P);
        int i3 = i;
        A0P.A0K("privacy", i);
        if (str2 != null) {
            A0P.A0O("upload_id", str2);
        }
        C32165H8c A022 = A0P.A02();
        A022.A00 = new C24401id(context, this, str, i2, i3);
        C31155GhB.A05(A022, 692, 3, true, true);
    }

    public final boolean A0D() {
        UserSession userSession = this.A05;
        AnonymousClass0TJ r2 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r2, userSession, 36320588507125840L) || !C63803iN.A0E(r2, userSession, 36320128945624801L)) {
            return false;
        }
        return true;
    }

    public final boolean A0E() {
        return C63803iN.A0E(AnonymousClass0TJ.A05, this.A05, 36320588507125840L);
    }

    public final void onSessionWillEnd() {
        this.A05.A03(C696249i.class);
    }

    public final SpannableStringBuilder A02(Context context, FragmentActivity fragmentActivity, C84164se r12, String str) {
        String A0k = AnonymousClass0wJ.A0k(context, 2131820810);
        String A0l = AnonymousClass0wJ.A0l(context, A0k, 2131835768);
        C04220Ms.A06(A0l);
        FragmentActivity fragmentActivity2 = fragmentActivity;
        C84164se r5 = r12;
        C29451y9 r2 = new C29451y9(context, fragmentActivity2, r5, this, str, C18210wN.A01(context));
        SpannableStringBuilder A0E = C18200wM.A0E(A0l);
        AnonymousClass3Zw.A00(A0E, r2, A0k);
        return A0E;
    }
}
