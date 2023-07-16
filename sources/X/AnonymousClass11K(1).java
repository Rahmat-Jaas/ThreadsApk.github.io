package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape6S0101000_1_I2;
import com.facebook.redex.IDxCListenerShape6S0201000_1_I2;
import com.instagram.barcelona.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import java.util.List;

/* renamed from: X.11K  reason: invalid class name */
public final class AnonymousClass11K extends C41030Luu {
    public GFK A00;
    public final List A01 = AnonymousClass0wJ.A0v();

    public final void onBindViewHolder(M5O m5o, int i) {
        ImageView imageView;
        String str;
        CharSequence charSequence;
        C04220Ms.A0B(m5o, 0);
        View view = m5o.itemView;
        Context context = view.getContext();
        int itemViewType = getItemViewType(i);
        int i2 = 0;
        if (itemViewType == 0) {
            TextView textView = (TextView) view;
            Object obj = this.A01.get(i);
            C04220Ms.A0C(obj, "null cannot be cast to non-null type com.instagram.ui.menu.ButtonItem");
            C63063bP r1 = (C63063bP) obj;
            int i3 = r1.A02;
            if (i3 != 0) {
                textView.setText(i3);
            } else {
                textView.setText(r1.A03);
            }
            C18180wK.A0s(context, textView, r1.A05);
            if (i == getItemCount() - 1) {
                i2 = context.getResources().getDimensionPixelSize(R.dimen.account_permission_section_vertical_padding);
            }
            C09860go.A0M(textView, i2);
            if (this.A00 != null) {
                C18210wN.A0y(textView);
                textView.setOnClickListener(new IDxCListenerShape6S0101000_1_I2(this, i, 0));
            }
        } else if (itemViewType != 1) {
            if (itemViewType == 2) {
                Object obj2 = this.A01.get(i);
                C04220Ms.A0C(obj2, "null cannot be cast to non-null type com.instagram.ui.menu.ButtonItem");
                C63063bP r8 = (C63063bP) obj2;
                C199312l r11 = (C199312l) m5o;
                View view2 = r11.itemView;
                C04220Ms.A05(view2);
                int i4 = r8.A02;
                TextView textView2 = r11.A01;
                if (i4 != 0) {
                    str = context.getString(i4);
                } else {
                    str = r8.A03;
                }
                textView2.setText(str);
                int color = context.getColor(r8.A05);
                textView2.setTextColor(color);
                imageView = r11.A00;
                imageView.setColorFilter(color);
                if (this.A00 != null) {
                    C18210wN.A0y(textView2);
                    view2.setOnClickListener(new IDxCListenerShape6S0101000_1_I2(this, i, 1));
                }
                int i5 = r8.A00;
                if (i5 != -1) {
                    imageView.setImageResource(i5);
                    imageView.setVisibility(0);
                    return;
                }
            } else if (itemViewType == 3) {
                Object obj3 = this.A01.get(i);
                C04220Ms.A0C(obj3, "null cannot be cast to non-null type com.instagram.ui.menu.ArrowItem");
                C62593aM r3 = (C62593aM) obj3;
                C199212k r112 = (C199212k) m5o;
                View view3 = r112.itemView;
                C04220Ms.A05(view3);
                int i6 = r3.A04;
                TextView textView3 = r112.A01;
                if (i6 != 0) {
                    charSequence = context.getString(i6);
                } else {
                    charSequence = r3.A08;
                }
                textView3.setText(charSequence);
                if (this.A00 != null) {
                    C18210wN.A0y(textView3);
                    view3.setOnClickListener(new IDxCListenerShape6S0101000_1_I2(this, i, 2));
                }
                imageView = r112.A00;
            } else if (itemViewType == 4) {
                Object obj4 = this.A01.get(i);
                C04220Ms.A0C(obj4, "null cannot be cast to non-null type com.instagram.ui.menu.IgdsListCellItem");
                C57693Cc r4 = (C57693Cc) obj4;
                IgdsListCell igdsListCell = ((AnonymousClass12E) m5o).A00;
                igdsListCell.A0H(r4.A04);
                String str2 = r4.A03;
                if (str2 instanceof CharSequence) {
                    igdsListCell.A0G(str2);
                }
                Integer num = r4.A02;
                if (num != null) {
                    igdsListCell.A05(num.intValue());
                }
                if (r4.A00 != null) {
                    C18210wN.A0y(igdsListCell);
                    igdsListCell.A0B(new IDxCListenerShape6S0201000_1_I2(i, 0, this, r4));
                    return;
                }
                return;
            } else {
                return;
            }
            imageView.setVisibility(8);
        } else {
            View view4 = m5o.itemView;
            C04220Ms.A05(view4);
            view4.setLayoutParams(new ViewGroup.LayoutParams(-1, 1));
        }
    }

    public final M5O onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater;
        int i2;
        C04220Ms.A0B(viewGroup, 0);
        if (i != 0) {
            if (i == 1) {
                layoutInflater = C18180wK.A0C(viewGroup);
                i2 = R.layout.bottom_sheet_divider;
                return new C197311n(C18180wK.A0D(layoutInflater, viewGroup, i2, false));
            } else if (i == 2) {
                return new C199312l(C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.action_sheet_row_with_icon, false));
            } else {
                if (i == 3) {
                    return new C199212k(C18180wK.A0D(C18180wK.A0C(viewGroup), viewGroup, R.layout.row_arrow_item, false));
                }
                if (i == 4) {
                    return new AnonymousClass12E(C18240wQ.A0T(C18190wL.A0A(viewGroup)));
                }
            }
        }
        layoutInflater = C18180wK.A0C(viewGroup);
        i2 = R.layout.action_sheet_row;
        return new C197311n(C18180wK.A0D(layoutInflater, viewGroup, i2, false));
    }

    public static int A00(View view, IDxCListenerShape6S0101000_1_I2 iDxCListenerShape6S0101000_1_I2, int i) {
        int A05 = C14030oh.A05(i);
        GFK gfk = ((AnonymousClass11K) iDxCListenerShape6S0101000_1_I2.A01).A00;
        if (gfk != null) {
            int i2 = iDxCListenerShape6S0101000_1_I2.A00;
            C04220Ms.A07(view);
            gfk.A00(view, i2);
        }
        return A05;
    }

    public final int getItemCount() {
        int A03 = C14030oh.A03(-236603859);
        int size = this.A01.size();
        C14030oh.A0A(-2022765063, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        int i2;
        int A03 = C14030oh.A03(-578241912);
        Object obj = this.A01.get(i);
        if (obj instanceof C63273h9) {
            i2 = 1;
        } else if (obj instanceof C62593aM) {
            i2 = 3;
        } else if (obj instanceof C57693Cc) {
            i2 = 4;
        } else {
            C04220Ms.A0C(obj, "null cannot be cast to non-null type com.instagram.ui.menu.ButtonItem");
            i2 = 0;
            if (((C63063bP) obj).A00 != -1) {
                i2 = 2;
            }
        }
        C14030oh.A0A(1718189415, A03);
        return i2;
    }
}
