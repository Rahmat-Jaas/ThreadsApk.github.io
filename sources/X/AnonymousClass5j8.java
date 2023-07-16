package X;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import com.facebook.graphql.impls.PaymentMethodComponentImpl;
import com.facebook.redex.IDxCListenerShape508S0100000_2_I2;
import com.facebook.redex.IDxONavigationShape640S0100000_2_I2;
import com.facebook.redex.IDxObserverShape28S0400000_2_I2;
import com.facebook.redex.IDxPDismissShape737S0100000_2_I2;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.CheckoutConfiguration;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.facebookpay.form.view.FormLayout;
import com.facebookpay.widget.banner.FBPayBanner;
import com.facebookpay.widget.button.FBPayButton;
import com.facebookpay.widget.listcell.ListCell;
import com.fbpay.logging.LoggingContext;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape26S0100000_I2_6;

/* renamed from: X.5j8  reason: invalid class name */
public final class AnonymousClass5j8 extends AnonymousClass567 implements C145328kK {
    public ContextThemeWrapper A00;
    public LayoutInflater A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public ViewGroup A06;
    public FrameLayout A07;
    public FrameLayout A08;
    public FrameLayout A09;
    public LinearLayout A0A;
    public LinearLayout A0B;
    public ProgressBar A0C;
    public TextView A0D;
    public ConstraintLayout A0E;
    public NestedScrollView A0F;
    public C91715gg A0G;
    public C91705gf A0H;
    public ECPHandler A0I;
    public ECPPaymentRequest A0J;
    public AnonymousClass69R A0K;
    public AnonymousClass58J A0L;
    public C92225hp A0M;
    public FormLayout A0N;
    public C883057n A0O;
    public FBPayBanner A0P;
    public FBPayButton A0Q;
    public ListCell A0R;
    public LoggingContext A0S;
    public boolean A0T;
    public final C880856r A0U = C880856r.A03();
    public final C143158gC A0V = C86114wI.A0Q(this, 159);
    public final C143158gC A0W = C86114wI.A0Q(this, 161);
    public final C143158gC A0X = C86114wI.A0Q(this, 162);
    public final C143158gC A0Y = C86114wI.A0Q(this, 168);
    public final AnonymousClass0YP A0Z = C86164wN.A0u(this, 36);

    private final void A04() {
        String str;
        M5J D7U;
        M5J D7U2;
        ECPPaymentRequest eCPPaymentRequest = this.A0J;
        if (eCPPaymentRequest == null) {
            str = "ecpPaymentRequest";
        } else {
            CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
            boolean z = true;
            if (checkoutConfiguration == null || !checkoutConfiguration.A0B.contains(AnonymousClass68M.NUX_PAYMENT_RECEIVER)) {
                z = false;
            }
            if (z) {
                ListCell listCell = this.A0R;
                if (listCell != null) {
                    listCell.setVisibility(8);
                    ConstraintLayout constraintLayout = this.A0E;
                    String str2 = "productDetailsContainer";
                    str = str2;
                    if (constraintLayout != null) {
                        View requireViewById = constraintLayout.requireViewById(R.id.product_image_icon);
                        C04220Ms.A06(requireViewById);
                        AnonymousClass7Fe.A01(requireViewById, R.style.FBPayUIEntityListCellLeftAddOnIcon);
                        ConstraintLayout constraintLayout2 = this.A0E;
                        if (constraintLayout2 != null) {
                            TextView textView = (TextView) AnonymousClass0wJ.A0J(constraintLayout2, R.id.total_price_text_view);
                            AnonymousClass7Kz.A0G();
                            ContextThemeWrapper contextThemeWrapper = this.A00;
                            if (contextThemeWrapper != null) {
                                C18180wK.A0s(contextThemeWrapper, textView, R.color.igds_primary_text);
                                ConstraintLayout constraintLayout3 = this.A0E;
                                if (constraintLayout3 != null) {
                                    TextView textView2 = (TextView) AnonymousClass0wJ.A0J(constraintLayout3, R.id.item_description_text_view);
                                    AnonymousClass7Kz.A0G();
                                    ContextThemeWrapper contextThemeWrapper2 = this.A00;
                                    if (contextThemeWrapper2 != null) {
                                        C18180wK.A0s(contextThemeWrapper2, textView2, R.color.igds_primary_text);
                                        ConstraintLayout constraintLayout4 = this.A0E;
                                        if (constraintLayout4 != null) {
                                            TextView A0L2 = AnonymousClass0wJ.A0L(constraintLayout4, R.id.see_details_text_view);
                                            ECPPaymentRequest eCPPaymentRequest2 = this.A0J;
                                            str2 = "ecpPaymentRequest";
                                            if (eCPPaymentRequest2 != null) {
                                                if (eCPPaymentRequest2.A04.A09.A01.intValue() != 1) {
                                                    A0L2.setTextSize(0, A0L2.getResources().getDimension(R.dimen.auth_title_text_size));
                                                    AnonymousClass7Fd.A01(A0L2, 8, 5);
                                                    C86104wH.A1C(A0L2, 41, this);
                                                    A0L2.setText(2131826633);
                                                } else {
                                                    AnonymousClass7Kz.A0G();
                                                    ContextThemeWrapper contextThemeWrapper3 = this.A00;
                                                    if (contextThemeWrapper3 != null) {
                                                        C18180wK.A0s(contextThemeWrapper3, A0L2, R.color.igds_primary_text);
                                                        AnonymousClass7Kz.A0G();
                                                        ContextThemeWrapper contextThemeWrapper4 = this.A00;
                                                        if (contextThemeWrapper4 != null) {
                                                            A0L2.setLinkTextColor(C18210wN.A01(contextThemeWrapper4));
                                                            C18180wK.A0z(A0L2);
                                                            ContextThemeWrapper contextThemeWrapper5 = this.A00;
                                                            if (contextThemeWrapper5 != null) {
                                                                A0L2.setText(C99116Ie.A00(contextThemeWrapper5, AnonymousClass0wJ.A0k(contextThemeWrapper5, 2131826550)));
                                                            }
                                                        }
                                                    }
                                                }
                                                ConstraintLayout constraintLayout5 = this.A0E;
                                                if (constraintLayout5 != null) {
                                                    TextView A0L3 = AnonymousClass0wJ.A0L(constraintLayout5, R.id.terms_text_view);
                                                    ECPPaymentRequest eCPPaymentRequest3 = this.A0J;
                                                    if (eCPPaymentRequest3 != null) {
                                                        String str3 = eCPPaymentRequest3.A04.A09.A00;
                                                        if (str3 != null) {
                                                            AnonymousClass7Kz.A0G();
                                                            ContextThemeWrapper contextThemeWrapper6 = this.A00;
                                                            if (contextThemeWrapper6 != null) {
                                                                C18180wK.A0s(contextThemeWrapper6, A0L3, R.color.igds_primary_text);
                                                                AnonymousClass7Kz.A0G();
                                                                ContextThemeWrapper contextThemeWrapper7 = this.A00;
                                                                if (contextThemeWrapper7 != null) {
                                                                    A0L3.setLinkTextColor(C18210wN.A01(contextThemeWrapper7));
                                                                    C18180wK.A0z(A0L3);
                                                                    ContextThemeWrapper contextThemeWrapper8 = this.A00;
                                                                    if (contextThemeWrapper8 != null) {
                                                                        String A0k = AnonymousClass0wJ.A0k(contextThemeWrapper8, 2131826549);
                                                                        ArrayList A0v = AnonymousClass0wJ.A0v();
                                                                        C86164wN.A1L("[[developer_terms_token]]", str3, A0v, 2131826595);
                                                                        A0L3.setText(C99186Il.A00(contextThemeWrapper8, ImmutableList.copyOf((Collection) A0v), A0k).A00(new IDxCListenerShape508S0100000_2_I2(contextThemeWrapper8, 10), false));
                                                                        A0L3.setVisibility(0);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        ECPHandler eCPHandler = this.A0I;
                                                        if (eCPHandler != null && (D7U2 = eCPHandler.D7U()) != null) {
                                                            D7U2.A0C(this, new IDxObserverShape28S0400000_2_I2(1, textView, this, textView2, requireViewById));
                                                            return;
                                                        }
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            C04220Ms.A0E("wrapperContext");
                            throw null;
                        }
                    }
                    C04220Ms.A0E(str2);
                    throw null;
                }
            } else {
                ConstraintLayout constraintLayout6 = this.A0E;
                if (constraintLayout6 == null) {
                    str = "productDetailsContainer";
                } else {
                    constraintLayout6.setVisibility(8);
                    ListCell listCell2 = this.A0R;
                    if (listCell2 != null) {
                        listCell2.setVisibility(8);
                        ECPHandler eCPHandler2 = this.A0I;
                        if (eCPHandler2 != null && (D7U = eCPHandler2.D7U()) != null) {
                            C121277Fh.A01(this, D7U, C86114wI.A0Q(this, 164));
                            return;
                        }
                        return;
                    }
                }
            }
            str = "subtotal";
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public static final boolean A0D(AnonymousClass0YP r3, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                r3.invoke(true, (Object) null);
                return true;
            }
        } else if (!z2) {
            return true;
        }
        if (!z || z2) {
            r3.invoke(false, C18250wR.A0V("Component was loaded but is not required"));
            return false;
        }
        r3.invoke(false, C18250wR.A0V("Required component failed to load"));
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0414, code lost:
        r1 = r1.replaceAll("\\[\\[.*\\]\\]", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05e4, code lost:
        if (r1 == X.AnonymousClass006.A00) goto L_0x05e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x076c, code lost:
        if (r1.A0S.A02 != false) goto L_0x05e6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x04de  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x050b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0660  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r25, android.os.Bundle r26) {
        /*
            r24 = this;
            r6 = 0
            r2 = r25
            X.C04220Ms.A0B(r2, r6)
            r4 = r24
            r0 = r26
            super.onViewCreated(r2, r0)
            boolean r0 = A0C(r4)
            android.view.View r1 = r4.requireView()
            if (r0 == 0) goto L_0x04ef
            r0 = 2131307491(0x7f092be3, float:1.823321E38)
            X.C86154wM.A1I(r1, r0)
            android.view.View r1 = r4.requireView()
            r0 = 2131307487(0x7f092bdf, float:1.8233203E38)
        L_0x0024:
            X.C86154wM.A1I(r1, r0)
            X.58J r1 = r4.A0L
            java.lang.String r16 = "nuxViewModel"
            if (r1 == 0) goto L_0x07a6
            android.os.Bundle r0 = r4.requireArguments()
            r1.A09(r0)
            X.58J r0 = r4.A0L
            if (r0 == 0) goto L_0x07a6
            boolean r0 = r0.A0F()
            r3 = 1
            java.lang.String r11 = "ecpPaymentRequest"
            if (r0 == 0) goto L_0x04e5
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r4.A0J
            if (r0 == 0) goto L_0x07a1
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x0051
            java.lang.Boolean r0 = r0.A03
            boolean r0 = X.C18190wL.A1Z(r0, r3)
            if (r0 != 0) goto L_0x04e5
        L_0x0051:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = r4.A0J
            if (r1 == 0) goto L_0x07a1
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r0 = r1.A04
            X.69R r0 = r0.A05
        L_0x0059:
            r4.A0K = r0
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r1.A01
            if (r0 == 0) goto L_0x0071
            java.lang.Boolean r0 = r0.A06
            if (r0 == 0) goto L_0x0071
            com.instagram.service.session.UserSession r7 = X.AnonymousClass7HK.A00()
            X.0TJ r5 = X.AnonymousClass0TJ.A05
            r0 = 36315735194929910(0x8104f8000d0af6, double:3.0295553967773744E-306)
            X.C63803iN.A0E(r5, r7, r0)
        L_0x0071:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r4.A0J
            if (r0 == 0) goto L_0x07a1
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x008b
            java.lang.Boolean r0 = r0.A03
            if (r0 == 0) goto L_0x008b
            com.instagram.service.session.UserSession r7 = X.AnonymousClass7HK.A00()
            X.0TJ r5 = X.AnonymousClass0TJ.A05
            r0 = 36315735195060984(0x8104f8000f0af8, double:3.029555396860266E-306)
            X.C63803iN.A0E(r5, r7, r0)
        L_0x008b:
            r0 = 2131303614(0x7f091cbe, float:1.8225347E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r2, r0)
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r4.A0F = r0
            r0 = 2131297335(0x7f090437, float:1.8212612E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r2, r0)
            com.facebookpay.widget.banner.FBPayBanner r0 = (com.facebookpay.widget.banner.FBPayBanner) r0
            r4.A0P = r0
            r0 = 2131303951(0x7f091e0f, float:1.822603E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r2, r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r4.A08 = r0
            r0 = 2131303833(0x7f091d99, float:1.8225792E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r2, r0)
            com.facebookpay.form.view.FormLayout r0 = (com.facebookpay.form.view.FormLayout) r0
            r4.A0N = r0
            r0 = 2131297885(0x7f09065d, float:1.8213728E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r2, r0)
            com.facebookpay.widget.button.FBPayButton r0 = (com.facebookpay.widget.button.FBPayButton) r0
            r4.A0Q = r0
            r0 = 2131303845(0x7f091da5, float:1.8225816E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r2, r0)
            com.facebookpay.widget.listcell.ListCell r0 = (com.facebookpay.widget.listcell.ListCell) r0
            r4.A0R = r0
            r0 = 2131302730(0x7f09194a, float:1.8223554E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0K(r2, r0)
            r4.A04 = r0
            r0 = 2131304890(0x7f0921ba, float:1.8227935E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r2, r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r4.A0C = r0
            r0 = 2131299022(0x7f090ace, float:1.8216034E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0K(r2, r0)
            r4.A02 = r0
            r0 = 2131303848(0x7f091da8, float:1.8225822E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0K(r2, r0)
            r4.A05 = r0
            r0 = 2131300750(0x7f09118e, float:1.8219538E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0K(r2, r0)
            r4.A03 = r0
            r0 = 2131303957(0x7f091e15, float:1.8226043E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r2, r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r4.A09 = r0
            r0 = 2131304646(0x7f0920c6, float:1.822744E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r2, r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r4.A0E = r0
            r0 = 2131296864(0x7f090260, float:1.8211657E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r2, r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r4.A06 = r0
            r0 = 2131304089(0x7f091e99, float:1.822631E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r2, r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r4.A0B = r0
            r0 = 2131304090(0x7f091e9a, float:1.8226313E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r2, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r4.A0D = r0
            r0 = 2131300746(0x7f09118a, float:1.821953E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r2, r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r4.A0A = r0
            r0 = 2131296848(0x7f090250, float:1.8211624E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0J(r2, r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r4.A07 = r0
            boolean r0 = A0C(r4)
            java.lang.String r5 = "nestedScrollView"
            if (r0 != 0) goto L_0x0169
            X.69R r0 = r4.A0K
            if (r0 != 0) goto L_0x015c
            java.lang.String r12 = "navBarStyle"
        L_0x0157:
            X.C04220Ms.A0E(r12)
        L_0x015a:
            r0 = 0
            throw r0
        L_0x015c:
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0169
            X.7IS r1 = X.AnonymousClass6XN.A00
            androidx.core.widget.NestedScrollView r0 = r4.A0F
            if (r0 == 0) goto L_0x04e0
            r1.A04(r0)
        L_0x0169:
            boolean r0 = A0C(r4)
            if (r0 == 0) goto L_0x017f
            androidx.core.widget.NestedScrollView r0 = r4.A0F
            if (r0 == 0) goto L_0x04e0
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            com.facebook.redex.IDxCListenerShape608S0100000_2_I2 r0 = new com.facebook.redex.IDxCListenerShape608S0100000_2_I2
            r0.<init>(r4, r3)
            r1.addOnScrollChangedListener(r0)
        L_0x017f:
            android.content.Context r9 = r4.requireContext()
            android.view.View r7 = r4.A03
            if (r7 != 0) goto L_0x018a
            java.lang.String r12 = "footerDivider"
            goto L_0x0157
        L_0x018a:
            boolean r5 = A0C(r4)
            boolean r1 = A0C(r4)
            r8 = 37
            r0 = 19
            if (r1 == 0) goto L_0x019a
            r0 = 37
        L_0x019a:
            X.C121047Dv.A00(r9, r7, r0, r5)
            android.widget.LinearLayout r5 = r4.A0B
            if (r5 != 0) goto L_0x01a4
            java.lang.String r12 = "paymentMethodSelectionContainer"
            goto L_0x0157
        L_0x01a4:
            X.7Ec r1 = X.AnonymousClass7Kz.A0G()
            r7 = -1
            android.content.Context r0 = r4.requireContext()
            android.graphics.drawable.Drawable r0 = r1.A04(r0, r8, r7)
            r5.setBackground(r0)
            android.widget.ProgressBar r0 = r4.A0C
            if (r0 != 0) goto L_0x01bb
            java.lang.String r12 = "progressIcon"
            goto L_0x0157
        L_0x01bb:
            android.graphics.drawable.Drawable r8 = r0.getIndeterminateDrawable()
            if (r8 == 0) goto L_0x01d3
            X.7Ec r5 = X.AnonymousClass7Kz.A0G()
            r1 = 7
            android.content.Context r0 = r4.getContext()
            int r1 = r5.A03(r0, r1)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            r8.setColorFilter(r1, r0)
        L_0x01d3:
            android.view.View r1 = r4.A04
            if (r1 != 0) goto L_0x01db
            java.lang.String r12 = "loadingOverlay"
            goto L_0x0157
        L_0x01db:
            r0 = 2
            X.AnonymousClass7Fe.A02(r1, r0)
            r0 = 1058642330(0x3f19999a, float:0.6)
            r1.setAlpha(r0)
            X.7Ri r0 = X.AnonymousClass7Ri.A00
            r1.setOnTouchListener(r0)
            java.util.ArrayList r1 = X.AnonymousClass0wJ.A0v()
            r0 = 2131306738(0x7f0928f2, float:1.8231684E38)
            X.C18200wM.A1U(r1, r0)
            r0 = 2131306736(0x7f0928f0, float:1.823168E38)
            X.C18200wM.A1U(r1, r0)
            r0 = 2131306737(0x7f0928f1, float:1.8231682E38)
            X.C18200wM.A1U(r1, r0)
            r0 = 2131306740(0x7f0928f4, float:1.8231688E38)
            X.C18200wM.A1U(r1, r0)
            r0 = 2131306739(0x7f0928f3, float:1.8231686E38)
            X.C18200wM.A1U(r1, r0)
            r0 = 2131306744(0x7f0928f8, float:1.8231696E38)
            X.C18200wM.A1U(r1, r0)
            r0 = 2131306742(0x7f0928f6, float:1.8231692E38)
            X.C18200wM.A1U(r1, r0)
            r0 = 2131306743(0x7f0928f7, float:1.8231694E38)
            X.C18200wM.A1U(r1, r0)
            r0 = 2131306741(0x7f0928f5, float:1.823169E38)
            X.C18200wM.A1U(r1, r0)
            r0 = 2131306747(0x7f0928fb, float:1.8231702E38)
            X.C18200wM.A1U(r1, r0)
            r0 = 2131306746(0x7f0928fa, float:1.82317E38)
            X.C18200wM.A1U(r1, r0)
            r0 = 2131306745(0x7f0928f9, float:1.8231698E38)
            X.C18200wM.A1U(r1, r0)
            java.util.Iterator r10 = r1.iterator()
        L_0x023a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0274
            java.lang.Object r0 = r10.next()
            int r0 = X.AnonymousClass0wJ.A04(r0)
            android.view.View r9 = X.AnonymousClass0wJ.A0J(r2, r0)
            com.facebook.shimmer.ShimmerFrameLayout r9 = (com.facebook.shimmer.ShimmerFrameLayout) r9
            r0 = 0
            X.D57.A00(r9, r0)
            X.AnonymousClass7Kz.A0G()
            r4.getContext()
            android.content.Context r1 = r4.requireContext()
            r0 = 2131231690(0x7f0803ca, float:1.8079468E38)
            android.graphics.drawable.Drawable r8 = r1.getDrawable(r0)
            X.7Ec r5 = X.AnonymousClass7Kz.A0G()
            r1 = 15
            android.content.Context r0 = r4.getContext()
            X.C121097Ec.A00(r0, r8, r5, r1)
            r9.setBackground(r8)
            goto L_0x023a
        L_0x0274:
            java.lang.String r5 = "shimmerContainer"
            r1 = 8
            java.lang.String r15 = "contentContainer"
            android.view.View r0 = r4.A02
            if (r0 != 0) goto L_0x0283
            X.C04220Ms.A0E(r15)
            goto L_0x015a
        L_0x0283:
            r0.setVisibility(r1)
            android.view.View r0 = r4.A05
            if (r0 == 0) goto L_0x04e0
            r0.setVisibility(r6)
            boolean r0 = A0C(r4)
            if (r0 == 0) goto L_0x02a8
            r0 = 2131303846(0x7f091da6, float:1.8225818E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0K(r2, r0)
            X.L6z r1 = X.C86134wK.A0J(r0)
            r0 = 2131303833(0x7f091d99, float:1.8225792E38)
            r1.A0r = r0
            r0 = 2131300746(0x7f09118a, float:1.821953E38)
            r1.A0F = r0
        L_0x02a8:
            boolean r0 = A0C(r4)
            if (r0 == 0) goto L_0x02c3
            com.facebookpay.form.view.FormLayout r1 = r4.A0N
            java.lang.String r2 = "formLayout"
            if (r1 == 0) goto L_0x0506
            r0 = 24
            X.AnonymousClass7Kz.A0T(r1, r0)
            com.facebookpay.form.view.FormLayout r1 = r4.A0N
            if (r1 == 0) goto L_0x0506
            r0 = 2131165197(0x7f07000d, float:1.7944604E38)
            r1.setRowSpacing(r0)
        L_0x02c3:
            boolean r0 = A0C(r4)
            if (r0 == 0) goto L_0x0385
            r4.A05()
        L_0x02cc:
            boolean r0 = A0C(r4)
            java.lang.String r12 = "continueButton"
            com.facebookpay.widget.button.FBPayButton r1 = r4.A0Q
            if (r0 == 0) goto L_0x0378
            if (r1 == 0) goto L_0x0157
            X.AnonymousClass7Kz.A0G()
            r0 = 2131886627(0x7f120223, float:1.9407838E38)
            X.AnonymousClass7Fe.A01(r1, r0)
            com.facebookpay.widget.button.FBPayButton r1 = r4.A0Q
            if (r1 == 0) goto L_0x0157
            X.69C r0 = X.AnonymousClass69C.A08
            r1.setButtonStyle(r0)
        L_0x02ea:
            boolean r0 = A0C(r4)
            if (r0 == 0) goto L_0x03b0
            android.view.View r10 = r4.A02
            r9 = r15
            if (r10 == 0) goto L_0x0323
            int r8 = r10.getPaddingLeft()
            android.view.View r0 = r4.A02
            if (r0 == 0) goto L_0x0323
            int r5 = r0.getPaddingTop()
            android.view.View r0 = r4.A02
            if (r0 == 0) goto L_0x0323
            int r2 = r0.getPaddingRight()
            android.view.View r0 = r4.A02
            if (r0 == 0) goto L_0x0323
            r1 = 2130969569(0x7f0403e1, float:1.7547824E38)
            android.content.Context r0 = X.C18190wL.A0A(r0)
            int r0 = X.AnonymousClass7IS.A00(r0, r1)
            r10.setPadding(r8, r5, r2, r0)
            X.7j6 r17 = X.AnonymousClass6XS.A00
            com.fbpay.logging.LoggingContext r2 = r4.A0S
            if (r2 != 0) goto L_0x0328
            java.lang.String r9 = "loggingContext"
        L_0x0323:
            X.C04220Ms.A0E(r9)
            r0 = 0
            throw r0
        L_0x0328:
            r19 = 2130969577(0x7f0403e9, float:1.754784E38)
            r20 = 2130969575(0x7f0403e7, float:1.7547836E38)
            X.58J r0 = r4.A0L
            r9 = r16
            if (r0 == 0) goto L_0x0323
            java.util.List r1 = r0.A07()
            X.69P r0 = X.AnonymousClass69P.SHIPPING_ADDRESS
            boolean r21 = r1.contains(r0)
            X.58J r0 = r4.A0L
            if (r0 == 0) goto L_0x0323
            java.util.List r1 = r0.A07()
            X.69P r0 = X.AnonymousClass69P.CONTACT_INFORMATION
            boolean r22 = r1.contains(r0)
            r18 = r2
            com.facebookpay.form.cell.label.LabelCellParams r5 = r17.A00(r18, r19, r20, r21, r22)
            X.7Ih r8 = r5.A01()
            r5.A00 = r8
            android.view.ContextThemeWrapper r2 = r4.A00
            if (r2 != 0) goto L_0x035f
            java.lang.String r9 = "wrapperContext"
            goto L_0x0323
        L_0x035f:
            X.AnonymousClass7Kz.A0K()
            r1 = 2131886668(0x7f12024c, float:1.9407921E38)
            android.view.ContextThemeWrapper r0 = new android.view.ContextThemeWrapper
            r0.<init>(r2, r1)
            X.8gu r5 = r5.A00(r0)
            r5.setViewModel(r8)
            android.widget.LinearLayout r2 = r4.A0A
            if (r2 != 0) goto L_0x038a
            java.lang.String r9 = "footerContainer"
            goto L_0x0323
        L_0x0378:
            if (r1 == 0) goto L_0x0157
            X.AnonymousClass7Kz.A0G()
            r0 = 2131886623(0x7f12021f, float:1.940783E38)
            X.AnonymousClass7Fe.A01(r1, r0)
            goto L_0x02ea
        L_0x0385:
            r4.A04()
            goto L_0x02cc
        L_0x038a:
            android.view.View r5 = (android.view.View) r5
            r1 = -2
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r7, r1)
            r2.addView(r5, r0)
            r1 = 2130969576(0x7f0403e8, float:1.7547838E38)
            X.C04220Ms.A0B(r5, r6)
            android.content.Context r0 = X.C18190wL.A0A(r5)
            java.lang.Integer r2 = X.AnonymousClass7IS.A01(r0, r1)
            X.C04220Ms.A06(r0)
            java.lang.Integer r1 = X.AnonymousClass7IS.A01(r0, r1)
            r0 = 0
            X.AnonymousClass7IS.A03(r5, r2, r1, r0, r0)
            r4.A0T = r3
        L_0x03b0:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r4.A0J
            r14 = 0
            if (r0 != 0) goto L_0x03b9
            X.C04220Ms.A0E(r11)
            throw r14
        L_0x03b9:
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r1 = r0.A01
            if (r1 == 0) goto L_0x0442
            java.lang.Boolean r0 = r1.A06
        L_0x03bf:
            java.lang.String r9 = "banner"
            if (r0 != 0) goto L_0x049e
            if (r1 == 0) goto L_0x0440
            X.67l r1 = r1.A01
        L_0x03c7:
            X.67l r0 = X.C969767l.META_PAY_BANNER
            if (r1 != r0) goto L_0x049e
            com.facebookpay.widget.banner.FBPayBanner r5 = r4.A0P
            if (r5 == 0) goto L_0x0502
            android.view.ContextThemeWrapper r2 = r4.A00
            java.lang.String r6 = "wrapperContext"
            if (r2 == 0) goto L_0x04fe
            boolean r1 = X.AnonymousClass7HK.A01()
            r0 = 2131826513(0x7f111751, float:1.9285913E38)
            if (r1 == 0) goto L_0x03e1
            r0 = 2131826560(0x7f111780, float:1.9286008E38)
        L_0x03e1:
            java.lang.String r0 = r2.getString(r0)
            r5.setPrimaryText(r0)
            com.facebookpay.widget.banner.FBPayBanner r8 = r4.A0P
            if (r8 == 0) goto L_0x0502
            android.view.ContextThemeWrapper r1 = r4.A00
            if (r1 == 0) goto L_0x04fe
            r0 = 2131826568(0x7f111788, float:1.9286024E38)
            java.lang.String r5 = r1.getString(r0)
            android.view.ContextThemeWrapper r2 = r4.A00
            if (r2 == 0) goto L_0x04fe
            r0 = 42
            com.facebook.redex.IDxCListenerShape203S0100000_2_I2 r7 = X.C86134wK.A0P(r4, r0)
            java.lang.String r1 = "[[learn_more_token]]"
            r0 = 2131826597(0x7f1117a5, float:1.9286083E38)
            java.lang.String r2 = r2.getString(r0)
            java.lang.String r1 = r5.replace(r1, r2)
            int r6 = r1.indexOf(r2)
            if (r6 >= 0) goto L_0x0421
            java.lang.String r0 = "\\[\\[.*\\]\\]"
            java.lang.String r1 = r1.replaceAll(r0, r2)
            int r6 = r1.indexOf(r2)
            if (r6 >= 0) goto L_0x0421
            r6 = 0
        L_0x0421:
            int r5 = X.AnonymousClass2C6.A00(r2)
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r1)
            com.fbpay.hub.common.link.LinkTextUtil$1 r1 = new com.fbpay.hub.common.link.LinkTextUtil$1
            r1.<init>(r7)
            int r5 = r5 + r6
            r0 = 33
            r2.setSpan(r1, r6, r5, r0)
            r8.setSecondaryText(r2)
            com.facebookpay.widget.banner.FBPayBanner r1 = r4.A0P
            if (r1 != 0) goto L_0x0445
            X.C04220Ms.A0E(r9)
            throw r14
        L_0x0440:
            r1 = r14
            goto L_0x03c7
        L_0x0442:
            r0 = r14
            goto L_0x03bf
        L_0x0445:
            java.lang.String r0 = ""
            r1.setSecondaryTextClickHint(r0)
            com.facebookpay.widget.banner.FBPayBanner r6 = r4.A0P
            if (r6 != 0) goto L_0x0452
            X.C04220Ms.A0E(r9)
            throw r14
        L_0x0452:
            X.7Ec r5 = X.AnonymousClass7Kz.A0G()
            r2 = 22
            r1 = 32
            android.content.Context r0 = r4.getContext()
            android.graphics.drawable.Drawable r0 = r5.A04(r0, r2, r1)
            r6.setIcon(r0)
            X.7ke r1 = X.AnonymousClass7JJ.A00()
            com.fbpay.logging.LoggingContext r6 = r4.A0S
            if (r6 != 0) goto L_0x0471
            X.C86124wJ.A19()
            throw r14
        L_0x0471:
            X.58J r0 = r4.A0L
            if (r0 != 0) goto L_0x0479
            X.C04220Ms.A0E(r16)
            throw r14
        L_0x0479:
            X.587 r0 = r0.A0S
            java.util.LinkedHashMap r5 = X.AnonymousClass7Kr.A07(r0)
            java.lang.String r2 = "ecp_branding_banner"
            X.09x r1 = r1.A00
            java.lang.String r0 = "client_load_ecpbranding_success"
            X.0A2 r1 = X.C86104wH.A0K(r1, r0)
            r0 = 274(0x112, float:3.84E-43)
            com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000 r1 = X.C18180wK.A0I(r1, r0)
            r0 = 24
            X.C128957ke.A03(r1, r6, r5, r2, r0)
            com.facebookpay.widget.banner.FBPayBanner r1 = r4.A0P
            if (r1 != 0) goto L_0x049c
            X.C04220Ms.A0E(r9)
            throw r14
        L_0x049c:
            r0 = 0
            goto L_0x04a8
        L_0x049e:
            com.facebookpay.widget.banner.FBPayBanner r1 = r4.A0P
            if (r1 != 0) goto L_0x04a6
            X.C04220Ms.A0E(r9)
            throw r14
        L_0x04a6:
            r0 = 8
        L_0x04a8:
            r1.setVisibility(r0)
            com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl r0 = X.AnonymousClass7JJ.A02()
            X.6lW r0 = r0.A01
            if (r0 == 0) goto L_0x050e
            com.facebook.graphql.impls.FBPayCheckoutScreenConfigImpl r0 = r0.A00
            if (r0 == 0) goto L_0x050e
            com.google.common.collect.ImmutableList r1 = X.AnonymousClass69P.A00(r0)
            if (r1 == 0) goto L_0x050e
            X.69P r0 = X.AnonymousClass69P.META_BRANDING_FOOTER
            boolean r0 = r1.contains(r0)
            if (r0 != r3) goto L_0x050e
            android.content.Context r0 = r4.requireContext()
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r0)
            r0 = 2131233491(0x7f080ad3, float:1.808312E38)
            r1.setImageResource(r0)
            r0 = 2131886617(0x7f120219, float:1.9407818E38)
            X.AnonymousClass7Fe.A01(r1, r0)
            android.widget.LinearLayout r0 = r4.A0A
            if (r0 != 0) goto L_0x050b
            java.lang.String r5 = "footerContainer"
        L_0x04e0:
            X.C04220Ms.A0E(r5)
            goto L_0x015a
        L_0x04e5:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = r4.A0J
            if (r1 == 0) goto L_0x07a1
            com.facebookpay.expresscheckout.models.EcpUIConfiguration r0 = r1.A04
            X.69R r0 = r0.A02
            goto L_0x0059
        L_0x04ef:
            r0 = 2131300751(0x7f09118f, float:1.821954E38)
            X.C86154wM.A1I(r1, r0)
            android.view.View r1 = r4.requireView()
            r0 = 2131299082(0x7f090b0a, float:1.8216155E38)
            goto L_0x0024
        L_0x04fe:
            X.C04220Ms.A0E(r6)
            throw r14
        L_0x0502:
            X.C04220Ms.A0E(r9)
            throw r14
        L_0x0506:
            X.C04220Ms.A0E(r2)
            r0 = 0
            throw r0
        L_0x050b:
            r0.addView(r1)
        L_0x050e:
            X.58J r1 = r4.A0L
            if (r1 == 0) goto L_0x0551
            android.os.Bundle r0 = r4.requireArguments()
            r1.A09(r0)
            X.58J r1 = r4.A0L
            if (r1 == 0) goto L_0x0551
            com.facebookpay.expresscheckout.handler.ECPHandler r0 = r4.A0I
            r1.A0B(r0)
            X.7IU r1 = new X.7IU
            r1.<init>(r4)
            java.lang.Class<X.57n> r0 = X.C883057n.class
            X.3ak r0 = r1.A01(r0)
            X.57n r0 = (X.C883057n) r0
            r4.A0O = r0
            X.58J r0 = r4.A0L
            if (r0 == 0) goto L_0x0551
            X.56q r1 = r0.A0B
            r0 = 165(0xa5, float:2.31E-43)
            com.facebook.redex.IDxObserverShape211S0100000_2_I2 r0 = X.C86114wI.A0Q(r4, r0)
            X.AnonymousClass7Kx.A0F(r4, r1, r0)
            X.58J r0 = r4.A0L
            if (r0 == 0) goto L_0x0551
            X.56q r1 = r0.A0A
            r0 = 166(0xa6, float:2.33E-43)
            X.C86104wH.A1F(r4, r1, r0)
            com.facebookpay.widget.button.FBPayButton r1 = r4.A0Q
            if (r1 != 0) goto L_0x0556
            r16 = r12
        L_0x0551:
            X.C04220Ms.A0E(r16)
        L_0x0554:
            r13 = 0
            throw r13
        L_0x0556:
            r0 = 43
            X.C86104wH.A1C(r1, r0, r4)
            A09(r4)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r4.A0J
            if (r0 == 0) goto L_0x0778
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x05bc
            java.lang.Boolean r0 = r0.A03
            boolean r0 = X.C18190wL.A1Z(r0, r3)
            if (r0 == 0) goto L_0x05bc
            X.58J r0 = r4.A0L
            if (r0 == 0) goto L_0x0551
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x05bc
            android.view.ContextThemeWrapper r1 = r4.A00
            if (r1 == 0) goto L_0x0774
            com.fbpay.logging.LoggingContext r0 = r4.A0S
            if (r0 == 0) goto L_0x0770
            X.5gU r5 = new X.5gU
            r5.<init>(r1, r0)
            r0 = 40
            com.facebook.redex.IDxCListenerShape203S0100000_2_I2 r0 = X.C86134wK.A0P(r4, r0)
            r5.A00 = r0
            android.widget.FrameLayout r0 = r4.A07
            java.lang.String r7 = "anonCheckoutBackButton"
            if (r0 == 0) goto L_0x05ab
            X.M5O r2 = r5.A08(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.facebookpay.common.recyclerview.viewbinders.InlineBackButtonViewBinder.InlineBackButtonViewHolder"
            X.C04220Ms.A0C(r2, r0)
            android.widget.FrameLayout r1 = r4.A07
            if (r1 == 0) goto L_0x05ab
            android.view.View r0 = r2.itemView
            r1.addView(r0)
            X.58J r0 = r4.A0L
            if (r0 != 0) goto L_0x05af
            r7 = r16
        L_0x05ab:
            X.C04220Ms.A0E(r7)
            goto L_0x0554
        L_0x05af:
            X.587 r0 = r0.A0S
            X.M5J r1 = r0.A05
            r0 = 13
            com.facebook.redex.IDxObserverShape99S0200000_2_I2 r0 = X.C86164wN.A0O(r2, r5, r0)
            r1.A0C(r4, r0)
        L_0x05bc:
            X.58J r1 = r4.A0L
            if (r1 == 0) goto L_0x0551
            X.56r r0 = r1.A0H
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = X.C86124wJ.A0a(r0)
            if (r0 == 0) goto L_0x0768
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x0768
            java.lang.Boolean r0 = r0.A03
            boolean r0 = X.C18190wL.A1Z(r0, r3)
            if (r0 == 0) goto L_0x0768
            X.587 r0 = r1.A0S
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x065b
            boolean r0 = r1.A0G()
            if (r0 == 0) goto L_0x0764
            java.lang.Integer r1 = X.AnonymousClass006.A00
        L_0x05e2:
            java.lang.Integer r0 = X.AnonymousClass006.A00
            if (r1 != r0) goto L_0x065b
        L_0x05e6:
            X.58J r6 = r4.A0L
            r7 = r16
            if (r6 == 0) goto L_0x05ab
            java.lang.String r5 = "otc_toggle"
            java.util.Map r1 = r6.A0U
            X.69P r0 = X.AnonymousClass69P.ONE_TIME_CHECKOUT_OPTION
            kotlin.Pair r0 = X.C18180wK.A0p(r0, r5)
            X.78o r2 = X.C86114wI.A0R(r0, r1)
            if (r2 == 0) goto L_0x060b
            r0 = 3
            kotlin.jvm.internal.KtLambdaShape4S1100000_I2 r1 = new kotlin.jvm.internal.KtLambdaShape4S1100000_I2
            r1.<init>(r5, r6, r0)
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x060b
            r2.A01 = r3
            r1.invoke()
        L_0x060b:
            android.view.ContextThemeWrapper r5 = r4.A00
            if (r5 == 0) goto L_0x0774
            com.fbpay.logging.LoggingContext r2 = r4.A0S
            if (r2 == 0) goto L_0x0770
            r0 = 7
            com.facebook.redex.IDxCListenerShape508S0100000_2_I2 r1 = new com.facebook.redex.IDxCListenerShape508S0100000_2_I2
            r1.<init>(r4, r0)
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r4.A0J
            if (r0 == 0) goto L_0x0778
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x0760
            java.lang.Boolean r0 = r0.A03
            boolean r22 = X.C18190wL.A1Z(r0, r3)
        L_0x0627:
            r0 = 5
            kotlin.jvm.internal.KtLambdaShape150S0100000_I2_5 r21 = X.C86164wN.A0s(r4, r0)
            X.5gY r6 = new X.5gY
            r18 = r5
            r19 = r1
            r20 = r2
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22)
            r0 = 32
            kotlin.jvm.internal.KtLambdaShape17S0200000_I2_1 r0 = X.C86154wM.A11(r6, r4, r0)
            X.0Oa r5 = X.AnonymousClass0OY.A02(r0)
            X.58J r0 = r4.A0L
            if (r0 == 0) goto L_0x05ab
            X.587 r2 = r0.A0S
            X.56r r1 = r2.A00
            r0 = 34
            X.M5J r2 = X.C86134wK.A0K(r1, r2, r0)
            r1 = 19
            com.facebook.redex.IDxObserverShape55S0300000_2_I2 r0 = new com.facebook.redex.IDxObserverShape55S0300000_2_I2
            r0.<init>((int) r1, (java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6)
            r2.A0C(r4, r0)
        L_0x065b:
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r1 = r4.A0J
            r13 = 0
            if (r1 == 0) goto L_0x0680
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r1.A01
            if (r0 == 0) goto L_0x075d
            com.facebookpay.expresscheckout.models.APMConfiguration r8 = r0.A00
        L_0x0666:
            com.facebookpay.expresscheckout.models.ECPPaymentConfiguration r0 = r1.A03
            if (r0 == 0) goto L_0x075a
            com.facebookpay.common.models.CurrencyAmount r5 = r0.A00
        L_0x066c:
            X.58J r0 = r4.A0L
            if (r0 == 0) goto L_0x079d
            X.587 r0 = r0.A0S
            boolean r0 = r0.A04
            if (r0 == 0) goto L_0x0716
            if (r8 == 0) goto L_0x0716
            if (r5 == 0) goto L_0x0716
            android.view.ContextThemeWrapper r6 = r4.A00
            if (r6 != 0) goto L_0x0684
            java.lang.String r11 = "wrapperContext"
        L_0x0680:
            X.C04220Ms.A0E(r11)
            throw r13
        L_0x0684:
            com.fbpay.logging.LoggingContext r2 = r4.A0S
            java.lang.String r9 = "loggingContext"
            if (r2 == 0) goto L_0x0799
            androidx.fragment.app.FragmentActivity r1 = r4.getActivity()
            java.lang.String r12 = "Required value was null."
            if (r1 == 0) goto L_0x0794
            r0 = 4
            kotlin.jvm.internal.KtLambdaShape150S0100000_I2_5 r0 = X.C86164wN.A0s(r4, r0)
            X.5gX r7 = new X.5gX
            r7.<init>(r6, r1, r2, r0)
            android.view.ViewGroup r6 = r4.A06
            java.lang.String r11 = "apmContainer"
            if (r6 == 0) goto L_0x0680
            X.7JJ r2 = X.AnonymousClass7Kz.A05()
            android.view.ContextThemeWrapper r1 = r7.A00
            X.69U r0 = r7.A02
            android.view.View r1 = r2.A05(r1, r6, r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.C04220Ms.A0C(r1, r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            X.5Ax r6 = new X.5Ax
            r6.<init>(r1)
            r10 = 2131826584(0x7f111798, float:1.9286057E38)
            com.fbpay.logging.LoggingContext r0 = r4.A0S
            if (r0 == 0) goto L_0x0799
            java.lang.String r9 = r0.A02
            java.util.concurrent.atomic.AtomicLong r0 = X.AnonymousClass73F.A00
            java.lang.String r19 = X.C86124wJ.A0y(r0)
            java.lang.String r20 = X.C86124wJ.A0y(r0)
            X.58J r0 = r4.A0L
            if (r0 == 0) goto L_0x079d
            X.587 r0 = r0.A0S
            com.facebookpay.otc.models.OtcOptionState r0 = r0.A04()
            if (r0 == 0) goto L_0x078f
            java.lang.String r2 = r0.A01
            java.lang.String r1 = r5.A01
            java.lang.String r0 = r5.A00
            com.facebookpay.bloks.nativeprops.APMBloksNativeProps r5 = new com.facebookpay.bloks.nativeprops.APMBloksNativeProps
            r18 = r9
            r21 = r2
            r22 = r1
            r23 = r0
            r17 = r5
            r17.<init>(r18, r19, r20, r21, r22, r23)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            X.69U r1 = X.AnonymousClass69U.A09
            com.facebookpay.common.recyclerview.adapteritems.APMButtonsItem r0 = new com.facebookpay.common.recyclerview.adapteritems.APMButtonsItem
            r0.<init>(r5, r1, r8, r2)
            X.7Kx r0 = X.AnonymousClass7Kx.A0A(r0)
            r7.A0A(r6, r0)
            android.view.ViewGroup r1 = r4.A06
            if (r1 == 0) goto L_0x0680
            android.view.View r0 = r6.itemView
            r1.addView(r0)
            X.56r r5 = r4.A0U
            X.066 r2 = r4.getViewLifecycleOwner()
            X.8gC r1 = r4.A0W
            r0 = 275(0x113, float:3.85E-43)
            X.C86114wI.A1A(r2, r5, r1, r0)
        L_0x0716:
            X.58J r0 = r4.A0L
            if (r0 == 0) goto L_0x078b
            X.56r r2 = r0.A0E
            X.066 r1 = r4.getViewLifecycleOwner()
            X.8gC r0 = r4.A0X
            r2.A0C(r1, r0)
            X.58J r0 = r4.A0L
            if (r0 == 0) goto L_0x078b
            X.56r r2 = r0.A0F
            X.066 r1 = r4.getViewLifecycleOwner()
            X.8gC r0 = r4.A0V
            r2.A0C(r1, r0)
            X.58J r0 = r4.A0L
            if (r0 == 0) goto L_0x078b
            X.56q r2 = r0.A0C
            X.066 r1 = r4.getViewLifecycleOwner()
            X.7aM r0 = X.C124047aM.A00
            r2.A0C(r1, r0)
            X.58J r0 = r4.A0L
            if (r0 == 0) goto L_0x078b
            X.56r r2 = r0.A0D
            X.066 r1 = r4.getViewLifecycleOwner()
            X.8gC r0 = r4.A0Y
            r2.A0C(r1, r0)
            android.view.View r2 = r4.A02
            if (r2 != 0) goto L_0x077b
            X.C04220Ms.A0E(r15)
            throw r14
        L_0x075a:
            r5 = r14
            goto L_0x066c
        L_0x075d:
            r8 = r14
            goto L_0x0666
        L_0x0760:
            r22 = 0
            goto L_0x0627
        L_0x0764:
            java.lang.Integer r1 = X.AnonymousClass006.A0N
            goto L_0x05e2
        L_0x0768:
            X.587 r0 = r1.A0S
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x065b
            goto L_0x05e6
        L_0x0770:
            java.lang.String r7 = "loggingContext"
            goto L_0x05ab
        L_0x0774:
            java.lang.String r7 = "wrapperContext"
            goto L_0x05ab
        L_0x0778:
            r7 = r11
            goto L_0x05ab
        L_0x077b:
            X.7IJ r0 = new X.7IJ
            r0.<init>(r4, r3)
            X.7k9 r1 = new X.7k9
            r1.<init>(r2)
            java.util.Set r0 = r0.A08
            r0.add(r1)
            return
        L_0x078b:
            X.C04220Ms.A0E(r16)
            throw r14
        L_0x078f:
            java.lang.IllegalStateException r13 = X.C18180wK.A0a(r12)
            throw r13
        L_0x0794:
            java.lang.IllegalStateException r13 = X.C18180wK.A0a(r12)
            throw r13
        L_0x0799:
            X.C04220Ms.A0E(r9)
            throw r13
        L_0x079d:
            X.C04220Ms.A0E(r16)
            throw r13
        L_0x07a1:
            X.C04220Ms.A0E(r11)
            r0 = 0
            throw r0
        L_0x07a6:
            X.C04220Ms.A0E(r16)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5j8.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void A05() {
        String str;
        M5J D7U;
        ListCell listCell = this.A0R;
        if (listCell == null) {
            str = "subtotal";
        } else {
            listCell.setVisibility(8);
            ConstraintLayout constraintLayout = this.A0E;
            if (constraintLayout == null) {
                str = "productDetailsContainer";
            } else {
                constraintLayout.setVisibility(8);
                FrameLayout frameLayout = this.A08;
                str = "orderSummaryContainer";
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                    AnonymousClass58J r0 = this.A0L;
                    if (r0 == null) {
                        str = "nuxViewModel";
                    } else {
                        C1201078o A0R2 = C86114wI.A0R(C18180wK.A0p(AnonymousClass69P.ORDER_SUMMARY, "nux_checkout"), r0.A0U);
                        if (A0R2 != null) {
                            KtLambdaShape26S0100000_I2_6 ktLambdaShape26S0100000_I2_6 = new KtLambdaShape26S0100000_I2_6(this, 21);
                            if (!A0R2.A01) {
                                A0R2.A01 = true;
                                ktLambdaShape26S0100000_I2_6.invoke();
                            }
                        }
                        LoggingContext loggingContext = this.A0S;
                        if (loggingContext == null) {
                            str = "loggingContext";
                        } else {
                            AnonymousClass69U r5 = AnonymousClass69U.A0J;
                            String str2 = "loggingContext";
                            C91355g6 r4 = new C91355g6(loggingContext, true);
                            LoggingContext loggingContext2 = this.A0S;
                            if (loggingContext2 != null) {
                                C91345g5 r3 = new C91345g5(loggingContext2);
                                LoggingContext loggingContext3 = this.A0S;
                                if (loggingContext3 != null) {
                                    C91495gK r8 = new C91495gK(loggingContext3, true);
                                    LoggingContext loggingContext4 = this.A0S;
                                    if (loggingContext4 != null) {
                                        C91645gZ r7 = new C91645gZ(loggingContext4, true);
                                        ContextThemeWrapper contextThemeWrapper = this.A00;
                                        if (contextThemeWrapper == null) {
                                            str2 = "wrapperContext";
                                        } else {
                                            LoggingContext loggingContext5 = this.A0S;
                                            if (loggingContext5 != null) {
                                                C91385g9 r1 = new C91385g9(contextThemeWrapper, loggingContext5, true);
                                                r1.A00 = C86164wN.A0L(r1, this, 30);
                                                C91705gf A012 = AnonymousClass567.A01(r5, loggingContext, this, AnonymousClass4WJ.A0H(C18180wK.A0p(r4.A02, r4), C18180wK.A0p(r3.A02, r3), C18180wK.A0p(r8.A02, r8), C18180wK.A0p(r1.A02, r1), C18180wK.A0p(r7.A02, r7)), 43);
                                                this.A0H = A012;
                                                FrameLayout frameLayout2 = this.A08;
                                                if (frameLayout2 != null) {
                                                    C89095Bw A0A2 = A012.A0A(frameLayout2);
                                                    C04220Ms.A0C(A0A2, "null cannot be cast to non-null type com.facebookpay.common.recyclerview.viewbinders.AccordionViewBinder.AccordionViewHolder");
                                                    C91715gg r2 = (C91715gg) A0A2;
                                                    this.A0G = r2;
                                                    FrameLayout frameLayout3 = this.A08;
                                                    if (frameLayout3 != null) {
                                                        if (r2 == null) {
                                                            str = "orderSummaryViewHolder";
                                                        } else {
                                                            frameLayout3.addView(r2.itemView);
                                                            ECPHandler eCPHandler = this.A0I;
                                                            if (eCPHandler != null && (D7U = eCPHandler.D7U()) != null) {
                                                                C86104wH.A1F(this, D7U, 163);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            C04220Ms.A0E(str2);
                            throw null;
                        }
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public static final void A06(Bundle bundle, AnonymousClass5j8 r4) {
        bundle.putBoolean("ECP_NUX_FLOW", true);
        bundle.putBoolean("IS_ECP_NUX_FORM_SCREEN", false);
        Fragment fragment = r4.mParentFragment;
        if (fragment != null) {
            AnonymousClass7H3.A01(bundle, fragment, "content_bottom_sheet_fragment", true, true);
            return;
        }
        throw AnonymousClass0wJ.A0b();
    }

    public static /* synthetic */ void A07(C40307LcE lcE, AnonymousClass5j8 r7, String str, String str2, String str3, String str4, int i) {
        Map map;
        String str5;
        String str6 = null;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            lcE = null;
        }
        if ((i & 32) == 0) {
            str6 = str4;
        }
        C128957ke A012 = AnonymousClass7JJ.A01();
        LoggingContext loggingContext = r7.A0S;
        if (loggingContext == null) {
            str5 = "loggingContext";
        } else {
            AnonymousClass58J r0 = r7.A0L;
            if (r0 == null) {
                str5 = "nuxViewModel";
            } else {
                AnonymousClass7DP A032 = r0.A0S.A03();
                LinkedHashMap A0y = C18220wO.A0y();
                C86114wI.A1K(loggingContext, str3, A0y);
                if (str2 != null) {
                    A0y.put("VIEW_NAME", str2);
                }
                C86134wK.A1O(lcE, A0y);
                if (str6 != null) {
                    AnonymousClass7Kr.A0D(str6, "error_message", A0y);
                }
                Object obj = A0y.get("extra_data");
                if (!(obj instanceof Map) || (((obj instanceof C03740Kn) && !(obj instanceof AnonymousClass0WC)) || (map = (Map) obj) == null)) {
                    map = C18220wO.A0y();
                }
                A012.Bb8(str, AnonymousClass7Kr.A04(A032, A0y, map));
                return;
            }
        }
        C04220Ms.A0E(str5);
        throw null;
    }

    public static final void A08(AnonymousClass5j8 r3) {
        ContextThemeWrapper contextThemeWrapper = r3.A00;
        IBinder iBinder = null;
        if (contextThemeWrapper == null) {
            C04220Ms.A0E("wrapperContext");
            throw null;
        }
        Object systemService = contextThemeWrapper.getSystemService("input_method");
        C04220Ms.A0C(systemService, C18170wI.A00(437));
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View view = r3.mView;
        if (view != null) {
            iBinder = view.getWindowToken();
        }
        inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
        View view2 = r3.mView;
        if (view2 != null) {
            view2.clearFocus();
        }
    }

    public static final void A09(AnonymousClass5j8 r7) {
        C40307LcE lcE;
        FrameLayout frameLayout;
        AnonymousClass58J r0 = r7.A0L;
        if (r0 != null) {
            PaymentMethodComponentImpl.NewPaymentCredentialOptions newPaymentCredentialOptions = (PaymentMethodComponentImpl.NewPaymentCredentialOptions) r0.A0F.A08();
            if (newPaymentCredentialOptions != null) {
                lcE = C122157Kv.A0I(newPaymentCredentialOptions);
            } else {
                lcE = null;
            }
            if (C18180wK.A1Z(lcE, C40307LcE.A04)) {
                frameLayout = r7.A09;
            } else {
                AnonymousClass58J r02 = r7.A0L;
                if (r02 != null) {
                    boolean z = r02.A0S.A02;
                    frameLayout = r7.A09;
                    if (z) {
                        if (frameLayout != null) {
                            frameLayout.setVisibility(0);
                            return;
                        }
                        C04220Ms.A0E("otcOptionContainer");
                        throw null;
                    }
                }
            }
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                return;
            }
            C04220Ms.A0E("otcOptionContainer");
            throw null;
        }
        C04220Ms.A0E("nuxViewModel");
        throw null;
    }

    public static final void A0A(AnonymousClass5j8 r4) {
        AnonymousClass58J r2 = r4.A0L;
        String str = "nuxViewModel";
        if (r2 != null) {
            r2.A0D("otc_back_button");
            C128957ke A002 = AnonymousClass7JJ.A00();
            LoggingContext loggingContext = r4.A0S;
            if (loggingContext == null) {
                str = "loggingContext";
            } else {
                AnonymousClass58J r0 = r4.A0L;
                if (r0 != null) {
                    A002.A0I(loggingContext, "pux_checkout", AnonymousClass7Kr.A07(r0.A0S));
                    new Bundle(r4.requireArguments()).putBoolean("IS_ECP_NUX_FORM_SCREEN", false);
                    Fragment fragment = r4.mParentFragment;
                    C04220Ms.A0C(fragment, "null cannot be cast to non-null type com.facebookpay.widget.bottomsheet.base.BottomSheetDialogController");
                    ((C147048nI) fragment).BfI();
                    return;
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public static final boolean A0C(AnonymousClass5j8 r1) {
        ECPPaymentRequest eCPPaymentRequest = r1.A0J;
        if (eCPPaymentRequest == null) {
            C04220Ms.A0E("ecpPaymentRequest");
            throw null;
        }
        CheckoutConfiguration checkoutConfiguration = eCPPaymentRequest.A01;
        if (checkoutConfiguration != null) {
            return C18190wL.A1Z(checkoutConfiguration.A06, true);
        }
        return false;
    }

    public final void CkR(ECPHandler eCPHandler) {
        this.A0I = eCPHandler;
        AnonymousClass58J r0 = this.A0L;
        if (r0 != null) {
            r0.A0B(eCPHandler);
            if (A0C(this)) {
                A05();
            } else {
                A04();
            }
        }
    }

    public static final C114026sZ A03(AnonymousClass5j8 r17) {
        C121097Ec A0G2 = AnonymousClass7Kz.A0G();
        AnonymousClass5j8 r3 = r17;
        ContextThemeWrapper contextThemeWrapper = r3.A00;
        if (contextThemeWrapper != null) {
            Drawable A042 = A0G2.A04(contextThemeWrapper, 46, 41);
            ContextThemeWrapper contextThemeWrapper2 = r3.A00;
            if (contextThemeWrapper2 != null) {
                String string = contextThemeWrapper2.getString(2131826475);
                ContextThemeWrapper contextThemeWrapper3 = r3.A00;
                if (contextThemeWrapper3 != null) {
                    String string2 = contextThemeWrapper3.getString(2131826474);
                    ContextThemeWrapper contextThemeWrapper4 = r3.A00;
                    if (contextThemeWrapper4 != null) {
                        C973368y r1 = C973368y.A04;
                        String string3 = contextThemeWrapper4.getString(2131826477);
                        AnonymousClass67N r6 = r1.A01;
                        Boolean A0Y2 = C18180wK.A0Y();
                        return C117016xz.A01(A042, r6, (AnonymousClass67N) null, new IDxONavigationShape640S0100000_2_I2(r3, 2), new IDxPDismissShape737S0100000_2_I2(r3), A0Y2, string, string2, string3, (String) null, (String) null, (String) null, 2131826365);
                    }
                }
            }
        }
        C04220Ms.A0E("wrapperContext");
        throw null;
    }

    public static final void A0B(AnonymousClass5j8 r2, Integer num) {
        String str;
        AnonymousClass7KT.A02(r2);
        AnonymousClass58J r1 = r2.A0L;
        if (r1 == null) {
            str = "nuxViewModel";
        } else {
            LoggingContext loggingContext = r2.A0S;
            if (loggingContext == null) {
                str = "loggingContext";
            } else {
                r1.A0C(loggingContext, num);
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final boolean Bnq(LoggingContext loggingContext, Integer num) {
        boolean A1Z = AnonymousClass0wJ.A1Z(num, loggingContext);
        AnonymousClass58J r0 = this.A0L;
        if (r0 == null) {
            C04220Ms.A0E("nuxViewModel");
            throw null;
        }
        r0.A0C(loggingContext, num);
        ECPRepositoryImpl A022 = AnonymousClass7JJ.A02();
        A022.A00.A0B(getViewLifecycleOwner());
        A022.A00 = C880856r.A03();
        return A1Z;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 10101) {
            return;
        }
        if (i2 != -1 || intent == null) {
            C128957ke A002 = AnonymousClass7JJ.A00();
            LoggingContext loggingContext = this.A0S;
            if (loggingContext == null) {
                C04220Ms.A0E("loggingContext");
            } else {
                AnonymousClass58J r0 = this.A0L;
                if (r0 == null) {
                    C04220Ms.A0E("nuxViewModel");
                } else {
                    C128957ke.A03(C18180wK.A0I(C86104wH.A0K(A002.A00, "user_click_cardscanner_exit"), 2827), loggingContext, AnonymousClass7Kr.A07(r0.A0S), "card_scanner", 11);
                    return;
                }
            }
            throw null;
        }
        requireContext();
        AnonymousClass7Kz.A0R();
        throw C97396Be.A00("add ig implementation");
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(901249095);
        super.onCreate(bundle);
        this.A0S = AnonymousClass567.A02(this);
        Parcelable parcelable = requireArguments().getParcelable("ECP_LAUNCH_PARAMS");
        C04220Ms.A0C(parcelable, "null cannot be cast to non-null type com.facebookpay.expresscheckout.models.ECPPaymentRequest");
        ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) parcelable;
        this.A0J = eCPPaymentRequest;
        String str = "ecpPaymentRequest";
        if (eCPPaymentRequest != null) {
            AnonymousClass58J A002 = C116896xj.A00(this, eCPPaymentRequest);
            this.A0L = A002;
            if (A002 != null) {
                AnonymousClass587 r2 = A002.A0S;
                ECPPaymentRequest eCPPaymentRequest2 = this.A0J;
                if (eCPPaymentRequest2 != null) {
                    if (!C04220Ms.A0I(r2.A01, eCPPaymentRequest2)) {
                        r2.A01 = eCPPaymentRequest2;
                        AnonymousClass587.A00(r2);
                    }
                    AnonymousClass58J r0 = this.A0L;
                    if (r0 != null) {
                        LoggingContext loggingContext = this.A0S;
                        if (loggingContext == null) {
                            str = "loggingContext";
                        } else {
                            C128957ke A003 = AnonymousClass7JJ.A00();
                            C128957ke.A03(C18180wK.A0I(C86104wH.A0K(A003.A00, "client_load_ecpcheckout_display"), 275), loggingContext, AnonymousClass7Kr.A07(r0.A0S), "nux_checkout", 25);
                            C010604w.A01(this, "nuxFormContentRequestKey", this.A0Z);
                            C14030oh.A09(-1491369619, A022);
                            return;
                        }
                    }
                }
            }
            C04220Ms.A0E("nuxViewModel");
            throw null;
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(370196320);
        ContextThemeWrapper A002 = AnonymousClass567.A00(this, layoutInflater);
        this.A00 = A002;
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(A002);
        C04220Ms.A06(cloneInContext);
        this.A01 = cloneInContext;
        View inflate = cloneInContext.inflate(R.layout.ecp_nux_fragment, viewGroup, false);
        C14030oh.A09(1083732930, A022);
        return inflate;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        if (X.C18190wL.A1Z(r0.A03, true) != false) goto L_0x0031;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r12 = this;
            r0 = -155166310(0xfffffffff6c0599a, float:-1.9506608E33)
            int r1 = X.C14030oh.A02(r0)
            r4 = r12
            super.onResume()
            X.58J r0 = r12.A0L
            r6 = 0
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "nuxViewModel"
        L_0x0012:
            X.C04220Ms.A0E(r0)
            throw r6
        L_0x0016:
            boolean r0 = r0.A0F()
            r2 = 1
            if (r0 == 0) goto L_0x0031
            com.facebookpay.expresscheckout.models.ECPPaymentRequest r0 = r12.A0J
            if (r0 != 0) goto L_0x0024
            java.lang.String r0 = "ecpPaymentRequest"
            goto L_0x0012
        L_0x0024:
            com.facebookpay.expresscheckout.models.CheckoutConfiguration r0 = r0.A01
            if (r0 == 0) goto L_0x0032
            java.lang.Boolean r0 = r0.A03
            boolean r0 = X.C18190wL.A1Z(r0, r2)
            if (r0 != 0) goto L_0x0031
            goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            android.view.ContextThemeWrapper r3 = r12.A00
            if (r3 != 0) goto L_0x0039
            java.lang.String r0 = "wrapperContext"
            goto L_0x0012
        L_0x0039:
            X.69R r5 = r12.A0K
            if (r5 != 0) goto L_0x0040
            java.lang.String r0 = "navBarStyle"
            goto L_0x0012
        L_0x0040:
            boolean r11 = A0C(r12)
            r0 = 20
            kotlin.jvm.internal.KtLambdaShape26S0100000_I2_6 r8 = new kotlin.jvm.internal.KtLambdaShape26S0100000_I2_6
            r8.<init>(r12, r0)
            r0 = 5
            kotlin.jvm.internal.KtLambdaShape4S0110000_I2 r9 = new kotlin.jvm.internal.KtLambdaShape4S0110000_I2
            r9.<init>(r0, r12, r2)
            r10 = 224(0xe0, float:3.14E-43)
            r7 = r6
            X.AnonymousClass3JK.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = -802912521(0xffffffffd02486f7, float:-1.10412339E10)
            X.C14030oh.A09(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5j8.onResume():void");
    }
}
