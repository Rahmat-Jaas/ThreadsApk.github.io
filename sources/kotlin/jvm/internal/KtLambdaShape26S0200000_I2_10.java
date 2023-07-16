package kotlin.jvm.internal;

import X.AnonymousClass006;
import X.AnonymousClass06C;
import X.AnonymousClass0RA;
import X.AnonymousClass0ZU;
import X.AnonymousClass0e5;
import X.AnonymousClass0gW;
import X.AnonymousClass0wJ;
import X.AnonymousClass10I;
import X.AnonymousClass10V;
import X.AnonymousClass17S;
import X.AnonymousClass1dV;
import X.AnonymousClass1pO;
import X.AnonymousClass22M;
import X.AnonymousClass2MW;
import X.AnonymousClass2O7;
import X.AnonymousClass3BN;
import X.AnonymousClass3GK;
import X.AnonymousClass3J5;
import X.AnonymousClass42J;
import X.AnonymousClass46R;
import X.AnonymousClass47S;
import X.AnonymousClass490;
import X.AnonymousClass492;
import X.AnonymousClass493;
import X.AnonymousClass495;
import X.AnonymousClass4UK;
import X.AnonymousClass74I;
import X.AnonymousClass7Ja;
import X.AnonymousClass8bb;
import X.BW9;
import X.C012605w;
import X.C02220Ah;
import X.C04220Ms;
import X.C04530Oa;
import X.C11630kW;
import X.C146958n9;
import X.C147138nS;
import X.C148838sG;
import X.C164619kW;
import X.C170519v8;
import X.C18180wK;
import X.C18200wM;
import X.C18230wP;
import X.C18240wQ;
import X.C18250wR;
import X.C21839C2o;
import X.C22551Yn;
import X.C25235DiG;
import X.C25237DiI;
import X.C25239DiK;
import X.C25753DrP;
import X.C27952Ew2;
import X.C28161tl;
import X.C303820v;
import X.C32159H7t;
import X.C37100Jka;
import X.C38039KHq;
import X.C38319KVn;
import X.C62793ak;
import X.C81784oM;
import X.C82394pY;
import X.C83224qz;
import X.C86074wE;
import X.C884658e;
import X.CBJ;
import X.JTJ;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S1200000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2100000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S3100000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape1S0200000_I2_1;
import com.facebook.redex.IDxDConverterShape279S0200000_3_I2;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.ContentFilterDictionaryRegistrar;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.impl.ContentFilterEngineImpl;
import com.instagram.fanclub.gifting.FanClubGiftingViewModel;
import com.instagram.fanclub.inapp.FanClubInAppPurchasesInteractor$purchaseItem$1;
import com.instagram.model.venue.Venue;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import go.Seq;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape20S0201000_I2_6;

public class KtLambdaShape26S0200000_I2_10 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public Object A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape26S0200000_I2_10(int i, Object obj, Object obj2) {
        super(0);
        this.A02 = i;
        this.A01 = obj;
        this.A00 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C147138nS r3;
        C012605w r1;
        Object value;
        Object invoke;
        C012605w r12;
        Object invoke2;
        switch (this.A02) {
            case 0:
                AnonymousClass2MW.A00(((CBJ) this.A01).A07).A00(C18240wQ.A0I(this.A00), C303820v.FULLSCREEN_MODAL, AnonymousClass006.A00, AnonymousClass006.A0N);
                break;
            case 15:
                return new AnonymousClass493((C11630kW) this.A00, (UserSession) this.A01);
            case 16:
                AnonymousClass1dV r32 = (AnonymousClass1dV) this.A01;
                String id = ((User) this.A00).getId();
                C32159H7t A002 = C32159H7t.A00(C18180wK.A0W(r32, AnonymousClass0RA.A0C));
                C04220Ms.A06(A002);
                A002.A03(id);
                AnonymousClass3GK r0 = ((AnonymousClass10V) r32.A0J.getValue()).A04;
                if (r0 != null) {
                    r0.A00 = true;
                    break;
                }
                break;
            case LangUtils.HASH_SEED /*17*/:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
            case 30:
            case 31:
            case 32:
            case 33:
                AnonymousClass0ZU r02 = (AnonymousClass0ZU) this.A00;
                if (r02 == null || (invoke = r02.invoke()) == null) {
                    return C18240wQ.A0I(this.A01).getDefaultViewModelCreationExtras();
                }
                return invoke;
            case 20:
                C83224qz A03 = AnonymousClass7Ja.A03(C25235DiG.A01(new AnonymousClass8bb((C148838sG) null), C18250wR.A0J((AnonymousClass0gW) null, 3).AHN(1357517038, 3)));
                UserSession userSession = (UserSession) this.A01;
                C04220Ms.A0B(userSession, 0);
                return new AnonymousClass492((C38039KHq) this.A00, (AnonymousClass42J) userSession.A01(AnonymousClass42J.class, new KtLambdaShape66S0100000_I2_46(userSession, 26)), new AnonymousClass47S(new AnonymousClass4UK(AnonymousClass0e5.A00(36603850190295247L), userSession, true)), AnonymousClass4UK.A00(userSession, 36603850190360784L, true), A03);
            case 21:
                return new AnonymousClass3BN((C28161tl) this.A00, (UserSession) this.A01);
            case 22:
                return new ContentFilterEngineImpl((ContentFilterDictionaryRegistrar) this.A00, (UserSession) this.A01);
            case 23:
                UserSession userSession2 = (UserSession) this.A01;
                IDxDConverterShape279S0200000_3_I2 iDxDConverterShape279S0200000_3_I2 = new IDxDConverterShape279S0200000_3_I2((C21839C2o) this.A00, userSession2, 0);
                C170519v8 r2 = C170519v8.EXPLORE;
                return new C38319KVn(C37100Jka.A00(userSession2, new BW9(r2)), new JTJ(userSession2, r2, iDxDConverterShape279S0200000_3_I2));
            case 24:
                C164619kW r4 = (C164619kW) this.A01;
                return r4.A01.A00(C18230wP.A0n((C11630kW) this.A00), new KtLambdaShape66S0100000_I2_46(r4, 40));
            case 27:
                boolean z = !((AnonymousClass17S) ((C81784oM) this.A00).getValue()).A08;
                C86074wE r22 = ((AnonymousClass10I) this.A01).A04;
                do {
                    value = r22.getValue();
                } while (!r22.ADi(value, AnonymousClass17S.A00((KtCSuperShape0S1200000_I2) null, (KtCSuperShape1S0200000_I2_1) null, (AnonymousClass22M) null, (AnonymousClass17S) value, (Venue) null, (String) null, (String) null, (String) null, (List) null, 1015, z, false)));
                break;
            case Rfc3492Idn.skew /*38*/:
                AnonymousClass06C r13 = (AnonymousClass06C) ((C04530Oa) this.A00).getValue();
                if (!(r13 instanceof C012605w) || (r1 = (C012605w) r13) == null || (r3 = r1.getDefaultViewModelProviderFactory()) == null) {
                    r3 = ((Fragment) this.A01).getDefaultViewModelProviderFactory();
                }
                C04220Ms.A09(r3);
                return r3;
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                ((C38039KHq) this.A00).A02((C82394pY) this.A01, AnonymousClass46R.class);
                break;
            case Seq.RefTracker.REF_OFFSET /*42*/:
                C22551Yn r33 = (C22551Yn) this.A01;
                KtCSuperShape0S2100000_I2 ktCSuperShape0S2100000_I2 = (KtCSuperShape0S2100000_I2) this.A00;
                C04530Oa r23 = r33.A07;
                AnonymousClass495 A003 = AnonymousClass2O7.A00(AnonymousClass0wJ.A0X(r23));
                String valueOf = String.valueOf(r33.A04.getValue());
                String userId = AnonymousClass0wJ.A0X(r23).getUserId();
                String A0q = C18200wM.A0q(r33.A06);
                C04220Ms.A06(A0q);
                String str = ktCSuperShape0S2100000_I2.A02;
                String str2 = ktCSuperShape0S2100000_I2.A01;
                KtCSuperShape0S3100000_I2 ktCSuperShape0S3100000_I2 = (KtCSuperShape0S3100000_I2) ktCSuperShape0S2100000_I2.A00;
                String str3 = ktCSuperShape0S3100000_I2.A01;
                String str4 = ktCSuperShape0S3100000_I2.A03;
                String valueOf2 = String.valueOf(r33.A05.getValue());
                AnonymousClass0wJ.A1O(valueOf, userId);
                C18180wK.A1R(str, str2);
                C18180wK.A1S(str3, str4, valueOf2);
                USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(A003.A00, "ig_fan_club_gifting_flow_select_plan_action"), 1199);
                C18230wP.A1H(A0I, "profile");
                C18250wR.A0x(A0I, AnonymousClass0wJ.A0d(valueOf));
                A0I.A0S("gift_sender_igid", AnonymousClass0wJ.A0d(userId));
                A0I.A0S("gift_recipient_igid", AnonymousClass0wJ.A0d(A0q));
                A0I.A0T("gift_price", str);
                A0I.A0T("gift_length", str2);
                A0I.A0T("product_id", str3);
                A0I.A0T("sku", str4);
                C18250wR.A0z(A0I, valueOf2);
                FanClubGiftingViewModel fanClubGiftingViewModel = (FanClubGiftingViewModel) r33.A08.getValue();
                FragmentActivity requireActivity = r33.requireActivity();
                fanClubGiftingViewModel.A05.CrC(new AnonymousClass1pO(fanClubGiftingViewModel.A00, false));
                AnonymousClass490 r14 = fanClubGiftingViewModel.A01;
                User user = (User) ktCSuperShape0S3100000_I2.A00;
                String str5 = ktCSuperShape0S3100000_I2.A03;
                String str6 = ktCSuperShape0S3100000_I2.A01;
                String str7 = ktCSuperShape0S3100000_I2.A02;
                AnonymousClass0wJ.A1O(user, str5);
                C04220Ms.A0B(str6, 3);
                C04220Ms.A0B(str7, 4);
                r14.A02.put(C18180wK.A0p(user, str5), C25753DrP.A01(r14.A03, C25239DiK.A00(new FanClubInAppPurchasesInteractor$purchaseItem$1(requireActivity, r14.A00, user, str5, str6, str7, (C146958n9) null)), AnonymousClass74I.A00, Integer.MAX_VALUE));
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape20S0201000_I2_6(ktCSuperShape0S3100000_I2, fanClubGiftingViewModel, (C146958n9) null, 4), AnonymousClass3J5.A00(fanClubGiftingViewModel), 3);
                break;
            case 49:
                C62793ak r5 = (C62793ak) this.A01;
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape20S0201000_I2_6(this.A00, r5, (C146958n9) null, 16), AnonymousClass3J5.A00(r5), 3);
                break;
            default:
                AnonymousClass0ZU r03 = (AnonymousClass0ZU) this.A00;
                if (r03 != null && (invoke2 = r03.invoke()) != null) {
                    return invoke2;
                }
                AnonymousClass06C r15 = (AnonymousClass06C) ((C04530Oa) this.A01).getValue();
                if (!(r15 instanceof C012605w) || (r12 = (C012605w) r15) == null) {
                    return C884658e.A00;
                }
                return r12.getDefaultViewModelCreationExtras();
        }
        return Unit.A00;
    }
}
