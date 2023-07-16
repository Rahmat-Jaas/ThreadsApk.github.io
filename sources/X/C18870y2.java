package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.barcelona.R;
import java.util.List;

/* renamed from: X.0y2  reason: invalid class name and case insensitive filesystem */
public final class C18870y2 extends BaseAdapter {
    public int A00;
    public final List A01 = AnonymousClass0wJ.A0v();
    public final boolean A02;

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getCount() {
        return this.A01.size();
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        Context context;
        int i2;
        if (viewGroup == null || (context = viewGroup.getContext()) == null) {
            throw AnonymousClass0wJ.A0b();
        }
        boolean z = false;
        View inflate = LayoutInflater.from(context).inflate(R.layout.layout_clips_drafts_filter_picker_dropdown, viewGroup, false);
        boolean z2 = this.A02;
        if (z2) {
            inflate.setBackgroundResource(R.color.grey_7);
        }
        if (i == 0) {
            int i3 = R.drawable.clips_drafts_filter_picker_dropdown_first_cell_background;
            if (z2) {
                i3 = R.drawable.clips_drafts_filter_picker_dropdown_first_cell_dark_background;
            }
            inflate.setBackgroundResource(i3);
            inflate.findViewById(R.id.divider).setVisibility(8);
        } else if (i == this.A01.size() - 1) {
            int i4 = R.drawable.clips_drafts_filter_picker_dropdown_last_cell_background;
            if (z2) {
                i4 = R.drawable.clips_drafts_filter_picker_dropdown_last_cell_dark_background;
            }
            inflate.setBackgroundResource(i4);
        }
        if (this.A00 == i) {
            z = true;
        }
        TextView A0A = C18250wR.A0A(inflate.findViewById(R.id.draft_filter_picker_item_text));
        List list = this.A01;
        C18200wM.A15(context, A0A, A00((D0I) list.get(i)));
        View findViewById = inflate.findViewById(R.id.draft_filter_picker_item_icon);
        C04220Ms.A0C(findViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) findViewById;
        if (z) {
            imageView.setImageResource(R.drawable.instagram_check_pano_outline_24);
            imageView.setImageTintList(ColorStateList.valueOf(context.getColor(R.color.igds_primary_button)));
            C18180wK.A0s(context, A0A, R.color.igds_primary_button);
            return inflate;
        }
        if (z2) {
            imageView.setImageTintList(ColorStateList.valueOf(context.getColor(R.color.design_dark_default_color_on_background)));
            C18180wK.A0s(context, A0A, R.color.design_dark_default_color_on_background);
        }
        int ordinal = ((D0I) list.get(i)).ordinal();
        if (ordinal == 0) {
            i2 = R.drawable.instagram_media_pano_outline_24;
        } else if (ordinal == 1) {
            i2 = R.drawable.instagram_reels_pano_outline_24;
        } else if (ordinal == 2) {
            i2 = R.drawable.instagram_photo_pano_outline_24;
        } else if (ordinal == 3) {
            i2 = R.drawable.instagram_carousel_pano_outline_24;
        } else {
            throw AnonymousClass4VZ.A00();
        }
        imageView.setImageResource(i2);
        return inflate;
    }

    public final Object getItem(int i) {
        return this.A01.get(i);
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r4, android.view.View r5, android.view.ViewGroup r6) {
        /*
            r3 = this;
            if (r5 != 0) goto L_0x0032
            if (r6 == 0) goto L_0x0033
            android.content.Context r2 = r6.getContext()
            if (r2 == 0) goto L_0x0033
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r2)
            r0 = 2131494697(0x7f0c0729, float:1.861291E38)
            android.view.View r0 = X.AnonymousClass0wJ.A0H(r1, r6, r0)
            android.widget.TextView r5 = X.C18250wR.A0A(r0)
            java.util.List r0 = r3.A01
            java.lang.Object r0 = r0.get(r4)
            X.D0I r0 = (X.D0I) r0
            int r0 = A00(r0)
            X.C18200wM.A15(r2, r5, r0)
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0032
            r0 = 2131099851(0x7f0600cb, float:1.7812067E38)
            X.C18180wK.A0s(r2, r5, r0)
        L_0x0032:
            return r5
        L_0x0033:
            java.lang.IllegalStateException r0 = X.AnonymousClass0wJ.A0b()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18870y2.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public C18870y2(boolean z) {
        this.A02 = z;
    }

    public static final int A00(D0I d0i) {
        int ordinal = d0i.ordinal();
        if (ordinal == 0) {
            return 2131826263;
        }
        if (ordinal == 1) {
            return 2131826265;
        }
        if (ordinal == 2) {
            return 2131826266;
        }
        if (ordinal == 3) {
            return 2131826264;
        }
        throw AnonymousClass4VZ.A00();
    }
}
