package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.model.business.BusinessInfo;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1cU  reason: invalid class name */
public final class AnonymousClass1cU extends C34640IcN implements C82424pb, C84294su, C82034oy, C84264sr {
    public static final String __redex_internal_original_name = "RenewProfessionalAccountFragment";
    public View A00;
    public ViewGroup A01;
    public ViewGroup A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public BusinessFlowAnalyticsLogger A07;
    public C84654td A08;
    public IgdsBottomButtonLayout A09;
    public SpinnerImageView A0A;
    public String A0B;
    public C24711ju A0C;
    public final Handler A0D = AnonymousClass0wJ.A0F();
    public final C04530Oa A0E = C80644m9.A00(this);

    public final void AHz() {
    }

    public final void AJV() {
    }

    public final void CGJ(String str, String str2, String str3) {
        String str4;
        String str5 = str2;
        boolean A1Y = AnonymousClass0wJ.A1Y(str, str2);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A07;
        if (businessFlowAnalyticsLogger == null) {
            str4 = "logger";
        } else {
            businessFlowAnalyticsLogger.Bdy(new C37408JrQ("renew", this.A0B, "switch_to_professional", str5, str3, (Map) null, (Map) null, (Map) null));
            C24711ju r0 = this.A0C;
            if (r0 == null) {
                str4 = "navBarHelper";
            } else {
                r0.A00();
                C63813iO.A02(requireContext(), str, (String) null, A1Y ? 1 : 0);
                return;
            }
        }
        C04220Ms.A0E(str4);
        throw null;
    }

    public final void CGO() {
    }

    public final String getModuleName() {
        return "renew_fragment";
    }

    public final void onAttach(Context context) {
        C04220Ms.A0B(context, 0);
        super.onAttach(context);
        C84654td A012 = C67293zJ.A01(this);
        if (A012 != null) {
            this.A08 = A012;
            return;
        }
        throw C18180wK.A0a("controller must not be null");
    }

    public static final void A00(AnonymousClass1cU r9) {
        C84654td r0 = r9.A08;
        String str = "controller";
        String str2 = str;
        if (r0 != null) {
            BusinessInfo businessInfo = AnonymousClass0wJ.A0R(r0).A07;
            C04220Ms.A06(businessInfo);
            C84654td r02 = r9.A08;
            if (r02 != null) {
                C67133yv A0R = AnonymousClass0wJ.A0R(r02);
                C84654td r03 = r9.A08;
                if (r03 != null) {
                    C62163Xl r2 = new C62163Xl(AnonymousClass0wJ.A0R(r03).A06);
                    r2.A09 = businessInfo.A09;
                    String str3 = businessInfo.A0A;
                    r2.A0A = str3;
                    r2.A0K = str3;
                    r2.A02 = businessInfo.A02;
                    r2.A03 = businessInfo.A03;
                    r2.A0P = C06810aP.A01.A01(AnonymousClass0wJ.A0X(r9.A0E)).A2z();
                    A0R.A06 = new BusinessInfo(r2);
                    IgdsBottomButtonLayout igdsBottomButtonLayout = r9.A09;
                    if (igdsBottomButtonLayout == null) {
                        str = "navBar";
                    } else {
                        igdsBottomButtonLayout.setVisibility(0);
                        View view = r9.A00;
                        if (view == null) {
                            str = "mainLayoutContainer";
                        } else {
                            view.setVisibility(0);
                            TextView textView = r9.A06;
                            if (textView == null) {
                                str = "titleTextView";
                            } else {
                                C18180wK.A10(textView, r9, 2131834776);
                                TextView textView2 = r9.A05;
                                if (textView2 == null) {
                                    str = "subTitleTextView";
                                } else {
                                    C18180wK.A10(textView2, r9, 2131834775);
                                    ViewGroup viewGroup = r9.A02;
                                    str = "categoryRow";
                                    if (viewGroup != null) {
                                        View requireViewById = viewGroup.requireViewById(R.id.primary_text);
                                        C04220Ms.A0C(requireViewById, "null cannot be cast to non-null type android.widget.TextView");
                                        C18180wK.A10((TextView) requireViewById, r9, 2131823204);
                                        ViewGroup viewGroup2 = r9.A02;
                                        if (viewGroup2 != null) {
                                            TextView A0K = C18200wM.A0K(viewGroup2, R.id.secondary_text);
                                            C84654td r04 = r9.A08;
                                            if (r04 == null) {
                                                str = str2;
                                            } else {
                                                A0K.setText(AnonymousClass0wJ.A0R(r04).A06.A0A);
                                                TextView textView3 = r9.A04;
                                                if (textView3 == null) {
                                                    str = "categorySubtitle";
                                                } else {
                                                    C18180wK.A10(textView3, r9, 2131834772);
                                                    ViewGroup viewGroup3 = r9.A01;
                                                    str = "accountTypeRow";
                                                    if (viewGroup3 != null) {
                                                        C18180wK.A10(C18200wM.A0K(viewGroup3, R.id.primary_text), r9, 2131834777);
                                                        ViewGroup viewGroup4 = r9.A01;
                                                        if (viewGroup4 != null) {
                                                            C18180wK.A10(C18200wM.A0K(viewGroup4, R.id.secondary_text), r9, 2131820885);
                                                            TextView textView4 = r9.A03;
                                                            if (textView4 == null) {
                                                                str = "accountTypeSubtitle";
                                                            } else {
                                                                C18180wK.A10(textView4, r9, 2131820884);
                                                                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = r9.A07;
                                                                if (businessFlowAnalyticsLogger == null) {
                                                                    str = "logger";
                                                                } else {
                                                                    businessFlowAnalyticsLogger.Bdt(new C37408JrQ("renew", r9.A0B, (String) null, (String) null, (String) null, r9.A03(), (Map) null, (Map) null));
                                                                    return;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public static final void A01(AnonymousClass1cU r3) {
        C84654td r2 = r3.A08;
        if (r2 != null) {
            r2.ClA(C311924p.INTEREST_ACCOUNT_CONVERSION);
            C84654td r22 = r3.A08;
            if (r22 != null) {
                ((BusinessConversionActivity) r22).A0J((Bundle) null, false);
                return;
            }
        }
        C04220Ms.A0E("controller");
        throw null;
    }

    private final void A02(String str) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A07;
        if (businessFlowAnalyticsLogger == null) {
            C18240wQ.A0p();
            throw null;
        }
        businessFlowAnalyticsLogger.Be5(new C37408JrQ("renew", this.A0B, str, (String) null, (String) null, A03(), (Map) null, (Map) null));
    }

    public final void CCX() {
        A02("continue");
        C84654td r0 = this.A08;
        if (r0 == null) {
            C04220Ms.A0E("controller");
            throw null;
        }
        ((BusinessConversionActivity) r0).A0I(requireContext(), this, this, AnonymousClass266.A04, "renew", false);
    }

    public final void CGY() {
        C24711ju r0 = this.A0C;
        if (r0 == null) {
            C04220Ms.A0E("navBarHelper");
            throw null;
        } else {
            r0.A01();
        }
    }

    public final void CGg(AnonymousClass266 r11) {
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A07;
        if (businessFlowAnalyticsLogger == null) {
            C18240wQ.A0p();
            throw null;
        }
        businessFlowAnalyticsLogger.Bdx(new C37408JrQ("renew", this.A0B, "switch_to_professional", (String) null, (String) null, (Map) null, (Map) null, (Map) null));
        AnonymousClass2KW.A00(C63873iU.A06(this, 20), AnonymousClass0wJ.A0U(this.A0E), this, false);
    }

    public final void CJ9() {
        A02("skip");
        C84654td r2 = this.A08;
        if (r2 != null) {
            r2.ClA(C311924p.INTEREST_ACCOUNT_CONVERSION);
            C84654td r22 = this.A08;
            if (r22 != null) {
                ((BusinessConversionActivity) r22).A0J((Bundle) null, true);
                return;
            }
        }
        C04220Ms.A0E("controller");
        throw null;
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        if (r3 != null) {
            r3.setTitle("");
            AnonymousClass4u2.A04(C18190wL.A0K(), r3, this, 165);
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A0E);
    }

    public final boolean onBackPressed() {
        String str;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = this.A07;
        if (businessFlowAnalyticsLogger == null) {
            str = "logger";
        } else {
            businessFlowAnalyticsLogger.BbZ(new C37408JrQ("renew", this.A0B, (String) null, (String) null, (String) null, A03(), (Map) null, (Map) null));
            C84654td r0 = this.A08;
            if (r0 == null) {
                str = "controller";
            } else {
                ((BusinessConversionActivity) r0).CfG((Bundle) null);
                return true;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final Map A03() {
        String str;
        HashMap A0y = AnonymousClass0wJ.A0y();
        C84654td r0 = this.A08;
        String str2 = null;
        if (r0 == null) {
            C04220Ms.A0E("controller");
            throw null;
        }
        A0y.put("category_id", AnonymousClass0wJ.A0R(r0).A06.A09);
        C84654td r02 = this.A08;
        if (r02 == null) {
            C04220Ms.A0E("controller");
            throw null;
        }
        AnonymousClass266 r03 = AnonymousClass0wJ.A0R(r02).A06.A02;
        if (r03 != null) {
            str = r03.A01;
        } else {
            str = null;
        }
        A0y.put("category_account_type", str);
        C84654td r04 = this.A08;
        if (r04 == null) {
            C04220Ms.A0E("controller");
            throw null;
        }
        AnonymousClass266 r05 = AnonymousClass0wJ.A0R(r04).A06.A03;
        if (r05 != null) {
            str2 = r05.A01;
        }
        A0y.put("previous_account_type", str2);
        return A0y;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1214956724);
        super.onCreate(bundle);
        this.A0B = C18190wL.A0k(this);
        C10300i6 A0U = AnonymousClass0wJ.A0U(this.A0E);
        C84654td r0 = this.A08;
        if (r0 != null) {
            C311924p Aiz = r0.Aiz();
            C84654td r02 = this.A08;
            if (r02 != null) {
                BusinessFlowAnalyticsLogger A0O = C18190wL.A0O(Aiz, this, A0U, r02);
                if (A0O != null) {
                    this.A07 = A0O;
                    C14030oh.A09(-1554861809, A022);
                    return;
                }
                IllegalStateException A0a = C18180wK.A0a("received null flowType or unexpected value for flowType");
                C14030oh.A09(-1802025524, A022);
                throw A0a;
            }
        }
        C04220Ms.A0E("controller");
        throw null;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        AnonymousClass266 r1;
        AnonymousClass266 r0;
        int A022 = C14030oh.A02(-1818122296);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.renew_professional_account_fragment, viewGroup, false);
        this.A0A = (SpinnerImageView) AnonymousClass0wJ.A0J(inflate, R.id.loading_indicator);
        this.A00 = AnonymousClass0wJ.A0K(inflate, R.id.renew_layout_container);
        this.A06 = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.title);
        this.A05 = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.subtitle);
        this.A02 = (ViewGroup) AnonymousClass0wJ.A0J(inflate, R.id.category_row);
        this.A01 = (ViewGroup) AnonymousClass0wJ.A0J(inflate, R.id.account_type_row);
        this.A04 = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.category_subtitle);
        this.A03 = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.account_type_subtitle);
        IgdsBottomButtonLayout igdsBottomButtonLayout = (IgdsBottomButtonLayout) AnonymousClass0wJ.A0J(inflate, R.id.navigation_bar);
        this.A09 = igdsBottomButtonLayout;
        if (igdsBottomButtonLayout != null) {
            this.A0C = new C24711ju((C84264sr) this, igdsBottomButtonLayout, 2131834773, 2131834774);
            IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A09;
            if (igdsBottomButtonLayout2 != null) {
                igdsBottomButtonLayout2.setVisibility(8);
                C24711ju r02 = this.A0C;
                if (r02 == null) {
                    C04220Ms.A0E("navBarHelper");
                    throw null;
                }
                registerLifecycleListener(r02);
                C04530Oa r6 = this.A0E;
                C10300i6 A0U = AnonymousClass0wJ.A0U(r6);
                C84654td r03 = this.A08;
                if (r03 == null) {
                    C04220Ms.A0E("controller");
                    throw null;
                }
                boolean equals = "LATEST_CONVERTED_ACCOUNT".equals(AnonymousClass0wJ.A0R(r03).A0E);
                C84654td r04 = this.A08;
                if (r04 == null) {
                    C04220Ms.A0E("controller");
                    throw null;
                }
                BusinessInfo businessInfo = AnonymousClass0wJ.A0R(r04).A07;
                if (businessInfo != null) {
                    str = businessInfo.A09;
                } else {
                    str = null;
                }
                C84654td r05 = this.A08;
                if (r05 == null) {
                    C04220Ms.A0E("controller");
                    throw null;
                }
                BusinessInfo businessInfo2 = AnonymousClass0wJ.A0R(r05).A07;
                if (businessInfo2 != null) {
                    r1 = businessInfo2.A02;
                } else {
                    r1 = null;
                }
                C84654td r06 = this.A08;
                if (r06 == null) {
                    C04220Ms.A0E("controller");
                    throw null;
                }
                BusinessInfo businessInfo3 = AnonymousClass0wJ.A0R(r06).A07;
                if (businessInfo3 != null) {
                    r0 = businessInfo3.A03;
                } else {
                    r0 = null;
                }
                if (C67333zN.A07(A0U, r1, r0, str, equals)) {
                    A00(this);
                } else {
                    SpinnerImageView spinnerImageView = this.A0A;
                    if (spinnerImageView == null) {
                        C04220Ms.A0E("loadingSpinner");
                        throw null;
                    }
                    spinnerImageView.setVisibility(0);
                    C67203z9.A02(requireContext(), AnonymousClass06E.A00(this), new C681242k(this), AnonymousClass0wJ.A0U(r6));
                }
                C14030oh.A09(1210128910, A022);
                return inflate;
            }
        }
        C04220Ms.A0E("navBar");
        throw null;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1227860402);
        C24711ju r0 = this.A0C;
        if (r0 == null) {
            C04220Ms.A0E("navBarHelper");
            throw null;
        }
        unregisterLifecycleListener(r0);
        super.onDestroyView();
        C14030oh.A09(-1352171080, A022);
    }
}
