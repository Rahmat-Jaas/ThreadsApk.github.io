package kotlin.jvm.internal;

import X.AnonymousClass01V;
import X.AnonymousClass0RA;
import X.AnonymousClass0RG;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass1ap;
import X.AnonymousClass1oQ;
import X.AnonymousClass1wF;
import X.AnonymousClass2MV;
import X.AnonymousClass3FH;
import X.AnonymousClass3X1;
import X.AnonymousClass3Zs;
import X.AnonymousClass49E;
import X.AnonymousClass49L;
import X.AnonymousClass49W;
import X.AnonymousClass49Y;
import X.AnonymousClass58a;
import X.AnonymousClass5x3;
import X.C02220Ah;
import X.C04220Ms;
import X.C04530Oa;
import X.C09810gi;
import X.C09820gj;
import X.C18180wK;
import X.C18190wL;
import X.C18220wO;
import X.C18330wh;
import X.C22279CRw;
import X.C22311CTq;
import X.C24514DPb;
import X.C24982DdJ;
import X.C29121wl;
import X.C565437p;
import X.C58703Gu;
import X.C60883Qx;
import X.C66013wr;
import X.C66263xK;
import X.C66273xL;
import X.C66433xb;
import X.C693648g;
import X.C694348n;
import X.C694848s;
import X.C84714tk;
import X.C8A;
import X.C8C;
import X.D2R;
import X.FD2;
import X.H8D;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;
import go.Seq;

public class KtLambdaShape61S0100000_I2_41 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape61S0100000_I2_41(Object obj, int i) {
        super(0);
        this.A01 = i;
        this.A00 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass3FH r0;
        switch (this.A01) {
            case 0:
                AnonymousClass0RG r1 = AnonymousClass0RA.A0C;
                Bundle A0C = C18190wL.A0C((Activity) this.A00);
                if (A0C != null) {
                    return r1.A06(A0C);
                }
                throw AnonymousClass0wJ.A0b();
            case 1:
                return new C565437p(AnonymousClass3Zs.A03((UserSession) this.A00).A01(D2R.A0p));
            case 2:
                return new AnonymousClass49Y((UserSession) this.A00);
            case 3:
                return new AnonymousClass49E((UserSession) this.A00);
            case 4:
                return new AnonymousClass49W((UserSession) this.A00);
            case 5:
                return new C693648g((UserSession) this.A00);
            case 6:
                UserSession userSession = (UserSession) this.A00;
                H8D A002 = C60883Qx.A00(userSession);
                C04220Ms.A06(A002);
                return new C694848s(A002, userSession);
            case 7:
            case 20:
            case 23:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return this.A00;
            case 8:
            case 21:
            case 24:
            case 30:
            case 43:
                return ((AnonymousClass0ZU) this.A00).invoke();
            case 10:
                AnonymousClass1ap r2 = (AnonymousClass1ap) this.A00;
                String string = r2.requireArguments().getString("ChannelsListFragment.USER_ID");
                if (string != null) {
                    return new C66263xK(AnonymousClass0wJ.A0X(r2.A01), string);
                }
                throw AnonymousClass0wJ.A0b();
            case 11:
                return new FD2((View) this.A00);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C09810gi r22 = C09820gj.A00;
                UserSession userSession2 = (UserSession) this.A00;
                C04220Ms.A0B(userSession2, 1);
                return new C24514DPb(r22, userSession2);
            case 13:
                r0 = C18220wO.A0N(((C24982DdJ) this.A00).A04);
                if (r0 == null) {
                    return "uniqueDeviceId";
                }
                break;
            case 14:
                return AnonymousClass0wJ.A0K(((Fragment) this.A00).requireView(), R.id.onboarding_bottom_button);
            case 15:
                return AnonymousClass0wJ.A0K(((Fragment) this.A00).requireView(), R.id.eb_education_nux_page_indicator);
            case 16:
                return C18180wK.A0W((Fragment) this.A00, AnonymousClass0RA.A0C);
            case LangUtils.HASH_SEED /*17*/:
                return AnonymousClass0wJ.A0K(((Fragment) this.A00).requireView(), R.id.eb_education_nux_view_pager);
            case 18:
                C29121wl r02 = (C29121wl) this.A00;
                return new AnonymousClass58a(C18190wL.A09(r02), AnonymousClass0wJ.A0X(r02.A03));
            case 19:
                return C18330wh.A01((Fragment) this.A00);
            case Rfc3492Idn.tmax /*26*/:
                C29121wl r3 = (C29121wl) this.A00;
                return new C66433xb(r3.requireActivity(), (C8A) r3.A01.getValue(), AnonymousClass0wJ.A0X(r3.A03));
            case 27:
                return new Object[((C84714tk[]) this.A00).length];
            case 28:
                return new AnonymousClass49L((UserSession) this.A00);
            case 32:
                AnonymousClass5x3 r23 = (AnonymousClass5x3) this.A00;
                return new C66273xL(C18190wL.A09(r23), AnonymousClass0wJ.A0X(r23.A00));
            case 33:
                return C18190wL.A0M((Fragment) this.A00);
            case 34:
                r0 = C18220wO.A0N(((C8C) this.A00).A03);
                break;
            case 35:
                return new C694348n((UserSession) this.A00);
            case Rfc3492Idn.base /*36*/:
                return AnonymousClass01V.A0p;
            case LangUtils.HASH_OFFSET /*37*/:
                return new C58703Gu((UserSession) this.A00);
            case Rfc3492Idn.skew /*38*/:
                return AnonymousClass2MV.A00(((C58703Gu) this.A00).A00);
            case 39:
                return AnonymousClass2MV.A00(AnonymousClass0wJ.A0X(((AnonymousClass1wF) this.A00).A02));
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
                return AnonymousClass3X1.A00(AnonymousClass0wJ.A0X(((AnonymousClass1wF) this.A00).A02));
            case Seq.NULL_REFNUM /*41*/:
                return ((Fragment) this.A00).requireView().requireViewById(R.id.bottom_buttons);
            case 45:
                return AnonymousClass3X1.A00(AnonymousClass0wJ.A0X(((C22279CRw) this.A00).A03));
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                return ((C22279CRw) this.A00).A00.invoke();
            case 47:
                return new C66013wr(AnonymousClass0wJ.A0X(((C22279CRw) this.A00).A03));
            case 48:
                return ((Fragment) this.A00).requireView().requireViewById(R.id.devices_recyclerview);
            case 49:
                C04220Ms.A0B(((C22311CTq) this.A00).A02.getValue(), 0);
                AnonymousClass01V r03 = AnonymousClass01V.A0p;
                C04220Ms.A06(r03);
                return new AnonymousClass1oQ(r03);
            default:
                return C18180wK.A0H((C04530Oa) this.A00);
        }
        String str = r0.A01;
        if (str == null) {
            return "uniqueDeviceId";
        }
        return str;
    }
}
