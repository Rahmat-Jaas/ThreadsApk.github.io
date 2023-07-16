package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.service.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Gl  reason: invalid class name and case insensitive filesystem */
public final class C121497Gl {
    public int A00;
    public long A01;
    public ImageView A02;
    public LinearLayout A03;
    public LinearLayout A04;
    public TextView A05;
    public String A06 = "";
    public List A07 = AnonymousClass0wJ.A0v();
    public boolean A08;
    public final View A09;
    public final C34640IcN A0A;
    public final UserSession A0B;
    public final CBN A0C;
    public final List A0D = AnonymousClass0wJ.A0v();
    public final List A0E = AnonymousClass0wJ.A0v();

    public static void A01(C121497Gl r13) {
        if (r13.A00 > 0) {
            if (r13.A03 == null) {
                View view = r13.A09;
                LinearLayout linearLayout = (LinearLayout) C18200wM.A0G(view, R.id.iglive_presence_overlay_stub);
                r13.A03 = linearLayout;
                r13.A02 = (ImageView) linearLayout.findViewById(R.id.iglive_presence_facepile_image_view);
                A00(r13.A03, view, r13, R.id.iglive_presence_text);
            }
            TextView textView = r13.A05;
            textView.getClass();
            C34640IcN icN = r13.A0A;
            Resources A0B2 = AnonymousClass0wJ.A0B(icN);
            int i = r13.A00;
            int i2 = 0;
            textView.setText(C18230wP.A0j(A0B2, Integer.valueOf(i), R.plurals.iglive_presence_text, i));
            List list = r13.A07;
            ArrayList A0v = AnonymousClass0wJ.A0v();
            UserSession userSession = r13.A0B;
            C25550Dnj A002 = AnonymousClass6VR.A00(userSession);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0k = C18180wK.A0k(it);
                User A032 = A002.A03(A0k);
                if (A032 == null) {
                    AnonymousClass3Y8.A02.A00(userSession, (C83884s9) null, A0k);
                } else {
                    A0v.add(A032);
                }
            }
            Drawable A012 = C25131DgP.A01(icN.requireContext(), (Float) null, AnonymousClass006.A00, (Integer) null, (Integer) null, icN.getModuleName(), A0v, AnonymousClass0wJ.A0B(icN).getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material), true, false, true);
            ImageView imageView = r13.A02;
            imageView.getClass();
            imageView.setImageDrawable(A012);
            Object obj = r13.A0C.A03.A00;
            C159779at r1 = C159779at.A00;
            LinearLayout linearLayout2 = r13.A03;
            linearLayout2.getClass();
            if (obj != r1) {
                i2 = 8;
            }
            linearLayout2.setVisibility(i2);
        }
    }

    public static void A02(C121497Gl r10) {
        if (r10.A00 > 0) {
            if (r10.A03 == null) {
                View view = r10.A09;
                LinearLayout linearLayout = (LinearLayout) C18200wM.A0G(view, R.id.presence_overlay_stub);
                r10.A03 = linearLayout;
                r10.A04 = (LinearLayout) linearLayout.findViewById(R.id.quick_capture_presence_facepile_container);
                A00(r10.A03, view, r10, R.id.quick_capture_presence_text);
            }
            TextView textView = r10.A05;
            textView.getClass();
            textView.setText(r10.A06);
            List list = r10.A07;
            ArrayList A0v = AnonymousClass0wJ.A0v();
            UserSession userSession = r10.A0B;
            C25550Dnj A002 = AnonymousClass6VR.A00(userSession);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A0k = C18180wK.A0k(it);
                User A032 = A002.A03(A0k);
                if (A032 == null) {
                    AnonymousClass3Y8.A02.A00(userSession, (C83884s9) null, A0k);
                } else {
                    A0v.add(A032.B4M());
                }
            }
            List<View> list2 = r10.A0E;
            for (View visibility : list2) {
                visibility.setVisibility(8);
            }
            C34640IcN icN = r10.A0A;
            Object systemService = icN.requireContext().getSystemService("layout_inflater");
            for (int i = 0; i < A0v.size(); i++) {
                if (list2.size() <= i) {
                    systemService.getClass();
                    View inflate = ((LayoutInflater) systemService).inflate(R.layout.quick_capture_social_presence_avatar, r10.A03, false);
                    LinearLayout linearLayout2 = r10.A04;
                    linearLayout2.getClass();
                    linearLayout2.addView(inflate);
                    list2.add(inflate);
                    r10.A0D.add(inflate.findViewById(R.id.quick_capture_presence_image));
                    C18190wL.A18(inflate, R.id.quick_capture_presence_dot, 0);
                }
                ((View) list2.get(i)).setVisibility(0);
                ((IgImageView) r10.A0D.get(i)).setUrl((ImageUrl) A0v.get(i), icN);
            }
            Object obj = r10.A0C.A03.A00;
            C159779at r1 = C159779at.A00;
            LinearLayout linearLayout3 = r10.A03;
            linearLayout3.getClass();
            if (obj == r1) {
                linearLayout3.setVisibility(0);
            } else {
                linearLayout3.setVisibility(8);
            }
        }
    }

    public C121497Gl(View view, C34640IcN icN, CBN cbn, UserSession userSession) {
        this.A0B = userSession;
        this.A0A = icN;
        this.A09 = view;
        this.A0C = cbn;
    }

    public static void A00(View view, View view2, C121497Gl r3, int i) {
        r3.A05 = (TextView) view.findViewById(i);
        int A082 = ((int) (((float) C09860go.A08(view2.getContext())) * (1.0f - 0.65f))) >> 1;
        ((ViewGroup.MarginLayoutParams) r3.A03.getLayoutParams()).setMargins(A082, 0, A082, 0);
    }
}
