package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.analytics.structuredlogger.base.USLEBaseShape0S0000000;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S0300000_I2;
import com.instagram.api.schemas.TrackData;
import com.instagram.barcelona.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.HashSet;

/* renamed from: X.60Q  reason: invalid class name */
public final class AnonymousClass60Q extends AnonymousClass1lO {
    public final C107746hF A00;
    public final HashSet A01 = C18200wM.A0u();

    public final Class modelClass() {
        return C131887sy.class;
    }

    public final /* bridge */ /* synthetic */ void bind(C41882MfV mfV, M5O m5o) {
        ImageUrl imageUrl;
        String str;
        String str2;
        String str3;
        C131887sy r8 = (C131887sy) mfV;
        C89025Bp r9 = (C89025Bp) m5o;
        AnonymousClass0wJ.A1N(r8, r9);
        KtCSuperShape0S0300000_I2 ktCSuperShape0S0300000_I2 = r8.A00;
        C1535598i r4 = (C1535598i) ktCSuperShape0S0300000_I2.A01;
        TrackData trackData = (TrackData) ktCSuperShape0S0300000_I2.A02;
        IgSimpleImageView igSimpleImageView = r9.A03;
        String str4 = null;
        if (r4 != null) {
            imageUrl = r4.A03.B4M();
        } else if (trackData != null) {
            imageUrl = trackData.A01;
        } else {
            throw AnonymousClass0wJ.A0b();
        }
        C121427Fy.A01(igSimpleImageView, imageUrl);
        TextView textView = r9.A02;
        if (r4 != null) {
            str = r4.A0F;
        } else if (trackData != null) {
            str = trackData.A0H;
        } else {
            str = null;
        }
        textView.setText(str);
        TextView textView2 = r9.A01;
        if (r4 == null || (str2 = r4.A03.BK7()) == null) {
            if (trackData != null) {
                str4 = trackData.A09;
            }
            str2 = str4;
        }
        textView2.setText(str2);
        C86104wH.A1D(r9.itemView, 50, r8, this);
        C86104wH.A1D(r9.A00, 51, r8, this);
        String A002 = r8.getKey();
        HashSet hashSet = this.A01;
        if (!hashSet.contains(A002)) {
            C107746hF r2 = this.A00;
            C41030Luu luu = r2.A00.A0F;
            C04220Ms.A0C(luu, I17.A00(7));
            int A02 = ((C150388wA) luu).A02(r8.getKey());
            C107756hG r0 = ((C882657j) r2.A01.A01.getValue()).A01;
            USLEBaseShape0S0000000 A0I = C18180wK.A0I(AnonymousClass0wJ.A0M(C13330nS.A01(r0.A00, r0.A01), AnonymousClass000.A00(165)), 988);
            C1535598i r02 = (C1535598i) ktCSuperShape0S0300000_I2.A01;
            if (r02 != null) {
                str3 = r02.A0B;
            } else {
                TrackData trackData2 = (TrackData) ktCSuperShape0S0300000_I2.A02;
                if (trackData2 == null || (str3 = trackData2.A05) == null) {
                    throw AnonymousClass0wJ.A0b();
                }
            }
            A0I.A0S("audio_asset_id", AnonymousClass0wJ.A0d(str3));
            A0I.A0O(D3D.CLIPS, "camera_destination");
            A0I.A0S("audio_index", C18230wP.A0f(A02));
            A0I.Bb4();
            hashSet.add(A002);
        }
    }

    public AnonymousClass60Q(C107746hF r2) {
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ M5O createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        boolean A1Y = AnonymousClass0wJ.A1Y(viewGroup, layoutInflater);
        C89025Bp r3 = new C89025Bp(C18200wM.A0F(layoutInflater, viewGroup, R.layout.new_release_notification_item, A1Y));
        Context context = viewGroup.getContext();
        IgSimpleImageView igSimpleImageView = r3.A03;
        C04220Ms.A06(context);
        Resources resources = viewGroup.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.audio_search_row_image_bitmap_size);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        int i = -1;
        if (C121907Is.A05(context, R.attr.musicCreationShadowEnabled, A1Y)) {
            i = 1;
        }
        boolean z = A1Y;
        igSimpleImageView.setImageDrawable(new C86674y5(context, dimensionPixelSize, dimensionPixelSize2, A1Y ? 1 : 0, A1Y ? 1 : 0, dimensionPixelSize3, i, z));
        return r3;
    }
}
