package kotlin.jvm.internal;

import X.AnonymousClass00J;
import X.AnonymousClass01V;
import X.AnonymousClass0IB;
import X.AnonymousClass0TJ;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass1cz;
import X.AnonymousClass1d2;
import X.AnonymousClass23Q;
import X.AnonymousClass2S6;
import X.AnonymousClass32W;
import X.AnonymousClass39U;
import X.AnonymousClass3F2;
import X.AnonymousClass3HS;
import X.AnonymousClass3RE;
import X.AnonymousClass3RF;
import X.AnonymousClass3RG;
import X.AnonymousClass3TF;
import X.AnonymousClass44Y;
import X.AnonymousClass49C;
import X.AnonymousClass4WJ;
import X.AnonymousClass4WL;
import X.AnonymousClass69F;
import X.AnonymousClass8AP;
import X.AnonymousClass8bP;
import X.C02220Ah;
import X.C04220Ms;
import X.C04530Oa;
import X.C08400dJ;
import X.C10300i6;
import X.C10450iM;
import X.C10600ic;
import X.C156399Nk;
import X.C171199wE;
import X.C18180wK;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C18240wQ;
import X.C18467Afy;
import X.C19430zr;
import X.C19513Axa;
import X.C31841Gx6;
import X.C36632Sb;
import X.C36812St;
import X.C40337Lct;
import X.C50102sS;
import X.C559535f;
import X.C560335n;
import X.C561235w;
import X.C567638l;
import X.C568638v;
import X.C568738w;
import X.C57273Ak;
import X.C57283Al;
import X.C57663Bz;
import X.C61013Rm;
import X.C63803iN;
import X.C66553xn;
import X.C66563xo;
import X.C677340e;
import X.C695048u;
import X.C70764Ga;
import X.C81074n3;
import X.C963064g;
import X.M5W;
import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quickpromotion.sdk.QPSdkModule;
import com.facebook.redex.IDxPProviderShape655S0100000_3_I2;
import com.google.common.collect.CompactHashMap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSetMultimap;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler;
import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import com.instagram.quickpromotion.intf.Trigger;
import com.instagram.quickpromotion.sdk.IGOnDemandFetcher;
import com.instagram.quickpromotion.sdk.InstagramQpSdkModule;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.reels.bottomsheet.translation.TranslationAttributionSheetFragment;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

public class KtLambdaShape95S0100000_I2_75 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape95S0100000_I2_75(Object obj, int i) {
        super(0);
        this.A01 = i;
        this.A00 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        String string;
        ImmutableSetMultimap immutableSetMultimap;
        switch (this.A01) {
            case 0:
            case 32:
            case Rfc3492Idn.skew /*38*/:
                return this.A00;
            case 2:
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                return C18180wK.A0H((C04530Oa) this.A00);
            case 3:
                AnonymousClass1d2 r5 = (AnonymousClass1d2) this.A00;
                Bundle requireArguments = r5.requireArguments();
                String string2 = requireArguments.getString("ProfileTabbedExplorerFragment.USER_ID");
                if (string2 != null) {
                    String string3 = requireArguments.getString("ProfileTabbedExplorerFragment.SELECTED_TAB_TYPE");
                    if (string3 != null) {
                        return new C66553xn(AnonymousClass23Q.valueOf(string3), AnonymousClass0wJ.A0X(r5.A02), string2, requireArguments.getBoolean("ProfileTabbedExplorerFragment.ONLY_SHOW_SELECTED_TAB", false));
                    }
                    throw C18180wK.A0a("Required value was null.");
                }
                throw C18180wK.A0a("Required value was null.");
            case 4:
                return ((C561235w) this.A00).A00.invoke();
            case 5:
                return new C695048u((UserSession) this.A00);
            case 6:
                return new C559535f((UserSession) this.A00);
            case 7:
                return new C31841Gx6((UserSession) this.A00);
            case 8:
                return new AnonymousClass44Y((UserSession) this.A00);
            case 9:
                return new C70764Ga((UserSession) this.A00);
            case 10:
                return new C08400dJ(PreferenceManager.getDefaultSharedPreferences(((IGDevToolPersistentStateHandler) this.A00).A00));
            case 11:
                return ((C567638l) this.A00).A01.invoke();
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                ImmutableList.Builder builder = ImmutableList.builder();
                KtCSuperShape0S2100000_I2 ktCSuperShape0S2100000_I2 = ((C677340e) this.A00).A00;
                C36812St.A00((C963064g) ktCSuperShape0S2100000_I2.A00, ktCSuperShape0S2100000_I2.A02, new KtLambdaShape169S0100000_I2_2(builder, 28));
                return builder.build();
            case 13:
                C10300i6 r52 = (C10300i6) this.A00;
                ArrayList A0k = C18240wQ.A0k(r4);
                boolean z = false;
                for (QuickPromotionSurface quickPromotionSurface : QuickPromotionSurface.values()) {
                    A0k.add(String.valueOf(quickPromotionSurface.A00));
                }
                ImmutableSet A02 = ImmutableSet.A02(A0k);
                if (r52 != null) {
                    r52.A01(InstagramQpSdkModule.class, new KtLambdaShape95S0100000_I2_75(r52, 14));
                    z = C63803iN.A0E(AnonymousClass0TJ.A05, r52, 36313085200958785L);
                }
                Context context = C10600ic.A00;
                C04220Ms.A06(context);
                AnonymousClass0IB A002 = C10450iM.A00();
                C04220Ms.A06(A002);
                IGOnDemandFetcher iGOnDemandFetcher = new IGOnDemandFetcher(context, A002, InstagramQpSdkModule.A06, z);
                AnonymousClass39U r4 = new AnonymousClass39U(new C560335n(z), new IDxRImplShape182S0000000_2_I2(AnonymousClass3RF.A00, 11));
                AnonymousClass32W r1 = new AnonymousClass32W(C18230wP.A07());
                AnonymousClass0IB A003 = C10450iM.A00();
                C04220Ms.A06(A003);
                C57663Bz r2 = new C57663Bz(A003, r1, r4, iGOnDemandFetcher);
                AnonymousClass3RG r12 = AnonymousClass3RG.A00;
                C04220Ms.A06(A02);
                return new QPSdkModule(r2, A02, AnonymousClass3RE.A00, r12);
            case 14:
                return new InstagramQpSdkModule((UserSession) this.A00);
            case 15:
                return ((InstagramQpSdkModule) this.A00).A04.invoke();
            case 16:
                AnonymousClass3TF r0 = (AnonymousClass3TF) this.A00;
                return AnonymousClass3TF.A00(r0.A01, AnonymousClass4WL.A00(r0.A03, r0.A02));
            case LangUtils.HASH_SEED /*17*/:
                AnonymousClass3TF r22 = (AnonymousClass3TF) this.A00;
                if (r22.A05) {
                    CompactHashMap compactHashMap = new CompactHashMap();
                    for (Iterable<C40337Lct> it : M5W.A01.values()) {
                        for (C40337Lct lct : it) {
                            QuickPromotionSurface quickPromotionSurface2 = lct.A00;
                            C04220Ms.A06(quickPromotionSurface2);
                            EnumSet enumSet = lct.A01;
                            C04220Ms.A06(enumSet);
                            C61013Rm.A00(enumSet, quickPromotionSurface2, compactHashMap);
                        }
                    }
                    immutableSetMultimap = ImmutableSetMultimap.A00(compactHashMap.entrySet());
                } else {
                    immutableSetMultimap = AnonymousClass3TF.A00(r22.A01, r22.A03);
                }
                ImmutableMap immutableMap = immutableSetMultimap.A01;
                C04220Ms.A06(immutableMap);
                ArrayList A0w = C18220wO.A0w(immutableMap);
                Iterator it2 = immutableMap.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry A0o = C18180wK.A0o(it2);
                    String valueOf = String.valueOf(((QuickPromotionSurface) A0o.getKey()).A00);
                    Object value = A0o.getValue();
                    C04220Ms.A06(value);
                    A0w.add(C18180wK.A0p(valueOf, AnonymousClass00J.A0c((Iterable) value)));
                }
                return AnonymousClass4WJ.A0B(A0w);
            case 18:
                return new AnonymousClass49C((UserSession) this.A00);
            case 19:
                List A06 = C81074n3.A06(C63803iN.A0C(AnonymousClass0TJ.A05, ((AnonymousClass3F2) this.A00).A00.A00, 36886497693073846L));
                ArrayList A0v = AnonymousClass0wJ.A0v();
                Iterator it3 = A06.iterator();
                while (it3.hasNext()) {
                    Trigger A004 = C36632Sb.A00(AnonymousClass8bP.A0L(C18180wK.A0k(it3)).toString());
                    if (A004 != null) {
                        A0v.add(A004);
                    }
                }
                Set A0c = AnonymousClass00J.A0c(A0v);
                if (A0c.isEmpty()) {
                    return AnonymousClass8AP.A0C(Trigger.values());
                }
                return A0c;
            case 20:
                return AnonymousClass01V.A0p;
            case 21:
                return C63803iN.A05(AnonymousClass0TJ.A05, (C10300i6) this.A00, 36324217757507965L);
            case 22:
                return C63803iN.A05(AnonymousClass0TJ.A05, (C10300i6) this.A00, 2342167226969563498L);
            case 23:
                return AnonymousClass2S6.A00((UserSession) this.A00);
            case 24:
                return new IDxPProviderShape655S0100000_3_I2((UserSession) this.A00, 5);
            case 25:
                return new IDxPProviderShape655S0100000_3_I2((UserSession) this.A00, 4);
            case 33:
                return new C568638v((UserSession) this.A00);
            case 34:
                return new C18467Afy((UserSession) this.A00);
            case 35:
                return new C57273Ak((UserSession) this.A00);
            case Rfc3492Idn.base /*36*/:
                return new C57283Al((UserSession) this.A00);
            case LangUtils.HASH_OFFSET /*37*/:
                AnonymousClass1cz r53 = (AnonymousClass1cz) this.A00;
                UserSession A0X = AnonymousClass0wJ.A0X(r53.A03);
                Bundle bundle = r53.mArguments;
                Object obj = null;
                if (bundle != null) {
                    obj = bundle.get("broadcaster");
                }
                if (obj != null) {
                    User user = (User) obj;
                    Bundle bundle2 = r53.mArguments;
                    if (bundle2 == null || (string = bundle2.getString(TraceFieldType.BroadcastId)) == null) {
                        throw C18180wK.A0a("Required value was null.");
                    }
                    AnonymousClass3HS r02 = r53.A01;
                    if (r02 != null) {
                        return new C66563xo(A0X, user, r02, string);
                    }
                    C04220Ms.A0E("notificationsRowController");
                    throw null;
                }
                throw C18180wK.A0a("Required value was null.");
            case Seq.NULL_REFNUM /*41*/:
                ((C19430zr) this.A00).A00.CrC(C18180wK.A0Y());
                return Unit.A00;
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return C50102sS.A00(AnonymousClass0wJ.A0X(((C156399Nk) this.A00).A0C));
            case 43:
                C19513Axa axa = C19513Axa.A00;
                C156399Nk r13 = (C156399Nk) this.A00;
                return axa.A0G(r13.requireActivity(), C171199wE.PRODUCT_COLLECTION, AnonymousClass0wJ.A0X(r13.A0C), r13.A04, r13.getModuleName());
            case 44:
                TranslationAttributionSheetFragment translationAttributionSheetFragment = (TranslationAttributionSheetFragment) this.A00;
                SpinnerImageView spinnerImageView = translationAttributionSheetFragment.A02;
                if (spinnerImageView != null) {
                    spinnerImageView.setLoadingStatus(AnonymousClass69F.LOADING);
                }
                RecyclerView recyclerView = translationAttributionSheetFragment.A00;
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                }
                return Unit.A00;
            case 45:
                return AnonymousClass0wJ.A0K(((C568738w) this.A00).A00.BLC(), R.id.reel_caption);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                return Integer.valueOf(C18210wN.A02((Context) this.A00));
            case 47:
            case 49:
                return Integer.valueOf(C18220wO.A03(((Context) this.A00).getResources()));
            case 48:
                return Integer.valueOf(((Context) this.A00).getResources().getDimensionPixelSize(R.dimen.chat_sticker_chat_name_text_size));
            default:
                return ((AnonymousClass0ZU) this.A00).invoke();
        }
    }
}
