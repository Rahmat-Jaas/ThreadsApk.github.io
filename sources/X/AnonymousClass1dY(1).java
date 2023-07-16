package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import com.instagram.barcelona.R;
import com.instagram.nux.cal.model.ConnectContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.1dY  reason: invalid class name */
public final class AnonymousClass1dY extends I5x {
    public static final String __redex_internal_original_name = "SeeAllAccountsFragment";
    public C10300i6 A00;
    public AnonymousClass1fH A01;
    public ConnectContent A02;

    public final String getModuleName() {
        return "signup_see_all_accounts";
    }

    public final C10300i6 A0I() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        ImmutableList immutableList;
        int A022 = C14030oh.A02(-1494607259);
        super.onCreate(bundle);
        this.A00 = C18190wL.A0S(requireArguments());
        ConnectContent connectContent = (ConnectContent) C18240wQ.A0D(requireArguments(), "argument_content");
        this.A02 = connectContent;
        ArrayList A0v = AnonymousClass0wJ.A0v();
        A0v.add(connectContent.A03);
        List list = connectContent.A0J;
        if (!(list == null || ImmutableList.copyOf((Collection) list) == null)) {
            List list2 = this.A02.A0J;
            if (list2 != null) {
                immutableList = ImmutableList.copyOf((Collection) list2);
            } else {
                immutableList = null;
            }
            A0v.addAll(immutableList);
        }
        AnonymousClass1fH r3 = new AnonymousClass1fH(requireActivity(), this);
        this.A01 = r3;
        List<Object> list3 = r3.A01;
        list3.clear();
        list3.addAll(A0v);
        r3.A03();
        for (Object A05 : list3) {
            r3.A05(r3.A00, A05);
        }
        r3.A04();
        A0F(this.A01);
        C14030oh.A09(-302494964, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1921547061);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.all_accounts_bottom_sheet);
        C14030oh.A09(1810090899, A022);
        return A0H;
    }
}
