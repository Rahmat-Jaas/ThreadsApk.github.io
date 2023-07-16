package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.IDxVHolderShape16S0000000_1_I2;
import com.instagram.barcelona.R;

/* renamed from: X.1xm  reason: invalid class name and case insensitive filesystem */
public final class C29331xm extends AnonymousClass1fC {
    public final Context A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29331xm(Context context, C10300i6 r3, C11630kW r4) {
        super(context, r3, r4);
        C04220Ms.A0B(r3, 2);
        this.A00 = context;
    }

    public final void onBindViewHolder(M5O m5o, int i) {
        C04220Ms.A0B(m5o, 0);
        int itemViewType = getItemViewType(i);
        if (itemViewType != -2 && itemViewType != -1) {
            super.onBindViewHolder(m5o, i);
        }
    }

    public final M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view;
        int i2;
        C04220Ms.A0B(viewGroup, 0);
        if (i == -2) {
            view = LayoutInflater.from(this.A00).inflate(R.layout.bloks_error_layout, viewGroup, false);
            i2 = 3;
        } else if (i != -1) {
            M5O onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
            C04220Ms.A06(onCreateViewHolder);
            return onCreateViewHolder;
        } else {
            view = LayoutInflater.from(this.A00).inflate(R.layout.embeds_opt_out_loading_fragment, viewGroup, false);
            i2 = 2;
        }
        return new IDxVHolderShape16S0000000_1_I2(view, i2);
    }

    public final int getItemViewType(int i) {
        int itemViewType;
        int i2;
        int A03 = C14030oh.A03(1674897122);
        Object item = getItem(i);
        if (item instanceof C49132qt) {
            itemViewType = -1;
            i2 = -1644844079;
        } else if (item instanceof C49122qs) {
            itemViewType = -2;
            i2 = 1593458603;
        } else {
            itemViewType = super.getItemViewType(i);
            i2 = 1980864719;
        }
        C14030oh.A0A(i2, A03);
        return itemViewType;
    }

    public final int getViewTypeCount() {
        return super.getViewTypeCount() + 2;
    }
}
