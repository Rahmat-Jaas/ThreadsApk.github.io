package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxObserverShape210S0100000_1_I2;
import com.instagram.barcelona.R;
import kotlin.coroutines.jvm.internal.KtSLambdaShape13S0101000_I2_10;
import kotlin.coroutines.jvm.internal.KtSLambdaShape21S0201000_I2_7;
import kotlin.jvm.internal.KtLambdaShape32S0200000_I2_16;
import kotlin.jvm.internal.KtLambdaShape92S0100000_I2_72;

/* renamed from: X.5x0  reason: invalid class name */
public final class AnonymousClass5x0 extends C34640IcN implements C82034oy {
    public static final String __redex_internal_original_name = "ManagePayoutAccountsFragment";
    public C35355ItJ A00 = C35355ItJ.PRO_HOME;
    public String A01;
    public final C04530Oa A02 = C62373Zc.A03(C138548Hx.A00);
    public final C04530Oa A03 = C62373Zc.A03(C76414dz.A00);
    public final C04530Oa A04 = C62373Zc.A03(new KtLambdaShape92S0100000_I2_72(this, 12));
    public final C04530Oa A05 = C18220wO.A0M(new KtLambdaShape92S0100000_I2_72(this, 11), new KtLambdaShape92S0100000_I2_72(this, 13), new KtLambdaShape32S0200000_I2_16(6, (Object) null, this), C18210wN.A0l(AnonymousClass57V.class));

    public final void configureActionBar(AnonymousClass4u2 r2) {
        C04220Ms.A0B(r2, 0);
        AnonymousClass4u2.A07(r2, 2131832356);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C18240wQ.A12((RecyclerView) AnonymousClass0wJ.A0J(view, R.id.payout_account_view), this.A02);
        AnonymousClass57V r4 = (AnonymousClass57V) this.A05.getValue();
        r4.A02.A0C(getViewLifecycleOwner(), new IDxObserverShape210S0100000_1_I2(view, 41));
        C86114wI.A1A(getViewLifecycleOwner(), r4.A01, this, 291);
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape21S0201000_I2_7((Object) this, (Object) r4, (C146958n9) null, 35), C18200wM.A0M(this), 3);
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A04);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-573626199);
        super.onCreate(bundle);
        C62793ak A0N = C18200wM.A0N(this.A05);
        String str = null;
        C25237DiI.A00((Integer) null, (C27952Ew2) null, new KtSLambdaShape13S0101000_I2_10(A0N, (C146958n9) null, 13), AnonymousClass3J5.A00(A0N), 3);
        Bundle bundle2 = this.mArguments;
        String str2 = null;
        if (bundle2 != null) {
            str = bundle2.getString("ORIGIN");
        }
        this.A00 = AnonymousClass2SD.A00(str);
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            str2 = bundle3.getString("UPL_SESSION_ID");
        }
        this.A01 = str2;
        C14030oh.A09(-404145480, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1809525857);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_payouts_account, viewGroup, false);
        C14030oh.A09(-1552773262, A022);
        return inflate;
    }
}
