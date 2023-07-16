package kotlin.jvm.internal;

import X.AnonymousClass006;
import X.AnonymousClass0RA;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass1bS;
import X.AnonymousClass1bT;
import X.AnonymousClass2M0;
import X.AnonymousClass3R0;
import X.AnonymousClass490;
import X.AnonymousClass6VR;
import X.C02220Ah;
import X.C04220Ms;
import X.C04530Oa;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18230wP;
import X.C22551Yn;
import X.C23441dq;
import X.C23471du;
import X.C23481dv;
import X.C24306DGw;
import X.C62113Xe;
import X.C66073wy;
import X.C66093x0;
import X.C66343xS;
import X.C66543xm;
import X.C66593xr;
import X.C84714tk;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.fanclub.creatorlist.SubscribedAndRecommendedCreatorListRepository;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import go.Seq;
import kotlin.Unit;

public class KtLambdaShape69S0100000_I2_49 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape69S0100000_I2_49(Object obj, int i) {
        super(0);
        this.A01 = i;
        this.A00 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Bundle bundle;
        String str;
        switch (this.A01) {
            case 1:
            case 7:
            case LangUtils.HASH_SEED /*17*/:
            case 25:
            case 30:
            case 39:
            case 45:
                return ((AnonymousClass0ZU) this.A00).invoke();
            case 2:
            case 8:
            case 18:
            case Rfc3492Idn.tmax /*26*/:
            case 31:
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                return C18180wK.A0H((C04530Oa) this.A00);
            case 3:
            case 33:
                return new Object[((C84714tk[]) this.A00).length];
            case 4:
                UserSession userSession = (UserSession) this.A00;
                return new AnonymousClass490(new C62113Xe(userSession, C24306DGw.A00(userSession)), userSession);
            case 5:
                return C18230wP.A0D(this.A00).getString("origin", AnonymousClass3R0.A00(AnonymousClass006.A00));
            case 9:
                C23441dq r4 = (C23441dq) this.A00;
                C04530Oa r0 = r4.A02;
                UserSession A0X = AnonymousClass0wJ.A0X(r0);
                SubscribedAndRecommendedCreatorListRepository subscribedAndRecommendedCreatorListRepository = new SubscribedAndRecommendedCreatorListRepository(AnonymousClass0wJ.A0X(r0));
                boolean z = r4.requireArguments().getBoolean("ARG_SHOW_EDUCATION_HEADER");
                String A0q = C18200wM.A0q(r4.A01);
                C04220Ms.A06(A0q);
                return new C66543xm(subscribedAndRecommendedCreatorListRepository, A0X, A0q, z);
            case 10:
            case 11:
            case Seq.NULL_REFNUM /*41*/:
            case 48:
                return C18180wK.A0W((Fragment) this.A00, AnonymousClass0RA.A0C);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                C22551Yn r2 = (C22551Yn) this.A00;
                User A03 = AnonymousClass6VR.A00(AnonymousClass0wJ.A0X(r2.A07)).A03(C18200wM.A0q(r2.A04));
                if (A03 != null) {
                    return A03;
                }
                throw AnonymousClass0wJ.A0b();
            case 13:
                bundle = C18230wP.A0D(this.A00);
                str = "creator_user_id";
                break;
            case 14:
            case 21:
                bundle = C18230wP.A0D(this.A00);
                str = "origin";
                break;
            case 15:
                String string = C18230wP.A0D(this.A00).getString("recipient_user_id");
                if (string != null) {
                    return string;
                }
                throw AnonymousClass0wJ.A0b();
            case 19:
                return new C66073wy(AnonymousClass0wJ.A0X(((C22551Yn) this.A00).A07));
            case 20:
                AnonymousClass1bS r1 = (AnonymousClass1bS) this.A00;
                return AnonymousClass6VR.A00(AnonymousClass0wJ.A0X(r1.A04)).A03(r1.requireArguments().getString("creator_user_id"));
            case 22:
                bundle = C18230wP.A0D(this.A00);
                str = "recipient_user_id";
                break;
            case 23:
                bundle = C18230wP.A0D(this.A00);
                str = "sku";
                break;
            case 27:
                return new C66073wy(AnonymousClass0wJ.A0X(((AnonymousClass1bS) this.A00).A04));
            case 28:
            case 43:
                return C18230wP.A0D(this.A00).getString("ARGUMENT_ENTRY_POINT", "UNKNOWN");
            case 32:
                AnonymousClass1bT r3 = (AnonymousClass1bT) this.A00;
                UserSession A0X2 = AnonymousClass0wJ.A0X(r3.A08);
                FragmentActivity requireActivity = r3.requireActivity();
                String A0q2 = C18200wM.A0q(r3.A07);
                C04220Ms.A06(A0q2);
                return new C66593xr(requireActivity, A0X2, A0q2);
            case 34:
                C62113Xe r02 = (C62113Xe) this.A00;
                return r02.A01.A00(r02.A02);
            case 35:
            case Rfc3492Idn.base /*36*/:
                ((C62113Xe) this.A00).A00.A01();
                return Unit.A00;
            case LangUtils.HASH_OFFSET /*37*/:
                return AnonymousClass2M0.A00(AnonymousClass0wJ.A0X(((C23471du) this.A00).A0A));
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return new C66093x0(AnonymousClass0wJ.A0X(((C23471du) this.A00).A0A));
            case 47:
                C23481dv r22 = (C23481dv) this.A00;
                return new C66343xS(AnonymousClass0wJ.A0X(r22.A01), (String) C18190wL.A0f(r22.A00));
            default:
                return this.A00;
        }
        return bundle.getString(str);
    }
}
