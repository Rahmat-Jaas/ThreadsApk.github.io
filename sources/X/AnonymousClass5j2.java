package X;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.facebookpay.form.cell.text.TextValidatorParams;
import com.facebookpay.form.view.FormLayout;
import com.facebookpay.widget.button.FBPayButton;
import com.fbpay.logging.LoggingContext;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape26S0100000_I2_6;
import kotlin.jvm.internal.KtLambdaShape3S1300000_I2;
import kotlin.jvm.internal.KtLambdaShape41S0200000_I2_2;

/* renamed from: X.5j2  reason: invalid class name */
public final class AnonymousClass5j2 extends AnonymousClass567 {
    public ContextThemeWrapper A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public RecyclerView A04;
    public RecyclerView A05;
    public AnonymousClass5AC A06;
    public AnonymousClass5AC A07;
    public FormLayout A08;
    public AnonymousClass587 A09;
    public AnonymousClass58K A0A;
    public FBPayButton A0B;
    public LoggingContext A0C;
    public String A0D;
    public final C143158gC A0E = C86114wI.A0Q(this, 179);

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A08 = (FormLayout) AnonymousClass0wJ.A0J(view, R.id.form_container);
        this.A03 = (TextView) AnonymousClass0wJ.A0J(view, R.id.title);
        this.A02 = (TextView) AnonymousClass0wJ.A0J(view, R.id.promo_code_label);
        this.A01 = (TextView) AnonymousClass0wJ.A0J(view, R.id.other_offers_label);
        this.A0B = (FBPayButton) AnonymousClass0wJ.A0J(view, R.id.button);
        ContextThemeWrapper contextThemeWrapper = this.A00;
        if (contextThemeWrapper == null) {
            C04220Ms.A0E("viewContext");
            throw null;
        }
        this.A0D = AnonymousClass0wJ.A0k(contextThemeWrapper, 2131826533);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0wJ.A0J(view, R.id.promo_code_recycler_view);
        this.A05 = recyclerView;
        if (getActivity() != null) {
            if (recyclerView == null) {
                C04220Ms.A0E("promoCodeRecyclerView");
                throw null;
            }
            C18200wM.A1H(recyclerView, 1);
            recyclerView.setItemAnimator((M0E) null);
            Object A0h = C86144wL.A0h(this);
            if (A0h != null) {
                if (((AnonymousClass69R) A0h).A07) {
                    AnonymousClass6XN.A00.A04(recyclerView);
                }
                KtLambdaShape41S0200000_I2_2 ktLambdaShape41S0200000_I2_2 = new KtLambdaShape41S0200000_I2_2(15, (Object) this, (Object) this);
                LoggingContext loggingContext = this.A0C;
                if (loggingContext == null) {
                    C04220Ms.A0E("loggingContext");
                    throw null;
                }
                C91445gF r1 = new C91445gF(loggingContext, ktLambdaShape41S0200000_I2_2);
                AnonymousClass5AC r0 = new AnonymousClass5AC(AnonymousClass4WK.A0O(C18180wK.A0p(r1.A02, r1)));
                this.A07 = r0;
                recyclerView.setAdapter(r0);
                RecyclerView recyclerView2 = (RecyclerView) AnonymousClass0wJ.A0J(view, R.id.offersRecyclerView);
                this.A04 = recyclerView2;
                if (recyclerView2 == null) {
                    C04220Ms.A0E("offersRecyclerView");
                    throw null;
                }
                C18200wM.A1H(recyclerView2, 1);
                recyclerView2.setItemAnimator((M0E) null);
                KtLambdaShape41S0200000_I2_2 ktLambdaShape41S0200000_I2_22 = new KtLambdaShape41S0200000_I2_2(16, (Object) this, (Object) this);
                LoggingContext loggingContext2 = this.A0C;
                if (loggingContext2 == null) {
                    C04220Ms.A0E("loggingContext");
                    throw null;
                }
                C91415gC r12 = new C91415gC(loggingContext2, ktLambdaShape41S0200000_I2_22);
                AnonymousClass5AC r02 = new AnonymousClass5AC(AnonymousClass4WK.A0O(C18180wK.A0p(r12.A02, r12)));
                this.A06 = r02;
                recyclerView2.setAdapter(r02);
            } else {
                throw AnonymousClass0wJ.A0b();
            }
        }
        TextView textView = this.A03;
        if (textView == null) {
            C04220Ms.A0E(DialogModule.KEY_TITLE);
            throw null;
        }
        ContextThemeWrapper contextThemeWrapper2 = this.A00;
        if (contextThemeWrapper2 == null) {
            C04220Ms.A0E("viewContext");
            throw null;
        }
        C18200wM.A15(contextThemeWrapper2, textView, 2131826522);
        TextView textView2 = this.A03;
        if (textView2 == null) {
            C04220Ms.A0E(DialogModule.KEY_TITLE);
            throw null;
        }
        AnonymousClass7Fd.A02(textView2, AnonymousClass69Q.A0s);
        TextView textView3 = this.A02;
        if (textView3 == null) {
            C04220Ms.A0E("promoCodeLabel");
            throw null;
        }
        ContextThemeWrapper contextThemeWrapper3 = this.A00;
        if (contextThemeWrapper3 == null) {
            C04220Ms.A0E("viewContext");
            throw null;
        }
        C18200wM.A15(contextThemeWrapper3, textView3, 2131826613);
        TextView textView4 = this.A02;
        if (textView4 == null) {
            C04220Ms.A0E("promoCodeLabel");
            throw null;
        }
        AnonymousClass69Q r5 = AnonymousClass69Q.A0q;
        AnonymousClass7Fd.A02(textView4, r5);
        TextView textView5 = this.A01;
        if (textView5 == null) {
            C04220Ms.A0E("otherOffersLabel");
            throw null;
        }
        ContextThemeWrapper contextThemeWrapper4 = this.A00;
        if (contextThemeWrapper4 == null) {
            C04220Ms.A0E("viewContext");
            throw null;
        }
        C18200wM.A15(contextThemeWrapper4, textView5, 2131826587);
        TextView textView6 = this.A01;
        if (textView6 == null) {
            C04220Ms.A0E("otherOffersLabel");
            throw null;
        }
        AnonymousClass7Fd.A02(textView6, r5);
        FBPayButton fBPayButton = this.A0B;
        if (fBPayButton == null) {
            C04220Ms.A0E("applyButton");
            throw null;
        }
        String str = this.A0D;
        if (str == null) {
            C04220Ms.A0E("applyButtonTitle");
            throw null;
        }
        fBPayButton.setText(str);
        AnonymousClass58M A012 = C116896xj.A01(this, (ECPPaymentRequest) null);
        ContextThemeWrapper contextThemeWrapper5 = this.A00;
        if (contextThemeWrapper5 == null) {
            C04220Ms.A0E("viewContext");
            throw null;
        }
        String A0k = AnonymousClass0wJ.A0k(contextThemeWrapper5, 2131826612);
        ContextThemeWrapper contextThemeWrapper6 = this.A00;
        if (contextThemeWrapper6 == null) {
            C04220Ms.A0E("viewContext");
            throw null;
        }
        String A0k2 = AnonymousClass0wJ.A0k(contextThemeWrapper6, 2131826611);
        boolean z = A012.A0Z;
        C91895h1 r4 = new C91895h1(23);
        r4.A0E = A0k;
        r4.A0G.add((Object) new TextValidatorParams("", AnonymousClass006.A0Y, A0k2));
        r4.A08 = Boolean.valueOf(z);
        ImmutableList of = ImmutableList.of(r4.A00());
        C04220Ms.A06(of);
        C883057n r2 = (C883057n) new AnonymousClass7IU(this).A01(C883057n.class);
        this.A09 = A012.A1O;
        AnonymousClass58K r6 = A012.A1S;
        this.A0A = r6;
        String str2 = "promoFormViewModel";
        C04220Ms.A0B(r2, 1);
        r6.A02 = r2;
        r2.A02((C1198277d) null, of);
        C883057n r03 = r6.A02;
        if (r03 == null) {
            C04220Ms.A0E("formViewModel");
            throw null;
        }
        r03.A03.A0E(C86114wI.A0Q(r6, 133));
        if (r6.A07.A0I()) {
            AnonymousClass58K r04 = this.A0A;
            if (r04 == null) {
                C04220Ms.A0E(str2);
                throw null;
            }
            C86104wH.A1F(this, r04.A0A, 176);
            AnonymousClass58K r05 = this.A0A;
            if (r05 == null) {
                C04220Ms.A0E(str2);
                throw null;
            }
            C86104wH.A1F(this, r05.A05, 177);
            FormLayout formLayout = this.A08;
            if (formLayout == null) {
                C04220Ms.A0E("formLayout");
                throw null;
            }
            formLayout.A01 = r2;
            r2.A04.A0E(formLayout.A04);
            FBPayButton fBPayButton2 = this.A0B;
            if (fBPayButton2 == null) {
                C04220Ms.A0E("applyButton");
                throw null;
            }
            C86104wH.A1C(fBPayButton2, 46, this);
            AnonymousClass58K r06 = this.A0A;
            if (r06 == null) {
                C04220Ms.A0E(str2);
                throw null;
            }
            C86104wH.A1F(this, r06.A09, 178);
            AnonymousClass58K r07 = this.A0A;
            if (r07 == null) {
                C04220Ms.A0E(str2);
                throw null;
            }
            r07.A06.A0C(getViewLifecycleOwner(), this.A0E);
            C128957ke A002 = AnonymousClass7JJ.A00();
            LoggingContext loggingContext3 = this.A0C;
            if (loggingContext3 == null) {
                str2 = "loggingContext";
            } else {
                AnonymousClass58K r08 = this.A0A;
                if (r08 != null) {
                    List A072 = r08.A07();
                    AnonymousClass587 r09 = this.A09;
                    if (r09 == null) {
                        str2 = "otcViewModel";
                    } else {
                        C128957ke.A04(C18180wK.A0I(C86104wH.A0K(A002.A00, "client_load_promocode_success"), 356), loggingContext3, new KtLambdaShape3S1300000_I2((Object) A072, (Object) AnonymousClass7Kr.A07(r09), (Object) loggingContext3, "offer_and_promocode", 18));
                        return;
                    }
                }
            }
            C04220Ms.A0E(str2);
            throw null;
        }
        throw C18180wK.A0a("There are no active observers for event handling. Addition or removal of promo codes cannot be handled.");
    }

    public static final void A03(AnonymousClass5j2 r5, String str, String str2) {
        String str3;
        C128957ke A002 = AnonymousClass7JJ.A00();
        LoggingContext loggingContext = r5.A0C;
        if (loggingContext == null) {
            str3 = "loggingContext";
        } else {
            C89375Dj A003 = C89375Dj.A00(str, str2);
            AnonymousClass587 r0 = r5.A09;
            if (r0 == null) {
                str3 = "otcViewModel";
            } else {
                C128957ke.A04(C18180wK.A0I(C86104wH.A0K(A002.A00, "user_remove_promocode_submit"), 2888), loggingContext, new KtLambdaShape3S1300000_I2((Object) A003, (Object) AnonymousClass7Kr.A07(r0), (Object) loggingContext, "remove_applied_offer", 21));
                return;
            }
        }
        C04220Ms.A0E(str3);
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(816654941);
        super.onCreate(bundle);
        this.A0C = AnonymousClass567.A02(this);
        C14030oh.A09(-744709784, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1067741600);
        ContextThemeWrapper A002 = AnonymousClass567.A00(this, layoutInflater);
        this.A00 = A002;
        View inflate = layoutInflater.cloneInContext(A002).inflate(R.layout.fbpay_promo_form_fragment, viewGroup, false);
        C14030oh.A09(-1341442999, A022);
        return inflate;
    }

    public final void onResume() {
        int A022 = C14030oh.A02(-1818108599);
        super.onResume();
        ContextThemeWrapper contextThemeWrapper = this.A00;
        if (contextThemeWrapper == null) {
            C04220Ms.A0E("viewContext");
            throw null;
        }
        Object A0h = C86144wL.A0h(this);
        if (A0h != null) {
            AnonymousClass3JK.A00(contextThemeWrapper, this, (AnonymousClass69R) A0h, (String) null, (String) null, new KtLambdaShape26S0100000_I2_6(this, 28), (AnonymousClass0ZU) null, 496, false);
            C14030oh.A09(-243567517, A022);
            return;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A09(1440314771, A022);
        throw A0b;
    }
}
