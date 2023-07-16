package kotlin.jvm.internal;

import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass1ZQ;
import X.AnonymousClass1a3;
import X.AnonymousClass1a4;
import X.AnonymousClass1f0;
import X.AnonymousClass1f1;
import X.AnonymousClass24J;
import X.AnonymousClass2K2;
import X.AnonymousClass33X;
import X.AnonymousClass3Fb;
import X.AnonymousClass3SJ;
import X.AnonymousClass3WK;
import X.AnonymousClass3Zs;
import X.AnonymousClass58F;
import X.C02220Ah;
import X.C04220Ms;
import X.C04530Oa;
import X.C05030Qo;
import X.C18180wK;
import X.C18190wL;
import X.C18210wN;
import X.C18230wP;
import X.C23681ez;
import X.C25297DjI;
import X.C34312Jb;
import X.C554533g;
import X.C60883Qx;
import X.C61033Rq;
import X.C62883b4;
import X.C65963wl;
import X.C66213xF;
import X.C66223xG;
import X.C67133yv;
import X.C684443u;
import X.CUZ;
import X.D2R;
import X.DC3;
import X.H8D;
import android.app.Activity;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.brandedcontent.project.BrandedContentProjectRepository;
import com.instagram.brandedcontent.repository.BrandedContentApi;
import com.instagram.brandedcontent.repository.BrandedContentSettingsRepository;
import com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController;
import com.instagram.business.activity.BusinessAttributeSyncActivity;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.fragment.BusinessAttributeConfirmFragment;
import com.instagram.business.fragment.BusinessAttributeSyncIntroFragment;
import com.instagram.business.model.BusinessAttribute;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.monetization.api.MonetizationApi;
import com.instagram.service.session.UserSession;
import go.Seq;

public class KtLambdaShape39S0100000_I2_19 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape39S0100000_I2_19(Object obj, int i) {
        super(0);
        this.A01 = i;
        this.A00 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A01) {
            case 0:
                String string = C18230wP.A0D(this.A00).getString("user_id");
                if (string != null) {
                    return string;
                }
                throw AnonymousClass0wJ.A0b();
            case 1:
                String string2 = C18230wP.A0D(this.A00).getString("user_id");
                if (string2 != null) {
                    return string2;
                }
                throw AnonymousClass0wJ.A0b();
            case 2:
                return C18210wN.A0Q(C18230wP.A0D(this.A00), "is_for_inactive_ads");
            case 3:
            case 10:
            case 15:
            case 23:
                return this.A00;
            case 4:
            case 11:
            case 16:
            case 24:
                return ((AnonymousClass0ZU) this.A00).invoke();
            case 6:
            case 9:
            case 13:
            case 18:
            case 20:
            case 21:
            case Rfc3492Idn.tmax /*26*/:
            case 35:
            case Rfc3492Idn.base /*36*/:
                return C18180wK.A0W((Fragment) this.A00, AnonymousClass0RA.A0C);
            case 7:
                return new C66213xF(AnonymousClass0wJ.A0X(((AnonymousClass1a4) this.A00).A03), false);
            case 8:
                String A0k = C18190wL.A0k((Fragment) this.A00);
                if (A0k != null) {
                    return A0k;
                }
                throw AnonymousClass0wJ.A0b();
            case 14:
                return new C66213xF(AnonymousClass0wJ.A0X(((AnonymousClass1a3) this.A00).A01), true);
            case 19:
                AnonymousClass1ZQ r1 = (AnonymousClass1ZQ) this.A00;
                return new C66223xG(r1, AnonymousClass0wJ.A0X(r1.A00));
            case 22:
                UserSession userSession = (UserSession) this.A00;
                return new BrandedContentProjectRepository(AnonymousClass3WK.A01(userSession), userSession);
            case 27:
                return new C65963wl(AnonymousClass0wJ.A0X(((CUZ) this.A00).A02));
            case 28:
                UserSession userSession2 = (UserSession) this.A00;
                return new C684443u(AnonymousClass3Zs.A03(userSession2).A02(D2R.A0M, C25297DjI.A00.getClass()), AnonymousClass3WK.A01(userSession2), userSession2);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                UserSession userSession3 = (UserSession) this.A00;
                MonetizationApi monetizationApi = new MonetizationApi(userSession3);
                BrandedContentApi brandedContentApi = new BrandedContentApi(userSession3);
                H8D A002 = C60883Qx.A00(userSession3);
                C04220Ms.A06(A002);
                BrandedContentProjectRepository A003 = C34312Jb.A00(userSession3);
                C04220Ms.A0B(userSession3, 0);
                return new BrandedContentSettingsRepository(A003, (C684443u) userSession3.A01(C684443u.class, new KtLambdaShape39S0100000_I2_19(userSession3, 28)), brandedContentApi, A002, monetizationApi);
            case 30:
                return C34312Jb.A00(((BrandedContentFeedDisclosureController) this.A00).A07);
            case 31:
                return C18190wL.A0g(((AnonymousClass3Fb) this.A00).A00().getResources(), 2131829574);
            case 32:
                AnonymousClass3Fb r2 = (AnonymousClass3Fb) this.A00;
                View requireViewById = r2.A00().requireViewById(R.id.violation_banner_text);
                TextView textView = (TextView) requireViewById;
                C18230wP.A16(textView, r2.A00().getContext());
                C04220Ms.A06(requireViewById);
                return textView;
            case 33:
                return ((AnonymousClass3Fb) this.A00).A00.inflate();
            case 34:
                return DC3.A00(((AnonymousClass58F) this.A00).A0A);
            case LangUtils.HASH_OFFSET /*37*/:
                return new AnonymousClass33X((UserSession) this.A00);
            case Rfc3492Idn.skew /*38*/:
                AnonymousClass0RG r12 = AnonymousClass0RA.A0C;
                Bundle bundle = (Bundle) ((BusinessAttributeSyncActivity) this.A00).A06.getValue();
                C04220Ms.A06(bundle);
                return r12.A02(bundle);
            case 39:
                C62883b4.A04();
                Bundle A004 = BusinessAttributeSyncActivity.A00((BusinessAttributeSyncActivity) this.A00);
                AnonymousClass1f1 r5 = new AnonymousClass1f1();
                r5.setArguments(A004);
                return r5;
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                BusinessAttributeSyncActivity businessAttributeSyncActivity = (BusinessAttributeSyncActivity) this.A00;
                BusinessAttribute businessAttribute = (BusinessAttribute) businessAttributeSyncActivity.A07.getValue();
                BusinessAttribute businessAttribute2 = (BusinessAttribute) businessAttributeSyncActivity.A08.getValue();
                ImmutableList.Builder builder = new ImmutableList.Builder();
                builder.add((Object) new C554533g(AnonymousClass24J.INTRO));
                if (AnonymousClass2K2.A00(businessAttribute.A01, businessAttribute2.A01, false)) {
                    builder.add((Object) new C554533g(AnonymousClass24J.EMAIL));
                }
                if (AnonymousClass2K2.A00(businessAttribute.A06, businessAttribute2.A06, false) || AnonymousClass2K2.A00(businessAttribute.A00, businessAttribute2.A00, false) || AnonymousClass2K2.A00(businessAttribute.A07, businessAttribute2.A07, false)) {
                    builder.add((Object) new C554533g(AnonymousClass24J.ADDRESS));
                }
                if (AnonymousClass2K2.A00(businessAttribute.A05, businessAttribute2.A05, true)) {
                    builder.add((Object) new C554533g(AnonymousClass24J.PHONE_NUMBER));
                }
                builder.add((Object) new C554533g(AnonymousClass24J.CONFIRMATION));
                return new C61033Rq(new AnonymousClass3SJ(builder.build()));
            case Seq.NULL_REFNUM /*41*/:
                BusinessAttributeSyncActivity businessAttributeSyncActivity2 = (BusinessAttributeSyncActivity) this.A00;
                C04530Oa r22 = businessAttributeSyncActivity2.A08;
                String str = ((BusinessAttribute) r22.getValue()).A01;
                String str2 = ((BusinessAttribute) r22.getValue()).A05;
                String str3 = ((BusinessAttribute) r22.getValue()).A06;
                C04530Oa r13 = businessAttributeSyncActivity2.A07;
                return new BusinessAttribute(str, str2, str3, ((BusinessAttribute) r13.getValue()).A04, ((BusinessAttribute) r22.getValue()).A07, ((BusinessAttribute) r22.getValue()).A00, ((BusinessAttribute) r13.getValue()).A02, ((BusinessAttribute) r22.getValue()).A03);
            case Seq.RefTracker.REF_OFFSET /*42*/:
                C62883b4.A04();
                BusinessAttributeSyncActivity businessAttributeSyncActivity3 = (BusinessAttributeSyncActivity) this.A00;
                Bundle A005 = BusinessAttributeSyncActivity.A00(businessAttributeSyncActivity3);
                String A04 = C05030Qo.A04(AnonymousClass0wJ.A0U(businessAttributeSyncActivity3.A00));
                if (A04 != null) {
                    BusinessAttributeConfirmFragment businessAttributeConfirmFragment = new BusinessAttributeConfirmFragment();
                    C18190wL.A13(A005, A04);
                    businessAttributeConfirmFragment.setArguments(A005);
                    return businessAttributeConfirmFragment;
                }
                throw AnonymousClass0wJ.A0b();
            case 43:
                C62883b4.A04();
                Bundle A006 = BusinessAttributeSyncActivity.A00((BusinessAttributeSyncActivity) this.A00);
                C23681ez r52 = new C23681ez();
                r52.setArguments(A006);
                return r52;
            case 44:
                Bundle A0C = C18190wL.A0C((Activity) this.A00);
                if (A0C != null) {
                    return A0C;
                }
                throw AnonymousClass0wJ.A0b();
            case 45:
                Object obj = ((BaseBundle) ((BusinessAttributeSyncActivity) this.A00).A06.getValue()).get("fb_attributes");
                C04220Ms.A0C(obj, "null cannot be cast to non-null type com.instagram.business.model.BusinessAttribute");
                return obj;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                Object obj2 = ((BaseBundle) ((BusinessAttributeSyncActivity) this.A00).A06.getValue()).get("ig_attributes");
                C04220Ms.A0C(obj2, "null cannot be cast to non-null type com.instagram.business.model.BusinessAttribute");
                return obj2;
            case 47:
                C62883b4.A04();
                String token = AnonymousClass0wJ.A0U(((BusinessAttributeSyncActivity) this.A00).A00).getToken();
                C04220Ms.A0B(token, 0);
                Bundle A06 = C18180wK.A06();
                C18190wL.A13(A06, token);
                BusinessAttributeSyncIntroFragment businessAttributeSyncIntroFragment = new BusinessAttributeSyncIntroFragment();
                businessAttributeSyncIntroFragment.setArguments(A06);
                return businessAttributeSyncIntroFragment;
            case 48:
                C62883b4.A04();
                Bundle A007 = BusinessAttributeSyncActivity.A00((BusinessAttributeSyncActivity) this.A00);
                AnonymousClass1f0 r53 = new AnonymousClass1f0();
                r53.setArguments(A007);
                return r53;
            case 49:
                BusinessConversionActivity businessConversionActivity = (BusinessConversionActivity) this.A00;
                return new C67133yv((Bundle) businessConversionActivity.A0C.getValue(), AnonymousClass0wJ.A0U(businessConversionActivity.A0A));
            default:
                return C18180wK.A0H((C04530Oa) this.A00);
        }
    }
}
