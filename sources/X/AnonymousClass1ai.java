package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2200000_I2;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S4300000_I2;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.ErrorIdentifier;
import com.instagram.barcelona.R;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.service.session.UserSession;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import kotlin.jvm.internal.KtLambdaShape43S0100000_I2_23;

/* renamed from: X.1ai  reason: invalid class name */
public final class AnonymousClass1ai extends C34640IcN implements C82034oy, C83394rJ, C82254pK {
    public static final String __redex_internal_original_name = "PromoteErrorFragment";
    public View A00;
    public ViewStub A01;
    public TextView A02;
    public TextView A03;
    public ErrorIdentifier A04;
    public C58923Id A05;
    public String A06;
    public String A07;
    public String A08;
    public ViewStub A09;
    public TextView A0A;
    public SpinnerImageView A0B;
    public String A0C;
    public boolean A0D;
    public final C04530Oa A0E = AnonymousClass0OY.A02(new KtLambdaShape43S0100000_I2_23(this, 8));
    public final C04530Oa A0F = AnonymousClass0OY.A02(new KtLambdaShape43S0100000_I2_23(this, 9));
    public final C04530Oa A0G = AnonymousClass0OY.A02(new KtLambdaShape43S0100000_I2_23(this, 10));
    public final C04530Oa A0H = AnonymousClass0OY.A02(new KtLambdaShape43S0100000_I2_23(this, 11));
    public final C04530Oa A0I = AnonymousClass0OY.A02(new KtLambdaShape43S0100000_I2_23(this, 12));

    public static final void A05(AnonymousClass1ai r3) {
        r3.A06(true);
        ((C37352Jq1) r3.A0E.getValue()).A05(C35394Iu2.A0b, r3, "promote_error");
    }

    public final void CBw(C34530IZw iZw) {
        Fragment ibk;
        KtCSuperShape0S2200000_I2 ktCSuperShape0S2200000_I2;
        String str;
        SpinnerImageView spinnerImageView = this.A0B;
        if (spinnerImageView == null) {
            str = "loadingSpinner";
        } else {
            spinnerImageView.setLoadingStatus(AnonymousClass69F.SUCCESS);
            if (iZw.A06 || (ktCSuperShape0S2200000_I2 = iZw.A00) == null) {
                this.A0H.getValue();
                C04530Oa r1 = this.A0G;
                if (PromoteState.A02((PromoteData) C18190wL.A0f(r1))) {
                    boolean A022 = C37078JkA.A02((PromoteData) C18190wL.A0f(r1), A01(this));
                    JY1 A023 = C62883b4.A02();
                    if (A022) {
                        ibk = A023.A02(C35394Iu2.A0b);
                    } else {
                        ibk = new C34613Ibj();
                    }
                } else {
                    C62883b4.A03();
                    ibk = new C34614Ibk();
                }
                C18230wP.A19(ibk, C18180wK.A0Q(getActivity(), A01(this)));
                return;
            }
            KtCSuperShape0S4300000_I2 ktCSuperShape0S4300000_I2 = (KtCSuperShape0S4300000_I2) ktCSuperShape0S2200000_I2.A00;
            this.A0C = ktCSuperShape0S4300000_I2.A04;
            this.A07 = ktCSuperShape0S2200000_I2.A02;
            this.A04 = (ErrorIdentifier) ktCSuperShape0S2200000_I2.A01;
            this.A08 = ktCSuperShape0S4300000_I2.A06;
            C37741K2b A002 = A00(this);
            C04530Oa r12 = this.A0G;
            A002.A00 = ((PromoteData) C18190wL.A0f(r12)).A0b;
            String str2 = ((PromoteData) C18190wL.A0f(r12)).A1F;
            String obj = C35394Iu2.A0b.toString();
            ErrorIdentifier errorIdentifier = this.A04;
            if (errorIdentifier == null) {
                str = "errorIdentifier";
            } else {
                A002.A0U(str2, obj, errorIdentifier.toString(), ktCSuperShape0S2200000_I2.A03);
                A06(false);
                A04();
                if (A08()) {
                    A03();
                }
                if (A07()) {
                    C58923Id r0 = this.A05;
                    str = "actionButtonHolder";
                    if (r0 != null) {
                        r0.A00();
                        C58923Id r02 = this.A05;
                        if (r02 != null) {
                            View view = r02.A00;
                            if (view != null) {
                                view.setVisibility(0);
                            }
                            A02();
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (r1 != false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.AnonymousClass4u2 r5) {
        /*
            r4 = this;
            r3 = 0
            android.content.Context r1 = X.C18240wQ.A0A(r4, r5, r3)
            com.instagram.api.schemas.ErrorIdentifier r0 = r4.A04
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "errorIdentifier"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x0010:
            java.lang.String r0 = X.AnonymousClass2KQ.A00(r1, r0)
            r5.setTitle(r0)
            X.Drc r2 = X.C18240wQ.A0K()
            X.0m7 r0 = r4.mFragmentManager
            if (r0 == 0) goto L_0x0034
            int r0 = r0.A0I()
            if (r0 != 0) goto L_0x0034
            X.0Oa r0 = r4.A0G
            java.lang.Object r0 = X.C18190wL.A0f(r0)
            com.instagram.business.promote.model.PromoteData r0 = (com.instagram.business.promote.model.PromoteData) r0
            boolean r1 = r0.A2V
            r0 = 2131233204(0x7f0809b4, float:1.8082539E38)
            if (r1 == 0) goto L_0x0037
        L_0x0034:
            r0 = 2131232258(0x7f080602, float:1.808062E38)
        L_0x0037:
            r2.A04(r0)
            X.AnonymousClass4u2.A03(r2, r5)
            r5.CtP(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ai.configureActionBar(X.4u2):void");
    }

    public final String getModuleName() {
        return "promote_error";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        SpinnerImageView spinnerImageView = (SpinnerImageView) AnonymousClass0wJ.A0J(view, R.id.loading_spinner);
        this.A0B = spinnerImageView;
        if (spinnerImageView == null) {
            str = "loadingSpinner";
        } else {
            spinnerImageView.setLoadingStatus(AnonymousClass69F.SUCCESS);
            this.A01 = (ViewStub) AnonymousClass0wJ.A0J(view, R.id.promote_empty_view_stub);
            this.A05 = new C58923Id(view, C35394Iu2.A0b);
            this.A09 = (ViewStub) AnonymousClass0wJ.A0J(view, R.id.promote_error_learn_more_link_view_stub);
            C18200wM.A1F(this);
            if (A08()) {
                A03();
            }
            if (this.A00 == null) {
                ViewStub viewStub = this.A01;
                if (viewStub == null) {
                    str = "errorViewStub";
                } else {
                    View inflate = viewStub.inflate();
                    C04220Ms.A06(inflate);
                    this.A00 = inflate;
                    str = "errorView";
                    TextView textView = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.promote_empty_view_title);
                    this.A03 = textView;
                    if (textView == null) {
                        str = "errorViewTitle";
                    } else {
                        textView.setText(2131833468);
                        View view2 = this.A00;
                        if (view2 != null) {
                            this.A02 = (TextView) AnonymousClass0wJ.A0I(view2, R.id.promote_empty_view_description);
                            ErrorIdentifier errorIdentifier = this.A04;
                            if (errorIdentifier == null) {
                                str = "errorIdentifier";
                            } else if (errorIdentifier == ErrorIdentifier.AD_ACCOUNT_UNSETTLED) {
                                View view3 = this.A00;
                                if (view3 != null) {
                                    Drawable A002 = C30845GYu.A00(AnonymousClass0wJ.A0B(this), R.drawable.instagram_business_images_account_unsettled_icon);
                                    C04220Ms.A06(A002);
                                    ((ImageView) AnonymousClass0wJ.A0J(view3, R.id.promote_empty_view_icon)).setImageDrawable(A002);
                                }
                            }
                        }
                    }
                }
            }
            A04();
            if (A07()) {
                C58923Id r0 = this.A05;
                if (r0 == null) {
                    str = "actionButtonHolder";
                } else {
                    r0.A00();
                    A02();
                    return;
                }
            } else {
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public static C37741K2b A00(AnonymousClass1ai r0) {
        return (C37741K2b) r0.A0F.getValue();
    }

    public static final UserSession A01(AnonymousClass1ai r0) {
        return (UserSession) C18190wL.A0f(r0.A0I);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        r6.A01(r0);
        r2 = X.AnonymousClass0wJ.A0k(r3, 2131833471);
        r0 = X.AnonymousClass0wJ.A0l(r3, r2, 2131833461);
        X.C04220Ms.A06(r0);
        r1 = X.C18200wM.A0E(r0);
        X.AnonymousClass3Zw.A01(r1, new X.C29421y1(r5, r6, r7, "help_link_page_terms", "https://www.facebook.com/page_guidelines.php", X.C18210wN.A01(r3)), r2);
        r0 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006d, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006f, code lost:
        r0.setFooterText(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0072, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
        r6.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0091, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A02() {
        /*
            r11 = this;
            X.3Id r6 = r11.A05
            if (r6 != 0) goto L_0x000b
            java.lang.String r0 = "actionButtonHolder"
        L_0x0006:
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x000b:
            androidx.fragment.app.FragmentActivity r5 = r11.requireActivity()
            com.instagram.service.session.UserSession r7 = A01(r11)
            com.instagram.api.schemas.ErrorIdentifier r4 = r11.A04
            if (r4 != 0) goto L_0x001a
            java.lang.String r0 = "errorIdentifier"
            goto L_0x0006
        L_0x001a:
            r2 = 0
            r0 = 3
            X.C04220Ms.A0B(r7, r0)
            X.K2d r1 = X.C37743K2d.A00(r7)
            android.view.View r0 = r6.A00
            if (r0 == 0) goto L_0x0092
            android.content.Context r3 = r0.getContext()
            r1.A01(r3)
            r6.A04(r2)
            r6.A02(r11)
            int r0 = r4.ordinal()
            switch(r0) {
                case 9: goto L_0x007f;
                case 10: goto L_0x0083;
                case 11: goto L_0x0087;
                case 12: goto L_0x0087;
                case 13: goto L_0x003b;
                case 14: goto L_0x003b;
                case 15: goto L_0x003b;
                case 16: goto L_0x0077;
                case 17: goto L_0x003b;
                case 18: goto L_0x0077;
                case 19: goto L_0x007f;
                case 20: goto L_0x007f;
                case 21: goto L_0x008b;
                case 22: goto L_0x007b;
                case 23: goto L_0x003b;
                case 24: goto L_0x003c;
                case 25: goto L_0x0040;
                case 26: goto L_0x0073;
                default: goto L_0x003b;
            }
        L_0x003b:
            return
        L_0x003c:
            r0 = 2131833450(0x7f11326a, float:1.9299982E38)
            goto L_0x0043
        L_0x0040:
            r0 = 2131833453(0x7f11326d, float:1.9299989E38)
        L_0x0043:
            r6.A01(r0)
            r0 = 2131833471(0x7f11327f, float:1.9300025E38)
            java.lang.String r2 = X.AnonymousClass0wJ.A0k(r3, r0)
            r0 = 2131833461(0x7f113275, float:1.9300005E38)
            java.lang.String r0 = X.AnonymousClass0wJ.A0l(r3, r2, r0)
            X.C04220Ms.A06(r0)
            android.text.SpannableStringBuilder r1 = X.C18200wM.A0E(r0)
            java.lang.String r9 = "https://www.facebook.com/page_guidelines.php"
            java.lang.String r8 = "help_link_page_terms"
            int r10 = X.C18210wN.A01(r3)
            X.1y1 r4 = new X.1y1
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.AnonymousClass3Zw.A01(r1, r4, r2)
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r0 = r6.A02
            if (r0 == 0) goto L_0x003b
            r0.setFooterText(r1)
            return
        L_0x0073:
            r0 = 2131833464(0x7f113278, float:1.930001E38)
            goto L_0x008e
        L_0x0077:
            r0 = 2131833207(0x7f113177, float:1.929949E38)
            goto L_0x008e
        L_0x007b:
            r0 = 2131833462(0x7f113276, float:1.9300007E38)
            goto L_0x008e
        L_0x007f:
            r0 = 2131833465(0x7f113279, float:1.9300013E38)
            goto L_0x008e
        L_0x0083:
            r0 = 2131833460(0x7f113274, float:1.9300003E38)
            goto L_0x008e
        L_0x0087:
            r0 = 2131833062(0x7f1130e6, float:1.9299195E38)
            goto L_0x008e
        L_0x008b:
            r0 = 2131833451(0x7f11326b, float:1.9299984E38)
        L_0x008e:
            r6.A01(r0)
            return
        L_0x0092:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ai.A02():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r1 == null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A03() {
        /*
            r2 = this;
            android.widget.TextView r1 = r2.A0A
            if (r1 != 0) goto L_0x000f
            android.view.ViewStub r0 = r2.A09
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "learnMoreLinkViewStub"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x000f:
            r0 = 0
            r1.setVisibility(r0)
            goto L_0x0020
        L_0x0014:
            android.view.View r0 = r0.inflate()
            android.widget.TextView r1 = X.C18250wR.A0A(r0)
            r2.A0A = r1
            if (r1 != 0) goto L_0x000f
        L_0x0020:
            android.widget.TextView r1 = r2.A0A
            if (r1 == 0) goto L_0x0029
            r0 = 199(0xc7, float:2.79E-43)
            X.AnonymousClass0wJ.A16(r1, r0, r2)
        L_0x0029:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ai.A03():void");
    }

    private final void A04() {
        String str;
        String str2;
        ErrorIdentifier errorIdentifier = this.A04;
        if (errorIdentifier == null) {
            str = "errorIdentifier";
        } else {
            str = "errorViewTitle";
            if (errorIdentifier == ErrorIdentifier.A12 || (str2 = this.A0C) == null || this.A07 == null) {
                TextView textView = this.A03;
                if (textView != null) {
                    textView.setText(2131833468);
                    return;
                }
            } else {
                TextView textView2 = this.A03;
                if (textView2 != null) {
                    textView2.setText(str2);
                    String str3 = this.A07;
                    if (str3 != null) {
                        ErrorIdentifier errorIdentifier2 = this.A04;
                        str = "errorIdentifier";
                        if (errorIdentifier2 != null) {
                            if (errorIdentifier2 == ErrorIdentifier.AD_ACCOUNT_DISABLED_FOR_ADS_INTEGRITY_POLICY || errorIdentifier2 == ErrorIdentifier.BUSINESS_ACCOUNT_BANHAMMERED || errorIdentifier2 == ErrorIdentifier.BUSINESS_ACCOUNT_BANHAMMERED_AND_BUSINESS_VERIFICATION_REQUIRED) {
                                String A0g = C18180wK.A0g(this, 2131833455);
                                ErrorIdentifier errorIdentifier3 = this.A04;
                                if (errorIdentifier3 != null) {
                                    int i = 2131833456;
                                    if (errorIdentifier3 == ErrorIdentifier.BUSINESS_ACCOUNT_BANHAMMERED_AND_BUSINESS_VERIFICATION_REQUIRED) {
                                        i = 2131833454;
                                    }
                                    String A0o = AnonymousClass0wJ.A0o(this, A0g, i);
                                    C04220Ms.A09(A0o);
                                    C37743K2d.A00(A01(this)).A01(requireActivity());
                                    SpannableStringBuilder A0E2 = C18200wM.A0E(A0o);
                                    View view = this.A00;
                                    if (view == null) {
                                        str = "errorView";
                                    } else {
                                        C18720xk.A00(A0E2, this, A0g, C18210wN.A01(view.getContext()), 7);
                                        TextView textView3 = this.A02;
                                        if (textView3 != null) {
                                            textView3.setText(A0E2);
                                            TextView textView4 = this.A02;
                                            if (textView4 != null) {
                                                C18180wK.A0z(textView4);
                                                return;
                                            }
                                        }
                                    }
                                }
                            } else {
                                TextView textView5 = this.A02;
                                if (textView5 != null) {
                                    textView5.setText(str3);
                                    return;
                                }
                            }
                            C04220Ms.A0E("errorViewDescription");
                            throw null;
                        }
                    } else {
                        throw C18180wK.A0a("If the description is null, a default error view will be showed.");
                    }
                }
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    private final void A06(boolean z) {
        TextView textView;
        int i = 8;
        SpinnerImageView spinnerImageView = this.A0B;
        if (z) {
            if (spinnerImageView != null) {
                spinnerImageView.setLoadingStatus(AnonymousClass69F.LOADING);
                View view = this.A00;
                if (view != null) {
                    view.setVisibility(8);
                    C58923Id r0 = this.A05;
                    if (r0 != null) {
                        View view2 = r0.A00;
                        if (view2 != null) {
                            view2.setVisibility(8);
                        }
                        textView = this.A0A;
                        if (textView == null) {
                            return;
                        }
                    }
                    C04220Ms.A0E("actionButtonHolder");
                    throw null;
                }
                C04220Ms.A0E("errorView");
                throw null;
            }
            C04220Ms.A0E("loadingSpinner");
            throw null;
        }
        if (spinnerImageView != null) {
            spinnerImageView.setLoadingStatus(AnonymousClass69F.SUCCESS);
            View view3 = this.A00;
            if (view3 != null) {
                view3.setVisibility(0);
                if (A07()) {
                    C58923Id r02 = this.A05;
                    if (r02 != null) {
                        View view4 = r02.A00;
                        if (view4 != null) {
                            view4.setVisibility(0);
                        }
                    }
                    C04220Ms.A0E("actionButtonHolder");
                    throw null;
                }
                textView = this.A0A;
                if (textView == null) {
                    return;
                }
                if (A08()) {
                    i = 0;
                }
            }
            C04220Ms.A0E("errorView");
            throw null;
        }
        C04220Ms.A0E("loadingSpinner");
        throw null;
        textView.setVisibility(i);
    }

    private final boolean A07() {
        ErrorIdentifier errorIdentifier = this.A04;
        if (errorIdentifier == null) {
            C04220Ms.A0E("errorIdentifier");
            throw null;
        } else if (errorIdentifier == ErrorIdentifier.NO_ACCESS_TO_AD_ACCOUNT || errorIdentifier == ErrorIdentifier.AD_ACCOUNT_NOT_ACTIVE || errorIdentifier == ErrorIdentifier.AD_ACCOUNT_UNSETTLED || errorIdentifier == ErrorIdentifier.AD_ACCOUNT_DISABLED_ELIGIBLE_FOR_SELF_RESOLUTION || errorIdentifier == ErrorIdentifier.PAGE_NOT_CREATED || errorIdentifier == ErrorIdentifier.PAGE_NOT_OWNED || errorIdentifier == ErrorIdentifier.PAGE_NOT_PUBLISHED || errorIdentifier == ErrorIdentifier.BUSINESS_ACCOUNT_BANHAMMERED || errorIdentifier == ErrorIdentifier.BUSINESS_ACCOUNT_BANHAMMERED_BY_ACE || errorIdentifier == ErrorIdentifier.BUSINESS_ACCOUNT_BANHAMMERED_BY_COMMERCE_DNR || errorIdentifier == ErrorIdentifier.AD_ACCOUNT_DISABLED_FOR_PAYMENT_RISK || errorIdentifier == ErrorIdentifier.AD_ACCOUNT_DISABLED_FOR_ADS_INTEGRITY_POLICY || errorIdentifier == ErrorIdentifier.BUSINESS_ACCOUNT_BANHAMMERED_AND_BUSINESS_VERIFICATION_REQUIRED) {
            return true;
        } else {
            return false;
        }
    }

    private final boolean A08() {
        ErrorIdentifier errorIdentifier = this.A04;
        if (errorIdentifier == null) {
            C04220Ms.A0E("errorIdentifier");
            throw null;
        } else if (errorIdentifier == ErrorIdentifier.BUSINESS_TWO_FAC_ENABLED || errorIdentifier == ErrorIdentifier.NO_ACCESS_TO_AD_ACCOUNT || errorIdentifier == ErrorIdentifier.NOT_PAGE_ADVERTISER || errorIdentifier == ErrorIdentifier.AD_ACCOUNT_NOT_ACTIVE) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0080, code lost:
        r3 = X.C63873iU.A06(r8, r0);
        r2 = X.AnonymousClass0wJ.A0N(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0088, code lost:
        if (r1 == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008a, code lost:
        r0 = "business/account/create_and_claim_page/";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008c, code lost:
        r2.A0J(r0);
        r2.A0O("fb_access_token", r5);
        r0 = X.C18180wK.A0T(r2, X.C21991Sy.class, X.AnonymousClass3L7.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009c, code lost:
        if (r3 == null) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x009e, code lost:
        r0.A00 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a0, code lost:
        X.C31155GhB.A01(r6, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00a4, code lost:
        r0 = "business/account/claim_unowned_page/";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x015b, code lost:
        r2.A0J(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0179, code lost:
        X.AnonymousClass2KS.A00(r2, r3, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x017c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01a4, code lost:
        X.AnonymousClass2KP.A00(r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01a7, code lost:
        X.C18190wL.A1A(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01aa, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01c5, code lost:
        X.C37740K2a.A04(r4, r2, r3, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01c9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BjA() {
        /*
            r8 = this;
            com.instagram.api.schemas.ErrorIdentifier r0 = r8.A04
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "errorIdentifier"
            X.C04220Ms.A0E(r0)
            r0 = 0
            throw r0
        L_0x000b:
            int r0 = r0.ordinal()
            r7 = 1
            java.lang.String r2 = "request_review"
            switch(r0) {
                case 9: goto L_0x017d;
                case 10: goto L_0x012f;
                case 11: goto L_0x014a;
                case 12: goto L_0x0153;
                case 13: goto L_0x0015;
                case 14: goto L_0x0015;
                case 15: goto L_0x0015;
                case 16: goto L_0x00cc;
                case 17: goto L_0x0015;
                case 18: goto L_0x00cc;
                case 19: goto L_0x015f;
                case 20: goto L_0x0191;
                case 21: goto L_0x01ab;
                case 22: goto L_0x0016;
                case 23: goto L_0x0015;
                case 24: goto L_0x0037;
                case 25: goto L_0x005c;
                case 26: goto L_0x00a7;
                default: goto L_0x0015;
            }
        L_0x0015:
            return
        L_0x0016:
            X.K2b r2 = A00(r8)
            X.Iu2 r1 = X.C35394Iu2.A0b
            java.lang.String r0 = "pay_now"
            r2.A0J(r1, r0)
            r8.A0D = r7
            java.lang.String r1 = r8.A06
            if (r1 == 0) goto L_0x0015
            androidx.fragment.app.FragmentActivity r4 = r8.requireActivity()
            com.instagram.service.session.UserSession r3 = A01(r8)
            r0 = 2
            com.facebook.redex.IDxTCallbackShape37S1100000_1_I2 r2 = new com.facebook.redex.IDxTCallbackShape37S1100000_1_I2
            r2.<init>(r1, r8, r0)
            goto L_0x01c5
        L_0x0037:
            X.K2b r2 = A00(r8)
            X.Iu2 r1 = X.C35394Iu2.A0b
            java.lang.String r0 = "claim"
            r2.A0J(r1, r0)
            android.content.Context r6 = r8.requireContext()
            com.instagram.service.session.UserSession r2 = A01(r8)
            X.0Oa r0 = r8.A0G
            java.lang.Object r0 = X.C18190wL.A0f(r0)
            com.instagram.business.promote.model.PromoteData r0 = (com.instagram.business.promote.model.PromoteData) r0
            java.lang.String r5 = r0.A0x
            r1 = 0
            X.06E r4 = X.AnonymousClass06E.A00(r8)
            r0 = 27
            goto L_0x0080
        L_0x005c:
            X.K2b r2 = A00(r8)
            X.Iu2 r1 = X.C35394Iu2.A0b
            java.lang.String r0 = "create"
            r2.A0J(r1, r0)
            android.content.Context r6 = r8.requireContext()
            com.instagram.service.session.UserSession r2 = A01(r8)
            X.0Oa r0 = r8.A0G
            java.lang.Object r0 = X.C18190wL.A0f(r0)
            com.instagram.business.promote.model.PromoteData r0 = (com.instagram.business.promote.model.PromoteData) r0
            java.lang.String r5 = r0.A0x
            r1 = 1
            X.06E r4 = X.AnonymousClass06E.A00(r8)
            r0 = 28
        L_0x0080:
            com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2 r3 = X.C63873iU.A06(r8, r0)
            X.H1T r2 = X.AnonymousClass0wJ.A0N(r2)
            if (r1 == 0) goto L_0x00a4
            java.lang.String r0 = "business/account/create_and_claim_page/"
        L_0x008c:
            r2.A0J(r0)
            java.lang.String r0 = "fb_access_token"
            r2.A0O(r0, r5)
            java.lang.Class<X.1Sy> r1 = X.C21991Sy.class
            java.lang.Class<X.3L7> r0 = X.AnonymousClass3L7.class
            X.H8c r0 = X.C18180wK.A0T(r2, r1, r0)
            if (r3 == 0) goto L_0x00a0
            r0.A00 = r3
        L_0x00a0:
            X.C31155GhB.A01(r6, r4, r0)
            return
        L_0x00a4:
            java.lang.String r0 = "business/account/claim_unowned_page/"
            goto L_0x008c
        L_0x00a7:
            X.K2b r2 = A00(r8)
            X.Iu2 r1 = X.C35394Iu2.A0b
            r0 = 246(0xf6, float:3.45E-43)
            java.lang.String r0 = X.C28174Ezk.A00(r0)
            r2.A0J(r1, r0)
            android.content.Context r3 = r8.requireContext()
            com.instagram.service.session.UserSession r2 = A01(r8)
            X.06E r1 = X.AnonymousClass06E.A00(r8)
            r0 = 29
            com.instagram.common.api.base.IDxACallbackShape111S0100000_1_I2 r0 = X.C63873iU.A06(r8, r0)
            X.C67163yy.A00(r3, r1, r0, r2)
            return
        L_0x00cc:
            X.K2b r1 = A00(r8)
            X.Iu2 r6 = X.C35394Iu2.A0b
            java.lang.String r0 = "payments"
            r1.A0J(r6, r0)
            com.instagram.service.session.UserSession r0 = A01(r8)
            java.lang.String r5 = "promote_no_permissions"
            X.AnonymousClass3X0.A01(r5, r0)
            r8.A0D = r7
            androidx.fragment.app.FragmentActivity r4 = r8.requireActivity()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity"
            X.C04220Ms.A0C(r4, r0)
            com.instagram.base.activity.BaseFragmentActivity r4 = (com.instagram.base.activity.BaseFragmentActivity) r4
            com.instagram.service.session.UserSession r3 = A01(r8)
            X.0TJ r2 = X.AnonymousClass0TJ.A05
            r0 = 36312058702070598(0x8101a000000346, double:3.027230367889097E-306)
            boolean r0 = X.C63803iN.A0E(r2, r3, r0)
            if (r0 == 0) goto L_0x0117
            androidx.fragment.app.FragmentActivity r3 = r8.requireActivity()
            androidx.fragment.app.FragmentActivity r0 = r8.requireActivity()
            X.06E r2 = X.AnonymousClass06E.A00(r0)
            com.instagram.service.session.UserSession r1 = A01(r8)
            X.42u r0 = new X.42u
            r0.<init>(r4, r8)
            X.C37367JqP.A00(r3, r2, r0, r1)
            return
        L_0x0117:
            com.instagram.service.session.UserSession r2 = A01(r8)
            r0 = 0
            X.C04220Ms.A0B(r4, r0)
            X.AnonymousClass0wJ.A1Q(r6, r2)
            X.06E r1 = X.AnonymousClass06E.A00(r4)
            X.42v r0 = new X.42v
            r0.<init>(r4, r6, r2, r5)
            X.C37367JqP.A00(r4, r1, r0, r2)
            return
        L_0x012f:
            X.K2b r1 = A00(r8)
            X.Iu2 r0 = X.C35394Iu2.A0b
            r1.A0J(r0, r2)
            com.instagram.service.session.UserSession r3 = A01(r8)
            androidx.fragment.app.FragmentActivity r2 = r8.requireActivity()
            r0 = 2131833470(0x7f11327e, float:1.9300023E38)
            java.lang.String r1 = X.C18180wK.A0g(r8, r0)
            java.lang.String r0 = "https://business.facebook.com"
            goto L_0x0179
        L_0x014a:
            X.K2b r2 = A00(r8)
            X.Iu2 r1 = X.C35394Iu2.A0b
            java.lang.String r0 = "ace_banhammer_close"
            goto L_0x015b
        L_0x0153:
            X.K2b r2 = A00(r8)
            X.Iu2 r1 = X.C35394Iu2.A0b
            java.lang.String r0 = "dnr_banhammer_close"
        L_0x015b:
            r2.A0J(r1, r0)
            goto L_0x01a7
        L_0x015f:
            X.K2b r1 = A00(r8)
            X.Iu2 r0 = X.C35394Iu2.A0b
            r1.A0J(r0, r2)
            com.instagram.service.session.UserSession r3 = A01(r8)
            androidx.fragment.app.FragmentActivity r2 = r8.requireActivity()
            r0 = 2131833448(0x7f113268, float:1.9299978E38)
            java.lang.String r1 = X.C18180wK.A0g(r8, r0)
            java.lang.String r0 = "https://help.instagram.com/contact/502692143473097"
        L_0x0179:
            X.AnonymousClass2KS.A00(r2, r3, r1, r0)
            return
        L_0x017d:
            X.K2b r1 = A00(r8)
            X.Iu2 r0 = X.C35394Iu2.A0b
            r1.A0J(r0, r2)
            com.instagram.service.session.UserSession r2 = A01(r8)
            androidx.fragment.app.FragmentActivity r1 = r8.requireActivity()
            java.lang.String r0 = "instagram_business_request_review_button"
            goto L_0x01a4
        L_0x0191:
            X.K2b r1 = A00(r8)
            X.Iu2 r0 = X.C35394Iu2.A0b
            r1.A0J(r0, r2)
            com.instagram.service.session.UserSession r2 = A01(r8)
            androidx.fragment.app.FragmentActivity r1 = r8.requireActivity()
            java.lang.String r0 = "instagram_ad_account_request_review_button"
        L_0x01a4:
            X.AnonymousClass2KP.A00(r1, r2, r0)
        L_0x01a7:
            X.C18190wL.A1A(r8)
            return
        L_0x01ab:
            X.K2b r2 = A00(r8)
            X.Iu2 r1 = X.C35394Iu2.A0b
            java.lang.String r0 = "ad_account_disabled_self_resolution"
            r2.A0J(r1, r0)
            r8.A0D = r7
            androidx.fragment.app.FragmentActivity r4 = r8.requireActivity()
            com.instagram.service.session.UserSession r3 = A01(r8)
            com.facebook.redex.IDxTCallbackShape820S0100000_1_I2 r2 = new com.facebook.redex.IDxTCallbackShape820S0100000_1_I2
            r2.<init>(r8, r7)
        L_0x01c5:
            r0 = 0
            X.C37740K2a.A04(r4, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ai.BjA():void");
    }

    public final void CBv(KtCSuperShape0S2200000_I2 ktCSuperShape0S2200000_I2) {
        ErrorIdentifier errorIdentifier;
        if (ktCSuperShape0S2200000_I2 == null || (errorIdentifier = (ErrorIdentifier) ktCSuperShape0S2200000_I2.A01) == null) {
            errorIdentifier = ErrorIdentifier.A12;
        }
        this.A04 = errorIdentifier;
        A06(false);
        A04();
    }

    public final C10300i6 getSession() {
        return A01(this);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = C14030oh.A02(1859127664);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A0C = bundle2.getString("error_title");
            this.A07 = bundle2.getString(TraceFieldType.Error);
            this.A06 = bundle2.getString("ad_account_id");
            this.A08 = bundle2.getString("paymentMethodID");
        }
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str = bundle3.getString("error_type");
        } else {
            str = null;
        }
        ErrorIdentifier errorIdentifier = (ErrorIdentifier) ErrorIdentifier.A01.get(str);
        if (errorIdentifier == null) {
            errorIdentifier = ErrorIdentifier.UNRECOGNIZED;
        }
        this.A04 = errorIdentifier;
        C14030oh.A09(-1763667249, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(986148906);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_error_view, viewGroup, false);
        C14030oh.A09(622422238, A022);
        return inflate;
    }

    public final void onResume() {
        int A022 = C14030oh.A02(750325690);
        super.onResume();
        if (this.A0D) {
            ErrorIdentifier errorIdentifier = this.A04;
            if (errorIdentifier == null) {
                C04220Ms.A0E("errorIdentifier");
                throw null;
            } else if (errorIdentifier == ErrorIdentifier.NO_ACCESS_TO_AD_ACCOUNT || errorIdentifier == ErrorIdentifier.AD_ACCOUNT_NOT_ACTIVE || errorIdentifier == ErrorIdentifier.AD_ACCOUNT_UNSETTLED || errorIdentifier == ErrorIdentifier.AD_ACCOUNT_DISABLED_ELIGIBLE_FOR_SELF_RESOLUTION) {
                this.A0D = false;
                A05(this);
            }
        }
        C14030oh.A09(-72355982, A022);
    }
}
