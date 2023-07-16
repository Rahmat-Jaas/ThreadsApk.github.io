package com.instagram.shopping.fragment.postpurchase;

import X.AnonymousClass0wJ;
import X.AnonymousClass5A6;
import X.C10300i6;
import X.C106516fA;
import X.C14030oh;
import X.C18180wK;
import X.C18190wL;
import X.C34640IcN;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.barcelona.R;
import com.instagram.service.session.UserSession;

public class ProductSharePickerFragment extends C34640IcN {
    public UserSession A00;
    public AnonymousClass5A6 A01;
    public final C106516fA A02 = new C106516fA(this);
    public RecyclerView mRecyclerView;

    public final String getModuleName() {
        return "instagram_shopping_product_share_picker";
    }

    public final C10300i6 getSession() {
        return this.A00;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = C14030oh.A02(1949537405);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        bundle2.getClass();
        this.A00 = C18180wK.A0V(bundle2);
        this.A01 = new AnonymousClass5A6(this, this.A02, bundle2.getParcelableArrayList("post_purchase_products"));
        C14030oh.A09(-697176260, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = C14030oh.A02(2117877323);
        View A0H = AnonymousClass0wJ.A0H(layoutInflater, viewGroup, R.layout.layout_recyclerview);
        C14030oh.A09(446941423, A022);
        return A0H;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.requireViewById(R.id.recycler_view);
        this.mRecyclerView = recyclerView;
        getContext();
        C18190wL.A1D(recyclerView);
        this.mRecyclerView.setAdapter(this.A01);
    }
}
