package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.expresscheckout.models.ECPPaymentRequest;
import com.fbpay.logging.LoggingContext;
import com.instagram.barcelona.R;
import java.util.Map;
import kotlin.jvm.internal.KtLambdaShape26S0100000_I2_6;

/* renamed from: X.5j1  reason: invalid class name and case insensitive filesystem */
public final class C92635j1 extends AnonymousClass567 {
    public AnonymousClass58J A00;
    public LoggingContext A01;
    public ContextThemeWrapper A02;
    public ECPPaymentRequest A03;
    public final C143158gC A04 = C86114wI.A0Q(this, 170);
    public final Map A05 = AnonymousClass4WK.A0O(C18180wK.A0p(AnonymousClass69P.ITEM_LIST, new C1201078o(false)));
    public final C04530Oa A06 = C86124wJ.A12(this, 22);

    public final void onViewCreated(View view, Bundle bundle) {
        M5J D7U;
        M5J D7U2;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass7KT.A03(this);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass0wJ.A0J(view, R.id.recyclerView);
        requireActivity();
        C18200wM.A1H(recyclerView, 1);
        recyclerView.setItemAnimator((M0E) null);
        C18240wQ.A12(recyclerView, this.A06);
        C1201078o A0R = C86114wI.A0R(AnonymousClass69P.ITEM_LIST, this.A05);
        if (A0R != null) {
            KtLambdaShape26S0100000_I2_6 ktLambdaShape26S0100000_I2_6 = new KtLambdaShape26S0100000_I2_6(this, 23);
            if (!A0R.A01) {
                A0R.A01 = true;
                ktLambdaShape26S0100000_I2_6.invoke();
            }
        }
        AnonymousClass58J r0 = this.A00;
        if (r0 != null) {
            ECPHandler eCPHandler = r0.A00;
            if (!(eCPHandler == null || (D7U2 = eCPHandler.D7U()) == null)) {
                D7U2.A0F(this.A04);
            }
            AnonymousClass58J r02 = this.A00;
            if (r02 != null) {
                ECPHandler eCPHandler2 = r02.A00;
                if (eCPHandler2 != null && (D7U = eCPHandler2.D7U()) != null) {
                    D7U.A0C(this, this.A04);
                    return;
                }
                return;
            }
        }
        C04220Ms.A0E("ecpViewModel");
        throw null;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1614821285);
        super.onCreate(bundle);
        this.A01 = AnonymousClass567.A02(this);
        Parcelable parcelable = requireArguments().getParcelable("ECP_LAUNCH_PARAMS");
        C04220Ms.A0C(parcelable, "null cannot be cast to non-null type com.facebookpay.expresscheckout.models.ECPPaymentRequest");
        ECPPaymentRequest eCPPaymentRequest = (ECPPaymentRequest) parcelable;
        this.A03 = eCPPaymentRequest;
        if (eCPPaymentRequest == null) {
            C04220Ms.A0E("ecpPaymentRequest");
            throw null;
        }
        this.A00 = C116896xj.A00(this, eCPPaymentRequest);
        C14030oh.A09(-1867836128, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-730699084);
        ContextThemeWrapper A002 = AnonymousClass567.A00(this, layoutInflater);
        this.A02 = A002;
        View inflate = layoutInflater.cloneInContext(A002).inflate(R.layout.ecp_see_item_details_fragment, viewGroup, false);
        C14030oh.A09(746017516, A022);
        return inflate;
    }
}
