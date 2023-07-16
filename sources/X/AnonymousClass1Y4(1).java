package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.barcelona.R;
import com.instagram.direct.wellbeing.common.upsell.DirectWellBeingUpsellBottomSheetData;
import com.instagram.igds.components.headline.IgdsHeadline;
import com.instagram.ui.text.IDxCSpanShape63S0200000_1_I2;
import kotlin.jvm.internal.KtLambdaShape66S0100000_I2_46;

/* renamed from: X.1Y4  reason: invalid class name */
public final class AnonymousClass1Y4 extends C34640IcN {
    public static final String __redex_internal_original_name = "DirectWellBeingUpsellBottomSheetFragment";
    public IgdsHeadline A00;
    public final C04530Oa A01 = AnonymousClass0OY.A02(new KtLambdaShape66S0100000_I2_46(this, 29));

    public final String getModuleName() {
        return "DIRECT_WELL_BEING_UPSELL_BOTTOM_SHEET";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        DirectWellBeingUpsellBottomSheetData directWellBeingUpsellBottomSheetData;
        C04220Ms.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = (IgdsHeadline) AnonymousClass0wJ.A0I(view, R.id.upsell_bottom_sheet_headerline);
        Bundle bundle2 = this.mArguments;
        if (bundle2 == null || (directWellBeingUpsellBottomSheetData = (DirectWellBeingUpsellBottomSheetData) bundle2.getParcelable("DIRECT_WELL_BEING_UPSELL_BOTTOM_SHEET_DATA_KEY")) == null) {
            throw AnonymousClass0wJ.A0b();
        }
        IgdsHeadline igdsHeadline = this.A00;
        if (igdsHeadline != null) {
            igdsHeadline.setHeadline((CharSequence) directWellBeingUpsellBottomSheetData.A07);
            String str = directWellBeingUpsellBottomSheetData.A05;
            if (str == null || directWellBeingUpsellBottomSheetData.A06 == null || directWellBeingUpsellBottomSheetData.A01 == null) {
                IgdsHeadline igdsHeadline2 = this.A00;
                if (igdsHeadline2 != null) {
                    igdsHeadline2.setBody(directWellBeingUpsellBottomSheetData.A04, (View.OnClickListener) null);
                }
            } else {
                SpannableStringBuilder A0E = C18200wM.A0E(directWellBeingUpsellBottomSheetData.A04);
                AnonymousClass3Zw.A00(A0E, new IDxCSpanShape63S0200000_1_I2(C18180wK.A00(this), 3, (Object) directWellBeingUpsellBottomSheetData, (Object) this), str);
                IgdsHeadline igdsHeadline3 = this.A00;
                if (igdsHeadline3 != null) {
                    igdsHeadline3.setBody(A0E, (View.OnClickListener) null);
                }
            }
            IgdsHeadline igdsHeadline4 = this.A00;
            if (igdsHeadline4 != null) {
                igdsHeadline4.A08(directWellBeingUpsellBottomSheetData.A00, false);
                return;
            }
        }
        C04220Ms.A0E("headline");
        throw null;
    }

    public final /* bridge */ /* synthetic */ C10300i6 getSession() {
        return AnonymousClass0wJ.A0U(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C14030oh.A02(1980459723);
        C04220Ms.A0B(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.fragment_upsell_bottom_sheet_content, viewGroup, false);
        C14030oh.A09(625320540, A02);
        return inflate;
    }
}
