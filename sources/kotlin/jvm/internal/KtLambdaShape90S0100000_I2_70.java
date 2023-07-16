package kotlin.jvm.internal;

import X.AnonymousClass00U;
import X.AnonymousClass0RA;
import X.AnonymousClass0TJ;
import X.AnonymousClass0ZU;
import X.AnonymousClass0wJ;
import X.AnonymousClass17J;
import X.AnonymousClass25P;
import X.AnonymousClass25R;
import X.AnonymousClass2AP;
import X.AnonymousClass319;
import X.AnonymousClass31A;
import X.AnonymousClass31B;
import X.AnonymousClass33P;
import X.AnonymousClass35I;
import X.AnonymousClass35J;
import X.AnonymousClass35L;
import X.AnonymousClass35M;
import X.AnonymousClass35N;
import X.AnonymousClass38U;
import X.AnonymousClass38V;
import X.AnonymousClass3II;
import X.AnonymousClass3IW;
import X.AnonymousClass3J5;
import X.AnonymousClass3LY;
import X.AnonymousClass3YB;
import X.AnonymousClass3Zs;
import X.AnonymousClass3z3;
import X.AnonymousClass49F;
import X.AnonymousClass4EE;
import X.AnonymousClass4EF;
import X.AnonymousClass4EG;
import X.AnonymousClass4EI;
import X.AnonymousClass4EJ;
import X.AnonymousClass4EL;
import X.AnonymousClass4To;
import X.AnonymousClass4WJ;
import X.AnonymousClass4WK;
import X.AnonymousClass7EN;
import X.C02220Ah;
import X.C02260Al;
import X.C04220Ms;
import X.C10300i6;
import X.C10600ic;
import X.C108326iB;
import X.C132357tl;
import X.C146958n9;
import X.C18180wK;
import X.C18190wL;
import X.C18200wM;
import X.C18210wN;
import X.C18220wO;
import X.C18230wP;
import X.C19280zc;
import X.C25237DiI;
import X.C26562ELk;
import X.C27231sB;
import X.C27241sC;
import X.C27952Ew2;
import X.C29511yH;
import X.C30541GIx;
import X.C30998Gd5;
import X.C63803iN;
import X.C684944a;
import X.C696649n;
import X.C73874Uq;
import X.C76274dl;
import X.C83224qz;
import X.C84184sh;
import X.C84714tk;
import X.D2R;
import X.GYG;
import X.H89;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import ch.boye.httpclientandroidlib.client.utils.Rfc3492Idn;
import ch.boye.httpclientandroidlib.util.LangUtils;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.debughead.linechart.LineChartAxesView;
import com.instagram.newsfeed.ui.InlineLinkUrn;
import com.instagram.notifications.badging.impl.BadgingApiImpl;
import com.instagram.notifications.badging.ui.component.MutableBadgeView;
import com.instagram.notifications.badging.ui.component.ToastingBadge;
import com.instagram.nux.aymh.viewmodel.AymhViewModel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import go.Seq;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.KtSLambdaShape12S0301000_I2_4;

public class KtLambdaShape90S0100000_I2_70 extends C02220Ah implements AnonymousClass0ZU {
    public Object A00;
    public final int A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KtLambdaShape90S0100000_I2_70(Object obj, int i) {
        super(0);
        this.A01 = i;
        this.A00 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        Set<String> queryParameterNames;
        switch (this.A01) {
            case 2:
                Uri uri = ((InlineLinkUrn) this.A00).A00;
                if (uri == null || (queryParameterNames = uri.getQueryParameterNames()) == null) {
                    return AnonymousClass4To.A00();
                }
                LinkedHashMap A0v = C18190wL.A0v(AnonymousClass4WK.A0L(C02260Al.A0z(queryParameterNames, 10)));
                for (T next : queryParameterNames) {
                    A0v.put(next, uri.getQueryParameter((String) next));
                }
                return A0v;
            case 3:
                return new C108326iB((UserSession) this.A00);
            case 4:
                return new AnonymousClass17J[((C84714tk[]) this.A00).length];
            case 5:
                UserSession userSession = (UserSession) this.A00;
                C04220Ms.A0B(userSession, 0);
                Context context = C10600ic.A00;
                C04220Ms.A06(context);
                HashMap hashMap = AnonymousClass31B.A00;
                Class<C83224qz> cls = C83224qz.class;
                hashMap.put(cls, C73874Uq.A00);
                Class<C84184sh> cls2 = C84184sh.class;
                if (C63803iN.A0E(AnonymousClass0TJ.A05, userSession, 36310877586456854L)) {
                    obj = userSession.A01(AnonymousClass4EE.class, C76274dl.A00);
                } else {
                    obj = AnonymousClass319.A00;
                }
                hashMap.put(cls2, obj);
                Class<C684944a> cls3 = C684944a.class;
                AnonymousClass35I r5 = new AnonymousClass35I(userSession);
                Object obj2 = hashMap.get(cls2);
                if (obj2 != null) {
                    hashMap.put(cls3, new C684944a(r5, (C84184sh) obj2));
                    Class<AnonymousClass35J> cls4 = AnonymousClass35J.class;
                    hashMap.put(cls4, new AnonymousClass35J(userSession));
                    Class<AnonymousClass3YB> cls5 = AnonymousClass3YB.class;
                    Object obj3 = hashMap.get(cls4);
                    if (obj3 != null) {
                        hashMap.put(cls5, new AnonymousClass3YB((AnonymousClass35J) obj3, userSession));
                        Class<BadgingApiImpl> cls6 = BadgingApiImpl.class;
                        hashMap.put(cls6, new BadgingApiImpl(new AnonymousClass33P(context), userSession));
                        Class<AnonymousClass3II> cls7 = AnonymousClass3II.class;
                        Object obj4 = hashMap.get(cls5);
                        if (obj4 != null) {
                            AnonymousClass3YB r11 = (AnonymousClass3YB) obj4;
                            Object obj5 = hashMap.get(cls6);
                            if (obj5 != null) {
                                BadgingApiImpl badgingApiImpl = (BadgingApiImpl) obj5;
                                AnonymousClass4EG r8 = (AnonymousClass4EG) userSession.A01(AnonymousClass4EG.class, new KtLambdaShape31S0200000_I2_15(38, AnonymousClass3LY.A00(userSession), userSession));
                                LinkedHashMap A0y = C18220wO.A0y();
                                A0y.put(AnonymousClass2AP.A06, r8);
                                for (Object put : AnonymousClass31A.A00) {
                                    A0y.put(put, r8);
                                }
                                Pair[] pairArr = {C18180wK.A0p(AnonymousClass2AP.A0K, new C26562ELk(r8, userSession)), C18180wK.A0p(AnonymousClass2AP.A0Q, new AnonymousClass4EF(userSession))};
                                LinkedHashMap A0v2 = C18190wL.A0v(3);
                                AnonymousClass4WJ.A0K(A0v2, pairArr);
                                LinkedHashMap linkedHashMap = new LinkedHashMap(A0y);
                                linkedHashMap.putAll(A0v2);
                                Object obj6 = hashMap.get(cls4);
                                if (obj6 != null) {
                                    AnonymousClass38U r12 = new AnonymousClass38U((AnonymousClass35J) obj6);
                                    Object obj7 = hashMap.get(cls);
                                    if (obj7 != null) {
                                        C83224qz r2 = (C83224qz) obj7;
                                        Object obj8 = hashMap.get(cls4);
                                        if (obj8 != null) {
                                            hashMap.put(cls7, new AnonymousClass3II(r11, r12, badgingApiImpl, (AnonymousClass35J) obj8, userSession, linkedHashMap, r2));
                                            Class<AnonymousClass38V> cls8 = AnonymousClass38V.class;
                                            hashMap.put(cls8, new AnonymousClass38V());
                                            Class<AnonymousClass4EJ> cls9 = AnonymousClass4EJ.class;
                                            Object obj9 = hashMap.get(cls7);
                                            if (obj9 != null) {
                                                AnonymousClass3II r13 = (AnonymousClass3II) obj9;
                                                Object obj10 = hashMap.get(cls3);
                                                if (obj10 != null) {
                                                    C684944a r112 = (C684944a) obj10;
                                                    Object obj11 = hashMap.get(cls4);
                                                    if (obj11 != null) {
                                                        AnonymousClass35J r122 = (AnonymousClass35J) obj11;
                                                        Object obj12 = hashMap.get(cls);
                                                        if (obj12 != null) {
                                                            C83224qz r15 = (C83224qz) obj12;
                                                            Object obj13 = hashMap.get(cls8);
                                                            if (obj13 != null) {
                                                                hashMap.put(cls9, new AnonymousClass4EJ(r112, r122, r13, (AnonymousClass38V) obj13, r15));
                                                                Class<AnonymousClass4EI> cls10 = AnonymousClass4EI.class;
                                                                Object obj14 = hashMap.get(cls4);
                                                                if (obj14 != null) {
                                                                    AnonymousClass35J r4 = (AnonymousClass35J) obj14;
                                                                    Object obj15 = hashMap.get(cls);
                                                                    if (obj15 != null) {
                                                                        hashMap.put(cls10, new AnonymousClass4EI(r4, (AnonymousClass38V) hashMap.get(cls8), (C83224qz) obj15));
                                                                        return new AnonymousClass3IW();
                                                                    }
                                                                    throw C18210wN.A0W("null cannot be cast to non-null type kotlinx.coroutines.CoroutineScope");
                                                                }
                                                                throw C18210wN.A0W("null cannot be cast to non-null type com.instagram.notifications.badging.intf.BadgingConfigurationProvider");
                                                            }
                                                            throw C18210wN.A0W("null cannot be cast to non-null type com.instagram.notifications.badging.ui.viewmodel.ToastingBadgeUiState");
                                                        }
                                                        throw C18210wN.A0W("null cannot be cast to non-null type kotlinx.coroutines.CoroutineScope");
                                                    }
                                                    throw C18210wN.A0W("null cannot be cast to non-null type com.instagram.notifications.badging.intf.BadgingConfigurationProvider");
                                                }
                                                throw C18210wN.A0W("null cannot be cast to non-null type com.instagram.notifications.badging.intf.BadgingAnalyticsLogger");
                                            }
                                            throw C18210wN.A0W("null cannot be cast to non-null type com.instagram.notifications.badging.repository.BadgingRepository");
                                        }
                                        throw C18210wN.A0W("null cannot be cast to non-null type com.instagram.notifications.badging.intf.BadgingConfigurationProvider");
                                    }
                                    throw C18210wN.A0W("null cannot be cast to non-null type kotlinx.coroutines.CoroutineScope");
                                }
                                throw C18210wN.A0W("null cannot be cast to non-null type com.instagram.notifications.badging.intf.BadgingConfigurationProvider");
                            }
                            throw C18210wN.A0W("null cannot be cast to non-null type com.instagram.notifications.badging.api.BadgingApi");
                        }
                        throw C18210wN.A0W("null cannot be cast to non-null type com.instagram.notifications.badging.graph.UseCaseGraph");
                    }
                    throw C18210wN.A0W("null cannot be cast to non-null type com.instagram.notifications.badging.intf.BadgingConfigurationProvider");
                }
                throw C18210wN.A0W("null cannot be cast to non-null type com.instagram.notifications.badging.intf.BadgeLoggingDeBouncer");
            case 6:
                StringBuilder A0r = C18200wM.A0r();
                StringBuilder A0r2 = C18200wM.A0r();
                AnonymousClass17J r82 = (AnonymousClass17J) this.A00;
                A0r2.append(r82.A03);
                A0r2.append('(');
                int i = r82.A01;
                A0r2.append(i);
                A0r.append(C18180wK.A0i("),", A0r2));
                List<AnonymousClass17J> list = r82.A04;
                if (list != null) {
                    for (AnonymousClass17J r0 : list) {
                        int i2 = r0.A01;
                        if (i2 > 0) {
                            StringBuilder A0r3 = C18200wM.A0r();
                            A0r3.append(r0.A03);
                            A0r3.append('(');
                            A0r3.append(i2);
                            A0r.append(C18180wK.A0i("),", A0r3));
                        }
                    }
                }
                String A0i = C18180wK.A0i(AnonymousClass00U.A0J("totalCount=", i + r82.A00), A0r);
                C04220Ms.A06(A0i);
                return A0i;
            case 7:
                return ((View) this.A00).findViewById(R.id.container);
            case 8:
                AnonymousClass25P r1 = AnonymousClass25P.TOAST;
                C29511yH r52 = (C29511yH) this.A00;
                return AnonymousClass4WJ.A0H(C18180wK.A0p(r1, r52.getToastBadge()), C18180wK.A0p(AnonymousClass25P.DOT, r52.getLedBadge()), C18180wK.A0p(AnonymousClass25P.SMALL_DOT, r52.getToastBadge()), C18180wK.A0p(AnonymousClass25P.NUMBERED, r52.getNumberBadge()));
            case 9:
                return ((View) this.A00).findViewById(R.id.led_badge);
            case 10:
                return ((View) this.A00).findViewById(R.id.number_badge);
            case 11:
                return ((View) this.A00).findViewById(R.id.dot_badge);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                if (((C29511yH) this.A00).A06 != null) {
                    return "20";
                }
                return null;
            case 13:
                C29511yH r14 = (C29511yH) this.A00;
                return r14.getViewModelFactory().AFH(r14.A02, r14.A03, r14.A05, r14.A04, new KtLambdaShape90S0100000_I2_70(r14, 12), r14.A00, r14.A0A, r14.A0B);
            case 14:
                Object obj16 = AnonymousClass31B.A00.get(AnonymousClass4EI.class);
                if (obj16 != null) {
                    AnonymousClass4EI r53 = (AnonymousClass4EI) obj16;
                    r53.A00 = ((MutableBadgeView) this.A00).A00;
                    return r53;
                }
                throw C18210wN.A0W("null cannot be cast to non-null type com.instagram.notifications.badging.ui.viewmodel.MutableBadgeViewModel.Factory");
            case 15:
                Object obj17 = AnonymousClass31B.A00.get(AnonymousClass4EJ.class);
                if (obj17 != null) {
                    AnonymousClass4EJ r54 = (AnonymousClass4EJ) obj17;
                    ToastingBadge toastingBadge = (ToastingBadge) this.A00;
                    r54.A01 = toastingBadge.getUseCase();
                    AnonymousClass25R r02 = toastingBadge.A01;
                    C04220Ms.A0B(r02, 0);
                    r54.A00 = r02;
                    r54.A02 = toastingBadge.A02;
                    return r54;
                }
                throw C18210wN.A0W("null cannot be cast to non-null type com.instagram.notifications.badging.ui.viewmodel.ToastingBadgeViewModel.Factory");
            case 16:
                return new Pair[((C84714tk[]) this.A00).length];
            case LangUtils.HASH_SEED /*17*/:
                AnonymousClass49F r3 = (AnonymousClass49F) this.A00;
                r3.A03.A00(new AnonymousClass4EL(r3), r3.A04);
                return Unit.A00;
            case 18:
                return new AnonymousClass35L(AnonymousClass3Zs.A03((UserSession) this.A00).A01(D2R.A1S));
            case 19:
                return new C30998Gd5((C10300i6) this.A00);
            case 20:
                return new C30541GIx((UserSession) this.A00);
            case 21:
                return new AnonymousClass35N(new AnonymousClass35M(H89.A01((UserSession) this.A00, "IgRxPushNotification").A03.A0H(GYG.A02("push_notifications"))));
            case 22:
            case 23:
                return AnonymousClass0RA.A0C.A04(C18230wP.A0D(this.A00));
            case 24:
                return ((C27231sB) this.A00).A00.mErrorType;
            case 25:
                return ((C27231sB) this.A00).A00.A07;
            case Rfc3492Idn.tmax /*26*/:
                return Integer.valueOf(((C27231sB) this.A00).A00.A00);
            case 27:
                return ((C27231sB) this.A00).A00.A0A;
            case 28:
                return ((C27231sB) this.A00).A00.A02;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return ((C27231sB) this.A00).A00.A0C;
            case 30:
                return ((C27231sB) this.A00).A00;
            case 31:
                User user = ((C27231sB) this.A00).A00.A05;
                C04220Ms.A06(user);
                return user;
            case 32:
                List list2 = ((C27241sC) this.A00).A00.A0A;
                if (list2 != null) {
                    return ImmutableList.copyOf((Collection) list2);
                }
                return null;
            case 33:
                return ((C27241sC) this.A00).A00.mErrorType;
            case 34:
                return ((C27241sC) this.A00).A00.A03;
            case 35:
                return ((C27241sC) this.A00).A00.A06;
            case Rfc3492Idn.base /*36*/:
                return ((C27241sC) this.A00).A00;
            case LangUtils.HASH_OFFSET /*37*/:
                User user2 = ((C27241sC) this.A00).A00.A00;
                C04220Ms.A06(user2);
                return user2;
            case Rfc3492Idn.skew /*38*/:
                AymhViewModel aymhViewModel = (AymhViewModel) this.A00;
                C19280zc r55 = new C19280zc(aymhViewModel);
                C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape12S0301000_I2_4(aymhViewModel, r55, (C146958n9) null, 35), AnonymousClass3J5.A00(aymhViewModel), 3);
                return r55;
            case 39:
            case LineChartAxesView.AXIS_TICK_OFFSET /*40*/:
            case Seq.NULL_REFNUM /*41*/:
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return C18180wK.A0W((Fragment) this.A00, AnonymousClass0RA.A0C);
            case 43:
                return AnonymousClass0wJ.A0n((EditText) this.A00);
            case 44:
                ((AnonymousClass3z3) this.A00).A00.Ben(1);
                return Unit.A00;
            case 45:
                return new C696649n((UserSession) this.A00);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN:
                UserSession userSession2 = ((C696649n) this.A00).A00;
                return ((C132357tl) userSession2.A01(C132357tl.class, new KtLambdaShape23S0100000_I2_3(userSession2, 35))).A03.getValue();
            case 47:
                return C63803iN.A07(AnonymousClass0TJ.A05, ((AnonymousClass7EN) this.A00).A01, 36605692732772814L);
            case 48:
                UserSession userSession3 = ((AnonymousClass7EN) this.A00).A01;
                return userSession3.A01(C696649n.class, new KtLambdaShape90S0100000_I2_70(userSession3, 45));
            case 49:
                return C63803iN.A06(AnonymousClass0TJ.A05, ((AnonymousClass7EN) this.A00).A01, 37168642684944650L);
            default:
                Uri uri2 = ((InlineLinkUrn) this.A00).A00;
                if (uri2 != null) {
                    return uri2.getHost();
                }
                return null;
        }
    }
}
