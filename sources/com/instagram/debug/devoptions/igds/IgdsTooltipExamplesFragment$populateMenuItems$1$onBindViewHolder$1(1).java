package com.instagram.debug.devoptions.igds;

import X.AnonymousClass3TC;
import X.C04220Ms;
import X.C14030oh;
import X.D0f;
import android.view.View;
import android.widget.TextView;
import com.instagram.debug.devoptions.igds.IgdsTooltipExamplesFragment;
import java.util.HashMap;

public final class IgdsTooltipExamplesFragment$populateMenuItems$1$onBindViewHolder$1 implements View.OnClickListener {
    public final /* synthetic */ IgdsTooltipExamplesFragment.RowViewHolder $holder;
    public final /* synthetic */ HashMap $map;
    public final /* synthetic */ int $position;
    public final /* synthetic */ IgdsTooltipExamplesFragment this$0;

    public IgdsTooltipExamplesFragment$populateMenuItems$1$onBindViewHolder$1(HashMap hashMap, int i, IgdsTooltipExamplesFragment igdsTooltipExamplesFragment, IgdsTooltipExamplesFragment.RowViewHolder rowViewHolder) {
        this.$map = hashMap;
        this.$position = i;
        this.this$0 = igdsTooltipExamplesFragment;
        this.$holder = rowViewHolder;
    }

    public final void onClick(View view) {
        int A05 = C14030oh.A05(395314851);
        Object[] objArr = (Object[]) this.$map.get(IgdsTooltipExamplesFragment.ITEMS[this.$position]);
        if (objArr != null) {
            IgdsTooltipExamplesFragment igdsTooltipExamplesFragment = this.this$0;
            TextView textView = this.$holder.textView;
            Object obj = objArr[0];
            C04220Ms.A0C(obj, "null cannot be cast to non-null type com.instagram.igds.components.tooltip.TooltipTheme");
            Object obj2 = objArr[1];
            C04220Ms.A0C(obj2, "null cannot be cast to non-null type com.instagram.igds.components.tooltip.TooltipPosition");
            new IgdsTooltipExamplesFragment$getClickListener$1(igdsTooltipExamplesFragment, textView, (D0f) obj2, (AnonymousClass3TC) obj).onClick(view);
        }
        C14030oh.A0C(840100047, A05);
    }
}
