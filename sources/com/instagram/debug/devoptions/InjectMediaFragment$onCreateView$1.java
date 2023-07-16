package com.instagram.debug.devoptions;

import X.AnonymousClass0wJ;
import X.C09860go;
import X.C113246qz;
import X.C14030oh;
import androidx.recyclerview.widget.RecyclerView;

public final class InjectMediaFragment$onCreateView$1 extends C113246qz {
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int A00 = AnonymousClass0wJ.A00(328592852, recyclerView);
        super.onScrollStateChanged(recyclerView, i);
        if (i == 1) {
            C09860go.A0I(recyclerView);
            recyclerView.requestFocus();
        }
        C14030oh.A0A(197134576, A00);
    }
}
