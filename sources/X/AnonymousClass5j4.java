package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.facebook.graphql.calls.GQLCallInputCInputShape0S0000000;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.redex.IDxFunctionShape152S0200000_2_I2;
import com.facebook.redex.IDxObserverShape55S0300000_2_I2;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.EcpUIConfiguration;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.fbpay.logging.LoggingContext;
import com.instagram.barcelona.R;
import kotlin.coroutines.jvm.internal.KtSLambdaShape0S4201000_I2;
import kotlin.jvm.internal.KtLambdaShape26S0100000_I2_6;

/* renamed from: X.5j4  reason: invalid class name */
public final class AnonymousClass5j4 extends AnonymousClass567 implements C145328kK {
    public ContextThemeWrapper A00;
    public ShimmerFrameLayout A01;
    public ShimmerFrameLayout A02;
    public ShimmerFrameLayout A03;
    public C882557i A04;
    public ECPHandler A05;
    public EcpUIConfiguration A06;
    public LoggingContext A07;

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            View requireViewById = view.requireViewById(R.id.title_shimmer_view);
            String A002 = AnonymousClass000.A00(1);
            C04220Ms.A0C(requireViewById, A002);
            this.A03 = (ShimmerFrameLayout) requireViewById;
            View requireViewById2 = view.requireViewById(R.id.subtitle_shimmer_view);
            C04220Ms.A0C(requireViewById2, A002);
            this.A02 = (ShimmerFrameLayout) requireViewById2;
            View requireViewById3 = view.requireViewById(R.id.body_shimmer_view);
            C04220Ms.A0C(requireViewById3, A002);
            this.A01 = (ShimmerFrameLayout) requireViewById3;
            ViewGroup A0J = C18220wO.A0J(view, R.id.ecp_loading_layout);
            EcpUIConfiguration ecpUIConfiguration = this.A06;
            if (ecpUIConfiguration == null) {
                C04220Ms.A0E("ecpUIConfiguration");
                throw null;
            }
            if (ecpUIConfiguration.A07.A07) {
                AnonymousClass7IS r0 = AnonymousClass6XN.A00;
                C04220Ms.A04(A0J);
                r0.A04(A0J);
            }
            ShimmerFrameLayout shimmerFrameLayout = this.A03;
            if (shimmerFrameLayout == null) {
                C04220Ms.A0E("titleShimmerView");
                throw null;
            }
            AnonymousClass7Kz.A0G();
            getContext();
            C86144wL.A19(activity.getDrawable(R.drawable.fbpay_shimmer_background), shimmerFrameLayout, AnonymousClass7Kz.A0G().A03(getContext(), 15));
            ShimmerFrameLayout shimmerFrameLayout2 = this.A02;
            if (shimmerFrameLayout2 == null) {
                C04220Ms.A0E("subtitleShimmerView");
                throw null;
            }
            AnonymousClass7Kz.A0G();
            getContext();
            Drawable drawable = activity.getDrawable(R.drawable.fbpay_shimmer_background);
            C121097Ec.A00(getContext(), drawable, AnonymousClass7Kz.A0G(), 15);
            shimmerFrameLayout2.setBackground(drawable);
            ShimmerFrameLayout shimmerFrameLayout3 = this.A01;
            if (shimmerFrameLayout3 == null) {
                C04220Ms.A0E("bodyShimmerView");
                throw null;
            }
            AnonymousClass7Kz.A0G();
            getContext();
            Drawable drawable2 = activity.getDrawable(R.drawable.fbpay_shimmer_background);
            C121097Ec.A00(getContext(), drawable2, AnonymousClass7Kz.A0G(), 15);
            shimmerFrameLayout3.setBackground(drawable2);
            ShimmerFrameLayout shimmerFrameLayout4 = this.A03;
            if (shimmerFrameLayout4 == null) {
                C04220Ms.A0E("titleShimmerView");
                throw null;
            }
            D57.A00(shimmerFrameLayout4, (Integer) null);
            ShimmerFrameLayout shimmerFrameLayout5 = this.A02;
            if (shimmerFrameLayout5 == null) {
                C04220Ms.A0E("subtitleShimmerView");
                throw null;
            }
            D57.A00(shimmerFrameLayout5, (Integer) null);
            ShimmerFrameLayout shimmerFrameLayout6 = this.A01;
            if (shimmerFrameLayout6 == null) {
                C04220Ms.A0E("bodyShimmerView");
                throw null;
            }
            D57.A00(shimmerFrameLayout6, (Integer) null);
            ShimmerFrameLayout shimmerFrameLayout7 = this.A03;
            if (shimmerFrameLayout7 == null) {
                C04220Ms.A0E("titleShimmerView");
                throw null;
            }
            shimmerFrameLayout7.setVisibility(0);
            ShimmerFrameLayout shimmerFrameLayout8 = this.A02;
            if (shimmerFrameLayout8 == null) {
                C04220Ms.A0E("subtitleShimmerView");
                throw null;
            }
            shimmerFrameLayout8.setVisibility(0);
            ShimmerFrameLayout shimmerFrameLayout9 = this.A01;
            if (shimmerFrameLayout9 == null) {
                C04220Ms.A0E("bodyShimmerView");
                throw null;
            }
            shimmerFrameLayout9.setVisibility(0);
        }
        C882557i r02 = this.A04;
        if (r02 != null) {
            C86104wH.A1F(this, r02.A06, 174);
            C882557i r03 = this.A04;
            if (r03 != null) {
                C86104wH.A1F(this, r03.A05, 175);
                return;
            }
        }
        C04220Ms.A0E("ecpUrlViewModel");
        throw null;
    }

    public final void CkR(ECPHandler eCPHandler) {
        this.A05 = eCPHandler;
        C882557i r1 = this.A04;
        if (r1 == null) {
            return;
        }
        if (eCPHandler != null) {
            ECPHandler eCPHandler2 = r1.A00;
            if (eCPHandler2 == null || eCPHandler2.equals(eCPHandler)) {
                r1.A00 = eCPHandler;
                return;
            }
            throw C18180wK.A0a("Cannot override previous ECP handler with a new handler for the same checkout ViewModel instance");
        }
        throw C18180wK.A0a("Attempting to set null value for EcpHandler. This will result in lossy event-handling behavior");
    }

    public final boolean Bnq(LoggingContext loggingContext, Integer num) {
        boolean A1Z = AnonymousClass0wJ.A1Z(num, loggingContext);
        C882557i r0 = this.A04;
        if (r0 == null) {
            C04220Ms.A0E("ecpUrlViewModel");
            throw null;
        }
        r0.A00(loggingContext, num);
        return A1Z;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1206022619);
        super.onCreate(bundle);
        C882557i r3 = (C882557i) new AnonymousClass7IU(this).A01(C882557i.class);
        this.A04 = r3;
        ECPHandler eCPHandler = this.A05;
        if (eCPHandler != null) {
            if (r3 != null) {
                ECPHandler eCPHandler2 = r3.A00;
                if (eCPHandler2 == null || eCPHandler2.equals(eCPHandler)) {
                    r3.A00 = eCPHandler;
                } else {
                    throw C18180wK.A0a("Cannot override previous ECP handler with a new handler for the same checkout ViewModel instance");
                }
            }
            C04220Ms.A0E("ecpUrlViewModel");
            throw null;
        }
        C882557i r10 = this.A04;
        if (r10 != null) {
            Bundle requireArguments = requireArguments();
            r10.A06.A0H((Object) null);
            r10.A05.A0H((Object) null);
            String A002 = AnonymousClass7C6.A00();
            String string = requireArguments.getString(A002);
            if (string != null) {
                r10.A04 = string;
                String string2 = requireArguments.getString("product_id");
                if (string2 != null) {
                    r10.A02 = string2;
                    String string3 = requireArguments.getString("order_id");
                    if (string3 != null) {
                        r10.A01 = string3;
                        String string4 = requireArguments.getString("receiver_id");
                        if (string4 != null) {
                            r10.A03 = string4;
                            boolean A052 = AnonymousClass7Kz.A0J().A05();
                            String str = r10.A04;
                            if (A052) {
                                if (str == null) {
                                    C04220Ms.A0E("sessionId");
                                    throw null;
                                }
                                String str2 = r10.A02;
                                if (str2 == null) {
                                    C04220Ms.A0E("productId");
                                    throw null;
                                }
                                String str3 = r10.A03;
                                if (str3 == null) {
                                    C04220Ms.A0E("receiverId");
                                    throw null;
                                }
                                String str4 = r10.A01;
                                if (str4 == null) {
                                    C04220Ms.A0E("orderId");
                                    throw null;
                                }
                                Parcelable parcelable = requireArguments.getParcelable("ECP_UI_CONFIGURATION");
                                if (parcelable != null) {
                                    C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape0S4201000_I2(r10, parcelable, str4, str3, str, str2, (C146958n9) null, 0), (C83224qz) r10.A07.getValue(), 3);
                                } else {
                                    throw C18180wK.A0a("Required value was null.");
                                }
                            } else if (str == null) {
                                C04220Ms.A0E("sessionId");
                                throw null;
                            } else {
                                String str5 = r10.A02;
                                if (str5 == null) {
                                    C04220Ms.A0E("productId");
                                    throw null;
                                }
                                String str6 = r10.A03;
                                if (str6 == null) {
                                    C04220Ms.A0E("receiverId");
                                    throw null;
                                }
                                String str7 = r10.A01;
                                if (str7 == null) {
                                    C04220Ms.A0E("orderId");
                                    throw null;
                                }
                                Parcelable parcelable2 = requireArguments.getParcelable("ECP_UI_CONFIGURATION");
                                if (parcelable2 != null) {
                                    M5J A032 = AnonymousClass7JJ.A02().A03(str, str5, str6, (String) null);
                                    ECPRepositoryImpl A023 = AnonymousClass7JJ.A02();
                                    GQLCallInputCInputShape0S0000000 A003 = GraphQlCallInput.A00();
                                    A003.A0F(str6, "receiver_id");
                                    A003.A0F(str7, "order_id");
                                    GQLCallInputCInputShape0S0000000 A004 = GraphQlCallInput.A00();
                                    A004.A0F(str, A002);
                                    A004.A0F(str5, "product_id");
                                    A004.A0B(A003, "paylink_input");
                                    C104996ci A0C = AnonymousClass7Kz.A0C();
                                    M5J A005 = AnonymousClass5k8.A00(AnonymousClass7Sl.A00, new IDxFunctionShape152S0200000_2_I2(6, A004, A023), A0C);
                                    C880756q A012 = C880756q.A01();
                                    AnonymousClass0MJ A17 = C86144wL.A17();
                                    AnonymousClass0MJ A172 = C86144wL.A17();
                                    C121277Fh.A02(A032, A012, new IDxObserverShape55S0300000_2_I2(A012, A17, A172, 25));
                                    C121277Fh.A02(A005, A012, new IDxObserverShape55S0300000_2_I2(A012, A172, A17, 26));
                                    C121277Fh.A03(A012, new C123977aB(r10, (EcpUIConfiguration) parcelable2, str6, str, str5, str7));
                                } else {
                                    throw C18180wK.A0a("Required value was null.");
                                }
                            }
                            Parcelable parcelable3 = requireArguments().getParcelable("ECP_UI_CONFIGURATION");
                            C04220Ms.A0C(parcelable3, "null cannot be cast to non-null type com.facebookpay.expresscheckout.models.EcpUIConfiguration");
                            this.A06 = (EcpUIConfiguration) parcelable3;
                            C14030oh.A09(1152000562, A022);
                            return;
                        }
                        throw C18180wK.A0a("Required value was null.");
                    }
                    throw C18180wK.A0a("Required value was null.");
                }
                throw C18180wK.A0a("Required value was null.");
            }
            throw C18180wK.A0a("Required value was null.");
        }
        C04220Ms.A0E("ecpUrlViewModel");
        throw null;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(2080278597);
        ContextThemeWrapper A002 = AnonymousClass567.A00(this, layoutInflater);
        this.A00 = A002;
        View inflate = layoutInflater.cloneInContext(A002).inflate(R.layout.ecp_loading_content_fragment, viewGroup, false);
        C14030oh.A09(-1458969016, A022);
        return inflate;
    }

    public final void onResume() {
        String str;
        int A022 = C14030oh.A02(-1345204402);
        super.onResume();
        ContextThemeWrapper contextThemeWrapper = this.A00;
        if (contextThemeWrapper == null) {
            str = "viewContext";
        } else {
            EcpUIConfiguration ecpUIConfiguration = this.A06;
            if (ecpUIConfiguration == null) {
                str = "ecpUIConfiguration";
            } else {
                AnonymousClass3JK.A00(contextThemeWrapper, this, ecpUIConfiguration.A07, (String) null, (String) null, new KtLambdaShape26S0100000_I2_6(this, 27), (AnonymousClass0ZU) null, 496, false);
                C14030oh.A09(1738224917, A022);
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }
}
