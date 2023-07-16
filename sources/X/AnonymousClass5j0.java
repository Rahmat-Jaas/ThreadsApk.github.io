package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape508S0100000_2_I2;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.expresscheckout.models.EcpNuxLearnMoreScreenStyle;
import com.facebookpay.widget.listcell.ListCell;
import com.fbpay.logging.LoggingContext;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.5j0  reason: invalid class name */
public final class AnonymousClass5j0 extends AnonymousClass567 {
    public ContextThemeWrapper A00;
    public ECPPaymentRequest A01;
    public AnonymousClass58J A02;
    public LoggingContext A03;

    public final void onViewCreated(View view, Bundle bundle) {
        ContextThemeWrapper contextThemeWrapper;
        int i;
        CharSequence charSequence;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (getActivity() != null) {
            ImageView A0J = C18200wM.A0J(view, R.id.pay_logo);
            boolean A012 = AnonymousClass7HK.A01();
            String str = "viewContext";
            C121097Ec A0G = AnonymousClass7Kz.A0G();
            if (A012) {
                C121097Ec.A01(A0J.getContext(), A0J, A0G, 40, 33);
                contextThemeWrapper = this.A00;
                if (contextThemeWrapper != null) {
                    i = 2131826368;
                }
                C04220Ms.A0E(str);
                throw null;
            }
            C121097Ec.A01(A0J.getContext(), A0J, A0G, 23, 33);
            contextThemeWrapper = this.A00;
            if (contextThemeWrapper != null) {
                i = 2131826367;
            }
            C04220Ms.A0E(str);
            throw null;
            A0J.setContentDescription(contextThemeWrapper.getString(i));
            TextView A0L = AnonymousClass0wJ.A0L(view, R.id.sheet_title_text);
            C04220Ms.A04(A0L);
            AnonymousClass7Fd.A02(A0L, AnonymousClass69Q.A0W);
            ContextThemeWrapper contextThemeWrapper2 = this.A00;
            if (contextThemeWrapper2 != null) {
                A0L.setText(contextThemeWrapper2.getText(2131826580));
                ListCell listCell = (ListCell) view.requireViewById(R.id.payment_cell);
                AnonymousClass69Q r4 = AnonymousClass69Q.A0X;
                listCell.setPrimaryTextStyle(r4);
                ContextThemeWrapper contextThemeWrapper3 = this.A00;
                if (contextThemeWrapper3 != null) {
                    listCell.setPrimaryText(contextThemeWrapper3.getString(2131826578));
                    ContextThemeWrapper contextThemeWrapper4 = this.A00;
                    if (contextThemeWrapper4 != null) {
                        AnonymousClass51J r1 = new AnonymousClass51J(contextThemeWrapper4);
                        r1.setIcon(AnonymousClass697.NUX_CARD);
                        listCell.setLeftAddOnIcon(r1);
                        ListCell listCell2 = (ListCell) view.requireViewById(R.id.data_cell);
                        listCell2.setPrimaryTextStyle(r4);
                        ContextThemeWrapper contextThemeWrapper5 = this.A00;
                        if (contextThemeWrapper5 != null) {
                            listCell2.setPrimaryText(contextThemeWrapper5.getString(2131826575));
                            ContextThemeWrapper contextThemeWrapper6 = this.A00;
                            if (contextThemeWrapper6 != null) {
                                AnonymousClass51J r12 = new AnonymousClass51J(contextThemeWrapper6);
                                r12.setIcon(AnonymousClass697.NUX_DATA);
                                listCell2.setLeftAddOnIcon(r12);
                                ListCell listCell3 = (ListCell) view.requireViewById(R.id.fraud_cell);
                                listCell3.setPrimaryTextStyle(r4);
                                ContextThemeWrapper contextThemeWrapper7 = this.A00;
                                if (contextThemeWrapper7 != null) {
                                    int i2 = 2131826514;
                                    if (AnonymousClass7HK.A01()) {
                                        i2 = 2131826561;
                                    }
                                    listCell3.setPrimaryText(contextThemeWrapper7.getString(i2));
                                    ContextThemeWrapper contextThemeWrapper8 = this.A00;
                                    if (contextThemeWrapper8 != null) {
                                        AnonymousClass51J r13 = new AnonymousClass51J(contextThemeWrapper8);
                                        r13.setIcon(AnonymousClass697.NUX_ACTIVITY);
                                        listCell3.setLeftAddOnIcon(r13);
                                        ListCell listCell4 = (ListCell) view.requireViewById(R.id.pin_cell);
                                        listCell4.setPrimaryTextStyle(r4);
                                        ContextThemeWrapper contextThemeWrapper9 = this.A00;
                                        if (contextThemeWrapper9 != null) {
                                            listCell4.setPrimaryText(contextThemeWrapper9.getString(2131826579));
                                            ContextThemeWrapper contextThemeWrapper10 = this.A00;
                                            if (contextThemeWrapper10 != null) {
                                                AnonymousClass51J r14 = new AnonymousClass51J(contextThemeWrapper10);
                                                r14.setIcon(AnonymousClass697.NUX_LOCK);
                                                listCell4.setLeftAddOnIcon(r14);
                                                ListCell listCell5 = (ListCell) view.requireViewById(R.id.help_cell);
                                                listCell5.setPrimaryTextStyle(r4);
                                                ContextThemeWrapper contextThemeWrapper11 = this.A00;
                                                if (contextThemeWrapper11 != null) {
                                                    listCell5.setPrimaryText(contextThemeWrapper11.getString(2131826577));
                                                    ContextThemeWrapper contextThemeWrapper12 = this.A00;
                                                    if (contextThemeWrapper12 != null) {
                                                        AnonymousClass51J r15 = new AnonymousClass51J(contextThemeWrapper12);
                                                        r15.setIcon(AnonymousClass697.NUX_HELP);
                                                        listCell5.setLeftAddOnIcon(r15);
                                                        TextView A0L2 = AnonymousClass0wJ.A0L(view, R.id.footer_text);
                                                        C04220Ms.A04(A0L2);
                                                        AnonymousClass7Fd.A02(A0L2, AnonymousClass69Q.A0V);
                                                        ECPPaymentRequest eCPPaymentRequest = this.A01;
                                                        if (eCPPaymentRequest == null) {
                                                            str = "ecpPaymentRequest";
                                                        } else {
                                                            EcpNuxLearnMoreScreenStyle ecpNuxLearnMoreScreenStyle = eCPPaymentRequest.A04.A08;
                                                            if (ecpNuxLearnMoreScreenStyle == null || (charSequence = ecpNuxLearnMoreScreenStyle.A00) == null) {
                                                                ContextThemeWrapper contextThemeWrapper13 = this.A00;
                                                                if (contextThemeWrapper13 != null) {
                                                                    String obj = contextThemeWrapper13.getText(2131826576).toString();
                                                                    ArrayList A0v = AnonymousClass0wJ.A0v();
                                                                    C86164wN.A1L("[[manage_payment_info_token]]", "https://www.facebook.com/help/565350107604363?ref=learn_more", A0v, 2131826558);
                                                                    C86164wN.A1L("[[data_terms_token]]", "https://www.facebook.com/privacy/explanation/", A0v, 2131826566);
                                                                    C86164wN.A1L("[[payment_terms_token]]", "https://www.facebook.com/payments_terms/", A0v, 2131826637);
                                                                    charSequence = C99186Il.A00(requireContext(), ImmutableList.copyOf((Collection) A0v), obj).A00(new IDxCListenerShape508S0100000_2_I2(this, 8), false);
                                                                }
                                                            }
                                                            A0L2.setText(charSequence);
                                                            A0L2.setLinkTextColor(AnonymousClass7Kz.A0G().A03(A0L2.getContext(), 5));
                                                            A0L2.setMovementMethod(new LinkMovementMethod());
                                                            A0L2.setTextAlignment(4);
                                                            View A0K = AnonymousClass0wJ.A0K(view, R.id.divider);
                                                            ContextThemeWrapper contextThemeWrapper14 = this.A00;
                                                            if (contextThemeWrapper14 != null) {
                                                                C121047Dv.A00(contextThemeWrapper14, A0K, 19, false);
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
        AnonymousClass7KT.A08(this, false);
        AnonymousClass7KT.A03(this);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = C14030oh.A02(-1671690960);
        super.onCreate(bundle);
        this.A03 = AnonymousClass567.A02(this);
        Parcelable parcelable = requireArguments().getParcelable("ECP_LAUNCH_PARAMS");
        C04220Ms.A0C(parcelable, "null cannot be cast to non-null type com.facebookpay.expresscheckout.models.ECPPaymentRequest");
        this.A01 = (ECPPaymentRequest) parcelable;
        this.A02 = C116896xj.A00(this, (ECPPaymentRequest) null);
        C128957ke A002 = AnonymousClass7JJ.A00();
        LoggingContext loggingContext = this.A03;
        if (loggingContext == null) {
            str = "loggingContext";
        } else {
            AnonymousClass58J r0 = this.A02;
            if (r0 == null) {
                str = "ecpNuxViewModel";
            } else {
                C128957ke.A03(C18180wK.A0I(C86104wH.A0K(A002.A00, "client_load_ecpbranding_success"), 274), loggingContext, AnonymousClass7Kr.A07(r0.A0S), "ecp_branding_banner_learn_more_detail", 24);
                C14030oh.A09(20044657, A022);
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(346895413);
        ContextThemeWrapper A002 = AnonymousClass567.A00(this, layoutInflater);
        this.A00 = A002;
        View inflate = layoutInflater.cloneInContext(A002).inflate(R.layout.ecp_nux_learn_more_fragment, viewGroup, false);
        C14030oh.A09(246790472, A022);
        return inflate;
    }
}
