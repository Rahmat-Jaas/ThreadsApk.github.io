package com.instagram.debug.devoptions.igds;

import X.C04220Ms;
import X.C14030oh;
import X.C18180wK;
import X.C18210wN;
import X.C18220wO;
import X.C41030Luu;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.debug.devoptions.igds.IgdsTooltipExamplesFragment;
import java.util.HashMap;

public final class IgdsTooltipExamplesFragment$populateMenuItems$1 extends C41030Luu {
    public final /* synthetic */ HashMap $map;
    public final /* synthetic */ IgdsTooltipExamplesFragment this$0;

    public void onBindViewHolder(IgdsTooltipExamplesFragment.RowViewHolder rowViewHolder, int i) {
        C04220Ms.A0B(rowViewHolder, 0);
        rowViewHolder.rowView.setOnClickListener(new IgdsTooltipExamplesFragment$populateMenuItems$1$onBindViewHolder$1(this.$map, i, this.this$0, rowViewHolder));
        rowViewHolder.textView.setText(IgdsTooltipExamplesFragment.ITEMS[i]);
    }

    public IgdsTooltipExamplesFragment.RowViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C04220Ms.A0B(viewGroup, 0);
        ViewGroup A0I = C18220wO.A0I(C18180wK.A0C(viewGroup), viewGroup, R.layout.row_header, false);
        return new IgdsTooltipExamplesFragment.RowViewHolder(A0I, C18210wN.A0E(A0I, R.id.row_header_textview));
    }

    public IgdsTooltipExamplesFragment$populateMenuItems$1(HashMap hashMap, IgdsTooltipExamplesFragment igdsTooltipExamplesFragment) {
        this.$map = hashMap;
        this.this$0 = igdsTooltipExamplesFragment;
    }

    public int getItemCount() {
        int A03 = C14030oh.A03(585305827);
        int length = IgdsTooltipExamplesFragment.ITEMS.length;
        C14030oh.A0A(-1284401715, A03);
        return length;
    }
}
