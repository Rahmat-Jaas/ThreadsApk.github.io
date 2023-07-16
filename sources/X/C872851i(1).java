package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.Product;
import java.util.List;

/* renamed from: X.51i  reason: invalid class name and case insensitive filesystem */
public final class C872851i extends ImageView {
    public Drawable A00;
    public Drawable A01;
    public Product A02;
    public List A03;

    public C872851i(Context context) {
        super(context);
        Drawable drawable;
        Context context2 = getContext();
        List list = C19073AqC.A00().A03;
        list = list == null ? null : list;
        list.getClass();
        this.A03 = list;
        this.A02 = (Product) list.get(0);
        float A08 = ((float) C09860go.A08(context2)) * 0.8f;
        ImageInfo A022 = this.A02.A02();
        A022.getClass();
        ExtendedImageUrl A04 = C122057Ju.A04(A022, AnonymousClass006.A0C, Math.round(A08));
        A04.getClass();
        this.A01 = new AnonymousClass4yL(context2, A04, this.A02, A08);
        if (this.A03.size() == 1) {
            drawable = this.A01;
        } else {
            AnonymousClass4xD r1 = new AnonymousClass4xD(context2, (float) this.A01.getIntrinsicWidth(), (float) this.A01.getIntrinsicHeight());
            this.A00 = r1;
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{r1, this.A01});
            int i = (int) A08;
            layerDrawable.setLayerInset(1, (-i) / 20, i / 20, 0, 0);
            drawable = layerDrawable;
        }
        super.setImageDrawable(drawable);
    }
}
