package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.ui.base.IgButton;
import java.util.Map;

/* renamed from: X.1l4  reason: invalid class name */
public final class AnonymousClass1l4 extends AnonymousClass1lO {
    public final Map A00;

    public final Class modelClass() {
        return AnonymousClass196.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        AnonymousClass196 r10 = (AnonymousClass196) mfV;
        C198612d r11 = (C198612d) m5o;
        boolean A1Z = AnonymousClass0wJ.A1Z(r10, r11);
        TextView textView = r11.A00;
        textView.setText(2131821763);
        IgButton igButton = r11.A01;
        igButton.setVisibility(0);
        igButton.setText(2131821764);
        Map map = this.A00;
        if (map != null) {
            Object obj = map.get(r10.A02);
            if (obj == null) {
                obj = C75744ck.A00;
            }
            AnonymousClass0wJ.A16(igButton, 297, obj);
        }
        if (C18190wL.A1Z(r10.A03, A1Z)) {
            Context context = r10.A00;
            C18180wK.A0s(context, textView, R.color.canvas_bottom_sheet_description_text_color);
            igButton.setTextAppearance(R.style.igds_emphasized_body_2);
            C18180wK.A0s(context, igButton, R.color.canvas_bottom_sheet_description_text_color);
        }
        AnonymousClass33O r0 = r10.A01;
        if (r0 != null) {
            CRI cri = r0.A00;
            if (cri.A08()) {
                C04530Oa r6 = cri.A0G;
                C10300i6 A0U = AnonymousClass0wJ.A0U(r6);
                if (C63803iN.A0E(C18250wR.A0D(A0U, 0), A0U, 36326919288923954L) && !AnonymousClass2SN.A00(AnonymousClass0wJ.A0X(r6)).A00.getBoolean("key_has_seen_avatar_edit_button_tooltip", false)) {
                    igButton.postDelayed(new C72924Qg(igButton, cri), 500);
                    AnonymousClass0wJ.A13(AnonymousClass2SN.A00(AnonymousClass0wJ.A0X(r6)).A00.edit(), "key_has_seen_avatar_edit_button_tooltip", A1Z);
                }
            }
        }
    }

    public AnonymousClass1l4(Map map) {
        this.A00 = map;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C198612d(C18200wM.A0F(layoutInflater, viewGroup, R.layout.direct_text_header_tray_item, AnonymousClass0wJ.A1Y(viewGroup, layoutInflater)));
    }

    public AnonymousClass1l4() {
        this((Map) null);
    }
}
