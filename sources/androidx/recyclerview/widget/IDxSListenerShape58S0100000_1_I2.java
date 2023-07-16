package androidx.recyclerview.widget;

import X.AnonymousClass0wJ;
import X.AnonymousClass1cN;
import X.AnonymousClass1fT;
import X.AnonymousClass3G8;
import X.AnonymousClass3HX;
import X.C04220Ms;
import X.C09860go;
import X.C113246qz;
import X.C14030oh;
import X.C18230wP;
import X.C18250wR;
import X.C23481dv;
import X.C57513Bi;
import X.C58343Fc;
import X.C681842q;
import android.database.DataSetObserver;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.instagram.barcelona.R;
import com.instagram.business.fragment.SuggestBusinessFragment;
import com.instagram.igds.components.search.InlineSearchBox;

public class IDxSListenerShape58S0100000_1_I2 extends C113246qz {
    public Object A00;
    public final int A01;

    public IDxSListenerShape58S0100000_1_I2(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A03;
        int i2;
        switch (this.A01) {
            case 0:
                A03 = AnonymousClass0wJ.A00(-1054199423, recyclerView);
                super.onScrollStateChanged(recyclerView, i);
                AnonymousClass3G8 r2 = (AnonymousClass3G8) this.A00;
                AnonymousClass1fT r1 = r2.A04;
                r2.A00(recyclerView, r1.getItemCount());
                DataSetObserver dataSetObserver = r2.A02;
                if (dataSetObserver != null) {
                    r1.unregisterDataSetObserver(dataSetObserver);
                    r2.A02 = null;
                }
                i2 = -278554069;
                break;
            case 1:
                A03 = C14030oh.A03(1172010061);
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0 && recyclerView.canScrollVertically(-1)) {
                    SuggestBusinessFragment suggestBusinessFragment = (SuggestBusinessFragment) this.A00;
                    if (suggestBusinessFragment.isAdded()) {
                        C58343Fc r12 = suggestBusinessFragment.A03;
                        if (r12.A03 && !(!r12.A02)) {
                            if (r12.A01) {
                                AnonymousClass1fT A002 = SuggestBusinessFragment.A00(suggestBusinessFragment);
                                A002.A00.A00 = true;
                                A002.notifyDataSetChanged();
                                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.A0H;
                                if (linearLayoutManager != null) {
                                    int dimensionPixelSize = AnonymousClass0wJ.A0B(suggestBusinessFragment).getDimensionPixelSize(R.dimen.avatar_sticker_grid_height_offset);
                                    if (linearLayoutManager.A1l() == SuggestBusinessFragment.A00(suggestBusinessFragment).getItemCount() - 1) {
                                        recyclerView.scrollBy(0, dimensionPixelSize);
                                    }
                                }
                            }
                            suggestBusinessFragment.A03.A00(new C681842q(this), suggestBusinessFragment, suggestBusinessFragment.A04, suggestBusinessFragment.A06);
                        }
                    }
                }
                i2 = 1515072005;
                break;
            case 2:
                A03 = C14030oh.A03(239403601);
                if (i == 1) {
                    C18230wP.A14(recyclerView, (InputMethodManager) ((AnonymousClass3HX) this.A00).A00.getSystemService("input_method"));
                }
                i2 = -758950599;
                break;
            case 3:
                A03 = AnonymousClass0wJ.A00(-696288076, recyclerView);
                super.onScrollStateChanged(recyclerView, i);
                C23481dv r0 = (C23481dv) this.A00;
                View A09 = C18250wR.A09(r0);
                if (A09 != null) {
                    Object systemService = r0.requireContext().getSystemService("input_method");
                    C04220Ms.A0C(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    C18230wP.A14(A09, (InputMethodManager) systemService);
                }
                i2 = 100380456;
                break;
            case 4:
                A03 = C14030oh.A03(-172986541);
                ((AnonymousClass1cN) this.A00).A01.A05(i);
                i2 = 2038402023;
                break;
            case 5:
                A03 = C14030oh.A03(-2089324919);
                if (i == 1) {
                    C09860go.A0I(((C57513Bi) this.A00).A03);
                }
                i2 = -2038445113;
                break;
            default:
                A03 = AnonymousClass0wJ.A00(-1842660073, recyclerView);
                super.onScrollStateChanged(recyclerView, i);
                InlineSearchBox inlineSearchBox = (InlineSearchBox) this.A00;
                if (inlineSearchBox.hasFocus() && i != 0) {
                    inlineSearchBox.A02();
                }
                i2 = 2000411591;
                break;
        }
        C14030oh.A0A(i2, A03);
    }
}
