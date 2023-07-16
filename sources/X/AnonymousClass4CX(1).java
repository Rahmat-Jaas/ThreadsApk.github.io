package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.redex.IDxListenerShape793S0100000_1_I2;
import com.instagram.creation.base.ui.mediatabbar.Tab;
import com.instagram.model.creation.MediaCaptureConfig;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape76S0100000_I2_56;

/* renamed from: X.4CX  reason: invalid class name */
public final /* synthetic */ class AnonymousClass4CX implements C82584pw {
    public final /* synthetic */ AnonymousClass4Aj A00;
    public final /* synthetic */ Tab A01;

    public /* synthetic */ AnonymousClass4CX(AnonymousClass4Aj r1, Tab tab) {
        this.A00 = r1;
        this.A01 = tab;
    }

    public final void BrW() {
        AnonymousClass4Aj r6 = this.A00;
        Tab tab = this.A01;
        UserSession userSession = r6.A09;
        Fragment fragment = r6.A05;
        C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01((C11630kW) fragment, userSession), "profile_pic_library"), 2517).Bb4();
        C684643x r2 = r6.A08;
        if (r2 != null) {
            r2.A00(r6.A07, AnonymousClass006.A0N);
        }
        AnonymousClass01V.A0p.markerStart(18297178);
        AnonymousClass49I A002 = C35832Oz.A00(userSession);
        UserSession userSession2 = A002.A01;
        AnonymousClass0TJ r3 = AnonymousClass0TJ.A05;
        if (C63803iN.A0E(r3, userSession2, 2342157812399868061L) && (!AnonymousClass49I.A00(A002, true))) {
            AnonymousClass3HB r8 = new AnonymousClass3HB();
            C67463zb r7 = r8.A02.A00;
            r7.A03("ig_profile_photo_change", true);
            ArrayList arrayList = r8.A00;
            arrayList.add("IG_PROFILE_PHOTO_CHANGE_UPSELL");
            r7.A03("ig_profile_photo_completeness", true);
            arrayList.add("IG_PROFILE_PHOTO_CHANGE_IS_COMPLETENESS_UPSELL");
            AnonymousClass0TJ r22 = AnonymousClass0TJ.A06;
            if (!C63803iN.A0E(r22, userSession2, 36317405936356974L) && C63803iN.A0E(r22, userSession2, 36317405936553585L)) {
                r8.A01();
                if (!C63803iN.A0E(r22, userSession2, 2342160415150116463L)) {
                    r7.A03("impression_limit_check_enabled", C18180wK.A0X());
                }
                if (!C63803iN.A0E(r22, userSession2, 2342160415150182000L)) {
                    r7.A03("recently_seen_check_enabled", C18180wK.A0X());
                }
            }
            r8.A00().A00(new IDxListenerShape793S0100000_1_I2(A002, 1), userSession2);
        }
        Context context = fragment.getContext();
        if (context != null) {
            C04220Ms.A0B(userSession, 0);
            Class<C695749d> cls = C695749d.class;
            C695749d r72 = (C695749d) userSession.A01(cls, new KtLambdaShape76S0100000_I2_56(userSession, 1));
            UserSession userSession3 = r72.A01;
            if (!C63803iN.A0E(AnonymousClass0TJ.A06, userSession3, 36320524082747428L) && !C695749d.A00(r72) && !C35692Ol.A00(userSession3).A05(CallerContext.A00(cls), "ig_android_linking_cache_fx_ac_eligibility_linkage_check")) {
                boolean A0E = C63803iN.A0E(r3, userSession3, 36321546285882266L);
                if (A0E) {
                    C35662Oi.A00(userSession3).A03.clear();
                    C35662Oi.A00(userSession3).A03(context, userSession3, "IG_PROFILE_PHOTO_CHANGE_CHAINING", A0E);
                } else {
                    new C67063yo(userSession3).A00(context, new AnonymousClass4CT(r72), "IG_PROFILE_PHOTO_CHANGE_CHAINING");
                }
            }
        }
        if (C63803iN.A0E(r3, userSession, 36316972144659904L)) {
            AnonymousClass4Aj.A0B = C318629g.EDIT_PROFILE_PICTURE;
            AnonymousClass29S r11 = AnonymousClass29S.PROFILE_PICTURE_BOTTOM_SHEET_ITEM_CLICKED;
            AnonymousClass296 r12 = AnonymousClass4Aj.A0A;
            AnonymousClass2A6 r14 = AnonymousClass2A6.A06;
            Long.parseLong(userSession.getUserId());
            String str = null;
            C35712On.A00(r11, r12, AnonymousClass4Aj.A0B, r14, userSession, (String) null, (Map) null);
            AnonymousClass39J r0 = AnonymousClass39J.A02;
            C26131q6 r23 = new C26131q6(fragment, (C10300i6) userSession);
            r0.A00 = r23;
            AnonymousClass296 r02 = AnonymousClass4Aj.A0A;
            if (r02 != null) {
                str = C18240wQ.A0g(r02.toString());
            }
            r23.A04("PHOTO_MEDIA_PREVIEW_PICKER", str, C18240wQ.A0g(AnonymousClass4Aj.A0B.toString()));
            AnonymousClass4Aj.A00();
        } else {
            Tab tab2 = GQE.A00;
            AnonymousClass4Aj.A0B = C318629g.CHOOSE_FROM_LIBRARY;
            C84584tU r4 = r6.A02;
            C28923FeI feI = C28923FeI.PROFILE_PHOTO;
            C25818DsX dsX = new C25818DsX(feI);
            dsX.A05 = false;
            MediaCaptureConfig mediaCaptureConfig = new MediaCaptureConfig(dsX);
            C170769vX r03 = C170769vX.PROFILE;
            if (tab == tab2) {
                r4.Cvr(r03, mediaCaptureConfig, feI);
            } else {
                r4.Cv0(r03, mediaCaptureConfig, feI);
            }
        }
        if (C63713iA.A01) {
            C63713iA.A09(userSession, true);
            C63713iA.A01 = false;
        }
    }
}
