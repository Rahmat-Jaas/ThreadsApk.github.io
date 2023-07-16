package X;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.nux.common.HowItWorksNuxFragment$Row;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.KtLambdaShape90S0100000_I2_70;

/* renamed from: X.1YN  reason: invalid class name */
public final class AnonymousClass1YN extends C34640IcN {
    public static final String __redex_internal_original_name = "HowItWorksNuxFragment";
    public String A00;
    public List A01 = AnonymousClass0ZV.A00;
    public final C04530Oa A02 = C62373Zc.A03(new KtLambdaShape90S0100000_I2_70(this, 39));

    public final void onViewCreated(View view, Bundle bundle) {
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ViewGroup viewGroup = (ViewGroup) AnonymousClass0wJ.A0J(view, R.id.how_it_works_row_container);
        for (HowItWorksNuxFragment$Row howItWorksNuxFragment$Row : this.A01) {
            IgdsBulletCell igdsBulletCell = new IgdsBulletCell(requireContext(), (AttributeSet) null, 0);
            igdsBulletCell.setText(Integer.valueOf(howItWorksNuxFragment$Row.A01), Integer.valueOf(howItWorksNuxFragment$Row.A00));
            Integer num = howItWorksNuxFragment$Row.A02;
            if (num != null) {
                igdsBulletCell.setIcon(num.intValue());
            }
            viewGroup.addView(igdsBulletCell);
        }
    }

    public final String getModuleName() {
        String str = this.A00;
        if (str == null) {
            return "how_it_works_nux";
        }
        return str;
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = C14030oh.A02(-1495356909);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString("argument_module_name");
        if (string != null) {
            this.A00 = string;
            ArrayList parcelableArrayList = requireArguments.getParcelableArrayList("argument_rows");
            if (parcelableArrayList != null) {
                this.A01 = parcelableArrayList;
                C14030oh.A09(-1712119672, A022);
                return;
            }
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = -2024915915;
        } else {
            illegalStateException = C18180wK.A0a("Required value was null.");
            i = -295361826;
        }
        C14030oh.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(-1378204709);
        C04220Ms.A0B(layoutInflater, 0);
        View A0D = C18180wK.A0D(layoutInflater, viewGroup, R.layout.how_it_works_bottom_sheet, false);
        C14030oh.A09(1908044462, A022);
        return A0D;
    }
}
