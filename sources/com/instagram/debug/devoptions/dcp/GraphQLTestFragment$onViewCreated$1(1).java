package com.instagram.debug.devoptions.dcp;

import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C14030oh;
import android.view.View;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgRadioButton;

public final class GraphQLTestFragment$onViewCreated$1 implements View.OnClickListener {
    public final /* synthetic */ GraphQLTestFragment this$0;

    public GraphQLTestFragment$onViewCreated$1(GraphQLTestFragment graphQLTestFragment) {
        this.this$0 = graphQLTestFragment;
    }

    public final void onClick(View view) {
        String str;
        int A05 = C14030oh.A05(1858531878);
        IgRadioButton igRadioButton = this.this$0.metadataApiRadio;
        if (igRadioButton == null) {
            str = "metadataApiRadio";
        } else {
            boolean isChecked = igRadioButton.isChecked();
            str = "versionInput";
            GraphQLTestFragment graphQLTestFragment = this.this$0;
            if (isChecked) {
                IgEditText igEditText = graphQLTestFragment.useCaseInput;
                if (igEditText != null) {
                    String A0n = AnonymousClass0wJ.A0n(igEditText);
                    IgEditText igEditText2 = this.this$0.versionInput;
                    if (igEditText2 != null) {
                        graphQLTestFragment.metadataApiCall(A0n, AnonymousClass0wJ.A0n(igEditText2));
                    }
                }
                C04220Ms.A0E("useCaseInput");
                throw null;
            }
            IgRadioButton igRadioButton2 = graphQLTestFragment.featuresApiRadio;
            if (igRadioButton2 == null) {
                str = "featuresApiRadio";
            } else if (igRadioButton2.isChecked()) {
                GraphQLTestFragment graphQLTestFragment2 = this.this$0;
                IgEditText igEditText3 = graphQLTestFragment2.useCaseInput;
                if (igEditText3 != null) {
                    String A0n2 = AnonymousClass0wJ.A0n(igEditText3);
                    IgEditText igEditText4 = this.this$0.versionInput;
                    if (igEditText4 != null) {
                        String A0n3 = AnonymousClass0wJ.A0n(igEditText4);
                        IgEditText igEditText5 = this.this$0.purposeInput;
                        if (igEditText5 == null) {
                            str = "purposeInput";
                        } else {
                            graphQLTestFragment2.featuresApiCall(A0n2, A0n3, AnonymousClass0wJ.A0n(igEditText5));
                        }
                    }
                }
                C04220Ms.A0E("useCaseInput");
                throw null;
            } else {
                AnonymousClass0LU.A0B(GraphQLTestFragment.TAG, "invalid selection");
            }
            C14030oh.A0C(-90847076, A05);
            return;
        }
        C04220Ms.A0E(str);
        throw null;
    }
}
