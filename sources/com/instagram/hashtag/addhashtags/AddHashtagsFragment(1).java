package com.instagram.hashtag.addhashtags;

import X.AnonymousClass00U;
import X.AnonymousClass0wJ;
import X.AnonymousClass4u2;
import X.C04220Ms;
import X.C04530Oa;
import X.C10300i6;
import X.C14030oh;
import X.C18190wL;
import X.C18240wQ;
import X.C25764Drc;
import X.C31003GdB;
import X.C34640IcN;
import X.C80644m9;
import X.C82034oy;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;
import java.util.ArrayList;

public final class AddHashtagsFragment extends C34640IcN implements C82034oy {
    public String A00;
    public String A01;
    public final C04530Oa A02 = C80644m9.A00(this);
    public C31003GdB viewController;

    public final void onViewCreated(View view, Bundle bundle) {
        ArrayList arrayList;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        C31003GdB gdB = null;
        if (bundle2 == null || (arrayList = bundle2.getParcelableArrayList("extra_selected_hashtags")) == null) {
            arrayList = AnonymousClass0wJ.A0v();
        }
        UserSession A0X = AnonymousClass0wJ.A0X(this.A02);
        if (A0X != null) {
            gdB = new C31003GdB((ViewGroup) view, this, A0X, arrayList);
        }
        this.viewController = gdB;
        TextView textView = (TextView) AnonymousClass0wJ.A0J(view, R.id.notice);
        if (this.A00 != null) {
            textView.setVisibility(0);
            textView.setText(this.A00);
            return;
        }
        textView.setVisibility(8);
    }

    public final String getModuleName() {
        return AnonymousClass00U.A0L(this.A01, "_add_hashtags");
    }

    public final C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A02);
    }

    public final void configureActionBar(AnonymousClass4u2 r3) {
        AnonymousClass4u2.A05(r3);
        r3.Cqb(2131821060);
        C25764Drc A0K = C18240wQ.A0K();
        A0K.A0F = getString(2131826219);
        AnonymousClass4u2.A01(C18190wL.A0H(this, 462), A0K, r3);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(-101574276);
        super.onCreate(bundle);
        this.A01 = requireArguments().getString("extra_prior_module_name");
        this.A00 = requireArguments().getString("extra_notice_message");
        C14030oh.A09(839237601, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(1412842338);
        C04220Ms.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.add_hashtags_fragment, viewGroup, false);
        C14030oh.A09(-283611594, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = C14030oh.A02(1195528972);
        super.onDestroyView();
        this.viewController = null;
        C14030oh.A09(1061914066, A022);
    }
}
