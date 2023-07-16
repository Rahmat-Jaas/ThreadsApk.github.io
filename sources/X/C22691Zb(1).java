package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxCListenerShape70S0200000_1_I2;
import com.facebook.redex.IDxObserverShape213S0100000_4_I2;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.service.session.UserSession;
import kotlin.coroutines.jvm.internal.KtSLambdaShape12S0301000_I2_4;
import kotlin.jvm.internal.KtLambdaShape160S0100000_I2_15;
import kotlin.jvm.internal.KtLambdaShape31S0200000_I2_15;
import kotlin.jvm.internal.KtLambdaShape87S0100000_I2_67;

/* renamed from: X.1Zb  reason: invalid class name and case insensitive filesystem */
public final class C22691Zb extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "ProductEligibilityStatusFragment";
    public UserMonetizationProductType A00;
    public boolean A01;
    public final C04530Oa A02 = C62373Zc.A03(new KtLambdaShape87S0100000_I2_67(this, 23));
    public final C04530Oa A03;
    public final C04530Oa A04 = C62373Zc.A03(C76224dg.A00);
    public final C04530Oa A05 = C62373Zc.A03(new KtLambdaShape87S0100000_I2_67(this, 28));

    public final void configureActionBar(AnonymousClass4u2 r2) {
        int i;
        C04220Ms.A0B(r2, 0);
        UserMonetizationProductType userMonetizationProductType = this.A00;
        if (userMonetizationProductType == null) {
            C04220Ms.A0E("productType");
            throw null;
        }
        switch (userMonetizationProductType.ordinal()) {
            case 1:
                i = 2131822638;
                break;
            case 5:
                i = 2131830695;
                break;
            case 7:
                i = 2131830689;
                break;
            case 8:
                i = 2131830688;
                break;
            case 10:
                i = 2131829051;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                i = 2131830691;
                break;
            default:
                throw C18190wL.A0a("monetization type is not supported");
        }
        AnonymousClass4u2.A07(r2, i);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.requireViewById(R.id.product_tool_eligibility_status_recycler_view);
        C18190wL.A1D(recyclerView);
        C18240wQ.A12(recyclerView, this.A02);
        CAp cAp = (CAp) this.A03.getValue();
        cAp.A01();
        if (cAp.A01 == null) {
            UserSession userSession = cAp.A07;
            AnonymousClass77T r3 = (AnonymousClass77T) userSession.A00(AnonymousClass77T.class);
            if (r3 == null) {
                r3 = new AnonymousClass77T(userSession);
            }
            r3.A01(cAp.A04, new KtLambdaShape160S0100000_I2_15(cAp, 27));
        } else {
            CAp.A00(cAp);
        }
        cAp.A03.A0C(getViewLifecycleOwner(), new IDxObserverShape213S0100000_4_I2((Object) this, 292));
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape12S0301000_I2_4(view2, cAp, this, (C146958n9) null, 30), C18200wM.A0M(this), 3);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A05);
    }

    public C22691Zb() {
        KtLambdaShape87S0100000_I2_67 ktLambdaShape87S0100000_I2_67 = new KtLambdaShape87S0100000_I2_67(this, 24);
        C04530Oa A012 = AnonymousClass0OY.A01(AnonymousClass006.A0C, new KtLambdaShape87S0100000_I2_67(new KtLambdaShape87S0100000_I2_67(this, 25), 26));
        this.A03 = C18220wO.A0M(new KtLambdaShape87S0100000_I2_67(A012, 27), ktLambdaShape87S0100000_I2_67, new KtLambdaShape31S0200000_I2_15(19, (Object) null, A012), C18210wN.A0l(CAp.class));
    }

    public final void onCreate(Bundle bundle) {
        String string;
        boolean z;
        int A022 = C14030oh.A02(-43103896);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str = null;
        if (bundle2 == null || (string = bundle2.getString("ARGUMENT_PRODUCT_TYPE")) == null) {
            IllegalStateException A0b = AnonymousClass0wJ.A0b();
            C14030oh.A09(908033960, A022);
            throw A0b;
        }
        this.A00 = AnonymousClass2FJ.A00(string);
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            z = bundle3.getBoolean("ARGUMENT_TEMPORARY_INELIGIBILITY_STATUS");
        } else {
            z = false;
        }
        this.A01 = z;
        C04530Oa r3 = this.A03;
        CAp cAp = (CAp) r3.getValue();
        Bundle bundle4 = this.mArguments;
        if (bundle4 != null) {
            str = bundle4.getString("ARGUMENT_ELIGIBILITY");
        }
        cAp.A01 = str;
        ((CAp) r3.getValue()).A02 = this.A01;
        C14030oh.A09(479855933, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(2141131933);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.monetization_product_tool_eligibility_status, viewGroup, false);
        IgdsBottomButtonLayout A0W = C18230wP.A0W(inflate, R.id.bottom_button_layout);
        UserMonetizationProductType userMonetizationProductType = this.A00;
        if (userMonetizationProductType == null) {
            C04220Ms.A0E("productType");
            throw null;
        }
        if (userMonetizationProductType == UserMonetizationProductType.BRANDED_CONTENT) {
            String str = ((CAp) this.A03.getValue()).A01;
            if (C04220Ms.A0I(str, "not_eligible")) {
                C62873b3.A01(this, AnonymousClass0wJ.A0X(this.A05), AnonymousClass006.A00);
            } else if (C04220Ms.A0I(str, "eligible_pending_opt_in")) {
                A0W.setVisibility(0);
                A0W.setPrimaryAction(getString(2131822598), new IDxCListenerShape70S0200000_1_I2(136, (Object) this, (Object) this));
            }
        }
        C14030oh.A09(1015726900, A022);
        return inflate;
    }
}
