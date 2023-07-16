package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.ui.primer.IconConfig;
import com.instagram.ui.primer.InfoItem;
import java.util.List;

/* renamed from: X.119  reason: invalid class name */
public final class AnonymousClass119 extends C41030Luu {
    public final List A00;

    public final /* bridge */ /* synthetic */ M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        C04220Ms.A0B(viewGroup, 0);
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(R.layout.primer_bottom_sheet_info_list_item, viewGroup, false);
        if (i == 0) {
            Resources resources = context.getResources();
            C04220Ms.A06(resources);
            inflate.setPadding(0, 0, 0, (int) TypedValue.applyDimension(1, 24.0f, resources.getDisplayMetrics()));
        }
        C04220Ms.A06(inflate);
        return new AnonymousClass13M(inflate);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(M5O m5o, int i) {
        int i2;
        AnonymousClass13M r9 = (AnonymousClass13M) m5o;
        C04220Ms.A0B(r9, 0);
        InfoItem infoItem = (InfoItem) this.A00.get(i);
        C04220Ms.A0B(infoItem, 0);
        IconConfig iconConfig = infoItem.A00;
        boolean z = iconConfig instanceof IconConfig.SimpleIconConfig;
        if (z) {
            ViewStub viewStub = r9.A00;
            viewStub.setLayoutResource(R.layout.primer_bottom_sheet_info_list_simple_icon_layout);
            View inflate = viewStub.inflate();
            C04220Ms.A0C(inflate, I17.A00(8));
            ((ImageView) inflate).setImageResource(((IconConfig.SimpleIconConfig) iconConfig).A00);
        } else if (iconConfig instanceof IconConfig.IconWithTextConfig) {
            ViewStub viewStub2 = r9.A00;
            viewStub2.setLayoutResource(R.layout.primer_bottom_sheet_info_list_icon_with_text_layout);
            View inflate2 = viewStub2.inflate();
            ViewGroup.LayoutParams layoutParams = inflate2.getLayoutParams();
            int dimensionPixelSize = inflate2.getContext().getResources().getDimensionPixelSize(R.dimen.biz_sign_up_divider_bottom_margin);
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            ImageView A0K = C18220wO.A0K(inflate2, R.id.icon_image);
            IconConfig iconConfig2 = iconConfig;
            if (z) {
                i2 = ((IconConfig.SimpleIconConfig) iconConfig2).A00;
            } else {
                i2 = ((IconConfig.IconWithTextConfig) iconConfig2).A00;
            }
            A0K.setImageResource(i2);
            C18180wK.A0G(inflate2, R.id.icon_text).setText(((IconConfig.IconWithTextConfig) iconConfig).A01);
        }
        String str = infoItem.A02;
        String str2 = infoItem.A03;
        Integer num = infoItem.A01;
        TextView textView = r9.A01;
        textView.setText(Html.fromHtml(str, 0));
        if (num != null) {
            C18180wK.A0s(textView.getContext(), textView, num.intValue());
        }
        if (str2 == null || AnonymousClass8bQ.A0n(str2)) {
            r9.A02.setVisibility(8);
            return;
        }
        TextView textView2 = r9.A02;
        textView2.setVisibility(0);
        textView2.setText(str2);
    }

    public AnonymousClass119(List list) {
        this.A00 = list;
    }

    public final int getItemCount() {
        int A03 = C14030oh.A03(1812035177);
        int size = this.A00.size();
        C14030oh.A0A(-985818905, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        int A03 = C14030oh.A03(1699096627);
        int i2 = 1;
        if (i != this.A00.size() - 1) {
            i2 = 0;
        }
        C14030oh.A0A(-381667709, A03);
        return i2;
    }
}
