package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import com.instagram.userpay.api.UserPayApi;
import kotlin.coroutines.jvm.internal.KtSLambdaShape16S0101000_I2_13;
import kotlin.jvm.internal.KtLambdaShape134S0100000_I2_114;

/* renamed from: X.1ZV  reason: invalid class name */
public final class AnonymousClass1ZV extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "UserPayEarningsFragment";
    public CDA A00;
    public UserPayApi A01;
    public final C04530Oa A02 = C62373Zc.A03(new KtLambdaShape134S0100000_I2_114(this, 18));

    public final void configureActionBar(AnonymousClass4u2 r4) {
        C04220Ms.A0B(r4, 0);
        r4.Cqb(2131837589);
        C25764Drc A0K = C18240wQ.A0K();
        A0K.A05 = R.drawable.instagram_info_pano_outline_24;
        A0K.A04 = 2131837589;
        r4.A7Q(C18190wL.A0L(A0K, this, 347));
        r4.CtT(true);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.user_pay_earnings_recycler_view);
        getContext();
        C18190wL.A1D(recyclerView);
        CDA cda = this.A00;
        if (cda == null) {
            C04220Ms.A0E("adapter");
            throw null;
        } else {
            recyclerView.setAdapter(cda);
        }
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-1238558283);
        super.onCreate(bundle);
        C04530Oa r5 = this.A02;
        this.A01 = new UserPayApi(AnonymousClass0wJ.A0X(r5));
        FragmentActivity activity = getActivity();
        if (activity != null) {
            this.A00 = new CDA(activity, AnonymousClass0wJ.A0X(r5), AnonymousClass0wJ.A0v());
            C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape16S0101000_I2_13(this, (C146958n9) null, 4), AnonymousClass3J3.A00(getLifecycle()), 3);
            C14030oh.A09(1104589909, A022);
            return;
        }
        IllegalStateException A0b = AnonymousClass0wJ.A0b();
        C14030oh.A09(-594011748, A022);
        throw A0b;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-630487420);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.user_pay_earnings, viewGroup, false);
        C14030oh.A09(711200133, A022);
        return inflate;
    }
}
