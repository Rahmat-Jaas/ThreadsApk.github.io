package X;

import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4100000_I2;
import com.facebook.pando.TreeJNI;
import com.instagram.graphql.instagramschemagraphservices.CustomServiceDataObjectImpl;
import com.instagram.service.session.UserSession;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.KtLambdaShape75S0100000_I2_55;

/* renamed from: X.49c  reason: invalid class name and case insensitive filesystem */
public final class C695649c implements AnonymousClass0i4, CallerContextable {
    public static final String __redex_internal_original_name = "CrosspostingSettingManager";
    public final CallerContext A00;
    public final AnonymousClass49H A01;
    public final UserSession A02;
    public final C86074wE A03;
    public final C86094wG A04;
    public final KtCSuperShape0S4100000_I2 A05;

    public final void A04(C83804s1 r10, String str, String str2) {
        Object value;
        C04220Ms.A0B(str, 0);
        UserSession userSession = this.A02;
        if (C67373zR.A0E(userSession)) {
            C29681z6 A002 = C35692Ol.A00(userSession);
            CallerContext callerContext = this.A00;
            if (A002.A05(callerContext, "ig_android_linking_cache_ig_to_fb_crossposting_destination_picker") || str == "bloks") {
                USLEBaseShape0S0000000 A0P = C18200wM.A0P(userSession);
                C18180wK.A1E(A0P, userSession, "server_fetch_attempt", str, false);
                A0P.Bb4();
                AnonymousClass49H r2 = this.A01;
                List A0n = C18180wK.A0n("CROSS_POSTING_SETTING");
                AnonymousClass4NU r5 = new AnonymousClass4NU(r10, this, str, str2);
                Pair A0p = C18180wK.A0p("CROSSPOSTING_DESTINATION_APP", "FB");
                if (str2 == null) {
                    str2 = "";
                }
                r2.A00.A03(callerContext, r5, "ig_android_service_cache_crossposting_setting", A0n, AnonymousClass4WJ.A0G(A0p, C18180wK.A0p("CROSSPOSTING_SHARE_TO_SURFACE", str2)));
                return;
            }
        }
        if (str2 == null || str2.equals("REELS")) {
            C86074wE r22 = this.A03;
            do {
                value = r22.getValue();
                ((Number) value).longValue();
            } while (!r22.ADi(value, C18210wN.A0V()));
        }
    }

    public final int A00() {
        TreeJNI reinterpret;
        TreeJNI treeValue;
        TreeJNI treeJNI = (TreeJNI) this.A01.A00(this.A00, C18180wK.A0n("CROSS_POSTING_SETTING")).get("CROSS_POSTING_SETTING");
        if (treeJNI == null || !treeJNI.isFulfilled("CrossPostingCustomClientServiceData") || (reinterpret = treeJNI.reinterpret(CustomServiceDataObjectImpl.InlineCrossPostingCustomClientServiceData.class)) == null || (treeValue = reinterpret.getTreeValue("fb_feed_privacy_setting_service_data", CustomServiceDataObjectImpl.InlineCrossPostingCustomClientServiceData.FbFeedPrivacySettingServiceData.class)) == null) {
            return 0;
        }
        return treeValue.getIntValue("feed_privacy_type");
    }

    public final CustomServiceDataObjectImpl.InlineCrossPostingCustomClientServiceData.DestinationMetadataServiceData A01() {
        TreeJNI reinterpret;
        TreeJNI treeJNI = (TreeJNI) this.A01.A00(this.A00, C18180wK.A0n("CROSS_POSTING_SETTING")).get("CROSS_POSTING_SETTING");
        if (treeJNI == null || !treeJNI.isFulfilled("CrossPostingCustomClientServiceData") || (reinterpret = treeJNI.reinterpret(CustomServiceDataObjectImpl.InlineCrossPostingCustomClientServiceData.class)) == null) {
            return null;
        }
        return (CustomServiceDataObjectImpl.InlineCrossPostingCustomClientServiceData.DestinationMetadataServiceData) reinterpret.getTreeValue("destination_metadata_service_data", CustomServiceDataObjectImpl.InlineCrossPostingCustomClientServiceData.DestinationMetadataServiceData.class);
    }

    public final AnonymousClass3VW A02() {
        Object obj;
        Iterable iterable = (Iterable) this.A01.A00.A00(this.A00, "ig_android_service_cache_crossposting_setting", C18180wK.A0n("CROSS_POSTING_SETTING")).get("CROSS_POSTING_SETTING");
        if (iterable == null) {
            return null;
        }
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C04220Ms.A0I(((AnonymousClass3VT) obj).A00, C06810aP.A01.A01(this.A02).A14())) {
                break;
            }
        }
        AnonymousClass3VT r4 = (AnonymousClass3VT) obj;
        if (r4 != null) {
            return (AnonymousClass3VW) AnonymousClass00J.A0C(r4.A01);
        }
        return null;
    }

    public final void A03() {
        UserSession userSession = this.A02;
        C04220Ms.A0B(userSession, 0);
        if (AnonymousClass0wJ.A0Y(userSession).A0g() == AnonymousClass266.A04 && C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36324222049460606L)) {
            AnonymousClass3LA.A01(userSession).AML(this.A05, AnonymousClass42T.A00, (C82234pI) null);
        }
    }

    public final void onSessionWillEnd() {
        this.A02.A03(C695649c.class);
    }

    public C695649c(UserSession userSession) {
        this.A02 = userSession;
        CallerContext A012 = CallerContext.A01(__redex_internal_original_name);
        this.A00 = A012;
        C04220Ms.A0B(userSession, 0);
        this.A01 = (AnonymousClass49H) userSession.A01(AnonymousClass49H.class, new KtLambdaShape75S0100000_I2_55(userSession, 37));
        this.A05 = new KtCSuperShape0S4100000_I2(A012, "ig_android_ig_to_fb_crossposting", "ig_android_ig_to_fb_crossposting", "crossposting", "loading");
        C27457Enn A0z = C18190wL.A0z(C18210wN.A0V());
        this.A03 = A0z;
        this.A04 = A0z;
    }
}
