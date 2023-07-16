package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.react.uimanager.BaseViewManager;
import com.instagram.barcelona.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.514  reason: invalid class name */
public final class AnonymousClass514 extends BaseAdapter {
    public List A00;
    public List A01;
    public boolean A02;
    public final Context A03;
    public final List A04;

    public AnonymousClass514(Context context, List list) {
        this.A04 = list;
        this.A03 = context;
        this.A01 = AnonymousClass00J.A0a(list, AnonymousClass8bI.A0C(3, C86144wL.A0C(list, 1)));
        ArrayList A0v = AnonymousClass0wJ.A0v();
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C06750aI.A1A();
                throw null;
            }
            if (i < 3 || i == C86144wL.A0C(this.A04, 1)) {
                A0v.add(next);
            }
            i = i2;
        }
        this.A00 = C18200wM.A0s(A0v);
    }

    public final void A00() {
        this.A02 = false;
        List list = this.A00;
        if (list != null) {
            Collection collection = this.A01;
            if (collection == null) {
                collection = AnonymousClass0ZV.A00;
            }
            list.removeAll(collection);
            ((C109926kq) list.get(C86104wH.A0B(list))).A00 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        }
        C14020og.A00(this, -1354925694);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        Context context;
        C109926kq r4;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View A0H = AnonymousClass0wJ.A0H(LayoutInflater.from(context), viewGroup, R.layout.avatar_immersive_home_entrypoint_item);
        if (A0H == null) {
            return null;
        }
        List list = this.A00;
        if (list == null || (r4 = (C109926kq) list.get(i)) == null) {
            throw C18190wL.A0a("Required value was null.");
        }
        ImageView imageView = (ImageView) A0H.findViewById(R.id.entrypoint_icon);
        if (imageView != null) {
            imageView.setRotation(r4.A00);
            imageView.setImageResource(r4.A01);
            imageView.setColorFilter(imageView.getContext().getColor(R.color.canvas_bottom_sheet_description_text_color));
        }
        TextView A0G = C18180wK.A0G(A0H, R.id.entrypoint_label);
        if (A0G != null) {
            A0G.setVisibility(C18190wL.A00(this.A02 ? 1 : 0));
            A0G.setText(r4.A02);
            C18180wK.A0s(A0G.getContext(), A0G, R.color.canvas_bottom_sheet_description_text_color);
        }
        A0H.setOnClickListener(r4.A03);
        return A0H;
    }

    public final int getCount() {
        List list = this.A00;
        if (list != null) {
            int size = list.size();
            if (Integer.valueOf(size) != null) {
                return size;
            }
        }
        throw C18190wL.A0a("Required value was null.");
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        Object obj;
        List list = this.A00;
        if (list != null && (obj = list.get(i)) != null) {
            return obj;
        }
        throw C18190wL.A0a("Required value was null.");
    }
}
