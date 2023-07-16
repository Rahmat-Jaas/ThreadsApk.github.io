package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.IDxVHolderShape16S0000000_1_I2;
import com.instagram.barcelona.R;

/* renamed from: X.1xl  reason: invalid class name and case insensitive filesystem */
public final class C29321xl extends AnonymousClass1fC {
    public final Context A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29321xl(Context context, C10300i6 r3, C11630kW r4) {
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
        C04220Ms.A0B(viewGroup, 0);
        if (i == -2) {
            return new IDxVHolderShape16S0000000_1_I2(LayoutInflater.from(this.A00).inflate(R.layout.bloks_error_layout, viewGroup, false), 1);
        }
        if (i == -1) {
            return new IDxVHolderShape16S0000000_1_I2(LayoutInflater.from(this.A00).inflate(R.layout.birthday_visibility_settings_loading_fragment, viewGroup, false), 0);
        }
        M5O onCreateViewHolder = super.onCreateViewHolder(viewGroup, i);
        C04220Ms.A06(onCreateViewHolder);
        return onCreateViewHolder;
    }

    public final int getItemViewType(int i) {
        int itemViewType;
        int A03 = C14030oh.A03(880729561);
        Object item = getItem(i);
        if (item instanceof C49092qp) {
            itemViewType = -1;
        } else if (item instanceof C49082qo) {
            itemViewType = -2;
        } else {
            itemViewType = super.getItemViewType(i);
        }
        C14030oh.A0A(-1010721149, A03);
        return itemViewType;
    }

    public final int getViewTypeCount() {
        return super.getViewTypeCount() + 2;
    }
}
