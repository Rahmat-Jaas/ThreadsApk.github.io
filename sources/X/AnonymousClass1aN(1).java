package X;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.redex.IDxAListenerShape388S0100000_1_I2;
import com.facebook.redex.IDxCListenerShape173S0200000_1_I2;
import com.facebook.smartcapture.logging.SCEventNames;
import com.instagram.barcelona.R;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.service.session.UserSession;
import com.instagram.ui.text.IDxCSpanShape187S0100000_1_I2;
import com.instagram.ui.widget.edittext.ConfirmationCodeEditText;
import com.instagram.ui.widget.progressbutton.ProgressButton;
import kotlin.jvm.internal.KtLambdaShape83S0100000_I2_63;

/* renamed from: X.1aN  reason: invalid class name */
public final class AnonymousClass1aN extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "TwoFacConfirmCodeFragment";
    public AnonymousClass38M A00;
    public ConfirmationCodeEditText A01;
    public ProgressButton A02;
    public Integer A03;
    public Integer A04;
    public String A05;
    public final C04530Oa A06 = AnonymousClass0OY.A02(new KtLambdaShape83S0100000_I2_63(this, 45));
    public final C04530Oa A07 = AnonymousClass0OY.A02(new KtLambdaShape83S0100000_I2_63(this, 46));
    public final C04530Oa A08 = AnonymousClass0OY.A02(new KtLambdaShape83S0100000_I2_63(this, 47));
    public final C04530Oa A09 = AnonymousClass0OY.A02(new KtLambdaShape83S0100000_I2_63(this, 48));
    public final C04530Oa A0A = AnonymousClass0OY.A02(new KtLambdaShape83S0100000_I2_63(this, 49));
    public final C04530Oa A0B = C80644m9.A00(this);
    public final C04530Oa A0C = C18210wN.A0j(this, 0);
    public final C04530Oa A0D = C18210wN.A0j(this, 1);
    public final C04530Oa A0E = C18210wN.A0j(this, 2);
    public final C04530Oa A0F = C18210wN.A0j(this, 3);
    public final C04530Oa A0G = C18210wN.A0j(this, 4);
    public final C04530Oa A0H = C18210wN.A0j(this, 5);

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131837039);
    }

    public static void A00(H1T h1t, String str) {
        h1t.A0O(C63833iQ.A07(208, 9, 126), str);
    }

    public static final void A01(AnonymousClass1aN r10) {
        String str;
        C32165H8c h8c;
        C04530Oa r0;
        C63873iU r6;
        H1T A0O;
        ConfirmationCodeEditText confirmationCodeEditText = r10.A01;
        if (confirmationCodeEditText == null) {
            str = "confirmationCodeEditText";
        } else {
            String A0n = AnonymousClass0wJ.A0n(confirmationCodeEditText);
            C04530Oa r5 = r10.A0B;
            C10300i6 A0U = AnonymousClass0wJ.A0U(r5);
            int A022 = C18200wM.A02(0, A0U, A0n);
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(C60923Rc.A01, A0U), "instagram_two_fac_setup_action"), 2315);
            C18210wN.A1A(A0I, SCEventNames.Params.STEP_CHANGE_NEXT);
            A0I.A0T("view", "");
            C63833iQ.A0D(A0I);
            String A072 = C63833iQ.A07(808, 17, 9);
            A0I.A0T(A072, A0n);
            A0I.Bb4();
            Integer num = r10.A03;
            if (num == null) {
                str = "twoFacConfirmCodeSource";
            } else {
                int intValue = num.intValue();
                str = "phoneNumberOrEmail";
                if (intValue != 0) {
                    if (intValue != 1) {
                        if (intValue == 3) {
                            C10300i6 A0U2 = AnonymousClass0wJ.A0U(r5);
                            String str2 = r10.A05;
                            if (str2 != null) {
                                Context requireContext = r10.requireContext();
                                H1T A0N = AnonymousClass0wJ.A0N(A0U2);
                                A0N.A0J("accounts/verify_email_code/");
                                A0N.A0O(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, A0n);
                                A00(A0N, C18220wO.A0g(requireContext, A0N, "email", str2));
                                h8c = C18180wK.A0T(A0N, C21661Rr.class, AnonymousClass3NA.class);
                                r0 = r10.A0D;
                            }
                        } else if (intValue == 4) {
                            C10300i6 A0U3 = AnonymousClass0wJ.A0U(r5);
                            String A002 = C09140ev.A00(r10.requireContext());
                            C04220Ms.A06(A002);
                            C04220Ms.A0B(A0U3, 0);
                            H1T A0O2 = AnonymousClass0wJ.A0O(A0U3);
                            C18200wM.A1N(A0O2, C63833iQ.A07(661, 38, 119));
                            A00(A0O2, A002);
                            h8c = C18200wM.A0T(A0O2, A072, A0n);
                            r0 = r10.A0G;
                        } else if (intValue == A022) {
                            C10300i6 A0U4 = AnonymousClass0wJ.A0U(r5);
                            Context requireContext2 = r10.requireContext();
                            r6 = (C63873iU) r10.A06.getValue();
                            Bundle requireArguments = r10.requireArguments();
                            String A042 = C63833iQ.A04();
                            String A0b = C18210wN.A0b(requireArguments, A042, "");
                            C04220Ms.A0B(A0U4, 0);
                            C04220Ms.A0B(r6, A022);
                            A0O = AnonymousClass0wJ.A0O(A0U4);
                            A0O.A0J(C63833iQ.A07(549, 35, 82));
                            A00(A0O, C09140ev.A00(requireContext2));
                            A0O.A0O(A072, A0n);
                            A0O.A0O(A042, A0b);
                            A0O.A0B(AnonymousClass1RQ.class, AnonymousClass3NH.class);
                        } else {
                            return;
                        }
                        r6 = (C63873iU) r0.getValue();
                    } else {
                        C10300i6 A0U5 = AnonymousClass0wJ.A0U(r5);
                        Context requireContext3 = r10.requireContext();
                        r6 = (C63873iU) r10.A0F.getValue();
                        C18180wK.A1P(A0U5, 0, r6);
                        A0O = AnonymousClass0wJ.A0O(A0U5);
                        A0O.A0J(C63833iQ.A07(33, 32, 31));
                        A0O.A0B(AnonymousClass1RI.class, AnonymousClass3NE.class);
                        A00(A0O, C18220wO.A0g(requireContext3, A0O, A072, A0n));
                        A0O.A06();
                    }
                    h8c = A0O.A02();
                } else {
                    Context requireContext4 = r10.requireContext();
                    UserSession A0X = AnonymousClass0wJ.A0X(r5);
                    String str3 = r10.A05;
                    if (str3 != null) {
                        h8c = C62403Zn.A03(requireContext4, A0X, str3, A0n);
                        r0 = r10.A0E;
                        r6 = (C63873iU) r0.getValue();
                    }
                }
                h8c.A00 = r6;
                C31155GhB.A03(h8c);
                return;
            }
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A0B);
    }

    public final String getModuleName() {
        return C63833iQ.A05();
    }

    public final void onCreate(Bundle bundle) {
        Integer num;
        Integer num2;
        int A022 = C14030oh.A02(-293139339);
        super.onCreate(bundle);
        this.A00 = new AnonymousClass38M();
        Bundle requireArguments = requireArguments();
        this.A05 = C18210wN.A0b(requireArguments, "phone_number_or_email", "");
        String A0b = C18210wN.A0b(requireArguments, "two_fac_method", "");
        Integer[] A1a = C18240wQ.A1a();
        int length = A1a.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                num = AnonymousClass006.A0N;
                break;
            }
            num = A1a[i];
            if (C04220Ms.A0I(C36182Qi.A00(num), A0b)) {
                break;
            }
            i++;
        }
        this.A04 = num;
        String A0b2 = C18210wN.A0b(requireArguments, "two_fac_confirm_code_source", "");
        Integer[] A002 = AnonymousClass006.A00(6);
        int length2 = A002.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length2) {
                num2 = AnonymousClass006.A0j;
                break;
            }
            num2 = A002[i2];
            if (C04220Ms.A0I(C36172Qh.A00(num2), A0b2)) {
                break;
            }
            i2++;
        }
        this.A03 = num2;
        if (requireArguments.getBoolean("two_fac_should_fetch_code")) {
            Context requireContext = requireContext();
            UserSession A0X = AnonymousClass0wJ.A0X(this.A0B);
            String str = this.A05;
            if (str == null) {
                C04220Ms.A0E("phoneNumberOrEmail");
                throw null;
            }
            C63873iU.A0C(this, C62403Zn.A02(requireContext, A0X, str), 83);
        }
        AnonymousClass3WQ.A02(AnonymousClass0wJ.A0X(this.A0B), "enter_code");
        C14030oh.A09(1679319068, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = C14030oh.A02(256696166);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.two_fac_confirm_phone_number_fragment, viewGroup, false);
        ProgressButton progressButton = (ProgressButton) AnonymousClass0wJ.A0J(inflate, R.id.next_button);
        progressButton.setOnClickListener((View.OnClickListener) this.A09.getValue());
        progressButton.setEnabled(false);
        this.A02 = progressButton;
        ConfirmationCodeEditText confirmationCodeEditText = (ConfirmationCodeEditText) AnonymousClass0wJ.A0J(inflate, R.id.edit_text);
        confirmationCodeEditText.addTextChangedListener((C64493mQ) this.A0C.getValue());
        confirmationCodeEditText.setOnEditorActionListener((IDxAListenerShape388S0100000_1_I2) this.A07.getValue());
        confirmationCodeEditText.setOnLongClickListener(new IDxCListenerShape173S0200000_1_I2(1, confirmationCodeEditText, confirmationCodeEditText));
        this.A01 = confirmationCodeEditText;
        TextView textView = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.two_fac_confirm_phone_number_body);
        TextView textView2 = (TextView) AnonymousClass0wJ.A0J(inflate, R.id.footer);
        IDxCSpanShape187S0100000_1_I2 A002 = C18730xl.A00(this, requireContext().getColor(R.color.igds_primary_button), 37);
        Integer num = this.A03;
        if (num == null) {
            str = "twoFacConfirmCodeSource";
        } else {
            int intValue = num.intValue();
            str = "phoneNumberOrEmail";
            if (intValue == 0) {
                String str2 = this.A05;
                if (str2 != null) {
                    textView.setText(AnonymousClass0wJ.A0o(this, C62923b9.A00(str2), 2131837040));
                    C62923b9.A02(A002, C18730xl.A00(this, requireContext().getColor(R.color.igds_primary_button), 36), textView2, C18180wK.A0g(this, 2131837046), C18180wK.A0g(this, 2131837045));
                }
            } else if (intValue == 1) {
                textView.setText(2131837041);
                textView2.setVisibility(8);
                C18190wL.A18(inflate, R.id.space, 0);
            } else if (intValue == 3) {
                textView2.setText(2131837046);
                String A0g = C18180wK.A0g(this, 2131837046);
                SpannableStringBuilder A0E2 = C18200wM.A0E(A0g);
                A0E2.setSpan(A002, 0, C18220wO.A08(A0g), 33);
                C18180wK.A0z(textView2);
                textView2.setHighlightColor(0);
                textView2.setText(C18200wM.A0E(A0E2));
                String str3 = this.A05;
                if (str3 != null) {
                    textView.setText(AnonymousClass0wJ.A0o(this, str3, 2131837004));
                }
            } else if (intValue == 4) {
                ((TextView) AnonymousClass0wJ.A0J(inflate, R.id.two_fac_confirm_phone_number_title)).setText(2131837174);
                textView.setText(2131837172);
                ((TextView) AnonymousClass0wJ.A0J(inflate, R.id.two_fac_confirm_phone_number_description)).setText(2131837173);
                String A0g2 = C18180wK.A0g(this, 2131837046);
                C04220Ms.A0B(textView2, 0);
                SpannableStringBuilder A0E3 = C18200wM.A0E(A0g2);
                A0E3.setSpan(A002, 0, C18220wO.A08(A0g2), 33);
                C18180wK.A0z(textView2);
                textView2.setHighlightColor(0);
                textView2.setText(C18200wM.A0E(A0E3));
            }
            C24731jw.A02(this);
            C14030oh.A09(-1864916589, A022);
            return inflate;
        }
        C04220Ms.A0E(str);
        throw null;
    }

    public final void onPause() {
        int A022 = C14030oh.A02(-1772228201);
        super.onPause();
        Window A0F2 = C18190wL.A0F(this);
        if (A0F2 != null) {
            A0F2.setSoftInputMode(0);
            ConfirmationCodeEditText confirmationCodeEditText = this.A01;
            if (confirmationCodeEditText == null) {
                C04220Ms.A0E("confirmationCodeEditText");
                throw null;
            }
            C09860go.A0I(confirmationCodeEditText);
        }
        C14030oh.A09(-1700705866, A022);
    }

    public final void onResume() {
        int A022 = C14030oh.A02(1515815582);
        super.onResume();
        Window A0F2 = C18190wL.A0F(this);
        if (A0F2 != null) {
            A0F2.setSoftInputMode(16);
            ConfirmationCodeEditText confirmationCodeEditText = this.A01;
            if (confirmationCodeEditText != null) {
                confirmationCodeEditText.requestFocus();
                ConfirmationCodeEditText confirmationCodeEditText2 = this.A01;
                if (confirmationCodeEditText2 != null) {
                    C09860go.A0K(confirmationCodeEditText2);
                }
            }
            C04220Ms.A0E("confirmationCodeEditText");
            throw null;
        }
        C14030oh.A09(-1402823773, A022);
    }
}
