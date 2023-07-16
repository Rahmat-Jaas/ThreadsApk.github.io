package kotlin.jvm.internal;

import X.A8Y;
import X.AnonymousClass006;
import X.AnonymousClass0MJ;
import X.AnonymousClass0ZU;
import X.AnonymousClass0ZV;
import X.AnonymousClass0wJ;
import X.AnonymousClass3LM;
import X.AnonymousClass5IV;
import X.AnonymousClass7CI;
import X.AnonymousClass94O;
import X.AnonymousClass9CZ;
import X.AnonymousClass9TR;
import X.B48;
import X.BKN;
import X.BKU;
import X.BOQ;
import X.C02220Ah;
import X.C04180Mo;
import X.C04220Ms;
import X.C10300i6;
import X.C108306i9;
import X.C11630kW;
import X.C123407Wu;
import X.C126147ef;
import X.C130667qT;
import X.C13330nS;
import X.C142068dl;
import X.C142888fl;
import X.C145018jf;
import X.C146628mY;
import X.C146638ma;
import X.C146958n9;
import X.C157699Tf;
import X.C157709Tg;
import X.C160019bM;
import X.C171209wF;
import X.C171779zx;
import X.C17304A4u;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18230wP;
import X.C18305AdG;
import X.C18543AhJ;
import X.C19126Ar3;
import X.C19243At8;
import X.C19459Awg;
import X.C19461Awi;
import X.C19894BEu;
import X.C20066BMj;
import X.C21203BqX;
import X.C21839C2o;
import X.C21865C3q;
import X.C23894D0g;
import X.C25237DiI;
import X.C27952Ew2;
import X.C34769Ief;
import X.C37235Jn1;
import X.C37319JpM;
import X.C39519Kv3;
import X.C81784oM;
import X.C82044oz;
import X.C83224qz;
import X.C86074wE;
import X.C86104wH;
import X.C86114wI;
import X.C86154wM;
import X.C86164wN;
import X.C87174zx;
import X.C90335Ll;
import X.C971268a;
import X.CXE;
import X.CYX;
import X.EAF;
import X.GJ0;
import X.I17;
import X.ILj;
import X.JW7;
import X.KE0;
import X.KIZ;
import X.L1S;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.papaya.fb.instagram.UserScopedTransport;
import com.instagram.barcelona.search.SearchScreenViewModel;
import com.instagram.pendingmedia.model.PendingMedia;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.service.session.UserSession;
import com.instagram.service.tigon.IGAuthedTigonService;
import com.instagram.user.model.User;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;

public class KtLambdaShape5S0500000_I2 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape5S0500000_I2(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(0);
        this.A05 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A00 = obj5;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Object value;
        Integer num;
        Long l;
        C23894D0g d0g;
        String id;
        switch (this.A05) {
            case 0:
                return Boolean.valueOf(AnonymousClass7CI.A00().A00((Rect) null, (C142068dl) null, ((C87174zx) this.A04).A03, (C126147ef) this.A03, (L1S) this.A02, this.A00));
            case 1:
                IGAuthedTigonService instance = IGAuthedTigonService.getInstance((C10300i6) this.A04);
                C04220Ms.A06(instance);
                return new UserScopedTransport((Context) this.A01, instance, (ScheduledExecutorService) this.A02, (File) this.A03, (C971268a) this.A00);
            case 2:
                C81784oM r4 = (C81784oM) this.A02;
                String A0e = C86164wN.A0e(r4);
                UserSession userSession = (UserSession) C86104wH.A0f(this.A04);
                C11630kW r5 = (C11630kW) C86104wH.A0f(this.A00);
                C04220Ms.A0B(A0e, 0);
                AnonymousClass0wJ.A1O(userSession, r5);
                BKU A0W = C86114wI.A0W(userSession, A0e);
                if (A0W != null) {
                    USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r5, userSession), "instagram_organic_action_menu"), 1871);
                    BKN bkn = A0W.A0f;
                    A0I.A0T("m_pk", bkn.A4Y);
                    String str = bkn.A4l;
                    if (str == null) {
                        str = "";
                    }
                    A0I.A0T("tracking_token", str);
                    String str2 = bkn.A4Y.split("[_@]")[0];
                    C04220Ms.A06(str2);
                    A0I.A12(AnonymousClass0wJ.A0d(str2));
                    User user = bkn.A1i;
                    String str3 = null;
                    if (user == null || (id = user.getId()) == null) {
                        l = null;
                    } else {
                        l = AnonymousClass0wJ.A0d(id);
                    }
                    A0I.A0S("media_author_id", l);
                    User user2 = bkn.A1i;
                    if (!(user2 == null || (d0g = user2.A03) == null)) {
                        str3 = d0g.toString();
                    }
                    A0I.A0T(I17.A00(222), str3);
                    A0I.A0T("module_name", r5.getModuleName());
                    A0I.Bb4();
                }
                ((C146638ma) this.A01).Bh7(C86164wN.A0e(r4), ((C90335Ll) ((C146628mY) this.A03)).A0H);
                break;
            case 3:
                LazyListState lazyListState = (LazyListState) this.A02;
                if (lazyListState.A00() == 0 && lazyListState.A01() == 0) {
                    C25237DiI.A00((Integer) null, (C27952Ew2) null, C86154wM.A0x(this.A01, (C146958n9) null, 44), (C83224qz) this.A03, 3);
                }
                SearchScreenViewModel searchScreenViewModel = (SearchScreenViewModel) this.A04;
                C86074wE r2 = searchScreenViewModel.A0C;
                do {
                    value = r2.getValue();
                    num = AnonymousClass006.A00;
                } while (!r2.ADi(value, AnonymousClass5IV.A00((AnonymousClass5IV) value, (ILj) null, num, num, "", (String) null, (String) null, (String) null, AnonymousClass0ZV.A00, 124, false)));
                SearchScreenViewModel.A04(searchScreenViewModel, false);
                ((C123407Wu) ((C142888fl) this.A00)).ADB(false, true);
                break;
            case 4:
                C17304A4u.A00((C21203BqX) this.A00, (AnonymousClass9CZ) this.A01, (B48) this.A04, (AnonymousClass94O) this.A02, (C171209wF) this.A03, (String) null, (String) null, -1.0f, -1.0f, 384);
                break;
            case 5:
                C160019bM r1 = (C160019bM) this.A04;
                UserSession userSession2 = r1.A08;
                C19243At8 A002 = A8Y.A00(userSession2);
                C21839C2o c2o = r1.A06;
                if (A002.A0A(C18230wP.A0n(c2o))) {
                    return null;
                }
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                Context context = (Context) this.A00;
                boolean z = !r1.A0G;
                C04220Ms.A0C(fragmentActivity, I17.A00(3));
                return new C157699Tf(context, fragmentActivity, r1.A04, (C82044oz) fragmentActivity, (C130667qT) this.A02, c2o, C19894BEu.A02(context, userSession2), userSession2, (C145018jf) this.A03, r1.A0A, z, false, false);
            case 6:
                View view = (View) this.A03;
                UserSession userSession3 = ((C19459Awg) this.A04).A03;
                C37235Jn1 A003 = C37235Jn1.A00(userSession3);
                A003.A0A(view, new KE0((C39519Kv3) null, (BKU) this.A00, (C21839C2o) this.A01, userSession3));
                A003.A06(view, (C171779zx) this.A02);
                break;
            case 7:
                BKU bku = (BKU) this.A00;
                C20066BMj bMj = (C20066BMj) this.A01;
                C157709Tg r12 = (C157709Tg) this.A04;
                return ((C18305AdG) ((C19126Ar3) this.A02).A08.getValue()).A00(C18190wL.A0A((View) this.A03), bku, r12.A09, ((C19461Awi) r12.A0F.getValue()).A03(bku, bMj), bMj);
            case 8:
                Activity activity = (Activity) this.A00;
                return new C34769Ief(activity, activity, (C11630kW) this.A02, (JW7) this.A01, (BOQ) this.A03, (UserSession) this.A04);
            case 9:
                return new AnonymousClass9TR((Context) this.A00, (C11630kW) this.A02, (UserSession) this.A04, (C21865C3q) this.A03, ((C108306i9) this.A01).A00, false);
            case 10:
                return new CXE((Context) this.A00, (C11630kW) this.A01, (CYX) this.A02, (EAF) this.A03, (UserSession) this.A04);
            case 11:
                KIZ kiz = (KIZ) this.A04;
                GJ0 gj0 = kiz.A0V;
                ShareType shareType = (ShareType) this.A03;
                PendingMedia pendingMedia = (PendingMedia) this.A02;
                if (!gj0.A01(pendingMedia, shareType)) {
                    C18543AhJ A012 = AnonymousClass3LM.A01();
                    UserSession userSession4 = kiz.A0S;
                    FragmentActivity fragmentActivity2 = (FragmentActivity) this.A00;
                    BKU bku2 = pendingMedia.A10;
                    C04220Ms.A06(bku2);
                    A012.A09(fragmentActivity2, bku2, userSession4);
                    C21839C2o c2o2 = kiz.A0R;
                    BKU bku3 = pendingMedia.A10;
                    C04220Ms.A06(bku3);
                    C37319JpM.A02((Fragment) this.A01, fragmentActivity2, c2o2, bku3, userSession4);
                    break;
                } else {
                    BKU bku4 = pendingMedia.A10;
                    C04220Ms.A06(bku4);
                    String BAZ = kiz.A0U.BAZ();
                    C04220Ms.A06(BAZ);
                    gj0.A00((FragmentActivity) this.A00, bku4, shareType, BAZ);
                    break;
                }
            default:
                C04180Mo r13 = (C04180Mo) this.A02;
                if (!((C04180Mo) this.A01).A00) {
                    r13.A00 = false;
                    AnonymousClass0MJ r22 = (AnonymousClass0MJ) this.A04;
                    Object obj = r22.A00;
                    Object obj2 = ((AnonymousClass0MJ) this.A00).A00;
                    if (obj == obj2) {
                        Collection collection = (Collection) obj2;
                        C04220Ms.A0B(collection, 0);
                        obj = C18200wM.A0s(collection);
                        r22.A00 = obj;
                    }
                    ((List) r22.A00).remove(((List) obj).indexOf(this.A03));
                    break;
                } else {
                    throw C18180wK.A0a("You may not unsubscribe from a store listener while the reducer\nis executing. See \nhttps://www.reduxkotlin.org/api/store#subscribelistener-storesubscriber\nfor more details.");
                }
        }
        return Unit.A00;
    }
}
